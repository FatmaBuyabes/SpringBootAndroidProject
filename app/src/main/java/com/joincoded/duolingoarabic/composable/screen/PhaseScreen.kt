package com.joincoded.duolingoarabic.composable.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.unit.dp
import com.joincoded.duolingoarabic.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PhaseScreen() {

    TopAppBar(
        title = { },
        navigationIcon = {
            IconButton(onClick = { }) {
                Icon(Icons.Default.ArrowBack, contentDescription = "Back")
            }
        },
    )

    Spacer(
        modifier = Modifier
            .height(45.dp)
    )

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.phase1),
            contentDescription = "Image",
            modifier = Modifier.clickable {/* img */ }
                .size(300.dp)
        )
        Spacer(
            modifier = Modifier
                .height(25.dp)
        )


        Image(
            painter = painterResource(id = R.drawable.phase2),
            contentDescription = "Image",
            modifier = Modifier.clickable {/* img */ }
                .size(300.dp)
        )
        Spacer(
            modifier = Modifier
                .height(25.dp)
        )


        Image(
            painter = painterResource(id = R.drawable.phase3),
            contentDescription = "Image",
            modifier = Modifier.clickable {/* img */ }
                .size(800.dp)
        )
        Spacer(
            modifier = Modifier
                .height(25.dp)
        )
    }

}