package com.example.feauture_auth.view.first_auth.ui.pin_code.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import com.example.core_ui.Padding
import com.example.feauture_auth.view.first_auth.domain.Constants

@Composable
fun PinCodeTextField() {
    //todo
    val newPin = "444"

    val newPinFocusRequester = remember { FocusRequester() }
    BasicTextField(
        modifier = Modifier
            .fillMaxWidth()
            .focusRequester(newPinFocusRequester),
        value = TextFieldValue(newPin, selection = TextRange(newPin.length)),
        onValueChange = {
            if (it.text.length <= Constants.PIN_COUNT) {
//                        onEditPin(it.text)
            }
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword),
        decorationBox = {
            Row(horizontalArrangement = Arrangement.Center) {
                repeat(Constants.PIN_COUNT) { index ->
                    CharView(index = index, text = newPin)
                    Spacer(modifier = Modifier.width(Padding._16))
                }
            }
        }
    )
}