package com.illuminate.texaspoker.dao;

import a.does.not.Exists2;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import com.illuminate.texaspoker.p058c.ChatUser;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.util.List;
import org.a.a.a;
import org.a.a.a.c;
import org.a.a.f;

public class ChatUserDao extends a<ChatUser, Long> {
    public static final String TABLENAME = "CHAT_USER";
    public DaoSession f6199a;
    public String f6200b;

    public static class Properties {
        public static final f f6192a;
        public static final f f6193b;
        public static final f f6194c;
        public static final f f6195d;
        public static final f f6196e;
        public static final f f6197f;
        public static final f f6198g;

        static {
            f6192a = new f(0, Long.class, "id", true, "_id");
            f6193b = new f(1, Integer.class, "eClubUserLevel", false, "E_CLUB_USER_LEVEL");
            f6194c = new f(2, Long.class, "lChatRoomId", false, "L_CHAT_ROOM_ID");
            f6195d = new f(3, Long.class, "club", false, "CLUB");
            f6196e = new f(4, Long.class, "friendUserId", false, "FRIEND_USER_ID");
            f6197f = new f(5, Long.class, "uuid", false, "UUID");
            f6198g = new f(6, String.class, "strUserComment", false, "STR_USER_COMMENT");
        }
    }

    static {
        fixHelper.fixfunc(new int[]{408, 409, 410, 411, 412, 413, 414, 415, 416, 417, 418});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    public native ChatUserDao(org.a.a.c.a aVar, DaoSession daoSession);

    private native ChatUser m3789d(Cursor cursor);

    private native List<ChatUser> m3790e(Cursor cursor);

    public final native /* synthetic */ Object m3791a(Cursor cursor, int i);

    public final native /* bridge */ /* synthetic */ Object m3792a(Object obj);

    protected final native /* synthetic */ Object m3793a(Object obj, long j);

    public final native List<ChatUser> m3794a(Cursor cursor);

    protected final native /* synthetic */ void m3795a(SQLiteStatement sQLiteStatement, Object obj);

    protected final native /* synthetic */ void m3796a(c cVar, Object obj);

    public final native /* synthetic */ Object m3797b(Cursor cursor, int i);

    protected final native /* bridge */ /* synthetic */ void m3798b(Object obj);

    public static void m3788a(org.a.a.a.a aVar) {
        aVar.a("CREATE TABLE " + LetterIndexBar.SEARCH_ICON_LETTER + "\"CHAT_USER\" (\"_id\" INTEGER PRIMARY KEY ,\"E_CLUB_USER_LEVEL\" INTEGER,\"L_CHAT_ROOM_ID\" INTEGER,\"CLUB\" INTEGER,\"FRIEND_USER_ID\" INTEGER,\"UUID\" INTEGER,\"STR_USER_COMMENT\" TEXT);");
    }
}
