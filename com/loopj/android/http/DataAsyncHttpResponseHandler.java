package com.loopj.android.http;

import android.os.Message;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.util.ByteArrayBuffer;

public abstract class DataAsyncHttpResponseHandler extends AsyncHttpResponseHandler {
    private static final String LOG_TAG = "DataAsyncHttpRH";
    protected static final int PROGRESS_DATA_MESSAGE = 7;

    public void onProgressData(byte[] responseBody) {
        AsyncHttpClient.log.m1882d(LOG_TAG, "onProgressData(byte[]) was not overriden, but callback was received");
    }

    public final void sendProgressDataMessage(byte[] responseBytes) {
        sendMessage(obtainMessage(PROGRESS_DATA_MESSAGE, new Object[]{responseBytes}));
    }

    protected void handleMessage(Message message) {
        super.handleMessage(message);
        switch (message.what) {
            case PROGRESS_DATA_MESSAGE /*7*/:
                Object[] response = (Object[]) message.obj;
                if (response == null || response.length < 1) {
                    AsyncHttpClient.log.m1884e(LOG_TAG, "PROGRESS_DATA_MESSAGE didn't got enough params");
                    return;
                }
                try {
                    onProgressData((byte[]) response[0]);
                } catch (Throwable t) {
                    AsyncHttpClient.log.m1885e(LOG_TAG, "custom onProgressData contains an error", t);
                }
            default:
        }
    }

    byte[] getResponseData(HttpEntity entity) throws IOException {
        byte[] responseBody = null;
        if (entity != null) {
            InputStream instream = entity.getContent();
            if (instream != null) {
                long contentLength = entity.getContentLength();
                if (contentLength > 2147483647L) {
                    throw new IllegalArgumentException("HTTP entity too large to be buffered in memory");
                }
                if (contentLength < 0) {
                    contentLength = 4096;
                }
                try {
                    ByteArrayBuffer buffer = new ByteArrayBuffer((int) contentLength);
                    byte[] tmp = new byte[AccessibilityNodeInfoCompat.ACTION_SCROLL_FORWARD];
                    while (true) {
                        int l = instream.read(tmp);
                        if (l == -1 || Thread.currentThread().isInterrupted()) {
                            break;
                        }
                        buffer.append(tmp, 0, l);
                        sendProgressDataMessage(copyOfRange(tmp, 0, l));
                        sendProgressMessage((long) 0, contentLength);
                    }
                    AsyncHttpClient.silentCloseInputStream(instream);
                    responseBody = buffer.toByteArray();
                } catch (OutOfMemoryError e) {
                    System.gc();
                    throw new IOException("File too large to fit into available memory");
                } catch (Throwable th) {
                    AsyncHttpClient.silentCloseInputStream(instream);
                }
            }
        }
        return responseBody;
    }

    public static byte[] copyOfRange(byte[] original, int start, int end) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NullPointerException {
        if (start > end) {
            throw new IllegalArgumentException();
        }
        int originalLength = original.length;
        if (start < 0 || start > originalLength) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int resultLength = end - start;
        byte[] result = new byte[resultLength];
        System.arraycopy(original, start, result, 0, Math.min(resultLength, originalLength - start));
        return result;
    }
}
