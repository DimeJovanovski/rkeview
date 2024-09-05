package mk.rkeview.ui.screens

import android.annotation.SuppressLint
import android.content.pm.PackageManager
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import mk.rkeview.theme.ThemeViewModel
import mk.rkeview.ui.components.ScreenTemplate

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun AboutAppScreen(navController: NavController, themeViewModel: ThemeViewModel) {
    ScreenTemplate(
        navController = navController,
        themeViewModel = themeViewModel,
        content = { AboutAppScreenContent() }
    )
}

@Composable
fun AboutAppScreenContent() {
    // Fetch the app's version name using PackageManager
    val context = LocalContext.current
    var versionName: String
    try {
        val packageInfo = context.packageManager.getPackageInfo(context.packageName, 0)
        versionName = packageInfo.versionName
    } catch (e: PackageManager.NameNotFoundException) {
        versionName = "Unknown"
    }

    ConstraintLayout(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)
    ) {
        val (title, description, createdByTitle, peopleList, version) = createRefs()

        // Title
        Text(
            text = "Што е РКЕview?",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.constrainAs(title) {
                top.linkTo(parent.top, margin = 32.dp)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                width = Dimension.wrapContent
                height = Dimension.wrapContent
            }
        )

        // Paragraph
        Text(
            text = "РКЕview е мобилна апликација што овозможува следење на цените на " +
                    "енергенси во Република Македонија во реално време.",
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.constrainAs(description) {
                top.linkTo(title.bottom, margin = 16.dp)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                width = Dimension.wrapContent
                height = Dimension.wrapContent
            }
        )

        // Created By Title
        Text(
            text = "Креирано од:",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.constrainAs(createdByTitle) {
                top.linkTo(description.bottom, margin = 32.dp)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                width = Dimension.wrapContent
                height = Dimension.wrapContent
            }
        )

        // People List
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.constrainAs(peopleList) {
                top.linkTo(createdByTitle.bottom, margin = 16.dp)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                width = Dimension.wrapContent
                height = Dimension.wrapContent
            }
        ) {
            Text("1. Димитар Јовановски")
            Text("2. Димитрија Тимески")
            Text("3. Андреј Бардакоски")
        }

        // Version text
        Text(
            text = "Верзија: $versionName",
            fontSize = 16.sp,
            modifier = Modifier.constrainAs(version) {
                bottom.linkTo(parent.bottom, margin = 16.dp)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                width = Dimension.wrapContent
                height = Dimension.wrapContent
            }
        )
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewAboutAppScreen() {
    // Create a dummy NavController for preview purposes
    val navController = rememberNavController()
    // Create a dummy ThemeViewModel for preview purposes
    val themeViewModel = remember { ThemeViewModel() }

    AboutAppScreen(
        navController = navController,
        themeViewModel = themeViewModel
    )
}
