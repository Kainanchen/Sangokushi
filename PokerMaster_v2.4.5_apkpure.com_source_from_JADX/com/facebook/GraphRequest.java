package com.facebook;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.GraphRequestBatch.GraphRequestBatch;
import com.facebook.p036h.InternalSettings;
import com.facebook.p036h.Logger;
import com.facebook.p036h.ac;
import com.facebook.p036h.af;
import com.facebook.p036h.ag;
import com.sina.weibo.sdk.component.GameManager;
import com.sina.weibo.sdk.component.ShareRequestParam;
import com.sina.weibo.sdk.constant.WBConstants;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.sina.weibo.sdk.register.mobile.SelectCountryActivity;
import com.tencent.android.tpush.common.MessageKey;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.p */
public class GraphRequest {
    public static final String f2707a;
    private static String f2708h;
    private static Pattern f2709i;
    private static volatile String f2710q;
    AccessToken f2711b;
    public JSONObject f2712c;
    public Bundle f2713d;
    GraphRequest f2714e;
    public Object f2715f;
    public boolean f2716g;
    private HttpMethod f2717j;
    private String f2718k;
    private String f2719l;
    private String f2720m;
    private boolean f2721n;
    private String f2722o;
    private String f2723p;

    /* renamed from: com.facebook.p.b */
    public interface GraphRequest {
        void m857a(GraphResponse graphResponse);
    }

    /* renamed from: com.facebook.p.1 */
    static class GraphRequest implements GraphRequest {
        final /* synthetic */ GraphRequest f2691a;

        GraphRequest(GraphRequest graphRequest) {
            this.f2691a = graphRequest;
        }

        public final void m2597a(GraphResponse graphResponse) {
            if (this.f2691a != null) {
                this.f2691a.m2603a(graphResponse.f2735a);
            }
        }
    }

    /* renamed from: com.facebook.p.2 */
    static class GraphRequest implements GraphRequest {
        final /* synthetic */ GraphRequest f2692a;

        GraphRequest(GraphRequest graphRequest) {
            this.f2692a = graphRequest;
        }

        public final void m2598a(GraphResponse graphResponse) {
            if (this.f2692a != null) {
                JSONObject jSONObject = graphResponse.f2735a;
                this.f2692a.m2602a(jSONObject != null ? jSONObject.optJSONArray(ShareRequestParam.RESP_UPLOAD_PIC_PARAM_DATA) : null);
            }
        }
    }

    /* renamed from: com.facebook.p.3 */
    class GraphRequest implements GraphRequest {
        final /* synthetic */ GraphRequest f2693a;
        final /* synthetic */ GraphRequest f2694b;

        GraphRequest(GraphRequest graphRequest, GraphRequest graphRequest2) {
            this.f2694b = graphRequest;
            this.f2693a = graphRequest2;
        }

        public final void m2599a(GraphResponse graphResponse) {
            JSONArray optJSONArray;
            JSONObject jSONObject = graphResponse.f2735a;
            jSONObject = jSONObject != null ? jSONObject.optJSONObject("__debug__") : null;
            if (jSONObject != null) {
                optJSONArray = jSONObject.optJSONArray("messages");
            } else {
                optJSONArray = null;
            }
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString;
                    String optString2;
                    String optString3;
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        optString = optJSONObject.optString(WBConstants.ACTION_LOG_TYPE_MESSAGE);
                    } else {
                        optString = null;
                    }
                    if (optJSONObject != null) {
                        optString2 = optJSONObject.optString(MessageKey.MSG_TYPE);
                    } else {
                        optString2 = null;
                    }
                    if (optJSONObject != null) {
                        optString3 = optJSONObject.optString("link");
                    } else {
                        optString3 = null;
                    }
                    if (!(optString == null || optString2 == null)) {
                        LoggingBehavior loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_INFO;
                        if (optString2.equals("warning")) {
                            loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_WARNING;
                        }
                        if (!af.m1523a(optString3)) {
                            optString = optString + " Link: " + optString3;
                        }
                        Logger.m1682a(loggingBehavior, GraphRequest.f2707a, optString);
                    }
                }
            }
            if (this.f2693a != null) {
                this.f2693a.m857a(graphResponse);
            }
        }
    }

    /* renamed from: com.facebook.p.4 */
    static class GraphRequest implements Runnable {
        final /* synthetic */ ArrayList f2695a;
        final /* synthetic */ GraphRequestBatch f2696b;

        GraphRequest(ArrayList arrayList, GraphRequestBatch graphRequestBatch) {
            this.f2695a = arrayList;
            this.f2696b = graphRequestBatch;
        }

        public final void run() {
            Iterator it = this.f2695a.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                ((GraphRequest) pair.first).m857a((GraphResponse) pair.second);
            }
            for (GraphRequestBatch a : this.f2696b.f2733e) {
                a.m905a();
            }
        }
    }

    /* renamed from: com.facebook.p.e */
    private interface GraphRequest {
        void m2600a(String str, String str2);
    }

    /* renamed from: com.facebook.p.5 */
    class GraphRequest implements GraphRequest {
        final /* synthetic */ ArrayList f2697a;
        final /* synthetic */ GraphRequest f2698b;

        GraphRequest(GraphRequest graphRequest, ArrayList arrayList) {
            this.f2698b = graphRequest;
            this.f2697a = arrayList;
        }

        public final void m2601a(String str, String str2) {
            this.f2697a.add(String.format(Locale.US, "%s=%s", new Object[]{str, URLEncoder.encode(str2, GameManager.DEFAULT_CHARSET)}));
        }
    }

    /* renamed from: com.facebook.p.a */
    private static class GraphRequest {
        final GraphRequest f2699a;
        final Object f2700b;

        public GraphRequest(GraphRequest graphRequest, Object obj) {
            this.f2699a = graphRequest;
            this.f2700b = obj;
        }
    }

    /* renamed from: com.facebook.p.c */
    public interface GraphRequest {
        void m2602a(JSONArray jSONArray);
    }

    /* renamed from: com.facebook.p.d */
    public interface GraphRequest {
        void m2603a(JSONObject jSONObject);
    }

    /* renamed from: com.facebook.p.f */
    public interface GraphRequest extends GraphRequest {
    }

    /* renamed from: com.facebook.p.g */
    public static class GraphRequest<RESOURCE extends Parcelable> implements Parcelable {
        public static final Creator<GraphRequest> CREATOR;
        final String f2701a;
        final RESOURCE f2702b;

        /* renamed from: com.facebook.p.g.1 */
        static class GraphRequest implements Creator<GraphRequest> {
            GraphRequest() {
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new GraphRequest[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new GraphRequest((byte) 0);
            }
        }

        public final int describeContents() {
            return 1;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f2701a);
            parcel.writeParcelable(this.f2702b, i);
        }

        static {
            CREATOR = new GraphRequest();
        }

        public GraphRequest(RESOURCE resource, String str) {
            this.f2701a = str;
            this.f2702b = resource;
        }

        private GraphRequest(Parcel parcel) {
            this.f2701a = parcel.readString();
            this.f2702b = parcel.readParcelable(FacebookSdk.m2586f().getClassLoader());
        }
    }

    /* renamed from: com.facebook.p.h */
    private static class GraphRequest implements GraphRequest {
        private final OutputStream f2703a;
        private final Logger f2704b;
        private boolean f2705c;
        private boolean f2706d;

        public GraphRequest(OutputStream outputStream, Logger logger, boolean z) {
            this.f2705c = true;
            this.f2706d = false;
            this.f2703a = outputStream;
            this.f2704b = logger;
            this.f2706d = z;
        }

        public final void m2611a(String str, Object obj, GraphRequest graphRequest) {
            if (this.f2703a instanceof ac) {
                ((ac) this.f2703a).m889a(graphRequest);
            }
            if (GraphRequest.m2637d(obj)) {
                m2612a(str, GraphRequest.m2639e(obj));
            } else if (obj instanceof Bitmap) {
                Bitmap bitmap = (Bitmap) obj;
                m2607a(str, str, "image/png");
                bitmap.compress(CompressFormat.PNG, 100, this.f2703a);
                m2610b(LetterIndexBar.SEARCH_ICON_LETTER, new Object[0]);
                m2609b();
                if (this.f2704b != null) {
                    this.f2704b.m1689a("    " + str, (Object) "<Image>");
                }
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                m2607a(str, str, "content/unknown");
                this.f2703a.write(bArr);
                m2610b(LetterIndexBar.SEARCH_ICON_LETTER, new Object[0]);
                m2609b();
                if (this.f2704b != null) {
                    this.f2704b.m1689a("    " + str, String.format(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(bArr.length)}));
                }
            } else if (obj instanceof Uri) {
                m2605a(str, (Uri) obj, null);
            } else if (obj instanceof ParcelFileDescriptor) {
                m2606a(str, (ParcelFileDescriptor) obj, null);
            } else if (obj instanceof GraphRequest) {
                GraphRequest graphRequest2 = (GraphRequest) obj;
                Parcelable parcelable = graphRequest2.f2702b;
                String str2 = graphRequest2.f2701a;
                if (parcelable instanceof ParcelFileDescriptor) {
                    m2606a(str, (ParcelFileDescriptor) parcelable, str2);
                } else if (parcelable instanceof Uri) {
                    m2605a(str, (Uri) parcelable, str2);
                } else {
                    throw GraphRequest.m2604a();
                }
            } else {
                throw GraphRequest.m2604a();
            }
        }

        private static RuntimeException m2604a() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        public final void m2613a(String str, JSONArray jSONArray, Collection<GraphRequest> collection) {
            if (this.f2703a instanceof ac) {
                ac acVar = (ac) this.f2703a;
                m2607a(str, null, null);
                m2608a("[", new Object[0]);
                int i = 0;
                for (GraphRequest graphRequest : collection) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    acVar.m889a(graphRequest);
                    if (i > 0) {
                        m2608a(",%s", jSONObject.toString());
                    } else {
                        m2608a("%s", jSONObject.toString());
                    }
                    i++;
                }
                m2608a("]", new Object[0]);
                if (this.f2704b != null) {
                    this.f2704b.m1689a("    " + str, jSONArray.toString());
                    return;
                }
                return;
            }
            m2612a(str, jSONArray.toString());
        }

        public final void m2612a(String str, String str2) {
            m2607a(str, null, null);
            m2610b("%s", str2);
            m2609b();
            if (this.f2704b != null) {
                this.f2704b.m1689a("    " + str, (Object) str2);
            }
        }

        private void m2605a(String str, Uri uri, String str2) {
            int i;
            if (str2 == null) {
                str2 = "content/unknown";
            }
            m2607a(str, str, str2);
            if (this.f2703a instanceof ProgressNoopOutputStream) {
                ((ProgressNoopOutputStream) this.f2703a).m2668a(af.m1538e(uri));
                i = 0;
            } else {
                i = af.m1490a(FacebookSdk.m2586f().getContentResolver().openInputStream(uri), this.f2703a) + 0;
            }
            m2610b(LetterIndexBar.SEARCH_ICON_LETTER, new Object[0]);
            m2609b();
            if (this.f2704b != null) {
                this.f2704b.m1689a("    " + str, String.format(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(i)}));
            }
        }

        private void m2606a(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) {
            int i;
            if (str2 == null) {
                str2 = "content/unknown";
            }
            m2607a(str, str, str2);
            if (this.f2703a instanceof ProgressNoopOutputStream) {
                ((ProgressNoopOutputStream) this.f2703a).m2668a(parcelFileDescriptor.getStatSize());
                i = 0;
            } else {
                i = af.m1490a(new AutoCloseInputStream(parcelFileDescriptor), this.f2703a) + 0;
            }
            m2610b(LetterIndexBar.SEARCH_ICON_LETTER, new Object[0]);
            m2609b();
            if (this.f2704b != null) {
                this.f2704b.m1689a("    " + str, String.format(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(i)}));
            }
        }

        private void m2609b() {
            if (this.f2706d) {
                this.f2703a.write("&".getBytes());
                return;
            }
            m2610b("--%s", "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f");
        }

        private void m2607a(String str, String str2, String str3) {
            if (this.f2706d) {
                this.f2703a.write(String.format("%s=", new Object[]{str}).getBytes());
                return;
            }
            m2608a("Content-Disposition: form-data; name=\"%s\"", str);
            if (str2 != null) {
                m2608a("; filename=\"%s\"", str2);
            }
            m2610b(LetterIndexBar.SEARCH_ICON_LETTER, new Object[0]);
            if (str3 != null) {
                m2610b("%s: %s", "Content-Type", str3);
            }
            m2610b(LetterIndexBar.SEARCH_ICON_LETTER, new Object[0]);
        }

        private void m2608a(String str, Object... objArr) {
            if (this.f2706d) {
                this.f2703a.write(URLEncoder.encode(String.format(Locale.US, str, objArr), GameManager.DEFAULT_CHARSET).getBytes());
                return;
            }
            if (this.f2705c) {
                this.f2703a.write("--".getBytes());
                this.f2703a.write("3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f".getBytes());
                this.f2703a.write("\r\n".getBytes());
                this.f2705c = false;
            }
            this.f2703a.write(String.format(str, objArr).getBytes());
        }

        private void m2610b(String str, Object... objArr) {
            m2608a(str, objArr);
            if (!this.f2706d) {
                m2608a("\r\n", new Object[0]);
            }
        }
    }

    static {
        f2707a = GraphRequest.class.getSimpleName();
        f2709i = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public GraphRequest() {
        this(null, null, null, null, null);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod, GraphRequest graphRequest) {
        this(accessToken, str, bundle, httpMethod, graphRequest, (byte) 0);
    }

    private GraphRequest(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod, GraphRequest graphRequest, byte b) {
        this.f2721n = true;
        this.f2716g = false;
        this.f2711b = accessToken;
        this.f2718k = str;
        this.f2723p = null;
        m2643a(graphRequest);
        if (this.f2722o == null || httpMethod == HttpMethod.GET) {
            if (httpMethod == null) {
                httpMethod = HttpMethod.GET;
            }
            this.f2717j = httpMethod;
            if (bundle != null) {
                this.f2713d = new Bundle(bundle);
            } else {
                this.f2713d = new Bundle();
            }
            if (this.f2723p == null) {
                this.f2723p = FacebookSdk.m2587g();
                return;
            }
            return;
        }
        throw new FacebookException("Can't change HTTP method on request with overridden URL.");
    }

    public static GraphRequest m2615a(AccessToken accessToken, GraphRequest graphRequest) {
        return new GraphRequest(accessToken, "me", null, null, new GraphRequest(graphRequest));
    }

    public static GraphRequest m2617a(String str, JSONObject jSONObject) {
        GraphRequest graphRequest = new GraphRequest(null, str, null, HttpMethod.POST, null);
        graphRequest.f2712c = jSONObject;
        return graphRequest;
    }

    public static GraphRequest m2614a(AccessToken accessToken, GraphRequest graphRequest) {
        return new GraphRequest(accessToken, "me/friends", null, null, new GraphRequest(graphRequest));
    }

    public static GraphRequest m2616a(String str) {
        return new GraphRequest(null, str, null, null, null);
    }

    public final void m2643a(GraphRequest graphRequest) {
        if (FacebookSdk.m2577a(LoggingBehavior.GRAPH_API_DEBUG_INFO) || FacebookSdk.m2577a(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
            this.f2714e = new GraphRequest(this, graphRequest);
        } else {
            this.f2714e = graphRequest;
        }
    }

    public final GraphResponse m2642a() {
        Object obj = new GraphRequest[]{this};
        ag.m1544a(obj, "requests");
        List a = GraphRequest.m2618a(new GraphRequestBatch(Arrays.asList(obj)));
        if (a != null && a.size() == 1) {
            return (GraphResponse) a.get(0);
        }
        throw new FacebookException("invalid state: expected a single response");
    }

    public final GraphRequestAsyncTask m2644b() {
        Object obj = new GraphRequest[]{this};
        ag.m1544a(obj, "requests");
        return GraphRequest.m2629b(new GraphRequestBatch(Arrays.asList(obj)));
    }

    private static HttpURLConnection m2632c(GraphRequestBatch graphRequestBatch) {
        String str;
        OutputStream bufferedOutputStream;
        Throwable th;
        OutputStream progressNoopOutputStream;
        URLConnection uRLConnection;
        Iterator it = graphRequestBatch.iterator();
        while (it.hasNext()) {
            GraphRequest graphRequest = (GraphRequest) it.next();
            if (HttpMethod.GET.equals(graphRequest.f2717j)) {
                int i;
                str = graphRequest.f2723p;
                if (af.m1523a(str)) {
                    i = 1;
                } else {
                    if (str.startsWith("v")) {
                        str = str.substring(1);
                    }
                    String[] split = str.split("\\.");
                    i = ((split.length < 2 || Integer.parseInt(split[0]) <= 2) && (Integer.parseInt(split[0]) < 2 || Integer.parseInt(split[1]) < 4)) ? 0 : 1;
                }
                if (i != 0) {
                    Bundle bundle = graphRequest.f2713d;
                    if (!bundle.containsKey("fields") || af.m1523a(bundle.getString("fields"))) {
                        Logger.m1686b(LoggingBehavior.DEVELOPER_ERRORS, "Request", "starting with Graph API v2.4, GET requests for /%s should contain an explicit \"fields\" parameter.", graphRequest.f2718k);
                    }
                }
            }
        }
        try {
            URL url;
            if (graphRequestBatch.size() == 1) {
                GraphRequest a = graphRequestBatch.m2646a(0);
                if (a.f2722o != null) {
                    str = a.f2722o.toString();
                } else {
                    if (a.f2717j == HttpMethod.POST && a.f2718k != null && a.f2718k.endsWith("/videos")) {
                        str = ac.m1480c();
                    } else {
                        str = ac.m1479b();
                    }
                    str = String.format("%s/%s", new Object[]{str, a.m2638e()});
                    a.m2633c();
                    str = a.m2631b(str);
                }
                url = new URL(str);
            } else {
                url = new URL(ac.m1479b());
            }
            try {
                URLConnection uRLConnection2 = (HttpURLConnection) url.openConnection();
                String str2 = "User-Agent";
                if (f2710q == null) {
                    f2710q = String.format("%s.%s", new Object[]{"FBAndroidSDK", "4.18.0"});
                    if (!af.m1523a(InternalSettings.f1753a)) {
                        f2710q = String.format(Locale.ROOT, "%s/%s", new Object[]{f2710q, InternalSettings.f1753a});
                    }
                }
                uRLConnection2.setRequestProperty(str2, f2710q);
                uRLConnection2.setRequestProperty("Accept-Language", Locale.getDefault().toString());
                uRLConnection2.setChunkedStreamingMode(0);
                try {
                    Logger logger = new Logger(LoggingBehavior.REQUESTS, "Request");
                    int size = graphRequestBatch.size();
                    boolean e = GraphRequest.m2640e(graphRequestBatch);
                    HttpMethod httpMethod = size == 1 ? graphRequestBatch.m2646a(0).f2717j : HttpMethod.POST;
                    uRLConnection2.setRequestMethod(httpMethod.name());
                    if (e) {
                        uRLConnection2.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                        uRLConnection2.setRequestProperty("Content-Encoding", "gzip");
                    } else {
                        uRLConnection2.setRequestProperty("Content-Type", String.format("multipart/form-data; boundary=%s", new Object[]{"3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f"}));
                    }
                    Object url2 = uRLConnection2.getURL();
                    logger.m1690b("Request:\n");
                    logger.m1689a("Id", graphRequestBatch.f2732d);
                    logger.m1689a("URL", url2);
                    logger.m1689a("Method", uRLConnection2.getRequestMethod());
                    logger.m1689a("User-Agent", uRLConnection2.getRequestProperty("User-Agent"));
                    logger.m1689a("Content-Type", uRLConnection2.getRequestProperty("Content-Type"));
                    uRLConnection2.setConnectTimeout(graphRequestBatch.f2731c);
                    uRLConnection2.setReadTimeout(graphRequestBatch.f2731c);
                    if ((httpMethod == HttpMethod.POST ? 1 : 0) == 0) {
                        logger.m1688a();
                    } else {
                        uRLConnection2.setDoOutput(true);
                        try {
                            bufferedOutputStream = new BufferedOutputStream(uRLConnection2.getOutputStream());
                            if (e) {
                                try {
                                    bufferedOutputStream = new GZIPOutputStream(bufferedOutputStream);
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (bufferedOutputStream != null) {
                                        bufferedOutputStream.close();
                                    }
                                    throw th;
                                }
                            }
                            if (GraphRequest.m2636d(graphRequestBatch)) {
                                progressNoopOutputStream = new ProgressNoopOutputStream(graphRequestBatch.f2729a);
                                GraphRequest.m2622a(graphRequestBatch, null, size, url2, progressNoopOutputStream, e);
                                progressNoopOutputStream = new aa(bufferedOutputStream, graphRequestBatch, progressNoopOutputStream.f2768a, (long) progressNoopOutputStream.f2769b);
                            } else {
                                progressNoopOutputStream = bufferedOutputStream;
                            }
                            try {
                                GraphRequest.m2622a(graphRequestBatch, logger, size, url2, progressNoopOutputStream, e);
                                progressNoopOutputStream.close();
                                logger.m1688a();
                            } catch (Throwable th3) {
                                th = th3;
                                bufferedOutputStream = progressNoopOutputStream;
                                if (bufferedOutputStream != null) {
                                    bufferedOutputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            bufferedOutputStream = null;
                            if (bufferedOutputStream != null) {
                                bufferedOutputStream.close();
                            }
                            throw th;
                        }
                    }
                    return uRLConnection2;
                } catch (IOException e2) {
                    th = e2;
                    uRLConnection = uRLConnection2;
                    af.m1517a(uRLConnection);
                    throw new FacebookException("could not construct request body", th);
                } catch (JSONException e3) {
                    th = e3;
                    uRLConnection = uRLConnection2;
                    af.m1517a(uRLConnection);
                    throw new FacebookException("could not construct request body", th);
                }
            } catch (IOException e4) {
                th = e4;
                uRLConnection = null;
                af.m1517a(uRLConnection);
                throw new FacebookException("could not construct request body", th);
            } catch (JSONException e5) {
                th = e5;
                uRLConnection = null;
                af.m1517a(uRLConnection);
                throw new FacebookException("could not construct request body", th);
            }
        } catch (Throwable th5) {
            throw new FacebookException("could not construct URL for request", th5);
        }
    }

    public static List<GraphResponse> m2618a(GraphRequestBatch graphRequestBatch) {
        List<GraphResponse> a;
        URLConnection uRLConnection = null;
        ag.m1546a((Collection) graphRequestBatch, "requests");
        try {
            uRLConnection = GraphRequest.m2632c(graphRequestBatch);
            a = GraphRequest.m2619a((HttpURLConnection) uRLConnection, graphRequestBatch);
        } catch (Throwable e) {
            a = GraphResponse.m2650a(graphRequestBatch.f2730b, null, new FacebookException(e));
            GraphRequest.m2623a(graphRequestBatch, (List) a);
        } finally {
            af.m1517a(uRLConnection);
        }
        return a;
    }

    public static GraphRequestAsyncTask m2629b(GraphRequestBatch graphRequestBatch) {
        ag.m1546a((Collection) graphRequestBatch, "requests");
        GraphRequestAsyncTask graphRequestAsyncTask = new GraphRequestAsyncTask(graphRequestBatch);
        graphRequestAsyncTask.executeOnExecutor(FacebookSdk.m2583d(), new Void[0]);
        return graphRequestAsyncTask;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.facebook.GraphResponse> m2619a(java.net.HttpURLConnection r10, com.facebook.GraphRequestBatch r11) {
        /*
        r0 = 1;
        r1 = 0;
        r2 = com.facebook.GraphResponse.m2648a(r10, r11);
        com.facebook.p036h.af.m1517a(r10);
        r3 = r11.size();
        r4 = r2.size();
        if (r3 == r4) goto L_0x0034;
    L_0x0013:
        r4 = new com.facebook.i;
        r5 = java.util.Locale.US;
        r6 = "Received %d responses while expecting %d";
        r7 = 2;
        r7 = new java.lang.Object[r7];
        r2 = r2.size();
        r2 = java.lang.Integer.valueOf(r2);
        r7[r1] = r2;
        r1 = java.lang.Integer.valueOf(r3);
        r7[r0] = r1;
        r0 = java.lang.String.format(r5, r6, r7);
        r4.<init>(r0);
        throw r4;
    L_0x0034:
        com.facebook.GraphRequest.m2623a(r11, r2);
        r3 = com.facebook.AccessTokenManager.m999a();
        r4 = r3.f1096b;
        if (r4 == 0) goto L_0x008f;
    L_0x003f:
        r4 = new java.util.Date;
        r4.<init>();
        r4 = r4.getTime();
        r4 = java.lang.Long.valueOf(r4);
        r5 = r3.f1096b;
        r5 = r5.f923e;
        r5 = r5.f1209j;
        if (r5 == 0) goto L_0x008f;
    L_0x0054:
        r6 = r4.longValue();
        r5 = r3.f1097c;
        r8 = r5.getTime();
        r6 = r6 - r8;
        r8 = 3600000; // 0x36ee80 float:5.044674E-39 double:1.7786363E-317;
        r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r5 <= 0) goto L_0x008f;
    L_0x0066:
        r4 = r4.longValue();
        r6 = r3.f1096b;
        r6 = r6.f924f;
        r6 = r6.getTime();
        r4 = r4 - r6;
        r6 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r4 <= 0) goto L_0x008f;
    L_0x007a:
        if (r0 == 0) goto L_0x008e;
    L_0x007c:
        r0 = android.os.Looper.getMainLooper();
        r1 = android.os.Looper.myLooper();
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0091;
    L_0x008a:
        r0 = 0;
        r3.m1002a(r0);
    L_0x008e:
        return r2;
    L_0x008f:
        r0 = r1;
        goto L_0x007a;
    L_0x0091:
        r0 = new android.os.Handler;
        r1 = android.os.Looper.getMainLooper();
        r0.<init>(r1);
        r1 = new com.facebook.c$1;
        r1.<init>(r3);
        r0.post(r1);
        goto L_0x008e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p.a(java.net.HttpURLConnection, com.facebook.r):java.util.List<com.facebook.s>");
    }

    public String toString() {
        return "{Request:  accessToken: " + (this.f2711b == null ? "null" : this.f2711b) + ", graphPath: " + this.f2718k + ", graphObject: " + this.f2712c + ", httpMethod: " + this.f2717j + ", parameters: " + this.f2713d + "}";
    }

    private static void m2623a(GraphRequestBatch graphRequestBatch, List<GraphResponse> list) {
        int size = graphRequestBatch.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            GraphRequest a = graphRequestBatch.m2646a(i);
            if (a.f2714e != null) {
                arrayList.add(new Pair(a.f2714e, list.get(i)));
            }
        }
        if (arrayList.size() > 0) {
            Runnable graphRequest = new GraphRequest(arrayList, graphRequestBatch);
            Handler handler = graphRequestBatch.f2729a;
            if (handler == null) {
                graphRequest.run();
            } else {
                handler.post(graphRequest);
            }
        }
    }

    private void m2633c() {
        String str;
        if (this.f2711b != null) {
            if (!this.f2713d.containsKey(WBConstants.AUTH_ACCESS_TOKEN)) {
                str = this.f2711b.f922d;
                Logger.m1684a(str);
                this.f2713d.putString(WBConstants.AUTH_ACCESS_TOKEN, str);
            }
        } else if (!(this.f2716g || this.f2713d.containsKey(WBConstants.AUTH_ACCESS_TOKEN))) {
            str = FacebookSdk.m2590j();
            String l = FacebookSdk.m2592l();
            if (!(af.m1523a(str) || af.m1523a(l))) {
                this.f2713d.putString(WBConstants.AUTH_ACCESS_TOKEN, str + "|" + l);
            }
        }
        this.f2713d.putString("sdk", "android");
        this.f2713d.putString("format", "json");
        if (FacebookSdk.m2577a(LoggingBehavior.GRAPH_API_DEBUG_INFO)) {
            this.f2713d.putString("debug", "info");
        } else if (FacebookSdk.m2577a(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
            this.f2713d.putString("debug", "warning");
        }
    }

    private String m2631b(String str) {
        Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.f2713d.keySet()) {
            Object obj = this.f2713d.get(str2);
            if (obj == null) {
                obj = LetterIndexBar.SEARCH_ICON_LETTER;
            }
            if (GraphRequest.m2637d(obj)) {
                buildUpon.appendQueryParameter(str2, GraphRequest.m2639e(obj).toString());
            } else if (this.f2717j == HttpMethod.GET) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unsupported parameter type for GET request: %s", new Object[]{obj.getClass().getSimpleName()}));
            }
        }
        return buildUpon.toString();
    }

    private String m2635d() {
        if (this.f2722o != null) {
            throw new FacebookException("Can't override URL for a batch request");
        }
        String format = String.format("%s/%s", new Object[]{ac.m1479b(), m2638e()});
        m2633c();
        Uri parse = Uri.parse(m2631b(format));
        return String.format("%s?%s", new Object[]{parse.getPath(), parse.getQuery()});
    }

    private String m2638e() {
        if (f2709i.matcher(this.f2718k).matches()) {
            return this.f2718k;
        }
        return String.format("%s/%s", new Object[]{this.f2723p, this.f2718k});
    }

    private void m2626a(JSONArray jSONArray, Map<String, GraphRequest> map) {
        JSONObject jSONObject = new JSONObject();
        if (this.f2719l != null) {
            jSONObject.put(SelectCountryActivity.EXTRA_COUNTRY_NAME, this.f2719l);
            jSONObject.put("omit_response_on_success", this.f2721n);
        }
        if (this.f2720m != null) {
            jSONObject.put("depends_on", this.f2720m);
        }
        String d = m2635d();
        jSONObject.put("relative_url", d);
        jSONObject.put("method", this.f2717j);
        if (this.f2711b != null) {
            Logger.m1684a(this.f2711b.f922d);
        }
        Iterable arrayList = new ArrayList();
        for (String str : this.f2713d.keySet()) {
            Object obj = this.f2713d.get(str);
            if (GraphRequest.m2634c(obj)) {
                String format = String.format(Locale.ROOT, "%s%d", new Object[]{"file", Integer.valueOf(map.size())});
                arrayList.add(format);
                map.put(format, new GraphRequest(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(",", arrayList));
        }
        if (this.f2712c != null) {
            Iterable arrayList2 = new ArrayList();
            GraphRequest.m2627a(this.f2712c, d, new GraphRequest(this, arrayList2));
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    private static boolean m2636d(GraphRequestBatch graphRequestBatch) {
        for (GraphRequestBatch graphRequestBatch2 : graphRequestBatch.f2733e) {
            if (graphRequestBatch2 instanceof GraphRequestBatch) {
                return true;
            }
        }
        Iterator it = graphRequestBatch.iterator();
        while (it.hasNext()) {
            if (((GraphRequest) it.next()).f2714e instanceof GraphRequest) {
                return true;
            }
        }
        return false;
    }

    private static boolean m2640e(GraphRequestBatch graphRequestBatch) {
        Iterator it = graphRequestBatch.iterator();
        while (it.hasNext()) {
            GraphRequest graphRequest = (GraphRequest) it.next();
            for (String str : graphRequest.f2713d.keySet()) {
                if (GraphRequest.m2634c(graphRequest.f2713d.get(str))) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void m2622a(GraphRequestBatch graphRequestBatch, Logger logger, int i, URL url, OutputStream outputStream, boolean z) {
        GraphRequest graphRequest = new GraphRequest(outputStream, logger, z);
        String f;
        if (i == 1) {
            GraphRequest a = graphRequestBatch.m2646a(0);
            Map hashMap = new HashMap();
            for (String f2 : a.f2713d.keySet()) {
                Object obj = a.f2713d.get(f2);
                if (GraphRequest.m2634c(obj)) {
                    hashMap.put(f2, new GraphRequest(a, obj));
                }
            }
            if (logger != null) {
                logger.m1690b("  Parameters:\n");
            }
            GraphRequest.m2620a(a.f2713d, graphRequest, a);
            if (logger != null) {
                logger.m1690b("  Attachments:\n");
            }
            GraphRequest.m2625a(hashMap, graphRequest);
            if (a.f2712c != null) {
                GraphRequest.m2627a(a.f2712c, url.getPath(), (GraphRequest) graphRequest);
                return;
            }
            return;
        }
        f2 = GraphRequest.m2641f(graphRequestBatch);
        if (af.m1523a(f2)) {
            throw new FacebookException("App ID was not specified at the request or Settings.");
        }
        graphRequest.m2612a("batch_app_id", f2);
        Map hashMap2 = new HashMap();
        GraphRequest.m2621a(graphRequest, (Collection) graphRequestBatch, hashMap2);
        if (logger != null) {
            logger.m1690b("  Attachments:\n");
        }
        GraphRequest.m2625a(hashMap2, graphRequest);
    }

    private static void m2627a(JSONObject jSONObject, String str, GraphRequest graphRequest) {
        String group;
        int i;
        int indexOf;
        Matcher matcher = f2709i.matcher(str);
        if (matcher.matches()) {
            group = matcher.group(1);
        } else {
            group = str;
        }
        if (group.startsWith("me/") || group.startsWith("/me/")) {
            i = 1;
        } else {
            i = 0;
        }
        if (i != 0) {
            i = str.indexOf(":");
            indexOf = str.indexOf("?");
            i = (i <= 3 || (indexOf != -1 && i >= indexOf)) ? 0 : 1;
            indexOf = i;
        } else {
            indexOf = 0;
        }
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            boolean z;
            group = (String) keys.next();
            Object opt = jSONObject.opt(group);
            if (indexOf == 0 || !group.equalsIgnoreCase(WBConstants.GAME_PARAMS_GAME_IMAGE_URL)) {
                z = false;
            } else {
                z = true;
            }
            GraphRequest.m2624a(group, opt, graphRequest, z);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m2624a(java.lang.String r10, java.lang.Object r11, com.facebook.GraphRequest.GraphRequest r12, boolean r13) {
        /*
        r9 = 2;
        r8 = 1;
        r2 = 0;
        r0 = r11;
    L_0x0004:
        r1 = r0.getClass();
        r3 = org.json.JSONObject.class;
        r3 = r3.isAssignableFrom(r1);
        if (r3 == 0) goto L_0x0063;
    L_0x0010:
        r0 = (org.json.JSONObject) r0;
        if (r13 == 0) goto L_0x0038;
    L_0x0014:
        r3 = r0.keys();
    L_0x0018:
        r1 = r3.hasNext();
        if (r1 == 0) goto L_0x00af;
    L_0x001e:
        r1 = r3.next();
        r1 = (java.lang.String) r1;
        r4 = "%s[%s]";
        r5 = new java.lang.Object[r9];
        r5[r2] = r10;
        r5[r8] = r1;
        r4 = java.lang.String.format(r4, r5);
        r1 = r0.opt(r1);
        com.facebook.GraphRequest.m2624a(r4, r1, r12, r13);
        goto L_0x0018;
    L_0x0038:
        r1 = "id";
        r1 = r0.has(r1);
        if (r1 == 0) goto L_0x0047;
    L_0x0040:
        r1 = "id";
        r0 = r0.optString(r1);
        goto L_0x0004;
    L_0x0047:
        r1 = "url";
        r1 = r0.has(r1);
        if (r1 == 0) goto L_0x0056;
    L_0x004f:
        r1 = "url";
        r0 = r0.optString(r1);
        goto L_0x0004;
    L_0x0056:
        r1 = "fbsdk:create_object";
        r1 = r0.has(r1);
        if (r1 == 0) goto L_0x00af;
    L_0x005e:
        r0 = r0.toString();
        goto L_0x0004;
    L_0x0063:
        r3 = org.json.JSONArray.class;
        r3 = r3.isAssignableFrom(r1);
        if (r3 == 0) goto L_0x0090;
    L_0x006b:
        r0 = (org.json.JSONArray) r0;
        r3 = r0.length();
        r1 = r2;
    L_0x0072:
        if (r1 >= r3) goto L_0x00af;
    L_0x0074:
        r4 = java.util.Locale.ROOT;
        r5 = "%s[%d]";
        r6 = new java.lang.Object[r9];
        r6[r2] = r10;
        r7 = java.lang.Integer.valueOf(r1);
        r6[r8] = r7;
        r4 = java.lang.String.format(r4, r5, r6);
        r5 = r0.opt(r1);
        com.facebook.GraphRequest.m2624a(r4, r5, r12, r13);
        r1 = r1 + 1;
        goto L_0x0072;
    L_0x0090:
        r2 = java.lang.String.class;
        r2 = r2.isAssignableFrom(r1);
        if (r2 != 0) goto L_0x00a8;
    L_0x0098:
        r2 = java.lang.Number.class;
        r2 = r2.isAssignableFrom(r1);
        if (r2 != 0) goto L_0x00a8;
    L_0x00a0:
        r2 = java.lang.Boolean.class;
        r2 = r2.isAssignableFrom(r1);
        if (r2 == 0) goto L_0x00b0;
    L_0x00a8:
        r0 = r0.toString();
        r12.m2600a(r10, r0);
    L_0x00af:
        return;
    L_0x00b0:
        r2 = java.util.Date.class;
        r1 = r2.isAssignableFrom(r1);
        if (r1 == 0) goto L_0x00af;
    L_0x00b8:
        r0 = (java.util.Date) r0;
        r1 = new java.text.SimpleDateFormat;
        r2 = "yyyy-MM-dd'T'HH:mm:ssZ";
        r3 = java.util.Locale.US;
        r1.<init>(r2, r3);
        r0 = r1.format(r0);
        r12.m2600a(r10, r0);
        goto L_0x00af;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p.a(java.lang.String, java.lang.Object, com.facebook.p$e, boolean):void");
    }

    private static void m2620a(Bundle bundle, GraphRequest graphRequest, GraphRequest graphRequest2) {
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (GraphRequest.m2637d(obj)) {
                graphRequest.m2611a(str, obj, graphRequest2);
            }
        }
    }

    private static void m2625a(Map<String, GraphRequest> map, GraphRequest graphRequest) {
        for (String str : map.keySet()) {
            GraphRequest graphRequest2 = (GraphRequest) map.get(str);
            if (GraphRequest.m2634c(graphRequest2.f2700b)) {
                graphRequest.m2611a(str, graphRequest2.f2700b, graphRequest2.f2699a);
            }
        }
    }

    private static void m2621a(GraphRequest graphRequest, Collection<GraphRequest> collection, Map<String, GraphRequest> map) {
        JSONArray jSONArray = new JSONArray();
        for (GraphRequest a : collection) {
            a.m2626a(jSONArray, (Map) map);
        }
        graphRequest.m2613a("batch", jSONArray, (Collection) collection);
    }

    private static boolean m2634c(Object obj) {
        return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof GraphRequest);
    }

    private static boolean m2637d(Object obj) {
        return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
    }

    private static String m2639e(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if ((obj instanceof Boolean) || (obj instanceof Number)) {
            return obj.toString();
        }
        if (obj instanceof Date) {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format(obj);
        }
        throw new IllegalArgumentException("Unsupported parameter type.");
    }

    private static String m2641f(GraphRequestBatch graphRequestBatch) {
        if (!af.m1523a(graphRequestBatch.f2734f)) {
            return graphRequestBatch.f2734f;
        }
        Iterator it = graphRequestBatch.iterator();
        while (it.hasNext()) {
            AccessToken accessToken = ((GraphRequest) it.next()).f2711b;
            if (accessToken != null) {
                String str = accessToken.f925g;
                if (str != null) {
                    return str;
                }
            }
        }
        if (af.m1523a(f2708h)) {
            return FacebookSdk.m2590j();
        }
        return f2708h;
    }
}
