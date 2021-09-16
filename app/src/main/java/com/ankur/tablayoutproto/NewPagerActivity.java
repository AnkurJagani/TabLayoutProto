package com.ankur.tablayoutproto;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.ankur.tablayoutproto.databinding.ActivityPagerNewBinding;
import com.ankur.tablayoutproto.ui.adapters.NewPagerAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class NewPagerActivity extends AppCompatActivity {

    private final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2};
    private ActivityPagerNewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPagerNewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        NewPagerAdapter newPagerAdapter = new NewPagerAdapter(this);
        ViewPager2 viewPager = binding.viewPager;
        viewPager.setAdapter(newPagerAdapter);
        new TabLayoutMediator(binding.tabs, viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setText(TAB_TITLES[position]);
            }
        }).attach();
    }
}