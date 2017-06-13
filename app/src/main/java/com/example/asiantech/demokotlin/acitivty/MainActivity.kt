package com.example.asiantech.demokotlin.acitivty

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.asiantech.demokotlin.R
import com.example.asiantech.demokotlin.`interface`.onClickItemListener
import com.example.asiantech.demokotlin.adapter.UserAdapter
import com.example.asiantech.demokotlin.model.User
import java.util.*

class MainActivity : AppCompatActivity(), onClickItemListener {


    companion object {
        private val URL = "http://1.bp.blogspot.com/-znALZyYesq0/VnASYfwmifI/AAAAAAAAEe8/siTX7n8ae0k/s1600/hinh-anh-hoat-hinh-dep-nhat%2B%25283%2529.jpg";
    }

    private var mData = ArrayList<User>()
    private var mRecyclerView: RecyclerView? = null
    private var mAdapter: UserAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        mRecyclerView = findViewById(R.id.recyclerview) as RecyclerView
        mRecyclerView!!.setHasFixedSize(true)
        mRecyclerView!!.layoutManager = LinearLayoutManager(this)
        loadData()
        mAdapter = UserAdapter(this, mData, this)
        mRecyclerView?.adapter = mAdapter
    }

    private fun loadData() {
        var user: String
        var ageUser: String
        for (i in 0..20) {
            user = "Name " + i
            ageUser = "Age " + i
            mData.add(User(URL, user, ageUser))
        }
    }

    override fun onClickListener(position: Int) {
        val bundle = Bundle()
        bundle.putString("a", mData.get(position).user)
        val intent = Intent(this, Main2Activity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }

}
