package com.igexin.push.p040c.p043c;

import android.support.v4.view.MotionEventCompat;
import android.text.TextUtils;
import com.igexin.p022a.p023a.p027b.C0246g;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.tencent.connect.common.Constants;

/* renamed from: com.igexin.push.c.c.o */
public class C0365o extends C0351e {
    public long f995a;
    public String f996b;
    public String f997c;
    public String f998d;

    public C0365o() {
        this.f996b = Constants.STR_EMPTY;
        this.f997c = Constants.STR_EMPTY;
        this.f998d = Constants.STR_EMPTY;
        this.i = 9;
    }

    private String m1218a(byte[] bArr, int i, int i2) {
        try {
            return new String(bArr, i, i2, AsyncHttpResponseHandler.DEFAULT_CHARSET);
        } catch (Exception e) {
            return Constants.STR_EMPTY;
        }
    }

    public void m1219a(byte[] bArr) {
        int i;
        int i2;
        this.f995a = C0246g.m834d(bArr, 0);
        if (bArr.length > 8) {
            i = 9;
            i2 = bArr[8] & MotionEventCompat.ACTION_MASK;
            if (i2 > 0) {
                this.f996b = m1218a(bArr, 9, i2);
                i = i2 + 9;
            }
        } else {
            i = 8;
        }
        if (bArr.length > i) {
            i2 = i + 1;
            i = bArr[i] & MotionEventCompat.ACTION_MASK;
            if (i > 0) {
                this.f997c = m1218a(bArr, i2, i);
                i += i2;
            } else {
                i = i2;
            }
        }
        if (bArr.length > i) {
            i2 = i + 1;
            i = bArr[i] & MotionEventCompat.ACTION_MASK;
            if (i > 0) {
                this.f998d = m1218a(bArr, i2, i);
                i += i2;
            }
        }
    }

    public byte[] m1220d() {
        if (TextUtils.isEmpty(this.f997c) || TextUtils.isEmpty(this.f998d)) {
            Object bytes = this.f996b.getBytes();
            byte[] bArr = new byte[((bytes.length + 8) + 1)];
            C0246g.m820a(this.f995a, bArr, 0);
            C0246g.m832c(bytes.length, bArr, 8);
            System.arraycopy(bytes, 0, bArr, 9, bytes.length);
            return bArr;
        }
        bytes = this.f996b.getBytes();
        Object bytes2 = this.f997c.getBytes();
        Object bytes3 = this.f998d.getBytes();
        bArr = new byte[((((bytes.length + 8) + bytes2.length) + bytes3.length) + 3)];
        C0246g.m820a(this.f995a, bArr, 0);
        C0246g.m832c(bytes.length, bArr, 8);
        System.arraycopy(bytes, 0, bArr, 9, bytes.length);
        int length = bytes.length + 9;
        int i = length + 1;
        C0246g.m832c(bytes2.length, bArr, length);
        System.arraycopy(bytes2, 0, bArr, i, bytes2.length);
        length = bytes2.length + i;
        int i2 = length + 1;
        C0246g.m832c(bytes3.length, bArr, length);
        System.arraycopy(bytes3, 0, bArr, i2, bytes3.length);
        return bArr;
    }
}
