package com.example.experiment

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTransformGestures
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.math.absoluteValue

@Composable
fun SpeechScreen4() {
    var offsetX by remember { mutableStateOf(0f) }
    val swipeThreshold = 200 // Adjust this threshold as needed

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 69.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(start = 21.dp, top = 13.dp, end = 25.dp)
                .pointerInput(Unit) {
                    detectTransformGestures { _, offset, _, _ ->
                        offsetX += offset.x
                        if (offsetX.absoluteValue >= swipeThreshold) {
                            if (offsetX > 0) {
                                // navController.navigate(Destinations.speechscreen2)
                            }
                            offsetX = 0f
                        }
                    }
                }
        ) {
            Text(
                text = "Please say the following letter four times A...A...A...A"
                ,
                style = TextStyle(
                    fontSize = 20.sp,
                    lineHeight = 28.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight(400),
                    color = Color(0xFF000000)
                ),
                modifier = Modifier
                    .height(28.dp)
                    .fillMaxWidth()
            )
            Text(
                text ="Please say the following letter four times E...E...E...E"
                ,
                style = TextStyle(
                    fontSize = 20.sp,
                    lineHeight = 28.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight(400),
                    color = Color(0xFF000000)
                ),
                modifier = Modifier
                    .height(28.dp)
                    .fillMaxWidth()
            )
        }
    }



    Row(
        modifier = Modifier
            .padding(start = 21.dp, end = 6.dp, top = 630.dp)
            .fillMaxWidth()
            .absolutePadding(bottom = 100.dp)
    ) {
        Row(
            modifier = Modifier
                .width(77.dp)
                .height(7.dp)
                .background(color = Color(0xFF686868))
                .padding(top = 26.dp)
        ) {
        }
        Spacer(modifier = Modifier.width(5.dp))
        Row(
            modifier = Modifier
                .width(77.dp)
                .height(7.dp)
                .background(color = Color(0xFF686868))
                .padding(top = 26.dp)
        ) {
        }
        Spacer(modifier = Modifier.width(5.dp))
        Row(
            modifier = Modifier
                .width(77.dp)
                .height(7.dp)
                .background(color = Color(0xFF686868))
                .padding(top = 26.dp)
        ) {
        }
        Spacer(modifier = Modifier.width(5.dp))
        Row(
            modifier = Modifier
                .width(77.dp)
                .height(7.dp)
                .background(color = Color(0xFF686868))
                .padding(top = 26.dp)
        ) {
        }
    }

}

