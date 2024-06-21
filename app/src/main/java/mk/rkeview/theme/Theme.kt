package mk.rkeview.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

/**
 * Custom RKEview app theme.
 * Available modes are LIGHT and DARK.
 */

private val LightColors = lightColors(
  background = Color.White,               // background color
  primary = Color(0xFFF4F4F9),      // buttons & shapes color
  secondary = Color.LightGray,            // border color
)

private val DarkColors = darkColors(
  background = Color.White,               // background color
  primary = Color(0xFFF4F4F9),      // buttons & shapes color
  secondary = Color.LightGray,            // border color

)

@Composable
fun RKEviewTheme(
  useDarkTheme: Boolean = isSystemInDarkTheme(),
  content: @Composable() () -> Unit
) {
  val colors = if (!useDarkTheme) {
    LightColors
  } else {
    DarkColors
  }

  MaterialTheme(
    colors = colors,
    content = content
  )
}