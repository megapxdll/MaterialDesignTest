package com.example.materialdesigntest.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.materialdesigntest.repository.PictureOfTheDayRetrofitImpl

class PictureOfTheDayViewModel (
    private val liveData: MutableLiveData<PictureOfTheDayState> = MutableLiveData(),
    private val pictureOfTheDayRetrofitImpl: PictureOfTheDayRetrofitImpl = PictureOfTheDayRetrofitImpl()
): ViewModel() {

    fun getLiveData() : LiveData<PictureOfTheDayState> {
        return liveData
    }
}