package com.illuminate.texaspoker.dao;

import a.does.not.Exists2;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import com.illuminate.texaspoker.p058c.SellItem;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import org.a.a.a;
import org.a.a.a.c;
import org.a.a.f;

public class SellItemDao extends a<SellItem, Long> {
    public static final String TABLENAME = "SELL_ITEM";

    public static class Properties {
        public static final f f6393a = null;
        public static final f f6394b = null;
        public static final f f6395c = null;
        public static final f f6396d = null;
        public static final f f6397e = null;
        public static final f f6398f = null;
        public static final f f6399g = null;
        public static final f f6400h = null;
        public static final f f6401i = null;
        public static final f f6402j = null;
        public static final f f6403k = null;

        static {
            fixHelper.fixfunc(new int[]{3616, 1});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        static void __clinit__() {
            f6393a = new f(0, Long.class, "id", true, "_id");
            f6394b = new f(1, Boolean.class, "bIsNew", false, "B_IS_NEW");
            f6395c = new f(2, Integer.class, "eSellingItemType", false, "E_SELLING_ITEM_TYPE");
            f6396d = new f(3, Integer.class, "eSellingStoreUnitType", false, "E_SELLING_STORE_UNIT_TYPE");
            f6397e = new f(4, Integer.class, "iOrder", false, "I_ORDER");
            f6398f = new f(5, Integer.class, "iSellingItemCost", false, "I_SELLING_ITEM_COST");
            f6399g = new f(6, Integer.class, "iSellingItemID", false, "I_SELLING_ITEM_ID");
            f6400h = new f(7, String.class, "sSellingItemDescription", false, "S_SELLING_ITEM_DESCRIPTION");
            f6401i = new f(8, String.class, "sSellingItemIcon", false, "S_SELLING_ITEM_ICON");
            f6402j = new f(9, String.class, "sSellingItemLongDescription", false, "S_SELLING_ITEM_LONG_DESCRIPTION");
            f6403k = new f(10, String.class, "sSellingItemName", false, "S_SELLING_ITEM_NAME");
        }
    }

    protected final /* synthetic */ Object m3897a(Object obj, long j) {
        ((SellItem) obj).f5981a = Long.valueOf(j);
        return Long.valueOf(j);
    }

    protected final /* synthetic */ void m3898a(SQLiteStatement sQLiteStatement, Object obj) {
        SellItem sellItem = (SellItem) obj;
        sQLiteStatement.clearBindings();
        Long l = sellItem.f5981a;
        if (l != null) {
            sQLiteStatement.bindLong(1, l.longValue());
        }
        Boolean bool = sellItem.f5982b;
        if (bool != null) {
            long j;
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            sQLiteStatement.bindLong(2, j);
        }
        Integer num = sellItem.f5983c;
        if (num != null) {
            sQLiteStatement.bindLong(3, (long) num.intValue());
        }
        num = sellItem.f5984d;
        if (num != null) {
            sQLiteStatement.bindLong(4, (long) num.intValue());
        }
        num = sellItem.f5985e;
        if (num != null) {
            sQLiteStatement.bindLong(5, (long) num.intValue());
        }
        num = sellItem.f5986f;
        if (num != null) {
            sQLiteStatement.bindLong(6, (long) num.intValue());
        }
        num = sellItem.f5987g;
        if (num != null) {
            sQLiteStatement.bindLong(7, (long) num.intValue());
        }
        String str = sellItem.f5988h;
        if (str != null) {
            sQLiteStatement.bindString(8, str);
        }
        str = sellItem.f5989i;
        if (str != null) {
            sQLiteStatement.bindString(9, str);
        }
        str = sellItem.f5990j;
        if (str != null) {
            sQLiteStatement.bindString(10, str);
        }
        str = sellItem.f5991k;
        if (str != null) {
            sQLiteStatement.bindString(11, str);
        }
    }

    protected final /* synthetic */ void m3899a(c cVar, Object obj) {
        SellItem sellItem = (SellItem) obj;
        cVar.c();
        Long l = sellItem.f5981a;
        if (l != null) {
            cVar.a(1, l.longValue());
        }
        Boolean bool = sellItem.f5982b;
        if (bool != null) {
            long j;
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            cVar.a(2, j);
        }
        Integer num = sellItem.f5983c;
        if (num != null) {
            cVar.a(3, (long) num.intValue());
        }
        num = sellItem.f5984d;
        if (num != null) {
            cVar.a(4, (long) num.intValue());
        }
        num = sellItem.f5985e;
        if (num != null) {
            cVar.a(5, (long) num.intValue());
        }
        num = sellItem.f5986f;
        if (num != null) {
            cVar.a(6, (long) num.intValue());
        }
        num = sellItem.f5987g;
        if (num != null) {
            cVar.a(7, (long) num.intValue());
        }
        String str = sellItem.f5988h;
        if (str != null) {
            cVar.a(8, str);
        }
        str = sellItem.f5989i;
        if (str != null) {
            cVar.a(9, str);
        }
        str = sellItem.f5990j;
        if (str != null) {
            cVar.a(10, str);
        }
        str = sellItem.f5991k;
        if (str != null) {
            cVar.a(11, str);
        }
    }

    public SellItemDao(org.a.a.c.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    public static void m3894a(org.a.a.a.a aVar) {
        aVar.a("CREATE TABLE " + LetterIndexBar.SEARCH_ICON_LETTER + "\"SELL_ITEM\" (\"_id\" INTEGER PRIMARY KEY ,\"B_IS_NEW\" INTEGER,\"E_SELLING_ITEM_TYPE\" INTEGER,\"E_SELLING_STORE_UNIT_TYPE\" INTEGER,\"I_ORDER\" INTEGER,\"I_SELLING_ITEM_COST\" INTEGER,\"I_SELLING_ITEM_ID\" INTEGER,\"S_SELLING_ITEM_DESCRIPTION\" TEXT,\"S_SELLING_ITEM_ICON\" TEXT,\"S_SELLING_ITEM_LONG_DESCRIPTION\" TEXT,\"S_SELLING_ITEM_NAME\" TEXT);");
    }

    public final /* synthetic */ Object m3895a(Cursor cursor, int i) {
        return cursor.isNull(i + 0) ? null : Long.valueOf(cursor.getLong(i + 0));
    }

    public final /* synthetic */ Object m3900b(Cursor cursor, int i) {
        Boolean bool;
        String str = null;
        Long valueOf = cursor.isNull(i + 0) ? null : Long.valueOf(cursor.getLong(i + 0));
        if (cursor.isNull(i + 1)) {
            bool = null;
        } else {
            bool = Boolean.valueOf(cursor.getShort(i + 1) != (short) 0);
        }
        Integer valueOf2 = cursor.isNull(i + 2) ? null : Integer.valueOf(cursor.getInt(i + 2));
        Integer valueOf3 = cursor.isNull(i + 3) ? null : Integer.valueOf(cursor.getInt(i + 3));
        Integer valueOf4 = cursor.isNull(i + 4) ? null : Integer.valueOf(cursor.getInt(i + 4));
        Integer valueOf5 = cursor.isNull(i + 5) ? null : Integer.valueOf(cursor.getInt(i + 5));
        Integer valueOf6 = cursor.isNull(i + 6) ? null : Integer.valueOf(cursor.getInt(i + 6));
        String string = cursor.isNull(i + 7) ? null : cursor.getString(i + 7);
        String string2 = cursor.isNull(i + 8) ? null : cursor.getString(i + 8);
        String string3 = cursor.isNull(i + 9) ? null : cursor.getString(i + 9);
        if (!cursor.isNull(i + 10)) {
            str = cursor.getString(i + 10);
        }
        return new SellItem(valueOf, bool, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, string, string2, string3, str);
    }
}
