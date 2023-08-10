package com.example.happybirthday

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ComposableText(modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Column {
        Image(
            painter = image,
            contentDescription = null,
            modifier = modifier
        )
        Text(
            text = stringResource(R.string.composable_text_one),
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = stringResource(R.string.composable_text_two),
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = stringResource(R.string.composable_text_three),
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}