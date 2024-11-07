package com.example.pr17Rusheshnikova22101.pr17

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.pr17Rusheshnikova22101.R
import com.example.pr17Rusheshnikova22101.Screen
import kotlinx.coroutines.delay

@Composable
fun signin1(navController: NavHostController) {
    var isLoading by remember { mutableStateOf(true) }
    // Запуск корутины для имитации загрузки данных
    LaunchedEffect(Unit) {
        delay(3000) // Имитация задержки загрузки данных
        isLoading = false
    }

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        if (isLoading) {
            // Отображение изображения загрузки
            Image(
                painter = painterResource(id = R.drawable.launchscreen),
                contentDescription = "Loading",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.FillBounds
            )
        } else {
            // Отображение основного контента после загрузки
           LoginUI(navController = navController)
        }
    }
}

@Composable
fun LoginUI(navController: NavController ) {
    var password by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    val context = LocalContext.current

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.signin),
                contentDescription = "Background",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.FillBounds
            )
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
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
                        .padding(bottom = 10.dp, top = 253.dp, start = 20.dp, end = 20.dp),
                    shape = RoundedCornerShape(22.dp)

                )

                OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    label = {
                        Text(
                            text = "● ● ● ● ● ●",
                            style = TextStyle(
                                color = colorResource(id = R.color.black)
                            )
                        )
                    },
                    shape = RoundedCornerShape(22.dp),
                    leadingIcon = {
                        Icon(
                            painter = painterResource(R.drawable.icons8_______),
                            contentDescription = "password"
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp, top = 10.dp, start = 20.dp, end = 20.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
                )

                TextButton(
                    onClick = {
                       navController.navigate(route = Screen.signup.route)
                    },
                    modifier = Modifier.padding(start = 115.dp, end = 115.dp, top = 38.dp, bottom = 22.dp),
                    colors = ButtonDefaults.textButtonColors(
                        contentColor = colorResource(id = R.color.black)
                    )
                ) {
                    Text("Forgot Password?")
                }
                Button(
                    onClick = {
                  //     logged(email, password, context, navController)\
                        navController.navigate(Screen.MainActivity.route)
                      //  navController.navigate(route = Screen.google.route)
                    },
                    modifier = Modifier.padding(bottom = 10.dp,
                        top = 22.dp,
                        start = 20.dp,
                        end=20.dp).
                    width(371.dp).
                    height(57.dp),
                    shape = RoundedCornerShape(28.dp),

                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorResource(R.color.Кнопка),
                        contentColor = Color.White
                    )

                ) {
                    Text(
                    text = "Login",
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        color = colorResource(id = R.color.black)
                    )
                ) }


                TextButton(
                    onClick = {
                      //  navController.navigate(route = Screen.signup.route)
                  navController.navigate(route = Screen.signup.route)
                    },
                    modifier = Modifier.padding(start = 95.dp, top = 40.dp, bottom = 39.dp, end = 95.dp),
                    colors = ButtonDefaults.textButtonColors(
                        contentColor = colorResource(id = R.color.black)
                    )
                ) {
                    Text("Create A New Account?")
                }
            }
        }
    }
}
private fun logged(email: String, password: String, context: Context, navController: NavController) {
    if (email == "bti" && password == "123") {
        Toast.makeText(context, "Logged in successfully", Toast.LENGTH_SHORT).show()
        navController.navigate(Screen.MainActivity.route)
    } else {
        Toast.makeText(context, "Logged in failed", Toast.LENGTH_SHORT).show()
    }
}