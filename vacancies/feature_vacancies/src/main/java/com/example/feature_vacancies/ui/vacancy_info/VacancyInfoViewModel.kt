package com.example.feature_vacancies.ui.vacancy_info

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.core_navigation.routes.VacancyInfoDestination
import com.example.core_network.api.GoogleApi
import com.example.feature_vacancies.domain.Mapper.mapToData
import com.example.feature_vacancies.domain.models.VacancyModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class VacancyInfoViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val googleApi: GoogleApi,
) : ViewModel() {

    var id = savedStateHandle.get<String>(VacancyInfoDestination.ID)!!

    val vacancy: StateFlow<VacancyModel?> get() = _vacancy.asStateFlow()
    private val _vacancy = MutableStateFlow<VacancyModel?>(null)

    init {
        downlod()
    }

    private fun downlod() {
        viewModelScope.launch {
            try {
                val response = googleApi.getJsonData()
                if (response.isSuccessful) {
                    response.body()?.let { item ->
                        _vacancy.value =
                            item.vacancies.map { it.mapToData() }.filter { it.id == id }.first()
                    }
                } else {
                    Log.d("GoogleApiError", "Error: ${response.message()}")
                }
            } catch (e: Exception) {
                Log.d("GoogleApiError", "Failed to fetch data: ${e.message}")
            }
        }
    }

}