package com.sopt.a35_sopkathon_android_android1.presentation.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.sopt.a35_sopkathon_android_android1.presentation.jiwon.JiwonRoute
import com.sopt.a35_sopkathon_android_android1.presentation.minjae.MinjaeRoute
import com.sopt.a35_sopkathon_android_android1.presentation.minseo.MinseoRoute
import com.sopt.a35_sopkathon_android_android1.presentation.sehun.SehunRoute

@Composable
fun MainNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        NavHost(
            navController = navController,
            startDestination = "jiwon",
        ) {
            composable(route = "jiwon") {
                JiwonRoute(
                    navigateToMinjae = { navController.navigateToMinjae() },
                    navigateToMinseo = { navController.navigateToMinseo() }
                )
            }

            composable(route = "sehun") {
                SehunRoute()
            }

            composable(route = "minseo") {
                MinseoRoute()
            }

            composable(route = "minjae") {
                MinjaeRoute()
            }
        }
    }
}
