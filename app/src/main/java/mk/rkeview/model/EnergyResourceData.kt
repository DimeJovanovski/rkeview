package mk.rkeview.model

import com.google.firebase.firestore.PropertyName

data class EnergyResourceData(
    val category: String = "",
    val name: String = "",
    val price: Double = 0.0,
    val unit: String = "",
    @PropertyName(value = "valid_from") val validFrom: String = "",
)