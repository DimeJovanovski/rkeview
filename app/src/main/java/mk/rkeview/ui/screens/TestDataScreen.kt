package mk.rkeview.ui.screens

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import mk.rkeview.model.EnergyResource
import mk.rkeview.model.EnergyResourceData


@Composable
@ExperimentalMaterialApi
fun TestDataScreen(
    modifier: Modifier = Modifier,
    viewModel: EnergyResourceViewModel = hiltViewModel()
) {
    val resources = viewModel.resources.collectAsStateWithLifecycle(emptyList())

    LazyColumn(modifier = modifier) {
        items(resources.value) { resource ->
            EnergyResourceItem(resource)
        }
    }
}

@Composable
fun EnergyResourceItem(
    resource: EnergyResource
) {
    Row {
        Text(text = resource.data.toString())
    }
}
