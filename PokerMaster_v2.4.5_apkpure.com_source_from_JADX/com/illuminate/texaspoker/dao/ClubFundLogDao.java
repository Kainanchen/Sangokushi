package com.illuminate.texaspoker.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.illuminate.texaspoker.p058c.ClubFundLog;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import org.a.a.a;
import org.a.a.a.c;
import org.a.a.f;

public class ClubFundLogDao extends a<ClubFundLog, Long> {
    public static final String TABLENAME = "CLUB_FUND_LOG";

    public static class Properties {
        public static final f f6206a;
        public static final f f6207b;
        public static final f f6208c;
        public static final f f6209d;
        public static final f f6210e;
        public static final f f6211f;
        public static final f f6212g;
        public static final f f6213h;
        public static final f f6214i;

        static {
            f6206a = new f(0, Long.class, "id", true, "_id");
            f6207b = new f(1, Integer.class, "eFundBillToType", false, "E_FUND_BILL_TO_TYPE");
            f6208c = new f(2, Integer.class, "eFundBillType", false, "E_FUND_BILL_TYPE");
            f6209d = new f(3, Long.class, "lClubId", false, "L_CLUB_ID");
            f6210e = new f(4, Long.class, "lCreateTime", false, "L_CREATE_TIME");
            f6211f = new f(5, Long.class, "lFund", false, "L_FUND");
            f6212g = new f(6, Long.class, "lOwnerUuid", false, "L_OWNER_UUID");
            f6213h = new f(7, String.class, "userArrayStr", false, "USER_ARRAY_STR");
            f6214i = new f(8, String.class, "strGameName", false, "STR_GAME_NAME");
        }
    }

    protected final /* synthetic */ Object m3809a(Object obj, long j) {
        ((ClubFundLog) obj).f5784a = Long.valueOf(j);
        return Long.valueOf(j);
    }

    protected final /* synthetic */ void m3810a(SQLiteStatement sQLiteStatement, Object obj) {
        ClubFundLog clubFundLog = (ClubFundLog) obj;
        sQLiteStatement.clearBindings();
        Long l = clubFundLog.f5784a;
        if (l != null) {
            sQLiteStatement.bindLong(1, l.longValue());
        }
        Integer num = clubFundLog.f5785b;
        if (num != null) {
            sQLiteStatement.bindLong(2, (long) num.intValue());
        }
        num = clubFundLog.f5786c;
        if (num != null) {
            sQLiteStatement.bindLong(3, (long) num.intValue());
        }
        l = clubFundLog.f5787d;
        if (l != null) {
            sQLiteStatement.bindLong(4, l.longValue());
        }
        l = clubFundLog.f5788e;
        if (l != null) {
            sQLiteStatement.bindLong(5, l.longValue());
        }
        l = clubFundLog.f5789f;
        if (l != null) {
            sQLiteStatement.bindLong(6, l.longValue());
        }
        l = clubFundLog.f5790g;
        if (l != null) {
            sQLiteStatement.bindLong(7, l.longValue());
        }
        String str = clubFundLog.f5791h;
        if (str != null) {
            sQLiteStatement.bindString(8, str);
        }
        str = clubFundLog.f5792i;
        if (str != null) {
            sQLiteStatement.bindString(9, str);
        }
    }

    protected final /* synthetic */ void m3811a(c cVar, Object obj) {
        ClubFundLog clubFundLog = (ClubFundLog) obj;
        cVar.c();
        Long l = clubFundLog.f5784a;
        if (l != null) {
            cVar.a(1, l.longValue());
        }
        Integer num = clubFundLog.f5785b;
        if (num != null) {
            cVar.a(2, (long) num.intValue());
        }
        num = clubFundLog.f5786c;
        if (num != null) {
            cVar.a(3, (long) num.intValue());
        }
        l = clubFundLog.f5787d;
        if (l != null) {
            cVar.a(4, l.longValue());
        }
        l = clubFundLog.f5788e;
        if (l != null) {
            cVar.a(5, l.longValue());
        }
        l = clubFundLog.f5789f;
        if (l != null) {
            cVar.a(6, l.longValue());
        }
        l = clubFundLog.f5790g;
        if (l != null) {
            cVar.a(7, l.longValue());
        }
        String str = clubFundLog.f5791h;
        if (str != null) {
            cVar.a(8, str);
        }
        str = clubFundLog.f5792i;
        if (str != null) {
            cVar.a(9, str);
        }
    }

    public ClubFundLogDao(org.a.a.c.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    public static void m3806a(org.a.a.a.a aVar) {
        aVar.a("CREATE TABLE " + LetterIndexBar.SEARCH_ICON_LETTER + "\"CLUB_FUND_LOG\" (\"_id\" INTEGER PRIMARY KEY ,\"E_FUND_BILL_TO_TYPE\" INTEGER,\"E_FUND_BILL_TYPE\" INTEGER,\"L_CLUB_ID\" INTEGER,\"L_CREATE_TIME\" INTEGER,\"L_FUND\" INTEGER,\"L_OWNER_UUID\" INTEGER,\"USER_ARRAY_STR\" TEXT,\"STR_GAME_NAME\" TEXT);");
    }

    public final /* synthetic */ Object m3807a(Cursor cursor, int i) {
        return cursor.isNull(i + 0) ? null : Long.valueOf(cursor.getLong(i + 0));
    }

    public final /* synthetic */ Object m3812b(Cursor cursor, int i) {
        String str = null;
        Long valueOf = cursor.isNull(i + 0) ? null : Long.valueOf(cursor.getLong(i + 0));
        Integer valueOf2 = cursor.isNull(i + 1) ? null : Integer.valueOf(cursor.getInt(i + 1));
        Integer valueOf3 = cursor.isNull(i + 2) ? null : Integer.valueOf(cursor.getInt(i + 2));
        Long valueOf4 = cursor.isNull(i + 3) ? null : Long.valueOf(cursor.getLong(i + 3));
        Long valueOf5 = cursor.isNull(i + 4) ? null : Long.valueOf(cursor.getLong(i + 4));
        Long valueOf6 = cursor.isNull(i + 5) ? null : Long.valueOf(cursor.getLong(i + 5));
        Long valueOf7 = cursor.isNull(i + 6) ? null : Long.valueOf(cursor.getLong(i + 6));
        String string = cursor.isNull(i + 7) ? null : cursor.getString(i + 7);
        if (!cursor.isNull(i + 8)) {
            str = cursor.getString(i + 8);
        }
        return new ClubFundLog(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, string, str);
    }
}
