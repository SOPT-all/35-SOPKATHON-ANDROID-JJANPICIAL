package com.sopt.a35_sopkathon_android_android1.presentation.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.sopt.a35_sopkathon_android_android1.presentation.jiwon.JiwonRoute
import com.sopt.a35_sopkathon_android_android1.presentation.minjae.MinjaeViewModel
import com.sopt.a35_sopkathon_android_android1.presentation.minjae.minjaeNavGraph
import com.sopt.a35_sopkathon_android_android1.presentation.minseo.MinseoRoute
import com.sopt.a35_sopkathon_android_android1.presentation.sehun.SehunRoute

@Composable
fun MainNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    val minjaeViewModel: MinjaeViewModel = viewModel()

    Box(
        modifier = modifier.fillMaxSize()
    ) {
        NavHost(
            navController = navController,
            startDestination = "minjae",
        ) {
            composable(route = "jiwon") {
                JiwonRoute(
                    navigateToMinseo = { navController.navigateToMinseo() }
                )
            }

            composable(route = "sehun") {
                SehunRoute()
            }

            composable(route = "minseo") {
                MinseoRoute()
            }

            minjaeNavGraph(
                minjaeViewModel = minjaeViewModel,
                navController = navController,
            )
        }
    }
}
