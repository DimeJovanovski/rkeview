package mk.rkeview.model.service

import android.util.Log
import androidx.compose.foundation.lazy.items
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.dataObjects
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.forEach
import kotlinx.coroutines.tasks.await
import mk.rkeview.model.EnergyResource
import mk.rkeview.model.EnergyResourceData
import mk.rkeview.model.EnergyResourceService
import mk.rkeview.ui.screens.EnergyResourceItem
import javax.inject.Inject

class EnergyResourceServiceImpl @Inject constructor(
    private val firestore: FirebaseFirestore

) : EnergyResourceService {

    private val collection get() = firestore.collection(DISTRICT_HEATING)

    @OptIn(ExperimentalCoroutinesApi::class)
    override val resources: Flow<List<EnergyResource>>
        get() {
            val x = firestore.collection(DISTRICT_HEATING).dataObjects<EnergyResource>()
            Log.d("EnergyResourceServiceImpl", "resources: $x")



            return x
        }

    override suspend fun getResource(energyResourceId: String): EnergyResource? {
        return collection.document(energyResourceId).get().await()
            .toObject(EnergyResource::class.java)
    }

    override suspend fun save(energyResource: EnergyResource): String {
        TODO("Not yet implemented")
    }

    override suspend fun update(energyResource: EnergyResource) {
        TODO("Not yet implemented")
    }

    override suspend fun delete(energyResourceId: String) {
        TODO("Not yet implemented")
    }

    override suspend fun loadResources(): List<EnergyResource> {
        return firestore.collection(DISTRICT_HEATING).get().await()
            .toObjects(EnergyResource::class.java)
    }


    companion object {
        private const val DISTRICT_HEATING = "district_heating"
        private const val ELECTRICITY = "electricity"
        private const val OIL_AND_OIL_DERIVATIVES = "oil_and_oil_derivatives"
        private const val RENEWABLE_SOURCES = "renewable_sources"
    }

}