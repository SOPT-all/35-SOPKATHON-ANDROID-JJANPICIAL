package com.sopt.a35_sopkathon_android_android1.presentation.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Dialog
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.sopt.a35_sopkathon_android_android1.presentation.jiwon.JiwonRoute
import com.sopt.a35_sopkathon_android_android1.presentation.main.component.ShowJJanBattleDialog
import com.sopt.a35_sopkathon_android_android1.presentation.minjae.MinjaeRoute
import com.sopt.a35_sopkathon_android_android1.presentation.minseo.MinseoRoute
import com.sopt.a35_sopkathon_android_android1.presentation.sehun.SehunRoute

@Composable
fun MainNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    var showDialog by remember { mutableStateOf(false) }

    Box(
        modifier = modifier.fillMaxSize()
    ) {
        NavHost(
            navController = navController,
            startDestination = "minseo",
        ) {
            composable(route = "jiwon") {
                JiwonRoute(
                    navigateToMinseo = { navController.navigateToMinseo() }
                )
            }

            composable(route = "sehun") {
                SehunRoute(
                    onBackPressed = {},
                    onBattleClick = {showDialog = true},
                )
            }

            composable(route = "minseo") {
                MinseoRoute(
                    onBattleClick = {showDialog = true},
                )
            }

            composable(route = "minjae") {
                MinjaeRoute()
            }
        }
      if(showDialog){
          Dialog(
              onDismissRequest = {showDialog = false}
          ) {
              Column(
                  modifier = Modifier.fillMaxSize()
              ) {
                  Text("123123")
              }
              //ShowJJanBattleDialog()
          }
      }
    }
}
