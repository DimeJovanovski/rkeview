package mk.rkeview.ui.screens

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.launch

// Don't touch this
// But when you make new ViewModels, make them extend this class

open class BaseViewModel : ViewModel() {
    fun launchCatching(block: suspend () -> Unit) {
        viewModelScope.launch {
            CoroutineExceptionHandler() { _, throwable -> throwable.printStackTrace() }
            block()
        }
    }
}