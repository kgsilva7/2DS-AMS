package com.example.appaula5

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
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.text.input.PartialGapBuffer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appaula5.ui.theme.AppAula5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppAula5Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AppAula5(
                    )
                }
            }
        }
    }
}

@Composable
fun AppAula() {
    Column(
        Modifier
            .fillMaxSize()
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(30.dp),
            Arrangement.Start,
        ) {
            Text("App Exemplo")
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(25.dp),
            Arrangement.Center
        ) {
            TextField(
                value = "Nome",
                onValueChange = {}
            )
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(25.dp),
            Arrangement.Center
        ) {
            TextField(
                value = "Endereço",
                onValueChange = {}
            )
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(25.dp),
            Arrangement.Center
        ) {
            TextField(
                value = "Bairro",
                onValueChange = {}
            )
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(25.dp),
            Arrangement.Center
        ) {
            TextField(
                value = "CEP",
                onValueChange = {}
            )
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(25.dp),
            Arrangement.Center
        ) {
            TextField(
                value = "Cidade",
                onValueChange = {}
            )
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(25.dp),
            Arrangement.Center
        ) {
            TextField(
                value = "Estado",
                onValueChange = {}
            )
        }
        Column(
            Modifier
                .fillMaxSize()
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(30.dp),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Button(
                    onClick = {},
                ) {
                    Text("Cadastrar")
                }
                Button(
                    onClick = {},
                ) {
                    Text("Cancelar")
                }
            }
        }
    }
}

@Preview
@Composable
fun AppAula5() {
    AppAula5Theme {
        AppAula()
    }
}