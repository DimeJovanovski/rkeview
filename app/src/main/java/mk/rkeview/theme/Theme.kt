package mk.rkeview.theme

//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.MaterialTheme
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.darkColors
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel

/**
 * Custom RKEview app theme.
 * Available modes are LIGHT and DARK.
 */

private val LightColors = lightColors(
  background = Color.White,
  primary = Color(0xFFF4F4F9),
  onPrimary = Color.Black,
)

private val DarkColors = darkColors(
  background = Color(0xFF121212),
  primary = Color(0xFF1E1E1E),
  onPrimary = Color.White,

)

// Define LocalThemeViewModel as a CompositionLocal
private val LocalThemeViewModel = staticCompositionLocalOf<ThemeViewModel> {
  error("No LocalThemeViewModel provided")
}

@Composable
fun RKEviewTheme(
  content: @Composable () -> Unit
) {
  val themeViewModel = viewModel<ThemeViewModel>()

  CompositionLocalProvider(LocalThemeViewModel provides themeViewModel) {
    val isDarkTheme by LocalThemeViewModel.current.isDarkTheme.collectAsState()

    val colors = if (!isDarkTheme) {
      LightColors
    } else {
      DarkColors
    }

    MaterialTheme(
      colors = colors,
      content = content
    )
  }
}


