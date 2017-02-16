package com.facebook.p004a;

import android.preference.PreferenceManager;
import android.util.Log;
import com.facebook.FacebookSdk;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.facebook.a.b */
class AnalyticsUserIDStore {
    private static final String f860a;
    private static ReentrantReadWriteLock f861b;
    private static String f862c;
    private static volatile boolean f863d;

    /* renamed from: com.facebook.a.b.1 */
    static class AnalyticsUserIDStore implements Runnable {
        AnalyticsUserIDStore() {
        }

        public final void run() {
            AnalyticsUserIDStore.m846d();
        }
    }

    AnalyticsUserIDStore() {
    }

    static {
        f860a = AnalyticsUserIDStore.class.getSimpleName();
        f861b = new ReentrantReadWriteLock();
        f863d = false;
    }

    public static void m843a() {
        if (!f863d) {
            AppEventsLogger.m833f().execute(new AnalyticsUserIDStore());
        }
    }

    public static String m844b() {
        if (!f863d) {
            Log.w(f860a, "initStore should have been called before calling setUserID");
            AnalyticsUserIDStore.m846d();
        }
        f861b.readLock().lock();
        try {
            String str = f862c;
            return str;
        } finally {
            f861b.readLock().unlock();
        }
    }

    private static void m846d() {
        if (!f863d) {
            f861b.writeLock().lock();
            try {
                if (!f863d) {
                    f862c = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.m2586f()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
                    f863d = true;
                    f861b.writeLock().unlock();
                }
            } finally {
                f861b.writeLock().unlock();
            }
        }
    }
}
