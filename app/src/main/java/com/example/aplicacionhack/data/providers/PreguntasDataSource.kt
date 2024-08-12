package com.example.aplicacionhack.data

import com.example.aplicacionhack.domain.preguntasAdapter.PreguntasInfo

class PreguntasDataSource {

    fun obtenerPreguntasHistoria(): MutableList<PreguntasInfo> {
        val question: MutableList<PreguntasInfo> = mutableListOf()
        question.add(PreguntasInfo(1,"¿Cuándo fue la Segunda Guerra Mundial?", "1939-1945", "1914-1918", "1965-1970", "2000-2005", "a", 5, "q_1",null))
        return question
    }

    fun obtenerPreguntasLeyes(): MutableList<PreguntasInfo> {
        val question: MutableList<PreguntasInfo> = mutableListOf()
        question.add(PreguntasInfo(1,"¿Qué es la Constitución?", "Ley Suprema", "Código Penal", "Norma Fiscal", "Derecho Civil", "a", 5, "q_2",null))
        return question
    }

    fun obtenerPreguntasSistemasOperativos(): MutableList<PreguntasInfo> {
        val question: MutableList<PreguntasInfo> = mutableListOf()
        question.add(PreguntasInfo(1,"¿Qué es Linux?", "Sistema Operativo", "Editor de Texto", "Aplicación Web", "Lenguaje de Programación", "a", 5, "q_3",null))
        return question
    }

    fun obtenerPreguntasSQL(): MutableList<PreguntasInfo> {
        val question: MutableList<PreguntasInfo> = mutableListOf()
        question.add(PreguntasInfo(1,"¿Qué significa SQL?", "Structured Query Language", "Standard Query Language", "Sequential Query Language", "Structured Question Language", "a", 5, "q_4",null))
        return question
    }

    fun obtenerPreguntasLinux(): MutableList<PreguntasInfo> {
        val question: MutableList<PreguntasInfo> = mutableListOf()
        question.add(PreguntasInfo(1,"¿Quién creó Linux?", "Linus Torvalds", "Bill Gates", "Steve Jobs", "Mark Zuckerberg", "a", 5, "q_5",null))
        return question
    }

    fun obtenerPreguntasNetwork(): MutableList<PreguntasInfo> {
        val question: MutableList<PreguntasInfo> = mutableListOf()
        question.add(PreguntasInfo(1,"¿Qué es una dirección IP?", "Identificador de red", "Protocolo de Internet", "Número de teléfono", "Código postal", "a", 5, "q_6",null))
        return question
    }
}
