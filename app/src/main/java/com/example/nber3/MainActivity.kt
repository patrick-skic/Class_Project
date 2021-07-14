package com.example.nber3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import soup.neumorphism.NeumorphCardView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username=findViewById<EditText>(R.id.userName).text.toString()
       // val msg=username.text.toString()

        val tosignup: TextView=findViewById(R.id.sign_up)
        tosignup.setOnClickListener{
            switchactivity()
        }

        val tomenu: TextView=findViewById(R.id.singin_button)
        tomenu.setOnClickListener{
            login()
        }
    }
    fun switchactivity(){
        val intent=Intent(this,sign_up::class.java)
        startActivity(intent)

    }
    fun login(){
           // val intent=Intent(this,Menu::class.java)
           // startActivity(intent)
        var intent= intent
        val nber1=intent.getStringExtra("Email")
        val nber2=intent.getStringExtra("password")
        if(findViewById<EditText>(R.id.userName).text.toString().equals("skic@gmail.com")&& findViewById<EditText>(R.id.Password).text.toString().equals("password")){
            Toast.makeText(this,"correct credential",Toast.LENGTH_LONG).show()
             val intent=Intent(this,Menu::class.java)
            startActivity(intent)
        }
        else if(findViewById<EditText>(R.id.userName).text.toString().equals(nber1)&& findViewById<EditText>(R.id.Password).text.toString().equals(nber2)){
            Toast.makeText(this,"correct credential",Toast.LENGTH_LONG).show()
            val intent=Intent(this,Menu::class.java)
            startActivity(intent)
        }
        else
        {
            Toast.makeText(this,"incorrect credentials,please try again",Toast.LENGTH_LONG).show()
        }
    }
}