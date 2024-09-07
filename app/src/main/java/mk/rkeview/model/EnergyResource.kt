package mk.rkeview.model

import com.google.firebase.firestore.DocumentId
import com.google.firebase.firestore.PropertyName


data class EnergyResource(
    @DocumentId val id: String = "",
    val data: EnergyResourceData = EnergyResourceData(),
)


