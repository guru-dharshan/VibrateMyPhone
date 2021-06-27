package com.devgd.vibratemyphone

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator;
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun vibrate(view: View) {
        var vibrator:Vibrator= getSystemService(Context.VIBRATOR_SERVICE) as Vibrator;
        vibrator.vibrate(500)
    }




}