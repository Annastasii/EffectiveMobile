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
internal fun FindEmployeeColumn() {
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
            text = stringResource(id = R.string.finder_employee),
            color = CustomColor.TextColor,
            style = FontStyle.Style_16
        )
        Spacer(modifier = Modifier.height(Padding._16))
        Text(
            text = stringResource(id = R.string.posting_vacancies),
            color = CustomColor.TextColor,
            style = FontStyle.Style_12
        )
        Spacer(modifier = Modifier.height(Padding._16))
        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp),
            shape = RoundedCornerShape(15.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = CustomColor.GreenButton,
                disabledContainerColor = CustomColor.GreenButton,
                contentColor = CustomColor.TextColor,
                disabledContentColor = CustomColor.NotActiveTextColor
            )
        ) {
            Text(
                text = stringResource(R.string.i_find_employee),
                fontSize = 14.sp
            )
        }
    }
}