package com.example.feauture_auth.view.first_auth.ui.first_auth

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import java.util.regex.Matcher
import java.util.regex.Pattern
import javax.inject.Inject


@HiltViewModel
class AuthViewModel @Inject constructor(
) : ViewModel() {

    val email = MutableStateFlow<String>("")
    val emailValidator = MutableStateFlow<Boolean>(false)

    fun enterEmail(value: String) {
        email.value = value
        emailValidator.value =  emailValidator(value)
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