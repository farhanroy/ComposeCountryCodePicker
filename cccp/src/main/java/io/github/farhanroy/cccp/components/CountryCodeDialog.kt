package io.github.farhanroy.cccp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.lifecycle.viewmodel.compose.viewModel
import io.github.farhanroy.cccp.state.DialogState
import io.github.farhanroy.cccp.utils.CCPCountry
import io.github.farhanroy.cccp.utils.getLibraryMasterCountriesEnglish

import java.util.*
import kotlin.collections.ArrayList


@Composable
fun CountryCodeDialog(
    state: MutableState<TextFieldValue>,
    dialogState: DialogState = viewModel()
) {
    val countries = getLibraryMasterCountriesEnglish()
    var filteredCountries: List<CCPCountry>

    if (dialogState.getState()) {
        Dialog(onDismissRequest = { dialogState.setState(false) }) {
            Box(
                Modifier
                    .size(480.dp, 480.dp)
                    .background(Color.White)
            ) {
                LazyColumn(Modifier.padding(8.dp)) {

                    val searchedText = state.value.text
                    filteredCountries = if (searchedText.isEmpty()) {
                        countries
                    } else {
                        val resultList = ArrayList<CCPCountry>()
                        for (country in countries) {
                            if (country.name.lowercase(Locale.getDefault())
                                    .contains(searchedText.lowercase(Locale.getDefault()))
                            ) {
                                resultList.add(country)
                            }
                        }
                        resultList
                    }

                    item {
                        SearchView(state = state)
                    }
                    items(filteredCountries.size) { index ->
                        CountryItem(
                            country = filteredCountries[index]
                        ) { selectedCountry ->
                            dialogState.setState(false)
                            dialogState.setCountry(selectedCountry)
                        }
                    }
                }
            }

        }
    }
}

fun getListOfCountries(): ArrayList<String> {
    val isoCountryCodes = Locale.getISOCountries()
    val countryListWithEmojis = ArrayList<String>()
    for (countryCode in isoCountryCodes) {
        val locale = Locale("", countryCode)
        val countryName = locale.displayCountry
        val flagOffset = 0x1F1E6
        val asciiOffset = 0x41
        val firstChar = Character.codePointAt(countryCode, 0) - asciiOffset + flagOffset
        val secondChar = Character.codePointAt(countryCode, 1) - asciiOffset + flagOffset
        val flag =
            (String(Character.toChars(firstChar)) + String(Character.toChars(secondChar)))
        countryListWithEmojis.add("$countryName $flag")
    }
    return countryListWithEmojis
}
