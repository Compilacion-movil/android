package com.compilacionmovil.ejemplotopappbar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.compilacionmovil.ejemplotopappbar.ui.theme.CustomTopAppBar
import com.compilacionmovil.ejemplotopappbar.ui.theme.EjemploTopAppBarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EjemploTopAppBarTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {

    Column {
        CustomTopAppBar()
        Text(text = "Hello $name!")
    }

}




@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    EjemploTopAppBarTheme {
        Greeting("Android")
    }
}