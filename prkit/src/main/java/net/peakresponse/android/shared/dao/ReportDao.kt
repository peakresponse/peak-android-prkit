package net.peakresponse.android.shared.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import kotlinx.coroutines.flow.Flow
import net.peakresponse.android.shared.models.Report
import net.peakresponse.android.shared.models.ReportWithPatient

@Dao
abstract class ReportDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract suspend fun insertMany(records: List<Report>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract suspend fun insert(record: Report)

    @Query("SELECT * FROM Report")
    abstract fun getReports(): Flow<List<Report>>

    @Transaction
    @Query("SELECT * FROM Report WHERE incidentId=:incidentId AND canonicalId IS NULL")
    abstract fun getReportsWithPatients(incidentId: String): Flow<List<ReportWithPatient>>
}
