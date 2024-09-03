package com.example.feauture_auth.view.first_auth.ui.first_auth.view

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.core_ui.CustomColor
import com.example.core_ui.FontStyle
import com.example.core_ui.Padding
import com.example.feauture_auth.R

@Composable
internal fun FindWorkColumn(onButtonClick: () -> Unit) {
    Column(
        modifier = Modifier
            .background(CustomColor.SecondaryBgColor, RoundedCornerShape(10.dp))
            .padding(
                vertical = Padding._18,
                horizontal = Padding._12
            ),
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = stringResource(id = R.string.finder_work),
            color = CustomColor.TextColor,
            style = FontStyle.Style_16
        )
        Spacer(modifier = Modifier.height(Padding._16))
        TextField(
            value = "EE", onValueChange = {},
            modifier = Modifier
                .background(CustomColor.SecondaryBgColor)
                .clip(RoundedCornerShape(10.dp))
                .height(Padding._48),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = CustomColor.InputTextColor,
                unfocusedContainerColor = CustomColor.InputTextColor,
                focusedTextColor = CustomColor.TextColor,
                unfocusedTextColor = CustomColor.TextColor
            )
        )
        Spacer(modifier = Modifier.height(Padding._16))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Button(
                onClick = { onButtonClick() },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp)
                    .weight(1f),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = CustomColor.ActiveButtonColor,
                    disabledContainerColor = CustomColor.NotActiveButtonColor,
                    contentColor = CustomColor.TextColor,
                    disabledContentColor = CustomColor.NotActiveTextColor
                )
            ) {
                Text(
                    text = stringResource(R.string.continu),
                    fontSize = 14.sp
                )
            }
            Spacer(modifier = Modifier.width(Padding._16))
            Text(
                text = stringResource(id = R.string.enter_with_pas),
                modifier = Modifier.clickable { },
                color = CustomColor.LinkColor,
                style = FontStyle.Style_14
            )
        }
    }
}