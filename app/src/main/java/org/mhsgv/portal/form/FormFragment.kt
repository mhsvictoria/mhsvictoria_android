package org.mhsgv.portal.form

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

open class FormFragment : Fragment() {
    protected fun createView(inflater: LayoutInflater, container: ViewGroup?,
                             savedInstanceState: Bundle?, layout: Int): View {
        // Inflate the layout for this fragment
        return inflater.inflate(layout, container, false)
    }
}