package com.example.doodleblue_project.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.doodleblue_project.R;
import com.example.doodleblue_project.adapters.AvailableFragment;
import com.example.doodleblue_project.adapters.LoanedFragment;
import com.example.doodleblue_project.adapters.PageAdapter;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
//import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity {


    private PageAdapter pageAdapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tablayout);
        TabItem loanedItems = findViewById(R.id.loanedItems);
        TabItem availableItems = findViewById(R.id.availableItems);
        viewPager = findViewById(R.id.viewPager);
        pageAdapter = new PageAdapter(getSupportFragmentManager());

        pageAdapter.AddFragment(new LoanedFragment(),"Loaned Items");
        pageAdapter.AddFragment(new AvailableFragment(),"Available Items");



        viewPager.setAdapter(pageAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setupWithViewPager(viewPager);



    }
}