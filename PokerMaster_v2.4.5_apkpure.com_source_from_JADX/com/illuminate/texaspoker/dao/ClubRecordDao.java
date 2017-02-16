package com.illuminate.texaspoker.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.illuminate.texaspoker.p058c.ClubRecord;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import org.a.a.a;
import org.a.a.a.c;
import org.a.a.f;

public class ClubRecordDao extends a<ClubRecord, Long> {
    public static final String TABLENAME = "CLUB_RECORD";

    public static class Properties {
        public static final f f6227a;
        public static final f f6228b;
        public static final f f6229c;
        public static final f f6230d;
        public static final f f6231e;
        public static final f f6232f;

        static {
            f6227a = new f(0, Long.class, "id", true, "_id");
            f6228b = new f(1, Long.class, "lClubId", false, "L_CLUB_ID");
            f6229c = new f(2, Long.class, "lVpipCount", false, "L_VPIP_COUNT");
            f6230d = new f(3, Long.class, "lTotalGames", false, "L_TOTAL_GAMES");
            f6231e = new f(4, Long.class, "lTotalHands", false, "L_TOTAL_HANDS");
            f6232f = new f(5, Long.class, "lWinCount", false, "L_WIN_COUNT");
        }
    }

    protected final /* synthetic */ Object m3824a(Object obj, long j) {
        ((ClubRecord) obj).f5808a = Long.valueOf(j);
        return Long.valueOf(j);
    }

    protected final /* synthetic */ void m3825a(SQLiteStatement sQLiteStatement, Object obj) {
        ClubRecord clubRecord = (ClubRecord) obj;
        sQLiteStatement.clearBindings();
        Long l = clubRecord.f5808a;
        if (l != null) {
            sQLiteStatement.bindLong(1, l.longValue());
        }
        l = clubRecord.f5809b;
        if (l != null) {
            sQLiteStatement.bindLong(2, l.longValue());
        }
        l = clubRecord.f5810c;
        if (l != null) {
            sQLiteStatement.bindLong(3, l.longValue());
        }
        l = clubRecord.f5811d;
        if (l != null) {
            sQLiteStatement.bindLong(4, l.longValue());
        }
        l = clubRecord.f5812e;
        if (l != null) {
            sQLiteStatement.bindLong(5, l.longValue());
        }
        l = clubRecord.f5813f;
        if (l != null) {
            sQLiteStatement.bindLong(6, l.longValue());
        }
    }

    protected final /* synthetic */ void m3826a(c cVar, Object obj) {
        ClubRecord clubRecord = (ClubRecord) obj;
        cVar.c();
        Long l = clubRecord.f5808a;
        if (l != null) {
            cVar.a(1, l.longValue());
        }
        l = clubRecord.f5809b;
        if (l != null) {
            cVar.a(2, l.longValue());
        }
        l = clubRecord.f5810c;
        if (l != null) {
            cVar.a(3, l.longValue());
        }
        l = clubRecord.f5811d;
        if (l != null) {
            cVar.a(4, l.longValue());
        }
        l = clubRecord.f5812e;
        if (l != null) {
            cVar.a(5, l.longValue());
        }
        l = clubRecord.f5813f;
        if (l != null) {
            cVar.a(6, l.longValue());
        }
    }

    public ClubRecordDao(org.a.a.c.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    public static void m3821a(org.a.a.a.a aVar) {
        aVar.a("CREATE TABLE " + LetterIndexBar.SEARCH_ICON_LETTER + "\"CLUB_RECORD\" (\"_id\" INTEGER PRIMARY KEY ,\"L_CLUB_ID\" INTEGER,\"L_VPIP_COUNT\" INTEGER,\"L_TOTAL_GAMES\" INTEGER,\"L_TOTAL_HANDS\" INTEGER,\"L_WIN_COUNT\" INTEGER);");
    }

    public final /* synthetic */ Object m3822a(Cursor cursor, int i) {
        return cursor.isNull(i + 0) ? null : Long.valueOf(cursor.getLong(i + 0));
    }

    public final /* synthetic */ Object m3827b(Cursor cursor, int i) {
        Long l = null;
        Long valueOf = cursor.isNull(i + 0) ? null : Long.valueOf(cursor.getLong(i + 0));
        Long valueOf2 = cursor.isNull(i + 1) ? null : Long.valueOf(cursor.getLong(i + 1));
        Long valueOf3 = cursor.isNull(i + 2) ? null : Long.valueOf(cursor.getLong(i + 2));
        Long valueOf4 = cursor.isNull(i + 3) ? null : Long.valueOf(cursor.getLong(i + 3));
        Long valueOf5 = cursor.isNull(i + 4) ? null : Long.valueOf(cursor.getLong(i + 4));
        if (!cursor.isNull(i + 5)) {
            l = Long.valueOf(cursor.getLong(i + 5));
        }
        return new ClubRecord(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, l);
    }
}
