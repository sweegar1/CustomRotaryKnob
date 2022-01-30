package com.example.musictribetask.viewmodel

import android.app.Application
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.musictribetask.customView.CustomRotaryKnobView
import com.example.musictribetask.customView.RotaryKnobView


class MainViewModel() :
    ViewModel(){
    var knobValue = MutableLiveData<String>()
    var knobValue2 = MutableLiveData<String>()


    fun updateKnob1Data(value: String) {
        knobValue.value = value
    }

 fun updateKnob2Data(value: String) {
        knobValue.value = value
    }


}