package com.joincoded.duolingoarabic.composable.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.joincoded.duolingoarabic.R

@Composable
fun LoginScreen() {
    var name by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {


        Image(painter = painterResource(id = R.drawable.f_and_h_arabic_letters), contentDescription = "Doulingo Logo")
        Spacer(
            modifier = Modifier.height(10.dp)
        )
        TextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Name") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(
            modifier = Modifier.height(16.dp)
        )
        TextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(
            modifier = Modifier.height(16.dp)
        )
        Button(
            onClick = { /*Handle login info here*/ },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),

            ) {

            Text("Login")
        }
        Spacer(
            modifier = Modifier.height(16.dp)
        )
        Text(
            buildAnnotatedString {
                append("Don't have an account? ")
                withStyle(style = SpanStyle(textDecoration = TextDecoration.Underline)) {
                    append("Sign Up")
                }
            },
            modifier = Modifier.clickable(onClick = { /*Handle Navigation to sign up screen */ })
        )
    }
}
