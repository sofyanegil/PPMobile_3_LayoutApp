package id.ac.unpas.layoutapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import id.ac.unpas.layoutapp.ui.theme.LayoutAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LayoutAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Row() {
        Column(
            modifier = Modifier
                .width(50.dp).clickable { Log.i("Layout App","Icon Click") }
        ) {
            Image(
                imageVector = Icons.Default.Person,
                contentDescription = null,
                modifier = Modifier.height(100.dp),
                colorFilter = ColorFilter.tint(color = Color.Red)
            )
        }

        Column(modifier = Modifier.width(200.dp).clickable { Log.i("Layout App","Hello Click") }) {
            Text(text = "Hello $name!")
            Text(text = "Welcome to Unpas")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LayoutAppTheme {
        Greeting("Android")
    }
}