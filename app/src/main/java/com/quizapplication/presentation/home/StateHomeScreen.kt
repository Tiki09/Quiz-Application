package com.quizapplication.presentation.home

data class StateHomeScreen(
    val numOfQuiz : Int = 1,
    val category : String = "Art",
    val difficulty: String = "Easy",
    val types : String = "Multiple Choice"
)
