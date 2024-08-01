package com.example.aplicacionhack.ui.iniciomenu.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.aplicacionhack.databinding.ItemIniciomenuBinding
import com.example.aplicacionhack.domain.model.InicioInfo

class InicioViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemIniciomenuBinding.bind(view)

    fun render(inicioInfo: InicioInfo){
        val context = binding.tvInicioMenu.context
        binding.ivInicioMenu.setImageResource(inicioInfo.img)
        binding.tvInicioMenu.text = context.getString(inicioInfo.nombre)

    }
}