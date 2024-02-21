package com.joincoded.duolingoarabic.composable.screen

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton

import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopB() {


    TopAppBar(
        title = { },
        navigationIcon = {
            IconButton(onClick = {  }) {
                Icon(Icons.Default.ArrowBack, contentDescription = "Back")
            }
        },
    )


}