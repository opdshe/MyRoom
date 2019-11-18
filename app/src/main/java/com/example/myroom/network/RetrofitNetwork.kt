package com.example.myroom.network

import retrofit2.Call
import retrofit2.http.GET
import java.lang.reflect.Array

interface RetrofitNetwork {


    @GET("/db_connect")
    fun db_connect():Call<String>

    @GET("/keyword")
    fun keyword():Call<Any>


}