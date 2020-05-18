package com.compilacionmovil.ejemplokoin

import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val presenterModule = module{

    single { MainPresenter(get()) }
    single { (activity: MainActivity, number: Int) -> OtherMainPresenter(get(), activity, number)  }
}

val providersModule = module{

    single { ApiProvider(androidApplication()) }
}