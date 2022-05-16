package com.example.gurmanica

import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody

class AccessHeaders {
    /*
    private val client = OkHttpClient()
    private val number = "+79005774594"
    //private val number = "+79108646616"


    fun run() {
        var mediaType = "application/json".toMediaTypeOrNull()
        var body = RequestBody.create(mediaType, "{\\n\\t\\\"phone\\\":\\\"${number}\\\"\\n}")
        val request = Request.Builder()
            .url("https://dev-api.gurmanika.ru/api/verify")
            //.header("User-Agent", "OkHttp Headers.java")
            //.addHeader("Accept", "application/json; q=0.5")
            .method("POST", body)
            .addHeader("Content-Type", "application/json")
            .build()

        client.newCall(request).execute()
    }
    */

}