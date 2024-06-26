package mk.rkeview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.ExperimentalMaterialApi
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

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterialApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RKEviewTheme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "homeScreen") {
                    // for the Home Screen
                    composable("homeScreen") { HomeScreen(navController = navController) }

                    // for the Resource Prices Screen
                    composable(
                        "resourcePricesScreen/{resourceTypeFirebaseName}/{resourceTypeDisplayName}",
                        arguments = listOf(navArgument("resourceTypeFirebaseName") {
                            type = NavType.StringType
                        }, navArgument("resourceTypeDisplayName") {
                            type = NavType.StringType
                        })
                    ) { backStackEntry ->
                        val resourceTypeFirebaseName =
                            backStackEntry.arguments?.getString("resourceTypeFirebaseName")
                        val resourceTypeDisplayName =
                            backStackEntry.arguments?.getString("resourceTypeDisplayName")
                        ResourcePricesScreen(
                            navController = navController,
                            resourceTypeFirebaseName = resourceTypeFirebaseName.orEmpty(),
                            resourceTypeDisplayName = resourceTypeDisplayName.orEmpty()
                        )
                    }

                    // for the Settings screen
                    composable("settingsScreen") { SettingsScreen(navController = navController) }
                }
            }
//            RKEviewTheme {
//                TestDataScreen()
//            }
        }
    }
}

