package com.compilacionmovil.ejemplokoin

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class MainActivity : AppCompatActivity() {

    private val presenter: MainPresenter by inject()

    private val otherPresenter: OtherMainPresenter by inject { parametersOf(this@MainActivity, 3) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fetchData()
    }

    private fun fetchData() {
        val result = presenter.fetch()
        showAlertWithData(result)
    }

    private fun showAlertWithData(message: String) {

        val alertBuilder = AlertDialog.Builder(this).apply {
            title = "Hello Koin"
            setMessage(message)
        }
        alertBuilder.create().show()
    }
}
