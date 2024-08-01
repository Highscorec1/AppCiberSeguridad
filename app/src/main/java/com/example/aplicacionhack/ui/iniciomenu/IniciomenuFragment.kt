package com.example.aplicacionhack.ui.iniciomenu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.aplicacionhack.databinding.FragmentIniciomenuBinding
import com.example.aplicacionhack.ui.iniciomenu.adapter.InicioAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class IniciomenuFragment : Fragment() {


    //Conectar DagerHilt el iniciomenuFragment con el inicioViewModel
    private val inicioViewModel by viewModels<InicioViewModel>()

    //seteamos el adapter
    private lateinit var inicioadapter: InicioAdapter


    private var _binding: FragmentIniciomenuBinding? = null
    private val binding get() = _binding!!


    //Segun el clico de vida un fragment vamos a crear un onViewCreated

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        initUI()

    }

    private fun initUI() {

        initRecyclerView()

        initUIState()

    }

    private fun initRecyclerView() {

        inicioadapter = InicioAdapter()

        binding.rvIniciomenu.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = inicioadapter
        }

    }

    private fun initUIState() {
        //Coorutinas para gestionar hilos que se refiere a los procesos
        //implementamos lifecyclescope ya que esta se engancha al ciclo de vida del fragmento
        //este hilo muere cuando el fragmento muere, recomendacion usar este cuando se trate de un fragment o un Activity
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {

                inicioViewModel.iniciomenu.collect {
                    //en este punto se prensento un error en dagerhillt veremos si es por que la estructura no estaba armada
                    //cada que se modifique el view model se llamara esta linea 56
                    //Cambios en iniciomenu
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