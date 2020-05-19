package com.compilacionmovil.ejemplokoin

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class KoinApplication: Application() {


    override fun onCreate() {
        super.onCreate()
        startKoin{
            //nos ayuda a ver posibles errores
            androidLogger()
            // por aquí le pasamos al injetor la referencia del contexto de nuestra app para que después él nos la provea donde nos haga falta
            androidContext(this@KoinApplication)
            // añadimos nuestros módulos donde definimos las  dependencias
            modules(presenterModule, providersModule)
        }
    }
}


