package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var startbtn = findViewById<Button>(R.id.btn_start)
        var nameinput = findViewById<AppCompatEditText>(R.id.nameinput)
        startbtn.setOnClickListener {
            if(nameinput.text.toString().isEmpty()){
                Toast.makeText(this,"Please enter your name",Toast.LENGTH_SHORT).show()

            }else{
                val intent : Intent = Intent(this,QuizQuestionActivity::class.java)
                startActivity(intent)

            }
        }

    }
}