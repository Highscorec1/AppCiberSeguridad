package com.example.aplicacionhack.ui.iniciomenu

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.aplicacionhack.databinding.FragmentIniciomenuBinding
import com.example.aplicacionhack.ui.iniciomenu.adapter.InicioAdapter
import com.example.aplicacionhack.ui.preguntas.PreguntasActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class IniciomenuFragment : Fragment() {

    private val inicioViewModel by viewModels<InicioViewModel>()
    private lateinit var inicioadapter: InicioAdapter
    private var _binding: FragmentIniciomenuBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
    }

    private fun initUI() {
        initRecyclerView()
        initUIState()
    }

    private fun initRecyclerView() {
        inicioadapter = InicioAdapter(onItemSelected = { inicioInfo ->
            val intent = Intent(requireContext(), PreguntasActivity::class.java)
            intent.putExtra("item_id", inicioInfo.id)
            startActivity(intent)
        })

        binding.rvIniciomenu.apply {
            layoutManager = GridLayoutManager(context, 2)
            adapter = inicioadapter
        }
    }

    private fun initUIState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                inicioViewModel.iniciomenu.collect {
                    inicioadapter.updateList(it)
                }
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentIniciomenuBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}
