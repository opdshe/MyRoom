package com.example.myroom

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

import android.content.ContentValues
import android.os.AsyncTask
import android.widget.Toast
import com.example.myroom.network.RetrofitNetwork
import kotlinx.android.synthetic.main.activity_result.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.lang.reflect.Array


class ResultActivity:AppCompatActivity() {
    var result:String?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val retrofit = Retrofit.Builder().baseUrl("http://13.209.79.196:5000")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val service = retrofit.create(RetrofitNetwork::class.java)
        btn_get.setOnClickListener { view ->
            service.keyword()?.enqueue(object : Callback<Any> {
                override fun onFailure(call: Call<Any>?, t: Throwable?) {
                    Toast.makeText(applicationContext,"failed",Toast.LENGTH_SHORT).show()
                }
                override fun onResponse(call: Call<Any>, response: Response<Any>) {
                    Log.d("Response :: ", response?.body().toString())
                    var data : Any? = response?.body()
                    Log.i("data" , data.toString())
                    txt_temp.setText(data.toString())
                    Toast.makeText(applicationContext,"success"+data,Toast.LENGTH_SHORT).show()
                }
            })
        }
    }
}