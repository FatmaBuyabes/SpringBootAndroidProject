package com.joincoded.duolingoarabic.viewModel

import android.app.Application
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.joincoded.duolingoarabic.data.Chapter
import com.joincoded.duolingoarabic.data.Lesson
import com.joincoded.duolingoarabic.data.Question
import com.joincoded.duolingoarabic.data.User
import com.joincoded.duolingoarabic.data.response.LoginResponse
import com.joincoded.duolingoarabic.interfaceAPI.ApplicationApiService
import com.joincoded.duolingoarabic.singelton.RetrofitHelper
import kotlinx.coroutines.launch


class AuthAccountViewModel : ViewModel() {
    private val apiService = RetrofitHelper.getInstance().create(ApplicationApiService::class.java)
    var token: LoginResponse? by mutableStateOf(null)
    var currentUser: User? by mutableStateOf(null)
    private val sharedPreferencesKey = "user_token"
    var application: Application? = null

    init {
        retrieveToken()
    }

    fun retrieveToken(): String? {
        return sharedPreferencesKey
    }

    fun signup(username: String, password: String, name: String?, email: String?) {
        viewModelScope.launch {
            try {
                val response = apiService.signup(User(username,password,name,email,null))
                if (response.isSuccessful) {

                } else {
                    // Handle unsuccessful signup response
                    println("Signup failed with code: ${response.code()}, message: ${response.message()}")
                }
            } catch (e: Exception) {
                // Handle exceptions
                println("Error during signup: $e")
            }
        }
    }

    fun login(username: String, password: String) {
        viewModelScope.launch {
            try {
                val response = apiService.login(User(username, password))
                if (response.isSuccessful) {
                    token = response.body()
                    saveToken(token?.token)
                    getAccountInfo()
                } else {
                    // Handle unsuccessful login response
                    println("Login failed with code: ${response.code()}, message: ${response.message()}")
                }
            } catch (e: Exception) {
                // Handle exceptions
                println("Error during login: $e")
            }
        }
    }

    private fun saveToken(token: String?) {

    }
    
    private fun getAccountInfo() {
        viewModelScope.launch {
            try {
                currentUser = apiService.getAccountInfo(token?.token)
                println(currentUser?.username)
            } catch (e: Exception) {
                println("Error $e")
            }
        }
    }
}
