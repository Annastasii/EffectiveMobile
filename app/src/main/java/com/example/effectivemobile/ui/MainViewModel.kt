package com.example.effectivemobile.ui

import androidx.lifecycle.ViewModel
import com.example.core_database.dao.VacancyDao
import com.example.core_network.api.GoogleApi
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val googleApi: GoogleApi,
    private val dao: VacancyDao,
) : ViewModel() {


}