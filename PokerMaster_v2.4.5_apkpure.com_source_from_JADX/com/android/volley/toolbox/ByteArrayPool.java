package com.android.volley.toolbox;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import java.util.Comparator;
import java.util.List;

public class ByteArrayPool {
    protected static final Comparator<byte[]> BUF_COMPARATOR = null;
    private List<byte[]> mBuffersByLastUse;
    private List<byte[]> mBuffersBySize;
    private int mCurrentSize;
    private final int mSizeLimit;

    /* renamed from: com.android.volley.toolbox.ByteArrayPool.1 */
    static class C02631 implements Comparator<byte[]> {
        C02631() {
        }

        public final int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    static {
        fixHelper.fixfunc(new int[]{888, 889, 890, 891});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    public native ByteArrayPool(int i);

    private native synchronized void trim();

    public native synchronized byte[] getBuf(int i);

    public native synchronized void returnBuf(byte[] bArr);

    static void __clinit__() {
        BUF_COMPARATOR = new C02631();
    }
}
