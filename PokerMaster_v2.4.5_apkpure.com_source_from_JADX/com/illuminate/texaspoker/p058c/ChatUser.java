package com.illuminate.texaspoker.p058c;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import com.illuminate.texaspoker.dao.ChatUserDao;
import com.illuminate.texaspoker.dao.DaoSession;

/* renamed from: com.illuminate.texaspoker.c.f */
public class ChatUser {
    public Long f5766a;
    public Integer f5767b;
    public Long f5768c;
    public Long f5769d;
    public Long f5770e;
    public Long f5771f;
    public String f5772g;
    public transient DaoSession f5773h;
    public transient ChatUserDao f5774i;
    private FriendUser f5775j;
    private transient Long f5776k;
    private ChatRoom f5777l;
    private transient Long f5778m;

    static {
        fixHelper.fixfunc(new int[]{1903, 1904, 1905, 1906, 1907, 1908});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    public native ChatUser(Long l, Integer num, Long l2, Long l3, Long l4, Long l5, String str);

    public final native FriendUser m3728a();

    public final native void m3729a(ChatRoom chatRoom);

    public final native void m3730a(FriendUser friendUser);

    public final native ChatRoom m3731b();
}
