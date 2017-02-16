package com.illuminate.texaspoker.dao;

import a.does.not.Exists2;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import com.illuminate.texaspoker.p058c.League;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import org.a.a.a;
import org.a.a.a.c;
import org.a.a.f;

public class LeagueDao extends a<League, Long> {
    public static final String TABLENAME = "LEAGUE";

    public static class Properties {
        public static final f f6329a = null;
        public static final f f6330b = null;
        public static final f f6331c = null;
        public static final f f6332d = null;
        public static final f f6333e = null;
        public static final f f6334f = null;
        public static final f f6335g = null;
        public static final f f6336h = null;
        public static final f f6337i = null;
        public static final f f6338j = null;

        static {
            fixHelper.fixfunc(new int[]{564, 1});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        static void __clinit__() {
            f6329a = new f(0, Long.class, "id", true, "_id");
            f6330b = new f(1, Long.class, "lLeagueID", false, "L_LEAGUE_ID");
            f6331c = new f(2, Long.class, "creatorClubId", false, "CREATOR_CLUB_ID");
            f6332d = new f(3, String.class, "sLeagueName", false, "S_LEAGUE_NAME");
            f6333e = new f(4, Boolean.class, "bLeagueMute", false, "B_LEAGUE_MUTE");
            f6334f = new f(5, Integer.class, "iMaxMembers", false, "I_MAX_MEMBERS");
            f6335g = new f(6, Long.class, "lCreateTime", false, "L_CREATE_TIME");
            f6336h = new f(7, Integer.class, "iCurUserMembersCount", false, "I_CUR_USER_MEMBERS_COUNT");
            f6337i = new f(8, Integer.class, "iMaxUserMembersCount", false, "I_MAX_USER_MEMBERS_COUNT");
            f6338j = new f(9, String.class, "strCreatorName", false, "STR_CREATOR_NAME");
        }
    }

    protected final /* synthetic */ Object m3868a(Object obj, long j) {
        ((League) obj).f5903a = Long.valueOf(j);
        return Long.valueOf(j);
    }

    protected final /* synthetic */ void m3869a(SQLiteStatement sQLiteStatement, Object obj) {
        League league = (League) obj;
        sQLiteStatement.clearBindings();
        Long l = league.f5903a;
        if (l != null) {
            sQLiteStatement.bindLong(1, l.longValue());
        }
        l = league.f5904b;
        if (l != null) {
            sQLiteStatement.bindLong(2, l.longValue());
        }
        l = league.f5905c;
        if (l != null) {
            sQLiteStatement.bindLong(3, l.longValue());
        }
        String str = league.f5906d;
        if (str != null) {
            sQLiteStatement.bindString(4, str);
        }
        Boolean bool = league.f5907e;
        if (bool != null) {
            long j;
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            sQLiteStatement.bindLong(5, j);
        }
        Integer num = league.f5908f;
        if (num != null) {
            sQLiteStatement.bindLong(6, (long) num.intValue());
        }
        l = league.f5909g;
        if (l != null) {
            sQLiteStatement.bindLong(7, l.longValue());
        }
        num = league.f5910h;
        if (num != null) {
            sQLiteStatement.bindLong(8, (long) num.intValue());
        }
        num = league.f5911i;
        if (num != null) {
            sQLiteStatement.bindLong(9, (long) num.intValue());
        }
        str = league.f5912j;
        if (str != null) {
            sQLiteStatement.bindString(10, str);
        }
    }

    protected final /* synthetic */ void m3870a(c cVar, Object obj) {
        League league = (League) obj;
        cVar.c();
        Long l = league.f5903a;
        if (l != null) {
            cVar.a(1, l.longValue());
        }
        l = league.f5904b;
        if (l != null) {
            cVar.a(2, l.longValue());
        }
        l = league.f5905c;
        if (l != null) {
            cVar.a(3, l.longValue());
        }
        String str = league.f5906d;
        if (str != null) {
            cVar.a(4, str);
        }
        Boolean bool = league.f5907e;
        if (bool != null) {
            long j;
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            cVar.a(5, j);
        }
        Integer num = league.f5908f;
        if (num != null) {
            cVar.a(6, (long) num.intValue());
        }
        l = league.f5909g;
        if (l != null) {
            cVar.a(7, l.longValue());
        }
        num = league.f5910h;
        if (num != null) {
            cVar.a(8, (long) num.intValue());
        }
        num = league.f5911i;
        if (num != null) {
            cVar.a(9, (long) num.intValue());
        }
        str = league.f5912j;
        if (str != null) {
            cVar.a(10, str);
        }
    }

    public LeagueDao(org.a.a.c.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    public static void m3865a(org.a.a.a.a aVar) {
        aVar.a("CREATE TABLE " + LetterIndexBar.SEARCH_ICON_LETTER + "\"LEAGUE\" (\"_id\" INTEGER PRIMARY KEY ,\"L_LEAGUE_ID\" INTEGER,\"CREATOR_CLUB_ID\" INTEGER,\"S_LEAGUE_NAME\" TEXT,\"B_LEAGUE_MUTE\" INTEGER,\"I_MAX_MEMBERS\" INTEGER,\"L_CREATE_TIME\" INTEGER,\"I_CUR_USER_MEMBERS_COUNT\" INTEGER,\"I_MAX_USER_MEMBERS_COUNT\" INTEGER,\"STR_CREATOR_NAME\" TEXT);");
    }

    public final /* synthetic */ Object m3866a(Cursor cursor, int i) {
        return cursor.isNull(i + 0) ? null : Long.valueOf(cursor.getLong(i + 0));
    }

    public final /* synthetic */ Object m3871b(Cursor cursor, int i) {
        Boolean bool;
        String str = null;
        Long valueOf = cursor.isNull(i + 0) ? null : Long.valueOf(cursor.getLong(i + 0));
        Long valueOf2 = cursor.isNull(i + 1) ? null : Long.valueOf(cursor.getLong(i + 1));
        Long valueOf3 = cursor.isNull(i + 2) ? null : Long.valueOf(cursor.getLong(i + 2));
        String string = cursor.isNull(i + 3) ? null : cursor.getString(i + 3);
        if (cursor.isNull(i + 4)) {
            bool = null;
        } else {
            bool = Boolean.valueOf(cursor.getShort(i + 4) != (short) 0);
        }
        Integer valueOf4 = cursor.isNull(i + 5) ? null : Integer.valueOf(cursor.getInt(i + 5));
        Long valueOf5 = cursor.isNull(i + 6) ? null : Long.valueOf(cursor.getLong(i + 6));
        Integer valueOf6 = cursor.isNull(i + 7) ? null : Integer.valueOf(cursor.getInt(i + 7));
        Integer valueOf7 = cursor.isNull(i + 8) ? null : Integer.valueOf(cursor.getInt(i + 8));
        if (!cursor.isNull(i + 9)) {
            str = cursor.getString(i + 9);
        }
        return new League(valueOf, valueOf2, valueOf3, string, bool, valueOf4, valueOf5, valueOf6, valueOf7, str);
    }
}
