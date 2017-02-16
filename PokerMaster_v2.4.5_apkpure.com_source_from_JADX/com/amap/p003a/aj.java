package com.amap.p003a;

import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Map;

/* compiled from: DownloadManager */
/* renamed from: com.amap.a.aj */
public final class aj {
    private ak f182a;
    private am f183b;

    /* renamed from: com.amap.a.aj.a */
    public interface DownloadManager {
        void m168a();

        void m169a(byte[] bArr, long j);

        void m170b();

        void m171c();
    }

    public aj(am amVar) {
        this(amVar, (byte) 0);
    }

    private aj(am amVar, byte b) {
        this.f183b = amVar;
        this.f182a = new ak(this.f183b.f177c, this.f183b.f178d, amVar.f179e == null ? null : amVar.f179e);
        this.f182a.f187c = -1;
        this.f182a.f188d = 0;
    }

    public final void m172a(DownloadManager downloadManager) {
        Throwable e;
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        Throwable th;
        InputStream inputStream2;
        HttpURLConnection httpURLConnection2 = null;
        int i = 1;
        ak akVar = this.f182a;
        String c = this.f183b.m154c();
        Map b = this.f183b.m153b();
        Map a = this.f183b.m152a();
        if (downloadManager != null) {
            HttpURLConnection a2;
            try {
                String a3 = ak.m174a(a);
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(c);
                if (a3 != null) {
                    stringBuffer.append("?").append(a3);
                }
                a2 = akVar.m177a(stringBuffer.toString(), b, false);
                try {
                    a2.setRequestProperty("RANGE", "bytes=" + akVar.f188d + "-");
                    a2.connect();
                    int responseCode = a2.getResponseCode();
                    int i2 = responseCode != 200 ? 1 : 0;
                    if (responseCode == 206) {
                        i = 0;
                    }
                    if ((i & i2) != 0) {
                        ca caVar = new ca("\u7f51\u7edc\u5f02\u5e38\u539f\u56e0\uff1a" + a2.getResponseMessage() + " \u7f51\u7edc\u5f02\u5e38\u72b6\u6001\u7801\uff1a" + responseCode);
                        downloadManager.m168a();
                    }
                    InputStream inputStream3 = a2.getInputStream();
                    try {
                        Object obj = new byte[AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT];
                        while (!Thread.interrupted() && !akVar.f186b) {
                            int read = inputStream3.read(obj, 0, AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT);
                            if (read > 0 && (akVar.f187c == -1 || akVar.f188d < akVar.f187c)) {
                                if (read == AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT) {
                                    downloadManager.m169a(obj, akVar.f188d);
                                } else {
                                    Object obj2 = new byte[read];
                                    System.arraycopy(obj, 0, obj2, 0, read);
                                    downloadManager.m169a(obj2, akVar.f188d);
                                }
                                akVar.f188d += (long) read;
                            }
                        }
                        break;
                        if (akVar.f186b) {
                            downloadManager.m171c();
                        } else {
                            downloadManager.m170b();
                        }
                        if (inputStream3 != null) {
                            try {
                                inputStream3.close();
                            } catch (Throwable e2) {
                                cm.m637a(e2, "HttpUrlUtil", "makeDownloadGetRequest");
                            } catch (Throwable e22) {
                                cm.m637a(e22, "HttpUrlUtil", "makeDownloadGetRequest");
                            }
                        }
                        if (a2 != null) {
                            try {
                                a2.disconnect();
                            } catch (Throwable e222) {
                                cm.m637a(e222, "HttpUrlUtil", "makeDownloadGetRequest");
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream2 = inputStream3;
                        e222 = th;
                    }
                } catch (Throwable th22) {
                    th = th22;
                    inputStream2 = null;
                    e222 = th;
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                    if (a2 != null) {
                        a2.disconnect();
                    }
                    throw e222;
                }
            } catch (Throwable e3) {
                inputStream2 = null;
                e222 = e3;
                a2 = null;
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                if (a2 != null) {
                    a2.disconnect();
                }
                throw e222;
            }
        }
    }
}
