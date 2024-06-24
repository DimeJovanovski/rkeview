package mk.rkeview.model

import kotlinx.coroutines.flow.Flow

interface EnergyResourceService {
    val resources: Flow<List<EnergyResource>>
    suspend fun getResource(energyResourceId: String): EnergyResource?
    suspend fun save(energyResource: EnergyResource): String
    suspend fun update(energyResource: EnergyResource)
    suspend fun delete(energyResourceId: String)
    suspend fun loadResources(): List<EnergyResource>
}