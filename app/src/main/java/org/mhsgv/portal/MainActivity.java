package org.mhsgv.portal;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
//import info.androidhive.viewpager2.databinding.ActivityFragmentViewPagerBinding;

public class MainActivity extends AppCompatActivity {

    private String[] titles = new String[]{"Age", "Identity", "Resources"};

    //ActivityFragmentViewPagerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary));

    }

    private class ViewPagerFragmentAdapter extends FragmentStateAdapter {

        public ViewPagerFragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            switch (position) {
                case 0:
                    return MhsgvFragment.newInstance(R.layout.fragment_form1);
                case 1:
                    return  MhsgvFragment.newInstance(R.layout.fragment_form2);
            }
            return MhsgvFragment.newInstance(R.layout.fragment_form3);
        }

        @Override
        public int getItemCount() {
            return titles.length;
        }
    }
}