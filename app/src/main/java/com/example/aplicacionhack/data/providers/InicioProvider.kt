package com.example.aplicacionhack.data.providers

import com.example.aplicacionhack.domain.model.InicioInfo
import com.example.aplicacionhack.domain.model.InicioInfo.*
import javax.inject.Inject

//Esta es una clase que nos provee la informacion desde capa de data

class InicioProvider @Inject constructor(){
    fun getHoroscopes(): List<InicioInfo>{
        return listOf(

            Historia,
            Leyes,
            SistemasOperativos,
            Network,
            Sql,
            Linux,



        )

    }

}