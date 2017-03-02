package com.igexin.download;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import com.tencent.connect.common.Constants;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SdkDownLoader {
    static int f697a;
    static String f698b;
    static SdkDownLoader f699c;
    Handler f700d;
    String[] f701e;
    private Context f702f;
    private List f703g;
    private final Object f704h;
    public Map updateData;

    static {
        f697a = 3;
        f698b = "/libs/tmp";
    }

    private SdkDownLoader(Context context) {
        this.f703g = new ArrayList();
        this.updateData = new HashMap();
        this.f704h = new Object();
        this.f701e = new String[]{"_id", Downloads._DATA, Downloads.COLUMN_FILE_NAME_HINT, Downloads.COLUMN_STATUS, Downloads.COLUMN_TOTAL_BYTES, Downloads.COLUMN_CURRENT_BYTES};
        this.f702f = context;
        this.f700d = new C0269j(this, context.getMainLooper());
    }

    private int m925a(ContentValues contentValues) {
        ContentResolver contentResolver = this.f702f.getContentResolver();
        contentValues.put(Downloads.COLUMN_DATA10, String.valueOf(System.currentTimeMillis()));
        Uri insert = contentResolver.insert(Downloads.f695a, contentValues);
        return insert != null ? Integer.parseInt((String) insert.getPathSegments().get(1)) : -1;
    }

    private int m926a(String str, String str2, ContentValues contentValues, String str3) {
        ContentValues contentValues2 = new ContentValues();
        if (contentValues != null) {
            contentValues2.putAll(contentValues);
        }
        contentValues2.put(Downloads.COLUMN_DESTINATION, Integer.valueOf(0));
        if (str != null) {
            contentValues2.put(Downloads.COLUMN_URI, str);
        }
        if (str2 != null) {
            contentValues2.put(Downloads.COLUMN_FILE_NAME_HINT, str2.replaceAll("\\*", Constants.STR_EMPTY));
        }
        if (str3 != null) {
            contentValues2.put(SocialConstants.PARAM_COMMENT, str3);
        }
        return m925a(contentValues2);
    }

    public static SdkDownLoader getInstantiate(Context context) {
        if (f699c == null) {
            f699c = new SdkDownLoader(context);
        }
        return f699c;
    }

    IDownloadCallback m929a(String str) {
        if (str == null) {
            return null;
        }
        for (IDownloadCallback iDownloadCallback : this.f703g) {
            if (str.equals(iDownloadCallback.getName())) {
                return iDownloadCallback;
            }
        }
        return null;
    }

    protected void m930a(Collection collection) {
        synchronized (this.f704h) {
            if (collection != null) {
                if (collection.isEmpty()) {
                    this.updateData.clear();
                } else {
                    Map hashMap = new HashMap();
                    for (DownloadInfo downloadInfo : collection) {
                        DownloadInfo downloadInfo2;
                        if (this.updateData.containsKey(Integer.valueOf(downloadInfo.mId))) {
                            downloadInfo2 = (DownloadInfo) this.updateData.get(Integer.valueOf(downloadInfo.mId));
                            if (downloadInfo2 != null) {
                                downloadInfo2.copyFrom(downloadInfo);
                                hashMap.put(Integer.valueOf(downloadInfo2.mId), downloadInfo2);
                            }
                        } else {
                            downloadInfo2 = downloadInfo.clone();
                            if (downloadInfo2 != null) {
                                hashMap.put(Integer.valueOf(downloadInfo.mId), downloadInfo2);
                            }
                        }
                    }
                    this.updateData = hashMap;
                }
            }
        }
    }

    public boolean deleteTask(int i) {
        this.f702f.getContentResolver().delete(ContentUris.withAppendedId(Downloads.f695a, (long) i), null, null);
        return true;
    }

    public boolean deleteTask(int[] iArr) {
        ContentResolver contentResolver = this.f702f.getContentResolver();
        String[] strArr = new String[iArr.length];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = String.valueOf(iArr[i]);
        }
        contentResolver.delete(Downloads.f695a, "_id=?", strArr);
        return true;
    }

    public IDownloadCallback getCallback(String str) {
        if (str == null) {
            return null;
        }
        for (IDownloadCallback iDownloadCallback : this.f703g) {
            if (str.equals(iDownloadCallback.getName())) {
                return iDownloadCallback;
            }
        }
        return null;
    }

    public boolean isRegistered(String str) {
        for (IDownloadCallback name : this.f703g) {
            String name2 = name.getName();
            if (name2 != null && name2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public int newTask(String str, String str2, String str3, boolean z, String str4) {
        ContentValues contentValues = new ContentValues();
        if (str3 != null) {
            contentValues.put(Downloads.COLUMN_DATA6, str3);
        }
        if (z) {
            contentValues.put(Downloads.COLUMN_DATA9, "wifi");
        }
        contentValues.put(Downloads.COLUMN_DATA8, str4);
        return m926a(str, str2, contentValues, null);
    }

    public boolean pauseAllTask() {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Downloads.COLUMN_CONTROL, Integer.valueOf(1));
        contentValues.put(Downloads.COLUMN_STATUS, Integer.valueOf(Downloads.STATUS_RUNNING_PAUSED));
        this.f702f.getContentResolver().update(Downloads.f695a, contentValues, "status=? OR status=? OR(status=? AND control<>?)", new String[]{String.valueOf(Downloads.STATUS_RUNNING), String.valueOf(Downloads.STATUS_PENDING), String.valueOf(Downloads.STATUS_RUNNING_PAUSED), String.valueOf(1)});
        return true;
    }

    public boolean pauseTask(int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Downloads.COLUMN_CONTROL, Integer.valueOf(1));
        this.f702f.getContentResolver().update(ContentUris.withAppendedId(Downloads.f695a, (long) i), contentValues, null, null);
        return true;
    }

    public boolean queryTask(String str) {
        if (Downloads.f695a == null) {
            return false;
        }
        Cursor query = this.f702f.getContentResolver().query(Downloads.f695a, null, "data_8 = ? ", new String[]{str}, null);
        if (query == null) {
            return false;
        }
        int count = query.getCount();
        query.close();
        return count > 0;
    }

    public void refreshList() {
        Message message = new Message();
        message.what = 2;
        this.f700d.sendMessage(message);
    }

    public void registerDownloadCallback(IDownloadCallback iDownloadCallback) {
        if (!this.f703g.contains(iDownloadCallback)) {
            this.f703g.add(iDownloadCallback);
        }
    }

    public void setDownloadDir(String str) {
        f698b = str;
    }

    public boolean startTask(int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Downloads.COLUMN_CONTROL, Integer.valueOf(0));
        contentValues.put("numfailed", Integer.valueOf(0));
        this.f702f.getContentResolver().update(ContentUris.withAppendedId(Downloads.f695a, (long) i), contentValues, null, null);
        return true;
    }

    public void unregisterDownloadCallback(IDownloadCallback iDownloadCallback) {
        this.f703g.remove(iDownloadCallback);
    }

    public boolean updateTask(int i, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(str, str2);
        this.f702f.getContentResolver().update(ContentUris.withAppendedId(Downloads.f695a, (long) i), contentValues, null, null);
        return true;
    }
}
