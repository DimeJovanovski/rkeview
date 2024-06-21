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
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import mk.rkeview.resourceComponents.ResourceType
import mk.rkeview.theme.RKEviewTheme
import mk.rkeview.ui.components.ResourcePriceField
import mk.rkeview.ui.components.ScreenTemplate

/**
 * The resource prices screen composable.
 * Displays the prices for the sub-resources of a general resource.
 *
 * @param navController - for app navigation
 * @param subTypes - list of Resource's sub-resources(enums)
 */
@Composable
fun ResourcePricesScreen(navController: NavController, subTypes: List<ResourceType.SubType>) {
  ScreenTemplate(
    navController = navController,
    content = { ResourcePricesScreenContent(subTypes = subTypes) }
  )
}

@Composable
fun ResourcePricesScreenContent(subTypes: List<ResourceType.SubType>) {
  LazyColumn(
    modifier = Modifier
      .fillMaxSize()
      .padding(horizontal = 16.dp),
    verticalArrangement = Arrangement.spacedBy(8.dp)
  ) {
    item {
      Text(
        text = "Наслов",
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(vertical = 16.dp)
      )
    }
    items(subTypes) { subType ->
      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
      ) {
        ResourcePriceField(
          displayName = subType.displayName,
          measureUnit = subType.measureUnit,
          price = subType.price,
          validFrom = subType.validFrom
        )
      }
    }
  }
}


@Preview
@Composable
fun ResourcePricesScreenPreview() {
  val navController = rememberNavController()
  RKEviewTheme{
    val subTypes: List<ResourceType.SubType> = listOf(ResourceType.SubType.HS_ESM_LLC_H_CHP, ResourceType.SubType.HS_ESM_DOOEL_H_TE, ResourceType.SubType.HS_ESM_LLC_O_ETP, ResourceType.SubType.HS_ESM_LLC_O_TE, ResourceType.SubType.S_SN_H_ETP, ResourceType.SubType.S_SN_H_TE, ResourceType.SubType.S_SN_O_CTP, ResourceType.SubType.SN_O_TE)
    ResourcePricesScreen(
      navController = navController,
      subTypes = subTypes
    )
  }
}