package com.sopt.a35_sopkathon_android_android1.presentation.minjae

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.sopt.a35_sopkathon_android_android1.presentation.main.navigateToMinjae2
import com.sopt.a35_sopkathon_android_android1.presentation.main.navigateToMinjae3
import com.sopt.a35_sopkathon_android_android1.presentation.main.navigateToMinjae4
import com.sopt.a35_sopkathon_android_android1.presentation.main.navigateToMinjae5

fun NavGraphBuilder.minjaeNavGraph(
    minjaeViewModel: MinjaeViewModel,
    navController: NavController
) {
    navigation(
        startDestination = "minjae1",
        route = "minjae"
    ) {
        composable(
            route = "minjae1"
        ) {
            MinjaeRoute(
                minjaeViewModel = minjaeViewModel,
                navigateToMinjae2 = { navController.navigateToMinjae2() }
            )
        }
        composable(
            route = "minjae2"
        ) {
            MinjaeScreen2Route(
                minjaeViewModel = minjaeViewModel,
                navigateToMinjae3 = { navController.navigateToMinjae3() }
            )
        }
        composable(
            route = "minjae3"
        ) {
            MinjaeScreen3Route(
                minjaeViewModel = minjaeViewModel,
                navigateToMinjae4 = { navController.navigateToMinjae4() }
            )
        }
        composable(
            route = "minjae4"
        ) {
            MinjaeScreen4Route(
                minjaeViewModel = minjaeViewModel,
                navigateToMinjae5 = { navController.navigateToMinjae5() }
            )
        }
        composable(
            route = "minjae5"
        ) {
            MinjaeScreen5Route(
                minjaeViewModel = minjaeViewModel,
            )
        }
    }

}