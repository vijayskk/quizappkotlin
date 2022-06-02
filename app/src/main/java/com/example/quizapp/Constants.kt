package com.example.quizapp

object Constants {

    fun getQuestions(): ArrayList<Question>{
        var questionList = ArrayList<Question>()


        var q1 = Question(
            1,
            "A program which translates a high-level language program into a machine language program is called ?",
            null,
            "Compiler",
            "Interpreters",
            "Both (A) and (B)",
            "None of the above",
            3
        )
        questionList.add(q1)

        return questionList
    }

}