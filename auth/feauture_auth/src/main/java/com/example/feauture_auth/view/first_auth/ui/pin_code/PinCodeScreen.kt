package com.example.feauture_auth.view.first_auth.ui.pin_code

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.core_ui.CustomColor
import com.example.core_ui.FontStyle
import com.example.core_ui.Padding
import com.example.feauture_auth.R
import com.example.feauture_auth.view.first_auth.domain.Constants.PIN_COUNT
import com.example.feauture_auth.view.first_auth.ui.pin_code.view.CharView

@Composable
fun PinCodeScreen(navController: NavController) {
    //todo
    val newPin = "444"

    val newPinFocusRequester = remember { FocusRequester() }
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize().background(CustomColor.PrimaryBgColor),
    ) {
        Column(modifier = Modifier.padding(Padding._16)) {
            Text(
                text = stringResource(id = R.string.send, "example@mail.ru"),
                color = CustomColor.TextColor,
                style = FontStyle.Style_20
            )
            Spacer(modifier = Modifier.height(Padding._16))
            Text(
                text = stringResource(id = R.string.write_pin_code),
                color = CustomColor.TextColor,
                style = FontStyle.Style_14
            )
            Spacer(modifier = Modifier.height(Padding._16))
            BasicTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .focusRequester(newPinFocusRequester),
                value = TextFieldValue(newPin, selection = TextRange(newPin.length)),
                onValueChange = {
                    if (it.text.length <= PIN_COUNT) {
//                        onEditPin(it.text)
                    }
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword),
                decorationBox = {
                    Row(horizontalArrangement = Arrangement.Center) {
                        repeat(PIN_COUNT) { index ->
                            CharView(index = index, text = newPin)
                            Spacer(modifier = Modifier.width(Padding._16))
                        }
                    }
                }
            )
            Spacer(modifier = Modifier.height(Padding._16))
            Button(
                onClick = { },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(Padding._48),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = CustomColor.ActiveButtonColor,
                    disabledContainerColor = CustomColor.NotActiveButtonColor,
                    contentColor = CustomColor.TextColor,
                    disabledContentColor = CustomColor.NotActiveTextColor
                )
            ) {
                Text(
                    text = stringResource(R.string.confirm),
                    fontSize = 14.sp
                )
            }
        }
    }
}