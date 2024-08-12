package com.example.aplicacionhack.domain.manager

import android.content.Context
import android.content.Intent
import android.widget.Toast
import com.example.aplicacionhack.domain.preguntasAdapter.PreguntasInfo
import com.example.aplicacionhack.ui.preguntas.PreguntasActivity
import com.google.firebase.firestore.FirebaseFirestore

class CategoriaPreguntasManager(private val context: Context) {

    fun cargarPreguntasPorCategoria(categoria: String) {
        val db = FirebaseFirestore.getInstance()

        db.collection("questions")
            .whereEqualTo("categoria", categoria) // Asegúrate de que exista este campo en Firestore
            .get()
            .addOnSuccessListener { result ->
                val questionsList = mutableListOf<PreguntasInfo>()
                for (document in result) {
                    val question = document.toObject(PreguntasInfo::class.java)
                    questionsList.add(question)
                }
                navegarAPreguntasActivity(questionsList)
            }
            .addOnFailureListener { exception ->
                Toast.makeText(context, "Error al cargar preguntas: ${exception.message}", Toast.LENGTH_LONG).show()
            }
    }

    private fun navegarAPreguntasActivity(questionsList: List<PreguntasInfo>) {
        val intent = Intent(context, PreguntasActivity::class.java)
        intent.putParcelableArrayListExtra("list", ArrayList(questionsList))
        context.startActivity(intent)
    }
}
