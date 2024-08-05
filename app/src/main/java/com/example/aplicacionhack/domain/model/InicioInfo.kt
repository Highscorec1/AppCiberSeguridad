package com.example.aplicacionhack.domain.model

import com.example.aplicacionhack.R

sealed class InicioInfo(val img:Int, val nombre:Int)  {

    object Historia:InicioInfo(R.drawable.img12, R.string.Historia)
    object Leyes:InicioInfo(R.drawable.img2, R.string.Leyes)
    object SistemasOperativos:InicioInfo(R.drawable.img3, R.string.SistemasOperativos)
    object Sql:InicioInfo(R.drawable.img42, R.string.SQL)
    object Linux:InicioInfo(R.drawable.img9, R.string.LINUX)

}
