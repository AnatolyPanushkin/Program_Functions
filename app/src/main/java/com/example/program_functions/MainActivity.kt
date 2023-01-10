package com.example.program_functions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var btn: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.btn_click)
        btn?.setOnClickListener{
            Log.i("NewTag","OnClickListener")
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }

    }
    fun setLog(v: View?){
        Log.i("NewTag","OnClickXML")
    }
}
