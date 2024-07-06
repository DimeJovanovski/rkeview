package mk.rkeview.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import mk.rkeview.theme.RKEviewTheme
import mk.rkeview.theme.ThemeViewModel
import mk.rkeview.ui.components.ScreenTemplate

/**
 * Settings screen for user configurations.
 *
 * @param navController - for app navigation
 * @param themeViewModel - the ViewModel managing app theme
 */
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SettingsScreen(navController: NavController, themeViewModel: ThemeViewModel) {
  ScreenTemplate(
    navController = navController,
    themeViewModel = themeViewModel,
    content = { SettingsScreenContent() }
  )
}

@Composable
fun SettingsScreenContent() {
  /**
   * TODO: Implement the screen and connect it with Firebase so the user can set
   * notifications for price changes of different resources.
   */
  Text(
    text = "Settings",
    fontSize = 32.sp,
    fontWeight = FontWeight.Bold,
    modifier = Modifier.padding(vertical = 16.dp)
  )
}

@Preview
@Composable
fun SettingsScreenPreview() {
  val navController = rememberNavController()
  val themeViewModel = ThemeViewModel() // Initialize ViewModel for preview
  RKEviewTheme {
    SettingsScreen(navController = navController, themeViewModel = themeViewModel)
  }
}

