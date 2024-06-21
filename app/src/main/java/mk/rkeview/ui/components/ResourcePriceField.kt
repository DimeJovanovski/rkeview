package mk.rkeview.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import mk.rkeview.theme.RKEviewTheme
import java.util.Date

/**
 * Field that displays the sub-resource and it's data
 *
 * @param displayName - full name of sub-resource
 * @param measureUnit - measurement unit of sub-resource
 * @param price - price of sub-resource
 * @param validFrom - date sub-resource is valid from
 */
@Composable
fun ResourcePriceField(
  displayName: String,
  measureUnit: String,
  price: Double,
  validFrom: Date
) {
  Row(
    modifier = Modifier
      .height(80.dp)
      .clip(shape = RoundedCornerShape(8.dp))
      .background(MaterialTheme.colors.primary)

      .border(
        width = 1.dp,
        color = MaterialTheme.colors.secondary,
        shape = RoundedCornerShape(8.dp)
      )
      .drawBehind {
        val borderSize = 1.dp.toPx()
        drawLine(
          color = Color.LightGray,
          start = Offset(0f, size.height),
          end = Offset(size.width, size.height),
          strokeWidth = borderSize
        )
      }
  ) {
    Box(
      modifier = Modifier
        .padding(16.dp)
        .fillMaxHeight()
        .fillMaxWidth(0.6f)
    ) {
      Text(
        text = displayName,
        fontSize = 8.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Black
      )
    }

    Column(
      modifier = Modifier
        .padding(16.dp)
        .fillMaxHeight()
        .fillMaxWidth()
    ) {
      Text(
        text = "$price $measureUnit",
        fontSize = 8.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Black
      )
      Text(
        text = "$validFrom",
        fontSize = 8.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Gray
      )
    }
  }

}

@Preview
@Composable
fun ResourcePriceFieldPreview() {
  RKEviewTheme {
    ResourcePriceField(
      displayName = "Benzin-95",
      measureUnit = "den./l",
      price = 100.0,
      validFrom = Date(2022-1900, 0, 1)
    )
  }
}