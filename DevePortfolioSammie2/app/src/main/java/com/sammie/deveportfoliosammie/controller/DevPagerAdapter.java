package com.sammie.deveportfoliosammie.controller;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.sammie.deveportfoliosammie.views.About;
import com.sammie.deveportfoliosammie.views.ContactFragment;
import com.sammie.deveportfoliosammie.views.SkillsFragment;
import com.sammie.deveportfoliosammie.views.WorkFragment;

public class DevPagerAdapter extends FragmentPagerAdapter {

    public DevPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0: return new About();
            case 1 : return  new WorkFragment();
            case 2: return new SkillsFragment();
            case 3: return  new ContactFragment();
        }

        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position){
            case 0:return "ABOUT";
            case 1:return "WORK";
            case 2:return "SKILLS";
            case 3:return "CONTACT";
        }
        return super.getPageTitle(position);
    }

    @Override
    public int getCount() {
        return 4;  // cz 4 fragment

    }
}
