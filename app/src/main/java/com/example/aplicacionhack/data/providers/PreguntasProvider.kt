package com.example.aplicacionhack.data

import com.example.aplicacionhack.domain.preguntasAdapter.PreguntasInfo

class PreguntasProvider {

    fun obtenerPreguntasPorTema(id: Int): MutableList<PreguntasInfo> {
        return when (id) {
            1 -> obtenerPreguntasHistoria()
            2 -> obtenerPreguntasLeyes()
            3 -> obtenerPreguntasSistemasOperativos()
            4 -> obtenerPreguntasSQL()
            5 -> obtenerPreguntasLinux()
            6 -> obtenerPreguntasNetwork()
            else -> mutableListOf()
        }
    }

    private fun obtenerPreguntasHistoria(): MutableList<PreguntasInfo> {
        val question: MutableList<PreguntasInfo> = mutableListOf()
        // Añadir preguntas de Historia
        question.add(PreguntasInfo(1,"¿Cuándo fue la Segunda Guerra Mundial?", "1939-1945", "1914-1918", "1965-1970", "2000-2005", "a", 5, "q_1",null))
        // Añadir más preguntas...
        return question
    }

    private fun obtenerPreguntasLeyes(): MutableList<PreguntasInfo> {
        val question: MutableList<PreguntasInfo> = mutableListOf()
        // Añadir preguntas de Leyes
        question.add(PreguntasInfo(1,"¿Qué es la Constitución?", "Ley Suprema", "Código Penal", "Norma Fiscal", "Derecho Civil", "a", 5, "q_2",null))
        // Añadir más preguntas...
        return question
    }

    private fun obtenerPreguntasSistemasOperativos(): MutableList<PreguntasInfo> {
        val question: MutableList<PreguntasInfo> = mutableListOf()
        // Añadir preguntas de Sistemas Operativos
        question.add(PreguntasInfo(1,"¿Qué es Linux?", "Sistema Operativo", "Editor de Texto", "Aplicación Web", "Lenguaje de Programación", "a", 5, "q_3",null))
        // Añadir más preguntas...
        return question
    }

    private fun obtenerPreguntasSQL(): MutableList<PreguntasInfo> {
        val question: MutableList<PreguntasInfo> = mutableListOf()
        // Añadir preguntas de SQL
        question.add(PreguntasInfo(1,"¿Qué significa SQL?", "Structured Query Language", "Standard Query Language", "Sequential Query Language", "Structured Question Language", "a", 5, "q_4",null))
        // Añadir más preguntas...
        return question
    }

    private fun obtenerPreguntasLinux(): MutableList<PreguntasInfo> {
        val question: MutableList<PreguntasInfo> = mutableListOf()
        // Añadir preguntas de Linux
        question.add(PreguntasInfo(1,"¿Quién creó Linux?", "Linus Torvalds", "Bill Gates", "Steve Jobs", "Mark Zuckerberg", "a", 5, "q_5",null))
        // Añadir más preguntas...
        return question
    }

    private fun obtenerPreguntasNetwork(): MutableList<PreguntasInfo> {
        val question: MutableList<PreguntasInfo> = mutableListOf()
        // Añadir preguntas de Redes
        question.add(PreguntasInfo(1,"¿Qué es una dirección IP?", "Identificador de red", "Protocolo de Internet", "Número de teléfono", "Código postal", "a", 5, "q_6",null))
        // Añadir más preguntas...
        return question
    }
}
