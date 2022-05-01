package com.example.m4s4viewmodelmvvmapi03.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.m4s4viewmodelmvvmapi03.repository.interactor.NoticiasInteractor
import com.example.m4s4viewmodelmvvmapi03.repository.retrofit.Noticias
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ViewModel: ViewModel() {

    val noticias: MutableLiveData<Noticias> = MutableLiveData()
    val interactor = NoticiasInteractor()

    fun onBtnTraerNoticias(){
        CoroutineScope(Dispatchers.IO).launch {
            noticias.postValue(interactor.traerRespuesta("es"))
        }
    }

}