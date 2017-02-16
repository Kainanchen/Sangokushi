package net.sqlcipher.database;

import android.database.Cursor;

public interface SQLiteCursorDriver {
    void cursorClosed();

    void cursorDeactivated();

    void cursorRequeried(Cursor cursor);

    net.sqlcipher.Cursor query(SQLiteDatabase$CursorFactory sQLiteDatabase$CursorFactory, String[] strArr);

    void setBindArguments(String[] strArr);
}
