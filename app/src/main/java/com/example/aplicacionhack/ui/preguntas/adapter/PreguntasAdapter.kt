package com.example.aplicacionhack.ui.preguntas.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.translation.ViewTranslationRequest
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.aplicacionhack.R
import com.example.aplicacionhack.databinding.ViewholderpreguntasBinding
import com.example.aplicacionhack.domain.preguntasAdapter.PreguntasInfo

class PreguntasAdapter (
    val respuestaCorrecta: String?,
    val usuario:MutableList<String> = mutableListOf(),
    var retornarPuntaje: puntaje,
) :RecyclerView.Adapter<PreguntasAdapter.Viewholder>(){
    interface puntaje{
        fun amount(numbre:Int, respuestaElegida: String)
    }



    private lateinit var binding: ViewholderpreguntasBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PreguntasAdapter.Viewholder {
        val inflater=LayoutInflater.from(parent.context)
        binding = ViewholderpreguntasBinding.inflate(inflater, parent, false)
        return Viewholder()
    }

    override fun onBindViewHolder(holder: PreguntasAdapter.Viewholder, position: Int) {
        val binding = ViewholderpreguntasBinding.bind(holder.itemView)
        binding.tvRespuestas.text=differ.currentList[position]
        var currectPos = 0
        when(respuestaCorrecta){

            "a" -> {currectPos = 0}
            "b" -> {currectPos = 1}
            "c" -> {currectPos = 2}
            "d" -> {currectPos = 3}


        }
        if(differ.currentList.size==5  && currectPos == position){

            binding.tvRespuestas.setBackgroundResource(R.drawable.cylindrical_backgroud_check_true)
            binding.tvRespuestas.setTextColor(ContextCompat.getColor(binding.root.context, R.color.plomoclaro))

            val drawable = ContextCompat.getDrawable(binding.root.context,R.drawable.tick)
            binding.tvRespuestas.setCompoundDrawablesRelativeWithIntrinsicBounds(null,null,drawable, null)

        }

        if(differ.currentList.size==5){
            var clickedPos = 0
            when (differ.currentList[4]){

                "a" -> {clickedPos = 0}
                "b" -> {clickedPos = 1}
                "c" -> {clickedPos = 2}
                "d" -> {clickedPos = 3}

            }


            if(clickedPos==position && clickedPos!= currectPos){


                    binding.tvRespuestas.setBackgroundResource(R.drawable.cylindrical_background_check_false)
                    binding.tvRespuestas.setTextColor(ContextCompat.getColor(binding.root.context, R.color.plomoclaro))

                    val drawable = ContextCompat.getDrawable(binding.root.context,R.drawable.thieves)
                    binding.tvRespuestas.setCompoundDrawablesRelativeWithIntrinsicBounds(null,null,drawable, null)

            }

        }

        if(position==4){
            binding.root.visibility = View.GONE
        }

        holder.itemView.setOnClickListener{

            var str = ""
            when(position){
                0 -> {str="a"}
                1 -> {str="b"}
                2 -> {str="c"}
                3 -> {str="d"}

            }


            usuario.add(4,str)
            notifyDataSetChanged()


            if(currectPos==position) {

                binding.tvRespuestas.setBackgroundResource(R.drawable.cylindrical_backgroud_check_true)
                binding.tvRespuestas.setTextColor(
                    ContextCompat.getColor(
                        binding.root.context,
                        R.color.plomoclaro
                    )
                )

                val drawable = ContextCompat.getDrawable(binding.root.context, R.drawable.tick)
                binding.tvRespuestas.setCompoundDrawablesRelativeWithIntrinsicBounds(
                    null,
                    null,
                    drawable,
                    null
                )
                retornarPuntaje.amount(5,str)

            }else{

                binding.tvRespuestas.setBackgroundResource(R.drawable.cylindrical_background_check_false)
                binding.tvRespuestas.setTextColor(ContextCompat.getColor(binding.root.context, R.color.plomoclaro))

                val drawable = ContextCompat.getDrawable(binding.root.context,R.drawable.thieves)
                binding.tvRespuestas.setCompoundDrawablesRelativeWithIntrinsicBounds(null,null,drawable, null)

                retornarPuntaje.amount(0,str)
            }
        }

        if(differ.currentList.size==5) holder.itemView.setOnClickListener(null)

    }

    override fun getItemCount() = differ.currentList.size

    inner class Viewholder : RecyclerView.ViewHolder(binding.root)

    private val differCallback = object : DiffUtil.ItemCallback<String>(){
        override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem:String, newItem:String): Boolean {
            return oldItem == newItem
        }

    }

    val differ = AsyncListDiffer(this,differCallback)
}