package org.mhsgv.portal.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import org.mhsgv.portal.R

class AppointmentFragment : Fragment() {

    private lateinit var appointmentViewModel: AppointmentViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        appointmentViewModel = ViewModelProvider.NewInstanceFactory().create(AppointmentViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_form, container, false)
        val textView: TextView = root.findViewById(R.id.text_appointment)
        appointmentViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}