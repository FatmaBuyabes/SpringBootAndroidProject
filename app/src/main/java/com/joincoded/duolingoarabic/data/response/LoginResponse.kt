package com.joincoded.duolingoarabic.data.response

import androidx.compose.ui.semantics.Role

data class LoginResponse(val id: Int, val username: String, val role: String,val token: String)