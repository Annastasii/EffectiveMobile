package com.example.effectivemobile.ui.view.common

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.core_ui.AppColor
import com.example.core_ui.AppFontStyle
import com.example.core_ui.Padding
import com.example.effectivemobile.R

@Composable
fun BottomBar(enabled: Boolean, onClick: () -> Unit, iconBack: Boolean = true) {
    Column(modifier = Modifier.background(color = AppColor.BgBottomColor)) {
        Divider(color = AppColor.DividerColor)
        Spacer(modifier = Modifier.height(Padding._12))
        Row(Modifier.padding(Padding._12)) {
            if (iconBack) {
                Spacer(modifier = Modifier.width(Padding._12))
                Box(
                    Modifier.border(
                        width = Padding._1,
                        color = AppColor.BorderColor,
                        shape = RoundedCornerShape(50.dp)
                    )
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_back),
                        contentDescription = null,
                        tint = AppColor.IconColor,
                        modifier = Modifier.padding(Padding._12)
                    )
                }
            }
            Button(
                onClick = { onClick() },
                modifier = Modifier
                    .height(Padding._44)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                enabled = enabled,
                colors = ButtonDefaults.buttonColors(
                    containerColor = AppColor.ActiveColor,
                    disabledContainerColor = AppColor.NotActiveColor
                )
            ) {
                Text(
                    text = stringResource(id = R.string.continuee),
                    color = AppColor.ButtonTextColor,
                    style = AppFontStyle.medium_14
                )
            }
        }
        Spacer(modifier = Modifier.height(Padding._16))
    }
}