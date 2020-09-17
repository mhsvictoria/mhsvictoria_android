package org.mhsgv.portal.form;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.mhsgv.portal.R;

public class Form3Fragment extends FormFragment {

    private static String TAG = Form3Fragment.class.getSimpleName();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = super.createView(inflater, container, savedInstanceState, R.layout.fragment_form3);
        // Form specific implementation starts here.
        return view;
    }
}
