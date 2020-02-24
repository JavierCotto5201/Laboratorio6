package com.example.laboratorio5.ui.resultados

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.laboratorio5.R

class ResultadosFragment : Fragment() {

    private lateinit var toolsViewModel: ResultadosViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        toolsViewModel =
            ViewModelProviders.of(this).get(ResultadosViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_resultados, container, false)
        toolsViewModel.text.observe(this, Observer {
        })
        return root
    }
}