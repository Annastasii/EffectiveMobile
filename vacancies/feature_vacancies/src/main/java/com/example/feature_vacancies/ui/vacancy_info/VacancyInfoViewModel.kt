package com.example.feature_vacancies.ui.vacancy_info

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.core_database.dao.VacancyDao
import com.example.core_navigation.routes.VacancyInfoDestination
import com.example.feature_vacancies.domain.Mapper.mapToModel
import com.example.feature_vacancies.domain.models.VacancyModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class VacancyInfoViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val dao: VacancyDao,
) : ViewModel() {

    var id = savedStateHandle.get<String>(VacancyInfoDestination.ID)!!

    val vacancy: StateFlow<VacancyModel?> get() = _vacancy.asStateFlow()
    private val _vacancy = MutableStateFlow<VacancyModel?>(null)

    init {
        getVacancy()
    }

    private fun getVacancy() {
        _vacancy.value = dao.getVacancy(id).mapToModel()
    }
}