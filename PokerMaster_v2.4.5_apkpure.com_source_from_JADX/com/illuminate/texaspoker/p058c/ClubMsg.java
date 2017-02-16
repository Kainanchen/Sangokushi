package com.illuminate.texaspoker.p058c;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import com.illuminate.texaspoker.dao.ClubMsgDao;
import com.illuminate.texaspoker.dao.DaoSession;

/* renamed from: com.illuminate.texaspoker.c.i */
public class ClubMsg {
    public Long f5793a;
    public Integer f5794b;
    public Integer f5795c;
    public Long f5796d;
    public Long f5797e;
    public Long f5798f;
    public Long f5799g;
    public Long f5800h;
    public Long f5801i;
    public String f5802j;
    public String f5803k;
    public FriendUser f5804l;
    public transient DaoSession f5805m;
    public transient ClubMsgDao f5806n;
    public transient Long f5807o;

    static {
        fixHelper.fixfunc(new int[]{645, 646, 647});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    public native ClubMsg(Long l, Integer num, Integer num2, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, String str, String str2);

    public final native FriendUser m3732a();
}
