package com.example.aplicacionhack.ui.iniciomenu

import androidx.lifecycle.ViewModel
import com.example.aplicacionhack.data.providers.InicioProvider
import com.example.aplicacionhack.domain.model.InicioInfo
import com.example.aplicacionhack.domain.model.InicioInfo.Historia
import com.example.aplicacionhack.domain.model.InicioInfo.Leyes
import com.example.aplicacionhack.domain.model.InicioInfo.SistemasOperativos
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class InicioViewModel @Inject constructor(inicioProvider: InicioProvider) : ViewModel() {

    //creo una stateFlow para conectar mi fragment con mi viewModel e InicioInfo

    private var _iniciomenu = MutableStateFlow<List<InicioInfo>>(emptyList())

    val iniciomenu: StateFlow<List<InicioInfo>> = _iniciomenu

    init {

        _iniciomenu.value = inicioProvider.getHoroscopes()



    }

}