package com.illuminate.texaspoker.activity;

import a.does.not.Exists2;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import com.ali.fixHelper;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.PokerHistory;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.utils.Utility;
import com.illuminate.texaspoker.view.LoadingDialog;
import com.illuminate.texaspoker.view.PokerHistoryShareDialog;
import java.util.List;

public class PlayPokerHistoryActivity extends BaseToolBarActivity {
    public static int f4813d;
    public static int f4814e;
    public static int f4815f;
    private Menu f4816g;
    private int f4817h;
    private String f4818i;
    private String f4819j;
    private boolean f4820k;
    private int f4821l;
    private int f4822m;
    private int f4823n;
    private int f4824o;
    private long f4825p;
    private long f4826q;
    private long f4827r;
    private String f4828s;
    private String f4829t;
    private String f4830u;
    private String f4831v;
    private PokerHistoryShareDialog f4832w;
    private WebView f4833x;

    /* renamed from: com.illuminate.texaspoker.activity.PlayPokerHistoryActivity.10 */
    class AnonymousClass10 extends WebChromeClient {
        final /* synthetic */ ProgressBar f4785a;
        final /* synthetic */ PlayPokerHistoryActivity f4786b;

        /* renamed from: com.illuminate.texaspoker.activity.PlayPokerHistoryActivity.10.1 */
        class C07231 implements ValueCallback<String> {
            final /* synthetic */ AnonymousClass10 f4777a;

            C07231(AnonymousClass10 anonymousClass10) {
                this.f4777a = anonymousClass10;
            }

            public final /* synthetic */ void onReceiveValue(Object obj) {
                obj = (String) obj;
                if (!obj.equalsIgnoreCase("null")) {
                    if (obj.startsWith("\"") && obj.endsWith("\"")) {
                        obj = obj.substring(1, obj.length() - 1);
                    }
                    try {
                        int parseInt = Integer.parseInt(obj);
                        if (parseInt == 5 || parseInt == 6) {
                            this.f4777a.f4786b.f4820k = true;
                        } else {
                            this.f4777a.f4786b.f4820k = false;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        this.f4777a.f4786b.f4820k = false;
                    }
                }
            }
        }

        /* renamed from: com.illuminate.texaspoker.activity.PlayPokerHistoryActivity.10.2 */
        class C07242 implements ValueCallback<String> {
            final /* synthetic */ AnonymousClass10 f4778a;

            C07242(AnonymousClass10 anonymousClass10) {
                this.f4778a = anonymousClass10;
            }

            public final /* synthetic */ void onReceiveValue(Object obj) {
                String str = (String) obj;
                if (!str.equalsIgnoreCase("null")) {
                    if (str.startsWith("\"") && str.endsWith("\"")) {
                        str = str.substring(1, str.length() - 1);
                    }
                    this.f4778a.f4786b.f4818i = str;
                }
            }
        }

        /* renamed from: com.illuminate.texaspoker.activity.PlayPokerHistoryActivity.10.3 */
        class C07253 implements ValueCallback<String> {
            final /* synthetic */ AnonymousClass10 f4779a;

            C07253(AnonymousClass10 anonymousClass10) {
                this.f4779a = anonymousClass10;
            }

            public final /* synthetic */ void onReceiveValue(Object obj) {
                String str = (String) obj;
                if (!str.equalsIgnoreCase("null")) {
                    if (str.startsWith("\"") && str.endsWith("\"")) {
                        str = str.substring(1, str.length() - 1);
                    }
                    this.f4779a.f4786b.f4831v = str;
                }
            }
        }

        /* renamed from: com.illuminate.texaspoker.activity.PlayPokerHistoryActivity.10.4 */
        class C07264 implements ValueCallback<String> {
            final /* synthetic */ AnonymousClass10 f4780a;

            C07264(AnonymousClass10 anonymousClass10) {
                this.f4780a = anonymousClass10;
            }

            public final /* synthetic */ void onReceiveValue(Object obj) {
                String str = (String) obj;
                if (!str.equalsIgnoreCase("null")) {
                    if (str.startsWith("\"") && str.endsWith("\"")) {
                        str = str.substring(1, str.length() - 1);
                    }
                    this.f4780a.f4786b.f4819j = str;
                    this.f4780a.f4786b.f4830u = Utility.m4497e(this.f4780a.f4786b.f4819j);
                }
            }
        }

        /* renamed from: com.illuminate.texaspoker.activity.PlayPokerHistoryActivity.10.5 */
        class C07275 implements ValueCallback<String> {
            final /* synthetic */ AnonymousClass10 f4781a;

            C07275(AnonymousClass10 anonymousClass10) {
                this.f4781a = anonymousClass10;
            }

            public final /* synthetic */ void onReceiveValue(Object obj) {
                CharSequence charSequence = (String) obj;
                if (!charSequence.equalsIgnoreCase("null")) {
                    if (charSequence.startsWith("\"") && charSequence.endsWith("\"")) {
                        charSequence = charSequence.substring(1, charSequence.length() - 1);
                    }
                    if (StringUtils.m4462a(charSequence)) {
                        this.f4781a.f4786b.f4821l = -1;
                    } else {
                        this.f4781a.f4786b.f4821l = Integer.parseInt(charSequence);
                    }
                }
            }
        }

        /* renamed from: com.illuminate.texaspoker.activity.PlayPokerHistoryActivity.10.6 */
        class C07286 implements ValueCallback<String> {
            final /* synthetic */ AnonymousClass10 f4782a;

            C07286(AnonymousClass10 anonymousClass10) {
                this.f4782a = anonymousClass10;
            }

            public final /* synthetic */ void onReceiveValue(Object obj) {
                CharSequence charSequence = (String) obj;
                if (!charSequence.equalsIgnoreCase("null")) {
                    PlayPokerHistoryActivity.m3257c(this.f4782a.f4786b);
                    if (charSequence.startsWith("\"") && charSequence.endsWith("\"")) {
                        charSequence = charSequence.substring(1, charSequence.length() - 1);
                    }
                    if (StringUtils.m4462a(charSequence)) {
                        this.f4782a.f4786b.f4822m = -1;
                    } else {
                        this.f4782a.f4786b.f4822m = Integer.parseInt(charSequence);
                    }
                }
            }
        }

        /* renamed from: com.illuminate.texaspoker.activity.PlayPokerHistoryActivity.10.7 */
        class C07297 implements ValueCallback<String> {
            final /* synthetic */ AnonymousClass10 f4783a;

            C07297(AnonymousClass10 anonymousClass10) {
                this.f4783a = anonymousClass10;
            }

            public final /* synthetic */ void onReceiveValue(Object obj) {
                CharSequence charSequence = (String) obj;
                if (!charSequence.equalsIgnoreCase("null")) {
                    if (charSequence.startsWith("\"") && charSequence.endsWith("\"")) {
                        charSequence = charSequence.substring(1, charSequence.length() - 1);
                    }
                    if (StringUtils.m4462a(charSequence)) {
                        this.f4783a.f4786b.f4823n = -1;
                    } else {
                        this.f4783a.f4786b.f4823n = Integer.parseInt(charSequence);
                    }
                }
            }
        }

        /* renamed from: com.illuminate.texaspoker.activity.PlayPokerHistoryActivity.10.8 */
        class C07308 implements ValueCallback<String> {
            final /* synthetic */ AnonymousClass10 f4784a;

            C07308(AnonymousClass10 anonymousClass10) {
                this.f4784a = anonymousClass10;
            }

            public final /* synthetic */ void onReceiveValue(Object obj) {
                CharSequence charSequence = (String) obj;
                if (!charSequence.equalsIgnoreCase("null")) {
                    if (charSequence.startsWith("\"") && charSequence.endsWith("\"")) {
                        charSequence = charSequence.substring(1, charSequence.length() - 1);
                    }
                    if (StringUtils.m4462a(charSequence)) {
                        this.f4784a.f4786b.f4824o = -1;
                    } else {
                        this.f4784a.f4786b.f4824o = Integer.parseInt(charSequence);
                    }
                }
            }
        }

        AnonymousClass10(PlayPokerHistoryActivity playPokerHistoryActivity, ProgressBar progressBar) {
            this.f4786b = playPokerHistoryActivity;
            this.f4785a = progressBar;
        }

        public final void onProgressChanged(WebView webView, int i) {
            if (i == 100) {
                this.f4785a.setVisibility(8);
                this.f4786b.f4833x.evaluateJavascript("document.getElementsByName(\"gametype\")[0].content", new C07231(this));
                this.f4786b.f4833x.evaluateJavascript("document.getElementsByName(\"titleString\")[0].content", new C07242(this));
                this.f4786b.f4833x.evaluateJavascript("document.getElementsByName(\"descString\")[0].content", new C07253(this));
                this.f4786b.f4833x.evaluateJavascript("document.getElementsByName(\"shareUrl\")[0].content", new C07264(this));
                this.f4786b.f4833x.evaluateJavascript("document.getElementsByName(\"cardl\")[0].content", new C07275(this));
                this.f4786b.f4833x.evaluateJavascript("document.getElementsByName(\"cardr\")[0].content", new C07286(this));
                if (this.f4786b.f4820k) {
                    this.f4786b.f4833x.evaluateJavascript("document.getElementsByName(\"card3\")[0].content", new C07297(this));
                    this.f4786b.f4833x.evaluateJavascript("document.getElementsByName(\"card4\")[0].content", new C07308(this));
                }
            } else {
                if (this.f4785a.getVisibility() == 8) {
                    this.f4785a.setVisibility(0);
                }
                this.f4785a.setProgress(i);
            }
            super.onProgressChanged(webView, i);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.PlayPokerHistoryActivity.1 */
    class C07311 implements OnClickListener {
        final /* synthetic */ PlayPokerHistoryActivity f4793a;

        C07311(PlayPokerHistoryActivity playPokerHistoryActivity) {
            this.f4793a = playPokerHistoryActivity;
        }

        public final void onClick(View view) {
            this.f4793a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.PlayPokerHistoryActivity.2 */
    class C07322 implements OnClickListener {
        final /* synthetic */ PlayPokerHistoryActivity f4794a;

        C07322(PlayPokerHistoryActivity playPokerHistoryActivity) {
            this.f4794a = playPokerHistoryActivity;
        }

        public final void onClick(View view) {
            PlayPokerHistoryActivity.m3268l(this.f4794a);
            this.f4794a.f4832w.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.PlayPokerHistoryActivity.3 */
    class C07333 implements OnClickListener {
        final /* synthetic */ PlayPokerHistoryActivity f4795a;

        C07333(PlayPokerHistoryActivity playPokerHistoryActivity) {
            this.f4795a = playPokerHistoryActivity;
        }

        public final void onClick(View view) {
            new C0745a(this.f4795a, this.f4795a).show();
            this.f4795a.f4832w.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.PlayPokerHistoryActivity.4 */
    class C07344 implements OnClickListener {
        final /* synthetic */ PlayPokerHistoryActivity f4796a;

        static {
            fixHelper.fixfunc(new int[]{2987, 2988});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C07344(PlayPokerHistoryActivity playPokerHistoryActivity);

        public final native void onClick(View view);
    }

    /* renamed from: com.illuminate.texaspoker.activity.PlayPokerHistoryActivity.5 */
    class C07355 implements OnClickListener {
        final /* synthetic */ PlayPokerHistoryActivity f4797a;

        static {
            fixHelper.fixfunc(new int[]{2941, 2942});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C07355(PlayPokerHistoryActivity playPokerHistoryActivity);

        public final native void onClick(View view);
    }

    /* renamed from: com.illuminate.texaspoker.activity.PlayPokerHistoryActivity.6 */
    class C07366 implements DialogInterface.OnClickListener {
        final /* synthetic */ PlayPokerHistoryActivity f4798a;

        static {
            fixHelper.fixfunc(new int[]{2921, 2922});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C07366(PlayPokerHistoryActivity playPokerHistoryActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.activity.PlayPokerHistoryActivity.7 */
    class C07377 implements DialogInterface.OnClickListener {
        final /* synthetic */ PlayPokerHistoryActivity f4799a;

        static {
            fixHelper.fixfunc(new int[]{2835, 2836});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C07377(PlayPokerHistoryActivity playPokerHistoryActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.activity.PlayPokerHistoryActivity.8 */
    class C07388 implements DialogInterface.OnClickListener {
        final /* synthetic */ PlayPokerHistoryActivity f4800a;

        static {
            fixHelper.fixfunc(new int[]{2716, 2717});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C07388(PlayPokerHistoryActivity playPokerHistoryActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.activity.PlayPokerHistoryActivity.9 */
    class C07399 extends WebViewClient {
        final /* synthetic */ PlayPokerHistoryActivity f4801a;

        static {
            fixHelper.fixfunc(new int[]{2699, 2700});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C07399(PlayPokerHistoryActivity playPokerHistoryActivity);

        public final native boolean shouldOverrideUrlLoading(WebView webView, String str);
    }

    /* renamed from: com.illuminate.texaspoker.activity.PlayPokerHistoryActivity.a */
    public class C0745a extends Dialog {
        final /* synthetic */ PlayPokerHistoryActivity f4807a;
        private Context f4808b;
        private ImageButton f4809c;
        private Button f4810d;
        private EditText f4811e;
        private CheckBox f4812f;

        /* renamed from: com.illuminate.texaspoker.activity.PlayPokerHistoryActivity.a.1 */
        class C07401 implements OnClickListener {
            final /* synthetic */ C0745a f4802a;

            C07401(C0745a c0745a) {
                this.f4802a = c0745a;
            }

            public final void onClick(View view) {
                this.f4802a.dismiss();
            }
        }

        /* renamed from: com.illuminate.texaspoker.activity.PlayPokerHistoryActivity.a.2 */
        class C07412 implements OnClickListener {
            final /* synthetic */ C0745a f4803a;

            C07412(C0745a c0745a) {
                this.f4803a = c0745a;
            }

            public final void onClick(View view) {
                C0745a.m3246a(this.f4803a);
            }
        }

        /* renamed from: com.illuminate.texaspoker.activity.PlayPokerHistoryActivity.a.3 */
        class C07423 implements TextWatcher {
            final /* synthetic */ C0745a f4804a;

            static {
                fixHelper.fixfunc(new int[]{3512, 3513, 3514, 3515});
                if (VERSION.SDK_INT <= 0) {
                    Exists2.class.toString();
                }
            }

            native C07423(C0745a c0745a);

            public final native void afterTextChanged(Editable editable);

            public final native void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3);

            public final native void onTextChanged(CharSequence charSequence, int i, int i2, int i3);
        }

        /* renamed from: com.illuminate.texaspoker.activity.PlayPokerHistoryActivity.a.4 */
        class C07434 implements OnClickListener {
            final /* synthetic */ C0745a f4805a;

            static {
                fixHelper.fixfunc(new int[]{3435, 3436});
                if (VERSION.SDK_INT <= 0) {
                    Exists2.class.toString();
                }
            }

            native C07434(C0745a c0745a);

            public final native void onClick(View view);
        }

        /* renamed from: com.illuminate.texaspoker.activity.PlayPokerHistoryActivity.a.5 */
        class C07445 implements DialogInterface.OnClickListener {
            final /* synthetic */ C0745a f4806a;

            static {
                fixHelper.fixfunc(new int[]{3416, 3417});
                if (VERSION.SDK_INT <= 0) {
                    Exists2.class.toString();
                }
            }

            native C07445(C0745a c0745a);

            public final native void onClick(DialogInterface dialogInterface, int i);
        }

        public C0745a(PlayPokerHistoryActivity playPokerHistoryActivity, Context context) {
            this.f4807a = playPokerHistoryActivity;
            super(context, 2131296473);
            this.f4808b = context;
        }

        protected final void onCreate(Bundle bundle) {
            PokerHistory a;
            super.onCreate(bundle);
            Window window = getWindow();
            window.getDecorView().setPadding(0, 0, 0, 0);
            LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -2;
            window.setAttributes(attributes);
            View inflate = LayoutInflater.from(this.f4808b).inflate(2130968810, null);
            setContentView(inflate);
            setCancelable(true);
            this.f4809c = (ImageButton) inflate.findViewById(2131559335);
            this.f4809c.setOnClickListener(new C07401(this));
            this.f4811e = (EditText) inflate.findViewById(2131558715);
            this.f4810d = (Button) inflate.findViewById(2131559334);
            this.f4810d.setOnClickListener(new C07412(this));
            this.f4811e.addTextChangedListener(new C07423(this));
            this.f4812f = (CheckBox) inflate.findViewById(2131559333);
            long a2 = DBManager.m3631a().f5578r.m3691a();
            this.f4812f.setText(String.format(this.f4807a.getResources().getString(2131165810), new Object[]{Long.valueOf(a2), Integer.valueOf(SharedPreferencesManager.m4434x())}));
            this.f4812f.setOnClickListener(new C07434(this));
            if (StringUtils.m4462a(this.f4807a.f4830u)) {
                a = DBManager.m3631a().f5578r.m3692a(this.f4807a.f4825p, this.f4807a.f4826q, this.f4807a.f4827r, false);
            } else {
                a = DBManager.m3631a().f5578r.m3693a(this.f4807a.f4830u);
            }
            if (a != null) {
                this.f4812f.setChecked(false);
                this.f4812f.setEnabled(false);
            } else if (a2 < ((long) SharedPreferencesManager.m4434x())) {
                this.f4812f.setChecked(true);
                this.f4812f.setEnabled(true);
            } else {
                this.f4812f.setChecked(false);
                this.f4812f.setEnabled(false);
            }
        }

        static /* synthetic */ void m3246a(C0745a c0745a) {
            if (StringUtils.m4460a(c0745a.f4811e.getText().toString().trim()) > 24) {
                new Builder(c0745a.f4807a).setTitle(2131165514).setMessage(2131165828).setPositiveButton(2131165438, new C07445(c0745a)).show();
                return;
            }
            c0745a.f4807a.b = new LoadingDialog(c0745a.f4807a);
            c0745a.f4807a.b.show();
            c0745a.dismiss();
            if (c0745a.f4812f.isChecked()) {
                NetworkUtil.m4073a();
                NetworkUtil.m4084a(SharedPreferencesManager.m4308b(), c0745a.f4807a.f4825p, c0745a.f4807a.f4826q, c0745a.f4807a.f4827r, c0745a.f4807a.f4830u, c0745a.f4811e.getText().toString().trim());
                return;
            }
            NetworkUtil.m4073a();
            NetworkUtil.m4116a(c0745a.f4811e.getText().toString().trim(), c0745a.f4807a.f4825p, c0745a.f4807a.f4826q, c0745a.f4807a.f4827r, c0745a.f4807a.f4830u);
        }
    }

    static /* synthetic */ void m3268l(PlayPokerHistoryActivity playPokerHistoryActivity) {
        PokerHistory a;
        if (StringUtils.m4462a(playPokerHistoryActivity.f4830u)) {
            a = DBManager.m3631a().f5578r.m3692a(playPokerHistoryActivity.f4825p, playPokerHistoryActivity.f4826q, playPokerHistoryActivity.f4827r, false);
        } else {
            a = DBManager.m3631a().f5578r.m3693a(playPokerHistoryActivity.f4830u);
        }
        if (a != null) {
            playPokerHistoryActivity.b = new LoadingDialog(playPokerHistoryActivity);
            playPokerHistoryActivity.b.show();
            PokerHistory a2 = DBManager.m3631a().f5578r.m3693a(playPokerHistoryActivity.f4830u);
            NetworkUtil.m4073a();
            NetworkUtil.m4135b(a2.f5970p.longValue(), a2.f5968n.longValue(), a2.f5967m.longValue());
        } else if (DBManager.m3631a().f5578r.m3691a() >= ((long) SharedPreferencesManager.m4434x())) {
            playPokerHistoryActivity.m2732a(2130903246, 2131165831, 1);
        } else {
            if (StringUtils.m4462a(playPokerHistoryActivity.f4830u)) {
                a = DBManager.m3631a().f5578r.m3692a(playPokerHistoryActivity.f4825p, playPokerHistoryActivity.f4826q, playPokerHistoryActivity.f4827r, false);
            } else {
                a = DBManager.m3631a().f5578r.m3693a(playPokerHistoryActivity.f4830u);
            }
            if (a == null) {
                playPokerHistoryActivity.b = new LoadingDialog(playPokerHistoryActivity);
                playPokerHistoryActivity.b.show();
                NetworkUtil.m4073a();
                NetworkUtil.m4084a(SharedPreferencesManager.m4308b(), playPokerHistoryActivity.f4825p, playPokerHistoryActivity.f4826q, playPokerHistoryActivity.f4827r, playPokerHistoryActivity.f4830u, null);
                return;
            }
            new Builder(playPokerHistoryActivity).setTitle(2131165514).setMessage(2131165827).setPositiveButton(2131165438, new C07366(playPokerHistoryActivity)).show();
        }
    }

    static {
        f4813d = 0;
        f4814e = 1;
        f4815f = 2;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968674);
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        if (toolbar != null) {
            toolbar.setTitleTextAppearance(this, 2131296567);
            toolbar.setNavigationIcon(2130837591);
            toolbar.setNavigationOnClickListener(new C07311(this));
        }
        Bundle extras = getIntent().getExtras();
        this.f4817h = extras.getInt("from");
        this.f4825p = extras.getLong("lSaveUuid");
        this.f4826q = extras.getLong("lRoomId");
        this.f4827r = extras.getLong("lHandId");
        String string = extras.getString("pokerHistoryShareUrl");
        String string2 = extras.getString("pokerHistoryUrl");
        if (this.f4817h == f4814e || this.f4817h == f4815f) {
            this.f4819j = string;
            string2 = string;
        } else {
            this.f4819j = string2;
        }
        this.f4830u = Utility.m4497e(string);
        this.f4821l = extras.getInt("iPoker1", -1);
        this.f4822m = extras.getInt("iPoker2", -1);
        this.f4823n = extras.getInt("iPoker3", -1);
        this.f4824o = extras.getInt("iPoker4", -1);
        this.f4820k = extras.getBoolean("isOmaha", false);
        if (Utility.m4480a()) {
            this.f4829t = string2 + "&lang=zh";
        } else if (Utility.m4485b()) {
            this.f4829t = string2 + "&lang=tw";
        } else {
            this.f4829t = string2 + "&lang=en";
        }
        this.f4828s = this.f4829t + "&inApp=1";
        ProgressBar progressBar = (ProgressBar) findViewById(2131558880);
        this.f4833x = (WebView) findViewById(2131558879);
        WebSettings settings = this.f4833x.getSettings();
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptEnabled(true);
        this.f4833x.setWebViewClient(new C07399(this));
        this.f4833x.setWebChromeClient(new AnonymousClass10(this, progressBar));
        this.f4833x.loadUrl(this.f4828s);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131689497, menu);
        this.f4816g = menu;
        this.f4816g.getItem(0).setEnabled(false);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131559450) {
            return super.onOptionsItemSelected(menuItem);
        }
        PokerHistory a;
        boolean z;
        boolean z2;
        this.f4832w = new PokerHistoryShareDialog(this);
        if (StringUtils.m4462a(this.f4830u)) {
            a = DBManager.m3631a().f5578r.m3692a(this.f4825p, this.f4826q, this.f4827r, false);
        } else {
            a = DBManager.m3631a().f5578r.m3693a(this.f4830u);
        }
        if (this.f4817h == f4813d) {
            z = true;
        } else if (a == null || this.f4825p != SharedPreferencesManager.m4308b()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f4832w.f7059m = 0;
        } else {
            this.f4832w.f7059m = 4;
        }
        if (a != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.f4832w.f7057k = 8;
            this.f4832w.f7058l = 0;
        } else {
            this.f4832w.f7057k = 0;
            this.f4832w.f7058l = 8;
        }
        this.f4832w.f7047a = 
        /* Method generation error in method: com.illuminate.texaspoker.activity.PlayPokerHistoryActivity.onOptionsItemSelected(android.view.MenuItem):boolean
jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004d: IPUT  (wrap: android.view.View$OnClickListener
  0x004a: CONSTRUCTOR  (r1_6 android.view.View$OnClickListener) = (r11_0 'this' com.illuminate.texaspoker.activity.PlayPokerHistoryActivity) com.illuminate.texaspoker.activity.PlayPokerHistoryActivity.11.<init>(com.illuminate.texaspoker.activity.PlayPokerHistoryActivity):void CONSTRUCTOR), (wrap: com.illuminate.texaspoker.view.b
  0x0046: IGET  (r0_11 com.illuminate.texaspoker.view.b) = (r11_0 'this' com.illuminate.texaspoker.activity.PlayPokerHistoryActivity) com.illuminate.texaspoker.activity.PlayPokerHistoryActivity.w com.illuminate.texaspoker.view.b) com.illuminate.texaspoker.view.b.a android.view.View$OnClickListener in method: com.illuminate.texaspoker.activity.PlayPokerHistoryActivity.onOptionsItemSelected(android.view.MenuItem):boolean
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:225)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:202)
	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:100)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:50)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:177)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:324)
	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:116)
	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:81)
	at jadx.core.codegen.CodeGen.visit(CodeGen.java:19)
	at jadx.core.ProcessClass.process(ProcessClass.java:43)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:281)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:161)
Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004a: CONSTRUCTOR  (r1_6 android.view.View$OnClickListener) = (r11_0 'this' com.illuminate.texaspoker.activity.PlayPokerHistoryActivity) com.illuminate.texaspoker.activity.PlayPokerHistoryActivity.11.<init>(com.illuminate.texaspoker.activity.PlayPokerHistoryActivity):void CONSTRUCTOR in method: com.illuminate.texaspoker.activity.PlayPokerHistoryActivity.onOptionsItemSelected(android.view.MenuItem):boolean
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:225)
	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:101)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:392)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:219)
	... 20 more
Caused by: java.lang.NullPointerException
	at jadx.core.utils.RegionUtils.notEmpty(RegionUtils.java:135)
	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:544)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:338)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:210)
	... 23 more
 */

        protected final void m3273a(String str, List<Object> list) {
            if (str.equalsIgnoreCase("NOTIFY_SAVE_FAVORITE_SUCCESS")) {
                this.b.dismiss();
                m2732a(2130903589, 2131165832, 1);
            } else if (str.equalsIgnoreCase("NOTIFY_SAVE_FAVORITE_FAULT")) {
                r0 = ((Integer) list.get(0)).intValue();
                this.b.dismiss();
                new Builder(this).setTitle(2131165514).setMessage(r0).setPositiveButton(2131165438, new C07377(this)).show();
            } else if (str.equalsIgnoreCase("NOTIFY_DEL_FAVORITE_SUCCESS")) {
                this.b.dismiss();
                m2732a(2130903589, 2131165821, 1);
            } else if (str.equalsIgnoreCase("NOTIFY_DEL_FAVORITE_FAULT")) {
                this.b.dismiss();
                m2732a(2130903246, 2131165820, 1);
            } else if (str.equalsIgnoreCase("NOTIFY_SAVE_FAVORITE_RENAME_SUCCESS")) {
                this.b.dismiss();
                m2732a(2130903589, 2131165824, 1);
                this.f4833x.reload();
            } else if (str.equalsIgnoreCase("NOTIFY_SAVE_FAVORITE_RENAME_FAULT")) {
                r0 = ((Integer) list.get(0)).intValue();
                this.b.dismiss();
                new Builder(this).setTitle(2131165514).setMessage(r0).setPositiveButton(2131165438, new C07388(this)).show();
            }
        }

        static /* synthetic */ void m3257c(PlayPokerHistoryActivity playPokerHistoryActivity) {
            if (playPokerHistoryActivity.f4816g != null) {
                playPokerHistoryActivity.f4816g.getItem(0).setEnabled(true);
            }
        }
    }
