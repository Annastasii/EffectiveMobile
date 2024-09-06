package com.example.feature_vacancies.ui.list_vacancies

import androidx.lifecycle.ViewModel
import com.example.core_database.dao.OfferDao
import com.example.core_database.dao.VacancyDao
import com.example.feature_vacancies.domain.Mapper.mapToModel
import com.example.feature_vacancies.domain.models.OfferModel
import com.example.feature_vacancies.domain.models.VacancyModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject


@HiltViewModel
class VacanciesListViewModel @Inject constructor(
    private val dao: VacancyDao,
    private val offerDao: OfferDao,
) : ViewModel() {

    val vacancyList: StateFlow<List<VacancyModel>> get() = _vacancyList.asStateFlow()
    private val _vacancyList = MutableStateFlow<List<VacancyModel>>(emptyList())

    val offerList: StateFlow<List<OfferModel>> get() = _offerList.asStateFlow()
    private val _offerList = MutableStateFlow<List<OfferModel>>(emptyList())

    init {
        getList()
    }

    private fun getList() {
        _vacancyList.value = dao.getVacancyList().map { it.mapToModel() }
        _offerList.value = offerDao.getOffers().map { it.mapToModel() }
    }

    fun changeFavourite(id: String, isFavourite: Boolean) {
        dao.updateFavourite(id, isFavourite)
    }
}