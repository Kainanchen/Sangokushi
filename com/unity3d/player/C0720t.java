package com.unity3d.player;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.unity3d.player.t */
final class C0720t {
    public static C0720t f2319a;
    private final ViewGroup f2320b;
    private Set f2321c;
    private View f2322d;
    private View f2323e;

    C0720t(ViewGroup viewGroup) {
        this.f2321c = new HashSet();
        this.f2320b = viewGroup;
        f2319a = this;
    }

    private void m2620e(View view) {
        this.f2320b.addView(view, this.f2320b.getChildCount());
    }

    private void m2621f(View view) {
        this.f2320b.removeView(view);
        this.f2320b.requestLayout();
    }

    public final Context m2622a() {
        return this.f2320b.getContext();
    }

    public final void m2623a(View view) {
        this.f2321c.add(view);
        if (this.f2322d != null) {
            m2620e(view);
        }
    }

    public final void m2624b(View view) {
        this.f2321c.remove(view);
        if (this.f2322d != null) {
            m2621f(view);
        }
    }

    public final void m2625c(View view) {
        if (this.f2322d != view) {
            this.f2322d = view;
            this.f2320b.addView(view);
            for (View e : this.f2321c) {
                m2620e(e);
            }
            if (this.f2323e != null) {
                this.f2323e.setVisibility(4);
            }
        }
    }

    public final void m2626d(View view) {
        if (this.f2322d == view) {
            for (View f : this.f2321c) {
                m2621f(f);
            }
            this.f2320b.removeView(view);
            this.f2322d = null;
            if (this.f2323e != null) {
                this.f2323e.setVisibility(0);
            }
        }
    }
}
