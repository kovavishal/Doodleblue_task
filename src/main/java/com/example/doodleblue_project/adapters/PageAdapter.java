package com.example.doodleblue_project.adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class PageAdapter extends FragmentPagerAdapter {


    private final List<Fragment> lstFragment = new ArrayList<>();
    private final List<String> lstTitles = new ArrayList<>();

    public PageAdapter(FragmentManager fm) {
        super(fm);

    }
    @NonNull
    @Override
    public Fragment getItem(int position) {

        return lstFragment.get(position);
    }

    @Override
    public int getCount() {
        return lstTitles.size();
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return lstTitles.get(position);
    }

public void AddFragment(Fragment fragment ,String title){
        lstFragment.add(fragment);
        lstTitles.add(title);
}


}
