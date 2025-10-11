package net.peakresponse.android.shared.dao.fixtures

import net.peakresponse.android.shared.dao.PRAppDatabase
import net.peakresponse.android.shared.models.State

object StateFixtures {
    suspend fun populateStates(db: PRAppDatabase) {
        val dao = db.getStateDao()

        dao.insert(
            State(
                id = "06",
                createdAt = null,
                updatedAt = null,
                name = "California",
                abbr = "CA"
            )
        )
    }
}