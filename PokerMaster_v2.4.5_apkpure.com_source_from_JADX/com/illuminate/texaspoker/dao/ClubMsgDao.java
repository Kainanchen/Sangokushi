package com.illuminate.texaspoker.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.illuminate.texaspoker.p058c.ClubMsg;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import org.a.a.a;
import org.a.a.a.c;
import org.a.a.f;

public class ClubMsgDao extends a<ClubMsg, Long> {
    public static final String TABLENAME = "CLUB_MSG";
    private DaoSession f6226a;

    public static class Properties {
        public static final f f6215a;
        public static final f f6216b;
        public static final f f6217c;
        public static final f f6218d;
        public static final f f6219e;
        public static final f f6220f;
        public static final f f6221g;
        public static final f f6222h;
        public static final f f6223i;
        public static final f f6224j;
        public static final f f6225k;

        static {
            f6215a = new f(0, Long.class, "id", true, "_id");
            f6216b = new f(1, Integer.class, "eClubMessageType", false, "E_CLUB_MESSAGE_TYPE");
            f6217c = new f(2, Integer.class, "iStatus", false, "I_STATUS");
            f6218d = new f(3, Long.class, "fromUuid", false, "FROM_UUID");
            f6219e = new f(4, Long.class, "fromUserUuid", false, "FROM_USER_UUID");
            f6220f = new f(5, Long.class, "lClubId", false, "L_CLUB_ID");
            f6221g = new f(6, Long.class, "lCreateTime", false, "L_CREATE_TIME");
            f6222h = new f(7, Long.class, "lMsgID", false, "L_MSG_ID");
            f6223i = new f(8, Long.class, "toUuid", false, "TO_UUID");
            f6224j = new f(9, String.class, "sMsg", false, "S_MSG");
            f6225k = new f(10, String.class, "sFromNick", false, "S_FROM_NICK");
        }
    }

    protected final /* synthetic */ Object m3816a(Object obj, long j) {
        ((ClubMsg) obj).f5793a = Long.valueOf(j);
        return Long.valueOf(j);
    }

    protected final /* synthetic */ void m3817a(SQLiteStatement sQLiteStatement, Object obj) {
        ClubMsg clubMsg = (ClubMsg) obj;
        sQLiteStatement.clearBindings();
        Long l = clubMsg.f5793a;
        if (l != null) {
            sQLiteStatement.bindLong(1, l.longValue());
        }
        Integer num = clubMsg.f5794b;
        if (num != null) {
            sQLiteStatement.bindLong(2, (long) num.intValue());
        }
        num = clubMsg.f5795c;
        if (num != null) {
            sQLiteStatement.bindLong(3, (long) num.intValue());
        }
        l = clubMsg.f5796d;
        if (l != null) {
            sQLiteStatement.bindLong(4, l.longValue());
        }
        l = clubMsg.f5797e;
        if (l != null) {
            sQLiteStatement.bindLong(5, l.longValue());
        }
        l = clubMsg.f5798f;
        if (l != null) {
            sQLiteStatement.bindLong(6, l.longValue());
        }
        l = clubMsg.f5799g;
        if (l != null) {
            sQLiteStatement.bindLong(7, l.longValue());
        }
        l = clubMsg.f5800h;
        if (l != null) {
            sQLiteStatement.bindLong(8, l.longValue());
        }
        l = clubMsg.f5801i;
        if (l != null) {
            sQLiteStatement.bindLong(9, l.longValue());
        }
        String str = clubMsg.f5802j;
        if (str != null) {
            sQLiteStatement.bindString(10, str);
        }
        str = clubMsg.f5803k;
        if (str != null) {
            sQLiteStatement.bindString(11, str);
        }
    }

    protected final /* synthetic */ void m3818a(c cVar, Object obj) {
        ClubMsg clubMsg = (ClubMsg) obj;
        cVar.c();
        Long l = clubMsg.f5793a;
        if (l != null) {
            cVar.a(1, l.longValue());
        }
        Integer num = clubMsg.f5794b;
        if (num != null) {
            cVar.a(2, (long) num.intValue());
        }
        num = clubMsg.f5795c;
        if (num != null) {
            cVar.a(3, (long) num.intValue());
        }
        l = clubMsg.f5796d;
        if (l != null) {
            cVar.a(4, l.longValue());
        }
        l = clubMsg.f5797e;
        if (l != null) {
            cVar.a(5, l.longValue());
        }
        l = clubMsg.f5798f;
        if (l != null) {
            cVar.a(6, l.longValue());
        }
        l = clubMsg.f5799g;
        if (l != null) {
            cVar.a(7, l.longValue());
        }
        l = clubMsg.f5800h;
        if (l != null) {
            cVar.a(8, l.longValue());
        }
        l = clubMsg.f5801i;
        if (l != null) {
            cVar.a(9, l.longValue());
        }
        String str = clubMsg.f5802j;
        if (str != null) {
            cVar.a(10, str);
        }
        str = clubMsg.f5803k;
        if (str != null) {
            cVar.a(11, str);
        }
    }

    protected final /* bridge */ /* synthetic */ void m3820b(Object obj) {
        ClubMsgDao clubMsgDao;
        ClubMsg clubMsg = (ClubMsg) obj;
        super.b(clubMsg);
        DaoSession daoSession = this.f6226a;
        clubMsg.f5805m = daoSession;
        if (daoSession != null) {
            clubMsgDao = daoSession.f6430E;
        } else {
            clubMsgDao = null;
        }
        clubMsg.f5806n = clubMsgDao;
    }

    public ClubMsgDao(org.a.a.c.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
        this.f6226a = daoSession;
    }

    public static void m3813a(org.a.a.a.a aVar) {
        aVar.a("CREATE TABLE " + LetterIndexBar.SEARCH_ICON_LETTER + "\"CLUB_MSG\" (\"_id\" INTEGER PRIMARY KEY ,\"E_CLUB_MESSAGE_TYPE\" INTEGER,\"I_STATUS\" INTEGER,\"FROM_UUID\" INTEGER,\"FROM_USER_UUID\" INTEGER,\"L_CLUB_ID\" INTEGER,\"L_CREATE_TIME\" INTEGER,\"L_MSG_ID\" INTEGER,\"TO_UUID\" INTEGER,\"S_MSG\" TEXT,\"S_FROM_NICK\" TEXT);");
    }

    public final /* synthetic */ Object m3814a(Cursor cursor, int i) {
        return cursor.isNull(i + 0) ? null : Long.valueOf(cursor.getLong(i + 0));
    }

    public final /* synthetic */ Object m3819b(Cursor cursor, int i) {
        String str;
        Long valueOf = cursor.isNull(i + 0) ? null : Long.valueOf(cursor.getLong(i + 0));
        Integer valueOf2 = cursor.isNull(i + 1) ? null : Integer.valueOf(cursor.getInt(i + 1));
        Integer valueOf3 = cursor.isNull(i + 2) ? null : Integer.valueOf(cursor.getInt(i + 2));
        Long valueOf4 = cursor.isNull(i + 3) ? null : Long.valueOf(cursor.getLong(i + 3));
        Long valueOf5 = cursor.isNull(i + 4) ? null : Long.valueOf(cursor.getLong(i + 4));
        Long valueOf6 = cursor.isNull(i + 5) ? null : Long.valueOf(cursor.getLong(i + 5));
        Long valueOf7 = cursor.isNull(i + 6) ? null : Long.valueOf(cursor.getLong(i + 6));
        Long valueOf8 = cursor.isNull(i + 7) ? null : Long.valueOf(cursor.getLong(i + 7));
        Long valueOf9 = cursor.isNull(i + 8) ? null : Long.valueOf(cursor.getLong(i + 8));
        String string = cursor.isNull(i + 9) ? null : cursor.getString(i + 9);
        if (cursor.isNull(i + 10)) {
            str = null;
        } else {
            str = cursor.getString(i + 10);
        }
        return new ClubMsg(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, string, str);
    }
}
