package org.mhsgv.portal.form

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ScrollView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import com.google.android.material.tabs.TabLayoutMediator
import org.mhsgv.portal.R
import org.mhsgv.portal.form.FormFactory.create
import java.util.*

class MainFormActivity : AppCompatActivity() {
    private var titles: Array<String>? = null
    private var tabLayout: TabLayout? = null
    private var viewPager: ViewPager2? = null
    private var mainScrollView: ScrollView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_form)
        window.statusBarColor = ResourcesCompat.getColor(resources, R.color.background, null)
        mainScrollView = findViewById(R.id.main_scroll_view)
        titles = resources.getStringArray(R.array.form_names)
        viewPager = findViewById(R.id.view_pager)
        tabLayout = findViewById(R.id.tabs)
        viewPager?.adapter = createFormAdapter()

        tabLayout?.let { tl ->
            viewPager?.let { vp ->
                TabLayoutMediator(tl, vp
                ) { tab, position ->
                    run {
                        tab.text = String.format(resources.getString(R.string.position, (position + 1)))
                        tab.setCustomView(R.layout.tab_unselected_layout)
                        val customView = tab.customView!!
                        val tv = customView.findViewById<TextView>(R.id.tab_number)
                        tv.text = String.format(resources.getString(R.string.position, (position + 1)))
                        if (position == 0) {
                            setTabBackground(tab, R.drawable.tab_background)
                        }
                    }
                }.attach()

                tl.addOnTabSelectedListener(object : OnTabSelectedListener {
                    override fun onTabSelected(tab: TabLayout.Tab) {
                        setTabBackground(tab, R.drawable.tab_background)
                    }

                    @SuppressLint("UseCompatLoadingForDrawables")
                    override fun onTabUnselected(tab: TabLayout.Tab) {
                        setTabBackground(tab, R.drawable.tab_background_unselected)
                    }

                    override fun onTabReselected(tab: TabLayout.Tab) {
                        tab.customView?.let { tabRef ->
                            Objects.requireNonNull(tabRef).background = ResourcesCompat.getDrawable(resources, R.drawable.tab_background, null)
                        }

                    }

                })
            }
        }
    }

    private fun createFormAdapter(): ViewPagerFragmentAdapter? {
        return ViewPagerFragmentAdapter(this)
    }

    private fun setTabBackground(tab: TabLayout.Tab, background: Int) {
        tab.customView?.let {
            Objects.requireNonNull(it).background = ResourcesCompat.getDrawable(resources, background, null)
        }
    }

    private inner class ViewPagerFragmentAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
        override fun createFragment(position: Int): Fragment {
            return create(position)
        }

        override fun getItemCount(): Int {
            titles?.let {
                return it.size
            }
            return 0
        }
    }
}