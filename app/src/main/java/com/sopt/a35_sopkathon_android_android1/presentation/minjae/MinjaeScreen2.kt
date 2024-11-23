package com.sopt.a35_sopkathon_android_android1.presentation.minjae

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sopt.a35_sopkathon_android_android1.R
import com.sopt.a35_sopkathon_android_android1.ui.theme.JJanPicialTheme

@Composable
fun MinjaeScreen2Route(
    minjaeViewModel: MinjaeViewModel,
    navigateToMinjae3: () -> Unit
) {
    val sojuBottle by minjaeViewModel.sojuBottle.collectAsState()
    val beerBottle by minjaeViewModel.beerBottle.collectAsState()
    val makgeolliBottle by minjaeViewModel.makgeolliBottle.collectAsState()
    val wineBottle by minjaeViewModel.wineBottle.collectAsState()
    val isButton2Enabled by minjaeViewModel.isButton2Enabled.collectAsState()
    val onButton2Clicked = {
        minjaeViewModel.postUserRegistration()
        navigateToMinjae3()
    }


    MinjaeScreen2(
        sojuBottle = sojuBottle,
        beerBottle = beerBottle,
        makgeolliBottle = makgeolliBottle,
        wineBottle = wineBottle,
        isButton2Enabled = isButton2Enabled,
        onButton2Clicked = onButton2Clicked,
        onIncreaseSoju = { minjaeViewModel.increaseSojuBottle() },
        onDecreaseSoju = { minjaeViewModel.decreaseSojuBottle() },
        onIncreaseBeer = { minjaeViewModel.increaseBeerBottle() },
        onDecreaseBeer = { minjaeViewModel.decreaseBeerBottle() },
        onIncreaseMakgeolli = { minjaeViewModel.increaseMakgeolliBottle() },
        onDecreaseMakgeolli = { minjaeViewModel.decreaseMakgeolliBottle() },
        onIncreaseWine = { minjaeViewModel.increaseWineBottle() },
        onDecreaseWine = { minjaeViewModel.decreaseWineBottle() }
    )
}

@Composable
fun MinjaeScreen2(
    sojuBottle: Double,
    beerBottle: Double,
    makgeolliBottle: Double,
    wineBottle: Double,
    isButton2Enabled: Boolean,
    onButton2Clicked: () -> Unit,
    onIncreaseSoju: () -> Unit,
    onDecreaseSoju: () -> Unit,
    onIncreaseBeer: () -> Unit,
    onDecreaseBeer: () -> Unit,
    onIncreaseMakgeolli: () -> Unit,
    onDecreaseMakgeolli: () -> Unit,
    onIncreaseWine: () -> Unit,
    onDecreaseWine: () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = JJanPicialTheme.colors.white)
            .padding(16.dp),
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_onboarding_progress_bar2),
            contentDescription = null
        )

        Spacer(modifier = Modifier.height(40.dp))

        Text(
            text = "주량을 선택해주세요!",
            color = JJanPicialTheme.colors.gray950,
            style = JJanPicialTheme.typography.head2Bold
        )

        Spacer(modifier = Modifier.height(40.dp))

        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Row {
                OnboardingDrinkCard(
                    drinkImageId = R.drawable.img_alchol_soju,
                    drinkType = "소주",
                    drinkCapacity = "360ml",
                    bottleNum = formatBottleNumber(sojuBottle),
                    onBottleNumDecrease = onDecreaseSoju,
                    onBottleNumIncrease = onIncreaseSoju,
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                OnboardingDrinkCard(
                    drinkImageId = R.drawable.img_alchol_maekju,
                    drinkType = "맥주",
                    drinkCapacity = "500ml",
                    bottleNum = formatBottleNumber(beerBottle),
                    onBottleNumDecrease = onDecreaseBeer,
                    onBottleNumIncrease = onIncreaseBeer,
                    modifier = Modifier.weight(1f)
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            Row {
                OnboardingDrinkCard(
                    drinkImageId = R.drawable.img_alchol_makguli,
                    drinkType = "막걸리",
                    drinkCapacity = "750ml",
                    bottleNum = formatBottleNumber(makgeolliBottle),
                    onBottleNumDecrease = onDecreaseMakgeolli,
                    onBottleNumIncrease = onIncreaseMakgeolli,
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                OnboardingDrinkCard(
                    drinkImageId = R.drawable.img_alchol_yangju,
                    drinkType = "양주",
                    drinkCapacity = "30ml",
                    bottleNum = formatBottleNumber(wineBottle),
                    onBottleNumDecrease = onDecreaseWine,
                    onBottleNumIncrease = onIncreaseWine,
                    modifier = Modifier.weight(1f)
                )
            }
        }

        Spacer(modifier = Modifier.weight(1f))

        OnboardingConfirmButton(
            title = "다음",
            enabled = isButton2Enabled,
            modifier = Modifier.fillMaxWidth(),
            onClick = onButton2Clicked
        )
    }
}

// 소수점 표시 형식 함수
@Composable
fun formatBottleNumber(bottle: Double): String {
    return if (bottle % 1.0 == 0.0) bottle.toInt().toString() else bottle.toString()
}