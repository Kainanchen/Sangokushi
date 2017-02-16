package bolts;

import android.content.Context;
import android.net.Uri;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import bolts.AppLink.Target;
import com.sina.weibo.sdk.component.GameManager;
import com.tencent.android.tpush.common.MessageKey;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

public class WebViewAppLinkResolver implements AppLinkResolver {
    private static final String KEY_AL_VALUE = "value";
    private static final String KEY_ANDROID = "android";
    private static final String KEY_APP_NAME = "app_name";
    private static final String KEY_CLASS = "class";
    private static final String KEY_PACKAGE = "package";
    private static final String KEY_SHOULD_FALLBACK = "should_fallback";
    private static final String KEY_URL = "url";
    private static final String KEY_WEB = "web";
    private static final String KEY_WEB_URL = "url";
    private static final String META_TAG_PREFIX = "al";
    private static final String PREFER_HEADER = "Prefer-Html-Meta-Tags";
    private static final String TAG_EXTRACTION_JAVASCRIPT = "javascript:boltsWebViewAppLinkResolverResult.setValue((function() {  var metaTags = document.getElementsByTagName('meta');  var results = [];  for (var i = 0; i < metaTags.length; i++) {    var property = metaTags[i].getAttribute('property');    if (property && property.substring(0, 'al:'.length) === 'al:') {      var tag = { \"property\": metaTags[i].getAttribute('property') };      if (metaTags[i].hasAttribute('content')) {        tag['content'] = metaTags[i].getAttribute('content');      }      results.push(tag);    }  }  return JSON.stringify(results);})())";
    private final Context context;

    /* renamed from: bolts.WebViewAppLinkResolver.1 */
    class C02521 implements Continuation<JSONArray, AppLink> {
        final /* synthetic */ Uri val$url;

        C02521(Uri uri) {
            this.val$url = uri;
        }

        public AppLink then(Task<JSONArray> task) {
            return WebViewAppLinkResolver.makeAppLinkFromAlData(WebViewAppLinkResolver.parseAlData((JSONArray) task.getResult()), this.val$url);
        }
    }

    /* renamed from: bolts.WebViewAppLinkResolver.2 */
    class C02552 implements Continuation<Void, Task<JSONArray>> {
        final /* synthetic */ Capture val$content;
        final /* synthetic */ Capture val$contentType;
        final /* synthetic */ Uri val$url;

        /* renamed from: bolts.WebViewAppLinkResolver.2.1 */
        class C02531 extends WebViewClient {
            private boolean loaded;

            C02531() {
                this.loaded = false;
            }

            private void runJavaScript(WebView webView) {
                if (!this.loaded) {
                    this.loaded = true;
                    webView.loadUrl(WebViewAppLinkResolver.TAG_EXTRACTION_JAVASCRIPT);
                }
            }

            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                runJavaScript(webView);
            }

            public void onLoadResource(WebView webView, String str) {
                super.onLoadResource(webView, str);
                runJavaScript(webView);
            }
        }

        /* renamed from: bolts.WebViewAppLinkResolver.2.2 */
        class C02542 {
            final /* synthetic */ TaskCompletionSource val$tcs;

            C02542(TaskCompletionSource taskCompletionSource) {
                this.val$tcs = taskCompletionSource;
            }

            @JavascriptInterface
            public void setValue(String str) {
                try {
                    this.val$tcs.trySetResult(new JSONArray(str));
                } catch (Exception e) {
                    this.val$tcs.trySetError(e);
                }
            }
        }

        C02552(Capture capture, Uri uri, Capture capture2) {
            this.val$contentType = capture;
            this.val$url = uri;
            this.val$content = capture2;
        }

        public Task<JSONArray> then(Task<Void> task) {
            String str;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            WebView webView = new WebView(WebViewAppLinkResolver.this.context);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setNetworkAvailable(false);
            webView.setWebViewClient(new C02531());
            webView.addJavascriptInterface(new C02542(taskCompletionSource), "boltsWebViewAppLinkResolverResult");
            if (this.val$contentType.get() != null) {
                str = ((String) this.val$contentType.get()).split(";")[0];
            } else {
                str = null;
            }
            webView.loadDataWithBaseURL(this.val$url.toString(), (String) this.val$content.get(), str, null, null);
            return taskCompletionSource.getTask();
        }
    }

    /* renamed from: bolts.WebViewAppLinkResolver.3 */
    class C02563 implements Callable<Void> {
        final /* synthetic */ Capture val$content;
        final /* synthetic */ Capture val$contentType;
        final /* synthetic */ Uri val$url;

        C02563(Uri uri, Capture capture, Capture capture2) {
            this.val$url = uri;
            this.val$content = capture;
            this.val$contentType = capture2;
        }

        public Void call() {
            Void voidR = null;
            URL url = new URL(this.val$url.toString());
            URLConnection uRLConnection = null;
            while (url != null) {
                URLConnection openConnection = url.openConnection();
                if (openConnection instanceof HttpURLConnection) {
                    ((HttpURLConnection) openConnection).setInstanceFollowRedirects(true);
                }
                openConnection.setRequestProperty(WebViewAppLinkResolver.PREFER_HEADER, WebViewAppLinkResolver.META_TAG_PREFIX);
                openConnection.connect();
                if (openConnection instanceof HttpURLConnection) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                    if (httpURLConnection.getResponseCode() < 300 || httpURLConnection.getResponseCode() >= 400) {
                        uRLConnection = openConnection;
                        url = null;
                    } else {
                        URL url2 = new URL(httpURLConnection.getHeaderField("Location"));
                        httpURLConnection.disconnect();
                        uRLConnection = openConnection;
                        url = url2;
                    }
                } else {
                    uRLConnection = openConnection;
                    url = null;
                }
            }
            try {
                this.val$content.set(WebViewAppLinkResolver.readFromConnection(uRLConnection));
                this.val$contentType.set(uRLConnection.getContentType());
                return voidR;
            } finally {
                voidR = uRLConnection instanceof HttpURLConnection;
                if (voidR != null) {
                    ((HttpURLConnection) uRLConnection).disconnect();
                }
            }
        }
    }

    public WebViewAppLinkResolver(Context context) {
        this.context = context;
    }

    public Task<AppLink> getAppLinkFromUrlInBackground(Uri uri) {
        Capture capture = new Capture();
        Capture capture2 = new Capture();
        return Task.callInBackground(new C02563(uri, capture, capture2)).onSuccessTask(new C02552(capture2, uri, capture), Task.UI_THREAD_EXECUTOR).onSuccess(new C02521(uri));
    }

    private static Map<String, Object> parseAlData(JSONArray jSONArray) {
        Map hashMap = new HashMap();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String[] split = jSONObject.getString("property").split(":");
            if (split[0].equals(META_TAG_PREFIX)) {
                int i2 = 1;
                Map map = hashMap;
                while (i2 < split.length) {
                    List list;
                    Map map2;
                    List list2 = (List) map.get(split[i2]);
                    if (list2 == null) {
                        ArrayList arrayList = new ArrayList();
                        map.put(split[i2], arrayList);
                        list = arrayList;
                    } else {
                        list = list2;
                    }
                    if (list.size() > 0) {
                        map2 = (Map) list.get(list.size() - 1);
                    } else {
                        map2 = null;
                    }
                    if (map2 == null || i2 == split.length - 1) {
                        map2 = new HashMap();
                        list.add(map2);
                    }
                    i2++;
                    map = map2;
                }
                if (jSONObject.has(MessageKey.MSG_CONTENT)) {
                    if (jSONObject.isNull(MessageKey.MSG_CONTENT)) {
                        map.put(KEY_AL_VALUE, null);
                    } else {
                        map.put(KEY_AL_VALUE, jSONObject.getString(MessageKey.MSG_CONTENT));
                    }
                }
            }
        }
        return hashMap;
    }

    private static List<Map<String, Object>> getAlList(Map<String, Object> map, String str) {
        List<Map<String, Object>> list = (List) map.get(str);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    private static AppLink makeAppLinkFromAlData(Map<String, Object> map, Uri uri) {
        Uri uri2;
        List arrayList = new ArrayList();
        List list = (List) map.get(KEY_ANDROID);
        if (list == null) {
            list = Collections.emptyList();
        }
        for (Map map2 : r0) {
            Map map22;
            List alList = getAlList(map22, KEY_WEB_URL);
            List alList2 = getAlList(map22, KEY_PACKAGE);
            List alList3 = getAlList(map22, KEY_CLASS);
            List alList4 = getAlList(map22, KEY_APP_NAME);
            int max = Math.max(alList.size(), Math.max(alList2.size(), Math.max(alList3.size(), alList4.size())));
            int i = 0;
            while (i < max) {
                arrayList.add(new Target((String) (alList2.size() > i ? ((Map) alList2.get(i)).get(KEY_AL_VALUE) : null), (String) (alList3.size() > i ? ((Map) alList3.get(i)).get(KEY_AL_VALUE) : null), tryCreateUrl((String) (alList.size() > i ? ((Map) alList.get(i)).get(KEY_AL_VALUE) : null)), (String) (alList4.size() > i ? ((Map) alList4.get(i)).get(KEY_AL_VALUE) : null)));
                i++;
            }
        }
        list = (List) map.get(KEY_WEB);
        if (list == null || list.size() <= 0) {
            uri2 = uri;
        } else {
            map22 = (Map) list.get(0);
            List list2 = (List) map22.get(KEY_WEB_URL);
            list = (List) map22.get(KEY_SHOULD_FALLBACK);
            if (list != null && list.size() > 0) {
                if (Arrays.asList(new String[]{"no", "false", "0"}).contains(((String) ((Map) list.get(0)).get(KEY_AL_VALUE)).toLowerCase())) {
                    uri2 = null;
                    if (!(uri2 == null || list2 == null || list2.size() <= 0)) {
                        uri2 = tryCreateUrl((String) ((Map) list2.get(0)).get(KEY_AL_VALUE));
                    }
                }
            }
            uri2 = uri;
            uri2 = tryCreateUrl((String) ((Map) list2.get(0)).get(KEY_AL_VALUE));
        }
        return new AppLink(uri, arrayList, uri2);
    }

    private static Uri tryCreateUrl(String str) {
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }

    private static String readFromConnection(URLConnection uRLConnection) {
        InputStream inputStream;
        int i = 0;
        if (uRLConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            try {
                inputStream = uRLConnection.getInputStream();
            } catch (Exception e) {
                inputStream = httpURLConnection.getErrorStream();
            }
        } else {
            inputStream = uRLConnection.getInputStream();
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            String contentEncoding = uRLConnection.getContentEncoding();
            if (contentEncoding == null) {
                String[] split = uRLConnection.getContentType().split(";");
                int length = split.length;
                while (i < length) {
                    String trim = split[i].trim();
                    if (trim.startsWith("charset=")) {
                        contentEncoding = trim.substring(8);
                        break;
                    }
                    i++;
                }
                if (contentEncoding == null) {
                    contentEncoding = GameManager.DEFAULT_CHARSET;
                }
            }
            String str = new String(byteArrayOutputStream.toByteArray(), contentEncoding);
            return str;
        } finally {
            inputStream.close();
        }
    }
}
