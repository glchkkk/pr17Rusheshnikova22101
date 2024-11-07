package com.example.pr17Rusheshnikova22101.pr17

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pr17Rusheshnikova22101.R

@Preview
@Composable
fun DriverTimeEbd() {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.pon2w),
            modifier = Modifier.fillMaxSize(),
            contentDescription = "фон",
            contentScale = ContentScale.FillBounds
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
                .background(colorResource(R.color.фон1))
                .padding(top = 13.dp, end = 243.dp)
        ) {
            Text(
                "Wait timer",
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(start = 54.dp, top = 11.dp)
            )
        }

        var showCard by remember { mutableStateOf(true) }

        if (showCard) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Card(
                    modifier = Modifier
                        .size(width = 263.dp, height = 263.dp)
                        .padding(8.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = colorResource(R.color.Кнопка), // Card background color
                    ),
                    shape = RoundedCornerShape(25.dp),
                ) {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        Text(
                            modifier = Modifier.padding(start = 70.dp, top = 119.dp),
                            text = "Thank you!",
                            fontSize = 25.sp,
                            color = Color.White
                        )
                        TextButton(
                            modifier = Modifier.padding(start = 180.dp, top = 50.dp),
                            onClick = {
                                showCard = false
                            }
                        ) {
                            Text(
                                "Ok",
                                color = Color.White,
                                fontSize = 25.sp,
                            )
                        }
                    }
                }
            }
        }
    }
}