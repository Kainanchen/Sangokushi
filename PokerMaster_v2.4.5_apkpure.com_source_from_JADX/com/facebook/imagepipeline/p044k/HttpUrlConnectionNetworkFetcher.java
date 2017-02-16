package com.facebook.imagepipeline.p044k;

import android.net.Uri;
import com.facebook.imagepipeline.p044k.ad.NetworkFetcher;
import com.facebook.imagepipeline.p047h.EncodedImage;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* renamed from: com.facebook.imagepipeline.k.r */
public final class HttpUrlConnectionNetworkFetcher extends BaseNetworkFetcher<FetchState> {
    private final ExecutorService f2348a;

    /* renamed from: com.facebook.imagepipeline.k.r.1 */
    class HttpUrlConnectionNetworkFetcher implements Runnable {
        final /* synthetic */ FetchState f2342a;
        final /* synthetic */ NetworkFetcher f2343b;
        final /* synthetic */ HttpUrlConnectionNetworkFetcher f2344c;

        HttpUrlConnectionNetworkFetcher(HttpUrlConnectionNetworkFetcher httpUrlConnectionNetworkFetcher, FetchState fetchState, NetworkFetcher networkFetcher) {
            this.f2344c = httpUrlConnectionNetworkFetcher;
            this.f2342a = fetchState;
            this.f2343b = networkFetcher;
        }

        public final void run() {
            Throwable th;
            Throwable th2;
            HttpURLConnection httpURLConnection = null;
            FetchState fetchState = this.f2342a;
            NetworkFetcher networkFetcher = this.f2343b;
            try {
                int i = 5;
                Uri uri = fetchState.f2340b.m2170a().f2401b;
                while (true) {
                    Object obj;
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(uri.toString()).openConnection();
                    int responseCode = httpURLConnection2.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        obj = null;
                    } else {
                        obj = 1;
                    }
                    if (obj != null) {
                        if (httpURLConnection2 != null) {
                            try {
                                networkFetcher.m2139a(httpURLConnection2.getInputStream());
                            } catch (Throwable e) {
                                th = e;
                                httpURLConnection = httpURLConnection2;
                                th2 = th;
                                try {
                                    networkFetcher.m2140a(th2);
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                        return;
                                    }
                                    return;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    throw th2;
                                }
                            } catch (Throwable e2) {
                                th = e2;
                                httpURLConnection = httpURLConnection2;
                                th2 = th;
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                throw th2;
                            }
                        }
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                            return;
                        }
                        return;
                    }
                    switch (responseCode) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                        case 307:
                        case 308:
                            int i2 = 1;
                            break;
                        default:
                            obj = null;
                            break;
                    }
                    if (obj != null) {
                        String headerField = httpURLConnection2.getHeaderField("Location");
                        httpURLConnection2.disconnect();
                        Uri parse = headerField == null ? null : Uri.parse(headerField);
                        headerField = uri.getScheme();
                        if (i <= 0 || parse == null || parse.getScheme().equals(headerField)) {
                            String a;
                            if (i == 0) {
                                a = HttpUrlConnectionNetworkFetcher.m2284a("URL %s follows too many redirects", uri.toString());
                            } else {
                                a = HttpUrlConnectionNetworkFetcher.m2284a("URL %s returned %d without a valid redirect", uri.toString(), Integer.valueOf(responseCode));
                            }
                            throw new IOException(a);
                        }
                        i--;
                        uri = parse;
                    } else {
                        httpURLConnection2.disconnect();
                        throw new IOException(String.format("Image URL %s returned HTTP code %d", new Object[]{uri.toString(), Integer.valueOf(responseCode)}));
                    }
                }
            } catch (IOException e3) {
                th2 = e3;
            }
        }
    }

    /* renamed from: com.facebook.imagepipeline.k.r.2 */
    class HttpUrlConnectionNetworkFetcher extends BaseProducerContextCallbacks {
        final /* synthetic */ Future f2345a;
        final /* synthetic */ NetworkFetcher f2346b;
        final /* synthetic */ HttpUrlConnectionNetworkFetcher f2347c;

        HttpUrlConnectionNetworkFetcher(HttpUrlConnectionNetworkFetcher httpUrlConnectionNetworkFetcher, Future future, NetworkFetcher networkFetcher) {
            this.f2347c = httpUrlConnectionNetworkFetcher;
            this.f2345a = future;
            this.f2346b = networkFetcher;
        }

        public final void m2283a() {
            if (this.f2345a.cancel(false)) {
                this.f2346b.m2138a();
            }
        }
    }

    public HttpUrlConnectionNetworkFetcher() {
        this(Executors.newFixedThreadPool(3));
    }

    private HttpUrlConnectionNetworkFetcher(ExecutorService executorService) {
        this.f2348a = executorService;
    }

    public final FetchState m2285a(Consumer<EncodedImage> consumer, ah ahVar) {
        return new FetchState(consumer, ahVar);
    }

    public final void m2286a(FetchState fetchState, NetworkFetcher networkFetcher) {
        fetchState.f2340b.m2171a(new HttpUrlConnectionNetworkFetcher(this, this.f2348a.submit(new HttpUrlConnectionNetworkFetcher(this, fetchState, networkFetcher)), networkFetcher));
    }

    static String m2284a(String str, Object... objArr) {
        return String.format(Locale.getDefault(), str, objArr);
    }
}
