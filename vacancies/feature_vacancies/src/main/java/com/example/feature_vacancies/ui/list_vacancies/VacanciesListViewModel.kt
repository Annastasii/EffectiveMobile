package com.example.feature_vacancies.ui.list_vacancies

//
//@HiltViewModel
//class VacanciesListViewModel @Inject constructor(
//    private val googleApi: GoogleApi,
//) : ViewModel() {
//
//    /** Список дефектов */
//    val vacancyList: StateFlow<List<VacancyModel>> get() = _defectList.asStateFlow()
//    private val _defectList = MutableStateFlow<List<VacancyModel>>(emptyList())
//    init {
//
//    }
//
//    private fun downlod() {
//        viewModelScope.launch {
//            try {
//                val response = googleApi.getJsonData()
//                if (response.isSuccessful) {
//                    response.body()?.let {
//                        it.vacancies.forEach { item ->
//
//                        }
//                        it.offers.forEach { offer ->
//
//                        }
//                    }
//                } else {
//                    Log.d("GoogleApiError", "Error: ${response.message()}")
//                }
//            } catch (e: Exception) {
//                Log.d("GoogleApiError", "Failed to fetch data: ${e.message}")
//            }
//        }
//    }
//}