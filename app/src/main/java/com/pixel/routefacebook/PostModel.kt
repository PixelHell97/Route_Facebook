package com.pixel.routefacebook

data class PostModel(
    val userProfilePic: Int,
    val name: String,
    val time: String,
    val postCaption: String,
    val postPic: Int,
    val likes: Int,
    val comments: Int,
    val share: Int
)
