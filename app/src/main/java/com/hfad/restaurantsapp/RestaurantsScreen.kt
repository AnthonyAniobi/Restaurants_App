package com.hfad.restaurantsapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Place
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun RestaurantsScreen(){
    RestaurantItem()
}

@Composable
fun RestaurantItem(){
    Card(
        elevation = 4.dp,
        modifier = Modifier.padding(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            RestaurantIcon(
                Icons.Filled.Place,
                Modifier.weight(0.15f)
            )
            RestaurantDetails(
                Modifier.weight(0.85f)
            )
        }
    }
}

@Composable
private fun RestaurantIcon(icon: ImageVector, modifier: Modifier){
    Image(
        imageVector = icon,
        contentDescription = "Restaurant Icon",
        modifier = modifier.padding(8.dp)
    )
}

@Composable
private fun RestaurantDetails(modifier: Modifier){
    Column(modifier = modifier) {
        Text(
            "Alfredo's dishes",
            style = MaterialTheme.typography.h6
        )
        CompositionLocalProvider(
            LocalContentAlpha provides ContentAlpha.medium
        ) {
            Text(
                text = "At Alfredo's seafood dishes",
                style = MaterialTheme.typography.body2
            )
        }

    }
}