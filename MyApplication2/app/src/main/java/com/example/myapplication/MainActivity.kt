package com.example.myapplication

import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.fragment.InfoBuildingFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)

        setContentView(R.layout.activity_main)

        //Injecter le fragment

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container,InfoBuildingFragment())
        transaction.addToBackStack(null)
        transaction.commit()
    }
}