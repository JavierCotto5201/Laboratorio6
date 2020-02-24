package com.example.laboratorio5.ui.resultados

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.laboratorio5.R
import kotlinx.android.synthetic.main.fragment_resultados.*

class ResultadosFragment : Fragment() {

    //private val applicationContext: Context?
    private lateinit var toolsViewModel: ResultadosViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        
        this.button.setOnClickListener(){
            //var texto = "Pregunta 1: , Pregunta 2: Pregunta 3: "
            //val show: Any = Toast.makeText(, texto, Toast.LENGTH_SHORT).show()
        }
        toolsViewModel =
            ViewModelProviders.of(this).get(ResultadosViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_resultados, container, false)
        toolsViewModel.text.observe(this, Observer {
        })
        return root
    }
}