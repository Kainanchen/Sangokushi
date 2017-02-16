package com.illuminate.texaspoker.utils;

import a.does.not.Exists2;
import android.content.AsyncQueryHandler;
import android.content.ContentResolver;
import android.database.Cursor;
import android.os.Build.VERSION;
import com.ali.fixHelper;

/* renamed from: com.illuminate.texaspoker.utils.a */
public final class AddressBookAsyncQueryHandler extends AsyncQueryHandler {
    static {
        fixHelper.fixfunc(new int[]{926, 927});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    public native AddressBookAsyncQueryHandler(ContentResolver contentResolver);

    protected final native void onQueryComplete(int i, Object obj, Cursor cursor);
}
