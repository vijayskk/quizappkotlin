package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.ContextCompat


class QuizQuestionActivity : AppCompatActivity(){



    private var mCurrentPosition : Int = 1
    private var mQuestionList: ArrayList<Question> = Constants.getQuestions()
    private var selectedOption : Int? = null
    var optionViews : ArrayList<TextView> = ArrayList()
    val maxQns : Int = Constants.getQuestions().size

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        setContentView(R.layout.activity_quiz_question)
        var op1 = findViewById<TextView>(R.id.option1)
        var op2 = findViewById<TextView>(R.id.option2)
        var op3 = findViewById<TextView>(R.id.option3)
        var op4 = findViewById<TextView>(R.id.option4)
        var pbar = findViewById<ProgressBar>(R.id.pbar)
        pbar.max = Constants.getQuestions().size

        optionViews.add(0,op1)
        optionViews.add(1,op2)
        optionViews.add(2,op3)
        optionViews.add(3,op4)

        loadQuestion()

    }

    fun loadQuestion(){
        var pbar = findViewById<ProgressBar>(R.id.pbar)
        var ptext = findViewById<TextView>(R.id.qprogress)
        var questiontext = findViewById<TextView>(R.id.question)
        var image = findViewById<ImageView>(R.id.qimage)
        var op1 = findViewById<TextView>(R.id.option1)
        var op2 = findViewById<TextView>(R.id.option2)
        var op3 = findViewById<TextView>(R.id.option3)
        var op4 = findViewById<TextView>(R.id.option4)
        var question = mQuestionList[mCurrentPosition -1]
        pbar.progress = mCurrentPosition
        ptext.text = "$mCurrentPosition" + "/" + pbar.max
        questiontext.text = question.question
        if(question.image != null){
            image.setImageResource(question.image!!)
        }
        op1.text = question.option1
        op2.text = question.option2
        op3.text = question.option3
        op4.text = question.option4
        clearSelection()
    }

    fun onOptionClick(view:View){
        clearSelection()
        var tag : Int = (view.tag as String).toInt()
        var selOp = optionViews[tag-1]
        selectedOption = tag
        selOp.background = ContextCompat.getDrawable(this,R.drawable.sel_op_border)
    }
    fun clearSelection(){
        selectedOption = null
        for (op in optionViews){
            op.background = ContextCompat.getDrawable(this,R.drawable.def_op_border)
        }
    }
    fun OnSubmit(view:View){
        var currquestion = mQuestionList[mCurrentPosition -1]
        if(selectedOption != null){
            if(selectedOption == currquestion.correctoption){
                Constants.addScore()
            }
            if(maxQns > mCurrentPosition){
                mCurrentPosition += 1
                loadQuestion()
            }else{
                val intent : Intent = Intent(this,ResultActivity::class.java)
                startActivity(intent)
                finish()
            }
        }


    }

}