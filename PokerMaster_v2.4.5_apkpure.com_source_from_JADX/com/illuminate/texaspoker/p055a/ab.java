package com.illuminate.texaspoker.p055a;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.List;

/* compiled from: MainFragmentPagerAdapter */
/* renamed from: com.illuminate.texaspoker.a.ab */
public final class ab extends FragmentPagerAdapter {
    List<Fragment> f2807a;

    public ab(FragmentManager fragmentManager, List<Fragment> list) {
        super(fragmentManager);
        this.f2807a = list;
    }

    public final Fragment getItem(int i) {
        return (Fragment) this.f2807a.get(i);
    }

    public final int getCount() {
        return this.f2807a.size();
    }
}
