package com.facebook.drawee.p029c;

import android.graphics.drawable.Animatable;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* renamed from: com.facebook.drawee.c.f */
public class ForwardingControllerListener<INFO> implements ControllerListener<INFO> {
    private final List<ControllerListener<? super INFO>> f1315a;

    public ForwardingControllerListener() {
        this.f1315a = new ArrayList(2);
    }

    public final synchronized void m1302a(ControllerListener<? super INFO> controllerListener) {
        this.f1315a.add(controllerListener);
    }

    public final synchronized void m1301a() {
        this.f1315a.clear();
    }

    private synchronized void m1300c(String str, Throwable th) {
        Log.e("FdingControllerListener", str, th);
    }

    public final synchronized void m1304a(String str, Object obj) {
        int size = this.f1315a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((ControllerListener) this.f1315a.get(i)).m1295a(str, obj);
            } catch (Throwable e) {
                m1300c("InternalListener exception in onSubmit", e);
            }
        }
    }

    public final synchronized void m1305a(String str, @Nullable INFO info, @Nullable Animatable animatable) {
        int size = this.f1315a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((ControllerListener) this.f1315a.get(i)).m1296a(str, info, animatable);
            } catch (Throwable e) {
                m1300c("InternalListener exception in onFinalImageSet", e);
            }
        }
    }

    public final void m1307b(String str, @Nullable INFO info) {
        int size = this.f1315a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((ControllerListener) this.f1315a.get(i)).m1298b(str, (Object) info);
            } catch (Throwable e) {
                m1300c("InternalListener exception in onIntermediateImageSet", e);
            }
        }
    }

    public final void m1306a(String str, Throwable th) {
        int size = this.f1315a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((ControllerListener) this.f1315a.get(i)).m1297a(str, th);
            } catch (Throwable e) {
                m1300c("InternalListener exception in onIntermediateImageFailed", e);
            }
        }
    }

    public final synchronized void m1308b(String str, Throwable th) {
        int size = this.f1315a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((ControllerListener) this.f1315a.get(i)).m1299b(str, th);
            } catch (Throwable e) {
                m1300c("InternalListener exception in onFailure", e);
            }
        }
    }

    public final synchronized void m1303a(String str) {
        int size = this.f1315a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((ControllerListener) this.f1315a.get(i)).m1294a(str);
            } catch (Throwable e) {
                m1300c("InternalListener exception in onRelease", e);
            }
        }
    }
}
