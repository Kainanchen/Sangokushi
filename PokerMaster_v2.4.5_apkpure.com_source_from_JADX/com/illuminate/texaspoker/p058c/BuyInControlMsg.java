package com.illuminate.texaspoker.p058c;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import com.illuminate.texaspoker.dao.BuyInControlMsgDao;
import com.illuminate.texaspoker.dao.DaoSession;

/* renamed from: com.illuminate.texaspoker.c.c */
public class BuyInControlMsg {
    public Long f5668a;
    public Long f5669b;
    public Long f5670c;
    public Long f5671d;
    public Long f5672e;
    public Boolean f5673f;
    public Integer f5674g;
    public Long f5675h;
    public Long f5676i;
    public String f5677j;
    public Long f5678k;
    public long f5679l;
    public String f5680m;
    public transient DaoSession f5681n;
    public transient BuyInControlMsgDao f5682o;
    private FriendUser f5683p;
    private transient Long f5684q;
    private GameRoom f5685r;
    private transient Long f5686s;

    static {
        fixHelper.fixfunc(new int[]{2037, 2038, 2039, 2040, 2041, 2042, 2043});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    public native BuyInControlMsg(Long l, Long l2, Long l3, Long l4, Long l5, Boolean bool, Integer num, Long l6, Long l7, String str, Long l8, long j, String str2);

    public final native FriendUser m3716a();

    public final native void m3717a(FriendUser friendUser);

    public final native void m3718a(GameRoom gameRoom);

    public final native void m3719a(String str);

    public final native GameRoom m3720b();
}
