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
) {
    constructor(
        userProfilePic: Int,
        name: String,
        time: String,
        postCaption: String,
        likes: Int,
        comments: Int,
        share: Int
    ) : this(
        userProfilePic = userProfilePic,
        name = name,
        time = time,
        postCaption = postCaption,
        postPic = 0,
        likes = likes,
        comments = comments,
        share = share
    )
}
