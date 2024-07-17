package com.quizapplication.presentation.utils

object Constant {
    val numberAsString = listOf("10") + (1..50).map { it.toString() }
    val categories = listOf(
        "General knowledge",
        "Entertainment: Books",
        "Entertainment: Film",
        "Entertainment: Music",
        "Entertainment: Comics",
        "Entertainment: Musicals & Theatres",
        "Entertainment: Television",
        "Entertainment: Video Games ",
        "Entertainment: Board Games ",
        "Science & Nature",
        "Science: Computers",
        "Science: Mathematics",
        "Science: Gadgets",
        "Mythology",
        "Sports",
        "Geography",
        "History",
        "Politics",
        "Art",
        "Celebrities",
        "Animals",
        "Vehicles",

        )

    val categoriesMap = mapOf(
        "General knowledge" to 9,
        "Entertainment: Books" to 10,
        "Entertainment: Film" to 11,
        "Entertainment: Music" to 12,
        "Entertainment: Comics" to 13,
        "Entertainment: Musicals & Theatres" to 14,
        "Entertainment: Television" to 15,
        "Entertainment: Video Games" to 16,
        "Entertainment: Board Games" to 17,
        "Science & Nature" to 18,
        "Science: Computers" to 19,
        "Science: Mathematics" to 20,
        "Science: Gadgets" to 21,
        "Mythology" to 22,
        "Sports" to 23,
        "Geography" to 24,
        "History" to 25,
        "Politics" to 26,
        "Art" to 27,
        "Celebrities" to 28,
        "Animals" to 29,
        "Vehicles" to 30,
    )

    val difficulty = listOf("Easy", "Medium", "Hard")
    val type = listOf("Multiple Choice", "True/False")
}