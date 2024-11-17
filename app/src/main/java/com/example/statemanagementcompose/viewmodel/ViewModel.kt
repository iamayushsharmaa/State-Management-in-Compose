package com.example.statemanagementcompose.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.statemanagementcompose.data.MainUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class MainViewModel(
): ViewModel() {

    val _state = MutableStateFlow(MainUiState())
    val state = _state.asStateFlow()

    fun incrementCount() {
        viewModelScope.launch {
            _state.update {
                it.copy(
                    counter = _state.value.counter + 1
                )
            }
        }
    }
}