package com.example.android.guesstheword.screens.game

import android.util.Log
import androidx.lifecycle.ViewModel

private const val TAG = "GameViewModel"
class GameViewModel : ViewModel() {
    init {
        Log.i(TAG, "$TAG is created.")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i(TAG, "$TAG onCleared.")
    }
}