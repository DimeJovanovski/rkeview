package mk.rkeview.ui.screens

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import mk.rkeview.model.EnergyResource
import mk.rkeview.model.EnergyResourceData
import mk.rkeview.resourceComponents.ResourceType
import mk.rkeview.ui.components.ResourcePriceField

// This is a screen for manual testing features during development process
@Composable
@ExperimentalMaterialApi
fun TestDataScreen(
    modifier: Modifier = Modifier,
    viewModel: EnergyResourceViewModel = hiltViewModel()
) {
    val resources = viewModel.getCategoryResource("electricity").collectAsStateWithLifecycle(emptyList())
    val resources2 = viewModel.resourcesOil.collectAsStateWithLifecycle(emptyList())
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item {
            androidx.compose.material.Text(
                text = "Наслов",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(vertical = 16.dp)
            )
        }
        items(resources.value) { resource ->
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                ResourcePriceField(
                    displayName = resource.data.name,
                    measureUnit = resource.data.unit,
                    price = resource.data.price,
                    validFrom = resource.data.validFrom
                )
            }
        }
    }
}