package com.example.program_functions

 import android.content.Intent
 import androidx.appcompat.app.AppCompatActivity
 import android.os.Bundle
 import android.widget.Button
 import android.widget.TextView

 class SecondActivity : AppCompatActivity() {
     private var btn: Button? = null
     private var textView: TextView? = null
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_second)

         btn = findViewById(R.id.OnClickBtn2)
         val user = intent.getSerializableExtra("user", User::class.java)

         this.findViewById<TextView>(R.id.lbl_name).text = user?.username
         this.findViewById<TextView>(R.id.lbl_age).text = user?.age
         this.findViewById<TextView>(R.id.lbl_email).text = user?.email

         btn?.setOnClickListener{
             val intent = Intent(this, ThirdActivity::class.java)
             startActivity(intent)
         }
     }
 }



