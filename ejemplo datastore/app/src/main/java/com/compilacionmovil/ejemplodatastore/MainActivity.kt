package com.compilacionmovil.ejemplodatastore

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {


    private var preferenceDataSource: PreferenceDataSource? = null
    private var protoDataSource: ProtoDataSource? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        preferenceDataSource = PreferenceDataSource(this)
        protoDataSource = ProtoDataSource(this)

        executePreferenceDataSourceExample()
        executeProtoDataSourceExample()

    }


    private fun executePreferenceDataSourceExample() {
        CoroutineScope(Dispatchers.Main).launch {
            preferenceDataSource?.saveData(5)
            val data = preferenceDataSource?.fetchData()
            data?.collect { value: Int ->
                preferences_data_value.text = "Dato guardado en Preference DataSource: $value"
            }
        }
    }


    private fun executeProtoDataSourceExample() {
        CoroutineScope(Dispatchers.Main).launch {
            protoDataSource?.saveData(8)
            val data = protoDataSource?.fetchData()
            data?.collect { value: Int ->
                proto_data_value.text = "Dato guardado en Proto DataSource: $value"
            }
        }
    }


}