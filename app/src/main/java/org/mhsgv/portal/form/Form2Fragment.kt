package org.mhsgv.portal.form

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.mhsgv.portal.R

class Form2Fragment : FormFragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Form specific implementation starts here.
        return super.createView(inflater, container, savedInstanceState, R.layout.fragment_form2)
    }

    companion object {
        private val TAG = Form2Fragment::class.java.simpleName
    }
}