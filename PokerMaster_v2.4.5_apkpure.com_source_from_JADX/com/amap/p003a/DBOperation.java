package com.amap.p003a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;
import android.text.TextUtils;
import com.amap.p003a.DB.DB;
import com.texaspoker.moment.TexasPoker.QuickGameRoomPushMsg;
import com.texaspoker.moment.TexasPoker.SCGameActionRsp;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.amap.a.d */
public final class DBOperation {
    private static Map<Class<? extends DBCreator>, DBCreator> f676d;
    private DB f677a;
    private SQLiteDatabase f678b;
    private DBCreator f679c;

    static {
        f676d = new HashMap();
    }

    public DBOperation(Context context, DBCreator dBCreator) {
        try {
            this.f677a = new DB(context.getApplicationContext(), dBCreator.m358a(), dBCreator);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.f679c = dBCreator;
    }

    public DBOperation(Context context, DBCreator dBCreator, String str) {
        try {
            boolean equals = "mounted".equals(Environment.getExternalStorageState());
            if (!TextUtils.isEmpty(str) && equals) {
                context = new DB(context.getApplicationContext(), str);
            }
            this.f677a = new DB(context, dBCreator.m358a(), dBCreator);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.f679c = dBCreator;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ContentValues m672a(java.lang.Object r8, com.amap.p003a.EntityClass r9) {
        /*
        r3 = new android.content.ContentValues;
        r3.<init>();
        r0 = r8.getClass();
        r1 = r9.m687b();
        r4 = com.amap.p003a.DBOperation.m679a(r0, r1);
        r5 = r4.length;
        r0 = 0;
        r2 = r0;
    L_0x0014:
        if (r2 >= r5) goto L_0x00a5;
    L_0x0016:
        r1 = r4[r2];
        r0 = 1;
        r1.setAccessible(r0);
        r0 = com.amap.p003a.EntityField.class;
        r0 = r1.getAnnotation(r0);
        if (r0 == 0) goto L_0x002d;
    L_0x0024:
        r0 = (com.amap.p003a.EntityField) r0;
        r6 = r0.m689b();
        switch(r6) {
            case 1: goto L_0x0046;
            case 2: goto L_0x0031;
            case 3: goto L_0x0084;
            case 4: goto L_0x0066;
            case 5: goto L_0x0056;
            case 6: goto L_0x0076;
            case 7: goto L_0x0094;
            default: goto L_0x002d;
        };
    L_0x002d:
        r0 = r2 + 1;
        r2 = r0;
        goto L_0x0014;
    L_0x0031:
        r1 = r1.getInt(r8);	 Catch:{ IllegalAccessException -> 0x0041 }
        r0 = r0.m688a();	 Catch:{ IllegalAccessException -> 0x0041 }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ IllegalAccessException -> 0x0041 }
        r3.put(r0, r1);	 Catch:{ IllegalAccessException -> 0x0041 }
        goto L_0x002d;
    L_0x0041:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x002d;
    L_0x0046:
        r1 = r1.getShort(r8);	 Catch:{ IllegalAccessException -> 0x0041 }
        r0 = r0.m688a();	 Catch:{ IllegalAccessException -> 0x0041 }
        r1 = java.lang.Short.valueOf(r1);	 Catch:{ IllegalAccessException -> 0x0041 }
        r3.put(r0, r1);	 Catch:{ IllegalAccessException -> 0x0041 }
        goto L_0x002d;
    L_0x0056:
        r6 = r1.getLong(r8);	 Catch:{ IllegalAccessException -> 0x0041 }
        r0 = r0.m688a();	 Catch:{ IllegalAccessException -> 0x0041 }
        r1 = java.lang.Long.valueOf(r6);	 Catch:{ IllegalAccessException -> 0x0041 }
        r3.put(r0, r1);	 Catch:{ IllegalAccessException -> 0x0041 }
        goto L_0x002d;
    L_0x0066:
        r6 = r1.getDouble(r8);	 Catch:{ IllegalAccessException -> 0x0041 }
        r0 = r0.m688a();	 Catch:{ IllegalAccessException -> 0x0041 }
        r1 = java.lang.Double.valueOf(r6);	 Catch:{ IllegalAccessException -> 0x0041 }
        r3.put(r0, r1);	 Catch:{ IllegalAccessException -> 0x0041 }
        goto L_0x002d;
    L_0x0076:
        r1 = r1.get(r8);	 Catch:{ IllegalAccessException -> 0x0041 }
        r1 = (java.lang.String) r1;	 Catch:{ IllegalAccessException -> 0x0041 }
        r0 = r0.m688a();	 Catch:{ IllegalAccessException -> 0x0041 }
        r3.put(r0, r1);	 Catch:{ IllegalAccessException -> 0x0041 }
        goto L_0x002d;
    L_0x0084:
        r1 = r1.getFloat(r8);	 Catch:{ IllegalAccessException -> 0x0041 }
        r0 = r0.m688a();	 Catch:{ IllegalAccessException -> 0x0041 }
        r1 = java.lang.Float.valueOf(r1);	 Catch:{ IllegalAccessException -> 0x0041 }
        r3.put(r0, r1);	 Catch:{ IllegalAccessException -> 0x0041 }
        goto L_0x002d;
    L_0x0094:
        r1 = r1.get(r8);	 Catch:{ IllegalAccessException -> 0x0041 }
        r1 = (byte[]) r1;	 Catch:{ IllegalAccessException -> 0x0041 }
        r1 = (byte[]) r1;	 Catch:{ IllegalAccessException -> 0x0041 }
        r0 = r0.m688a();	 Catch:{ IllegalAccessException -> 0x0041 }
        r3.put(r0, r1);	 Catch:{ IllegalAccessException -> 0x0041 }
        goto L_0x002d;
    L_0x00a5:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.a.d.a(java.lang.Object, com.amap.a.e):android.content.ContentValues");
    }

    private SQLiteDatabase m673a() {
        try {
            if (this.f678b == null || this.f678b.isReadOnly()) {
                if (this.f678b != null) {
                    this.f678b.close();
                }
                this.f678b = this.f677a.getWritableDatabase();
            }
        } catch (Throwable th) {
            cm.m637a(th, "DBOperation", "getWriteDatabase");
        }
        return this.f678b;
    }

    private SQLiteDatabase m674a(boolean z) {
        try {
            if (this.f678b == null) {
                this.f678b = this.f677a.getReadableDatabase();
            }
        } catch (Throwable th) {
            if (z) {
                th.printStackTrace();
            } else {
                cm.m637a(th, "DBOperation", "getReadAbleDataBase");
            }
        }
        return this.f678b;
    }

    public static synchronized DBCreator m675a(Class<? extends DBCreator> cls) {
        DBCreator dBCreator;
        synchronized (DBOperation.class) {
            if (f676d.get(cls) == null) {
                f676d.put(cls, cls.newInstance());
            }
            dBCreator = (DBCreator) f676d.get(cls);
        }
        return dBCreator;
    }

    private static <T> T m676a(Cursor cursor, Class<T> cls, EntityClass entityClass) {
        Field[] a = DBOperation.m679a((Class) cls, entityClass.m687b());
        Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
        declaredConstructor.setAccessible(true);
        T newInstance = declaredConstructor.newInstance(new Object[0]);
        for (Field field : a) {
            field.setAccessible(true);
            Annotation annotation = field.getAnnotation(EntityField.class);
            if (annotation != null) {
                EntityField entityField = (EntityField) annotation;
                int b = entityField.m689b();
                int columnIndex = cursor.getColumnIndex(entityField.m688a());
                switch (b) {
                    case net.sqlcipher.database.SQLiteDatabase.OPEN_READONLY /*1*/:
                        field.set(newInstance, Short.valueOf(cursor.getShort(columnIndex)));
                        break;
                    case net.sqlcipher.database.SQLiteDatabase.CONFLICT_ABORT /*2*/:
                        field.set(newInstance, Integer.valueOf(cursor.getInt(columnIndex)));
                        break;
                    case net.sqlcipher.database.SQLiteDatabase.CONFLICT_FAIL /*3*/:
                        field.set(newInstance, Float.valueOf(cursor.getFloat(columnIndex)));
                        break;
                    case net.sqlcipher.database.SQLiteDatabase.CONFLICT_IGNORE /*4*/:
                        field.set(newInstance, Double.valueOf(cursor.getDouble(columnIndex)));
                        break;
                    case net.sqlcipher.database.SQLiteDatabase.CONFLICT_REPLACE /*5*/:
                        field.set(newInstance, Long.valueOf(cursor.getLong(columnIndex)));
                        break;
                    case SCGameActionRsp.LBETTINGID_FIELD_NUMBER /*6*/:
                        field.set(newInstance, cursor.getString(columnIndex));
                        break;
                    case QuickGameRoomPushMsg.STFROMUSER_FIELD_NUMBER /*7*/:
                        field.set(newInstance, cursor.getBlob(columnIndex));
                        break;
                    default:
                        break;
                }
            }
        }
        return newInstance;
    }

    private static <T> String m677a(EntityClass entityClass) {
        return entityClass == null ? null : entityClass.m686a();
    }

    public static String m678a(Map<String, String> map) {
        StringBuilder stringBuilder = new StringBuilder();
        Object obj = 1;
        for (String str : map.keySet()) {
            if (obj != null) {
                stringBuilder.append(str).append(" = '").append((String) map.get(str)).append("'");
                obj = null;
            } else {
                stringBuilder.append(" and ").append(str).append(" = '").append((String) map.get(str)).append("'");
            }
        }
        return stringBuilder.toString();
    }

    private static Field[] m679a(Class<?> cls, boolean z) {
        return cls == null ? null : z ? cls.getSuperclass().getDeclaredFields() : cls.getDeclaredFields();
    }

    private static <T> EntityClass m680b(Class<T> cls) {
        Annotation annotation = cls.getAnnotation(EntityClass.class);
        return (annotation != null ? 1 : null) == null ? null : (EntityClass) annotation;
    }

    public final <T> List<T> m681a(String str, Class<T> cls, boolean z) {
        Cursor query;
        Throwable th;
        synchronized (this.f679c) {
            List<T> arrayList = new ArrayList();
            EntityClass b = DBOperation.m680b(cls);
            Object a = DBOperation.m677a(b);
            if (this.f678b == null) {
                this.f678b = m674a(z);
            }
            if (this.f678b == null || TextUtils.isEmpty(a) || str == null) {
                return arrayList;
            }
            try {
                query = this.f678b.query(a, null, str, null, null, null, null);
                if (query == null) {
                    try {
                        this.f678b.close();
                        this.f678b = null;
                        if (query != null) {
                            try {
                                query.close();
                            } catch (Throwable th2) {
                                if (!z) {
                                    cm.m637a(th2, "DataBase", "searchListData");
                                }
                            }
                        }
                        try {
                            if (this.f678b != null) {
                                this.f678b.close();
                                this.f678b = null;
                            }
                        } catch (Throwable th22) {
                            if (!z) {
                                cm.m637a(th22, "DataBase", "searchListData");
                            }
                        }
                        return arrayList;
                    } catch (Throwable th3) {
                        th22 = th3;
                    }
                } else {
                    while (query.moveToNext()) {
                        arrayList.add(DBOperation.m676a(query, (Class) cls, b));
                    }
                    if (query != null) {
                        try {
                            query.close();
                        } catch (Throwable th222) {
                            if (!z) {
                                cm.m637a(th222, "DataBase", "searchListData");
                            }
                        }
                    }
                    try {
                        if (this.f678b != null) {
                            this.f678b.close();
                            this.f678b = null;
                        }
                    } catch (Throwable th2222) {
                        if (!z) {
                            cm.m637a(th2222, "DataBase", "searchListData");
                        }
                    }
                    return arrayList;
                }
            } catch (Throwable th4) {
                th2222 = th4;
                query = null;
                if (query != null) {
                    query.close();
                }
                if (this.f678b != null) {
                    this.f678b.close();
                    this.f678b = null;
                }
                throw th2222;
            }
        }
    }

    public final <T> void m682a(T t) {
        synchronized (this.f679c) {
            this.f678b = m673a();
            if (this.f678b == null) {
                return;
            }
            try {
                SQLiteDatabase sQLiteDatabase = this.f678b;
                EntityClass b = DBOperation.m680b(t.getClass());
                Object a = DBOperation.m677a(b);
                if (!(TextUtils.isEmpty(a) || t == null || sQLiteDatabase == null)) {
                    sQLiteDatabase.insert(a, null, DBOperation.m672a((Object) t, b));
                }
                if (this.f678b != null) {
                    this.f678b.close();
                    this.f678b = null;
                }
            } catch (Throwable th) {
                if (this.f678b != null) {
                    this.f678b.close();
                    this.f678b = null;
                }
            }
        }
    }

    public final void m683a(Object obj, String str) {
        synchronized (this.f679c) {
            if (m681a(str, obj.getClass(), false).size() == 0) {
                m682a(obj);
            } else {
                m685a(str, obj, false);
            }
        }
    }

    public final <T> void m684a(String str, Class<T> cls) {
        synchronized (this.f679c) {
            Object a = DBOperation.m677a(DBOperation.m680b(cls));
            if (TextUtils.isEmpty(a)) {
                return;
            }
            this.f678b = m673a();
            if (this.f678b == null) {
                return;
            }
            try {
                this.f678b.delete(a, str, null);
                if (this.f678b != null) {
                    this.f678b.close();
                    this.f678b = null;
                }
            } catch (Throwable th) {
                if (this.f678b != null) {
                    this.f678b.close();
                    this.f678b = null;
                }
            }
        }
    }

    public final <T> void m685a(String str, Object obj, boolean z) {
        synchronized (this.f679c) {
            if (obj == null) {
                return;
            }
            EntityClass b = DBOperation.m680b(obj.getClass());
            Object a = DBOperation.m677a(b);
            if (TextUtils.isEmpty(a)) {
                return;
            }
            ContentValues a2 = DBOperation.m672a(obj, b);
            this.f678b = m673a();
            if (this.f678b == null) {
                return;
            }
            try {
                this.f678b.update(a, a2, str, null);
                if (this.f678b != null) {
                    this.f678b.close();
                    this.f678b = null;
                }
            } catch (Throwable th) {
                if (this.f678b != null) {
                    this.f678b.close();
                    this.f678b = null;
                }
            }
            return;
        }
    }
}
