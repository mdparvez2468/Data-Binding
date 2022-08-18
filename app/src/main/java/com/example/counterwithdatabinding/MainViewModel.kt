package com.example.counterwithdatabinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    val data = MutableLiveData("Arman")

    fun updateData(){
        data.value = "Parvez"
    }
}