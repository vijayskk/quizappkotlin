package com.example.quizapp

object Constants {

    private var score : Int = 0
    private var name : String = ""


    fun getQuestions(): ArrayList<Question>{
        var questionList = ArrayList<Question>()



        questionList.add(
            Question(
                1,
                "A program which translates a high-level language program into a machine language program is/are called ?",
                null,
                "Compiler",
                "Interpreters",
                "Both (A) and (B)",
                "None of the above",
                3
            )
        )
        questionList.add(
            Question(
                2,
                "A sequence of instructions in a computer language to get the desired result is known as :",
                null,
                "An algorithm",
                "A decision table",
                "A program",
                "None of the above",
                3
            )
        )
        questionList.add(
            Question(
                3,
                "The language understood by a computer with out translation is called :",
                null,
                "Command language",
                "High-level language",
                "Assembly language",
                "Machine language",
                4
            )
        )
        questionList.add(
            Question(
                4,
                "An algorithm is best described as",
                null,
                "A computer language",
                "A step by step procedure for solving a problem",
                "A branch of mathematics",
                "None of the above",
                2
            )
        )
        questionList.add(
            Question(
                5,
                "Bug means :",
                null,
                "A logical error in a program",
                "A difficult syntax error in a program",
                "Both (A) and (B)",
                "None of the above",
                3
            )
        )
        questionList.add(
            Question(
                6,
                "The part of a machine level instruction which tells the central processor what has to be done ?",
                null,
                "An operation code",
                "An address",
                "An operand",
                "None of the above",
                1
            )
        )
        questionList.add(
            Question(
                7,
                "Which of the following is not true about an interpreter?",
                null,
                "Interpreter generates an object program from the source program.",
                "Interpreter is a kind of translater.",
                "Interpreter analysis each source statement every time it is to be executed.",
                "None of the above",
                4
            )
        )
        questionList.add(
            Question(
                8,
                "The errors that can be pointed out by the compiler are :",
                null,
                "Syntax errors",
                "Semantic errors",
                "Logical errors",
                "None of the above",
                1
            )
        )
        questionList.add(
            Question(
                9,
                "Which of the following statement is not true?",
                null,
                "FORTRAN is a high-level language.",
                "A FORTRAN program written for the IBM-PC, is totally different from a FORTRAN program written in for the execution of SUN machine.",
                "FORTRAN is extensively used to write programs for programming scientific computations.",
                "None of the above",
                2
            )
        )
        questionList.add(
            Question(
                10,
                "A program that converts a high level language program to a set of instructions that can run on a computer is called a :",
                null,
                "Compiler",
                "Debugger",
                "Editor",
                "None of the above",
                1
            )
        )


        return questionList
    }
    fun addScore(){
        score++
    }
    fun getScore():Int{
        return score
    }
    fun setName(n : String){
        name = n
    }
    fun getName(): String {
        return name
    }
}