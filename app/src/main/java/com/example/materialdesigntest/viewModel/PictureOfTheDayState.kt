package com.example.materialdesigntest.viewModel

import com.example.materialdesigntest.repository.PictureOfTheDayResponseData

sealed class PictureOfTheDayState {
    data class Success(val serverResponseData: PictureOfTheDayResponseData) : PictureOfTheDayState()
    data class Error(val error: Throwable) : PictureOfTheDayState()
    data class Loading(val progress: Int?) : PictureOfTheDayState()
}