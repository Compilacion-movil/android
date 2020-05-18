package com.compilacionmovil.ejemplokoin

import android.content.Context

class ApiProvider(private val context: Context) {

    fun fetchData() = "Remote data from webservice"

    fun fetchDataWithActivity(activity: MainActivity, number: Int) = "Remote other data from webservice"

    fun otherFetchWithContext(){
        //si aquí necesitásemos el contexto
        //solo hay que utilizarlo ya que lo tenemos disponible gracias a la
        //inyección por el contructor
    }
}