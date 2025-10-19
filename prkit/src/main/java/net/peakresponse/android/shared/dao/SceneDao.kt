package net.peakresponse.android.shared.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import net.peakresponse.android.shared.models.Scene

@Dao
abstract class SceneDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract suspend fun insertMany(records: List<Scene>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract suspend fun insert(record: Scene)

    @Query("SELECT * FROM Scene WHERE id = :id")
    abstract fun getScene(id: String): Flow<Scene>
}
