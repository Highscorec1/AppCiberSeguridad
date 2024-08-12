package com.example.aplicacionhack.domain.preguntasAdapter

import android.os.Parcel
import android.os.Parcelable

data class PreguntasInfo(val id: Int,
                         val pregunta: String?,
                         val respuesta_1:String?,
                         val respuesta_2: String?,
                         val respuesta_3: String?,
                         val respuesta_4: String?,
                         val respuestaCorrecta: String?,
                         val puntaje: Int,
                         val picPath: String?,
                         var respuestaElegida: String?,
    ): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(pregunta)
        parcel.writeString(respuesta_1)
        parcel.writeString(respuesta_2)
        parcel.writeString(respuesta_3)
        parcel.writeString(respuesta_4)
        parcel.writeString(respuestaCorrecta)
        parcel.writeInt(puntaje)
        parcel.writeString(picPath)
        parcel.writeString(respuestaElegida)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PreguntasInfo> {
        override fun createFromParcel(parcel: Parcel): PreguntasInfo {
            return PreguntasInfo(parcel)
        }

        override fun newArray(size: Int): Array<PreguntasInfo?> {
            return arrayOfNulls(size)
        }
    }


}