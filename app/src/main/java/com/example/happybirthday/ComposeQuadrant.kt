package com.example.happybirthday

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp


@Composable
fun ComposeQuadrant(modifier: Modifier = Modifier) {
    Row(Modifier.fillMaxWidth()) {
        Column(Modifier.weight(1f)) {
            ComposeQuadrantPiece(
                color = Color(0xFFEADDFF),
                title = stringResource(R.string.title_compose_1),
                content = stringResource(R.string.desc_compose_1),
                modifier = modifier.weight(1f)
            )
            ComposeQuadrantPiece(
                color = Color(0xFFB69DF8),
                title = stringResource(R.string.title_compose_2),
                content = stringResource(R.string.desc_compose_2),
                modifier = modifier.weight(1f)
            )
        }
        Column(Modifier.weight(1f)) {
            ComposeQuadrantPiece(
                color = Color(0xFFD0BCFF),
                title = stringResource(R.string.title_compose_3),
                content = stringResource(R.string.desc_compose_3),
                modifier = Modifier.weight(1f)
            )
            ComposeQuadrantPiece(
                color = Color(0xFFF6EDFF),
                title = stringResource(R.string.title_compose_4),
                content = stringResource(R.string.desc_compose_4),
                modifier = Modifier.weight(1f)
            )
        }
    }
}
@Composable
fun ComposeQuadrantPiece(
    title: String,
    content: String,
    color: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier
            .background(color = color)
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = content,
            textAlign = TextAlign.Justify
        )
    }
}