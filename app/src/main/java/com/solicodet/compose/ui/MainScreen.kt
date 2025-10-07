package com.solicodet.compose.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.solicodet.compose.ui.theme.ComposeTheme


@Composable
fun MainScreen(modifier: Modifier = Modifier){

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        DireBonjourSection()
        CounterSection()
    }

}

    @Preview(showBackground = true, widthDp = 360)
    @Composable
    fun PreviewMainScreen() {
        ComposeTheme{
            MainScreen()
        }
        }