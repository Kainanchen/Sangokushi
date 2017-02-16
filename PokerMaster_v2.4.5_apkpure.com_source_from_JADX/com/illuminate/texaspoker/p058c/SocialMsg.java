package com.illuminate.texaspoker.p058c;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import android.support.v4.view.PointerIconCompat;
import com.ali.fixHelper;
import com.illuminate.texaspoker.dao.DaoSession;
import com.illuminate.texaspoker.dao.SocialMsgDao;

/* renamed from: com.illuminate.texaspoker.c.u */
public class SocialMsg {
    public Long f5992a;
    public Integer f5993b;
    public Integer f5994c;
    public Long f5995d;
    public Long f5996e;
    public Long f5997f;
    public Long f5998g;
    public String f5999h;
    public transient DaoSession f6000i;
    public transient SocialMsgDao f6001j;
    public FriendUser f6002k;
    public transient Long f6003l;

    static {
        fixHelper.fixfunc(new int[]{PointerIconCompat.TYPE_TEXT, PointerIconCompat.TYPE_VERTICAL_TEXT, PointerIconCompat.TYPE_ALIAS});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    public native SocialMsg(Long l, Integer num, Integer num2, Long l2, Long l3, Long l4, Long l5, String str);

    public final native FriendUser m3748a();
}
