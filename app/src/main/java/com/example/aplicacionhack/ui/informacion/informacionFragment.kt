package com.example.aplicacionhack.ui.informacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.aplicacionhack.R
import com.example.aplicacionhack.databinding.FragmentInformacionBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class informacionFragment : Fragment() {

    private var _binding: FragmentInformacionBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentInformacionBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}