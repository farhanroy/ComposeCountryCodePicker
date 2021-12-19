package io.github.farhanroy.cccp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.farhanroy.cccp.utils.CCPCountry
import io.github.farhanroy.cccp.utils.getFlagMasterResID

@Composable
fun CountryItem(country: CCPCountry, onItemClick: (CCPCountry) -> Unit) {
    Row(
        modifier = Modifier
            .clickable(onClick = { onItemClick(country) })
            .height(57.dp)
            .fillMaxWidth()
            .padding(PaddingValues(8.dp, 16.dp))
    ) {
        Image(
            painter = painterResource(
                id = getFlagMasterResID(country)
            ), contentDescription = null,
            modifier = Modifier.padding(end = 8.dp)
        )
        Text(text = country.name, fontSize = 18.sp)
    }
}