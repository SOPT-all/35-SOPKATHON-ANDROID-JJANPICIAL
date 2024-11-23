package com.sopt.a35_sopkathon_android_android1.presentation.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Dialog
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.sopt.a35_sopkathon_android_android1.presentation.jiwon.JiwonRoute
import com.sopt.a35_sopkathon_android_android1.presentation.main.component.JJanBattleDialog
import com.sopt.a35_sopkathon_android_android1.presentation.minjae.MinjaeViewModel
import com.sopt.a35_sopkathon_android_android1.presentation.minjae.minjaeNavGraph
import com.sopt.a35_sopkathon_android_android1.presentation.minseo.MinseoRoute
import com.sopt.a35_sopkathon_android_android1.presentation.sehun.SehunRoute

@Composable
fun MainNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    var showDialog by remember { mutableStateOf(false) }
    var userName by remember { mutableStateOf("") }
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

            composable(
                route = "sehun/{partName}",
                arguments = listOf(navArgument("partName") { type = NavType.StringType })
            ) { backStackEntry ->
                val partName = backStackEntry.arguments?.getString("partName") ?: ""
                SehunRoute(
                    onBackPressed = { navController.popBackStack() },
                    onBattleClick = { name ->
                        userName = name
                        showDialog = true
                    },
                    partName = partName
                )
            }

            composable(route = "minseo") {
                MinseoRoute(
                    onBattleClick = { name ->
                        userName = name
                        showDialog = true
                    },
                    navigateToSehun = {
                        navController.navigateToSehun(it)
                    }
                )
            }

            minjaeNavGraph(
                minjaeViewModel = minjaeViewModel,
                navController = navController,
            )
        }
        if (showDialog) {
            Dialog(
                onDismissRequest = { showDialog = false }
            ) {
                JJanBattleDialog(
                    name = userName,
                    onClick = { showDialog = false }
                )
            }
        }
    }
}
