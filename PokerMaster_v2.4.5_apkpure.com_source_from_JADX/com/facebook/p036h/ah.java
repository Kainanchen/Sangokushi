package com.facebook.p036h;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.AsyncTask.Status;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.AccessToken;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.FacebookServiceException;
import com.facebook.GraphRequest.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.ab.R;
import com.sina.weibo.sdk.constant.WBConstants;
import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import net.sqlcipher.database.SQLiteDatabase;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: WebDialog */
/* renamed from: com.facebook.h.ah */
public class ah extends Dialog {
    String f1593a;
    WebDialog f1594b;
    WebView f1595c;
    boolean f1596d;
    boolean f1597e;
    private String f1598f;
    private ProgressDialog f1599g;
    private ImageView f1600h;
    private FrameLayout f1601i;
    private WebDialog f1602j;
    private boolean f1603k;

    /* renamed from: com.facebook.h.ah.1 */
    class WebDialog implements OnCancelListener {
        final /* synthetic */ ah f1573a;

        WebDialog(ah ahVar) {
            this.f1573a = ahVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            this.f1573a.cancel();
        }
    }

    /* renamed from: com.facebook.h.ah.2 */
    class WebDialog implements OnClickListener {
        final /* synthetic */ ah f1574a;

        WebDialog(ah ahVar) {
            this.f1574a = ahVar;
        }

        public final void onClick(View view) {
            this.f1574a.cancel();
        }
    }

    /* renamed from: com.facebook.h.ah.3 */
    class WebDialog extends WebView {
        final /* synthetic */ ah f1575a;

        WebDialog(ah ahVar, Context context) {
            this.f1575a = ahVar;
            super(context);
        }

        public final void onWindowFocusChanged(boolean z) {
            try {
                super.onWindowFocusChanged(z);
            } catch (NullPointerException e) {
            }
        }
    }

    /* renamed from: com.facebook.h.ah.4 */
    class WebDialog implements OnTouchListener {
        final /* synthetic */ ah f1576a;

        WebDialog(ah ahVar) {
            this.f1576a = ahVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (!view.hasFocus()) {
                view.requestFocus();
            }
            return false;
        }
    }

    /* renamed from: com.facebook.h.ah.a */
    public static class WebDialog {
        public Context f1577a;
        public String f1578b;
        public int f1579c;
        public WebDialog f1580d;
        public Bundle f1581e;
        private String f1582f;
        private AccessToken f1583g;

        public WebDialog(Context context, String str, Bundle bundle) {
            this.f1583g = AccessToken.m883a();
            if (this.f1583g == null) {
                String a = af.m1496a(context);
                if (a != null) {
                    this.f1578b = a;
                } else {
                    throw new FacebookException("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
            }
            m1553a(context, str, bundle);
        }

        public WebDialog(Context context, String str, String str2, Bundle bundle) {
            if (str == null) {
                str = af.m1496a(context);
            }
            ag.m1545a(str, "applicationId");
            this.f1578b = str;
            m1553a(context, str2, bundle);
        }

        public ah m1554a() {
            if (this.f1583g != null) {
                this.f1581e.putString("app_id", this.f1583g.f925g);
                this.f1581e.putString(WBConstants.AUTH_ACCESS_TOKEN, this.f1583g.f922d);
            } else {
                this.f1581e.putString("app_id", this.f1578b);
            }
            return new ah(this.f1577a, this.f1582f, this.f1581e, this.f1579c, this.f1580d);
        }

        private void m1553a(Context context, String str, Bundle bundle) {
            this.f1577a = context;
            this.f1582f = str;
            if (bundle != null) {
                this.f1581e = bundle;
            } else {
                this.f1581e = new Bundle();
            }
        }
    }

    /* renamed from: com.facebook.h.ah.b */
    private class WebDialog extends WebViewClient {
        final /* synthetic */ ah f1584a;

        private WebDialog(ah ahVar) {
            this.f1584a = ahVar;
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            af.m1508a();
            if (str.startsWith(this.f1584a.f1593a)) {
                int i;
                Bundle a = this.f1584a.m1570a(str);
                String string = a.getString("error");
                if (string == null) {
                    string = a.getString("error_type");
                }
                String string2 = a.getString("error_msg");
                if (string2 == null) {
                    string2 = a.getString("error_message");
                }
                if (string2 == null) {
                    string2 = a.getString("error_description");
                }
                String string3 = a.getString("error_code");
                if (af.m1523a(string3)) {
                    i = -1;
                } else {
                    try {
                        i = Integer.parseInt(string3);
                    } catch (NumberFormatException e) {
                        i = -1;
                    }
                }
                if (af.m1523a(string) && af.m1523a(string2) && i == -1) {
                    ah ahVar = this.f1584a;
                    if (!(ahVar.f1594b == null || ahVar.f1596d)) {
                        ahVar.f1596d = true;
                        ahVar.f1594b.m1555a(a, null);
                        ahVar.dismiss();
                    }
                } else if (string != null && (string.equals("access_denied") || string.equals("OAuthAccessDeniedException"))) {
                    this.f1584a.cancel();
                } else if (i == 4201) {
                    this.f1584a.cancel();
                } else {
                    this.f1584a.m1572a(new FacebookServiceException(new FacebookRequestError(i, string, string2), string2));
                }
                return true;
            } else if (str.startsWith("fbconnect://cancel")) {
                this.f1584a.cancel();
                return true;
            } else if (str.contains("touch")) {
                return false;
            } else {
                try {
                    this.f1584a.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    return true;
                } catch (ActivityNotFoundException e2) {
                    return false;
                }
            }
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            this.f1584a.m1572a(new FacebookDialogException(str, i, str2));
        }

        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            this.f1584a.m1572a(new FacebookDialogException(null, -11, null));
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            af.m1508a();
            super.onPageStarted(webView, str, bitmap);
            if (!this.f1584a.f1603k) {
                this.f1584a.f1599g.show();
            }
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!this.f1584a.f1603k) {
                this.f1584a.f1599g.dismiss();
            }
            this.f1584a.f1601i.setBackgroundColor(0);
            this.f1584a.f1595c.setVisibility(0);
            this.f1584a.f1600h.setVisibility(0);
            this.f1584a.f1597e = true;
        }
    }

    /* renamed from: com.facebook.h.ah.c */
    public interface WebDialog {
        void m1555a(Bundle bundle, FacebookException facebookException);
    }

    /* renamed from: com.facebook.h.ah.d */
    private class WebDialog extends AsyncTask<Void, Void, String[]> {
        final /* synthetic */ ah f1589a;
        private String f1590b;
        private Bundle f1591c;
        private Exception[] f1592d;

        /* renamed from: com.facebook.h.ah.d.1 */
        class WebDialog implements GraphRequest {
            final /* synthetic */ String[] f1585a;
            final /* synthetic */ int f1586b;
            final /* synthetic */ CountDownLatch f1587c;
            final /* synthetic */ WebDialog f1588d;

            WebDialog(WebDialog webDialog, String[] strArr, int i, CountDownLatch countDownLatch) {
                this.f1588d = webDialog;
                this.f1585a = strArr;
                this.f1586b = i;
                this.f1587c = countDownLatch;
            }

            public final void m1556a(GraphResponse graphResponse) {
                try {
                    FacebookRequestError facebookRequestError = graphResponse.f2736b;
                    String a;
                    if (facebookRequestError != null) {
                        a = facebookRequestError.m2573a();
                        if (a == null) {
                            a = "Error staging photo.";
                        }
                        throw new FacebookGraphResponseException(graphResponse, a);
                    }
                    JSONObject jSONObject = graphResponse.f2735a;
                    if (jSONObject == null) {
                        throw new FacebookException("Error staging photo.");
                    }
                    a = jSONObject.optString("uri");
                    if (a == null) {
                        throw new FacebookException("Error staging photo.");
                    }
                    this.f1585a[this.f1586b] = a;
                    this.f1587c.countDown();
                } catch (Exception e) {
                    this.f1588d.f1592d[this.f1586b] = e;
                }
            }
        }

        protected final /* synthetic */ Object doInBackground(Object[] objArr) {
            return m1558a();
        }

        protected final /* synthetic */ void onPostExecute(Object obj) {
            String[] strArr = (String[]) obj;
            this.f1589a.f1599g.dismiss();
            for (Throwable th : this.f1592d) {
                if (th != null) {
                    this.f1589a.m1572a(th);
                    return;
                }
            }
            if (strArr == null) {
                this.f1589a.m1572a(new FacebookException("Failed to stage photos for web dialog"));
                return;
            }
            Collection asList = Arrays.asList(strArr);
            if (asList.contains(null)) {
                this.f1589a.m1572a(new FacebookException("Failed to stage photos for web dialog"));
                return;
            }
            af.m1520a(this.f1591c, "media", new JSONArray(asList));
            this.f1589a.f1598f = af.m1492a(ac.m1478a(), FacebookSdk.m2587g() + "/dialog/" + this.f1590b, this.f1591c).toString();
            this.f1589a.m1562a((this.f1589a.f1600h.getDrawable().getIntrinsicWidth() / 2) + 1);
        }

        WebDialog(ah ahVar, String str, Bundle bundle) {
            this.f1589a = ahVar;
            this.f1590b = str;
            this.f1591c = bundle;
        }

        private String[] m1558a() {
            Iterator it;
            String[] stringArray = this.f1591c.getStringArray("media");
            String[] strArr = new String[stringArray.length];
            this.f1592d = new Exception[stringArray.length];
            CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            AccessToken a = AccessToken.m883a();
            int i = 0;
            while (i < stringArray.length) {
                try {
                    if (isCancelled()) {
                        it = concurrentLinkedQueue.iterator();
                        while (it.hasNext()) {
                            ((AsyncTask) it.next()).cancel(true);
                        }
                        return null;
                    }
                    Parcelable parse = Uri.parse(stringArray[i]);
                    if (af.m1530b((Uri) parse)) {
                        strArr[i] = parse.toString();
                        countDownLatch.countDown();
                    } else {
                        com.facebook.GraphRequest graphRequest;
                        GraphRequest webDialog = new WebDialog(this, strArr, i, countDownLatch);
                        Parcelable graphRequest2;
                        Bundle bundle;
                        if (af.m1537d((Uri) parse)) {
                            graphRequest2 = new GraphRequest(ParcelFileDescriptor.open(new File(parse.getPath()), SQLiteDatabase.CREATE_IF_NECESSARY), "image/png");
                            bundle = new Bundle(1);
                            bundle.putParcelable("file", graphRequest2);
                            graphRequest = new com.facebook.GraphRequest(a, "me/staging_resources", bundle, HttpMethod.POST, webDialog);
                        } else if (af.m1534c((Uri) parse)) {
                            graphRequest2 = new GraphRequest(parse, "image/png");
                            bundle = new Bundle(1);
                            bundle.putParcelable("file", graphRequest2);
                            graphRequest = new com.facebook.GraphRequest(a, "me/staging_resources", bundle, HttpMethod.POST, webDialog);
                        } else {
                            throw new FacebookException("The image Uri must be either a file:// or content:// Uri");
                        }
                        concurrentLinkedQueue.add(graphRequest.m2644b());
                    }
                    i++;
                } catch (Exception e) {
                    it = concurrentLinkedQueue.iterator();
                    while (it.hasNext()) {
                        ((AsyncTask) it.next()).cancel(true);
                    }
                    return null;
                }
            }
            countDownLatch.await();
            return strArr;
        }
    }

    public ah(Context context, String str) {
        this(context, str, FacebookSdk.m2593m());
    }

    private ah(Context context, String str, int i) {
        if (i == 0) {
            i = FacebookSdk.m2593m();
        }
        super(context, i);
        this.f1593a = "fbconnect://success";
        this.f1596d = false;
        this.f1603k = false;
        this.f1597e = false;
        this.f1598f = str;
    }

    public ah(Context context, String str, Bundle bundle, int i, WebDialog webDialog) {
        if (i == 0) {
            i = FacebookSdk.m2593m();
        }
        super(context, i);
        this.f1593a = "fbconnect://success";
        this.f1596d = false;
        this.f1603k = false;
        this.f1597e = false;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString(WBConstants.AUTH_PARAMS_REDIRECT_URL, "fbconnect://success");
        bundle.putString(WBConstants.AUTH_PARAMS_DISPLAY, "touch");
        bundle.putString("sdk", String.format(Locale.ROOT, "android-%s", new Object[]{FacebookSdk.m2588h()}));
        this.f1594b = webDialog;
        if (str.equals(WBConstants.ACTION_LOG_TYPE_SHARE) && bundle.containsKey("media")) {
            this.f1602j = new WebDialog(this, str, bundle);
        } else {
            this.f1598f = af.m1492a(ac.m1478a(), FacebookSdk.m2587g() + "/dialog/" + str, bundle).toString();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            cancel();
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void dismiss() {
        if (this.f1595c != null) {
            this.f1595c.stopLoading();
        }
        if (!(this.f1603k || this.f1599g == null || !this.f1599g.isShowing())) {
            this.f1599g.dismiss();
        }
        super.dismiss();
    }

    protected void onStart() {
        super.onStart();
        if (this.f1602j == null || this.f1602j.getStatus() != Status.PENDING) {
            m1571a();
            return;
        }
        this.f1602j.execute(new Void[0]);
        this.f1599g.show();
    }

    protected void onStop() {
        if (this.f1602j != null) {
            this.f1602j.cancel(true);
            this.f1599g.dismiss();
        }
        super.onStop();
    }

    public void onDetachedFromWindow() {
        this.f1603k = true;
        super.onDetachedFromWindow();
    }

    public void onAttachedToWindow() {
        this.f1603k = false;
        super.onAttachedToWindow();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1599g = new ProgressDialog(getContext());
        this.f1599g.requestWindowFeature(1);
        this.f1599g.setMessage(getContext().getString(R.com_facebook_loading));
        this.f1599g.setCanceledOnTouchOutside(false);
        this.f1599g.setOnCancelListener(new WebDialog(this));
        requestWindowFeature(1);
        this.f1601i = new FrameLayout(getContext());
        m1571a();
        getWindow().setGravity(17);
        getWindow().setSoftInputMode(16);
        this.f1600h = new ImageView(getContext());
        this.f1600h.setOnClickListener(new WebDialog(this));
        this.f1600h.setImageDrawable(getContext().getResources().getDrawable(R.com_facebook_close));
        this.f1600h.setVisibility(4);
        if (this.f1598f != null) {
            m1562a((this.f1600h.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        this.f1601i.addView(this.f1600h, new LayoutParams(-2, -2));
        setContentView(this.f1601i);
    }

    protected Bundle m1570a(String str) {
        Uri parse = Uri.parse(str);
        Bundle c = af.m1532c(parse.getQuery());
        c.putAll(af.m1532c(parse.getFragment()));
        return c;
    }

    public final void m1571a() {
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        getWindow().setLayout(Math.min(ah.m1559a(displayMetrics.widthPixels < displayMetrics.heightPixels ? displayMetrics.widthPixels : displayMetrics.heightPixels, displayMetrics.density, 480, 800), displayMetrics.widthPixels), Math.min(ah.m1559a(displayMetrics.widthPixels < displayMetrics.heightPixels ? displayMetrics.heightPixels : displayMetrics.widthPixels, displayMetrics.density, 800, 1280), displayMetrics.heightPixels));
    }

    private static int m1559a(int i, float f, int i2, int i3) {
        double d = 0.5d;
        int i4 = (int) (((float) i) / f);
        if (i4 <= i2) {
            d = 1.0d;
        } else if (i4 < i3) {
            d = 0.5d + ((((double) (i3 - i4)) / ((double) (i3 - i2))) * 0.5d);
        }
        return (int) (d * ((double) i));
    }

    protected final void m1572a(Throwable th) {
        if (this.f1594b != null && !this.f1596d) {
            this.f1596d = true;
            if (th instanceof FacebookException) {
                th = (FacebookException) th;
            } else {
                th = new FacebookException(th);
            }
            this.f1594b.m1555a(null, th);
            dismiss();
        }
    }

    public void cancel() {
        if (this.f1594b != null && !this.f1596d) {
            m1572a(new FacebookOperationCanceledException());
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void m1562a(int i) {
        View linearLayout = new LinearLayout(getContext());
        this.f1595c = new WebDialog(this, getContext().getApplicationContext());
        this.f1595c.setVerticalScrollBarEnabled(false);
        this.f1595c.setHorizontalScrollBarEnabled(false);
        this.f1595c.setWebViewClient(new WebDialog());
        this.f1595c.getSettings().setJavaScriptEnabled(true);
        this.f1595c.loadUrl(this.f1598f);
        this.f1595c.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f1595c.setVisibility(4);
        this.f1595c.getSettings().setSavePassword(false);
        this.f1595c.getSettings().setSaveFormData(false);
        this.f1595c.setFocusable(true);
        this.f1595c.setFocusableInTouchMode(true);
        this.f1595c.setOnTouchListener(new WebDialog(this));
        linearLayout.setPadding(i, i, i, i);
        linearLayout.addView(this.f1595c);
        linearLayout.setBackgroundColor(-872415232);
        this.f1601i.addView(linearLayout);
    }
}
