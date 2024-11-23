package com.sopt.a35_sopkathon_android_android1.presentation.minjae

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sopt.a35_sopkathon_android_android1.R
import com.sopt.a35_sopkathon_android_android1.ui.theme.JJanPicialTheme

@Composable
fun MinjaeScreen4Route(
    minjaeViewModel: MinjaeViewModel,
    navigateToMinjae5: () -> Unit
) {
    val isButton1Enabled by minjaeViewModel.isButton1Enabled.collectAsState()

    MinjaeScreen4(
        navigateToMinjae5 = navigateToMinjae5
    )
}

@Composable
fun MinjaeScreen4(
    navigateToMinjae5: () -> Unit
) {

    var firstOptionSelected by remember { mutableStateOf(false) }
    var secondOptionSelected by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = JJanPicialTheme.colors.white)
            .padding(16.dp),
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_onboarding_progress_bar4),
            contentDescription = null
        )

        Spacer(modifier = Modifier.height(40.dp))

        Text(
            text = "내가 술을 마실 때는?",
            color = JJanPicialTheme.colors.gray950,
            style = JJanPicialTheme.typography.head2Bold
        )

        Spacer(modifier = Modifier.height(40.dp))

        OnboardingSelectableButton(
            title = "술만 마셔도 배부르죠",
            modifier = Modifier.fillMaxWidth(),
            isSelected = firstOptionSelected,
            onClick = {
                firstOptionSelected = !firstOptionSelected
                if (firstOptionSelected) secondOptionSelected = false
            }
        )

        Spacer(modifier = Modifier.height(20.dp))

        OnboardingSelectableButton(
            title = "술보다는 든든한 안주가 중요해요",
            modifier = Modifier.fillMaxWidth(),
            isSelected = secondOptionSelected,
            onClick = {
                secondOptionSelected = !secondOptionSelected
                if (secondOptionSelected) firstOptionSelected = false
            }
        )

        Spacer(modifier = Modifier.weight(1f))

        OnboardingConfirmButton(
            title = "다음",
            enabled = true,
            modifier = Modifier.fillMaxWidth(),
            onClick = navigateToMinjae5
        )
    }
}