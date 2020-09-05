package org.mhsgv.portal;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.List;

public class MhsgvPagerAdapter extends FragmentStateAdapter {

    private List<MhsgvFragment> fragments;

    public MhsgvPagerAdapter(@NonNull FragmentManager fm, Lifecycle lifecycle, List<MhsgvFragment> fragments) {
        super(fm, lifecycle);
        this.fragments = fragments;
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }
}
