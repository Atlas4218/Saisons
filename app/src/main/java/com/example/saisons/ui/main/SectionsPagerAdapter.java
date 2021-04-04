package com.example.saisons.ui.main;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.saisons.R;
import com.example.saisons.ui.main.PlaceholderFragment;

import java.util.Locale;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return PlaceholderFragment.newInstance(position,mContext.getString(R.string.titre_menu));
            case 1:
                return PlaceholderFragment.newInstance(position, mContext.getString(R.string.titre_printemps));
            case 2:
                return PlaceholderFragment.newInstance(position, mContext.getString(R.string.titre_ete));
            case 3:
                return PlaceholderFragment.newInstance(position, mContext.getString(R.string.titre_automne));
            case 4:
                return PlaceholderFragment.newInstance(position, mContext.getString(R.string.titre_hiver));
        }
        return null;
    }



    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();
        String titre="";
        switch (position) {
            case 0:
                titre = mContext.getString(R.string.titre_menu).toUpperCase(l);
                break;
            case 1:
                titre = mContext.getString(R.string.titre_printemps).toUpperCase(l);
                break;
            case 2:
                titre = mContext.getString(R.string.titre_ete).toUpperCase(l);
                break;
            case 3:
                titre = mContext.getString(R.string.titre_automne).toUpperCase(l);
                break;
            case 4:
                titre = mContext.getString(R.string.titre_hiver).toUpperCase(l);
        }

        return new SpannableString(titre);
    }








    @Override
    public int getCount() {
        return 5;
    }
}