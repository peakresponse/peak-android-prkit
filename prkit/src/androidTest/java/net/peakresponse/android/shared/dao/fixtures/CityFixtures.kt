package net.peakresponse.android.shared.dao.fixtures

import net.peakresponse.android.shared.dao.PRAppDatabase
import net.peakresponse.android.shared.models.City

object CityFixtures {
    suspend fun populateCities(db: PRAppDatabase) {
        val dao = db.getCityDao()

        dao.insert(
            City(
                id = "2411786",
                createdAt = null,
                updatedAt = null,
                featureName = "City of San Francisco",
                stateNumeric = "06",
                stateAlpha = "CA",
                primaryLatitude = 37.7782251,
                primaryLongitude = -122.4424955
            )
        )
    }
}
