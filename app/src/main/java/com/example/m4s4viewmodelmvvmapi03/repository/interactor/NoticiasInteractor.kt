package com.example.m4s4viewmodelmvvmapi03.repository.interactor

import com.example.m4s4viewmodelmvvmapi03.repository.retrofit.Noticias
import com.example.m4s4viewmodelmvvmapi03.repository.retrofit.NoticiasAPIService
import com.example.m4s4viewmodelmvvmapi03.repository.retrofit.RestEngine
import retrofit2.Call

class NoticiasInteractor {

    fun traerRespuesta(languages: String): Noticias?{
        val llamada: NoticiasAPIService =
            RestEngine.getRestEngine().create(NoticiasAPIService::class.java)
        val resultado: Call<Noticias> = llamada.obtenerNoticias(languages)
        val p: Noticias? = resultado.execute().body()

        return p
    }

}