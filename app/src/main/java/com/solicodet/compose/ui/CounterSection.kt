package com.solicodet.compose.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier

// import this to use by
import androidx.compose.runtime.*

import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.*


@Composable
fun CounterSection(modifier: Modifier = Modifier){
    var count by rememberSaveable { mutableStateOf(0) }

    Row(modifier = modifier) {
        IconButton(onClick = {if (count > 0) count-- }) {
            Icon(Icons.Filled.Remove, contentDescription = "Decrement")
        }
        Text(
            text = "$count",
            style = MaterialTheme.typography.headlineSmall
        )

        IconButton(onClick = {count++ }) {
            Icon(Icons.Filled.Add, contentDescription = "increment")
        }
    }
}