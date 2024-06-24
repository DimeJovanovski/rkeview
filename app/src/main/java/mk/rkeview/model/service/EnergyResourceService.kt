package mk.rkeview.model.service

import kotlinx.coroutines.flow.Flow
import mk.rkeview.model.EnergyResource
import mk.rkeview.model.EnergyResourceData

interface EnergyResourceService {

    // Better way to grab the resources:
    val resources: Flow<List<EnergyResource>>

    // ToDo: Grab Resources based on category, and implement all these!

    suspend fun getWarehouseResources(): List<Pair<String, EnergyResourceData>>
    suspend fun getCategoryResources(category: String): List<EnergyResource>
    suspend fun getResource(energyResourceId: String): EnergyResource?
    suspend fun save(energyResource: EnergyResource): String
    suspend fun update(energyResource: EnergyResource)
    suspend fun delete(energyResourceId: String)
}