package net.peakresponse.android.shared.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity
data class Assignment(
    @PrimaryKey val id: String,
    val createdAt: Date?,
    val updatedAt: Date?,
    val userId: String?,
    val vehicleId: String?
)
