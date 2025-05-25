package com.example.appaula

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appaula.ui.theme.AppAulaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppAulaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AppAula()
                }
            }
        }
    }
}

@Composable
fun AppAula(){
    Column(
        Modifier
            .fillMaxWidth()
    ) {


        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        )

        {
            Text("Texto de Exemplo")
        }
        Row(
            Modifier
                .padding(5.dp)
        )

        {

        }

        Row(

        )

        {
            Text("Linha 2")
        }

        Row(
            Modifier
                .padding(5.dp)
        )

        {

        }

        Row (

        )

        {
            Text("Linha 3")
        }

    }
}

@Preview

@Composable
fun AppAulaPreview() {
    AppAulaTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            AppAula()
        }
    }
}