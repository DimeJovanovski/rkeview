package mk.rkeview.theme

import androidx.lifecycle.ViewModel

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

/**
 * ViewModel for tracking light/dark mode state.
 */
class ThemeViewModel : ViewModel() {
    private val _isDarkTheme = MutableStateFlow(false) // Initialize with default value

    val isDarkTheme: StateFlow<Boolean>
        get() = _isDarkTheme

    fun toggleTheme() {
        _isDarkTheme.value = !_isDarkTheme.value
        // Optionally, you can save the theme preference here
    }

    fun setDarkTheme(isDarkTheme: Boolean) {
        _isDarkTheme.value = isDarkTheme
    }
}



