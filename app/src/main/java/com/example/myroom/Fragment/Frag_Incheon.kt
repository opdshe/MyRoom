package com.example.myroom.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myroom.Adapter.ListAdapter
import com.example.myroom.R
import com.example.myroom.User
import kotlinx.android.synthetic.main.fragment_incheon.*
import javax.sql.DataSource

class Frag_Incheon(private val destination: String?, private val rushHour: Int?) : Fragment() {
    private val UserList = arrayListOf<User>(
        User("심효근","shimhg02@naver.com","아령하세요잇!"),
        User("박채연","asdf@naver.com","할말이 없다"),
        User("박서연","qwerqr2@naver.com","ㄷ"),
        User("박태욱","ㅁㄴㅇㄹㅁㄴㅇㄹㅁㄴㅇㄹ@naver.com","ㅁㄴㅇㄹ"),
        User("김민식","qwer2@naver.com","ㅇㅁㄴㄹ!"),
        User("이소명","shㅇㄹ@naver.com","아령dsafsdf!"),
        User("한규언","shiㅁㄴㅇㄹ@naver.com","afsdf!"),
        User("정빈","shi@naver.com","ㅁㄴㅇㄹ"),
        User("김태양","sㅁㄴㅇㄹㅁㅇㄴㄹaver.com","아ㅇ잇!")

    )
    var Adapter:ListAdapter?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_incheon, container, false)
        val listView=view.findViewById(R.id.list_view) as ListView
        Adapter = ListAdapter(context, UserList)
        listView.adapter = Adapter
        return view
    }
}
