package mk.rkeview.ui.screens

import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import mk.rkeview.model.EnergyResource
import mk.rkeview.model.service.EnergyResourceService
import javax.inject.Inject


@HiltViewModel
class EnergyResourceViewModel @Inject constructor(
    private val resourceService: EnergyResourceService
) : BaseViewModel() {

    val resourcesHeating = resourceService.resourcesHeating
    val resourcesOil = resourceService.resourcesOil
    val resourcesElectricity = resourceService.resourcesElectricity
    val resourcesRenewableSources = resourceService.resourcesRenewableSources

//    IDK How coroutines work
//
//    fun loadResources() {
//        launchCatching {
//            resourceService.getWarehouseResources()
//        }
//    }
//
//    fun getResource(id: String) {
//        launchCatching {
//            resourceService.getResource(id)
//        }
//    }

    fun getCategoryResource(category: String): Flow<List<EnergyResource>> {
        return resourceService.getCategoryResources(category)
    }
}