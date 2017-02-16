package com.illuminate.texaspoker.p058c;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import com.illuminate.texaspoker.dao.ChatRoomDao;
import com.illuminate.texaspoker.dao.DaoSession;

/* renamed from: com.illuminate.texaspoker.c.e */
public class ChatRoom {
    public Boolean f5714A;
    public Boolean f5715B;
    public Boolean f5716C;
    public Boolean f5717D;
    public Boolean f5718E;
    public Boolean f5719F;
    public Boolean f5720G;
    public Boolean f5721H;
    public Integer f5722I;
    public Integer f5723J;
    public Integer f5724K;
    public Integer f5725L;
    public Integer f5726M;
    public Integer f5727N;
    public Integer f5728O;
    public Integer f5729P;
    public Integer f5730Q;
    public Integer f5731R;
    public Integer f5732S;
    public Integer f5733T;
    public Boolean f5734U;
    public Boolean f5735V;
    public transient DaoSession f5736W;
    public transient ChatRoomDao f5737X;
    private FriendUser f5738Y;
    private transient Long f5739Z;
    public Long f5740a;
    public Long f5741b;
    public Long f5742c;
    public Long f5743d;
    public Long f5744e;
    public Long f5745f;
    public Long f5746g;
    public Long f5747h;
    public Long f5748i;
    public Long f5749j;
    public Long f5750k;
    public Long f5751l;
    public Long f5752m;
    public Long f5753n;
    public Long f5754o;
    public String f5755p;
    public String f5756q;
    public String f5757r;
    public String f5758s;
    public String f5759t;
    public String f5760u;
    public String f5761v;
    public String f5762w;
    public String f5763x;
    public String f5764y;
    public String f5765z;

    static {
        fixHelper.fixfunc(new int[]{1834, 1835, 1836, 1837});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    public native ChatRoom(Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, Long l11, Long l12, Long l13, Long l14, Long l15, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Boolean bool9, Boolean bool10);

    public final native FriendUser m3726a();

    public final native void m3727a(FriendUser friendUser);
}
