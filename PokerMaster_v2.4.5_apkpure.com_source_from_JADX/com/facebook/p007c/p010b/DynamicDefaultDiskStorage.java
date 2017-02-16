package com.facebook.p007c.p010b;

import com.facebook.common.p009c.FileTree;
import com.facebook.common.p009c.FileUtils;
import com.facebook.common.p011d.Preconditions;
import com.facebook.common.p011d.Supplier;
import com.facebook.common.p014e.FLog;
import com.facebook.p006b.BinaryResource;
import com.facebook.p007c.p008a.CacheErrorLogger;
import com.facebook.p007c.p010b.DiskStorage.DiskStorage;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import javax.annotation.Nullable;

/* renamed from: com.facebook.c.b.f */
public class DynamicDefaultDiskStorage implements DiskStorage {
    private static final Class<?> f1077b;
    volatile DynamicDefaultDiskStorage f1078a;
    private final int f1079c;
    private final Supplier<File> f1080d;
    private final String f1081e;
    private final CacheErrorLogger f1082f;

    /* renamed from: com.facebook.c.b.f.a */
    static class DynamicDefaultDiskStorage {
        @Nullable
        public final DiskStorage f1075a;
        @Nullable
        public final File f1076b;

        DynamicDefaultDiskStorage(@Nullable File file, @Nullable DiskStorage diskStorage) {
            this.f1075a = diskStorage;
            this.f1076b = file;
        }
    }

    static {
        f1077b = DynamicDefaultDiskStorage.class;
    }

    public DynamicDefaultDiskStorage(int i, Supplier<File> supplier, String str, CacheErrorLogger cacheErrorLogger) {
        this.f1079c = i;
        this.f1082f = cacheErrorLogger;
        this.f1080d = supplier;
        this.f1081e = str;
        this.f1078a = new DynamicDefaultDiskStorage(null, null);
    }

    public final boolean m991a() {
        try {
            return m988e().m937a();
        } catch (IOException e) {
            return false;
        }
    }

    public final String m993b() {
        try {
            return m988e().m939b();
        } catch (IOException e) {
            return LetterIndexBar.SEARCH_ICON_LETTER;
        }
    }

    public final BinaryResource m992b(String str, Object obj) {
        return m988e().m938b(str, obj);
    }

    public final boolean m995c(String str, Object obj) {
        return m988e().m941c(str, obj);
    }

    public final void m994c() {
        try {
            m988e().m940c();
        } catch (Throwable e) {
            FLog.m1045a(f1077b, "purgeUnexpectedResources", e);
        }
    }

    public final DiskStorage m990a(String str, Object obj) {
        return m988e().m936a(str, obj);
    }

    public final Collection<DiskStorage> m996d() {
        return m988e().m942d();
    }

    public final long m989a(DiskStorage diskStorage) {
        return m988e().m935a(diskStorage);
    }

    private synchronized DiskStorage m988e() {
        Object obj;
        DynamicDefaultDiskStorage dynamicDefaultDiskStorage = this.f1078a;
        if (dynamicDefaultDiskStorage.f1075a == null || dynamicDefaultDiskStorage.f1076b == null || !dynamicDefaultDiskStorage.f1076b.exists()) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj != null) {
            if (!(this.f1078a.f1075a == null || this.f1078a.f1076b == null)) {
                FileTree.m1017a(this.f1078a.f1076b);
            }
            File file = new File((File) this.f1080d.m963a(), this.f1081e);
            try {
                FileUtils.m1018a(file);
                FLog.m1053b(f1077b, "Created cache directory %s", file.getAbsolutePath());
                this.f1078a = new DynamicDefaultDiskStorage(file, new DefaultDiskStorage(file, this.f1079c, this.f1082f));
            } catch (FileUtils.FileUtils e) {
                int i = CacheErrorLogger.CacheErrorLogger.f977k;
                throw e;
            }
        }
        return (DiskStorage) Preconditions.m1030a(this.f1078a.f1075a);
    }
}
