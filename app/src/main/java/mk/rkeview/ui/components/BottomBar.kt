package mk.rkeview.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import mk.rkeview.R

/**
 * Custom bottom bar for the app for displaying the app logo.
 */
@Composable
fun BottomBar() {
  Box(
    contentAlignment = Alignment.Center,
    modifier = Modifier
      .fillMaxWidth()
      .background(MaterialTheme.colors.background)
  ) {
    Image(
      painter = painterResource(id = R.drawable.rke_logo),
      contentDescription = null,
      modifier = Modifier
        .size(64.dp)
    )
  }
}

@Preview
@Composable
fun previewBottomBar() {
  BottomBar()
}