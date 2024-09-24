package com.example.effectivemobile.ui.view.create_restoraunt.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.core_ui.AppColor
import com.example.core_ui.AppFontStyle
import com.example.core_ui.Padding
import com.example.effectivemobile.R
import com.example.effectivemobile.ui.view.common.CustomTextFiled

@Composable
fun CheckBox(checked: Boolean, onCheckedChange: () -> Unit) {
    Row() {
        Checkbox(
            checked = checked,
            onCheckedChange = { onCheckedChange() },
            colors = CheckboxDefaults.colors(checkedColor = AppColor.ActiveColor)
        )
        Spacer(modifier = Modifier.width(Padding._12))
        Column {
            Text(
                text = stringResource(id = R.string.new_restaurant),
                color = AppColor.PrimaryTextColor,
                style = AppFontStyle.semi_bold_16,
                modifier = Modifier.padding(start = Padding._16)
            )
            Spacer(modifier = Modifier.height(Padding._8))
            Text(
                text = stringResource(id = R.string.new_restaurant_text),
                color = AppColor.SecondaryTextColor,
                style = AppFontStyle.regular_14,
                modifier = Modifier.padding(start = Padding._16)
            )
        }
    }
    if (!checked) {
        Spacer(modifier = Modifier.height(Padding._16))
        CustomTextFiled(
            placeholder = stringResource(id = R.string.system),
            value = "",
            onEnterValue = {},
            underText = stringResource(id = R.string.system_text),
            needUnderText = true
        )
    }
}