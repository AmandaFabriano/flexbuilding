package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)

            requestWindowFeature(Window.FEATURE_NO_TITLE)
            window.setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
            )

            setContentView(R.layout.activity_main)

            val button = findViewById<ImageButton>(R.id.open_button)
            button.setOnClickListener {
                startActivity(Intent(applicationContext,RestaurationActivity::class.java))


        }
        }

        }
