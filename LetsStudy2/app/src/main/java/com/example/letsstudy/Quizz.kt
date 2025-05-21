package com.example.letsstudy

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.content.Intent
import android.widget.TextView



class Quizz : AppCompatActivity() {
    private val questions = listOf(
        "South Africa has 11 official languages",
        "Nelson Mandela was the first black president of South Africa",
        "The capital city of South Africa is Johannesburg",
        "South Africa is known as the Rainbow Nation",
        "The Kruger National Park is located in South Africa",
        "South Africa hosted the FIFA World Cup in 2010",
    )
    private val answers = listOf( true, true, false, true, true, true)
    private var currentQuestionIndex = 0
    private var score = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quizz)
        val questionTextView = findViewById<TextView>(R.id.tvQuestions)
        val btnTrue = findViewById<Button>(R.id.btnTrue)
        val btnFalse = findViewById<Button>(R.id.btnFalse)

        //Display the first question
        questionTextView.text = questions[currentQuestionIndex]

        //True/False button Clicks
        btnTrue.setOnClickListener { checkAnswer(true,questionTextView) }
        btnFalse.setOnClickListener { checkAnswer(false,questionTextView) }





        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }


    private fun checkAnswer(userAnswer: Boolean, questionTextView: TextView) {
        val correctAnswer = answers[currentQuestionIndex]
        if (userAnswer == correctAnswer) {
            score++
        }
        currentQuestionIndex++
        if (currentQuestionIndex < questions.size) {
            questionTextView.text = questions[currentQuestionIndex]
        } else {
            val intent = Intent(this, results::class.java)
            intent.putExtra("correctAnswers", score)
            intent.putExtra("totalQuestions", questions.size)
            startActivity(intent)
            finish()
        }
    }
}