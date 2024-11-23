package com.sopt.a35_sopkathon_android_android1.presentation.minjae

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sopt.a35_sopkathon_android_android1.R
import com.sopt.a35_sopkathon_android_android1.ui.theme.JJanPicialTheme

@Composable
fun MinjaeScreen5Route(
    minjaeViewModel: MinjaeViewModel,
) {
    LaunchedEffect(Unit) {
        minjaeViewModel.getUserInfo()
    }

    MinjaeScreen5(
        userJpLevel = minjaeViewModel.userJpLevel.collectAsState().value,
        userJbti = minjaeViewModel.userJbti.collectAsState().value
    )
}

@Composable
fun MinjaeScreen5(
    userJpLevel: Double,
    userJbti: String
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = JJanPicialTheme.colors.white)
            .padding(16.dp),
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_onboarding_progress_bar5),
            contentDescription = null
        )

        Spacer(modifier = Modifier.height(40.dp))

        Text(
            text = "나의 짠-BTI는요!",
            color = JJanPicialTheme.colors.gray950,
            style = JJanPicialTheme.typography.head2Bold
        )

        Spacer(modifier = Modifier.height(20.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .clip(shape = RoundedCornerShape(10.dp))
                .background(color = JJanPicialTheme.colors.primaryBlack1)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 64.dp, vertical = 40.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.img_onboarding_character),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .padding(bottom = 20.dp)
                )
                Text(
                    text = userJbti,
                    modifier = Modifier.padding(bottom = 14.dp),
                    color = JJanPicialTheme.colors.primaryGreen1,
                    style = JJanPicialTheme.typography.head1Bold
                )
                Text(
                    text = "$userJpLevel",
                    color = JJanPicialTheme.colors.gray25,
                    style = JJanPicialTheme.typography.head2Bold
                )
            }
        }

        Spacer(modifier = Modifier.height(40.dp))

        OnboardingConfirmButton(
            title = "짠-피셜 시작하기",
            enabled = true,
            modifier = Modifier.fillMaxWidth(),
            onClick = {}
        )
    }
}