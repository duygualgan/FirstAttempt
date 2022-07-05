package com.example.firstattempt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.firstattempt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        Toast.makeText(this, "hoşgeldin", Toast.LENGTH_LONG).show()

    }


    fun changeActivity(view: View){


        val adınız = binding.et1.text.toString()

        val intent = Intent(applicationContext, SecondActivity::class.java )
        intent.putExtra("yollanan", adınız)
        startActivity(intent)
        finish()

    }


    fun goTimer(view: View){


        val intent = Intent(applicationContext, TimerActivity::class.java )
        startActivity(intent)

    }

    fun goKro(view: View){


        val intent = Intent(applicationContext, KronometreActivity::class.java )
        startActivity(intent)

    }
}