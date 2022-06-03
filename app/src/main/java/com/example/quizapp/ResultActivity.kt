package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var nameview = findViewById<TextView>(R.id.name)
        var scoreview = findViewById<TextView>(R.id.score)

        nameview.text = Constants.getName()

        scoreview.text = "Your score is ${Constants.getScore()} out of ${Constants.getQuestions().size}"
    }
    fun onFinish(view:View){
        val intent : Intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}