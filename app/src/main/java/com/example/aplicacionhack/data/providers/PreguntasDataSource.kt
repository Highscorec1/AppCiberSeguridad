package com.example.aplicacionhack.data

import com.example.aplicacionhack.domain.preguntasAdapter.PreguntasInfo
import javax.inject.Inject

class PreguntasDataSource @Inject constructor() {

    fun obtenerPreguntasHistoria(): MutableList<PreguntasInfo> {

        val question: MutableList<PreguntasInfo> = mutableListOf()

        question.add(PreguntasInfo(1, "¿En qué año se realizó el primer ataque cibernético documentado?", "1971", "1983", "1991", "2001", "a", 5, "q_1", null))
        question.add(PreguntasInfo(2, "¿Cuál fue el nombre del primer virus informático?", "Creeper", "ILOVEYOU", "Melissa", "Sasser", "a", 5, "q_2", null))
        question.add(PreguntasInfo(3, "¿Qué año se considera el inicio de la criptografía moderna?", "1976", "1980", "1990", "2000", "a", 5, "q_3", null))
        question.add(PreguntasInfo(4, "¿Qué empresa lanzó el primer antivirus comercial?", "Symantec", "McAfee", "Kaspersky", "Trend Micro", "b", 5, "q_4", null))
        question.add(PreguntasInfo(5, "¿Cuál fue el propósito principal del proyecto de ciberseguridad 'CTC' en la década de 1990?", "Desarrollar herramientas de cifrado", "Detectar ataques DDoS", "Proteger contra virus", "Investigar vulnerabilidades de red", "a", 5, "q_5", null))
        question.add(PreguntasInfo(6, "¿En qué año se creó el término 'phishing'?", "1996", "2000", "2003", "2006", "a", 5, "q_6", null))
        question.add(PreguntasInfo(7, "¿Qué famoso ataque a la seguridad se produjo en 2017 y afectó a miles de organizaciones en todo el mundo?", "WannaCry", "Stuxnet", "NotPetya", "Heartbleed", "a", 5, "q_7", null))
        question.add(PreguntasInfo(8, "¿Cuál de las siguientes es una técnica común de protección contra ataques de phishing?", "Autenticación de dos factores", "Uso de contraseñas simples", "Desactivar el antivirus", "Desactivar las actualizaciones de software", "a", 5, "q_8", null))
        question.add(PreguntasInfo(9, "¿Qué protocolo de seguridad de red fue diseñado para proteger la comunicación en internet en 1994?", "SSL", "HTTPS", "TLS", "IPsec", "a", 5, "q_9", null))
        question.add(PreguntasInfo(10, "¿Cuál fue el objetivo principal del virus 'ILOVEYOU' en el año 2000?", "Robar información personal", "Destruir datos en el disco duro", "Encriptar archivos para rescate", "Propagar mediante correo electrónico", "d", 5, "q_10", null))

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
