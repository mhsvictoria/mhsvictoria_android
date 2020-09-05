package org.mhsgv.portal;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MhsgvFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MhsgvFragment extends Fragment {

    private static String TAG = MhsgvFragment.class.getSimpleName();

    private static final String LAYOUT = "layout";

    public MhsgvFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     * @return A new instance of fragment MhsgvFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MhsgvFragment newInstance(int layout) {
        MhsgvFragment fragment = new MhsgvFragment();
        Bundle args = new Bundle();
        args.putInt(LAYOUT, layout);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d(TAG, "FRAGMENT CREATE VIEW " + getArguments().getInt(LAYOUT));
        View view = inflater.inflate(getArguments().getInt(LAYOUT), container, false);
        TextView textView = view.findViewById(R.id.text);
        return view;
    }
}