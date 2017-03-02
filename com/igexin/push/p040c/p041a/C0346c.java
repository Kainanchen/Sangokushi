package com.igexin.push.p040c.p041a;

import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.igexin.download.Downloads;
import com.igexin.p022a.p023a.p024a.C0227a;
import com.igexin.p022a.p023a.p025d.p026a.C0229f;
import com.igexin.p022a.p023a.p027b.C0234f;
import com.igexin.p022a.p023a.p027b.C0242c;
import com.igexin.p022a.p023a.p027b.C0244d;
import com.igexin.p022a.p023a.p027b.C0245e;
import com.igexin.p022a.p023a.p027b.C0246g;
import com.igexin.p022a.p031b.C0259a;
import com.igexin.push.p040c.p043c.C0353b;
import com.igexin.push.p040c.p043c.C0357g;
import com.igexin.push.p040c.p043c.C0358h;
import java.nio.ByteBuffer;

/* renamed from: com.igexin.push.c.a.c */
public class C0346c extends C0242c {
    private byte[] f923e;
    private boolean f924f;
    private boolean f925g;

    C0346c(String str) {
        super(str, true);
        this.f923e = null;
        this.f924f = false;
        this.f925g = false;
    }

    public static C0242c m1160a() {
        C0242c c0346c = new C0346c("socketProtocol");
        C0344a c0344a = new C0344a("command", c0346c);
        return c0346c;
    }

    static C0357g m1161a(int i) {
        C0357g c0357g = new C0357g();
        c0357g.f961b = 1944742139;
        c0357g.f962c = 3;
        c0357g.f963d = C0357g.f960a;
        c0357g.f968i = (byte) 0;
        c0357g.f967h = (byte) 0;
        c0357g.f965f = i;
        C0244d.m803e();
        return c0357g;
    }

    static C0357g m1162a(int i, byte b) {
        C0357g c0357g = new C0357g();
        c0357g.f961b = 1944742139;
        c0357g.m1199a(b);
        c0357g.f962c = 3;
        if (c0357g.f967h == 48) {
            c0357g.f962c += C0244d.m802c().m812a().length + 1;
        }
        c0357g.f963d = C0357g.f960a;
        c0357g.f965f = i;
        C0244d.m803e();
        return c0357g;
    }

    public Object m1163a(C0234f c0234f, C0245e c0245e, Object obj) {
        int a;
        if (obj instanceof C0353b) {
            C0353b c0353b = (C0353b) obj;
            C0357g a2 = C0346c.m1162a(c0353b.f938b > null ? 1 : 0, c0353b.f939c);
            if (c0353b.f938b > null && c0353b.f937a > 0) {
                if ((a2.f966g & Downloads.STATUS_RUNNING) == AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS) {
                    c0353b.m1183a(C0246g.m827a(c0353b.f940d));
                }
                if ((a2.f967h & 48) == 48) {
                    c0353b.m1183a(C0227a.m723a(c0353b.f940d, C0244d.m802c().m813b()));
                }
            }
            Object obj2 = new byte[((c0353b.f938b > null ? c0353b.f937a + 3 : 0) + (a2.f962c + 5))];
            a = C0246g.m819a(1944742139, (byte[]) obj2, 0);
            a += C0246g.m832c(a2.f962c, obj2, a);
            a += C0246g.m832c(a2.f963d, obj2, a);
            a += C0246g.m832c(a2.m1201c(), obj2, a);
            a += C0246g.m832c(a2.f965f, obj2, a);
            if ((a2.f967h & 48) == 48) {
                byte[] a3 = C0244d.m802c().m812a();
                a += C0246g.m832c(a3.length, obj2, a);
                a += C0246g.m822a(a3, 0, obj2, a, a3.length);
            }
            if (c0353b.f938b > null) {
                a += C0246g.m829b(c0353b.f937a, obj2, a);
                a += C0246g.m832c(c0353b.f938b, obj2, a);
                if (c0353b.f937a > 0) {
                    a += C0246g.m822a(c0353b.f940d, 0, obj2, a, c0353b.f937a);
                }
            }
            return obj2;
        }
        C0353b[] c0353bArr = (C0353b[]) obj;
        C0357g a4 = C0346c.m1161a(c0353bArr.length);
        int i = 0;
        for (C0353b c0353b2 : c0353bArr) {
            i += c0353b2.f937a + 3;
        }
        Object obj3 = new byte[((i + 5) + a4.f962c)];
        a = C0246g.m819a(1944742139, (byte[]) obj3, 0);
        a += C0246g.m832c(a4.f962c, obj3, a);
        a += C0246g.m832c(a4.f963d, obj3, a);
        a += C0246g.m832c(a4.m1201c(), obj3, a);
        i = a + C0246g.m832c(a4.f965f, obj3, a);
        for (a = 0; a < c0353bArr.length; a++) {
            i += C0246g.m829b(c0353bArr[a].f937a, obj3, i);
            i += C0246g.m832c(c0353bArr[a].f938b, obj3, i);
            i += C0246g.m822a(c0353bArr[a].f940d, 0, obj3, i, c0353bArr[a].f937a);
        }
        return obj3;
    }

    public C0229f m1164b(C0234f c0234f, C0245e c0245e, Object obj) {
        if (c0245e.m815a() == null) {
            c0245e.m817a(new C0345b());
        }
        C0345b c0345b = (C0345b) c0245e.m815a();
        ByteBuffer wrap = obj instanceof byte[] ? ByteBuffer.wrap((byte[]) obj) : (ByteBuffer) obj;
        byte b;
        if (c0345b.f917a == 0) {
            if (c0345b.f920d == 0) {
                c0345b.f922f = new byte[8];
            }
            while (wrap.remaining() > 0) {
                b = wrap.get();
                byte[] bArr = c0345b.f922f;
                int i = c0345b.f920d;
                c0345b.f920d = i + 1;
                bArr[i] = b;
                if (c0345b.f920d == 4 && C0246g.m833c(c0345b.f922f, 0) != 1944742139) {
                    c0345b.f920d = 0;
                }
                if (c0345b.f920d >= 8) {
                    C0357g c0357g = new C0357g();
                    c0357g.f962c = c0345b.f922f[4] & MotionEventCompat.ACTION_MASK;
                    c0357g.f963d = c0345b.f922f[5] & MotionEventCompat.ACTION_MASK;
                    c0357g.m1199a(c0345b.f922f[6]);
                    if (c0357g.f967h == 48) {
                        this.f925g = true;
                        byte b2 = wrap.get();
                        this.f923e = new byte[b2];
                        for (b = (byte) 0; b < b2; b++) {
                            this.f923e[b] = wrap.get();
                        }
                    } else {
                        this.f925g = false;
                    }
                    if (c0357g.f966g == -128) {
                        this.f924f = true;
                    } else {
                        this.f924f = false;
                    }
                    c0357g.f965f = c0345b.f922f[7] & MotionEventCompat.ACTION_MASK;
                    c0345b.m1159a(c0357g.f965f);
                    c0345b.f920d = 0;
                    c0345b.f922f = null;
                    if (c0357g.f965f > 0) {
                        c0345b.f917a = 1;
                        return m1164b(c0234f, c0245e, wrap);
                    }
                    C0244d.m802c().m797a((Object) new C0358h());
                    C0244d.m802c().m814d();
                    if (wrap.remaining() > 0) {
                        return m1164b(c0234f, c0245e, wrap);
                    }
                }
            }
            return null;
        }
        while (c0345b.f917a == 1 && wrap.remaining() > 0) {
            b = wrap.get();
            if (c0345b.f920d == 0) {
                c0345b.f922f = new byte[2];
            }
            bArr = c0345b.f922f;
            i = c0345b.f920d;
            c0345b.f920d = i + 1;
            bArr[i] = b;
            if (c0345b.f920d >= 2) {
                if (c0345b.f920d == 2) {
                    c0345b.f921e = C0246g.m830b(c0345b.f922f, 0);
                    c0345b.f922f = null;
                    c0345b.f922f = new byte[(c0345b.f921e + 3)];
                    C0246g.m829b(c0345b.f921e, c0345b.f922f, 0);
                } else if (c0345b.f920d >= c0345b.f921e + 3) {
                    C0353b c0353b = new C0353b();
                    c0353b.f937a = c0345b.f921e;
                    c0353b.f938b = c0345b.f922f[2];
                    if (c0353b.f937a > 0) {
                        byte[] a;
                        bArr = new byte[c0353b.f937a];
                        C0246g.m822a(c0345b.f922f, 3, bArr, 0, c0353b.f937a);
                        if (this.f925g) {
                            a = C0227a.m723a(bArr, this.f923e == null ? C0244d.m802c().m813b() : C0259a.m879a(this.f923e));
                        } else {
                            a = bArr;
                        }
                        if (this.f924f) {
                            a = C0246g.m831b(a);
                        }
                        c0353b.m1183a(a);
                    }
                    c0345b.f921e = 0;
                    c0345b.f920d = 0;
                    c0345b.f922f = null;
                    if (this.b != null) {
                        C0244d.m802c().m797a(this.b.m787c(c0234f, c0245e, c0353b));
                    }
                    c0345b.f918b++;
                    if (c0345b.f918b == c0345b.f919c) {
                        c0345b.f917a = 0;
                    }
                }
            }
        }
        if (c0345b.f918b > 0) {
            C0244d.m802c().m814d();
        }
        if (wrap.remaining() > 0) {
            return m1164b(c0234f, c0245e, wrap);
        }
        return null;
    }

    public /* synthetic */ Object m1165c(C0234f c0234f, C0245e c0245e, Object obj) {
        return m1164b(c0234f, c0245e, obj);
    }
}
