package com.example.uts.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.uts.R
import com.example.uts.utils.PreferencesManager

private const val correctEmail: String = "abc"
private const val correctPassword: String = "abc"

@Composable
fun LoginScreen(navController: NavHostController) {
    val context = navController.context
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var errorMessage by remember { mutableStateOf<String?>(null) }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = null,
            modifier = Modifier.width(50.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        TextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        TextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {
                if (email == correctEmail && password == correctPassword) {
                    PreferencesManager.setLoggedIn(context, true)
                    PreferencesManager.setUserData(
                        context,
                        "muhammad.reza.harsono.tik22@mhsw.pnj.ac.id",
                        "2207411033",
                        "Muhammad Reza Harsono",
                        "TI-4B"
                    )
                    navController.navigate("home")
                } else {
                    errorMessage = "Incorrect Email or Password"
                }
            },
            shape = RoundedCornerShape(4.dp),
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
        ) {
            Text(text = "Login", fontSize = 18.sp)
        }
        errorMessage?.let { message ->
            Text(
                text = message,
                color = Color.Red,
                modifier = Modifier.padding(top = 8.dp)
            )
        }
    }
}