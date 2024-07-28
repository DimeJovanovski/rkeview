package mk.rkeview.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Switch
import androidx.compose.material.SwitchDefaults
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import mk.rkeview.resourceComponents.ResourceType
import mk.rkeview.theme.RKEviewTheme

@Composable
fun ResourceTypeNotificationToggleField(
    resourceType: ResourceType
) {
    Row(
        modifier = Modifier
            .height(60.dp)
            .clip(shape = RoundedCornerShape(8.dp))
            .background(MaterialTheme.colors.primary)
            .padding(14.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = resourceType.displayName,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colors.onPrimary,
            style = TextStyle(
                lineHeight = 14.sp
            ),
            modifier = Modifier.weight(1f)
        )

        var checked by remember { mutableStateOf(false) }
        Switch(
            checked = checked,
            onCheckedChange = {
                checked = it
            },
            colors = SwitchDefaults.colors(
                checkedThumbColor = Color(0xFF67036).copy(alpha = 1f),
                checkedTrackColor = Color(0xFbf592c),
                uncheckedThumbColor = Color.White,
                uncheckedTrackColor = Color.LightGray,
            ),
        )
    }
}


@Preview
@Composable
fun ResourceTypeNotificationToggleFieldPreview() {
    RKEviewTheme {
        ResourceTypeNotificationToggleField(
            resourceType = ResourceType.ELECTRIC_ENERGY
        )
    }
}