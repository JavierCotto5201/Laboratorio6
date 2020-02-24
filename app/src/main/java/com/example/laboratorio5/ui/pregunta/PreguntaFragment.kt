package com.example.laboratorio5.ui.pregunta

import android.content.Intent.getIntent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.laboratorio5.R
import kotlinx.android.synthetic.main.fragment_pregunta.*

class PreguntaFragment : Fragment() {
    private lateinit var slideshowViewModel: PreguntaViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val preguntas = ArrayList<String>()

        val preg = arrayOf("Tiene algun comentario que agregar","Que le parecio nuestro servicio(1 es lo más bajo y 5 lo más alto)")
        for(i in preg){
        }

        slideshowViewModel = ViewModelProviders.of(this).get(PreguntaViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_pregunta, container, false)
        slideshowViewModel.text.observe(this, Observer {
        })
        return root
    }
}