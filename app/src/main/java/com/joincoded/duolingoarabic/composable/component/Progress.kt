package com.joincoded.duolingoarabic.composable.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.joincoded.duolingoarabic.viewModel.AuthAccountViewModel
import com.joincoded.duolingoarabic.viewModel.GameViewModel


@Composable
fun Progress(viewModel: GameViewModel, authViewModel: AuthAccountViewModel) {
    //move this current progress to view model
    var currentProgress by remember { mutableStateOf(0.5f) }
    LinearProgressIndicator(
        progress = currentProgress,
        modifier = Modifier
            .fillMaxWidth()
            .height(45.dp),
    )
}

