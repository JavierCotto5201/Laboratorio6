package com.example.laboratorio5.ui.agregar_pregunta

import android.content.Intent
import android.content.IntentSender
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.laboratorio5.R
import com.example.laboratorio5.ui.pregunta.PreguntaFragment
import kotlinx.android.synthetic.main.fragment_agregar.*


class AgregarFragment : Fragment() {

    private lateinit var galleryViewModel: AgregarViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //var pregunta =""
        //val preguntas = ArrayList<String>()
        //preguntas.add("Tiene algun comentario que agregar")
        //preguntas.add("Que le parecio nuestro servicio(1 es lo más bajo y 5 lo más alto)")


        agregar_preg.setOnClickListener{
            //pregunta= this.editText.text.toString()
            //preguntas.add(pregunta)


            //val intent = Intent(this, PreguntaFragment::class.java)
            //intent.putExtra("miLista", preguntas)
            //startActivity(intent)
        }

        galleryViewModel =
            ViewModelProviders.of(this).get(AgregarViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_agregar, container, false)
        galleryViewModel.text.observe(this, Observer {
        })
        return root
    }

}