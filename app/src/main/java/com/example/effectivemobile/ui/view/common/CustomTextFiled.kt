package com.example.effectivemobile.ui.view.common

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.core_ui.AppColor
import com.example.core_ui.AppFontStyle
import com.example.core_ui.Padding

@Composable
fun CustomTextFiled(
    placeholder: String,
    value: String,
    underText: String = "",
    needUnderText: Boolean = false,
    onEnterValue: () -> Unit,
) {
    TextField(
        value = value, onValueChange = { onEnterValue() },
        modifier = Modifier
            .clip(RoundedCornerShape(5.dp))
            .fillMaxWidth()
            .height(Padding._53)
            .border(
                shape = RoundedCornerShape(5.dp),
                color = AppColor.BorderColor,
                width = Padding._1
            ),
        placeholder = {
            Text(
                text = placeholder,
                style = AppFontStyle.regular_16,
                color = AppColor.SecondaryTextColor
            )
        },
        textStyle = AppFontStyle.regular_16,
        colors = TextFieldDefaults.colors(
            focusedContainerColor = AppColor.BgColor,
            unfocusedContainerColor = AppColor.BgColor,
            focusedTextColor = AppColor.PrimaryTextColor,
            unfocusedTextColor = AppColor.PrimaryTextColor,
            focusedIndicatorColor = AppColor.BgColor,
            unfocusedIndicatorColor = AppColor.BgColor
        )
    )
    if (needUnderText) {
        Spacer(modifier = Modifier.height(Padding._8))
        Text(
            text = underText,
            color = AppColor.SecondaryTextColor,
            style = AppFontStyle.regular_12,
            modifier = Modifier.padding(start = Padding._16)
        )
    }
}
