package com.illuminate.texaspoker.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.illuminate.texaspoker.p058c.MessageMsg;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import org.a.a.a;
import org.a.a.a.c;
import org.a.a.f;

public class MessageMsgDao extends a<MessageMsg, Long> {
    public static final String TABLENAME = "MESSAGE_MSG";

    public static class Properties {
        public static final f f6352a;
        public static final f f6353b;
        public static final f f6354c;
        public static final f f6355d;
        public static final f f6356e;
        public static final f f6357f;
        public static final f f6358g;
        public static final f f6359h;
        public static final f f6360i;
        public static final f f6361j;
        public static final f f6362k;
        public static final f f6363l;

        static {
            f6352a = new f(0, Long.class, "id", true, "_id");
            f6353b = new f(1, Boolean.class, "bReaded", false, "B_READED");
            f6354c = new f(2, Boolean.class, "bGetBenefits", false, "B_GET_BENEFITS");
            f6355d = new f(3, Integer.class, "eSystemMessageContentType", false, "E_SYSTEM_MESSAGE_CONTENT_TYPE");
            f6356e = new f(4, Integer.class, "eSystemMessageType", false, "E_SYSTEM_MESSAGE_TYPE");
            f6357f = new f(5, Long.class, "lSystemMsgID", false, "L_SYSTEM_MSG_ID");
            f6358g = new f(6, Long.class, "lSystemSendTime", false, "L_SYSTEM_SEND_TIME");
            f6359h = new f(7, String.class, "sSystemMsgImgUrl", false, "S_SYSTEM_MSG_IMG_URL");
            f6360i = new f(8, String.class, "sSystemMsgSummary", false, "S_SYSTEM_MSG_SUMMARY");
            f6361j = new f(9, String.class, "sSystemMsgTitle", false, "S_SYSTEM_MSG_TITLE");
            f6362k = new f(10, String.class, "sSystemMsgUrl", false, "S_SYSTEM_MSG_URL");
            f6363l = new f(11, String.class, "sSystemMsgDetail", false, "S_SYSTEM_MSG_DETAIL");
        }
    }

    protected final /* synthetic */ Object m3883a(Object obj, long j) {
        ((MessageMsg) obj).f5940a = Long.valueOf(j);
        return Long.valueOf(j);
    }

    protected final /* synthetic */ void m3884a(SQLiteStatement sQLiteStatement, Object obj) {
        long j = 1;
        MessageMsg messageMsg = (MessageMsg) obj;
        sQLiteStatement.clearBindings();
        Long l = messageMsg.f5940a;
        if (l != null) {
            sQLiteStatement.bindLong(1, l.longValue());
        }
        Boolean bool = messageMsg.f5941b;
        if (bool != null) {
            long j2;
            if (bool.booleanValue()) {
                j2 = 1;
            } else {
                j2 = 0;
            }
            sQLiteStatement.bindLong(2, j2);
        }
        bool = messageMsg.f5942c;
        if (bool != null) {
            if (!bool.booleanValue()) {
                j = 0;
            }
            sQLiteStatement.bindLong(3, j);
        }
        Integer num = messageMsg.f5943d;
        if (num != null) {
            sQLiteStatement.bindLong(4, (long) num.intValue());
        }
        num = messageMsg.f5944e;
        if (num != null) {
            sQLiteStatement.bindLong(5, (long) num.intValue());
        }
        l = messageMsg.f5945f;
        if (l != null) {
            sQLiteStatement.bindLong(6, l.longValue());
        }
        l = messageMsg.f5946g;
        if (l != null) {
            sQLiteStatement.bindLong(7, l.longValue());
        }
        String str = messageMsg.f5947h;
        if (str != null) {
            sQLiteStatement.bindString(8, str);
        }
        str = messageMsg.f5948i;
        if (str != null) {
            sQLiteStatement.bindString(9, str);
        }
        str = messageMsg.f5949j;
        if (str != null) {
            sQLiteStatement.bindString(10, str);
        }
        str = messageMsg.f5950k;
        if (str != null) {
            sQLiteStatement.bindString(11, str);
        }
        str = messageMsg.f5951l;
        if (str != null) {
            sQLiteStatement.bindString(12, str);
        }
    }

    protected final /* synthetic */ void m3885a(c cVar, Object obj) {
        long j = 1;
        MessageMsg messageMsg = (MessageMsg) obj;
        cVar.c();
        Long l = messageMsg.f5940a;
        if (l != null) {
            cVar.a(1, l.longValue());
        }
        Boolean bool = messageMsg.f5941b;
        if (bool != null) {
            long j2;
            if (bool.booleanValue()) {
                j2 = 1;
            } else {
                j2 = 0;
            }
            cVar.a(2, j2);
        }
        bool = messageMsg.f5942c;
        if (bool != null) {
            if (!bool.booleanValue()) {
                j = 0;
            }
            cVar.a(3, j);
        }
        Integer num = messageMsg.f5943d;
        if (num != null) {
            cVar.a(4, (long) num.intValue());
        }
        num = messageMsg.f5944e;
        if (num != null) {
            cVar.a(5, (long) num.intValue());
        }
        l = messageMsg.f5945f;
        if (l != null) {
            cVar.a(6, l.longValue());
        }
        l = messageMsg.f5946g;
        if (l != null) {
            cVar.a(7, l.longValue());
        }
        String str = messageMsg.f5947h;
        if (str != null) {
            cVar.a(8, str);
        }
        str = messageMsg.f5948i;
        if (str != null) {
            cVar.a(9, str);
        }
        str = messageMsg.f5949j;
        if (str != null) {
            cVar.a(10, str);
        }
        str = messageMsg.f5950k;
        if (str != null) {
            cVar.a(11, str);
        }
        str = messageMsg.f5951l;
        if (str != null) {
            cVar.a(12, str);
        }
    }

    public MessageMsgDao(org.a.a.c.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    public static void m3880a(org.a.a.a.a aVar) {
        aVar.a("CREATE TABLE " + LetterIndexBar.SEARCH_ICON_LETTER + "\"MESSAGE_MSG\" (\"_id\" INTEGER PRIMARY KEY ,\"B_READED\" INTEGER,\"B_GET_BENEFITS\" INTEGER,\"E_SYSTEM_MESSAGE_CONTENT_TYPE\" INTEGER,\"E_SYSTEM_MESSAGE_TYPE\" INTEGER,\"L_SYSTEM_MSG_ID\" INTEGER,\"L_SYSTEM_SEND_TIME\" INTEGER,\"S_SYSTEM_MSG_IMG_URL\" TEXT,\"S_SYSTEM_MSG_SUMMARY\" TEXT,\"S_SYSTEM_MSG_TITLE\" TEXT,\"S_SYSTEM_MSG_URL\" TEXT,\"S_SYSTEM_MSG_DETAIL\" TEXT);");
    }

    public final /* synthetic */ Object m3881a(Cursor cursor, int i) {
        return cursor.isNull(i + 0) ? null : Long.valueOf(cursor.getLong(i + 0));
    }

    public final /* synthetic */ Object m3886b(Cursor cursor, int i) {
        Boolean bool;
        Boolean bool2;
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
        Long valueOf4 = cursor.isNull(i + 5) ? null : Long.valueOf(cursor.getLong(i + 5));
        Long valueOf5 = cursor.isNull(i + 6) ? null : Long.valueOf(cursor.getLong(i + 6));
        String string = cursor.isNull(i + 7) ? null : cursor.getString(i + 7);
        String string2 = cursor.isNull(i + 8) ? null : cursor.getString(i + 8);
        String string3 = cursor.isNull(i + 9) ? null : cursor.getString(i + 9);
        String string4 = cursor.isNull(i + 10) ? null : cursor.getString(i + 10);
        if (cursor.isNull(i + 11)) {
            str = null;
        } else {
            str = cursor.getString(i + 11);
        }
        return new MessageMsg(valueOf, bool, bool2, valueOf2, valueOf3, valueOf4, valueOf5, string, string2, string3, string4, str);
    }
}
