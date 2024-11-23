package com.sopt.a35_sopkathon_android_android1.presentation.main.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sopt.a35_sopkathon_android_android1.R
import com.sopt.a35_sopkathon_android_android1.ui.theme.JJanPicialTheme

@Composable
fun JJanBattleDialog(
    modifier: Modifier = Modifier,
    name: String,
    onClick: () -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .aspectRatio(264f / 310f)
            .background(color = JJanPicialTheme.colors.white, shape = RoundedCornerShape(20.dp)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.img_battle),
            contentDescription = null,
            modifier = Modifier
                .padding(30.dp)
                .aspectRatio(204f / 125f),
            contentScale = ContentScale.Crop
        )
        Spacer(Modifier.height(14.dp))

        Row {
            Text(
                text = name,
                style = JJanPicialTheme.typography.head3Bold,
                color = JJanPicialTheme.colors.primaryGreen1
            )
            Text(
                text = "님께",
                style = JJanPicialTheme.typography.head3Bold,
                color = JJanPicialTheme.colors.black
            )
        }
        Text(
            text = "짠-배틀 신청 완료!",
            style = JJanPicialTheme.typography.head3Bold,
            color = JJanPicialTheme.colors.black
        )

        Button(
            onClick = onClick,
            modifier = Modifier
                .padding(30.dp)
                .fillMaxWidth()
                .aspectRatio(204f / 40f),
            shape = RoundedCornerShape(4.dp),
            colors = ButtonDefaults.buttonColors(JJanPicialTheme.colors.primaryGreen1)
        ) {
            Text(
                text = "닫기",
                style = JJanPicialTheme.typography.body2Medium,
                color = JJanPicialTheme.colors.white
            )
        }
    }
}
