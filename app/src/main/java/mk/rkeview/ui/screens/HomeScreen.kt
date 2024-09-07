package mk.rkeview.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import mk.rkeview.resourceComponents.ResourceType
import mk.rkeview.theme.RKEviewTheme
import mk.rkeview.theme.ThemeViewModel
import mk.rkeview.ui.components.ResourceTypeButton
import mk.rkeview.ui.components.ScreenTemplate

/**
 * The home screen composable.
 * Displays a buttons grid for all the resource types.
 * The user clicks on the type of resource for which he/she wants to view the prices.
 *
 * @param navController - for app navigation
 * @param themeViewModel - the ViewModel managing app theme
 */
@Composable
fun HomeScreen(navController: NavController, themeViewModel: ThemeViewModel) {
  ScreenTemplate(
    navController = navController,
    themeViewModel = themeViewModel,
    content = { HomeScreenContent(navController) },
    disableBackButton = true
  )
}

@Composable
fun HomeScreenContent(navController: NavController) {
  Box(
    modifier = Modifier.fillMaxSize(),
    contentAlignment = Alignment.Center
  ) {
    BoxWithConstraints {
      val maxWidth = maxWidth
      val columns = if (maxWidth < 600.dp) 2 else 3

      LazyVerticalGrid(
        columns = GridCells.Fixed(columns),
        modifier = Modifier.padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
      ) {
        items(ResourceType.entries) { resourceType ->
          ResourceTypeButton(
            resourceType = resourceType,
            navController = navController,
          )
        }
      }
    }
  }
}

@Preview
@Composable
fun HomeScreenPreview() {
  val navController = rememberNavController()
  val themeViewModel = ThemeViewModel() // Initialize ViewModel for preview
  RKEviewTheme {
    HomeScreen(navController = navController, themeViewModel = themeViewModel)
  }
}
