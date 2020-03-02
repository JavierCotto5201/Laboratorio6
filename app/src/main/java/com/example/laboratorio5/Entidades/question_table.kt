package com.example.laboratorio5.Entidades

class question_table {
    abstract  class question {

        companion object {
            val tabla = "Preguntas"
            val ID = "_id"
            val Name = "Preguntas"
            val type = "Tipo de Pregunta"
            val default = "Boolean"
            var preguntas: MutableList<question> = ArrayList()
        }
    }
}