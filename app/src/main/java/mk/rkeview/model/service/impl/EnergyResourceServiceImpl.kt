package mk.rkeview.model.service.impl

import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.dataObjects
import com.google.firebase.firestore.toObjects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.tasks.await
import mk.rkeview.model.EnergyResource
import mk.rkeview.model.EnergyResourceData
import mk.rkeview.model.service.EnergyResourceService
import javax.inject.Inject

class EnergyResourceServiceImpl @Inject constructor(
    private val firestore: FirebaseFirestore

) : EnergyResourceService {

    private val collection get() = firestore.collection(WAREHOUSE)

    // Currently only using DISTRICT_HEATING, but will need to use the other categories
    override val resources: Flow<List<EnergyResource>>
        get() = firestore.collection(DISTRICT_HEATING).dataObjects<EnergyResource>()

    override suspend fun getWarehouseResources(): List<Pair<String, EnergyResourceData>> {
        // we want to read all the documents, they have variable amount of fields
        // so we can't use toObjects
        return collection.get().await().documents.map { doc ->
            doc.id to doc.toObject(EnergyResourceData::class.java)!!
        }
    }

    override suspend fun getCategoryResources(category: String): List<EnergyResource> {
        return firestore.collection(category).get().await().toObjects(EnergyResource::class.java)
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


    companion object {
        private const val DISTRICT_HEATING = "district_heating"
        private const val ELECTRICITY = "electricity"
        private const val OIL_AND_OIL_DERIVATIVES = "oil_and_oil_derivatives"
        private const val RENEWABLE_SOURCES = "renewable_sources"
        private const val WAREHOUSE = "warehouse"
    }

}