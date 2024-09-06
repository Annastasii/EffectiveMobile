package com.example.feature_vacancies.ui.favourite

import androidx.lifecycle.ViewModel
import com.example.core_database.dao.VacancyDao
import com.example.core_network.api.GoogleApi
import com.example.feature_vacancies.domain.Mapper.mapToModel
import com.example.feature_vacancies.domain.models.VacancyModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class FavouriteListViewModel @Inject constructor(
    private val googleApi: GoogleApi,
    private val dao: VacancyDao,
) : ViewModel() {
    val vacancyList: StateFlow<List<VacancyModel>> get() = _vacancyList.asStateFlow()
    private val _vacancyList = MutableStateFlow<List<VacancyModel>>(emptyList())

    init {
        getList()
    }

    private fun getList() {
        _vacancyList.value = dao.getVacancyList().map { it.mapToModel() }.filter { it.isFavorite }
    }

    fun changeFavourite(id: String, isFavourite: Boolean) {
        dao.updateFavourite(id, isFavourite)
    }
}