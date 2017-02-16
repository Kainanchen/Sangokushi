package com.facebook.common.p021l;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore.Images.Media;
import com.sina.weibo.sdk.component.ShareRequestParam;
import com.tencent.android.tpush.common.MessageKey;
import javax.annotation.Nullable;

/* renamed from: com.facebook.common.l.e */
public final class UriUtil {
    private static final String f1157a;

    static {
        f1157a = Uri.withAppendedPath(ContactsContract.AUTHORITY_URI, "display_photo").getPath();
    }

    public static boolean m1122a(@Nullable Uri uri) {
        String i = UriUtil.m1130i(uri);
        return "https".equals(i) || "http".equals(i);
    }

    public static boolean m1123b(@Nullable Uri uri) {
        return "file".equals(UriUtil.m1130i(uri));
    }

    public static boolean m1124c(@Nullable Uri uri) {
        return MessageKey.MSG_CONTENT.equals(UriUtil.m1130i(uri));
    }

    public static boolean m1125d(Uri uri) {
        return UriUtil.m1124c(uri) && "com.android.contacts".equals(uri.getAuthority()) && !uri.getPath().startsWith(f1157a);
    }

    public static boolean m1126e(Uri uri) {
        String uri2 = uri.toString();
        return uri2.startsWith(Media.EXTERNAL_CONTENT_URI.toString()) || uri2.startsWith(Media.INTERNAL_CONTENT_URI.toString());
    }

    public static boolean m1127f(@Nullable Uri uri) {
        return "asset".equals(UriUtil.m1130i(uri));
    }

    public static boolean m1128g(@Nullable Uri uri) {
        return "res".equals(UriUtil.m1130i(uri));
    }

    public static boolean m1129h(@Nullable Uri uri) {
        return ShareRequestParam.RESP_UPLOAD_PIC_PARAM_DATA.equals(UriUtil.m1130i(uri));
    }

    @Nullable
    private static String m1130i(@Nullable Uri uri) {
        return uri == null ? null : uri.getScheme();
    }

    @Nullable
    public static String m1121a(ContentResolver contentResolver, Uri uri) {
        Throwable th;
        Cursor cursor = null;
        if (UriUtil.m1124c(uri)) {
            try {
                String string;
                Cursor query = contentResolver.query(uri, null, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            int columnIndex = query.getColumnIndex("_data");
                            if (columnIndex != -1) {
                                string = query.getString(columnIndex);
                                if (query != null) {
                                    return string;
                                }
                                query.close();
                                return string;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = query;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                string = null;
                if (query != null) {
                    return string;
                }
                query.close();
                return string;
            } catch (Throwable th3) {
                th = th3;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } else if (UriUtil.m1123b(uri)) {
            return uri.getPath();
        } else {
            return null;
        }
    }
}
