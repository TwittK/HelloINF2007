package com.example.helloinf2007

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.helloinf2007.ui.theme.HelloINF2007Theme
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloINF2007Theme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Column {
                        Greeting("INF2007")
                        From("TwittyK")
                    }
                }
            }
        }

        Log.d("MainActivity", "OnCreate function is initiated at $formattedDateTime")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HelloINF2007Theme {
        Greeting("Android")
    }
}

@Composable
fun From(name: String, modifier: Modifier = Modifier){
    Text(
        text = "From $name!",
        modifier = modifier
    )
}

val currentDateTime = LocalDateTime.now()

val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")

val formattedDateTime = currentDateTime.format(formatter)

