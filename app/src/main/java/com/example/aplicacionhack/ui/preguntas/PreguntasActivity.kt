package com.example.aplicacionhack.ui.preguntas

import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.example.aplicacionhack.R
import com.example.aplicacionhack.data.PreguntasProvider
import com.example.aplicacionhack.databinding.ActivityPreguntasMainBinding
import com.example.aplicacionhack.domain.preguntasAdapter.PreguntasInfo
import com.example.aplicacionhack.ui.preguntas.adapter.PreguntasAdapter
import com.example.aplicacionhack.ui.puntajeacti.PuntajeActivity
import com.google.firebase.storage.FirebaseStorage

class PreguntasActivity : AppCompatActivity(), PreguntasAdapter.puntaje {

    private lateinit var binding: ActivityPreguntasMainBinding
    private var position: Int = 0
    private lateinit var receiverList: MutableList<PreguntasInfo>
    private var totalPuntaje = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPreguntasMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val window: Window = this@PreguntasActivity.window
        window.statusBarColor = ContextCompat.getColor(this@PreguntasActivity, R.color.plomoclaro)

        // Obtén el id del tema desde el Intent
        val temaId = intent.getIntExtra("item_id", -1)
        if (temaId == -1) {
            Toast.makeText(this, "No se pudo identificar el tema", Toast.LENGTH_LONG).show()
            finish()
            return
        }

        // Obtén la lista de preguntas según el tema
        receiverList = PreguntasProvider().obtenerPreguntasPorTema(temaId)

        if (receiverList.isEmpty()) {
            Toast.makeText(this, "No se encontraron preguntas", Toast.LENGTH_LONG).show()
            finish()
            return
        }

        setupUI()
    }

    private fun setupUI() {
        binding.apply {
            ivBackBtm.setOnClickListener { finish() }
            pbPregunta.progress = 1

            updateUI()

            ivRightArrow.setOnClickListener {
                if (pbPregunta.progress == 10) {
                    val intent = Intent(this@PreguntasActivity, PuntajeActivity::class.java)
                    intent.putExtra("Puntejae", totalPuntaje)
                    startActivity(intent)
                    finish()
                    return@setOnClickListener
                }
                position++
                pbPregunta.progress += 1
                updateUI()
            }

            ivLefArrow.setOnClickListener {
                if (pbPregunta.progress == 1) return@setOnClickListener
                position--
                pbPregunta.progress -= 1
                updateUI()
            }
        }
    }

    private fun updateUI() {
        binding.apply {
            tvPregunta.text = receiverList[position].pregunta
            tvNumeroPreguntatxt.text = "Pregunta ${pbPregunta.progress} / 10"

            val imagePath = receiverList[position].picPath
            if (!imagePath.isNullOrEmpty()) {
                val storageRef = FirebaseStorage.getInstance().reference.child("images/$imagePath")
                storageRef.downloadUrl.addOnSuccessListener { uri ->
                    Glide.with(this@PreguntasActivity)
                        .load(uri)
                        .centerCrop()
                        .apply(RequestOptions.bitmapTransform(RoundedCorners(60)))
                        .into(ivPreguntas)
                }.addOnFailureListener {
                    ivPreguntas.setImageResource(R.drawable.imagen_por_defecto)
                }
            } else {
                ivPreguntas.setImageResource(R.drawable.imagen_por_defecto)
            }

            cargarPreguntas()
        }
    }

    private fun cargarPreguntas() {
        val users: MutableList<String> = mutableListOf(
            receiverList[position].respuesta_1.orEmpty(),
            receiverList[position].respuesta_2.orEmpty(),
            receiverList[position].respuesta_3.orEmpty(),
            receiverList[position].respuesta_4.orEmpty()
        )

        val preguntasAdapter by lazy {
            PreguntasAdapter(receiverList[position].respuestaCorrecta.orEmpty(), users, this)
        }

        preguntasAdapter.differ.submitList(users)
        binding.rvPreguntas.apply {
            layoutManager = LinearLayoutManager(this@PreguntasActivity)
            adapter = preguntasAdapter
        }
    }

    override fun amount(numbre: Int, respuestaElegida: String) {
        totalPuntaje += numbre
        receiverList[position].respuestaElegida = respuestaElegida
    }
}
