package io.github.farhanroy.cccp.state

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class DialogState: ViewModel() {
    private var isOpen: Boolean by mutableStateOf(false)

    fun setState(state: Boolean) {
        isOpen = state
        print("asasasas")
    }

    fun getState(): Boolean = isOpen
}