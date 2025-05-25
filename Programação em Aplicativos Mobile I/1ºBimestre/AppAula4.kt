package com.example.appaula

import android.os.Bundle
import android.renderscript.ScriptGroup.Input
import android.text.InputType
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
                    AppAula(

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
                .padding(50.dp),
            Arrangement.Center
        ){
            Text("App Login:")
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(10.dp),
            Arrangement.Center
        ){
            TextField(
                value = "Usuário",
                onValueChange = {}
            )
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(30.dp),
            Arrangement.Center
        ){
            TextField(
            value = "Senha",
            onValueChange = {}
            )
        }

        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ){
            Button(
                onClick = {},
            ){
                Text("Cadastrar")
            }
        }
    }
}

@Preview
@Composable
fun AppAulaPreview() {
    AppAulaTheme {
        AppAula()
    }
}