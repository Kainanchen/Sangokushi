package com.igexin.push.p040c.p043c;

import android.support.v4.view.MotionEventCompat;
import com.igexin.p022a.p023a.p027b.C0246g;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.tencent.connect.common.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.igexin.push.c.c.i */
public class C0359i extends C0351e {
    public long f969a;
    public byte f970b;
    public int f971c;
    public String f972d;
    public List f973e;

    public C0359i() {
        this.i = 4;
        this.j = (byte) 52;
    }

    private String m1204a(byte[] bArr, int i, int i2) {
        try {
            return new String(bArr, i, i2, AsyncHttpResponseHandler.DEFAULT_CHARSET);
        } catch (Exception e) {
            return Constants.STR_EMPTY;
        }
    }

    public void m1205a(byte[] bArr) {
        int i;
        this.f969a = C0246g.m834d(bArr, 0);
        this.f970b = bArr[8];
        this.f971c = C0246g.m833c(bArr, 9) & -1;
        if (bArr.length > 13) {
            i = 14;
            int i2 = bArr[13] & MotionEventCompat.ACTION_MASK;
            if (i2 > 0) {
                this.f973e = new ArrayList();
                i2 += 14;
                while (i < i2) {
                    C0360j c0360j = new C0360j();
                    this.f973e.add(c0360j);
                    int i3 = i + 1;
                    i = C0246g.m821a(bArr, i) & MotionEventCompat.ACTION_MASK;
                    int i4 = i3 + 1;
                    i3 = C0246g.m821a(bArr, i3) & MotionEventCompat.ACTION_MASK;
                    c0360j.f974a = (byte) i;
                    if ((i == 1 || i == 4) && i3 > 0) {
                        try {
                            c0360j.f975b = new String(bArr, i4, i3, AsyncHttpResponseHandler.DEFAULT_CHARSET);
                        } catch (Exception e) {
                        }
                    }
                    i = i4 + i3;
                }
            }
        } else {
            i = 13;
        }
        if (bArr.length > i) {
            this.f972d = m1204a(bArr, i + 1, bArr[i] & MotionEventCompat.ACTION_MASK);
        }
    }

    public byte[] m1206d() {
        byte[] bArr;
        int length;
        int i;
        byte[] bArr2 = null;
        if (this.f973e == null || this.f973e.size() <= 0) {
            bArr = null;
        } else {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (C0360j d : this.f973e) {
                byte[] toByteArray;
                try {
                    byteArrayOutputStream.write(d.m1208d());
                    toByteArray = byteArrayOutputStream.toByteArray();
                } catch (IOException e) {
                    toByteArray = bArr2;
                }
                bArr2 = toByteArray;
            }
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                    bArr = bArr2;
                } catch (IOException e2) {
                    bArr = bArr2;
                }
            } else {
                bArr = bArr2;
            }
        }
        if (bArr != null) {
            length = bArr.length;
            i = length + 1;
        } else {
            i = 1;
            length = 0;
        }
        byte[] bArr3 = new byte[(((i + 12) + this.f972d.getBytes().length) + 1)];
        i = C0246g.m820a(this.f969a, bArr3, 0);
        i += C0246g.m819a(((this.f970b & MotionEventCompat.ACTION_MASK) << 24) | this.f971c, bArr3, i);
        i += C0246g.m832c(length, bArr3, i);
        length = length > 0 ? C0246g.m822a(bArr, 0, bArr3, i, length) + i : i;
        Object bytes = this.f972d.getBytes();
        int i2 = length + 1;
        C0246g.m832c(bytes.length, bArr3, length);
        System.arraycopy(bytes, 0, bArr3, i2, bytes.length);
        length = bytes.length + i2;
        return bArr3;
    }
}
