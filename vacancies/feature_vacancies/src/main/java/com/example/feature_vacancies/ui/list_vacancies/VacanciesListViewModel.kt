package com.example.feature_vacancies.ui.list_vacancies

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.core_network.api.GoogleApi
import com.example.feature_vacancies.domain.Mapper.mapToData
import com.example.feature_vacancies.domain.models.OfferModel
import com.example.feature_vacancies.domain.models.VacancyModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class VacanciesListViewModel @Inject constructor(
    private val googleApi: GoogleApi,
) : ViewModel() {

    val vacancyList: StateFlow<List<VacancyModel>> get() = _vacancyList.asStateFlow()
    private val _vacancyList = MutableStateFlow<List<VacancyModel>>(emptyList())

    val offerList: StateFlow<List<OfferModel>> get() = _offerList.asStateFlow()
    private val _offerList = MutableStateFlow<List<OfferModel>>(emptyList())

    init {
        downlod()
    }

    private fun downlod() {
        viewModelScope.launch {
            try {
                val response = googleApi.getJsonData()
                if (response.isSuccessful) {
                    response.body()?.let { item ->
                        _offerList.value = item.offers.map { it.mapToData() }
                        _vacancyList.value = item.vacancies.map { it.mapToData() }
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