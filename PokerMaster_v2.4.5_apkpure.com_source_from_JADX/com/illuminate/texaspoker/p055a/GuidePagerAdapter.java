package com.illuminate.texaspoker.p055a;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: com.illuminate.texaspoker.a.v */
public final class GuidePagerAdapter extends PagerAdapter {
    private List<View> f3453a;

    public GuidePagerAdapter(List<View> list) {
        this.f3453a = list;
    }

    public final int getCount() {
        return this.f3453a.size();
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) this.f3453a.get(i));
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        viewGroup.addView((View) this.f3453a.get(i), 0);
        return this.f3453a.get(i);
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}
