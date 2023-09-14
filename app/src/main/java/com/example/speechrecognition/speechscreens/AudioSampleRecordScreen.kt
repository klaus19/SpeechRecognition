package com.example.speechrecognition.speechscreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun AudioSampleRecordScreen() {

    Column(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(start = 16.dp, top = 19.dp) // Add padding to start (left)
        ) {
            Text(
                text = "How to record",
                style = TextStyle(
                    fontSize = 32.sp,
                    lineHeight = 40.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight(700),
                    color = Color(0xFF000000)
                ),
                modifier = Modifier
                    .padding(top = 10.dp, start = 24.dp, end = 53.dp)
                    .fillMaxWidth()
                    .wrapContentHeight()

            )
        }
        Box(modifier = Modifier.fillMaxSize()) {
            Box {
                Image(
                    painter = painterResource(id =0),
                    contentDescription = null,
                    contentScale = ContentScale.None
                )
                Text(
                    text = "You know,Ozma's birthday is next month,and i've been wondering what I can give her as a birthday present.She's so good to us all that we certainly ought to remember her birthday.",
                    style = TextStyle(
                        fontSize = 20.sp,
                        lineHeight = 28.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight(700),
                        color = Color(0xFFFFFFFF)
                    ),
                    modifier = Modifier
                        .padding(1.dp)
                        .width(8.dp)
                        .height(28.dp)
                        .align(Alignment.Center)
                )
            }
        }



    }
}