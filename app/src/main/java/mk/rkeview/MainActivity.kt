package mk.rkeview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import mk.rkeview.theme.RKEviewTheme
import mk.rkeview.ui.screens.HomeScreen
import mk.rkeview.ui.screens.ResourcePricesScreen
import mk.rkeview.ui.screens.SettingsScreen
import androidx.navigation.navArgument
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import mk.rkeview.resourceComponents.ResourceType

class MainActivity : ComponentActivity() {
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
            "resourcePricesScreen/{subTypes}",
            arguments = listOf(navArgument("subTypes") {
              type = NavType.StringType
            })
          ) { backStackEntry ->
            val subTypesJson = backStackEntry.arguments?.getString("subTypes")
            val subTypesType = object : TypeToken<List<ResourceType.SubType>>() {}.type
            val subTypes: List<ResourceType.SubType> =
              Gson().fromJson(subTypesJson, subTypesType)
            ResourcePricesScreen(navController = navController, subTypes = subTypes)
          }

          // for the Settings screen
          composable("settingsScreen") { SettingsScreen(navController = navController) }
        }
      }
    }
  }
}

