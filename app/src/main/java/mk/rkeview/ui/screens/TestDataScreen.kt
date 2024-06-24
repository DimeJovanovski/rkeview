package mk.rkeview.ui.screens

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
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
            EnergyResourceItem(
                resource = resource
            )
        }
    }
}

@Composable
fun EnergyResourceItem(
    resource: EnergyResource,
) {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .border(1.dp, color = Color.Black)
    ) {
        Text(text = resource.data.name)
        Text(text = resource.data.price.toString())
        Text(text = resource.data.unit)
    }
}
