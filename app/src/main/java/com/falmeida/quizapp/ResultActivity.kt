package com.falmeida.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val username = intent.getStringExtra(Constants.USER_NAME)
        findViewById<TextView>(R.id.tv_name).text = username

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers =  intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        findViewById<TextView>(R.id.tv_score).text = "Your Score is $correctAnswers out of $totalQuestions "

        val point = "$correctAnswers out of $totalQuestions"

        findViewById<Button>(R.id.btn_share).setOnClickListener {

            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra("My score in Programmer Quizgame is ", point)

            val chooser = Intent.createChooser(intent, "Share using...")
            startActivity(chooser)
        }

        findViewById<TextView>(R.id.btn_finish).setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}