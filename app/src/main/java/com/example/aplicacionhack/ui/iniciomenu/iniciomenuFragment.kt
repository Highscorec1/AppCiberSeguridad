package com.example.aplicacionhack.ui.iniciomenu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.aplicacionhack.databinding.FragmentIniciomenuBinding


class iniciomenuFragment : Fragment() {

    private var _binding: FragmentIniciomenuBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentIniciomenuBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}