package com.example.uts.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


@Composable
fun MenuFooter(navController: NavHostController) {
    Row(
        verticalAlignment = Alignment.Bottom,
        modifier = Modifier.fillMaxWidth(),
    ) {
        Button(
            onClick = { navController.navigate("home") },
            modifier = Modifier.weight(1f),
            shape = RectangleShape
        ) {
            Text(text = "Home", fontSize = 18.sp)
        }
        Button(
            onClick = { navController.navigate("berita") },
            modifier = Modifier.weight(1f),
            shape = RectangleShape
        ) {
            Text(text = "Berita", fontSize = 18.sp)
        }
        Button(
            onClick = { navController.navigate("profile") },
            modifier = Modifier.weight(1f),
            shape = RectangleShape
        ) {
            Text(text = "Profile", fontSize = 18.sp)
        }
    }
}