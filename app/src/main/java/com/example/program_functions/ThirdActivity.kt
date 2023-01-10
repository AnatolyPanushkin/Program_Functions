package com.example.program_functions

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class ThirdActivity : AppCompatActivity() {
    private var button: Button? = null
    private var text: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        button = findViewById(R.id.OnClickBtn3)



        button?.setOnClickListener {
            val user = User(
                this.findViewById<EditText>(R.id.name).text.toString(),
                this.findViewById<EditText>(R.id.age).text.toString(),
                this.findViewById<EditText>(R.id.email).text.toString()
            )
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("user", user)
            startActivity(intent)
        }
    }
}

