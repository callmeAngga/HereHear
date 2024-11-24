package com.herehearteam.herehear.ui.screens.profile

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.herehearteam.herehear.data.remote.GoogleAuthUiClient

class ProfileViewModelFactory(
    private val googleAuthUiClient: GoogleAuthUiClient
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ProfileViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return ProfileViewModel(googleAuthUiClient) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}