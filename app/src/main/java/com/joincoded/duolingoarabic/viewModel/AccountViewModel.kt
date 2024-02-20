package com.joincoded.duolingoarabic.viewModel

import android.app.Application

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

import com.joincoded.duolingoarabic.data.User
import com.joincoded.duolingoarabic.data.response.TokenResponse
import com.joincoded.duolingoarabic.singelton.RetrofitHelper
import kotlinx.coroutines.launch

class AccountViewModel : ViewModel(){

    private val apiService = RetrofitHelper.getInstance().create(ArabicViewModel::class.java)
    var token: TokenResponse? by mutableStateOf(null)
    var currentUser: User? by mutableStateOf(null)
    private val sharedPreferencesKey = "user_token"
    var application: Application? = null
    fun signup(username: String, password: String, name: String = "", email: String = "") {
        viewModelScope.launch {
            try {
                val response = apiService.signup(User(username, password, null))
                token = response.body()
                saveToken(token?.token)
                getAccountInfo()
            } catch (e: Exception) {
                println("Error $e")
            }

        }
    }

    fun login(username: String, password: String) {
        viewModelScope.launch {
            try {
                val response = apiService.login(User(username, password))
                println(response.code())
                println(response.message())
                println(response.body())
                token = response.body()
                saveToken(token?.token)
                getAccountInfo()
            } catch (e: Exception) {
                println("Error $e")
            }
        }
    }


    fun getAccountInfo() {
        viewModelScope.launch {
            try {
                currentUser = apiService.getAccountInfo(token?.getBearerToken())
                println(currentUser?.username)
            } catch (e: Exception) {
                println("Error $e")
            }
        }
    }
}