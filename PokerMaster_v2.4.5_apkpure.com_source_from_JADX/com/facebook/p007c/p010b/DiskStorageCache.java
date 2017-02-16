package com.facebook.p007c.p010b;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.StatFs;
import com.facebook.common.p014e.FLog;
import com.facebook.common.p019j.StatFsHelper;
import com.facebook.common.time.Clock;
import com.facebook.common.time.SystemClock;
import com.facebook.p006b.BinaryResource;
import com.facebook.p007c.p008a.CacheErrorLogger;
import com.facebook.p007c.p008a.CacheEventListener;
import com.facebook.p007c.p008a.CacheKey;
import com.facebook.p007c.p008a.CacheKeyUtil;
import com.facebook.p007c.p008a.WriterCallback;
import com.facebook.p007c.p010b.DiskStorage.DiskStorage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* renamed from: com.facebook.c.b.e */
public class DiskStorageCache implements FileCache {
    private static final Class<?> f1055b;
    private static final long f1056c;
    private static final long f1057d;
    @GuardedBy("mLock")
    final Set<String> f1058a;
    private final long f1059e;
    private final long f1060f;
    private final CountDownLatch f1061g;
    private long f1062h;
    private final CacheEventListener f1063i;
    @GuardedBy("mLock")
    private long f1064j;
    private final long f1065k;
    private final StatFsHelper f1066l;
    private final DiskStorage f1067m;
    private final EntryEvictionComparatorSupplier f1068n;
    private final CacheErrorLogger f1069o;
    private final boolean f1070p;
    private final DiskStorageCache f1071q;
    private final Clock f1072r;
    private final Object f1073s;
    private boolean f1074t;

    /* renamed from: com.facebook.c.b.e.1 */
    class DiskStorageCache implements Runnable {
        final /* synthetic */ DiskStorageCache f1046a;

        DiskStorageCache(DiskStorageCache diskStorageCache) {
            this.f1046a = diskStorageCache;
        }

        public final void run() {
            synchronized (this.f1046a.f1073s) {
                this.f1046a.m979a();
            }
            this.f1046a.f1061g.countDown();
        }
    }

    /* renamed from: com.facebook.c.b.e.2 */
    class DiskStorageCache implements Runnable {
        final /* synthetic */ Context f1047a;
        final /* synthetic */ DiskStorageCache f1048b;

        DiskStorageCache(DiskStorageCache diskStorageCache, Context context) {
            this.f1048b = diskStorageCache;
            this.f1047a = context;
        }

        public final void run() {
            DiskStorageCache.m978a(this.f1047a, this.f1048b.f1067m.m939b());
        }
    }

    /* renamed from: com.facebook.c.b.e.a */
    static class DiskStorageCache {
        private boolean f1049a;
        private long f1050b;
        private long f1051c;

        DiskStorageCache() {
            this.f1049a = false;
            this.f1050b = -1;
            this.f1051c = -1;
        }

        public final synchronized boolean m966a() {
            return this.f1049a;
        }

        public final synchronized void m967b() {
            this.f1049a = false;
            this.f1051c = -1;
            this.f1050b = -1;
        }

        public final synchronized void m965a(long j, long j2) {
            this.f1051c = j2;
            this.f1050b = j;
            this.f1049a = true;
        }

        public final synchronized void m968b(long j, long j2) {
            if (this.f1049a) {
                this.f1050b += j;
                this.f1051c += j2;
            }
        }

        public final synchronized long m969c() {
            return this.f1050b;
        }

        public final synchronized long m970d() {
            return this.f1051c;
        }
    }

    /* renamed from: com.facebook.c.b.e.b */
    public static class DiskStorageCache {
        public final long f1052a;
        public final long f1053b;
        public final long f1054c;

        public DiskStorageCache(long j, long j2, long j3) {
            this.f1052a = j;
            this.f1053b = j2;
            this.f1054c = j3;
        }
    }

    static {
        f1055b = DiskStorageCache.class;
        f1056c = TimeUnit.HOURS.toMillis(2);
        f1057d = TimeUnit.MINUTES.toMillis(30);
    }

    public DiskStorageCache(DiskStorage diskStorage, EntryEvictionComparatorSupplier entryEvictionComparatorSupplier, DiskStorageCache diskStorageCache, CacheEventListener cacheEventListener, CacheErrorLogger cacheErrorLogger, Context context, Executor executor, boolean z) {
        this.f1073s = new Object();
        this.f1059e = diskStorageCache.f1053b;
        this.f1060f = diskStorageCache.f1054c;
        this.f1062h = diskStorageCache.f1054c;
        this.f1066l = StatFsHelper.m1113a();
        this.f1067m = diskStorage;
        this.f1068n = entryEvictionComparatorSupplier;
        this.f1064j = -1;
        this.f1063i = cacheEventListener;
        this.f1065k = diskStorageCache.f1052a;
        this.f1069o = cacheErrorLogger;
        this.f1071q = new DiskStorageCache();
        this.f1072r = SystemClock.m1142b();
        this.f1070p = z;
        this.f1058a = new HashSet();
        if (this.f1070p) {
            this.f1061g = new CountDownLatch(1);
            executor.execute(new DiskStorageCache(this));
        } else {
            this.f1061g = new CountDownLatch(0);
        }
        executor.execute(new DiskStorageCache(this, context));
    }

    public final BinaryResource m984a(CacheKey cacheKey) {
        SettableCacheEvent a = SettableCacheEvent.m997a();
        a.f1086a = cacheKey;
        try {
            BinaryResource binaryResource;
            synchronized (this.f1073s) {
                List a2 = CacheKeyUtil.m907a(cacheKey);
                int i = 0;
                Object obj = null;
                binaryResource = null;
                while (i < a2.size()) {
                    String str = (String) a2.get(i);
                    a.f1087b = str;
                    BinaryResource b = this.f1067m.m938b(str, cacheKey);
                    BinaryResource binaryResource2;
                    if (b != null) {
                        binaryResource2 = b;
                        obj = str;
                        binaryResource = binaryResource2;
                        break;
                    }
                    i++;
                    binaryResource2 = b;
                    String str2 = str;
                    binaryResource = binaryResource2;
                }
                if (binaryResource == null) {
                    this.f1058a.remove(obj);
                } else {
                    this.f1058a.add(obj);
                }
            }
            a.m998b();
            return binaryResource;
        } catch (IOException e) {
            try {
                int i2 = CacheErrorLogger.CacheErrorLogger.f982p;
                a.f1091f = e;
                return null;
            } finally {
                a.m998b();
            }
        }
    }

    private BinaryResource m975a(DiskStorage diskStorage, String str) {
        BinaryResource a;
        synchronized (this.f1073s) {
            a = diskStorage.m926a();
            this.f1058a.add(str);
            this.f1071q.m968b(a.m895b(), 1);
        }
        return a;
    }

    public final BinaryResource m985a(CacheKey cacheKey, WriterCallback writerCallback) {
        String b;
        SettableCacheEvent a = SettableCacheEvent.m997a();
        a.f1086a = cacheKey;
        synchronized (this.f1073s) {
            b = CacheKeyUtil.m908b(cacheKey);
        }
        a.f1087b = b;
        DiskStorage a2;
        try {
            a2 = m976a(b, cacheKey);
            a2.m927a(writerCallback);
            BinaryResource a3 = m975a(a2, b);
            a.f1088c = a3.m895b();
            a.f1090e = this.f1071q.m969c();
            if (!a2.m928b()) {
                FLog.m1061d(f1055b, "Failed to delete temp file");
            }
            a.m998b();
            return a3;
        } catch (Throwable e) {
            try {
                a.f1091f = e;
                FLog.m1045a(f1055b, "Failed inserting a file into the cache", e);
                throw e;
            } catch (Throwable th) {
                a.m998b();
            }
        } catch (Throwable th2) {
            if (!a2.m928b()) {
                FLog.m1061d(f1055b, "Failed to delete temp file");
            }
        }
    }

    public final boolean m986b(CacheKey cacheKey) {
        synchronized (this.f1073s) {
            List a = CacheKeyUtil.m907a(cacheKey);
            for (int i = 0; i < a.size(); i++) {
                if (this.f1058a.contains((String) a.get(i))) {
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean m987c(CacheKey cacheKey) {
        synchronized (this.f1073s) {
            if (m986b(cacheKey)) {
                return true;
            }
            try {
                List a = CacheKeyUtil.m907a(cacheKey);
                for (int i = 0; i < a.size(); i++) {
                    String str = (String) a.get(i);
                    if (this.f1067m.m941c(str, cacheKey)) {
                        this.f1058a.add(str);
                        return true;
                    }
                }
                return false;
            } catch (IOException e) {
                return false;
            }
        }
    }

    @GuardedBy("mLock")
    private boolean m979a() {
        long a = this.f1072r.m1141a();
        if (!this.f1071q.m966a() || this.f1064j == -1 || a - this.f1064j > f1057d) {
            return m980b();
        }
        return false;
    }

    @GuardedBy("mLock")
    private boolean m980b() {
        long a = this.f1072r.m1141a();
        long j = a + f1056c;
        if (this.f1070p && this.f1058a.isEmpty()) {
            Set set = this.f1058a;
        } else if (this.f1070p) {
            Object hashSet = new HashSet();
        } else {
            Collection collection = null;
        }
        int i;
        try {
            long j2 = 0;
            int i2 = 0;
            Object obj = null;
            int i3 = 0;
            long j3 = -1;
            i = 0;
            for (DiskStorage diskStorage : this.f1067m.m942d()) {
                int i4 = i2 + 1;
                j2 += diskStorage.m921c();
                if (diskStorage.m920b() > j) {
                    j3 = Math.max(diskStorage.m920b() - a, j3);
                    i = (int) (((long) i) + diskStorage.m921c());
                    i3++;
                    obj = 1;
                    i2 = i4;
                } else {
                    if (this.f1070p) {
                        set.add(diskStorage.m919a());
                    }
                    i2 = i4;
                }
            }
            if (obj != null) {
                int i5 = CacheErrorLogger.CacheErrorLogger.f970d;
                new StringBuilder("Future timestamp found in ").append(i3).append(" files , with a total size of ").append(i).append(" bytes, and a maximum time delta of ").append(j3).append("ms");
            }
            if (!(this.f1071q.m970d() == ((long) i2) && this.f1071q.m969c() == j2)) {
                if (this.f1070p && this.f1058a != set) {
                    this.f1074t = true;
                } else if (this.f1070p) {
                    this.f1058a.clear();
                    this.f1058a.addAll(set);
                }
                this.f1071q.m965a(j2, (long) i2);
            }
            this.f1064j = a;
            return true;
        } catch (IOException e) {
            i = CacheErrorLogger.CacheErrorLogger.f982p;
            new StringBuilder("calcFileCacheSize: ").append(e.getMessage());
            return false;
        }
    }

    private DiskStorage m976a(String str, CacheKey cacheKey) {
        synchronized (this.f1073s) {
            int i;
            long blockSizeLong;
            long availableBlocksLong;
            Object obj;
            boolean a = m979a();
            int i2 = this.f1067m.m937a() ? StatFsHelper.StatFsHelper.f1136b : StatFsHelper.StatFsHelper.f1135a;
            StatFsHelper statFsHelper = this.f1066l;
            long c = this.f1060f - this.f1071q.m969c();
            statFsHelper.m1114b();
            statFsHelper.m1114b();
            if (statFsHelper.f1143e.tryLock()) {
                try {
                    if (android.os.SystemClock.uptimeMillis() - statFsHelper.f1142d > StatFsHelper.f1138a) {
                        statFsHelper.m1115c();
                    }
                    statFsHelper.f1143e.unlock();
                } catch (IOException e) {
                    i = CacheErrorLogger.CacheErrorLogger.f981o;
                    new StringBuilder("evictAboveSize: ").append(e.getMessage());
                    throw e;
                } catch (Throwable th) {
                    statFsHelper.f1143e.unlock();
                }
            }
            StatFs statFs = i2 == StatFsHelper.StatFsHelper.f1135a ? statFsHelper.f1140b : statFsHelper.f1141c;
            if (statFs != null) {
                if (VERSION.SDK_INT >= 18) {
                    blockSizeLong = statFs.getBlockSizeLong();
                    availableBlocksLong = statFs.getAvailableBlocksLong();
                } else {
                    blockSizeLong = (long) statFs.getBlockSize();
                    availableBlocksLong = (long) statFs.getAvailableBlocks();
                }
                availableBlocksLong *= blockSizeLong;
            } else {
                availableBlocksLong = 0;
            }
            if (availableBlocksLong <= 0 || availableBlocksLong < c) {
                obj = 1;
            } else {
                obj = null;
            }
            if (obj != null) {
                this.f1062h = this.f1059e;
            } else {
                this.f1062h = this.f1060f;
            }
            availableBlocksLong = this.f1071q.m969c();
            if (availableBlocksLong > this.f1062h && !a) {
                this.f1071q.m967b();
                m979a();
            }
            if (availableBlocksLong > this.f1062h) {
                c = (this.f1062h * 9) / 10;
                int i3 = CacheEventListener.CacheEventListener.f985a;
                Collection<DiskStorage> d = this.f1067m.m942d();
                blockSizeLong = this.f1072r.m1141a() + f1056c;
                Collection<DiskStorage> arrayList = new ArrayList(d.size());
                Collection arrayList2 = new ArrayList(d.size());
                for (DiskStorage diskStorage : d) {
                    if (diskStorage.m920b() > blockSizeLong) {
                        arrayList.add(diskStorage);
                    } else {
                        arrayList2.add(diskStorage);
                    }
                }
                Collections.sort(arrayList2, this.f1068n.m961a());
                arrayList.addAll(arrayList2);
                long c2 = this.f1071q.m969c();
                long j = c2 - c;
                i = 0;
                blockSizeLong = 0;
                for (DiskStorage diskStorage2 : arrayList) {
                    if (blockSizeLong > j) {
                        break;
                    }
                    long a2 = this.f1067m.m935a(diskStorage2);
                    this.f1058a.remove(diskStorage2.m919a());
                    if (a2 > 0) {
                        i++;
                        blockSizeLong += a2;
                        SettableCacheEvent a3 = SettableCacheEvent.m997a();
                        a3.f1087b = diskStorage2.m919a();
                        a3.f1092g = i3;
                        a3.f1088c = a2;
                        a3.f1090e = c2 - blockSizeLong;
                        a3.f1089d = c;
                        a3.m998b();
                    }
                    long j2 = blockSizeLong;
                    i = i;
                }
                this.f1071q.m968b(-blockSizeLong, (long) (-i));
                this.f1067m.m940c();
            }
        }
        return this.f1067m.m936a(str, cacheKey);
    }

    static /* synthetic */ void m978a(Context context, String str) {
        File file = new File((context.getApplicationContext().getFilesDir().getParent() + File.separator + "shared_prefs" + File.separator + "disk_entries_list" + str) + ".xml");
        try {
            if (file.exists()) {
                file.delete();
            }
        } catch (Exception e) {
            FLog.m1061d(f1055b, "Fail to delete SharedPreference from file system. ");
        }
    }
}
