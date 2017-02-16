package com.facebook.p036h;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.h.m */
public class FacebookWebFallbackDialog extends ah {
    private static final String f1668f;
    private boolean f1669g;

    /* renamed from: com.facebook.h.m.1 */
    class FacebookWebFallbackDialog implements Runnable {
        final /* synthetic */ FacebookWebFallbackDialog f1667a;

        FacebookWebFallbackDialog(FacebookWebFallbackDialog facebookWebFallbackDialog) {
            this.f1667a = facebookWebFallbackDialog;
        }

        public final void run() {
            super.cancel();
        }
    }

    static {
        f1668f = FacebookWebFallbackDialog.class.getName();
    }

    public FacebookWebFallbackDialog(Context context, String str, String str2) {
        super(context, str);
        this.f1593a = str2;
    }

    protected final Bundle m1642a(String str) {
        Bundle c = af.m1532c(Uri.parse(str).getQuery());
        String string = c.getString("bridge_args");
        c.remove("bridge_args");
        if (!af.m1523a(string)) {
            try {
                c.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", BundleJSONConverter.m1607a(new JSONObject(string)));
            } catch (JSONException e) {
                af.m1535d(f1668f);
            }
        }
        string = c.getString("method_results");
        c.remove("method_results");
        if (!af.m1523a(string)) {
            if (af.m1523a(string)) {
                string = "{}";
            }
            try {
                c.putBundle("com.facebook.platform.protocol.RESULT_ARGS", BundleJSONConverter.m1607a(new JSONObject(string)));
            } catch (JSONException e2) {
                af.m1535d(f1668f);
            }
        }
        c.remove(LogBuilder.KEY_VERSION);
        c.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", NativeProtocol.m1712a());
        return c;
    }

    public void cancel() {
        WebView webView = this.f1595c;
        if (!this.f1597e || this.f1596d || webView == null || !webView.isShown()) {
            super.cancel();
        } else if (!this.f1669g) {
            this.f1669g = true;
            webView.loadUrl("javascript:" + "(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
            new Handler(Looper.getMainLooper()).postDelayed(new FacebookWebFallbackDialog(this), 1500);
        }
    }
}
