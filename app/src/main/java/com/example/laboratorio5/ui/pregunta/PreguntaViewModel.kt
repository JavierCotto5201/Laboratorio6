package com.example.laboratorio5.ui.pregunta

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PreguntaViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {

        value = ""
    }
    val text: LiveData<String> = _text
}