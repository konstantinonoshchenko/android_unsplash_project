package com.example.unsplash.api

enum class Scope constructor(val scope: String) {

    PUBLIC("public"),
    READ_USER("read_user"),
    WRITE_USER("write_user"),
    READ_PHOTOS("read_photos"),
    WRITE_PHOTOS("write_photos"),
    WRITE_LIKES("write_likes"),
    WRITE_FOLLOWERS("write_likes"),
    WRITE_COLLECTIONS("write_collections"),
    READ_COLLECTIONS("read_collections")
}
