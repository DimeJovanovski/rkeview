package mk.rkeview.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.google.gson.Gson
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
      val subTypesJson = Gson().toJson(resourceType.subTypes)
      navController.navigate("resourcePricesScreen/$subTypesJson")
    },
    modifier = Modifier
      .height(140.dp)
      .clip(shape = RoundedCornerShape(8.dp))
      .border(
        width = 1.dp,
        color = MaterialTheme.colors.secondary,
        shape = RoundedCornerShape(8.dp)
      ),
    colors = ButtonDefaults.buttonColors(
      backgroundColor = MaterialTheme.colors.primary, contentColor = Color.Black
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