package com.alipay.sdk.util;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.alipay.sdk.cons.C0165a;
import com.tencent.open.SocialConstants;

/* renamed from: com.alipay.sdk.util.k */
public final class C0204k {
    private static final String f520a = "content://com.alipay.android.app.settings.data.ServerProvider/current_server";

    public static String m671a(Context context) {
        if (context == null) {
            return C0165a.f335a;
        }
        String str = C0165a.f335a;
        if (TextUtils.isEmpty(str)) {
            return C0165a.f335a;
        }
        return str;
    }

    private static String m672b(Context context) {
        String str = null;
        Cursor query = context.getContentResolver().query(Uri.parse(f520a), null, null, null, null);
        if (query != null && query.getCount() > 0) {
            if (query.moveToFirst()) {
                str = query.getString(query.getColumnIndex(SocialConstants.PARAM_URL));
            }
            query.close();
        }
        return str;
    }
}
