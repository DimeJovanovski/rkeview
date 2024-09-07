package mk.rkeview.ui.components

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import mk.rkeview.R
import mk.rkeview.theme.ThemeViewModel

@Composable
fun AppBar(
  navController: NavController,
  disableBackButton: Boolean = false,
  themeViewModel: ThemeViewModel
) {
  val isDarkTheme by themeViewModel.isDarkTheme.collectAsState()
  val navBackStackEntry by navController.currentBackStackEntryAsState()
  val currentRoute = navBackStackEntry?.destination?.route

  var showAlertDialog by remember { mutableStateOf(false) }

  // Get the context
  val context = LocalContext.current

  TopAppBar(
    title = { },
    navigationIcon = if (!disableBackButton) {
      {
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
        // Show the AboutApp button only on screens other than AboutAppScreen
        if (currentRoute?.startsWith("aboutAppScreen") == false) {
          IconButton(onClick = { navController.navigate("aboutAppScreen") }) {
            Icon(
              painterResource(R.drawable.baseline_aboutinfo_24),
              contentDescription = "About App",
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

        // Power off button
        IconButton(onClick = { showAlertDialog = true }) {
          Icon(
            painterResource(R.drawable.baseline_exit_to_app_24),
            contentDescription = "Power Off",
            tint = MaterialTheme.colors.onPrimary,
            modifier = Modifier.size(28.dp)
          )
        }
      }
    },
    backgroundColor = MaterialTheme.colors.background,
    modifier = Modifier.shadow(elevation = 0.dp),
    elevation = 0.dp
  )

  if (showAlertDialog) {
    AlertDialog(
      onDismissRequest = { showAlertDialog = false },
      title = {
        Text(
          text = "Потврдете излез",
          style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold)
        )
      },
      text = {
        Text(
          text = "Дали сте сигурни дека сакате да излезете од апликацијата?",
          style = TextStyle(fontSize = 16.sp)
        )
      },
      confirmButton = {
        Button(
          onClick = {
            // Handle YES click
            showAlertDialog = false
            // Exit the application
            (context as? ComponentActivity)?.finishAffinity()
          },
          colors = ButtonDefaults.buttonColors(
            backgroundColor = MaterialTheme.colors.primary,
            contentColor = MaterialTheme.colors.onPrimary,
            disabledBackgroundColor = Color.Gray
          )
        ) {
          Text(text = "Да")
        }
      },
      dismissButton = {
        Button(
          onClick = { showAlertDialog = false },
          colors = ButtonDefaults.buttonColors(
            backgroundColor = Color(0xFFF67036),
            contentColor = Color.White
          )
        ) {
          Text(text = "Не")
        }
      }
    )
  }
}

@Preview(showBackground = true)
@Composable
fun PreviewAppBar() {
  // Provide dummy data for preview
  AppBar(
    navController = rememberNavController(),
    themeViewModel = remember { ThemeViewModel() }
  )
}
