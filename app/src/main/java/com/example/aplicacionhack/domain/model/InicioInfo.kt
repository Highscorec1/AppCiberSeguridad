package com.example.aplicacionhack.domain.model

import com.example.aplicacionhack.R

sealed class InicioInfo(val id: Int, val img: Int, val nombre: Int) {

    object Historia : InicioInfo(1, R.drawable.img12, R.string.Historia)
    object Leyes : InicioInfo(2, R.drawable.img2, R.string.Leyes)
    object SistemasOperativos : InicioInfo(3, R.drawable.img3, R.string.SistemasOperativos)
    object Sql : InicioInfo(4, R.drawable.img4, R.string.SQL)
    object Linux : InicioInfo(5, R.drawable.img5, R.string.LINUX)
    object Network : InicioInfo(6, R.drawable.img6, R.string.Network)
}

