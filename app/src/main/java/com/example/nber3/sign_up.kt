package com.example.nber3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast



class sign_up : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)


        val first_name=findViewById<EditText>(R.id.First_name).text.toString()
        val second_name=findViewById<EditText>(R.id.Second_name).text.toString()
        //val E_mail=findViewById<EditText>(R.id.email).text.toString()
        val phone_nber=findViewById<EditText>(R.id.phone_nber).text.toString()
        val password=findViewById<EditText>(R.id.password1).text.toString()

        val tomenu: TextView=findViewById(R.id.singnup_button)
        tomenu.setOnClickListener{
            var Name=first_name
            var Name2=second_name
            var username=findViewById<EditText>(R.id.email).text.toString()
            var nber=phone_nber
            var password2=findViewById<EditText>(R.id.password1).text.toString()
           // var intent =Intent(this@sign_up,MainActivity::class.java)
           // intent.putExtra("Email",findViewById<EditText>(R.id.email).text.toString())
           // intent.putExtra("password",findViewById<EditText>(R.id.password1).text.toString())
           // startActivity(intent)
            if(username.trim().length>0&&password2.trim().length>0){
              //  Toast.makeText(this,"Please enter your details", Toast.LENGTH_LONG).show()
                Toast.makeText(this,"Successful", Toast.LENGTH_LONG).show()
                switchactivity2()

            }
            else{(Toast.makeText(this,"not successfull", Toast.LENGTH_LONG).show())
           // startActivity(intent)
           // Toast.makeText(this,"Successful", Toast.LENGTH_LONG).show()
           // switchactivity2()
            }
        }


        val tosignin: TextView =findViewById(R.id.sign_in)
        tosignin.setOnClickListener{
            switchactivity1()
        }
    }
    fun switchactivity1(){
        val intent=Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
    fun switchactivity2(){
        val intent=Intent(this,Menu::class.java)
        startActivity(intent)
    }

}


