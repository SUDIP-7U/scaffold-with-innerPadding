package com.example.problem4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.problem4.ui.theme.Problem4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}



//this is safe scaffold with innerPadding -->
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SimpleScaffoldDemo() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Station Master") }
            )
        },
        bottomBar = {
            BottomAppBar {
                Text("Platform Info", modifier = Modifier.padding(8.dp))
            }
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /* action */ }) {
                Text("+")
            }
        }
    ) { innerPadding ->
        // Main content area
        Text(
            text = "Welcome to Platform 3!",
            modifier = Modifier.padding(innerPadding).padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SimpleScaffoldDemo()
}