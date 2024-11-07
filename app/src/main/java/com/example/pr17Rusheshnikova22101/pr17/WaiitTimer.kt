package com.example.pr17Rusheshnikova22101.pr17

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.pr17Rusheshnikova22101.R
import com.example.pr17Rusheshnikova22101.Screen
import kotlinx.coroutines.delay

@Composable
fun WaitTimer(navController: NavController){

    Box(modifier = Modifier.fillMaxSize())
    {
        Image(
            painter = painterResource(id = R.drawable.pon2w),
            modifier = Modifier.fillMaxSize(),
            contentDescription = "фон",
            contentScale = ContentScale.FillBounds
        )

    Column(
    ) {
        Row(
            modifier = Modifier.
            fillMaxWidth().
            height(70.dp).
            background(colorResource(R.color.фон1)).
            padding(top = 13.dp, end = 243.dp)
        )
        {

            Text(
                "Wait timer",
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(start = 54.dp, top = 11.dp)
            )
        }
    }
        var timeLeft by remember { mutableStateOf(15 * 60 * 1000L) } // 15 минут в миллисекундах
        var showThankYou by remember { mutableStateOf(false) }
        var isRunning by remember { mutableStateOf(true) }

        LaunchedEffect(timeLeft, isRunning) {
            while (timeLeft > 0 && isRunning) {
                delay(10L)
                timeLeft -= 10L
            }
            if (timeLeft <= 0) {
                showThankYou = true
            }
        }

        if (showThankYou) {
            navController.navigate(Screen.DriverTimerEnd.route)
            showThankYou=false
        } else {

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier =Modifier.fillMaxSize()
            ) {
                val minutes = (timeLeft / 60000).toInt()
                val seconds = ((timeLeft % 60000) / 1000).toInt()
                val milliseconds = (timeLeft % 1000).toInt()

                Text(
                    text = String.format("%02d:%02d:%03d", minutes, seconds, milliseconds),
                    fontSize = 36.sp
                )
                Spacer(modifier = Modifier.height(16.dp))
            }
                Column (
                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier =Modifier.fillMaxSize(),

                ){
                Button(

                    onClick = { isRunning = false },
                    modifier = Modifier.padding(top = 196.dp).height(57.dp).width(300.dp)

                ) {
                    Text(text = "Stop Timer")
                }
                Button(

                    onClick = {
                        navController.navigate(route = Screen.google.route)
                    },
                    modifier = Modifier.padding(top = 30.dp, bottom = 36.dp).width(300.dp).height(57.dp),

                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorResource(R.color.jf),
                        contentColor = Color.White
                    )
                ) {
                    Text(text = "Cansel")
                }

            }

        }
    }


}

