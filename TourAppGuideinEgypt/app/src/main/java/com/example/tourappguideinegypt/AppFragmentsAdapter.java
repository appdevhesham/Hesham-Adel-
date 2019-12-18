package com.example.tourappguideinegypt;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class AppFragmentsAdapter extends FragmentPagerAdapter {
    public AppFragmentsAdapter(MainActivity mainActivity, FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new EgyptianMuseum();
        } else if (position == 1) {
            return new GizaNecropolis();
        } else if (position == 2) {
            return new KhanelKhalili();
        } else if (position == 3) {
            return new MontazaPalace();
        } else
            return new PyramidofDjoser();
    }

    @Override
    public int getCount() {
        return 5;
    }
}
