package com.example.pr17Rusheshnikova22101.pr17

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.pr17Rusheshnikova22101.R


@Composable
fun History( ) {
    Column(
        modifier = Modifier.fillMaxSize().background(color =Color.White)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().height(70.dp).background(colorResource(R.color.фон1)).padding(top = 13.dp, end = 243.dp)
        )
        {
            IconButton(
                onClick = {},
            ) {
                Image(
                    painter = painterResource(R.drawable.history_eme2taqywdcb),
                    contentDescription = "D",
                    modifier = Modifier.size(16.dp)
                )
            }
            Text(
                "History",
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(start = 7.dp, top = 13.dp)
            )
        }
        Box(
            modifier = Modifier.fillMaxWidth().height(100.dp).padding(start=38.dp,top = 46.dp)

        ){
        Row(

        ) {
            Text("Kia Rio")
        }

        Row(modifier = Modifier.padding(top=19.dp)) {

            Text("15 min")

        }
            Row(horizontalArrangement = Arrangement.End,
                modifier = Modifier.padding(start = 300.dp, top = 13.dp)

            ) {

                Text("$15")

            }



        }
        Box(
            modifier = Modifier.fillMaxWidth().height(100.dp).padding(start=38.dp,top = 46.dp)

        ){
            Row(

            ) {
                Text("Kia Rio")
            }

            Row(modifier = Modifier.padding(top=19.dp)) {

                Text("10 min")

            }
            Row(horizontalArrangement = Arrangement.End,
                modifier = Modifier.padding(start = 300.dp,top=13.dp)

            ) {

                Text("$10")

            }



        }
        Box(
            modifier = Modifier.fillMaxWidth().height(100.dp).padding(start=38.dp,top = 46.dp)

        ){
            Row(

            ) {
                Text("Kia Rio")
            }

            Row(modifier = Modifier.padding(top=19.dp)) {

                Text("60 min")

            }
            Row(horizontalArrangement = Arrangement.End,
                modifier = Modifier.padding(start = 300.dp,top=13.dp)

            ) {

                Text("$50")

            }



        }

    }
}