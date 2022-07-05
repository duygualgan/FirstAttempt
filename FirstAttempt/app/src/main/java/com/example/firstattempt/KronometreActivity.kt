package com.example.firstattempt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import com.example.firstattempt.databinding.ActivityKronometreBinding
import com.example.firstattempt.databinding.ActivityMainBinding

class KronometreActivity : AppCompatActivity() {

    lateinit var binding: ActivityKronometreBinding
    var  numara = 0
    var runnable : Runnable = Runnable{ }
    var handler = Handler(Looper.myLooper()!!)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_kronometre)

        binding = ActivityKronometreBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun baslat(view: View) {

        numara = 0

        runnable = object : Runnable{
            override fun run() {
                numara = numara +1
                binding.textView4.text = "sayaç : ${numara}"
                handler.postDelayed(runnable, 1000)
            }

        }

        handler.post(runnable)

    }


    fun durdur(view: View) {

        handler.removeCallbacks(runnable)
        numara = 0
        binding.textView4.text = "sayaç : 0"

    }
}