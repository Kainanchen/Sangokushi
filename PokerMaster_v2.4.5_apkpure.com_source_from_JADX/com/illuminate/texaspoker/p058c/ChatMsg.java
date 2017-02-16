package com.illuminate.texaspoker.p058c;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import com.illuminate.texaspoker.dao.ChatMsgDao;
import com.illuminate.texaspoker.dao.DaoSession;

/* renamed from: com.illuminate.texaspoker.c.d */
public class ChatMsg {
    public transient Long f5687A;
    public Long f5688a;
    public Long f5689b;
    public String f5690c;
    public String f5691d;
    public String f5692e;
    public String f5693f;
    public String f5694g;
    public String f5695h;
    public String f5696i;
    public String f5697j;
    public Long f5698k;
    public Long f5699l;
    public Long f5700m;
    public Long f5701n;
    public Long f5702o;
    public Long f5703p;
    public Integer f5704q;
    public Integer f5705r;
    public Integer f5706s;
    public Integer f5707t;
    public String f5708u;
    public String f5709v;
    public String f5710w;
    public transient DaoSession f5711x;
    public transient ChatMsgDao f5712y;
    public FriendUser f5713z;

    static {
        fixHelper.fixfunc(new int[]{2100, 2101, 2102, 2103, 2104, 2105, 2106});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    public native ChatMsg(Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Integer num, Integer num2, Integer num3, Integer num4, String str9, String str10, String str11);

    public final native Long m3721a();

    public final native String m3722b();

    public final native Long m3723c();

    public final native Integer m3724d();

    public final native FriendUser m3725e();
}
