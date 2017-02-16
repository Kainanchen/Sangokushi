package com.amap.p003a;

import a.does.not.Exists2;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.TextUtils;
import com.ali.fixHelper;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.io.ByteArrayOutputStream;
import java.security.Key;
import javax.crypto.KeyGenerator;

/* compiled from: ClientInfo */
/* renamed from: com.amap.a.cd */
public final class cd {

    /* renamed from: com.amap.a.cd.a */
    private static class ClientInfo {
        String f583a;
        String f584b;
        String f585c;
        String f586d;
        String f587e;
        String f588f;
        String f589g;
        String f590h;
        String f591i;
        String f592j;
        String f593k;
        String f594l;
        String f595m;
        String f596n;
        String f597o;
        String f598p;
        String f599q;
        String f600r;
        String f601s;
        String f602t;

        static {
            fixHelper.fixfunc(new int[]{3039, 3040});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        private native ClientInfo();

        native /* synthetic */ ClientInfo(byte b);
    }

    public static String m536a() {
        String str;
        Throwable th;
        Throwable th2;
        String str2 = null;
        try {
            str2 = String.valueOf(System.currentTimeMillis());
            try {
                int length = str2.length();
                str = str2.substring(0, length - 2) + "1" + str2.substring(length - 1);
            } catch (Throwable th3) {
                th = th3;
                str = str2;
                th2 = th;
                cm.m637a(th2, "CInfo", "getTS");
                return str;
            }
        } catch (Throwable th32) {
            th = th32;
            str = str2;
            th2 = th;
            cm.m637a(th2, "CInfo", "getTS");
            return str;
        }
        return str;
    }

    public static String m537a(Context context, String str, String str2) {
        String str3 = null;
        try {
            str3 = cg.m586b(cb.m522e(context) + ":" + str.substring(0, str.length() - 3) + ":" + str2);
        } catch (Throwable th) {
            cm.m637a(th, "CInfo", "Scode");
        }
        return str3;
    }

    private static void m538a(ByteArrayOutputStream byteArrayOutputStream, String str) {
        if (TextUtils.isEmpty(str)) {
            ck.m620a(byteArrayOutputStream, (byte) 0, new byte[0]);
        } else {
            ck.m620a(byteArrayOutputStream, str.getBytes().length > MotionEventCompat.ACTION_MASK ? (byte) -1 : (byte) str.getBytes().length, ck.m624a(str));
        }
    }

    private static byte[] m540a(ClientInfo clientInfo) {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        Throwable th2;
        byte[] bArr = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                cd.m538a(byteArrayOutputStream, clientInfo.f583a);
                cd.m538a(byteArrayOutputStream, clientInfo.f584b);
                cd.m538a(byteArrayOutputStream, clientInfo.f585c);
                cd.m538a(byteArrayOutputStream, clientInfo.f586d);
                cd.m538a(byteArrayOutputStream, clientInfo.f587e);
                cd.m538a(byteArrayOutputStream, clientInfo.f588f);
                cd.m538a(byteArrayOutputStream, clientInfo.f589g);
                cd.m538a(byteArrayOutputStream, clientInfo.f590h);
                cd.m538a(byteArrayOutputStream, clientInfo.f591i);
                cd.m538a(byteArrayOutputStream, clientInfo.f592j);
                cd.m538a(byteArrayOutputStream, clientInfo.f593k);
                cd.m538a(byteArrayOutputStream, clientInfo.f594l);
                cd.m538a(byteArrayOutputStream, clientInfo.f595m);
                cd.m538a(byteArrayOutputStream, clientInfo.f596n);
                cd.m538a(byteArrayOutputStream, clientInfo.f597o);
                cd.m538a(byteArrayOutputStream, clientInfo.f598p);
                cd.m538a(byteArrayOutputStream, clientInfo.f599q);
                cd.m538a(byteArrayOutputStream, clientInfo.f600r);
                cd.m538a(byteArrayOutputStream, clientInfo.f601s);
                cd.m538a(byteArrayOutputStream, clientInfo.f602t);
                byte[] b = ck.m628b(byteArrayOutputStream.toByteArray());
                Key b2 = ck.m627b();
                if (b.length > 117) {
                    byte[] bArr2 = new byte[117];
                    System.arraycopy(b, 0, bArr2, 0, 117);
                    Object a = cf.m578a(bArr2, b2);
                    Object obj = new byte[((b.length + AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS) - 117)];
                    System.arraycopy(a, 0, obj, 0, AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
                    System.arraycopy(b, 117, obj, AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS, b.length - 117);
                    bArr = obj;
                } else {
                    bArr = cf.m578a(b, b2);
                }
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th3.printStackTrace();
                }
            } catch (Throwable th4) {
                th3 = th4;
                try {
                    cm.m637a(th3, "CInfo", "InitXInfo");
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th32) {
                            th32.printStackTrace();
                        }
                    }
                    return bArr;
                } catch (Throwable th5) {
                    th2 = th5;
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th322) {
                            th322.printStackTrace();
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3222) {
            byteArrayOutputStream = bArr;
            th2 = th3222;
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            throw th2;
        }
        return bArr;
    }

    public static byte[] m541a(byte[] bArr) {
        KeyGenerator instance = KeyGenerator.getInstance("AES");
        if (instance == null) {
            return null;
        }
        instance.init(AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY);
        byte[] encoded = instance.generateKey().getEncoded();
        Key b = ck.m627b();
        if (b == null) {
            return null;
        }
        Object a = cf.m578a(encoded, b);
        Object a2 = cf.m579a(encoded, bArr);
        Object obj = new byte[(a.length + a2.length)];
        System.arraycopy(a, 0, obj, 0, a.length);
        System.arraycopy(a2, 0, obj, a.length, a2.length);
        return obj;
    }

    public static String m542b(byte[] bArr) {
        try {
            return cd.m544d(bArr);
        } catch (Throwable th) {
            cm.m637a(th, "CInfo", "AESData");
            return LetterIndexBar.SEARCH_ICON_LETTER;
        }
    }

    public static String m543c(byte[] bArr) {
        try {
            return cd.m544d(bArr);
        } catch (Throwable th) {
            th.printStackTrace();
            return LetterIndexBar.SEARCH_ICON_LETTER;
        }
    }

    private static String m544d(byte[] bArr) {
        byte[] b = ck.m628b(cd.m541a(bArr));
        return b != null ? cf.m577a(b) : LetterIndexBar.SEARCH_ICON_LETTER;
    }

    public static byte[] m539a(Context context) {
        try {
            ClientInfo clientInfo = new ClientInfo();
            clientInfo.f583a = ce.m567q(context);
            clientInfo.f584b = ce.m559i(context);
            String f = ce.m556f(context);
            if (f == null) {
                f = LetterIndexBar.SEARCH_ICON_LETTER;
            }
            clientInfo.f585c = f;
            clientInfo.f586d = cb.m520c(context);
            clientInfo.f587e = Build.MODEL;
            clientInfo.f588f = Build.MANUFACTURER;
            clientInfo.f589g = Build.DEVICE;
            clientInfo.f590h = cb.m518b(context);
            clientInfo.f591i = cb.m521d(context);
            clientInfo.f592j = String.valueOf(VERSION.SDK_INT);
            clientInfo.f593k = ce.m568r(context);
            clientInfo.f594l = ce.m566p(context);
            clientInfo.f595m = ce.m563m(context);
            clientInfo.f596n = ce.m562l(context);
            clientInfo.f597o = ce.m569s(context);
            clientInfo.f598p = ce.m561k(context);
            clientInfo.f599q = ce.m558h(context);
            clientInfo.f600r = ce.m557g(context);
            String[] j = ce.m560j(context);
            clientInfo.f601s = j[0];
            clientInfo.f602t = j[1];
            return cd.m540a(clientInfo);
        } catch (Throwable th) {
            cm.m637a(th, "CInfo", "getGZipXInfo");
            return null;
        }
    }
}
