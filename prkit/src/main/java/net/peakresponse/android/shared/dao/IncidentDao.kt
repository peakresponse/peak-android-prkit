package net.peakresponse.android.shared.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import kotlinx.coroutines.flow.Flow
import net.peakresponse.android.shared.models.Incident
import net.peakresponse.android.shared.models.IncidentWithScene

@Dao
abstract class IncidentDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract suspend fun insertMany(records: List<Incident>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract suspend fun insert(record: Incident)

    @Query("SELECT * FROM Incident")
    abstract fun getIncidents(): Flow<List<Incident>>

    @Transaction
    @Query("SELECT * FROM Incident")
    abstract fun getIncidentsWithScenes(): Flow<List<IncidentWithScene>>

    @Transaction
    @Query("SELECT * FROM Incident JOIN Scene ON Incident.sceneId=Scene.id WHERE Scene.isMCI=1 AND Scene.isActive=1")
    abstract fun getActiveMciIncidentsWithScenes(): Flow<List<IncidentWithScene>>

    @Query("SELECT * FROM Incident WHERE id = :id")
    abstract fun getIncident(id: String): Flow<Incident>
}
