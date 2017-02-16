package com.amap.p003a;

import android.content.Context;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* compiled from: StatisticsEntity */
/* renamed from: com.amap.a.aq */
public final class aq {
    private Context f205a;
    private String f206b;
    private String f207c;
    private String f208d;
    private String f209e;

    public aq(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3) || str3.length() > AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) {
            throw new ca("\u65e0\u6548\u7684\u53c2\u6570 - IllegalArgumentException");
        }
        this.f205a = context.getApplicationContext();
        this.f207c = str;
        this.f208d = str2;
        this.f206b = str3;
    }

    public final void m187a(String str) {
        if (TextUtils.isEmpty(str) || str.length() > AccessibilityNodeInfoCompat.ACTION_CUT) {
            throw new ca("\u65e0\u6548\u7684\u53c2\u6570 - IllegalArgumentException");
        }
        this.f209e = str;
    }

    public final byte[] m188a() {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        Throwable th2;
        byte[] bArr = new byte[0];
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr2;
                ck.m621a(byteArrayOutputStream, this.f207c);
                ck.m621a(byteArrayOutputStream, this.f208d);
                ck.m621a(byteArrayOutputStream, this.f206b);
                ck.m621a(byteArrayOutputStream, String.valueOf(ce.m563m(this.f205a)));
                new SimpleDateFormat("SSS").format(new Date());
                int i = Calendar.getInstance().get(14);
                byteArrayOutputStream.write(new byte[]{(byte) ((i >> 24) & MotionEventCompat.ACTION_MASK), (byte) ((i >> 16) & MotionEventCompat.ACTION_MASK), (byte) ((i >> 8) & MotionEventCompat.ACTION_MASK), (byte) (i & MotionEventCompat.ACTION_MASK)});
                Object obj = this.f209e;
                if (TextUtils.isEmpty(obj)) {
                    bArr2 = new byte[]{(byte) 0, (byte) 0};
                } else {
                    byte length = (byte) (obj.length() % AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY);
                    bArr2 = new byte[]{(byte) (obj.length() / AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY), length};
                }
                byteArrayOutputStream.write(bArr2);
                byteArrayOutputStream.write(ck.m624a(this.f209e));
                bArr = byteArrayOutputStream.toByteArray();
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th = th3;
                        th.printStackTrace();
                        return bArr;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                try {
                    cm.m637a(th, "StatisticsEntity", "toDatas");
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th5) {
                            th = th5;
                            th.printStackTrace();
                            return bArr;
                        }
                    }
                    return bArr;
                } catch (Throwable th6) {
                    th2 = th6;
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th7) {
                            th7.printStackTrace();
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th8) {
            th2 = th8;
            byteArrayOutputStream = null;
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            throw th2;
        }
        return bArr;
    }
}
