package com.thenewboston.fragmentexamples;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Hytham on 12/2/2016.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    int[] image = {R.drawable.ahmed ,R.drawable.tarek ,R.drawable.sun,R.drawable.car ,R.drawable.robbit ,R.drawable.hhh};

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new MyViewPagerFragment().newInstance(position,image[position]);
    }

    @Override
    public int getCount() {
        return image.length;
    }
}
