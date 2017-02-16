package com.facebook;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.Pair;
import com.facebook.p036h.NativeAppCallAttachmentStore;
import java.io.FileNotFoundException;
import java.util.UUID;
import net.sqlcipher.database.SQLiteDatabase;

public class FacebookContentProvider extends ContentProvider {
    private static final String f820a;

    static {
        f820a = FacebookContentProvider.class.getName();
    }

    public static String m808a(String str, UUID uuid, String str2) {
        return String.format("%s%s/%s/%s", new Object[]{"content://com.facebook.app.FacebookContentProvider", str, uuid.toString(), str2});
    }

    public boolean onCreate() {
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        Pair a = m807a(uri);
        if (a == null) {
            throw new FileNotFoundException();
        }
        try {
            return ParcelFileDescriptor.open(NativeAppCallAttachmentStore.m1694a((UUID) a.first, (String) a.second), SQLiteDatabase.CREATE_IF_NECESSARY);
        } catch (FileNotFoundException e) {
            Log.e(f820a, "Got unexpected exception:" + e);
            throw e;
        }
    }

    private static Pair<UUID, String> m807a(Uri uri) {
        try {
            String[] split = uri.getPath().substring(1).split("/");
            String str = split[0];
            return new Pair(UUID.fromString(str), split[1]);
        } catch (Exception e) {
            return null;
        }
    }
}
