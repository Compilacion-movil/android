package com.compilacionmovil.ejemplodatastore

import androidx.appcompat.app.AppCompatActivity
import androidx.datastore.DataStore
import androidx.datastore.preferences.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class PreferenceDataSource(private val activity: AppCompatActivity) {


    private val dataStore: DataStore<Preferences> = activity.createDataStore(
        name = "settings"
    )


    companion object {
        val DAY_OF_MONTH = preferencesKey<Int>("day_of_month")
    }


     suspend fun saveData(value: Int) {
        dataStore.edit { mutablePreferences: MutablePreferences ->
            mutablePreferences[DAY_OF_MONTH] = value
        }
    }

     fun fetchData(): Flow<Int> {
        return dataStore.data.map { value: Preferences ->
            value[DAY_OF_MONTH] ?: 0
        }
    }

}