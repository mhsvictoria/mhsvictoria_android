package org.mhsgv.portal.form;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.mhsgv.portal.MhsgvFragment;
import org.mhsgv.portal.R;

public class Form1Fragment extends MhsgvFragment {

    private static String TAG = Form1Fragment.class.getSimpleName();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = super.createView(inflater, container, savedInstanceState, R.layout.fragment_form1);
        // Form specific implementation starts here.
        return view;
    }
}
