package net.peakresponse.android.shared.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import net.peakresponse.android.shared.models.Incident

@Dao
abstract class IncidentDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract suspend fun insertMany(records: List<Incident>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract suspend fun insert(record: Incident)

    @Query("SELECT * FROM Incident")
    abstract fun queryIncidents(): Flow<List<Incident>>
}
