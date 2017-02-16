package com.illuminate.texaspoker.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.illuminate.texaspoker.p058c.SocialMsg;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import org.a.a.a;
import org.a.a.a.c;
import org.a.a.f;

public class SocialMsgDao extends a<SocialMsg, Long> {
    public static final String TABLENAME = "SOCIAL_MSG";
    private DaoSession f6412a;

    public static class Properties {
        public static final f f6404a;
        public static final f f6405b;
        public static final f f6406c;
        public static final f f6407d;
        public static final f f6408e;
        public static final f f6409f;
        public static final f f6410g;
        public static final f f6411h;

        static {
            f6404a = new f(0, Long.class, "id", true, "_id");
            f6405b = new f(1, Integer.class, "eFriendMessageType", false, "E_FRIEND_MESSAGE_TYPE");
            f6406c = new f(2, Integer.class, "iStatus", false, "I_STATUS");
            f6407d = new f(3, Long.class, "friendUserId", false, "FRIEND_USER_ID");
            f6408e = new f(4, Long.class, "friendUuid", false, "FRIEND_UUID");
            f6409f = new f(5, Long.class, "updateTime", false, "UPDATE_TIME");
            f6410g = new f(6, Long.class, "lMsgID", false, "L_MSG_ID");
            f6411h = new f(7, String.class, "strMsg", false, "STR_MSG");
        }
    }

    protected final /* synthetic */ Object m3904a(Object obj, long j) {
        ((SocialMsg) obj).f5992a = Long.valueOf(j);
        return Long.valueOf(j);
    }

    protected final /* synthetic */ void m3905a(SQLiteStatement sQLiteStatement, Object obj) {
        SocialMsg socialMsg = (SocialMsg) obj;
        sQLiteStatement.clearBindings();
        Long l = socialMsg.f5992a;
        if (l != null) {
            sQLiteStatement.bindLong(1, l.longValue());
        }
        Integer num = socialMsg.f5993b;
        if (num != null) {
            sQLiteStatement.bindLong(2, (long) num.intValue());
        }
        num = socialMsg.f5994c;
        if (num != null) {
            sQLiteStatement.bindLong(3, (long) num.intValue());
        }
        l = socialMsg.f5995d;
        if (l != null) {
            sQLiteStatement.bindLong(4, l.longValue());
        }
        l = socialMsg.f5996e;
        if (l != null) {
            sQLiteStatement.bindLong(5, l.longValue());
        }
        l = socialMsg.f5997f;
        if (l != null) {
            sQLiteStatement.bindLong(6, l.longValue());
        }
        l = socialMsg.f5998g;
        if (l != null) {
            sQLiteStatement.bindLong(7, l.longValue());
        }
        String str = socialMsg.f5999h;
        if (str != null) {
            sQLiteStatement.bindString(8, str);
        }
    }

    protected final /* synthetic */ void m3906a(c cVar, Object obj) {
        SocialMsg socialMsg = (SocialMsg) obj;
        cVar.c();
        Long l = socialMsg.f5992a;
        if (l != null) {
            cVar.a(1, l.longValue());
        }
        Integer num = socialMsg.f5993b;
        if (num != null) {
            cVar.a(2, (long) num.intValue());
        }
        num = socialMsg.f5994c;
        if (num != null) {
            cVar.a(3, (long) num.intValue());
        }
        l = socialMsg.f5995d;
        if (l != null) {
            cVar.a(4, l.longValue());
        }
        l = socialMsg.f5996e;
        if (l != null) {
            cVar.a(5, l.longValue());
        }
        l = socialMsg.f5997f;
        if (l != null) {
            cVar.a(6, l.longValue());
        }
        l = socialMsg.f5998g;
        if (l != null) {
            cVar.a(7, l.longValue());
        }
        String str = socialMsg.f5999h;
        if (str != null) {
            cVar.a(8, str);
        }
    }

    protected final /* bridge */ /* synthetic */ void m3908b(Object obj) {
        SocialMsgDao socialMsgDao;
        SocialMsg socialMsg = (SocialMsg) obj;
        super.b(socialMsg);
        DaoSession daoSession = this.f6412a;
        socialMsg.f6000i = daoSession;
        if (daoSession != null) {
            socialMsgDao = daoSession.f6442Q;
        } else {
            socialMsgDao = null;
        }
        socialMsg.f6001j = socialMsgDao;
    }

    public SocialMsgDao(org.a.a.c.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
        this.f6412a = daoSession;
    }

    public static void m3901a(org.a.a.a.a aVar) {
        aVar.a("CREATE TABLE " + LetterIndexBar.SEARCH_ICON_LETTER + "\"SOCIAL_MSG\" (\"_id\" INTEGER PRIMARY KEY UNIQUE ,\"E_FRIEND_MESSAGE_TYPE\" INTEGER,\"I_STATUS\" INTEGER,\"FRIEND_USER_ID\" INTEGER,\"FRIEND_UUID\" INTEGER,\"UPDATE_TIME\" INTEGER,\"L_MSG_ID\" INTEGER,\"STR_MSG\" TEXT);");
    }

    public final /* synthetic */ Object m3902a(Cursor cursor, int i) {
        return cursor.isNull(i + 0) ? null : Long.valueOf(cursor.getLong(i + 0));
    }

    public final /* synthetic */ Object m3907b(Cursor cursor, int i) {
        String str = null;
        Long valueOf = cursor.isNull(i + 0) ? null : Long.valueOf(cursor.getLong(i + 0));
        Integer valueOf2 = cursor.isNull(i + 1) ? null : Integer.valueOf(cursor.getInt(i + 1));
        Integer valueOf3 = cursor.isNull(i + 2) ? null : Integer.valueOf(cursor.getInt(i + 2));
        Long valueOf4 = cursor.isNull(i + 3) ? null : Long.valueOf(cursor.getLong(i + 3));
        Long valueOf5 = cursor.isNull(i + 4) ? null : Long.valueOf(cursor.getLong(i + 4));
        Long valueOf6 = cursor.isNull(i + 5) ? null : Long.valueOf(cursor.getLong(i + 5));
        Long valueOf7 = cursor.isNull(i + 6) ? null : Long.valueOf(cursor.getLong(i + 6));
        if (!cursor.isNull(i + 7)) {
            str = cursor.getString(i + 7);
        }
        return new SocialMsg(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, str);
    }
}
