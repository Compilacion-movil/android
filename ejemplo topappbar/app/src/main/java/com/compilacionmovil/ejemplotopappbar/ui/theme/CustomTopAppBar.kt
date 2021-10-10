package com.compilacionmovil.ejemplotopappbar.ui.theme

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.compilacionmovil.ejemplotopappbar.Greeting

@Composable
fun CustomTopAppBar() {
    TopAppBar(
        title = { Text(text = "Título") },
        backgroundColor = Color.Cyan,
        navigationIcon = {
            IconButton(onClick = { /* Do Something*/ }
            ) {
                Icon(Icons.Filled.ArrowBack, null)
            }
        },
        actions = {
            IconButton(onClick = {/* Do Something*/ }) {
                Icon(Icons.Filled.Share, null)
            }
            IconButton(onClick = {/* Do Something*/ }) {
                Icon(Icons.Filled.Settings, null)
            }
        })

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CustomTopAppBar()
}


