package com.example.feauture_auth.view.first_auth.ui.first_auth

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.core_database.dao.OfferDao
import com.example.core_database.dao.VacancyDao
import com.example.core_network.api.GoogleApi
import com.example.feauture_auth.view.first_auth.domain.Mapper.mapToEntity
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import java.util.regex.Matcher
import java.util.regex.Pattern
import javax.inject.Inject
import kotlin.random.Random


@HiltViewModel
class AuthViewModel @Inject constructor(
    private val googleApi: GoogleApi,
    private val dao: VacancyDao,
    private val offerDao: OfferDao,
) : ViewModel() {

    val email = MutableStateFlow<String>("")
    val emailValidator = MutableStateFlow<Boolean>(false)

    init {
        download()
    }

    private fun download() {
        viewModelScope.launch {
            runCatching {
                val response = googleApi.getJsonData()
                if (response.isSuccessful) {
                    response.body()?.let { item ->
                        item.vacancies.map { i ->
                            dao.insert(i.mapToEntity())
                        }
                        item.offers.map { o ->
                            offerDao.insertOffer(o.mapToEntity(i = Random.nextInt(0, 100000)))
                        }
                    }
                } else {
                    Log.d("GoogleApiError", "Error: ${response.message()}")
                }
            }.onFailure { Log.d("GoogleApiError", "Failed to fetch data: ${it.message}") }
        }
    }

    fun enterEmail(value: String) {
        email.value = value
        emailValidator.value = emailValidator(value)
    }

    private fun emailValidator(email: String): Boolean {
        val pattern: Pattern
        val EMAIL_PATTERN =
            "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"
        pattern = Pattern.compile(EMAIL_PATTERN)
        val matcher: Matcher = pattern.matcher(email)
        return matcher.matches()
    }

}