package com.example.aplicacionhack.domain.model

import com.example.aplicacionhack.R

sealed class InicioInfo(val img:Int, val nombre:Int)  {

    object Historia:InicioInfo(R.drawable.icono1_1, R.string.Historia)
    object Leyes:InicioInfo(R.drawable.icono2, R.string.Leyes)
    object SistemasOperativos:InicioInfo(R.drawable.icon3, R.string.SistemasOperativos)
    object Sql:InicioInfo(R.drawable.logointro1, R.string.SQL)
    object Linux:InicioInfo(R.drawable.logointro1, R.string.LINUX)

}
