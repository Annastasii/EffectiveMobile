package com.example.effectivemobile.ui.view.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.core_ui.AppColor
import com.example.core_ui.AppFontStyle
import com.example.core_ui.Padding

@Composable
fun Wrapper(
    title: String,
    text: String,
    needText: Boolean = true,
    content: @Composable () -> Unit,
) {
    Box(
        modifier = Modifier
            .background(color = AppColor.BgColor)
            .fillMaxSize()
    ) {
        Column(modifier = Modifier.padding(vertical = Padding._24, horizontal = Padding._16)) {
            Text(
                text = title,
                style = AppFontStyle.semi_bold_24,
                color = AppColor.PrimaryTextColor
            )
            if (needText) {
                Spacer(modifier = Modifier.height(Padding._12))
                Text(
                    text = text,
                    style = AppFontStyle.regular_16,
                    color = AppColor.SecondaryTextColor
                )
            }
            Spacer(modifier = Modifier.height(Padding._24))
            content()
        }
    }
}