package com.facebook.drawee.p026b;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: com.facebook.drawee.b.b */
public class DraweeEventTracker {
    private static final DraweeEventTracker f1306b;
    private static boolean f1307c;
    private final Queue<DraweeEventTracker> f1308a;

    /* renamed from: com.facebook.drawee.b.b.a */
    public enum DraweeEventTracker {
        ON_SET_HIERARCHY,
        ON_CLEAR_HIERARCHY,
        ON_SET_CONTROLLER,
        ON_CLEAR_OLD_CONTROLLER,
        ON_CLEAR_CONTROLLER,
        ON_INIT_CONTROLLER,
        ON_ATTACH_CONTROLLER,
        ON_DETACH_CONTROLLER,
        ON_RELEASE_CONTROLLER,
        ON_DATASOURCE_SUBMIT,
        ON_DATASOURCE_RESULT,
        ON_DATASOURCE_RESULT_INT,
        ON_DATASOURCE_FAILURE,
        ON_DATASOURCE_FAILURE_INT,
        ON_HOLDER_ATTACH,
        ON_HOLDER_DETACH,
        ON_HOLDER_TRIM,
        ON_HOLDER_UNTRIM,
        ON_DRAWABLE_SHOW,
        ON_DRAWABLE_HIDE,
        ON_ACTIVITY_START,
        ON_ACTIVITY_STOP,
        ON_RUN_CLEAR_CONTROLLER,
        ON_SCHEDULE_CLEAR_CONTROLLER,
        ON_SAME_CONTROLLER_SKIPPED,
        ON_SUBMIT_CACHE_HIT
    }

    static {
        f1306b = new DraweeEventTracker();
        f1307c = true;
    }

    private DraweeEventTracker() {
        this.f1308a = new ArrayBlockingQueue(20);
    }

    public static DraweeEventTracker m1288a() {
        return f1307c ? new DraweeEventTracker() : f1306b;
    }

    public final void m1289a(DraweeEventTracker draweeEventTracker) {
        if (f1307c) {
            if (this.f1308a.size() + 1 > 20) {
                this.f1308a.poll();
            }
            this.f1308a.add(draweeEventTracker);
        }
    }

    public String toString() {
        return this.f1308a.toString();
    }
}
