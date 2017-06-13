package com.example.asiantech.demokotlin.acitivty

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.asiantech.demokotlin.R
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val text: String = "First Line \n" + "Second Line \n" + "Third Line"
        tvNamee.text = text
    }

    fun doSomeThing(number: Array<Int>) {

    }
}
