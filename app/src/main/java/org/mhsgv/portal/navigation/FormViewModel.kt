package org.mhsgv.portal.navigation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FormViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is form Fragment"
    }
    val text: LiveData<String> = _text
}