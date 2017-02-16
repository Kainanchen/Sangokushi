package com.illuminate.texaspoker.p058c;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import com.illuminate.texaspoker.dao.DaoSession;
import com.illuminate.texaspoker.dao.GameRoomDao;

/* renamed from: com.illuminate.texaspoker.c.n */
public class GameRoom {
    public String f5861A;
    public String f5862B;
    public String f5863C;
    public String f5864D;
    public Long f5865E;
    public Long f5866F;
    public Boolean f5867G;
    public Boolean f5868H;
    public Long f5869I;
    public String f5870J;
    public String f5871K;
    public String f5872L;
    public transient DaoSession f5873M;
    public transient GameRoomDao f5874N;
    private FriendUser f5875O;
    private transient Long f5876P;
    public Long f5877a;
    public Boolean f5878b;
    public Boolean f5879c;
    public Boolean f5880d;
    public Boolean f5881e;
    public Boolean f5882f;
    public Boolean f5883g;
    public Boolean f5884h;
    public Integer f5885i;
    public Integer f5886j;
    public Integer f5887k;
    public Integer f5888l;
    public Integer f5889m;
    public Integer f5890n;
    public Integer f5891o;
    public Integer f5892p;
    public Long f5893q;
    public Long f5894r;
    public Long f5895s;
    public Long f5896t;
    public Long f5897u;
    public Long f5898v;
    public Long f5899w;
    public Long f5900x;
    public Integer f5901y;
    public Integer f5902z;

    static {
        fixHelper.fixfunc(new int[]{53, 54, 55, 56});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    public native GameRoom(Long l, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Integer num9, Integer num10, String str, String str2, String str3, String str4, Long l10, Long l11, Boolean bool8, Boolean bool9, Long l12, String str5, String str6, String str7);

    public final native FriendUser m3736a();

    public final native void m3737a(FriendUser friendUser);
}
