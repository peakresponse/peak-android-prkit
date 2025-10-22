package net.peakresponse.android.shared.dao.fixtures

import net.peakresponse.android.shared.dao.PRAppDatabase
import net.peakresponse.android.shared.models.Incident
import net.peakresponse.android.shared.models.Scene

object Fixtures {
    suspend fun populate(db: PRAppDatabase) {
        CityFixtures.populateCities(db)
        StateFixtures.populateStates(db)
        IncidentFixtures.populateIncidents(db)
        SceneFixtures.populateScenes(db)
        PatientFixtures.populatePatients(db)
        ReportFixtures.populateReports(db)
    }
}
