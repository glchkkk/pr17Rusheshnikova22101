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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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

@Composable
fun Settig(navController: NavController) {

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
            IconButton(
                onClick = {},
            ) {
                Image(
                    painter = painterResource(R.drawable.setting_fbx632naln18),
                    contentDescription = "D",
                    modifier = Modifier.size(16.dp)
                )
            }
            Text(
                "Setting",
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(start = 7.dp, top = 13.dp)
            )
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
        ) {
            Text(
                textAlign = TextAlign.Center,
                text = "Ivanov Ivan",
                fontSize = 36.sp
            )
            Row(
                modifier = Modifier.padding(top = 8.dp, start = 90.dp)
            ) {
                Text(
                    text = "15 hours",
                    modifier = Modifier.weight(1f)
                )
                Text(
                    text = "$1520",
                    modifier = Modifier.weight(1f)
                )
            }
            Row(
                modifier = Modifier.padding(top = 8.dp,start=90.dp)
            ) {
                Text(
                    text = "Drive",
                    modifier = Modifier.weight(1f)
                )
                Text(
                    text = "paid",
                    modifier = Modifier.weight(1f)
                )
            }
            Text(
                textAlign = TextAlign.Center,
                text = "E-mail: ivanov@gmail.com",
                modifier = Modifier.padding(top = 87.dp)
            )
            Button(
                onClick = {   navController.navigate(route = Screen.LoginUI.route)},
                modifier = Modifier
                    .padding(top = 32.dp)
                    .fillMaxWidth().height(57.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(R.color.Кнопка),
                    contentColor = Color.White
                )
            ) {
                Text(text = "Exit")
            }
        }
    }
}
