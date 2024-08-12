package com.example.aplicacionhack.domain.usecase

import com.example.aplicacionhack.domain.preguntasAdapter.PreguntasInfo
import com.google.firebase.firestore.FirebaseFirestore
import javax.inject.Inject

class CargarPreguntasUseCase @Inject constructor() {

    private val db = FirebaseFirestore.getInstance()

    fun execute(onSuccess: (List<PreguntasInfo>) -> Unit, onFailure: (Exception) -> Unit) {
        db.collection("questions")
            .get()
            .addOnSuccessListener { result ->
                val questionsList = mutableListOf<PreguntasInfo>()
                for (document in result) {
                    val pregunta = document.toObject(PreguntasInfo::class.java)
                    questionsList.add(pregunta)
                }
                onSuccess(questionsList)
            }
            .addOnFailureListener { exception ->
                onFailure(exception)
            }
    }
}
