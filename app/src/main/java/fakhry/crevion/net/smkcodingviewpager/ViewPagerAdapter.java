package fakhry.crevion.net.smkcodingviewpager;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Fakhry on 3/9/19.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter{
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new FragmentSatu();
        }else if (position == 1){
            return new FragmentDua();
        }

        throw new IllegalStateException("Position not valid");
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0 || position % 2 == 0){
            return "First";
        }else if (position % 2 == 1){
            return "Second";
        }

        throw new IllegalStateException("Position not valid");
    }
}
