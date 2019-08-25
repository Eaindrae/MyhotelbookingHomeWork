package com.padcmyanmar.padc9.my_hotel_booking_application.Adapters;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.padcmyanmar.padc9.my_hotel_booking_application.fragments.NearByFragment;
import com.padcmyanmar.padc9.my_hotel_booking_application.fragments.FragmentSearch;

public class TapPagerAdapter1 extends FragmentStatePagerAdapter {
    public TapPagerAdapter1(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new NearByFragment();
        }else

            return new FragmentSearch();

    }

    @Override
    public int getCount() {
        return 2;
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0){
            return  "Nearby";
        }else
            return "Search";

    }
}
