package mk.rkeview.ui.screens

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.launch

open class BaseViewModel : ViewModel() {
    fun launchCatching(block: suspend () -> Unit) {
        viewModelScope.launch {
            CoroutineExceptionHandler() { _, throwable -> throwable.printStackTrace() }
            block()
        }
    }
}