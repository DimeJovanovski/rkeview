package mk.rkeview

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import mk.rkeview.theme.RKEviewTheme
import mk.rkeview.ui.screens.HomeScreen
import mk.rkeview.ui.screens.ResourcePricesScreen
import mk.rkeview.ui.screens.SettingsScreen
import androidx.navigation.navArgument
import dagger.hilt.android.AndroidEntryPoint
import mk.rkeview.theme.ThemeViewModel
import mk.rkeview.ui.screens.ResourceAnalyticsScreen

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val themeViewModel: ThemeViewModel = viewModel()

            // Determine system dark theme
            val isSystemDarkTheme = isSystemInDarkTheme()

            // Set the initial theme based on system theme
            themeViewModel.setDarkTheme(isSystemDarkTheme)

            RKEviewTheme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "homeScreen") {
                    // for the Home Screen
                    composable("homeScreen") {
                        HomeScreen(navController = navController, themeViewModel = themeViewModel)
                    }

                    // for the Resource Prices Screen
                    composable(
                        "resourcePricesScreen/{resourceTypeFirebaseName}/{resourceTypeDisplayName}",
                        arguments = listOf(
                            navArgument("resourceTypeFirebaseName") { type = NavType.StringType },
                            navArgument("resourceTypeDisplayName") { type = NavType.StringType }
                        )
                    ) { backStackEntry ->
                        val resourceTypeFirebaseName =
                            backStackEntry.arguments?.getString("resourceTypeFirebaseName")
                        val resourceTypeDisplayName =
                            backStackEntry.arguments?.getString("resourceTypeDisplayName")
                        ResourcePricesScreen(
                            navController = navController,
                            themeViewModel = themeViewModel,
                            resourceTypeFirebaseName = resourceTypeFirebaseName.orEmpty(),
                            resourceTypeDisplayName = resourceTypeDisplayName.orEmpty()
                        )
                    }

                    // for the Settings screen
                    composable("settingsScreen") {
                        SettingsScreen(
                            navController = navController,
                            themeViewModel = themeViewModel
                        )
                    }

                    // for the Resource Analytics screen
                    composable("resourceAnalyticsScreen") {
                        ResourceAnalyticsScreen(
                            navController = navController,
                            themeViewModel = themeViewModel
                        )
                    }
                }
            }
        }
    }
}
