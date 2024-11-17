package com.example.statemanagementcompose.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Suppress("DEPRECATED_ANNOTATION")
@Parcelize
data class MainUiState(
    val counter : Int = 0,
    val text : String = ""
): Parcelable
