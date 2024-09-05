package mk.rkeview.ui.screens

import android.content.pm.PackageManager
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import mk.rkeview.R

/**
 * Splash screen to welcome user to application.
 *
 * @param navController - for app navigation
 */
@Composable
fun SplashScreen(navController: NavController) {
    // Fetch the app's version name using PackageManager
    val context = LocalContext.current
    var versionName: String
    try {
        val packageInfo = context.packageManager.getPackageInfo(context.packageName, 0)
        versionName = packageInfo.versionName
    } catch (e: PackageManager.NameNotFoundException) {
        versionName = "Unknown"
    }

    LaunchedEffect(Unit) {
        // Simulate a 2-second delay before navigation
        kotlinx.coroutines.delay(2000)
        // Navigate to the HomeScreen
        navController.navigate("homeScreen") {
            popUpTo("splashScreen") { inclusive = true } // Clear the backstack
        }
    }

    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        // Create references for the logo and the version text
        val (logo, versionText) = createRefs()

        // Logo image in the center of the screen
        Image(
            painter = painterResource(id = R.drawable.rke_logo),
            contentDescription = "Logo",
            modifier = Modifier
                .constrainAs(logo) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
                .size(150.dp)
        )

        // Version text near the bottom with some padding
        Text(
            text = "Верзија: $versionName",  // Display version name dynamically
            fontSize = 16.sp,
            modifier = Modifier
                .padding(bottom = 32.dp)
                .constrainAs(versionText) {
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSplashScreen() {
    // Create a dummy NavController for preview purposes
    val navController = rememberNavController()

    SplashScreen(navController = navController)
}


