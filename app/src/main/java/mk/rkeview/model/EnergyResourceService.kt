package mk.rkeview.model

import kotlinx.coroutines.flow.Flow

interface EnergyResourceService {

    // suspend fun loadResources(): List<EnergyResource>
    // Better way to grab the resources:
    val resources: Flow<List<EnergyResource>>

    // ToDo: Grab Resources based on category, and implement all these!

    suspend fun getResource(energyResourceId: String): EnergyResource?
    suspend fun save(energyResource: EnergyResource): String
    suspend fun update(energyResource: EnergyResource)
    suspend fun delete(energyResourceId: String)
}