package com.illuminate.texaspoker.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.illuminate.texaspoker.p058c.BuyInControlMsg;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import org.a.a.a;
import org.a.a.a.c;
import org.a.a.f;

public class BuyInControlMsgDao extends a<BuyInControlMsg, Long> {
    public static final String TABLENAME = "BUY_IN_CONTROL_MSG";
    private DaoSession f6118a;

    public static class Properties {
        public static final f f6105a;
        public static final f f6106b;
        public static final f f6107c;
        public static final f f6108d;
        public static final f f6109e;
        public static final f f6110f;
        public static final f f6111g;
        public static final f f6112h;
        public static final f f6113i;
        public static final f f6114j;
        public static final f f6115k;
        public static final f f6116l;
        public static final f f6117m;

        static {
            f6105a = new f(0, Long.class, "id", true, "_id");
            f6106b = new f(1, Long.class, "lBuyinActionID", false, "L_BUYIN_ACTION_ID");
            f6107c = new f(2, Long.class, "lFromGameRoomId", false, "L_FROM_GAME_ROOM_ID");
            f6108d = new f(3, Long.class, "lApplyUuid", false, "L_APPLY_UUID");
            f6109e = new f(4, Long.class, "lBuyStacks", false, "L_BUY_STACKS");
            f6110f = new f(5, Boolean.class, "bReaded", false, "B_READED");
            f6111g = new f(6, Integer.class, "eBuyinControlMessageTypeDeny", false, "E_BUYIN_CONTROL_MESSAGE_TYPE_DENY");
            f6112h = new f(7, Long.class, "applyUserUuid", false, "APPLY_USER_UUID");
            f6113i = new f(8, Long.class, "gameRoomId", false, "GAME_ROOM_ID");
            f6114j = new f(9, String.class, "sActionNickname", false, "S_ACTION_NICKNAME");
            f6115k = new f(10, Long.class, "lMsgID", false, "L_MSG_ID");
            f6116l = new f(11, Long.TYPE, "lClubID", false, "L_CLUB_ID");
            f6117m = new f(12, String.class, "sClubName", false, "S_CLUB_NAME");
        }
    }

    protected final /* synthetic */ Object m3767a(Object obj, long j) {
        ((BuyInControlMsg) obj).f5668a = Long.valueOf(j);
        return Long.valueOf(j);
    }

    protected final /* synthetic */ void m3768a(SQLiteStatement sQLiteStatement, Object obj) {
        BuyInControlMsg buyInControlMsg = (BuyInControlMsg) obj;
        sQLiteStatement.clearBindings();
        Long l = buyInControlMsg.f5668a;
        if (l != null) {
            sQLiteStatement.bindLong(1, l.longValue());
        }
        l = buyInControlMsg.f5669b;
        if (l != null) {
            sQLiteStatement.bindLong(2, l.longValue());
        }
        l = buyInControlMsg.f5670c;
        if (l != null) {
            sQLiteStatement.bindLong(3, l.longValue());
        }
        l = buyInControlMsg.f5671d;
        if (l != null) {
            sQLiteStatement.bindLong(4, l.longValue());
        }
        l = buyInControlMsg.f5672e;
        if (l != null) {
            sQLiteStatement.bindLong(5, l.longValue());
        }
        Boolean bool = buyInControlMsg.f5673f;
        if (bool != null) {
            long j;
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            sQLiteStatement.bindLong(6, j);
        }
        Integer num = buyInControlMsg.f5674g;
        if (num != null) {
            sQLiteStatement.bindLong(7, (long) num.intValue());
        }
        l = buyInControlMsg.f5675h;
        if (l != null) {
            sQLiteStatement.bindLong(8, l.longValue());
        }
        l = buyInControlMsg.f5676i;
        if (l != null) {
            sQLiteStatement.bindLong(9, l.longValue());
        }
        String str = buyInControlMsg.f5677j;
        if (str != null) {
            sQLiteStatement.bindString(10, str);
        }
        l = buyInControlMsg.f5678k;
        if (l != null) {
            sQLiteStatement.bindLong(11, l.longValue());
        }
        sQLiteStatement.bindLong(12, buyInControlMsg.f5679l);
        str = buyInControlMsg.f5680m;
        if (str != null) {
            sQLiteStatement.bindString(13, str);
        }
    }

    protected final /* synthetic */ void m3769a(c cVar, Object obj) {
        BuyInControlMsg buyInControlMsg = (BuyInControlMsg) obj;
        cVar.c();
        Long l = buyInControlMsg.f5668a;
        if (l != null) {
            cVar.a(1, l.longValue());
        }
        l = buyInControlMsg.f5669b;
        if (l != null) {
            cVar.a(2, l.longValue());
        }
        l = buyInControlMsg.f5670c;
        if (l != null) {
            cVar.a(3, l.longValue());
        }
        l = buyInControlMsg.f5671d;
        if (l != null) {
            cVar.a(4, l.longValue());
        }
        l = buyInControlMsg.f5672e;
        if (l != null) {
            cVar.a(5, l.longValue());
        }
        Boolean bool = buyInControlMsg.f5673f;
        if (bool != null) {
            long j;
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            cVar.a(6, j);
        }
        Integer num = buyInControlMsg.f5674g;
        if (num != null) {
            cVar.a(7, (long) num.intValue());
        }
        l = buyInControlMsg.f5675h;
        if (l != null) {
            cVar.a(8, l.longValue());
        }
        l = buyInControlMsg.f5676i;
        if (l != null) {
            cVar.a(9, l.longValue());
        }
        String str = buyInControlMsg.f5677j;
        if (str != null) {
            cVar.a(10, str);
        }
        l = buyInControlMsg.f5678k;
        if (l != null) {
            cVar.a(11, l.longValue());
        }
        cVar.a(12, buyInControlMsg.f5679l);
        str = buyInControlMsg.f5680m;
        if (str != null) {
            cVar.a(13, str);
        }
    }

    protected final /* bridge */ /* synthetic */ void m3771b(Object obj) {
        BuyInControlMsgDao buyInControlMsgDao;
        BuyInControlMsg buyInControlMsg = (BuyInControlMsg) obj;
        super.b(buyInControlMsg);
        DaoSession daoSession = this.f6118a;
        buyInControlMsg.f5681n = daoSession;
        if (daoSession != null) {
            buyInControlMsgDao = daoSession.f6468y;
        } else {
            buyInControlMsgDao = null;
        }
        buyInControlMsg.f5682o = buyInControlMsgDao;
    }

    public BuyInControlMsgDao(org.a.a.c.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
        this.f6118a = daoSession;
    }

    public static void m3764a(org.a.a.a.a aVar) {
        aVar.a("CREATE TABLE " + LetterIndexBar.SEARCH_ICON_LETTER + "\"BUY_IN_CONTROL_MSG\" (\"_id\" INTEGER PRIMARY KEY ,\"L_BUYIN_ACTION_ID\" INTEGER,\"L_FROM_GAME_ROOM_ID\" INTEGER,\"L_APPLY_UUID\" INTEGER,\"L_BUY_STACKS\" INTEGER,\"B_READED\" INTEGER,\"E_BUYIN_CONTROL_MESSAGE_TYPE_DENY\" INTEGER,\"APPLY_USER_UUID\" INTEGER,\"GAME_ROOM_ID\" INTEGER,\"S_ACTION_NICKNAME\" TEXT,\"L_MSG_ID\" INTEGER,\"L_CLUB_ID\" INTEGER NOT NULL ,\"S_CLUB_NAME\" TEXT);");
    }

    public final /* synthetic */ Object m3765a(Cursor cursor, int i) {
        return cursor.isNull(i + 0) ? null : Long.valueOf(cursor.getLong(i + 0));
    }

    public final /* synthetic */ Object m3770b(Cursor cursor, int i) {
        Boolean bool;
        String str;
        Long valueOf = cursor.isNull(i + 0) ? null : Long.valueOf(cursor.getLong(i + 0));
        Long valueOf2 = cursor.isNull(i + 1) ? null : Long.valueOf(cursor.getLong(i + 1));
        Long valueOf3 = cursor.isNull(i + 2) ? null : Long.valueOf(cursor.getLong(i + 2));
        Long valueOf4 = cursor.isNull(i + 3) ? null : Long.valueOf(cursor.getLong(i + 3));
        Long valueOf5 = cursor.isNull(i + 4) ? null : Long.valueOf(cursor.getLong(i + 4));
        if (cursor.isNull(i + 5)) {
            bool = null;
        } else {
            bool = Boolean.valueOf(cursor.getShort(i + 5) != (short) 0);
        }
        Integer valueOf6 = cursor.isNull(i + 6) ? null : Integer.valueOf(cursor.getInt(i + 6));
        Long valueOf7 = cursor.isNull(i + 7) ? null : Long.valueOf(cursor.getLong(i + 7));
        Long valueOf8 = cursor.isNull(i + 8) ? null : Long.valueOf(cursor.getLong(i + 8));
        String string = cursor.isNull(i + 9) ? null : cursor.getString(i + 9);
        Long valueOf9 = cursor.isNull(i + 10) ? null : Long.valueOf(cursor.getLong(i + 10));
        long j = cursor.getLong(i + 11);
        if (cursor.isNull(i + 12)) {
            str = null;
        } else {
            str = cursor.getString(i + 12);
        }
        return new BuyInControlMsg(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, bool, valueOf6, valueOf7, valueOf8, string, valueOf9, j, str);
    }
}
