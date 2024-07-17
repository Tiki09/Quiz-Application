package com.quizapplication.presentation.home

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class HomeScreenViewModel : ViewModel() {

    private val _homeState = MutableStateFlow(StateHomeScreen())
    val homeState = _homeState

    fun onEvent(events: EventHomeScreen){
        when(events){
            is EventHomeScreen.SetNumOfQuizes -> {
                _homeState.value = homeState.value.copy(numOfQuiz = events.numOfQuizes)
            }
            is EventHomeScreen.SetQuizCategory -> {
                _homeState.value = homeState.value.copy(category = events.category)
            }
            is EventHomeScreen.SetQuizDifficulty -> {
                _homeState.value = homeState.value.copy(difficulty = events.difficulty)
            }
            is EventHomeScreen.SetQuizType -> {
                _homeState.value = homeState.value.copy(types = events.types)
            }
            else -> {}
        }
    }
}