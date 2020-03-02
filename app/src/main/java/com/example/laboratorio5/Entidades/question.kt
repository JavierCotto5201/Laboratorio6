package com.example.laboratorio5.Entidades

class question {
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

    abstract class poll {
        companion object {
            val tabla = "encuesta"
            val ID = "_id"
            val create_date = "Fecha de creación"
        }
    }

    abstract class respuesta {
        companion object {
            val tabla = "respuestas"
            val ID = "_id"
            val poll_id = "poll id"
            val question_id = "question_id"
            val answer_text = "answer_text"
            val answer_number = "answer_number"
        }
    }
}