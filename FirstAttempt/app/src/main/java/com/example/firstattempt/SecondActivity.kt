package com.example.firstattempt

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.firstattempt.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_second)
        var binding: ActivitySecondBinding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val intent = intent
        val go_to_new = intent.getStringExtra("yollanan")
        binding.tv2.text = go_to_new

    }


    fun uyarıMesajı(view:View){

        val uyarıMesaji= AlertDialog.Builder(this)
        uyarıMesaji.setTitle("sifre hatası")
        uyarıMesaji.setMessage("sifre giriniz")
        //kullanıcı evete bastımı ne yapıcam
        uyarıMesaji.setPositiveButton("evet", DialogInterface.OnClickListener { dialogInterface, i ->

            Toast.makeText(this, "baştan dene",Toast.LENGTH_LONG).show()
        } )

        uyarıMesaji.setNegativeButton("hayır") {DialogInterface, i ->

            Toast.makeText(this, "hayıra bastın",Toast.LENGTH_LONG).show()
        }

        uyarıMesaji.show()

    }

}