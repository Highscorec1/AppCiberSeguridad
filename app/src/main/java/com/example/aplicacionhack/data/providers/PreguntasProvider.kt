package com.example.aplicacionhack.data

import com.example.aplicacionhack.domain.preguntasAdapter.PreguntasInfo
import javax.inject.Inject

class PreguntasProvider @Inject constructor(
    private val preguntasDataSource: PreguntasDataSource
) {

    fun obtenerPreguntasPorTema(id: Int): MutableList<PreguntasInfo> {
        return when (id) {
            1 -> preguntasDataSource.obtenerPreguntasHistoria()
            2 -> preguntasDataSource.obtenerPreguntasLeyes()
            3 -> preguntasDataSource.obtenerPreguntasSistemasOperativos()
            4 -> preguntasDataSource.obtenerPreguntasSQL()
            5 -> preguntasDataSource.obtenerPreguntasLinux()
            6 -> preguntasDataSource.obtenerPreguntasNetwork()
            else -> mutableListOf()
        }
    }
}
