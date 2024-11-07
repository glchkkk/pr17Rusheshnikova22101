package com.example.pr17Rusheshnikova22101.pr17

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.navigation.NavController
import com.example.pr17Rusheshnikova22101.R
import com.example.pr17Rusheshnikova22101.Screen

@Composable
fun Signiup1(navController: NavController) {
    var password by remember { mutableStateOf("") }
    var messag by remember { mutableStateOf("") }
    var messag1 by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.signin),
                modifier = Modifier.fillMaxSize(),
                contentDescription = "фон",
                contentScale = ContentScale.FillBounds
            )

            Column(
                modifier = Modifier.fillMaxSize(),
            ) {
                OutlinedTextField(
                    value = email,
                    onValueChange = { email = it },
                    label = {
                        Text(
                            text = "login",
                            style = TextStyle(
                                color = colorResource(id = R.color.black)
                            )
                        )
                    },
                    leadingIcon = {
                        Icon(Icons.Default.Person, contentDescription = "person")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 13.dp, top = 253.dp, start = 20.dp, end = 20.dp)
                        .clip(RoundedCornerShape(22.dp)),
                    shape = RoundedCornerShape(22.dp)

                )

                OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    label = {
                        Text(
                            text = "login@mail.ru",
                            style = TextStyle(
                                color = colorResource(id = R.color.black)
                            )
                        )
                    },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(R.drawable.icons8_______),
                            contentDescription = "password"
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 13.dp,
                            bottom = 13.dp,
                            start = 20.dp,
                            end = 20.dp),
                    shape = RoundedCornerShape(22.dp),

                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
                )

                OutlinedTextField(
                    value = messag,
                    onValueChange = { messag = it },
                    label = {
                        Text(
                            text = "● ● ● ● ● ●",
                            style = TextStyle(
                                color = colorResource(id = R.color.black)
                            )
                        )
                    },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(R.drawable.icons8_______),
                            contentDescription = "messag"
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 13.dp, start = 20.dp, end = 20.dp),
                    shape = RoundedCornerShape(22.dp)

                )

                OutlinedTextField(
                    value = messag1,
                    onValueChange = { messag1 = it },
                    label = {
                        Text(
                            text = "● ● ● ● ● ●",
                            style = TextStyle(
                                color = colorResource(id = R.color.black)
                            )
                        )
                    },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(R.drawable.icons8_______),
                            contentDescription = "messag1"
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 20.dp, end = 20.dp, top = 13.dp),
                    shape = RoundedCornerShape(22.dp)

                )

                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 20.dp, end = 20.dp, top = 25.dp).width(321.dp).height(57.dp),
                    onClick = {
                        navController.navigate(Screen.MainActivity.route)
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorResource(id = R.color.Кнопка) // Цвет фона кнопки
                    )
                ) {
                    Text("SignIn")
                }
            }
        }
    }
}