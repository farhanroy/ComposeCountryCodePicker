package io.github.farhanroy.cccp

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import io.github.farhanroy.cccp.components.CountryCodeDialog
import io.github.farhanroy.cccp.state.DialogState
import io.github.farhanroy.cccp.utils.CCPCountry
import io.github.farhanroy.cccp.utils.getFlagMasterResID

@Composable
fun CountryCodeField(
    modifier: Modifier = Modifier,
    dialogState: DialogState = viewModel(),
    titleDefault: String = "Select Country",
    pickedCountry: (CCPCountry) -> Unit
    pickedCountry: (String) -> Unit
) {
    val textState = remember { mutableStateOf(TextFieldValue(""))}

    pickedCountry(dialogState.getCountry())

    MaterialTheme {
        Column(modifier = modifier) {

            Row(
                Modifier.clickable { dialogState.setState(true) },
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {

                if (dialogState.getCountry().name != "null") {
                    Image(
                        painter = painterResource(
                            id = getFlagMasterResID(
                                dialogState.getCountry()
                            )
                        ), contentDescription = null,
                    )
                }
                Text(if (dialogState.getCountry().name == "null") titleDefault else dialogState.getCountry().name, Modifier.padding(start = 8.dp, end = 18.dp))

                Text(dialogState.getCountry(), Modifier.padding(horizontal = 18.dp))

                Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = null)
            }

            CountryCodeDialog(state = textState)
        }
    }
}