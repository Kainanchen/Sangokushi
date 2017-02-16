package com.facebook.common.p019j;

import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import com.facebook.common.p011d.Throwables;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* renamed from: com.facebook.common.j.a */
public final class StatFsHelper {
    public static final long f1138a;
    private static StatFsHelper f1139f;
    public volatile StatFs f1140b;
    public volatile StatFs f1141c;
    @GuardedBy("lock")
    public long f1142d;
    public final Lock f1143e;
    private volatile File f1144g;
    private volatile File f1145h;
    private volatile boolean f1146i;

    /* renamed from: com.facebook.common.j.a.a */
    public enum StatFsHelper {
        ;

        static {
            f1135a = 1;
            f1136b = 2;
            f1137c = new int[]{f1135a, f1136b};
        }
    }

    static {
        f1138a = TimeUnit.MINUTES.toMillis(2);
    }

    public static synchronized StatFsHelper m1113a() {
        StatFsHelper statFsHelper;
        synchronized (StatFsHelper.class) {
            if (f1139f == null) {
                f1139f = new StatFsHelper();
            }
            statFsHelper = f1139f;
        }
        return statFsHelper;
    }

    protected StatFsHelper() {
        this.f1140b = null;
        this.f1141c = null;
        this.f1146i = false;
        this.f1143e = new ReentrantLock();
    }

    public final void m1114b() {
        if (!this.f1146i) {
            this.f1143e.lock();
            try {
                if (!this.f1146i) {
                    this.f1144g = Environment.getDataDirectory();
                    this.f1145h = Environment.getExternalStorageDirectory();
                    m1115c();
                    this.f1146i = true;
                }
                this.f1143e.unlock();
            } catch (Throwable th) {
                this.f1143e.unlock();
            }
        }
    }

    @GuardedBy("lock")
    public final void m1115c() {
        this.f1140b = StatFsHelper.m1112a(this.f1140b, this.f1144g);
        this.f1141c = StatFsHelper.m1112a(this.f1141c, this.f1145h);
        this.f1142d = SystemClock.uptimeMillis();
    }

    private static StatFs m1112a(@Nullable StatFs statFs, @Nullable File file) {
        if (file == null || !file.exists()) {
            return null;
        }
        if (statFs == null) {
            try {
                return new StatFs(file.getAbsolutePath());
            } catch (IllegalArgumentException e) {
                return null;
            } catch (Throwable th) {
                RuntimeException b = Throwables.m1039b(th);
            }
        } else {
            statFs.restat(file.getAbsolutePath());
            return statFs;
        }
    }
}
