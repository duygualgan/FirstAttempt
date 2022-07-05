package com.example.firstattempt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.example.firstattempt.databinding.ActivityMainBinding
import com.example.firstattempt.databinding.ActivityTimerBinding

class TimerActivity : AppCompatActivity() {

    lateinit var binding: ActivityTimerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_timer)

        binding = ActivityTimerBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        object  : CountDownTimer(15000, 1000){
            override fun onTick(p0: Long) {

                binding.textView3.text = "kalan ${p0 / 1000}"
            }

            override fun onFinish() {

                binding.textView3.text = "kalan : 0"
            }

        }.start()


    }
}