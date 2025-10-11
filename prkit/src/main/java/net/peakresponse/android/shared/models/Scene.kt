package net.peakresponse.android.shared.models

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Relation
import java.util.Date

@Entity
data class Scene(
    @PrimaryKey val id: String,
    val canonicalId: String?,
    val currentId: String?,
    val parentId: String?,
    val secondParentId: String?,
    val createdAt: Date?,
    val updatedAt: Date?,
    val data: Map<String, Any>?,
    val name: String?,
    val desc: String?,
    val approxPatientsCount: Int?,
    val approxPriorityPatientsCounts: List<Int>?,
    val patientsCount: Int?,
    val priorityPatientsCounts: List<Int>?,
    val isActive: Boolean?,
    val isMCI: Boolean?,
    val lat: String?,
    val lng: String?,
    val address1: String?,
    val address2: String?,
    val cityId: String?,
    val countyId: String?,
    val stateId: String?,
    val zip: String?,
    val closedAt: Date?,
    val respondersCount: Int?,
    val mgsResponderId: String?,
    val triageResponderId: String?,
    val treatmentResponderId: String?,
    val stagingResponderId: String?,
    val transportResponderId: String?
)

data class SceneWithAddress(
    @Embedded
    val scene: Scene,
    @Relation(
        parentColumn = "cityId",
        entityColumn = "id"
    )
    val city: City?,
    @Relation(
        parentColumn = "stateId",
        entityColumn = "id"
    )
    val state: State?
) {
    val address: String
        get() {
            return "${scene.address1 ?: ""}\n${scene.address2 ?: ""}\n${city?.name ?: ""}, ${state?.abbr ?: ""} ${scene.zip ?: ""}".replace(
                Regex("\n{2,}"),
                "\n"
            ).trim()
        }
}
