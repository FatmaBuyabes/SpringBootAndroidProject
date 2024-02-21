package com.joincoded.duolingoarabic.data

data class User(
    var username: String,
    var password: String,
    var name: String? = null,
    var email: String? =null,
    var token: String? = null,
    var id: Int? = null
)

