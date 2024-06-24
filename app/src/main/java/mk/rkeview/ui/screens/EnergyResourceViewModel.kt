package mk.rkeview.ui.screens

import dagger.hilt.android.lifecycle.HiltViewModel
import mk.rkeview.model.service.EnergyResourceService
import javax.inject.Inject


@HiltViewModel
class EnergyResourceViewModel @Inject constructor(
    private val resourceService: EnergyResourceService
) : BaseViewModel() {

    val resources = resourceService.resources

    fun loadResources() {
        launchCatching {
            resourceService.getWarehouseResources()
        }
    }

    fun getResource(id: String) {
        launchCatching {
            resourceService.getResource(id)
        }
    }
}