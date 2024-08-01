package com.example.aplicacionhack.ui.iniciomenu.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.aplicacionhack.R
import com.example.aplicacionhack.domain.model.InicioInfo

class InicioAdapter(private var iniciomenuList: List<InicioInfo> = emptyList()) :
    RecyclerView.Adapter<InicioViewHolder>() {

    @SuppressLint("NotifyDataSetChanged")
    fun updateList(list: List<InicioInfo>) {
        iniciomenuList = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InicioViewHolder {
        return InicioViewHolder(

            LayoutInflater.from(parent.context).inflate(R.layout.item_iniciomenu, parent, false)

        )
    }

    override fun getItemCount() = iniciomenuList.size

    override fun onBindViewHolder(holder: InicioViewHolder, position: Int) {

        holder.render(iniciomenuList[position])

    }

}