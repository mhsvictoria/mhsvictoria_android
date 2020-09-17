package org.mhsgv.portal.navigation

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import org.mhsgv.portal.R
import org.mhsgv.portal.form.MainFormActivity

class FormFragment : Fragment() {

    private lateinit var formViewModel: FormViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        formViewModel =
                ViewModelProviders.of(this).get(FormViewModel::class.java)
        val view = inflater.inflate(R.layout.fragment_form, container, false)
        val textView: TextView = view.findViewById(R.id.text_form)
        formViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })

        return view
    }
}