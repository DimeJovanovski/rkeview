package mk.rkeview.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
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
  validFrom: String
) {
  Row(
    modifier = Modifier
      .height(100.dp)
      .clip(shape = RoundedCornerShape(8.dp))
      .background(MaterialTheme.colors.primary)
  ) {
    Box(
      modifier = Modifier
        .padding(14.dp)
        .fillMaxHeight()
        .fillMaxWidth(0.55f)
    ) {
      Text(
        text = displayName,
        fontSize = 12.sp,
        fontWeight = FontWeight.Bold,
        color = MaterialTheme.colors.onPrimary,
        style = TextStyle(
          lineHeight = 14.sp
        ),
        modifier = Modifier.fillMaxSize()
      )
    }

    Column(
      modifier = Modifier
        .padding(top = 16.dp, bottom = 16.dp, end = 16.dp)
        .fillMaxHeight()
        .fillMaxWidth(),
      horizontalAlignment = Alignment.End
    ) {
      Text(
        text = "$price $measureUnit",
        fontSize = 12.sp,
        fontWeight = FontWeight.Bold,
        color = MaterialTheme.colors.onPrimary,
        style = TextStyle(lineHeight = 14.sp),
        modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.End
      )

      Spacer(
        modifier = Modifier.size(16.dp)
      )

      Text(
        text = "$validFrom",
        fontSize = 12.sp,
        fontWeight = FontWeight.Bold,
        color = MaterialTheme.colors.onPrimary,
        style = TextStyle(lineHeight = 14.sp),
        modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.End
      )
    }
  }

}

@Preview
@Composable
fun ResourcePriceFieldPreview() {
  RKEviewTheme {
    ResourcePriceField(
      displayName = "СНАБДУВАЊЕ СО ТОПЛИНА ЕСМ СНАБДУВАЊЕ СО ТОПЛИНА ДООЕЛ ОСТАНАТИ Ангажирана топлинска моќност на ниво на мерно место",
      measureUnit = "ден/kW/година",
      price = 4559.598,
      validFrom = "20.01.2022"
    )
  }
}