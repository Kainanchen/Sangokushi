package com.illuminate.texaspoker.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.illuminate.texaspoker.p058c.PokerHistory;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import org.a.a.a;
import org.a.a.a.c;
import org.a.a.f;

public class PokerHistoryDao extends a<PokerHistory, Long> {
    public static final String TABLENAME = "POKER_HISTORY";

    public static class Properties {
        public static final f f6364A;
        public static final f f6365B;
        public static final f f6366C;
        public static final f f6367a;
        public static final f f6368b;
        public static final f f6369c;
        public static final f f6370d;
        public static final f f6371e;
        public static final f f6372f;
        public static final f f6373g;
        public static final f f6374h;
        public static final f f6375i;
        public static final f f6376j;
        public static final f f6377k;
        public static final f f6378l;
        public static final f f6379m;
        public static final f f6380n;
        public static final f f6381o;
        public static final f f6382p;
        public static final f f6383q;
        public static final f f6384r;
        public static final f f6385s;
        public static final f f6386t;
        public static final f f6387u;
        public static final f f6388v;
        public static final f f6389w;
        public static final f f6390x;
        public static final f f6391y;
        public static final f f6392z;

        static {
            f6367a = new f(0, Long.class, "id", true, "_id");
            f6368b = new f(1, Boolean.class, "bInGame", false, "B_IN_GAME");
            f6369c = new f(2, Boolean.class, "fromShare", false, "FROM_SHARE");
            f6370d = new f(3, Integer.class, "iCardOne", false, "I_CARD_ONE");
            f6371e = new f(4, Integer.class, "iCardTwo", false, "I_CARD_TWO");
            f6372f = new f(5, Integer.class, "iCardThree", false, "I_CARD_THREE");
            f6373g = new f(6, Integer.class, "iCardFour", false, "I_CARD_FOUR");
            f6374h = new f(7, Boolean.class, "bIsOmaha", false, "B_IS_OMAHA");
            f6375i = new f(8, Integer.class, "iGameType", false, "I_GAME_TYPE");
            f6376j = new f(9, Long.class, "lBigBlind", false, "L_BIG_BLIND");
            f6377k = new f(10, Long.class, "lCreateTime", false, "L_CREATE_TIME");
            f6378l = new f(11, Long.class, "lGetPopularity", false, "L_GET_POPULARITY");
            f6379m = new f(12, Long.class, "lHandId", false, "L_HAND_ID");
            f6380n = new f(13, Long.class, "lRoomId", false, "L_ROOM_ID");
            f6381o = new f(14, Long.class, "lSaveTime", false, "L_SAVE_TIME");
            f6382p = new f(15, Long.class, "lSaveUuid", false, "L_SAVE_UUID");
            f6383q = new f(16, Long.class, "lShareUuid", false, "L_SHARE_UUID");
            f6384r = new f(17, Long.class, "lSmallBlind", false, "L_SMALL_BLIND");
            f6385s = new f(18, String.class, "sFavoriteName", false, "S_FAVORITE_NAME");
            f6386t = new f(19, String.class, "sFavoriteUrl", false, "S_FAVORITE_URL");
            f6387u = new f(20, String.class, "sPokerHistoryName", false, "S_POKER_HISTORY_NAME");
            f6388v = new f(21, String.class, "sPokerHistoryRoomName", false, "S_POKER_HISTORY_ROOM_NAME");
            f6389w = new f(22, String.class, "sPokerHistoryShareUrl", false, "S_POKER_HISTORY_SHARE_URL");
            f6390x = new f(23, String.class, "sPokerHistoryUrl", false, "S_POKER_HISTORY_URL");
            f6391y = new f(24, Integer.class, "iAnte", false, "I_ANTE");
            f6392z = new f(25, Long.class, "lMaxPot", false, "L_MAX_POT");
            f6364A = new f(26, Integer.class, "iType", false, "I_TYPE");
            f6365B = new f(27, Long.class, "lWinUuid", false, "L_WIN_UUID");
            f6366C = new f(28, String.class, "sPokerDesc", false, "S_POKER_DESC");
        }
    }

    protected final /* synthetic */ Object m3890a(Object obj, long j) {
        ((PokerHistory) obj).f5955a = Long.valueOf(j);
        return Long.valueOf(j);
    }

    protected final /* synthetic */ void m3891a(SQLiteStatement sQLiteStatement, Object obj) {
        long j;
        long j2 = 1;
        PokerHistory pokerHistory = (PokerHistory) obj;
        sQLiteStatement.clearBindings();
        Long l = pokerHistory.f5955a;
        if (l != null) {
            sQLiteStatement.bindLong(1, l.longValue());
        }
        Boolean bool = pokerHistory.f5956b;
        if (bool != null) {
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            sQLiteStatement.bindLong(2, j);
        }
        bool = pokerHistory.f5957c;
        if (bool != null) {
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            sQLiteStatement.bindLong(3, j);
        }
        Integer num = pokerHistory.f5958d;
        if (num != null) {
            sQLiteStatement.bindLong(4, (long) num.intValue());
        }
        num = pokerHistory.f5959e;
        if (num != null) {
            sQLiteStatement.bindLong(5, (long) num.intValue());
        }
        num = pokerHistory.f5960f;
        if (num != null) {
            sQLiteStatement.bindLong(6, (long) num.intValue());
        }
        num = pokerHistory.f5961g;
        if (num != null) {
            sQLiteStatement.bindLong(7, (long) num.intValue());
        }
        bool = pokerHistory.f5962h;
        if (bool != null) {
            if (!bool.booleanValue()) {
                j2 = 0;
            }
            sQLiteStatement.bindLong(8, j2);
        }
        num = pokerHistory.f5963i;
        if (num != null) {
            sQLiteStatement.bindLong(9, (long) num.intValue());
        }
        l = pokerHistory.f5964j;
        if (l != null) {
            sQLiteStatement.bindLong(10, l.longValue());
        }
        l = pokerHistory.f5965k;
        if (l != null) {
            sQLiteStatement.bindLong(11, l.longValue());
        }
        l = pokerHistory.f5966l;
        if (l != null) {
            sQLiteStatement.bindLong(12, l.longValue());
        }
        l = pokerHistory.f5967m;
        if (l != null) {
            sQLiteStatement.bindLong(13, l.longValue());
        }
        l = pokerHistory.f5968n;
        if (l != null) {
            sQLiteStatement.bindLong(14, l.longValue());
        }
        l = pokerHistory.f5969o;
        if (l != null) {
            sQLiteStatement.bindLong(15, l.longValue());
        }
        l = pokerHistory.f5970p;
        if (l != null) {
            sQLiteStatement.bindLong(16, l.longValue());
        }
        l = pokerHistory.f5971q;
        if (l != null) {
            sQLiteStatement.bindLong(17, l.longValue());
        }
        l = pokerHistory.f5972r;
        if (l != null) {
            sQLiteStatement.bindLong(18, l.longValue());
        }
        String str = pokerHistory.f5973s;
        if (str != null) {
            sQLiteStatement.bindString(19, str);
        }
        str = pokerHistory.f5974t;
        if (str != null) {
            sQLiteStatement.bindString(20, str);
        }
        str = pokerHistory.f5975u;
        if (str != null) {
            sQLiteStatement.bindString(21, str);
        }
        str = pokerHistory.f5976v;
        if (str != null) {
            sQLiteStatement.bindString(22, str);
        }
        str = pokerHistory.f5977w;
        if (str != null) {
            sQLiteStatement.bindString(23, str);
        }
        str = pokerHistory.f5978x;
        if (str != null) {
            sQLiteStatement.bindString(24, str);
        }
        num = pokerHistory.f5979y;
        if (num != null) {
            sQLiteStatement.bindLong(25, (long) num.intValue());
        }
        l = pokerHistory.f5980z;
        if (l != null) {
            sQLiteStatement.bindLong(26, l.longValue());
        }
        num = pokerHistory.f5952A;
        if (num != null) {
            sQLiteStatement.bindLong(27, (long) num.intValue());
        }
        l = pokerHistory.f5953B;
        if (l != null) {
            sQLiteStatement.bindLong(28, l.longValue());
        }
        str = pokerHistory.f5954C;
        if (str != null) {
            sQLiteStatement.bindString(29, str);
        }
    }

    protected final /* synthetic */ void m3892a(c cVar, Object obj) {
        long j;
        long j2 = 1;
        PokerHistory pokerHistory = (PokerHistory) obj;
        cVar.c();
        Long l = pokerHistory.f5955a;
        if (l != null) {
            cVar.a(1, l.longValue());
        }
        Boolean bool = pokerHistory.f5956b;
        if (bool != null) {
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            cVar.a(2, j);
        }
        bool = pokerHistory.f5957c;
        if (bool != null) {
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            cVar.a(3, j);
        }
        Integer num = pokerHistory.f5958d;
        if (num != null) {
            cVar.a(4, (long) num.intValue());
        }
        num = pokerHistory.f5959e;
        if (num != null) {
            cVar.a(5, (long) num.intValue());
        }
        num = pokerHistory.f5960f;
        if (num != null) {
            cVar.a(6, (long) num.intValue());
        }
        num = pokerHistory.f5961g;
        if (num != null) {
            cVar.a(7, (long) num.intValue());
        }
        bool = pokerHistory.f5962h;
        if (bool != null) {
            if (!bool.booleanValue()) {
                j2 = 0;
            }
            cVar.a(8, j2);
        }
        num = pokerHistory.f5963i;
        if (num != null) {
            cVar.a(9, (long) num.intValue());
        }
        l = pokerHistory.f5964j;
        if (l != null) {
            cVar.a(10, l.longValue());
        }
        l = pokerHistory.f5965k;
        if (l != null) {
            cVar.a(11, l.longValue());
        }
        l = pokerHistory.f5966l;
        if (l != null) {
            cVar.a(12, l.longValue());
        }
        l = pokerHistory.f5967m;
        if (l != null) {
            cVar.a(13, l.longValue());
        }
        l = pokerHistory.f5968n;
        if (l != null) {
            cVar.a(14, l.longValue());
        }
        l = pokerHistory.f5969o;
        if (l != null) {
            cVar.a(15, l.longValue());
        }
        l = pokerHistory.f5970p;
        if (l != null) {
            cVar.a(16, l.longValue());
        }
        l = pokerHistory.f5971q;
        if (l != null) {
            cVar.a(17, l.longValue());
        }
        l = pokerHistory.f5972r;
        if (l != null) {
            cVar.a(18, l.longValue());
        }
        String str = pokerHistory.f5973s;
        if (str != null) {
            cVar.a(19, str);
        }
        str = pokerHistory.f5974t;
        if (str != null) {
            cVar.a(20, str);
        }
        str = pokerHistory.f5975u;
        if (str != null) {
            cVar.a(21, str);
        }
        str = pokerHistory.f5976v;
        if (str != null) {
            cVar.a(22, str);
        }
        str = pokerHistory.f5977w;
        if (str != null) {
            cVar.a(23, str);
        }
        str = pokerHistory.f5978x;
        if (str != null) {
            cVar.a(24, str);
        }
        num = pokerHistory.f5979y;
        if (num != null) {
            cVar.a(25, (long) num.intValue());
        }
        l = pokerHistory.f5980z;
        if (l != null) {
            cVar.a(26, l.longValue());
        }
        num = pokerHistory.f5952A;
        if (num != null) {
            cVar.a(27, (long) num.intValue());
        }
        l = pokerHistory.f5953B;
        if (l != null) {
            cVar.a(28, l.longValue());
        }
        str = pokerHistory.f5954C;
        if (str != null) {
            cVar.a(29, str);
        }
    }

    public PokerHistoryDao(org.a.a.c.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    public static void m3887a(org.a.a.a.a aVar) {
        aVar.a("CREATE TABLE " + LetterIndexBar.SEARCH_ICON_LETTER + "\"POKER_HISTORY\" (\"_id\" INTEGER PRIMARY KEY ,\"B_IN_GAME\" INTEGER,\"FROM_SHARE\" INTEGER,\"I_CARD_ONE\" INTEGER,\"I_CARD_TWO\" INTEGER,\"I_CARD_THREE\" INTEGER,\"I_CARD_FOUR\" INTEGER,\"B_IS_OMAHA\" INTEGER,\"I_GAME_TYPE\" INTEGER,\"L_BIG_BLIND\" INTEGER,\"L_CREATE_TIME\" INTEGER,\"L_GET_POPULARITY\" INTEGER,\"L_HAND_ID\" INTEGER,\"L_ROOM_ID\" INTEGER,\"L_SAVE_TIME\" INTEGER,\"L_SAVE_UUID\" INTEGER,\"L_SHARE_UUID\" INTEGER,\"L_SMALL_BLIND\" INTEGER,\"S_FAVORITE_NAME\" TEXT,\"S_FAVORITE_URL\" TEXT,\"S_POKER_HISTORY_NAME\" TEXT,\"S_POKER_HISTORY_ROOM_NAME\" TEXT,\"S_POKER_HISTORY_SHARE_URL\" TEXT,\"S_POKER_HISTORY_URL\" TEXT,\"I_ANTE\" INTEGER,\"L_MAX_POT\" INTEGER,\"I_TYPE\" INTEGER,\"L_WIN_UUID\" INTEGER,\"S_POKER_DESC\" TEXT);");
    }

    public final /* synthetic */ Object m3888a(Cursor cursor, int i) {
        return cursor.isNull(i + 0) ? null : Long.valueOf(cursor.getLong(i + 0));
    }

    public final /* synthetic */ Object m3893b(Cursor cursor, int i) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        String str;
        Long valueOf = cursor.isNull(i + 0) ? null : Long.valueOf(cursor.getLong(i + 0));
        if (cursor.isNull(i + 1)) {
            bool = null;
        } else {
            bool = Boolean.valueOf(cursor.getShort(i + 1) != (short) 0);
        }
        if (cursor.isNull(i + 2)) {
            bool2 = null;
        } else {
            bool2 = Boolean.valueOf(cursor.getShort(i + 2) != (short) 0);
        }
        Integer valueOf2 = cursor.isNull(i + 3) ? null : Integer.valueOf(cursor.getInt(i + 3));
        Integer valueOf3 = cursor.isNull(i + 4) ? null : Integer.valueOf(cursor.getInt(i + 4));
        Integer valueOf4 = cursor.isNull(i + 5) ? null : Integer.valueOf(cursor.getInt(i + 5));
        Integer valueOf5 = cursor.isNull(i + 6) ? null : Integer.valueOf(cursor.getInt(i + 6));
        if (cursor.isNull(i + 7)) {
            bool3 = null;
        } else {
            bool3 = Boolean.valueOf(cursor.getShort(i + 7) != (short) 0);
        }
        Integer valueOf6 = cursor.isNull(i + 8) ? null : Integer.valueOf(cursor.getInt(i + 8));
        Long valueOf7 = cursor.isNull(i + 9) ? null : Long.valueOf(cursor.getLong(i + 9));
        Long valueOf8 = cursor.isNull(i + 10) ? null : Long.valueOf(cursor.getLong(i + 10));
        Long valueOf9 = cursor.isNull(i + 11) ? null : Long.valueOf(cursor.getLong(i + 11));
        Long valueOf10 = cursor.isNull(i + 12) ? null : Long.valueOf(cursor.getLong(i + 12));
        Long valueOf11 = cursor.isNull(i + 13) ? null : Long.valueOf(cursor.getLong(i + 13));
        Long valueOf12 = cursor.isNull(i + 14) ? null : Long.valueOf(cursor.getLong(i + 14));
        Long valueOf13 = cursor.isNull(i + 15) ? null : Long.valueOf(cursor.getLong(i + 15));
        Long valueOf14 = cursor.isNull(i + 16) ? null : Long.valueOf(cursor.getLong(i + 16));
        Long valueOf15 = cursor.isNull(i + 17) ? null : Long.valueOf(cursor.getLong(i + 17));
        String string = cursor.isNull(i + 18) ? null : cursor.getString(i + 18);
        String string2 = cursor.isNull(i + 19) ? null : cursor.getString(i + 19);
        String string3 = cursor.isNull(i + 20) ? null : cursor.getString(i + 20);
        String string4 = cursor.isNull(i + 21) ? null : cursor.getString(i + 21);
        String string5 = cursor.isNull(i + 22) ? null : cursor.getString(i + 22);
        String string6 = cursor.isNull(i + 23) ? null : cursor.getString(i + 23);
        Integer valueOf16 = cursor.isNull(i + 24) ? null : Integer.valueOf(cursor.getInt(i + 24));
        Long valueOf17 = cursor.isNull(i + 25) ? null : Long.valueOf(cursor.getLong(i + 25));
        Integer valueOf18 = cursor.isNull(i + 26) ? null : Integer.valueOf(cursor.getInt(i + 26));
        Long valueOf19 = cursor.isNull(i + 27) ? null : Long.valueOf(cursor.getLong(i + 27));
        if (cursor.isNull(i + 28)) {
            str = null;
        } else {
            str = cursor.getString(i + 28);
        }
        return new PokerHistory(valueOf, bool, bool2, valueOf2, valueOf3, valueOf4, valueOf5, bool3, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, string, string2, string3, string4, string5, string6, valueOf16, valueOf17, valueOf18, valueOf19, str);
    }
}
