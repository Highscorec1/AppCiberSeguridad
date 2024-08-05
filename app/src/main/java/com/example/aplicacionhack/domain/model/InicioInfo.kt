package com.example.aplicacionhack.domain.model

import com.example.aplicacionhack.R

sealed class InicioInfo(val img:Int, val nombre:Int)  {

    object Historia:InicioInfo(R.drawable.images5, R.string.Historia)
    object Leyes:InicioInfo(R.drawable.images5, R.string.Leyes)
    object SistemasOperativos:InicioInfo(R.drawable.images5, R.string.SistemasOperativos)
    object Sql:InicioInfo(R.drawable.images4, R.string.SQL)
    object Linux:InicioInfo(R.drawable.images5, R.string.LINUX)

}
