package com.falmeida.quizapp

object Constants{

    const val USER_NAME: String = "user name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

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
            2,
            "What is the name of this programming language?",
            R.drawable.ic_javascript,
            optionOne = "Javascript",
            optionTwo = "Paschal",
            optionThree = "Bootstrap",
            optionFour = "Dart",
            correctAnswer = 1
        )
        questionList.add(que2)

        val que3 = Question(
            3,
            "What is the name of this framework?",
            R.drawable.ic_react,
            optionOne = "Angular",
            optionTwo = "Paschal",
            optionThree = "Bootstrap",
            optionFour = "React",
            correctAnswer = 4
        )
        questionList.add(que3)

        val que4 = Question(
            4,
            "What is the name of this framework?",
            R.drawable.ic_flutter,
            optionOne = "Swift",
            optionTwo = "Kotlin",
            optionThree = "Flutter",
            optionFour = "React Native",
            correctAnswer = 4
        )
        questionList.add(que4)

        val que5 = Question(
            5,
            "What is the name of this programming language?",
            R.drawable.ic_java,
            optionOne = "Java",
            optionTwo = "Kotlin",
            optionThree = "Flutter",
            optionFour = "React Native",
            correctAnswer = 1
        )
        questionList.add(que5)

        val que6 = Question(
            6,
            "What is the name of this programming language?",
            R.drawable.ic_java,
            optionOne = "Java",
            optionTwo = "Kotlin",
            optionThree = "Flutter",
            optionFour = "React Native",
            correctAnswer = 1
        )
        questionList.add(que6)

        val que7 = Question(
            7,
            "What is the name of this programming language?",
            R.drawable.ic_java,
            optionOne = "Java",
            optionTwo = "Kotlin",
            optionThree = "Flutter",
            optionFour = "React Native",
            correctAnswer = 1
        )
        questionList.add(que7)

        val que8 = Question(
            8,
            "What is the name of this programming language?",
            R.drawable.ic_java,
            optionOne = "Java",
            optionTwo = "Kotlin",
            optionThree = "Flutter",
            optionFour = "React Native",
            correctAnswer = 1
        )
        questionList.add(que8)

        val que9 = Question(
            5,
            "What is the name of this programming language?",
            R.drawable.ic_java,
            optionOne = "Java",
            optionTwo = "Kotlin",
            optionThree = "Flutter",
            optionFour = "React Native",
            correctAnswer = 1
        )
        questionList.add(que9)

        val que10 = Question(
            5,
            "What is the name of this programming language?",
            R.drawable.ic_java,
            optionOne = "Java",
            optionTwo = "Kotlin",
            optionThree = "Flutter",
            optionFour = "React Native",
            correctAnswer = 1
        )
        questionList.add(que10)

        return questionList
    }

}