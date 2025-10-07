package com.solicodet.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.solicodet.compose.ui.MainScreen
import com.solicodet.compose.ui.theme.ComposeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTheme {
                MainScreen()
            }
        }
    }
}