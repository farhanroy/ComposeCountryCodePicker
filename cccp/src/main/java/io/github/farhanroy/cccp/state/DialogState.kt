package io.github.farhanroy.cccp.state

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import io.github.farhanroy.cccp.utils.CCPCountry
import io.github.farhanroy.cccp.utils.DEFAULT_FLAG_RES

class DialogState: ViewModel() {
    private var isOpen: Boolean by mutableStateOf(false)

    private var selectedCountry by mutableStateOf(CCPCountry("ad", "376", "null", DEFAULT_FLAG_RES))

    fun setState(state: Boolean) {
        isOpen = state
    }

    fun getState(): Boolean = isOpen

    fun setCountry(value: CCPCountry) {
        selectedCountry = value
    }

    fun getCountry(): CCPCountry = selectedCountry
}