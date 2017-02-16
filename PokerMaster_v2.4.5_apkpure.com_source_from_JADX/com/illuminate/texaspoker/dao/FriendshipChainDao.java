package com.illuminate.texaspoker.dao;

import a.does.not.Exists2;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import com.illuminate.texaspoker.p058c.FriendshipChain;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import org.a.a.a;
import org.a.a.a.c;
import org.a.a.f;

public class FriendshipChainDao extends a<FriendshipChain, Long> {
    public static final String TABLENAME = "FRIENDSHIP_CHAIN";

    public static class Properties {
        public static final f f6267a = null;
        public static final f f6268b = null;
        public static final f f6269c = null;
        public static final f f6270d = null;
        public static final f f6271e = null;
        public static final f f6272f = null;
        public static final f f6273g = null;
        public static final f f6274h = null;
        public static final f f6275i = null;
        public static final f f6276j = null;
        public static final f f6277k = null;
        public static final f f6278l = null;
        public static final f f6279m = null;

        static {
            fixHelper.fixfunc(new int[]{1809, 1});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        static void __clinit__() {
            f6267a = new f(0, Long.class, "id", true, "_id");
            f6268b = new f(1, Boolean.class, "bUploaded", false, "B_UPLOADED");
            f6269c = new f(2, Integer.class, "eOrderState", false, "E_ORDER_STATE");
            f6270d = new f(3, String.class, "firstLetter", false, "FIRST_LETTER");
            f6271e = new f(4, String.class, "strId", false, "STR_ID");
            f6272f = new f(5, String.class, "strIdMd5", false, "STR_ID_MD5");
            f6273g = new f(6, String.class, "strName", false, "STR_NAME");
            f6274h = new f(7, String.class, "strOriginal", false, "STR_ORIGINAL");
            f6275i = new f(8, String.class, "strNickName", false, "STR_NICK_NAME");
            f6276j = new f(9, String.class, "strCover", false, "STR_COVER");
            f6277k = new f(10, Integer.class, "iGender", false, "I_GENDER");
            f6278l = new f(11, Long.class, "uuid", false, "UUID");
            f6279m = new f(12, Integer.class, "fromType", false, "FROM_TYPE");
        }
    }

    protected final /* synthetic */ Object m3845a(Object obj, long j) {
        ((FriendshipChain) obj).f5848a = Long.valueOf(j);
        return Long.valueOf(j);
    }

    protected final /* synthetic */ void m3846a(SQLiteStatement sQLiteStatement, Object obj) {
        FriendshipChain friendshipChain = (FriendshipChain) obj;
        sQLiteStatement.clearBindings();
        Long l = friendshipChain.f5848a;
        if (l != null) {
            sQLiteStatement.bindLong(1, l.longValue());
        }
        Boolean bool = friendshipChain.f5849b;
        if (bool != null) {
            long j;
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            sQLiteStatement.bindLong(2, j);
        }
        Integer num = friendshipChain.f5850c;
        if (num != null) {
            sQLiteStatement.bindLong(3, (long) num.intValue());
        }
        String str = friendshipChain.f5851d;
        if (str != null) {
            sQLiteStatement.bindString(4, str);
        }
        str = friendshipChain.f5852e;
        if (str != null) {
            sQLiteStatement.bindString(5, str);
        }
        str = friendshipChain.f5853f;
        if (str != null) {
            sQLiteStatement.bindString(6, str);
        }
        str = friendshipChain.f5854g;
        if (str != null) {
            sQLiteStatement.bindString(7, str);
        }
        str = friendshipChain.f5855h;
        if (str != null) {
            sQLiteStatement.bindString(8, str);
        }
        str = friendshipChain.f5856i;
        if (str != null) {
            sQLiteStatement.bindString(9, str);
        }
        str = friendshipChain.f5857j;
        if (str != null) {
            sQLiteStatement.bindString(10, str);
        }
        num = friendshipChain.f5858k;
        if (num != null) {
            sQLiteStatement.bindLong(11, (long) num.intValue());
        }
        l = friendshipChain.f5859l;
        if (l != null) {
            sQLiteStatement.bindLong(12, l.longValue());
        }
        num = friendshipChain.f5860m;
        if (num != null) {
            sQLiteStatement.bindLong(13, (long) num.intValue());
        }
    }

    protected final /* synthetic */ void m3847a(c cVar, Object obj) {
        FriendshipChain friendshipChain = (FriendshipChain) obj;
        cVar.c();
        Long l = friendshipChain.f5848a;
        if (l != null) {
            cVar.a(1, l.longValue());
        }
        Boolean bool = friendshipChain.f5849b;
        if (bool != null) {
            long j;
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            cVar.a(2, j);
        }
        Integer num = friendshipChain.f5850c;
        if (num != null) {
            cVar.a(3, (long) num.intValue());
        }
        String str = friendshipChain.f5851d;
        if (str != null) {
            cVar.a(4, str);
        }
        str = friendshipChain.f5852e;
        if (str != null) {
            cVar.a(5, str);
        }
        str = friendshipChain.f5853f;
        if (str != null) {
            cVar.a(6, str);
        }
        str = friendshipChain.f5854g;
        if (str != null) {
            cVar.a(7, str);
        }
        str = friendshipChain.f5855h;
        if (str != null) {
            cVar.a(8, str);
        }
        str = friendshipChain.f5856i;
        if (str != null) {
            cVar.a(9, str);
        }
        str = friendshipChain.f5857j;
        if (str != null) {
            cVar.a(10, str);
        }
        num = friendshipChain.f5858k;
        if (num != null) {
            cVar.a(11, (long) num.intValue());
        }
        l = friendshipChain.f5859l;
        if (l != null) {
            cVar.a(12, l.longValue());
        }
        num = friendshipChain.f5860m;
        if (num != null) {
            cVar.a(13, (long) num.intValue());
        }
    }

    public FriendshipChainDao(org.a.a.c.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    public static void m3842a(org.a.a.a.a aVar) {
        aVar.a("CREATE TABLE " + LetterIndexBar.SEARCH_ICON_LETTER + "\"FRIENDSHIP_CHAIN\" (\"_id\" INTEGER PRIMARY KEY ,\"B_UPLOADED\" INTEGER,\"E_ORDER_STATE\" INTEGER,\"FIRST_LETTER\" TEXT,\"STR_ID\" TEXT,\"STR_ID_MD5\" TEXT,\"STR_NAME\" TEXT,\"STR_ORIGINAL\" TEXT,\"STR_NICK_NAME\" TEXT,\"STR_COVER\" TEXT,\"I_GENDER\" INTEGER,\"UUID\" INTEGER,\"FROM_TYPE\" INTEGER);");
    }

    public final /* synthetic */ Object m3843a(Cursor cursor, int i) {
        return cursor.isNull(i + 0) ? null : Long.valueOf(cursor.getLong(i + 0));
    }

    public final /* synthetic */ Object m3848b(Cursor cursor, int i) {
        Boolean bool;
        Integer num;
        Long valueOf = cursor.isNull(i + 0) ? null : Long.valueOf(cursor.getLong(i + 0));
        if (cursor.isNull(i + 1)) {
            bool = null;
        } else {
            bool = Boolean.valueOf(cursor.getShort(i + 1) != (short) 0);
        }
        Integer valueOf2 = cursor.isNull(i + 2) ? null : Integer.valueOf(cursor.getInt(i + 2));
        String string = cursor.isNull(i + 3) ? null : cursor.getString(i + 3);
        String string2 = cursor.isNull(i + 4) ? null : cursor.getString(i + 4);
        String string3 = cursor.isNull(i + 5) ? null : cursor.getString(i + 5);
        String string4 = cursor.isNull(i + 6) ? null : cursor.getString(i + 6);
        String string5 = cursor.isNull(i + 7) ? null : cursor.getString(i + 7);
        String string6 = cursor.isNull(i + 8) ? null : cursor.getString(i + 8);
        String string7 = cursor.isNull(i + 9) ? null : cursor.getString(i + 9);
        Integer valueOf3 = cursor.isNull(i + 10) ? null : Integer.valueOf(cursor.getInt(i + 10));
        Long valueOf4 = cursor.isNull(i + 11) ? null : Long.valueOf(cursor.getLong(i + 11));
        if (cursor.isNull(i + 12)) {
            num = null;
        } else {
            num = Integer.valueOf(cursor.getInt(i + 12));
        }
        return new FriendshipChain(valueOf, bool, valueOf2, string, string2, string3, string4, string5, string6, string7, valueOf3, valueOf4, num);
    }
}
