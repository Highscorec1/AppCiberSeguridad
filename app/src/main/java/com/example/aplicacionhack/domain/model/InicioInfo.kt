package com.example.aplicacionhack.domain.model

import com.example.aplicacionhack.R

sealed class InicioInfo(val img:Int, val nombre:Int)  {

    object Historia:InicioInfo(R.drawable.img12, R.string.Historia)
    object Leyes:InicioInfo(R.drawable.img2, R.string.Leyes)
    object SistemasOperativos:InicioInfo(R.drawable.img3, R.string.SistemasOperativos)
    object Sql:InicioInfo(R.drawable.img4, R.string.SQL)
    object Linux:InicioInfo(R.drawable.img5, R.string.LINUX)
    object Network:InicioInfo(R.drawable.img6, R.string.Network)

}
