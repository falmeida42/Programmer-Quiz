package com.falmeida.quizapp

object Constants{

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What is the name of this framework?",
            R.drawable.ic_angular,
            optionOne = "Kotlin",
            optionTwo = "C++",
            optionThree = "Angular",
            optionFour = "Java",
            correctAnswer = 3
        )
        questionList.add(que1)

        val que2 = Question(
            1,
            "What is the name of this programming language?",
            R.drawable.ic_javascript,
            optionOne = "Javascript",
            optionTwo = "Paschal",
            optionThree = "Bootstrap",
            optionFour = "Dart",
            correctAnswer = 1
        )
        questionList.add(que2)
        return questionList
    }

}