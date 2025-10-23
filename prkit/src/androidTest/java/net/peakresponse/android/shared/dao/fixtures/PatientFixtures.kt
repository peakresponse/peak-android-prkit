package net.peakresponse.android.shared.dao.fixtures

import net.peakresponse.android.shared.dao.PRAppDatabase
import net.peakresponse.android.shared.models.Patient

object PatientFixtures {
    suspend fun populatePatients(db: PRAppDatabase) {
        val patientDao = db.getPatientDao()
        patientDao.insert(
            Patient(
                id = "a44cbd2b-966c-40ae-a64d-acfc57a51021",
                canonicalId = null,
                currentId = "bf8c0724-cd05-4807-bd20-ad1b00525269",
                parentId = null,
                secondParentId = null,
                createdAt = null,
                updatedAt = null,
                data = null,
                firstName = "Patient",
                lastName = "One",
                gender = "9906003",
                age = 18,
                ageUnits = "2516009",
                dob = null,
                location = "1st and Main",
                lat = "37.785834",
                lng = "-122.406417",
                priority = 0
            )
        )
        patientDao.insert(
            Patient(
                id = "bf8c0724-cd05-4807-bd20-ad1b00525269",
                canonicalId = "a44cbd2b-966c-40ae-a64d-acfc57a51021",
                currentId = null,
                parentId = null,
                secondParentId = null,
                createdAt = null,
                updatedAt = null,
                data = null,
                firstName = "Patient",
                lastName = "One",
                gender = "9906003",
                age = 18,
                ageUnits = "2516009",
                dob = null,
                location = "1st and Main",
                lat = "37.785834",
                lng = "-122.406417",
                priority = 0
            )
        )
        patientDao.insert(
            Patient(
                id = "80f81198-9a5c-4751-92d8-22ac3bea7ee5",
                canonicalId = null,
                currentId = "3c0d3bb0-4051-4ded-92cc-71cec62ef0e4",
                parentId = null,
                secondParentId = null,
                createdAt = null,
                updatedAt = null,
                data = null,
                firstName = "Patient",
                lastName = "Two",
                gender = "9906003",
                age = 69,
                ageUnits = "2516009",
                dob = null,
                location = "1st and Main",
                lat = "37.767087",
                lng = "-122.419977",
                priority = 0
            )
        )
        patientDao.insert(
            Patient(
                id = "3c0d3bb0-4051-4ded-92cc-71cec62ef0e4",
                canonicalId = "80f81198-9a5c-4751-92d8-22ac3bea7ee5",
                currentId = null,
                parentId = null,
                secondParentId = null,
                createdAt = null,
                updatedAt = null,
                data = null,
                firstName = "Patient",
                lastName = "Two",
                gender = "9906003",
                age = 69,
                ageUnits = "2516009",
                dob = null,
                location = "1st and Main",
                lat = "37.767087",
                lng = "-122.419977",
                priority = 0
            )
        )
        patientDao.insert(
            Patient(
                id = "0f04a05e-a2ae-4c95-b3ff-4acfb6e3bccd",
                canonicalId = null,
                currentId = "e053116e-ee18-4950-9956-219135170f70",
                parentId = null,
                secondParentId = null,
                createdAt = null,
                updatedAt = null,
                data = null,
                firstName = "Patient",
                lastName = "Three",
                gender = "9906001",
                age = 16,
                ageUnits = "2516009",
                dob = null,
                location = "Triage Staging",
                lat = "37.767122",
                lng = "-122.419791",
                priority = 1
            )
        )
        patientDao.insert(
            Patient(
                id = "e053116e-ee18-4950-9956-219135170f70",
                canonicalId = "0f04a05e-a2ae-4c95-b3ff-4acfb6e3bccd",
                currentId = null,
                parentId = null,
                secondParentId = null,
                createdAt = null,
                updatedAt = null,
                data = null,
                firstName = "Patient",
                lastName = "Three",
                gender = "9906001",
                age = 16,
                ageUnits = "2516009",
                dob = null,
                location = "Triage Staging",
                lat = "37.767122",
                lng = "-122.419791",
                priority = 1
            )
        )
    }
}
