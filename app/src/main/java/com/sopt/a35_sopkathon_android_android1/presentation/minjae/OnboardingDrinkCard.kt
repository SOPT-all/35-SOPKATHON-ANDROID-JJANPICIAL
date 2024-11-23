package com.sopt.a35_sopkathon_android_android1.presentation.minjae

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sopt.a35_sopkathon_android_android1.R
import com.sopt.a35_sopkathon_android_android1.presentation.util.clickableWithoutRipple
import com.sopt.a35_sopkathon_android_android1.presentation.util.roundedBackgroundWithBorder
import com.sopt.a35_sopkathon_android_android1.ui.theme.JJanPicialTheme

@Composable
fun OnboardingDrinkCard(
    drinkImageId: Int,
    drinkType: String,
    drinkCapacity: String,
    bottleNum: String,
    onBottleNumDecrease: () -> Unit,
    onBottleNumIncrease: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .roundedBackgroundWithBorder(
                    cornerRadius = 4.dp,
                    backgroundColor = JJanPicialTheme.colors.gray100
                )
                .padding(horizontal = 40.dp, vertical = 15.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = drinkImageId),
                contentDescription = null,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Text(
                text = drinkType,
                modifier = Modifier.padding(bottom = 2.dp),
                color = JJanPicialTheme.colors.subGreen1,
                style = JJanPicialTheme.typography.title1Bold
            )
            Text(
                text = drinkCapacity,
                color = JJanPicialTheme.colors.gray500,
                style = JJanPicialTheme.typography.body4Regular
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .clip(shape = RoundedCornerShape(4.dp))
                .background(color = JJanPicialTheme.colors.gray200),
            contentAlignment = Alignment.Center
        ) {
            Row(
                modifier = Modifier
                    .padding(horizontal = 10.dp, vertical = 8.dp),
                horizontalArrangement = Arrangement.spacedBy(20.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_onboarding_minus_24),
                    contentDescription = null,
                    modifier = Modifier
                        .size(36.dp)
                        .clickableWithoutRipple(onClick = onBottleNumDecrease)
                )
                Text(
                    text = "$bottleNum 병",
                    color = JJanPicialTheme.colors.primaryBlack1,
                    style = JJanPicialTheme.typography.title1Bold
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_onboarding_plus_24),
                    contentDescription = null,
                    modifier = Modifier
                        .size(36.dp)
                        .clickableWithoutRipple(onClick = onBottleNumIncrease)
                )
            }
        }
    }
}