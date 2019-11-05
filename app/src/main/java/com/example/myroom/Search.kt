package com.example.myroom

import android.app.Activity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.SeekBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sub.*

class Search:AppCompatActivity(){
    var rush_hour:Int?=null
    var mode:String?=null
    var destination:String?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)
        seek_time.max=9
        seek_time.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                var value:Int=p1*10
                rush_hour=value
                //Toast.makeText(applicationContext,rush_hour.toString()+"분",Toast.LENGTH_LONG).show()
                txt_time_val.setText(rush_hour.toString()+"분")
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }
        })
        image_trans.setOnClickListener { view ->
            image_trans.setImageResource(R.drawable.pt_white)
            image_car.setImageResource(R.drawable.car_gray)
            image_walk.setImageResource(R.drawable.walk_gray)
        }
        image_car.setOnClickListener { view ->
            image_trans.setImageResource(R.drawable.pt_gray)
            image_car.setImageResource(R.drawable.car_white)
            image_walk.setImageResource(R.drawable.walk_gray)
        }
        image_walk.setOnClickListener { view ->
            image_trans.setImageResource(R.drawable.pt_gray)
            image_car.setImageResource(R.drawable.car_gray)
            image_walk.setImageResource(R.drawable.walk_white)
        }
        edit_dest.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(p0: Editable?) {
                destination=edit_dest.text.toString()

            }
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                destination=edit_dest.text.toString()
            }
        })
        btn_search.setOnClickListener { view ->
            Toast.makeText(applicationContext,destination,Toast.LENGTH_SHORT).show()
        }
    }



}