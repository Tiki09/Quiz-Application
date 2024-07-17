package com.quizapplication.presentation.home

sealed class EventHomeScreen {
    data class SetNumOfQuizes(val numOfQuizes: Int) : EventHomeScreen()
    data class SetQuizCategory(val category: String) : EventHomeScreen()
    data class SetQuizDifficulty(val difficulty: String) : EventHomeScreen()
    data class SetQuizType(val types: String) : EventHomeScreen()
}
