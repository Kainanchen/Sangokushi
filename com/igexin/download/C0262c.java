package com.igexin.download;

import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.CursorWrapper;

/* renamed from: com.igexin.download.c */
class C0262c extends CursorWrapper implements CrossProcessCursor {
    final /* synthetic */ DownloadProvider f709a;
    private CrossProcessCursor f710b;

    public C0262c(DownloadProvider downloadProvider, Cursor cursor) {
        this.f709a = downloadProvider;
        super(cursor);
        this.f710b = (CrossProcessCursor) cursor;
    }

    public void fillWindow(int i, CursorWindow cursorWindow) {
        this.f710b.fillWindow(i, cursorWindow);
    }

    public CursorWindow getWindow() {
        return this.f710b.getWindow();
    }

    public boolean onMove(int i, int i2) {
        return this.f710b.onMove(i, i2);
    }
}
