package com.facebook.p007c.p010b;

import com.facebook.p006b.BinaryResource;
import com.facebook.p007c.p008a.WriterCallback;
import java.util.Collection;

/* renamed from: com.facebook.c.b.d */
public interface DiskStorage {

    /* renamed from: com.facebook.c.b.d.a */
    public interface DiskStorage {
        String m919a();

        long m920b();

        long m921c();
    }

    /* renamed from: com.facebook.c.b.d.b */
    public interface DiskStorage {
        BinaryResource m926a();

        void m927a(WriterCallback writerCallback);

        boolean m928b();
    }

    long m935a(DiskStorage diskStorage);

    DiskStorage m936a(String str, Object obj);

    boolean m937a();

    BinaryResource m938b(String str, Object obj);

    String m939b();

    void m940c();

    boolean m941c(String str, Object obj);

    Collection<DiskStorage> m942d();
}
