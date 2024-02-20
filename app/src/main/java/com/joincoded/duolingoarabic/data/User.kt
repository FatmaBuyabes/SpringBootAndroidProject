package com.joincoded.duolingoarabic.data

data class User(
    var username: String,
    var password: String,
    var name: String?,
    var email: String?,
    var token: String?
) {
    constructor (username: String, password: String) : this(username, password, "", "", null)
}
