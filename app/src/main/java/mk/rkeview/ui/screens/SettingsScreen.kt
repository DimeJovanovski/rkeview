package mk.rkeview.ui.screens

import android.annotation.SuppressLint
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import mk.rkeview.ui.components.ScreenTemplate

/**
 * TODO: Settings screen for app configuration by user.
 *
 * @param navController - for app navigation
 */
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SettingsScreen(navController: NavController) {
  ScreenTemplate(
    navController = navController,
    content = { }
  )
}

@Preview
@Composable
fun SettingsScreenPreview() {
  val navController = rememberNavController()
  SettingsScreen(navController = navController)
}
