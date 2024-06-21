package mk.rkeview.ui.components

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

/**
 * ScreenTemplate is a composable template that receives a
 * composable content and servers it along with other screen
 * default components.
 *
 * @param navController - for app navigation
 * @param content - the Composable main content
 * @param disableBackButton - for (not)showing the back icon in toolbar
 */
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ScreenTemplate(
  navController: NavController,
  content: @Composable () -> Unit,
  disableBackButton: Boolean = false,
) {
  Scaffold(
    topBar = {
      AppBar(navController = navController, disableBackButton = disableBackButton)
    },
    content = {
      Box(
        modifier = Modifier
          .fillMaxSize()
          .padding(bottom = 64.dp)
      ) {
        content()
      }
    },
    bottomBar = {
      BottomBar()
    }
  )
}

@Preview
@Composable
fun ScreenTemplatePreview() {
  val navController = rememberNavController()
  ScreenTemplate(
    navController = navController,
    content = { Text("Hello world!") }
  )
}