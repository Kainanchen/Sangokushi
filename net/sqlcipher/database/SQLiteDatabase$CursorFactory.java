package net.sqlcipher.database;

import net.sqlcipher.Cursor;

public interface SQLiteDatabase$CursorFactory {
    Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery);
}
