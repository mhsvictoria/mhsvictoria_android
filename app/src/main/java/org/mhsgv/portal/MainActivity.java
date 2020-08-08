package org.mhsgv.portal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import static androidx.fragment.app.FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private MhsgvPagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.mhsgv_pager);
        pagerAdapter = new MhsgvPagerAdapter(getSupportFragmentManager(), BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT, createForms());
        viewPager.setAdapter(pagerAdapter);
    }

    private List<MhsgvFragment> createForms() {
        List<MhsgvFragment> f = new ArrayList<>();
        MhsgvFragment form1 = MhsgvFragment.newInstance(R.layout.fragment_form1);
        f.add(form1);
        MhsgvFragment form2 = MhsgvFragment.newInstance(R.layout.fragment_form2);
        f.add(form2);
        MhsgvFragment form3 = MhsgvFragment.newInstance(R.layout.fragment_form3);
        f.add(form3);
        return f;
    }
}