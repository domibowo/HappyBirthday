package com.example.happybirthday

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TaskManager(modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.ic_task_completed)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = image,
            contentDescription = "checklist",
            modifier = modifier
        )
        Text(
            text = "All tasks completed",
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Nice work!",
            textAlign = TextAlign.Center,
            fontSize = 16.sp
        )
    }
}