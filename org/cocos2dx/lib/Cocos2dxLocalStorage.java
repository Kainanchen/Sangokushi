package org.cocos2dx.lib;

import a.does.not.Exists0;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import android.util.Log;
import com.ali.fixHelper;

public class Cocos2dxLocalStorage {
    private static String DATABASE_NAME = null;
    private static final int DATABASE_VERSION = 1;
    private static String TABLE_NAME = null;
    private static final String TAG = "Cocos2dxLocalStorage";
    private static SQLiteDatabase mDatabase;
    private static DBOpenHelper mDatabaseOpenHelper;

    private static class DBOpenHelper extends SQLiteOpenHelper {
        static {
            fixHelper.fixfunc(new int[]{8984, 8985, 8986});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native DBOpenHelper(Context context);

        public native void onCreate(SQLiteDatabase sQLiteDatabase);

        public native void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2);
    }

    static {
        fixHelper.fixfunc(new int[]{30717, DATABASE_VERSION});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    static void __clinit__() {
        DATABASE_NAME = "jsb.sqlite";
        TABLE_NAME = "data";
        mDatabaseOpenHelper = null;
        mDatabase = null;
    }

    public static boolean init(String str, String str2) {
        if (Cocos2dxActivity.getContext() == null) {
            return false;
        }
        DATABASE_NAME = str;
        TABLE_NAME = str2;
        DBOpenHelper dBOpenHelper = new DBOpenHelper(Cocos2dxActivity.getContext());
        mDatabaseOpenHelper = dBOpenHelper;
        mDatabase = dBOpenHelper.getWritableDatabase();
        return true;
    }

    public static void destory() {
        if (mDatabase != null) {
            mDatabase.close();
        }
    }

    public static void setItem(String str, String str2) {
        try {
            String str3 = "replace into " + TABLE_NAME + "(key,value)values(?,?)";
            mDatabase.execSQL(str3, new Object[]{str, str2});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getItem(String str) {
        String str2;
        String str3 = null;
        try {
            str2 = "select value from " + TABLE_NAME + " where key=?";
            SQLiteDatabase sQLiteDatabase = mDatabase;
            String[] strArr = new String[DATABASE_VERSION];
            strArr[0] = str;
            Cursor rawQuery = sQLiteDatabase.rawQuery(str2, strArr);
            while (rawQuery.moveToNext()) {
                if (str3 != null) {
                    Log.e(TAG, "The key contains more than one value.");
                    break;
                }
                str3 = rawQuery.getString(rawQuery.getColumnIndex("value"));
            }
            rawQuery.close();
            str2 = str3;
        } catch (Exception e) {
            e.printStackTrace();
            str2 = str3;
        }
        return str2 == null ? BuildConfig.FLAVOR : str2;
    }

    public static void removeItem(String str) {
        try {
            String str2 = "delete from " + TABLE_NAME + " where key=?";
            SQLiteDatabase sQLiteDatabase = mDatabase;
            Object[] objArr = new Object[DATABASE_VERSION];
            objArr[0] = str;
            sQLiteDatabase.execSQL(str2, objArr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void clear() {
        try {
            mDatabase.execSQL("delete from " + TABLE_NAME);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
