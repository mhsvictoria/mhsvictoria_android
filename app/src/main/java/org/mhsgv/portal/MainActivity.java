package org.mhsgv.portal;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private String[] titles;

    TabLayout tabLayout;
    ViewPager2 viewPager;
    ScrollView mainScrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setStatusBarColor(getResources().getColor(R.color.background));
        mainScrollView = findViewById(R.id.main_scroll_view);

        titles = getResources().getStringArray(R.array.form_names);

        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tabs);

        viewPager.setAdapter(createFormAdapter());
        new TabLayoutMediator(tabLayout, viewPager,
                new TabLayoutMediator.TabConfigurationStrategy() {
                    @SuppressLint("SetTextI18n")
                    @Override public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                        tab.setText("" + (position + 1));
                        tab.setCustomView(R.layout.tab_unselected_layout);
                        View customView = tab.getCustomView();
                        assert customView != null;
                        TextView tv = customView.findViewById(R.id.tab_number);
                        tv.setText("" + (position + 1));
                        if(position == 0) {
                            Objects.requireNonNull(tab.getCustomView()).setBackground(getResources().getDrawable(R.drawable.tab_background));
                        }
                    }
                }).attach();
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Objects.requireNonNull(tab.getCustomView()).setBackground(getResources().getDrawable(R.drawable.tab_background));
            }

            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                Objects.requireNonNull(tab.getCustomView()).setBackground(getResources().getDrawable(R.drawable.tab_background_unselected));
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                Objects.requireNonNull(tab.getCustomView()).setBackground(getResources().getDrawable(R.drawable.tab_background));
            }
        });

    }

    private ViewPagerFragmentAdapter createFormAdapter() {
        return new ViewPagerFragmentAdapter(this);
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