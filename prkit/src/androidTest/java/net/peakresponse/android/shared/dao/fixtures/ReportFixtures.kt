package net.peakresponse.android.shared.dao.fixtures

import net.peakresponse.android.shared.dao.PRAppDatabase
import net.peakresponse.android.shared.models.Report

object ReportFixtures {
    suspend fun populateReports(db: PRAppDatabase) {
        val reportDao = db.getReportDao()
        reportDao.insert(
            Report(
                id = "c85458f5-b3c1-408c-894b-10dbdcae7276",
                canonicalId = null,
                currentId = "4098b973-f5b1-4f5f-b715-7f7384b7dab1",
                parentId = null,
                secondParentId = null,
                createdAt = null,
                updatedAt = null,
                data = null,
                incidentId = "63171e45-2188-411b-8fd6-203d7f2134cf",
                priority = 0,
                filterPriority = 0,
                pin = "0001",
                sceneId = "b7671058-7e9f-48fa-8ab9-72f512b914ee",
                responseId = null,
                timeId = null,
                patientId = "bf8c0724-cd05-4807-bd20-ad1b00525269",
                situationId = null,
                historyId = null,
                dispositionId = null,
                narrativeId = null,
                medicationIds = null,
                vitalIds = null,
                procedureIds = null,
                fileIds = null,
                signatureIds = null,
                predictions = null,
                ringdownId = null,
                deletedAt = null
            )
        )
        reportDao.insert(
            Report(
                id = "4098b973-f5b1-4f5f-b715-7f7384b7dab1",
                canonicalId = "c85458f5-b3c1-408c-894b-10dbdcae7276",
                currentId = null,
                parentId = null,
                secondParentId = null,
                createdAt = null,
                updatedAt = null,
                data = null,
                incidentId = "63171e45-2188-411b-8fd6-203d7f2134cf",
                priority = 0,
                filterPriority = 0,
                pin = "0001",
                sceneId = "b7671058-7e9f-48fa-8ab9-72f512b914ee",
                responseId = null,
                timeId = null,
                patientId = "bf8c0724-cd05-4807-bd20-ad1b00525269",
                situationId = null,
                historyId = null,
                dispositionId = null,
                narrativeId = null,
                medicationIds = null,
                vitalIds = null,
                procedureIds = null,
                fileIds = null,
                signatureIds = null,
                predictions = null,
                ringdownId = null,
                deletedAt = null
            )
        )
        reportDao.insert(
            Report(
                id = "9548ee82-134b-44e9-9b8c-989a23a8c3d2",
                canonicalId = null,
                currentId = "0dc73470-73f7-4446-937c-da9b35baf88e",
                parentId = null,
                secondParentId = null,
                createdAt = null,
                updatedAt = null,
                data = null,
                incidentId = "63171e45-2188-411b-8fd6-203d7f2134cf",
                priority = 0,
                filterPriority = 0,
                pin = "0002",
                sceneId = "b7671058-7e9f-48fa-8ab9-72f512b914ee",
                responseId = null,
                timeId = null,
                patientId = "3c0d3bb0-4051-4ded-92cc-71cec62ef0e4",
                situationId = null,
                historyId = null,
                dispositionId = null,
                narrativeId = null,
                medicationIds = null,
                vitalIds = null,
                procedureIds = null,
                fileIds = null,
                signatureIds = null,
                predictions = null,
                ringdownId = null,
                deletedAt = null
            )
        )
        reportDao.insert(
            Report(
                id = "0dc73470-73f7-4446-937c-da9b35baf88e",
                canonicalId = "9548ee82-134b-44e9-9b8c-989a23a8c3d2",
                currentId = null,
                parentId = null,
                secondParentId = null,
                createdAt = null,
                updatedAt = null,
                data = null,
                incidentId = "63171e45-2188-411b-8fd6-203d7f2134cf",
                priority = 0,
                filterPriority = 0,
                pin = "0002",
                sceneId = "b7671058-7e9f-48fa-8ab9-72f512b914ee",
                responseId = null,
                timeId = null,
                patientId = "3c0d3bb0-4051-4ded-92cc-71cec62ef0e4",
                situationId = null,
                historyId = null,
                dispositionId = null,
                narrativeId = null,
                medicationIds = null,
                vitalIds = null,
                procedureIds = null,
                fileIds = null,
                signatureIds = null,
                predictions = null,
                ringdownId = null,
                deletedAt = null
            )
        )
        reportDao.insert(
            Report(
                id = "33ccd91f-7687-4333-a954-14219318dc1a",
                canonicalId = null,
                currentId = "14e83921-a5c8-4b5b-8024-b63d6dfacbce",
                parentId = null,
                secondParentId = null,
                createdAt = null,
                updatedAt = null,
                data = null,
                incidentId = "63171e45-2188-411b-8fd6-203d7f2134cf",
                priority = 1,
                filterPriority = 1,
                pin = "0003",
                sceneId = "b7671058-7e9f-48fa-8ab9-72f512b914ee",
                responseId = null,
                timeId = null,
                patientId = "e053116e-ee18-4950-9956-219135170f70",
                situationId = null,
                historyId = null,
                dispositionId = null,
                narrativeId = null,
                medicationIds = null,
                vitalIds = null,
                procedureIds = null,
                fileIds = null,
                signatureIds = null,
                predictions = null,
                ringdownId = null,
                deletedAt = null
            )
        )
        reportDao.insert(
            Report(
                id = "14e83921-a5c8-4b5b-8024-b63d6dfacbce",
                canonicalId = "33ccd91f-7687-4333-a954-14219318dc1a",
                currentId = null,
                parentId = null,
                secondParentId = null,
                createdAt = null,
                updatedAt = null,
                data = null,
                incidentId = "63171e45-2188-411b-8fd6-203d7f2134cf",
                priority = 1,
                filterPriority = 1,
                pin = "0003",
                sceneId = "b7671058-7e9f-48fa-8ab9-72f512b914ee",
                responseId = null,
                timeId = null,
                patientId = "e053116e-ee18-4950-9956-219135170f70",
                situationId = null,
                historyId = null,
                dispositionId = null,
                narrativeId = null,
                medicationIds = null,
                vitalIds = null,
                procedureIds = null,
                fileIds = null,
                signatureIds = null,
                predictions = null,
                ringdownId = null,
                deletedAt = null
            )
        )
    }
}
