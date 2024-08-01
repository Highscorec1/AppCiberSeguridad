package com.example.aplicacionhack.ui.rulconsejos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.aplicacionhack.databinding.FragmentRulconsejosBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class rulconsejosFragment : Fragment() {

    private var _binding: FragmentRulconsejosBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRulconsejosBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}