package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        message.text = "Not so happening!"

        message.setOnTouchListener { v:View, event: MotionEvent ->
            if (message.isVisible) {
                message.visibility = View.GONE
                edit_message.visibility = View.VISIBLE
            }

            true
        }

        edit_message.setOnTouchListener { v:View, event: MotionEvent ->

            if (edit_message.isVisible) {
                edit_message.visibility = View.GONE
                message.visibility = View.VISIBLE
            }

            true
        }
    }

}
