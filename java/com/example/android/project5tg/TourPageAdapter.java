package com.example.android.project5tg;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TourPageAdapter extends FragmentPagerAdapter {
    private Context mContext;
    public TourPageAdapter(Context context, FragmentManager fm) {

        super(fm);
        mContext = context;
    }
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NaturalFragment();
        } else if (position == 1) {
            return new RestaurantFragment();
        } else if (position == 2) {
            return new HistoricalFragment();
        } else {
            return new MusicFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.natural_tittle);
        } else if (position == 1) {
            return mContext.getString(R.string.restaurant_tittle);
        } else if (position == 2) {
            return mContext.getString(R.string.historic_tittle);
        } else {
            return mContext.getString(R.string.music_tittle);
        }
    }
}
