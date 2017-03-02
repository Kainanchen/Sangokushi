package com.igexin.download;

import android.app.Service;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.os.IBinder;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.alipay.sdk.packet.C0182d;
import java.io.File;
import java.util.ArrayList;

public class DownloadService extends Service {
    static boolean f685a;
    private C0263d f686b;
    private ArrayList f687c;
    private C0265f f688d;
    private boolean f689e;
    private C0264e f690f;
    private boolean f691g;
    private Object f692h;
    private CharArrayBuffer f693i;
    private CharArrayBuffer f694j;

    static {
        f685a = false;
    }

    private long m892a(int i, long j) {
        DownloadInfo downloadInfo = (DownloadInfo) this.f687c.get(i);
        if (Downloads.isStatusCompleted(downloadInfo.mStatus)) {
            return -1;
        }
        if (downloadInfo.mStatus != Downloads.STATUS_RUNNING_PAUSED) {
            return 0;
        }
        if (downloadInfo.mNumFailed == 0) {
            return 0;
        }
        long restartTime = downloadInfo.restartTime();
        return restartTime <= j ? 0 : restartTime - j;
    }

    private String m897a(String str, Cursor cursor, String str2) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str2);
        if (str == null) {
            return cursor.getString(columnIndexOrThrow);
        }
        if (this.f694j == null) {
            this.f694j = new CharArrayBuffer(AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
        }
        cursor.copyStringToBuffer(columnIndexOrThrow, this.f694j);
        int i = this.f694j.sizeCopied;
        if (i != str.length()) {
            return cursor.getString(columnIndexOrThrow);
        }
        if (this.f693i == null || this.f693i.sizeCopied < i) {
            this.f693i = new CharArrayBuffer(i);
        }
        char[] cArr = this.f693i.data;
        char[] cArr2 = this.f694j.data;
        str.getChars(0, i, cArr, 0);
        for (columnIndexOrThrow = i - 1; columnIndexOrThrow >= 0; columnIndexOrThrow--) {
            if (cArr[columnIndexOrThrow] != cArr2[columnIndexOrThrow]) {
                return new String(cArr2, 0, i);
            }
        }
        return str;
    }

    private void m898a() {
        synchronized (this) {
            this.f689e = true;
            if (this.f688d == null) {
                this.f688d = new C0265f(this);
                this.f688d.start();
            }
        }
    }

    private void m899a(Cursor cursor, int i, boolean z, boolean z2, long j) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(Downloads.COLUMN_STATUS);
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("numfailed");
        int i2 = cursor.getInt(cursor.getColumnIndexOrThrow(C0182d.f435q));
        DownloadInfo downloadInfo = new DownloadInfo(cursor.getInt(cursor.getColumnIndexOrThrow("_id")), cursor.getString(cursor.getColumnIndexOrThrow(Downloads.COLUMN_URI)), cursor.getInt(cursor.getColumnIndexOrThrow(Downloads.COLUMN_NO_INTEGRITY)) == 1, cursor.getString(cursor.getColumnIndexOrThrow(Downloads.COLUMN_FILE_NAME_HINT)), cursor.getString(cursor.getColumnIndexOrThrow(Downloads._DATA)), cursor.getString(cursor.getColumnIndexOrThrow(Downloads.COLUMN_MIME_TYPE)), cursor.getInt(cursor.getColumnIndexOrThrow(Downloads.COLUMN_DESTINATION)), cursor.getInt(cursor.getColumnIndexOrThrow(Downloads.COLUMN_VISIBILITY)), cursor.getInt(cursor.getColumnIndexOrThrow(Downloads.COLUMN_CONTROL)), cursor.getInt(columnIndexOrThrow), cursor.getInt(columnIndexOrThrow2), 268435455 & i2, i2 >> 28, cursor.getLong(cursor.getColumnIndexOrThrow(Downloads.COLUMN_LAST_MODIFICATION)), cursor.getLong(cursor.getColumnIndexOrThrow(Downloads.COLUMN_CREATE_MODIFICATION)), cursor.getString(cursor.getColumnIndexOrThrow(Downloads.COLUMN_EXTRAS)), cursor.getString(cursor.getColumnIndexOrThrow(Downloads.COLUMN_COOKIE_DATA)), cursor.getString(cursor.getColumnIndexOrThrow(Downloads.COLUMN_USER_AGENT)), cursor.getString(cursor.getColumnIndexOrThrow(Downloads.COLUMN_REFERER)), cursor.getInt(cursor.getColumnIndexOrThrow(Downloads.COLUMN_TOTAL_BYTES)), cursor.getInt(cursor.getColumnIndexOrThrow(Downloads.COLUMN_CURRENT_BYTES)), cursor.getString(cursor.getColumnIndexOrThrow("etag")), cursor.getString(cursor.getColumnIndexOrThrow(Downloads.COLUMN_DATA1)), cursor.getString(cursor.getColumnIndexOrThrow(Downloads.COLUMN_DATA2)), cursor.getString(cursor.getColumnIndexOrThrow(Downloads.COLUMN_DATA3)), cursor.getString(cursor.getColumnIndexOrThrow(Downloads.COLUMN_DATA4)), cursor.getString(cursor.getColumnIndexOrThrow(Downloads.COLUMN_DATA5)), cursor.getString(cursor.getColumnIndexOrThrow(Downloads.COLUMN_DATA6)), cursor.getString(cursor.getColumnIndexOrThrow(Downloads.COLUMN_DATA7)), cursor.getString(cursor.getColumnIndexOrThrow(Downloads.COLUMN_DATA8)), cursor.getString(cursor.getColumnIndexOrThrow(Downloads.COLUMN_DATA9)), cursor.getLong(cursor.getColumnIndexOrThrow(Downloads.COLUMN_DATA10)), cursor.getInt(cursor.getColumnIndexOrThrow(Downloads.COLUMN_IS_WEB_ICON)), cursor.getInt(cursor.getColumnIndexOrThrow("scanned")) == 1);
        this.f687c.add(i, downloadInfo);
        if (!downloadInfo.canUseNetwork(z, z2)) {
            return;
        }
        if (("wifi".equals(downloadInfo.mData9) && !C0267h.m948b((Context) this)) || !downloadInfo.isReadyToStart(j)) {
            return;
        }
        ContentValues contentValues;
        if (m903a(SdkDownLoader.f697a)) {
            if (!downloadInfo.mHasActiveThread) {
                if (downloadInfo.mStatus != Downloads.STATUS_RUNNING) {
                    downloadInfo.mStatus = Downloads.STATUS_RUNNING;
                    contentValues = new ContentValues();
                    contentValues.put(Downloads.COLUMN_STATUS, Integer.valueOf(downloadInfo.mStatus));
                    getContentResolver().update(ContentUris.withAppendedId(Downloads.f695a, (long) downloadInfo.mId), contentValues, null, null);
                }
                C0266g c0266g = new C0266g(this, downloadInfo);
                downloadInfo.mHasActiveThread = true;
                c0266g.start();
                downloadInfo.mNotice = false;
            }
        } else if (downloadInfo.mStatus != Downloads.STATUS_PENDING) {
            downloadInfo.mStatus = Downloads.STATUS_PENDING;
            contentValues = new ContentValues();
            contentValues.put(Downloads.COLUMN_STATUS, Integer.valueOf(downloadInfo.mStatus));
            getContentResolver().update(ContentUris.withAppendedId(Downloads.f695a, (long) downloadInfo.mId), contentValues, null, null);
        }
    }

    private boolean m903a(int i) {
        Cursor query = getContentResolver().query(Downloads.f695a, new String[]{"_id"}, "status == '192'", null, null);
        if (query == null) {
            return false;
        }
        boolean z = query.getCount() < i;
        query.close();
        return z;
    }

    private boolean m904a(Cursor cursor, int i) {
        DownloadInfo downloadInfo = (DownloadInfo) this.f687c.get(i);
        synchronized (this) {
            if (this.f692h != null) {
                try {
                    this.f692h.getClass().getMethod("scanFile", new Class[]{String.class, String.class}).invoke(this.f692h, new Object[]{downloadInfo.mFileName, downloadInfo.mMimeType});
                    downloadInfo.mMediaScanned = true;
                    if (cursor != null) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("scanned", Integer.valueOf(1));
                        getContentResolver().update(ContentUris.withAppendedId(Downloads.f695a, cursor.getLong(cursor.getColumnIndexOrThrow("_id"))), contentValues, null, null);
                    }
                    return true;
                } catch (Exception e) {
                }
            }
            return false;
        }
    }

    private boolean m907a(String str) {
        return true;
    }

    private void m910b(int i) {
        DownloadInfo downloadInfo = (DownloadInfo) this.f687c.get(i);
        if (downloadInfo.mStatus == Downloads.STATUS_RUNNING) {
            downloadInfo.mStatus = Downloads.STATUS_CANCELED;
        } else if (!(downloadInfo.mDestination == 0 || downloadInfo.mFileName == null)) {
            new File(downloadInfo.mFileName).delete();
        }
        this.f687c.remove(i);
    }

    private void m911b(Cursor cursor, int i, boolean z, boolean z2, long j) {
        DownloadInfo downloadInfo = (DownloadInfo) this.f687c.get(i);
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(Downloads.COLUMN_STATUS);
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("numfailed");
        downloadInfo.mId = cursor.getInt(cursor.getColumnIndexOrThrow("_id"));
        downloadInfo.mUri = m897a(downloadInfo.mUri, cursor, Downloads.COLUMN_URI);
        downloadInfo.mNoIntegrity = cursor.getInt(cursor.getColumnIndexOrThrow(Downloads.COLUMN_NO_INTEGRITY)) == 1;
        downloadInfo.mHint = m897a(downloadInfo.mHint, cursor, Downloads.COLUMN_FILE_NAME_HINT);
        downloadInfo.mFileName = m897a(downloadInfo.mFileName, cursor, Downloads._DATA);
        downloadInfo.mMimeType = m897a(downloadInfo.mMimeType, cursor, Downloads.COLUMN_MIME_TYPE);
        downloadInfo.mDestination = cursor.getInt(cursor.getColumnIndexOrThrow(Downloads.COLUMN_DESTINATION));
        downloadInfo.mVisibility = cursor.getInt(cursor.getColumnIndexOrThrow(Downloads.COLUMN_VISIBILITY));
        synchronized (downloadInfo) {
            downloadInfo.mControl = cursor.getInt(cursor.getColumnIndexOrThrow(Downloads.COLUMN_CONTROL));
        }
        downloadInfo.mStatus = cursor.getInt(columnIndexOrThrow);
        downloadInfo.mNumFailed = cursor.getInt(columnIndexOrThrow2);
        int i2 = cursor.getInt(cursor.getColumnIndexOrThrow(C0182d.f435q));
        downloadInfo.mRetryAfter = 268435455 & i2;
        downloadInfo.mRedirectCount = i2 >> 28;
        downloadInfo.mLastMod = cursor.getLong(cursor.getColumnIndexOrThrow(Downloads.COLUMN_LAST_MODIFICATION));
        downloadInfo.mCreateMod = cursor.getLong(cursor.getColumnIndexOrThrow(Downloads.COLUMN_CREATE_MODIFICATION));
        downloadInfo.mCookies = m897a(downloadInfo.mCookies, cursor, Downloads.COLUMN_COOKIE_DATA);
        downloadInfo.mExtras = m897a(downloadInfo.mExtras, cursor, Downloads.COLUMN_EXTRAS);
        downloadInfo.mUserAgent = m897a(downloadInfo.mUserAgent, cursor, Downloads.COLUMN_USER_AGENT);
        downloadInfo.mReferer = m897a(downloadInfo.mReferer, cursor, Downloads.COLUMN_REFERER);
        downloadInfo.mTotalBytes = cursor.getInt(cursor.getColumnIndexOrThrow(Downloads.COLUMN_TOTAL_BYTES));
        downloadInfo.mCurrentBytes = cursor.getInt(cursor.getColumnIndexOrThrow(Downloads.COLUMN_CURRENT_BYTES));
        downloadInfo.mETag = m897a(downloadInfo.mETag, cursor, "etag");
        if (!downloadInfo.canUseNetwork(z, z2)) {
            return;
        }
        if (("wifi".equals(downloadInfo.mData9) && !C0267h.m948b((Context) this)) || !downloadInfo.isReadyToRestart(j)) {
            return;
        }
        ContentValues contentValues;
        if (m903a(SdkDownLoader.f697a)) {
            if (!downloadInfo.mHasActiveThread) {
                downloadInfo.mStatus = Downloads.STATUS_RUNNING;
                contentValues = new ContentValues();
                contentValues.put(Downloads.COLUMN_STATUS, Integer.valueOf(downloadInfo.mStatus));
                getContentResolver().update(ContentUris.withAppendedId(Downloads.f695a, (long) downloadInfo.mId), contentValues, null, null);
                C0266g c0266g = new C0266g(this, downloadInfo);
                downloadInfo.mHasActiveThread = true;
                c0266g.start();
                downloadInfo.mNotice = false;
            }
        } else if (downloadInfo.mStatus != Downloads.STATUS_PENDING) {
            downloadInfo.mStatus = Downloads.STATUS_PENDING;
            contentValues = new ContentValues();
            contentValues.put(Downloads.COLUMN_STATUS, Integer.valueOf(downloadInfo.mStatus));
            getContentResolver().update(ContentUris.withAppendedId(Downloads.f695a, (long) downloadInfo.mId), contentValues, null, null);
        }
    }

    private boolean m913b() {
        return this.f692h != null;
    }

    private boolean m917c(int i) {
        return ((DownloadInfo) this.f687c.get(i)).hasCompletionNotification();
    }

    private boolean m919d(int i) {
        DownloadInfo downloadInfo = (DownloadInfo) this.f687c.get(i);
        return !downloadInfo.mMediaScanned && downloadInfo.mDestination == 0 && Downloads.isStatusSuccess(downloadInfo.mStatus) && !m907a(downloadInfo.mMimeType);
    }

    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Cannot bind to Download Manager Service");
    }

    public void onCreate() {
        super.onCreate();
        try {
            this.f687c = (ArrayList) Class.forName("com.google.android.collect.Lists").getMethod("newArrayList", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e) {
        }
        this.f686b = new C0263d(this);
        getContentResolver().registerContentObserver(Downloads.f695a, true, this.f686b);
        this.f692h = null;
        this.f691g = false;
        this.f690f = new C0264e(this);
    }

    public void onDestroy() {
        getContentResolver().unregisterContentObserver(this.f686b);
        super.onDestroy();
    }

    public void onStart(Intent intent, int i) {
        super.onStart(intent, i);
        m898a();
    }
}
