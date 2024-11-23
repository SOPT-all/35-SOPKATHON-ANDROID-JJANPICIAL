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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.min
import com.sopt.a35_sopkathon_android_android1.R
import com.sopt.a35_sopkathon_android_android1.ui.theme.JJanPicialTheme

@Composable
fun MinjaeRoute(
    minjaeViewModel: MinjaeViewModel,
    navigateToMinjae2: () -> Unit
) {
    val userName by minjaeViewModel.username.collectAsState()
    val userPart by minjaeViewModel.userPart.collectAsState()
    val isButton1Enabled by minjaeViewModel.isButton1Enabled.collectAsState()

    val setUserName: (String) -> Unit = { newValue -> minjaeViewModel.setUserName(newValue) }
    val setUserPart: (String) -> Unit = { newValue -> minjaeViewModel.setUserPart(newValue) }


    MinjaeScreen(
        userName = userName,
        userPart = userPart,
        setUserName = setUserName,
        setUserPart = setUserPart,
        isButton1Enabled = isButton1Enabled,
        navigateToMinjae2 = navigateToMinjae2
    )
}

@Composable
fun MinjaeScreen(
    userName: String,
    userPart: String,
    setUserName: (String) -> Unit,
    setUserPart: (String) -> Unit,
    isButton1Enabled: Boolean,
    navigateToMinjae2: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = JJanPicialTheme.colors.white)
            .padding(16.dp),
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_onboarding_progress_bar1),
            contentDescription = null
        )

        Spacer(modifier = Modifier.height(40.dp))

        Text(
            text = "SOPT 짠-피셜에  오신것을\n환영합니다!",
            color = JJanPicialTheme.colors.gray950,
            style = JJanPicialTheme.typography.head2Bold
        )

        Spacer(modifier = Modifier.height(80.dp))

        Column {
            Text(
                text = "이름을 입력해주세요.",
                modifier = Modifier.padding(bottom = 12.dp),
                color = JJanPicialTheme.colors.gray700,
                style = JJanPicialTheme.typography.title1Bold
            )
            OnboardingTextField(
                value = userName,
                onValueChange = setUserName,
                modifier = Modifier.fillMaxWidth()
            )


            Spacer(modifier = Modifier.height(32.dp))

            Text(
                text = "파트를 입력해주세요.",
                modifier = Modifier.padding(bottom = 12.dp),
                color = JJanPicialTheme.colors.gray700,
                style = JJanPicialTheme.typography.title1Bold
            )
            OnboardingTextField(
                value = userPart,
                onValueChange = setUserPart,
                modifier = Modifier.fillMaxWidth()
            )

        }

        Spacer(modifier = Modifier.weight(1f))

        OnboardingConfirmButton(
            title = "다음",
            enabled = isButton1Enabled,
            modifier = Modifier.fillMaxWidth(),
            onClick = navigateToMinjae2
        )
    }
}