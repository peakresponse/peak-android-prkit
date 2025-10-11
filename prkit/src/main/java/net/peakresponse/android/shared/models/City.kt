package net.peakresponse.android.shared.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity
data class City(
    @PrimaryKey val id: String,
    val createdAt: Date?,
    val updatedAt: Date?,
    val featureName: String?,
    val stateNumeric: String?,
    val stateAlpha: String?,
    val primaryLatitude: Double?,
    val primaryLongitude: Double?
) {
    val name: String?
        get() {
            if (featureName?.startsWith("City of ") ?: false) {
                return featureName.substring(8)
            }
            return featureName
        }
}
