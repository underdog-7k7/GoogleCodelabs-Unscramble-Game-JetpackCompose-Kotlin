package com.example.unscramble.ui

data class Ui_State(val currentScrambledWord: String = "",
                    val currentWordCount: Int = 1,
                    val score: Int = 0,
                    val isGuessedWordWrong: Boolean = false,
                    val isGameOver: Boolean = false) {


}