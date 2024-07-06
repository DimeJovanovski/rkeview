package mk.rkeview.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.Button
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.ButtonDefaults
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.MaterialTheme
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import mk.rkeview.resourceComponents.ResourceType
import mk.rkeview.theme.RKEviewTheme

/**
 * Resource Type button that displays the Resource code and full name.
 *
 * @param resourceType - the ResourceType which contains data for the resource and sub-resources
 * @param navController - for app navigation
 */
@Composable
fun ResourceTypeButton(
    resourceType: ResourceType,
    navController: NavController
) {
    Button(
        onClick = {
            navController.navigate("resourcePricesScreen/${resourceType.firebaseName}/${resourceType.displayName}")
        },
        modifier = Modifier
            .height(140.dp)
            .clip(shape = RoundedCornerShape(8.dp)),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = MaterialTheme.colors.primary, MaterialTheme.colors.onPrimary
        ),
        elevation = ButtonDefaults.elevation(
            defaultElevation = 0.dp, pressedElevation = 0.dp, disabledElevation = 0.dp
        )
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = resourceType.shortName,
                fontSize = 64.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = resourceType.displayName,
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Center
            )
        }
    }
}


@Preview
@Composable
fun ResourceTypeButtonPreview() {
    val navController = rememberNavController()
    RKEviewTheme {
        ResourceTypeButton(
            resourceType = ResourceType.ELECTRIC_ENERGY,
            navController = navController,
        )
    }
}