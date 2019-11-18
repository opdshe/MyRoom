package com.example.myroom.Fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.myroom.R
import com.example.myroom.network.RetrofitNetwork
import kotlinx.android.synthetic.main.activity_result.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Frag_Seoul(private val destination: String?, private val rushHour: Int?) : Fragment() {
    private var txt_from:String?=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val retrofit = Retrofit.Builder().baseUrl("http://13.209.79.196:5000")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val service = retrofit.create(RetrofitNetwork::class.java)
        service.keyword()?.enqueue(object : Callback<Any> {
            override fun onFailure(call: Call<Any>, t: Throwable) {
                //Toast.makeText(context,"Failed",Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(call: Call<Any>, response: Response<Any>) {
                Log.d("Response :: ", response?.body().toString())
                var data : Any? = response?.body()
                Log.i("data" , data.toString())
                txt_from=data.toString()
            }
        })
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val view = inflater.inflate(R.layout.fragment_seoul, container, false)
        val textView = view.findViewById(R.id.txt_test) as TextView
        Toast.makeText(context, txt_from,Toast.LENGTH_SHORT).show()
        textView.text = txt_from
        return view
    }
}
