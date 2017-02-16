package com.illuminate.texaspoker.view.refreshlayout;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ImageView;
import android.widget.ListView;

public class RefreshListView extends ListView implements OnScrollListener {
    public boolean f7135a;
    private C0372a f7136b;
    private View f7137c;
    private int f7138d;

    /* renamed from: com.illuminate.texaspoker.view.refreshlayout.RefreshListView.a */
    public interface C0372a {
        void m2770a();
    }

    public RefreshListView(Context context) {
        super(context);
        this.f7135a = false;
        m4594b();
        setOnScrollListener(this);
    }

    public RefreshListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7135a = false;
        m4594b();
        setOnScrollListener(this);
    }

    public RefreshListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7135a = false;
        m4594b();
        setOnScrollListener(this);
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 0 && absListView.getLastVisiblePosition() == absListView.getCount() - 1 && !ViewCompat.canScrollVertically(absListView, 1)) {
            this.f7135a = true;
            this.f7137c.setPadding(0, 0, 0, 0);
            setSelection(getCount());
            this.f7136b.m2770a();
        }
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    private void m4594b() {
        this.f7137c = View.inflate(getContext(), 2130968815, null);
        ((AnimationDrawable) ((ImageView) this.f7137c.findViewById(2131559343)).getDrawable()).start();
        this.f7137c.measure(0, 0);
        this.f7138d = this.f7137c.getMeasuredHeight();
        this.f7137c.setPadding(0, -this.f7138d, 0, 0);
        addFooterView(this.f7137c, null, false);
    }

    public final void m4595a() {
        this.f7137c.setPadding(0, -this.f7138d, 0, 0);
        this.f7135a = false;
    }

    public void setOnLoadMoreListener(C0372a c0372a) {
        this.f7136b = c0372a;
    }
}
