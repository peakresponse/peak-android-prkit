package net.peakresponse.android.shared.dao

import net.peakresponse.android.shared.dao.PRAppDatabase
import net.peakresponse.android.shared.models.Incident

object Fixtures {
    suspend fun populate(db: PRAppDatabase) {
        val incidentDao = db.getIncidentDao()
        incidentDao.insert(
            Incident(
                id = "f257e029-1d96-4900-9100-babcd676cb84",
                createdAt = null,
                updatedAt = null,
                createdById = null,
                eventId = null,
                psapId = null,
                sceneId = null,
                number = "0001",
                sort = 1,
                calledAt = null,
                dispatchNotifiedAt = null,
                reportsCount = null
            )
        )
        incidentDao.insert(
            Incident(
                id = "1d0672c8-1c34-45c5-a3a5-5787ff39ed8f",
                createdAt = null,
                updatedAt = null,
                createdById = null,
                eventId = null,
                psapId = null,
                sceneId = null,
                number = "0002",
                sort = 2,
                calledAt = null,
                dispatchNotifiedAt = null,
                reportsCount = null
            )
        )
        incidentDao.insert(
            Incident(
                id = "63171e45-2188-411b-8fd6-203d7f2134cf",
                createdAt = null,
                updatedAt = null,
                createdById = null,
                eventId = null,
                psapId = null,
                sceneId = null,
                number = "0003",
                sort = 3,
                calledAt = null,
                dispatchNotifiedAt = null,
                reportsCount = null
            )
        )
    }
}
