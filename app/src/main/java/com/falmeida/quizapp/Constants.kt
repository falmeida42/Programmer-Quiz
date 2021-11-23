package com.falmeida.quizapp

object Constants{

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_angular,
            optionOne = "Kotlin",
            optionTwo = "C++",
            optionThree = "Angular",
            optionFour = "Java",
            correctAnswer = 1
        )
        questionList.add(que1)
        return questionList
    }

}