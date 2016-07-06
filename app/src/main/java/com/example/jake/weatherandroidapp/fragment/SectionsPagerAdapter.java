package com.example.jake.weatherandroidapp.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Jake on 16/7/5.
 */

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        private static   ArrayList<PlaceholderFragment> fragmentsList=new ArrayList<>();

    public static ArrayList<PlaceholderFragment> getFragmentsList() {
        return fragmentsList;
    }

    public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
           // return PlaceholderFragment.newInstance(position + 1);
            return fragmentsList.get(position);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return fragmentsList.size();
        }
//
//        @Override
//        public CharSequence getPageTitle(int position) {
//
//
//            return null;
//        }
    }
