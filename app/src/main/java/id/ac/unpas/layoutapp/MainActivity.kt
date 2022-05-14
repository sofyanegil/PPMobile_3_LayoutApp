package id.ac.unpas.layoutapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
    Scaffold(
        topBar = {
            Text(text = "P3-Layout App")
        },
        bottomBar = {
            Text(text = "Bottom Bar")
        },
        drawerContent = {
            Column() {
                Text(text = "Drawer Content 1")
                Text(text = "Drawer Content 2")
                Text(text = "Drawer Content 3")
            }
        },
        floatingActionButton = {
            Button(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.Home, contentDescription = "Add")
            }
        }

    ) {
        
        BoxWithConstraints() {
            if(maxWidth < 400.dp){
               Text(text = "Widht < 400dp")
            } else{
                Text(text = "Width > 400dp")
            }
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