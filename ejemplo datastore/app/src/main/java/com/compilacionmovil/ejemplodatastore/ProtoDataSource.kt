package com.compilacionmovil.ejemplodatastore

import androidx.appcompat.app.AppCompatActivity
import androidx.datastore.DataStore
import androidx.datastore.createDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class ProtoDataSource(private val activity: AppCompatActivity) {

    private val dataStore: DataStore<SchemeProtoDataSource> = activity.createDataStore(
        fileName = "schemeProtoDataSource.proto",
        serializer = ProtoDataSourceSerializer
    )



    suspend fun saveData(value: Int) {
        dataStore.updateData { currentSettings ->
            currentSettings.toBuilder().setDayOfMonth(value)
                .build()
        }
    }

    fun fetchData(): Flow<Int> {
        return dataStore.data
            .map { settings ->
                settings.dayOfMonth
            }
    }


}