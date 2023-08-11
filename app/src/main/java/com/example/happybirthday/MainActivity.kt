package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    GreetingImage()
//                    ComposableText()
//                    TaskManager()
//                    ComposeQuadrant()
                }
            }
        }
    }
}

@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.android_logo)
    Column(
        modifier = Modifier
            .fillMaxSize().background(color = Color(color = 0xff9cd996)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = image, contentDescription = "logo",
                modifier = modifier
                    .background(color = Color(0xFF030436))
                    .width(100.dp).height(100.dp)
            )
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "Dominikus Adhitya",
                    fontSize = 30.sp,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Serif,
                    color = Color(0xFF0b3b0b)
                )
                Text(
                    text = "Android Masterpiece",
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Serif,
                    color = Color(0xFF0b3b0b)
                )
            }
        }
        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 50.dp),
        ) {
            ContactInfo(
                icon = Icons.Filled.Phone,
                info = "+89199191919",
            )
            ContactInfo(
                icon = Icons.Filled.Share,
                info = "@dah"
            )
            ContactInfo(
                icon = Icons.Filled.Email,
                info = "john.doe@email.com"
            )
        }
    }
}

@Composable
fun ContactInfo(modifier: Modifier = Modifier, icon: ImageVector, info: String) {
    Row() {
        Icon(
            imageVector = icon,
            contentDescription = "phoneIcon",
            tint = Color(0xFF0b3b0b),
            modifier = modifier.padding(horizontal = 20.dp)
        )
        Text(
            text = info,
            color = Color(0xFF0b3b0b),
            fontWeight = FontWeight.W500
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        BusinessCard()
//        ComposeQuadrant()
//        TaskManager()
//        ComposableText()
//        GreetingImage()
    }
}