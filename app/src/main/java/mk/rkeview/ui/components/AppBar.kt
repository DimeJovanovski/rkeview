package mk.rkeview.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import mk.rkeview.theme.RKEviewTheme
import mk.rkeview.theme.ThemeViewModel
import mk.rkeview.R

/**
 * Custom toolbar for the app.
 *
 * @param navController - for app navigation
 * @param disableBackButton - for (not)showing the back icon in toolbar
 * @param themeViewModel - the ViewModel managing app theme
 */
@Composable
fun AppBar(
  navController: NavController,
  disableBackButton: Boolean = false,
  themeViewModel: ThemeViewModel
) {
  val isDarkTheme by themeViewModel.isDarkTheme.collectAsState() // Correctly collect as state

  // Get the current route
  val navBackStackEntry by navController.currentBackStackEntryAsState()
  val currentRoute = navBackStackEntry?.destination?.route

  TopAppBar(
    title = { },
    navigationIcon = if (!disableBackButton) {
      {
        // Back button (OPTIONAL)
        IconButton(onClick = { navController.popBackStack() }) {
          Icon(
            Icons.Default.ArrowBack,
            contentDescription = "Back",
            tint = MaterialTheme.colors.onPrimary,
            modifier = Modifier.size(28.dp)
          )
        }
      }
    } else null,
    actions = {
      Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(end = 8.dp)
      ) {
        // Show the Resource Analytics button only on the resourcePricesScreen
        if (currentRoute?.startsWith("resourcePricesScreen") == true) {
          IconButton(onClick = { navController.navigate("resourceAnalyticsScreen") }) {
            Icon(
              painterResource(R.drawable.baseline_analytics_24),
              contentDescription = "Analytics",
              tint = MaterialTheme.colors.onPrimary,
              modifier = Modifier.size(28.dp)
            )
          }
        }

        // Light/Dark mode toggle button
        IconButton(
          onClick = { themeViewModel.toggleTheme() },
          modifier = Modifier.padding(end = 8.dp)
        ) {
          val iconResId = if (isDarkTheme) R.drawable.baseline_light_mode_24 else R.drawable.baseline_dark_mode_24

          Icon(
            painter = painterResource(iconResId),
            contentDescription = "Toggle Light/Dark Mode",
            tint = MaterialTheme.colors.onPrimary,
            modifier = Modifier.size(28.dp)
          )
        }

        // Settings button
        IconButton(onClick = { navController.navigate("settingsScreen") }) {
          Icon(
            Icons.Default.Settings,
            contentDescription = "Settings",
            tint = MaterialTheme.colors.onPrimary,
            modifier = Modifier.size(28.dp)
          )
        }
      }
    },
    backgroundColor = MaterialTheme.colors.background,
    elevation = 0.dp,
    modifier = Modifier.shadow(elevation = 0.dp)
  )
}


@Preview
@Composable
fun AppBarPreview() {
  val navController = rememberNavController()
  val themeViewModel = remember { ThemeViewModel() } // Initialize ViewModel for preview

  RKEviewTheme {
    Surface {
      AppBar(navController = navController, themeViewModel = themeViewModel)
    }
  }
}
