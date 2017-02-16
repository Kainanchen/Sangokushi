package com.illuminate.texaspoker.view.refreshlayout;

import android.os.Build.VERSION;
import android.view.View;
import android.widget.AbsListView;

/* renamed from: com.illuminate.texaspoker.view.refreshlayout.a */
public abstract class RefreshDefaultHandler implements RefreshHandler {
    public static boolean m4596b(View view) {
        boolean canScrollVertically;
        if (VERSION.SDK_INT >= 14) {
            canScrollVertically = view.canScrollVertically(-1);
        } else if (view instanceof AbsListView) {
            AbsListView absListView = (AbsListView) view;
            canScrollVertically = absListView.getChildCount() > 0 && (absListView.getFirstVisiblePosition() > 0 || absListView.getChildAt(0).getTop() < absListView.getPaddingTop());
        } else {
            canScrollVertically = view.getScrollY() > 0;
        }
        if (canScrollVertically) {
            return false;
        }
        return true;
    }
}
