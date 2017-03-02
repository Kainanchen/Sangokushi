package com.loopj.android.http;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import org.apache.http.Header;

public abstract class FileAsyncHttpResponseHandler extends AsyncHttpResponseHandler {
    private static final String LOG_TAG = "FileAsyncHttpRH";
    protected final boolean append;
    protected final File file;
    protected File frontendFile;
    protected final boolean renameIfExists;

    public abstract void onFailure(int i, Header[] headerArr, Throwable th, File file);

    public abstract void onSuccess(int i, Header[] headerArr, File file);

    public FileAsyncHttpResponseHandler(File file) {
        this(file, false);
    }

    public FileAsyncHttpResponseHandler(File file, boolean append) {
        this(file, append, false);
    }

    public FileAsyncHttpResponseHandler(File file, boolean append, boolean renameTargetFileIfExists) {
        Utils.asserts(file != null, "File passed into FileAsyncHttpResponseHandler constructor must not be null");
        if (!(file.isDirectory() || file.getParentFile().isDirectory())) {
            Utils.asserts(file.getParentFile().mkdirs(), "Cannot create parent directories for requested File location");
        }
        if (file.isDirectory() && !file.mkdirs()) {
            AsyncHttpClient.log.m1882d(LOG_TAG, "Cannot create directories for requested Directory location, might not be a problem");
        }
        this.file = file;
        this.append = append;
        this.renameIfExists = renameTargetFileIfExists;
    }

    public FileAsyncHttpResponseHandler(Context context) {
        this.file = getTemporaryFile(context);
        this.append = false;
        this.renameIfExists = false;
    }

    public boolean deleteTargetFile() {
        return getTargetFile() != null && getTargetFile().delete();
    }

    protected File getTemporaryFile(Context context) {
        Utils.asserts(context != null, "Tried creating temporary file without having Context");
        try {
            return File.createTempFile("temp_", "_handled", context.getCacheDir());
        } catch (IOException e) {
            AsyncHttpClient.log.m1885e(LOG_TAG, "Cannot create temporary file", e);
            return null;
        }
    }

    protected File getOriginalFile() {
        Utils.asserts(this.file != null, "Target file is null, fatal!");
        return this.file;
    }

    public File getTargetFile() {
        if (this.frontendFile == null) {
            this.frontendFile = getOriginalFile().isDirectory() ? getTargetFileByParsingURL() : getOriginalFile();
        }
        return this.frontendFile;
    }

    protected File getTargetFileByParsingURL() {
        boolean z;
        Utils.asserts(getOriginalFile().isDirectory(), "Target file is not a directory, cannot proceed");
        if (getRequestURI() != null) {
            z = true;
        } else {
            z = false;
        }
        Utils.asserts(z, "RequestURI is null, cannot proceed");
        String requestURL = getRequestURI().toString();
        String filename = requestURL.substring(requestURL.lastIndexOf(47) + 1, requestURL.length());
        File targetFileRtn = new File(getOriginalFile(), filename);
        if (!targetFileRtn.exists() || !this.renameIfExists) {
            return targetFileRtn;
        }
        String format;
        if (filename.contains(".")) {
            format = filename.substring(0, filename.lastIndexOf(46)) + " (%d)" + filename.substring(filename.lastIndexOf(46), filename.length());
        } else {
            format = filename + " (%d)";
        }
        int index = 0;
        while (true) {
            targetFileRtn = new File(getOriginalFile(), String.format(format, new Object[]{Integer.valueOf(index)}));
            if (!targetFileRtn.exists()) {
                return targetFileRtn;
            }
            index++;
        }
    }

    public final void onFailure(int statusCode, Header[] headers, byte[] responseBytes, Throwable throwable) {
        onFailure(statusCode, headers, throwable, getTargetFile());
    }

    public final void onSuccess(int statusCode, Header[] headers, byte[] responseBytes) {
        onSuccess(statusCode, headers, getTargetFile());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected byte[] getResponseData(org.apache.http.HttpEntity r11) throws java.io.IOException {
        /*
        r10 = this;
        if (r11 == 0) goto L_0x004b;
    L_0x0002:
        r4 = r11.getContent();
        r2 = r11.getContentLength();
        r0 = new java.io.FileOutputStream;
        r7 = r10.getTargetFile();
        r8 = r10.append;
        r0.<init>(r7, r8);
        if (r4 == 0) goto L_0x004b;
    L_0x0017:
        r7 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r6 = new byte[r7];	 Catch:{ all -> 0x0037 }
        r1 = 0;
    L_0x001c:
        r5 = r4.read(r6);	 Catch:{ all -> 0x0037 }
        r7 = -1;
        if (r5 == r7) goto L_0x0042;
    L_0x0023:
        r7 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0037 }
        r7 = r7.isInterrupted();	 Catch:{ all -> 0x0037 }
        if (r7 != 0) goto L_0x0042;
    L_0x002d:
        r1 = r1 + r5;
        r7 = 0;
        r0.write(r6, r7, r5);	 Catch:{ all -> 0x0037 }
        r8 = (long) r1;	 Catch:{ all -> 0x0037 }
        r10.sendProgressMessage(r8, r2);	 Catch:{ all -> 0x0037 }
        goto L_0x001c;
    L_0x0037:
        r7 = move-exception;
        com.loopj.android.http.AsyncHttpClient.silentCloseInputStream(r4);
        r0.flush();
        com.loopj.android.http.AsyncHttpClient.silentCloseOutputStream(r0);
        throw r7;
    L_0x0042:
        com.loopj.android.http.AsyncHttpClient.silentCloseInputStream(r4);
        r0.flush();
        com.loopj.android.http.AsyncHttpClient.silentCloseOutputStream(r0);
    L_0x004b:
        r7 = 0;
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loopj.android.http.FileAsyncHttpResponseHandler.getResponseData(org.apache.http.HttpEntity):byte[]");
    }
}
