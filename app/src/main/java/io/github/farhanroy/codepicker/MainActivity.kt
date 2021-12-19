package io.github.farhanroy.codepicker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.farhanroy.cccp.CountryCodeField
import io.github.farhanroy.codepicker.ui.theme.ComposeCountryCodePickerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCountryCodePickerTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    CountryCodeView()
                }
            }
        }
    }
}

@Composable
fun CountryCodeView() {
    Column(modifier = Modifier.padding(16.dp)) {
        var country by remember { mutableStateOf("") }
        CountryCodeField(pickedCountry = {
        })
        Spacer(modifier = Modifier.height(24.dp))
        Text("")
    }
}