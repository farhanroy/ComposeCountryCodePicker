package io.github.farhanroy.cccp.state

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import io.github.farhanroy.cccp.utils.CCPCountry
import io.github.farhanroy.cccp.utils.DEFAULT_FLAG_RES

class DialogState: ViewModel() {
    private var isOpen: Boolean by mutableStateOf(false)

    private var selectedCountry by mutableStateOf("")

    fun setState(state: Boolean) {
        isOpen = state
    }

    fun getState(): Boolean = isOpen

    fun setCountry(value: String) {
        selectedCountry = value
    }

    fun getCountry(): String = selectedCountry
}