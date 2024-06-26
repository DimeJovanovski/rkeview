package mk.rkeview.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import mk.rkeview.model.EnergyResource
import mk.rkeview.theme.RKEviewTheme
import mk.rkeview.ui.components.ResourcePriceField
import mk.rkeview.ui.components.ScreenTemplate

/**
 * The resource prices screen composable.
 * Displays the prices for the sub-resources of a general resource.
 *
 * @param navController - for app navigation
 * @param viewModel - viewModel from where to read the data
 * @param resourceTypeFirebaseName - name of the document in Firebase of the general resource
 */
@Composable
fun ResourcePricesScreen(
    navController: NavController,
    viewModel: EnergyResourceViewModel = hiltViewModel(),
    resourceTypeFirebaseName: String
) {
    val resources = viewModel.getCategoryResource(resourceTypeFirebaseName)
        .collectAsStateWithLifecycle(emptyList())

    ScreenTemplate(navController = navController, content = {
        ResourcePricesScreenContent(
            subTypes = resources.value, resourceTypeName = resourceTypeFirebaseName
        )
    })
}

@Composable
fun ResourcePricesScreenContent(subTypes: List<EnergyResource>, resourceTypeName: String) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item {
            Text(
                text = resourceTypeName,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(vertical = 16.dp)
            )
        }
        items(subTypes) { subType ->
            Row(
                modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
            ) {
                ResourcePriceField(
                    displayName = subType.data.name,
                    measureUnit = subType.data.unit,
                    price = subType.data.price,
                    validFrom = subType.data.validFrom
                )
            }
        }
    }
}


// Preview won't work because it can't initialize viewModel
//@Preview
//@Composable
//fun ResourcePricesScreenContentPreview() {
//  val navController = rememberNavController()
//  RKEviewTheme{
//    val subTypes: List<EnergyResource> = listOf()
//    ResourcePricesScreenContent(subTypes = subTypes, resourceTypeName = "HI"
//    )
//  }
//}