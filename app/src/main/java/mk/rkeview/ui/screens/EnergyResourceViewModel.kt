package mk.rkeview.ui.screens

import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow
import mk.rkeview.model.EnergyResource
import mk.rkeview.model.service.EnergyResourceService
import mk.rkeview.model.service.impl.EnergyResourceServiceImpl
import mk.rkeview.model.service.impl.EnergyResourceServiceImpl.Companion
import javax.inject.Inject


@HiltViewModel
class EnergyResourceViewModel @Inject constructor(
    private val resourceService: EnergyResourceService
) : BaseViewModel() {

    private val resourcesHeating = resourceService.resourcesHeating
    private val resourcesOil = resourceService.resourcesOil
    private val resourcesElectricity = resourceService.resourcesElectricity
    private val resourcesRenewableSources = resourceService.resourcesRenewableSources


    fun getCategoryResource(category: String): Flow<List<EnergyResource>>{
        if (category == DISTRICT_HEATING) {
            return resourcesHeating
        } else if (category == ELECTRICITY) {
            return resourcesElectricity
        } else if (category == OIL_AND_OIL_DERIVATIVES) {
            return resourcesOil
        } else if (category == RENEWABLE_SOURCES) {
            return resourcesRenewableSources
        } else {
            return emptyFlow()
        }
    }

    companion object {
        private const val DISTRICT_HEATING = "district_heating"
        private const val ELECTRICITY = "electricity"
        private const val OIL_AND_OIL_DERIVATIVES = "oil_and_oil_derivatives"
        private const val RENEWABLE_SOURCES = "renewable_sources"
    }
}