package com.example.myroom.network

import retrofit2.Call
import retrofit2.http.GET
import java.lang.reflect.Array

interface RetrofitNetwork {

    @GET("/hi")
    fun listUser() : Call<Array>

    @GET("/keyword")
    fun keyword():Call<Any>


}