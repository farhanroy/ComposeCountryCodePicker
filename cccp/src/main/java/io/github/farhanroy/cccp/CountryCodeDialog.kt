package io.github.farhanroy.cccp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog

@Composable
fun CountryCodeDialog() {
    val countryList: List<CCPCountry> = getLibraryMasterCountriesEnglish()
    MaterialTheme {
        Column {
            val openDialog = remember { mutableStateOf(false) }
            val dialogWidth = 250.dp
            val dialogHeight = 400.dp

            Button(onClick = {
                openDialog.value = true
            }) {
                Text("Click me")
            }

            if (openDialog.value) {
                Dialog(onDismissRequest = { openDialog.value = false }) {
                    Box(
                        Modifier
                            .size(dialogWidth, dialogHeight)
                            .background(Color.White)) {
                        LazyColumn {
                            items(countryList.size) { index ->
                                Row {
                                    Image(painter = painterResource(id = getFlagMasterResID(countryList[index])), contentDescription = null)
                                    Text(countryList[index].name, Modifier.padding(horizontal = 24.dp, vertical = 12.dp))
                                }
                            }
                        }
                    }

                }
            }
        }

    }
}