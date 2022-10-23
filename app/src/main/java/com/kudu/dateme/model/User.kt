package com.kudu.dateme.model

data class User(
    val id: String,
    val userName: String,
    val firstName: String,
    val lastName: String,
    val age: Int = 0,
    val birthday: String,
    val location: String,
    val profileImage: String,
    val userPhotos: String,
)
