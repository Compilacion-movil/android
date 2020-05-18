package com.compilacionmovil.ejemplokoin

class MainPresenter(private val apiProvider: ApiProvider) {

    fun fetch() = apiProvider.fetchData()
}


class OtherMainPresenter(
    private val apiProvider: ApiProvider,
    private val activity: MainActivity,
    private val number: Int
) {

    fun fetch() = apiProvider.fetchDataWithActivity(activity, number)
}

