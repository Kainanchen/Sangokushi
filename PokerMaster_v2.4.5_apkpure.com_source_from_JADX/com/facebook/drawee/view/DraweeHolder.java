package com.facebook.drawee.view;

import android.graphics.drawable.Drawable;
import com.facebook.common.p011d.Objects;
import com.facebook.common.p014e.FLog;
import com.facebook.common.p016g.MemoryUiTrimmable;
import com.facebook.drawee.p026b.DraweeEventTracker;
import com.facebook.drawee.p028g.DraweeController;
import com.facebook.drawee.p028g.DraweeHierarchy;
import com.facebook.drawee.p030d.VisibilityAwareDrawable;
import com.facebook.drawee.p030d.VisibilityCallback;
import javax.annotation.Nullable;

/* renamed from: com.facebook.drawee.view.b */
public final class DraweeHolder<DH extends DraweeHierarchy> implements MemoryUiTrimmable, VisibilityCallback {
    boolean f1496a;
    DH f1497b;
    DraweeController f1498c;
    final DraweeEventTracker f1499d;
    private boolean f1500e;
    private boolean f1501f;
    private boolean f1502g;

    public DraweeHolder() {
        this.f1500e = false;
        this.f1496a = false;
        this.f1501f = true;
        this.f1502g = false;
        this.f1498c = null;
        this.f1499d = DraweeEventTracker.m1288a();
    }

    public final void m1439a(boolean z) {
        if (this.f1501f != z) {
            this.f1499d.m1289a(z ? DraweeEventTracker.DraweeEventTracker.ON_DRAWABLE_SHOW : DraweeEventTracker.DraweeEventTracker.ON_DRAWABLE_HIDE);
            this.f1501f = z;
            m1441c();
        }
    }

    public final void m1436a() {
        if (!this.f1500e) {
            if (!this.f1502g) {
                FLog.m1062d(DraweeEventTracker.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f1498c)), toString());
            }
            this.f1502g = false;
            this.f1496a = true;
            this.f1501f = true;
            m1441c();
        }
    }

    final void m1437a(@Nullable VisibilityCallback visibilityCallback) {
        Drawable b = m1440b();
        if (b instanceof VisibilityAwareDrawable) {
            ((VisibilityAwareDrawable) b).m1389a(visibilityCallback);
        }
    }

    public final void m1438a(@Nullable DraweeController draweeController) {
        boolean z = this.f1500e;
        if (z) {
            m1435e();
        }
        if (this.f1498c != null) {
            this.f1499d.m1289a(DraweeEventTracker.DraweeEventTracker.ON_CLEAR_OLD_CONTROLLER);
            this.f1498c.m1217a(null);
        }
        this.f1498c = draweeController;
        if (this.f1498c != null) {
            this.f1499d.m1289a(DraweeEventTracker.DraweeEventTracker.ON_SET_CONTROLLER);
            this.f1498c.m1217a(this.f1497b);
        } else {
            this.f1499d.m1289a(DraweeEventTracker.DraweeEventTracker.ON_CLEAR_CONTROLLER);
        }
        if (z) {
            m1434d();
        }
    }

    public final Drawable m1440b() {
        return this.f1497b == null ? null : this.f1497b.m1392a();
    }

    private void m1434d() {
        if (!this.f1500e) {
            this.f1499d.m1289a(DraweeEventTracker.DraweeEventTracker.ON_ATTACH_CONTROLLER);
            this.f1500e = true;
            if (this.f1498c != null && this.f1498c.m1219d() != null) {
                this.f1498c.m1220e();
            }
        }
    }

    private void m1435e() {
        if (this.f1500e) {
            this.f1499d.m1289a(DraweeEventTracker.DraweeEventTracker.ON_DETACH_CONTROLLER);
            this.f1500e = false;
            if (this.f1498c != null) {
                this.f1498c.m1221f();
            }
        }
    }

    final void m1441c() {
        if (this.f1496a && this.f1501f && !this.f1502g) {
            m1434d();
        } else {
            m1435e();
        }
    }

    public final String toString() {
        return Objects.m1028a(this).m1027a("controllerAttached", this.f1500e).m1027a("holderAttached", this.f1496a).m1027a("drawableVisible", this.f1501f).m1027a("trimmed", this.f1502g).m1026a("events", this.f1499d.toString()).toString();
    }
}
