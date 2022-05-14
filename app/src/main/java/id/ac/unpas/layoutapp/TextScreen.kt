package id.ac.unpas.layoutapp

import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun TextLeft(name: String) {
    Text(text = "Hello $name! 1")
    Text(text = "Hello $name! 2")
}

@Composable
fun TextRight(name: String) {
    Text(text = "Hello $name! 3")
    Text(text = "Hello $name! 4")
}