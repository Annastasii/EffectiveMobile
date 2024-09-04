package com.example.feature_vacancies.ui.dialogs.respond

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.core_ui.CustomColor
import com.example.core_ui.FontStyle
import com.example.core_ui.Padding
import com.example.feature_vacancies.R
import com.example.feature_vacancies.ui.dialogs.respond.view.MessageField
import com.example.feature_vacancies.ui.dialogs.respond.view.ResumeRow

@Composable
fun RespondDialog(onDismiss: () -> Unit) {
    Dialog(
        properties = DialogProperties(usePlatformDefaultWidth = false),
        onDismissRequest = { onDismiss() }) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(CustomColor.PrimaryBgColor),
            contentAlignment = Alignment.BottomCenter,
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(CustomColor.PrimaryBgColor),
                colors = CardDefaults.cardColors(containerColor = CustomColor.PrimaryBgColor),
            ) {
                Column(
                    modifier = Modifier
                        .padding(Padding._16)
                        .fillMaxWidth()
                        .imePadding(),
                ) {
                    Box(
                        contentAlignment = Alignment.TopCenter,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Divider(color = CustomColor.Grey, modifier = Modifier.width(Padding._38))
                    }
                    Spacer(modifier = Modifier.height(Padding._12))
                    ResumeRow()
                    Spacer(modifier = Modifier.height(Padding._12))
                    Divider(color = CustomColor.Grey)
                    Spacer(modifier = Modifier.height(Padding._12))
                    MessageField()
                    Button(
                        onClick = { },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(48.dp),
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = CustomColor.Green,
                            disabledContainerColor = CustomColor.Green,
                            contentColor = CustomColor.Green,
                            disabledContentColor = CustomColor.Green
                        )
                    ) {
                        Text(
                            text = stringResource(id = R.string.respond),
                            style = FontStyle.Style_16,
                            color = CustomColor.TextColor
                        )
                    }
                }
            }
        }
    }
}