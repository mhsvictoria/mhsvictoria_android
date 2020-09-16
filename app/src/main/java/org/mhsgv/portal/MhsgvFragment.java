package org.mhsgv.portal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class MhsgvFragment extends Fragment {

    protected View createView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState, int layout) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(layout, container, false);
        return view;
    }

}