package com.pramod.ktorclient.api

import com.pramod.ktorclient.model.Comment
import com.pramod.ktorclient.model.Post
import io.ktor.client.request.*


class GetRepo {

    suspend fun getPosts(): List<Post> =
        KtorClient.httpClient.get("https://jsonplaceholder.typicode.com/posts")


    suspend fun getComments(id: String): List<Comment> =
        KtorClient.httpClient.get<List<Comment>> {
            url("https://jsonplaceholder.typicode.com/comments")
            parameter("postId", id)
        }
}