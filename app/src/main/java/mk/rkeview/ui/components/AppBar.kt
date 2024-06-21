package mk.rkeview.ui.components

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

/**
 * Custom toolbar for the app.
 */
@Composable
fun AppBar(navController: NavController, disableBackButton: Boolean = false) {
  TopAppBar(
    title = {  },
    navigationIcon = if (!disableBackButton) {
      {
        IconButton(onClick = { navController.popBackStack() }) {
          Icon(Icons.Default.ArrowBack, contentDescription = "Back")
        }
      }
    } else null,
    backgroundColor = Color.White,
    contentColor = Color.Black,
    elevation = 0.dp,
    modifier = Modifier.shadow(elevation = 0.dp)
  )
}

@Preview
@Composable
fun PreviewAppBar() {
  val navController = rememberNavController()
  AppBar(navController = navController)
}