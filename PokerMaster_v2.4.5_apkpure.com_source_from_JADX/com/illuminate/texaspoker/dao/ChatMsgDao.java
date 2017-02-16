package com.illuminate.texaspoker.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.illuminate.texaspoker.p058c.ChatMsg;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import org.a.a.a;
import org.a.a.a.c;
import org.a.a.f;

public class ChatMsgDao extends a<ChatMsg, Long> {
    public static final String TABLENAME = "CHAT_MSG";
    private DaoSession f6142a;

    public static class Properties {
        public static final f f6119a;
        public static final f f6120b;
        public static final f f6121c;
        public static final f f6122d;
        public static final f f6123e;
        public static final f f6124f;
        public static final f f6125g;
        public static final f f6126h;
        public static final f f6127i;
        public static final f f6128j;
        public static final f f6129k;
        public static final f f6130l;
        public static final f f6131m;
        public static final f f6132n;
        public static final f f6133o;
        public static final f f6134p;
        public static final f f6135q;
        public static final f f6136r;
        public static final f f6137s;
        public static final f f6138t;
        public static final f f6139u;
        public static final f f6140v;
        public static final f f6141w;

        static {
            f6119a = new f(0, Long.class, "id", true, "_id");
            f6120b = new f(1, Long.class, "lMsgID", false, "L_MSG_ID");
            f6121c = new f(2, String.class, "sMsgContent", false, "S_MSG_CONTENT");
            f6122d = new f(3, String.class, "strObjcontentOne", false, "STR_OBJCONTENT_ONE");
            f6123e = new f(4, String.class, "strPicUrl", false, "STR_PIC_URL");
            f6124f = new f(5, String.class, "strSmallPicUrl", false, "STR_SMALL_PIC_URL");
            f6125g = new f(6, String.class, "strUrlDesc", false, "STR_URL_DESC");
            f6126h = new f(7, String.class, "strUrlPicUrl", false, "STR_URL_PIC_URL");
            f6127i = new f(8, String.class, "strUrlTitle", false, "STR_URL_TITLE");
            f6128j = new f(9, String.class, "strUrlUrl", false, "STR_URL_URL");
            f6129k = new f(10, Long.class, "lObjId", false, "L_OBJ_ID");
            f6130l = new f(11, Long.class, "lToUuid", false, "L_TO_UUID");
            f6131m = new f(12, Long.class, "fromUserId", false, "FROM_USER_ID");
            f6132n = new f(13, Long.class, "lFromUserUuid", false, "L_FROM_USER_UUID");
            f6133o = new f(14, Long.class, "lDuration", false, "L_DURATION");
            f6134p = new f(15, Long.class, "lCreateTime", false, "L_CREATE_TIME");
            f6135q = new f(16, Integer.class, "eChatMessageType", false, "E_CHAT_MESSAGE_TYPE");
            f6136r = new f(17, Integer.class, "eTalkType", false, "E_TALK_TYPE");
            f6137s = new f(18, Integer.class, "iPlayed", false, "I_PLAYED");
            f6138t = new f(19, Integer.class, "iStatus", false, "I_STATUS");
            f6139u = new f(20, String.class, "gameType", false, "GAME_TYPE");
            f6140v = new f(21, String.class, "gameCreateName", false, "GAME_CREATE_NAME");
            f6141w = new f(22, String.class, "gameRoomName", false, "GAME_ROOM_NAME");
        }
    }

    protected final /* synthetic */ Object m3775a(Object obj, long j) {
        ((ChatMsg) obj).f5688a = Long.valueOf(j);
        return Long.valueOf(j);
    }

    protected final /* synthetic */ void m3776a(SQLiteStatement sQLiteStatement, Object obj) {
        ChatMsg chatMsg = (ChatMsg) obj;
        sQLiteStatement.clearBindings();
        Long l = chatMsg.f5688a;
        if (l != null) {
            sQLiteStatement.bindLong(1, l.longValue());
        }
        l = chatMsg.f5689b;
        if (l != null) {
            sQLiteStatement.bindLong(2, l.longValue());
        }
        String str = chatMsg.f5690c;
        if (str != null) {
            sQLiteStatement.bindString(3, str);
        }
        str = chatMsg.f5691d;
        if (str != null) {
            sQLiteStatement.bindString(4, str);
        }
        str = chatMsg.f5692e;
        if (str != null) {
            sQLiteStatement.bindString(5, str);
        }
        str = chatMsg.f5693f;
        if (str != null) {
            sQLiteStatement.bindString(6, str);
        }
        str = chatMsg.f5694g;
        if (str != null) {
            sQLiteStatement.bindString(7, str);
        }
        str = chatMsg.f5695h;
        if (str != null) {
            sQLiteStatement.bindString(8, str);
        }
        str = chatMsg.f5696i;
        if (str != null) {
            sQLiteStatement.bindString(9, str);
        }
        str = chatMsg.f5697j;
        if (str != null) {
            sQLiteStatement.bindString(10, str);
        }
        l = chatMsg.f5698k;
        if (l != null) {
            sQLiteStatement.bindLong(11, l.longValue());
        }
        l = chatMsg.f5699l;
        if (l != null) {
            sQLiteStatement.bindLong(12, l.longValue());
        }
        l = chatMsg.f5700m;
        if (l != null) {
            sQLiteStatement.bindLong(13, l.longValue());
        }
        l = chatMsg.f5701n;
        if (l != null) {
            sQLiteStatement.bindLong(14, l.longValue());
        }
        l = chatMsg.f5702o;
        if (l != null) {
            sQLiteStatement.bindLong(15, l.longValue());
        }
        l = chatMsg.f5703p;
        if (l != null) {
            sQLiteStatement.bindLong(16, l.longValue());
        }
        Integer num = chatMsg.f5704q;
        if (num != null) {
            sQLiteStatement.bindLong(17, (long) num.intValue());
        }
        num = chatMsg.f5705r;
        if (num != null) {
            sQLiteStatement.bindLong(18, (long) num.intValue());
        }
        num = chatMsg.f5706s;
        if (num != null) {
            sQLiteStatement.bindLong(19, (long) num.intValue());
        }
        num = chatMsg.f5707t;
        if (num != null) {
            sQLiteStatement.bindLong(20, (long) num.intValue());
        }
        str = chatMsg.f5708u;
        if (str != null) {
            sQLiteStatement.bindString(21, str);
        }
        str = chatMsg.f5709v;
        if (str != null) {
            sQLiteStatement.bindString(22, str);
        }
        str = chatMsg.f5710w;
        if (str != null) {
            sQLiteStatement.bindString(23, str);
        }
    }

    protected final /* synthetic */ void m3777a(c cVar, Object obj) {
        ChatMsg chatMsg = (ChatMsg) obj;
        cVar.c();
        Long l = chatMsg.f5688a;
        if (l != null) {
            cVar.a(1, l.longValue());
        }
        l = chatMsg.f5689b;
        if (l != null) {
            cVar.a(2, l.longValue());
        }
        String str = chatMsg.f5690c;
        if (str != null) {
            cVar.a(3, str);
        }
        str = chatMsg.f5691d;
        if (str != null) {
            cVar.a(4, str);
        }
        str = chatMsg.f5692e;
        if (str != null) {
            cVar.a(5, str);
        }
        str = chatMsg.f5693f;
        if (str != null) {
            cVar.a(6, str);
        }
        str = chatMsg.f5694g;
        if (str != null) {
            cVar.a(7, str);
        }
        str = chatMsg.f5695h;
        if (str != null) {
            cVar.a(8, str);
        }
        str = chatMsg.f5696i;
        if (str != null) {
            cVar.a(9, str);
        }
        str = chatMsg.f5697j;
        if (str != null) {
            cVar.a(10, str);
        }
        l = chatMsg.f5698k;
        if (l != null) {
            cVar.a(11, l.longValue());
        }
        l = chatMsg.f5699l;
        if (l != null) {
            cVar.a(12, l.longValue());
        }
        l = chatMsg.f5700m;
        if (l != null) {
            cVar.a(13, l.longValue());
        }
        l = chatMsg.f5701n;
        if (l != null) {
            cVar.a(14, l.longValue());
        }
        l = chatMsg.f5702o;
        if (l != null) {
            cVar.a(15, l.longValue());
        }
        l = chatMsg.f5703p;
        if (l != null) {
            cVar.a(16, l.longValue());
        }
        Integer num = chatMsg.f5704q;
        if (num != null) {
            cVar.a(17, (long) num.intValue());
        }
        num = chatMsg.f5705r;
        if (num != null) {
            cVar.a(18, (long) num.intValue());
        }
        num = chatMsg.f5706s;
        if (num != null) {
            cVar.a(19, (long) num.intValue());
        }
        num = chatMsg.f5707t;
        if (num != null) {
            cVar.a(20, (long) num.intValue());
        }
        str = chatMsg.f5708u;
        if (str != null) {
            cVar.a(21, str);
        }
        str = chatMsg.f5709v;
        if (str != null) {
            cVar.a(22, str);
        }
        str = chatMsg.f5710w;
        if (str != null) {
            cVar.a(23, str);
        }
    }

    protected final /* bridge */ /* synthetic */ void m3779b(Object obj) {
        ChatMsgDao chatMsgDao;
        ChatMsg chatMsg = (ChatMsg) obj;
        super.b(chatMsg);
        DaoSession daoSession = this.f6142a;
        chatMsg.f5711x = daoSession;
        if (daoSession != null) {
            chatMsgDao = daoSession.f6469z;
        } else {
            chatMsgDao = null;
        }
        chatMsg.f5712y = chatMsgDao;
    }

    public ChatMsgDao(org.a.a.c.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
        this.f6142a = daoSession;
    }

    public static void m3772a(org.a.a.a.a aVar) {
        aVar.a("CREATE TABLE " + LetterIndexBar.SEARCH_ICON_LETTER + "\"CHAT_MSG\" (\"_id\" INTEGER PRIMARY KEY ,\"L_MSG_ID\" INTEGER,\"S_MSG_CONTENT\" TEXT,\"STR_OBJCONTENT_ONE\" TEXT,\"STR_PIC_URL\" TEXT,\"STR_SMALL_PIC_URL\" TEXT,\"STR_URL_DESC\" TEXT,\"STR_URL_PIC_URL\" TEXT,\"STR_URL_TITLE\" TEXT,\"STR_URL_URL\" TEXT,\"L_OBJ_ID\" INTEGER,\"L_TO_UUID\" INTEGER,\"FROM_USER_ID\" INTEGER,\"L_FROM_USER_UUID\" INTEGER,\"L_DURATION\" INTEGER,\"L_CREATE_TIME\" INTEGER,\"E_CHAT_MESSAGE_TYPE\" INTEGER,\"E_TALK_TYPE\" INTEGER,\"I_PLAYED\" INTEGER,\"I_STATUS\" INTEGER,\"GAME_TYPE\" TEXT,\"GAME_CREATE_NAME\" TEXT,\"GAME_ROOM_NAME\" TEXT);");
    }

    public final /* synthetic */ Object m3773a(Cursor cursor, int i) {
        return cursor.isNull(i + 0) ? null : Long.valueOf(cursor.getLong(i + 0));
    }

    public final /* synthetic */ Object m3778b(Cursor cursor, int i) {
        Long l;
        Long l2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Long l3;
        Long l4;
        Long l5;
        Long l6;
        Long l7;
        Long l8;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        String str9;
        String str10;
        String str11;
        if (cursor.isNull(i + 0)) {
            l = null;
        } else {
            l = Long.valueOf(cursor.getLong(i + 0));
        }
        if (cursor.isNull(i + 1)) {
            l2 = null;
        } else {
            l2 = Long.valueOf(cursor.getLong(i + 1));
        }
        if (cursor.isNull(i + 2)) {
            str = null;
        } else {
            str = cursor.getString(i + 2);
        }
        if (cursor.isNull(i + 3)) {
            str2 = null;
        } else {
            str2 = cursor.getString(i + 3);
        }
        if (cursor.isNull(i + 4)) {
            str3 = null;
        } else {
            str3 = cursor.getString(i + 4);
        }
        if (cursor.isNull(i + 5)) {
            str4 = null;
        } else {
            str4 = cursor.getString(i + 5);
        }
        if (cursor.isNull(i + 6)) {
            str5 = null;
        } else {
            str5 = cursor.getString(i + 6);
        }
        if (cursor.isNull(i + 7)) {
            str6 = null;
        } else {
            str6 = cursor.getString(i + 7);
        }
        if (cursor.isNull(i + 8)) {
            str7 = null;
        } else {
            str7 = cursor.getString(i + 8);
        }
        if (cursor.isNull(i + 9)) {
            str8 = null;
        } else {
            str8 = cursor.getString(i + 9);
        }
        if (cursor.isNull(i + 10)) {
            l3 = null;
        } else {
            l3 = Long.valueOf(cursor.getLong(i + 10));
        }
        if (cursor.isNull(i + 11)) {
            l4 = null;
        } else {
            l4 = Long.valueOf(cursor.getLong(i + 11));
        }
        if (cursor.isNull(i + 12)) {
            l5 = null;
        } else {
            l5 = Long.valueOf(cursor.getLong(i + 12));
        }
        if (cursor.isNull(i + 13)) {
            l6 = null;
        } else {
            l6 = Long.valueOf(cursor.getLong(i + 13));
        }
        if (cursor.isNull(i + 14)) {
            l7 = null;
        } else {
            l7 = Long.valueOf(cursor.getLong(i + 14));
        }
        if (cursor.isNull(i + 15)) {
            l8 = null;
        } else {
            l8 = Long.valueOf(cursor.getLong(i + 15));
        }
        if (cursor.isNull(i + 16)) {
            num = null;
        } else {
            num = Integer.valueOf(cursor.getInt(i + 16));
        }
        if (cursor.isNull(i + 17)) {
            num2 = null;
        } else {
            num2 = Integer.valueOf(cursor.getInt(i + 17));
        }
        if (cursor.isNull(i + 18)) {
            num3 = null;
        } else {
            num3 = Integer.valueOf(cursor.getInt(i + 18));
        }
        if (cursor.isNull(i + 19)) {
            num4 = null;
        } else {
            num4 = Integer.valueOf(cursor.getInt(i + 19));
        }
        if (cursor.isNull(i + 20)) {
            str9 = null;
        } else {
            str9 = cursor.getString(i + 20);
        }
        if (cursor.isNull(i + 21)) {
            str10 = null;
        } else {
            str10 = cursor.getString(i + 21);
        }
        if (cursor.isNull(i + 22)) {
            str11 = null;
        } else {
            str11 = cursor.getString(i + 22);
        }
        return new ChatMsg(l, l2, str, str2, str3, str4, str5, str6, str7, str8, l3, l4, l5, l6, l7, l8, num, num2, num3, num4, str9, str10, str11);
    }
}
