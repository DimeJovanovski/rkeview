package mk.rkeview.model.service.impl

import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.dataObjects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow
import mk.rkeview.model.EnergyResource
import mk.rkeview.model.EnergyResourceData
import mk.rkeview.model.service.EnergyResourceService
import javax.inject.Inject

class EnergyResourceServiceImpl @Inject constructor(
    private val firestore: FirebaseFirestore

) : EnergyResourceService {

//    listeners
    override val resourcesHeating: Flow<List<EnergyResource>>
        get() = firestore.collection(DISTRICT_HEATING).dataObjects<EnergyResource>()
    override val resourcesOil: Flow<List<EnergyResource>>
        get() = firestore.collection(OIL_AND_OIL_DERIVATIVES).dataObjects<EnergyResource>()
    override val resourcesElectricity: Flow<List<EnergyResource>>
        get() = firestore.collection(ELECTRICITY).dataObjects<EnergyResource>()
    override val resourcesRenewableSources: Flow<List<EnergyResource>>
        get() = firestore.collection(RENEWABLE_SOURCES).dataObjects<EnergyResource>()

    override suspend fun getResource(energyResourceId: String): EnergyResource? {
        TODO("Not yet implemented")
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