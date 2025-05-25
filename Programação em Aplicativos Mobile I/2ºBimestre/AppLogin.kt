package com.example.appaula7

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appaula7.ui.theme.AppAula7Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppAula7Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AppAula7(
                    )
                }
            }
        }
    }
}

@Composable
fun AppAula7() {
    var user by remember { mutableStateOf(value = "") }
    var password by remember { mutableStateOf(value = "") }

    val gradient = Brush.verticalGradient(
        colors = listOf(Color(color = 0xFF2196F3), Color(0xFF197602))
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = gradient),
        contentAlignment = Alignment.Center
    ){
        Card(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(fraction = 0.9f)
                .wrapContentHeight(),
            shape = RoundedCornerShape(24.dp),
            elevation = CardDefaults.cardElevation(12.dp)
        ){
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(24.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = "Logo",
                    modifier = Modifier
                        .height(80.dp)
                        .padding(bottom = 16.dp)
                )

                Text(
                    text = "App Login",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(color = 0xFF197602)
                )

                Spacer(modifier = Modifier.height(12.dp))

                OutlinedTextField(
                    value = user,
                    onValueChange = { user = it },
                    label = { Text(text = "Usuário") }
                )

                Spacer(modifier = Modifier.height(12.dp))

                OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    label = {Text(text = "Senha")},
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(20.dp))

                Button(
                    onClick = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(color = 0xFF197602),
                        contentColor = Color.White
                    ),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text(text = "Logar", fontSize = 16.sp)
                }

                Spacer(modifier = Modifier.height(12.dp))

                TextButton(
                    onClick = {}
                ) {
                    Text(
                        text = "Esqueceu a senha?",
                        color = Color(color = 0xFF197602),
                        fontSize = 14.sp
                    )
                }

            }
        }
    }
}

@Preview
@Composable
fun AppAula7Preview() {
        AppAula7()
}