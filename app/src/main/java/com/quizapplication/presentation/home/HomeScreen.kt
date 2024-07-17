package com.quizapplication.presentation.home

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.quizapplication.presentation.common.AppDropDownMenu
import com.quizapplication.presentation.common.ButtonBox
import com.quizapplication.presentation.home.component.HomeHeader
import com.quizapplication.presentation.utils.Constant
import kotlin.math.log

@Preview
@Composable
fun PreviewHome() {
    HomeScreen(state = StateHomeScreen(),
        event = {})
}

@Composable
fun HomeScreen(
    state: StateHomeScreen,
    event: (EventHomeScreen) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        HomeHeader()

        Spacer(modifier = Modifier.height(25.dp))
        AppDropDownMenu(menuName = "number of ques :",
            menuList = Constant.numberAsString,
            text = state.numOfQuiz.toString(),
            onDropDownClick = {
                event(EventHomeScreen.SetNumOfQuizes(it.toInt()))
            })

        Spacer(modifier = Modifier.height(14.dp))
        AppDropDownMenu(menuName = "select category :",
            menuList = Constant.categories,
            text = state.category,
            onDropDownClick = {
                event(EventHomeScreen.SetQuizCategory(it))
            })

        Spacer(modifier = Modifier.height(14.dp))
        AppDropDownMenu(menuName = "select difficulty :",
            menuList = Constant.difficulty,
            text = state.difficulty,
            onDropDownClick = {
                event(EventHomeScreen.SetQuizDifficulty(it))
            })

        Spacer(modifier = Modifier.height(14.dp))
        AppDropDownMenu(menuName = "select type :",
            menuList = Constant.type,
            text = state.types,
            onDropDownClick = {
                event(EventHomeScreen.SetQuizType(it))
            })

        Spacer(modifier = Modifier.height(20.dp))

        ButtonBox(text = "Generate Quiz", padding = 20.dp){
            Log.e("quiz", "${state.numOfQuiz}  ${state.category}  ${state.difficulty}  ${state.types}")
        }
    }
}
