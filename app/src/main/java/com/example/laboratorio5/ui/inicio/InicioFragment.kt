package com.example.laboratorio5.ui.inicio

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.laboratorio5.R
import com.example.laboratorio5.ui.pregunta.PreguntaViewModel
import kotlinx.android.synthetic.main.fragment_inicio.*
import android.content.Intent as Intent1

class InicioFragment : Fragment() {
    private lateinit var homeViewModel: InicioViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        this.Encuesta.setOnClickListener{

        }
        homeViewModel =
            ViewModelProviders.of(this).get(InicioViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_inicio, container, false)
        homeViewModel.text.observe(this, Observer {
        })
        return root
    }
}