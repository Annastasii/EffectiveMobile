package com.example.effectivemobile.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.core_network.api.GoogleApi
import com.example.core_network.dto.dtoi.DataDTOI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val googleApi: GoogleApi,
) : ViewModel() {

    private val _jsonData = MutableLiveData<DataDTOI>()
    val jsonData: LiveData<DataDTOI> get() = _jsonData

    private val _error = MutableLiveData<String>()
    val error: LiveData<String> get() = _error

    fun fetchJsonData() {
        viewModelScope.launch {
            try {
                val response = googleApi.getJsonData()
                if (response.isSuccessful) {
                    _jsonData.postValue(response.body())
                } else {
                    _error.postValue("Error: ${response.message()}")
                }
            } catch (e: Exception) {
                _error.postValue("Failed to fetch data: ${e.message}")

            }
        }
    }
}