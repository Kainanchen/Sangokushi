package com.illuminate.texaspoker.activity;

import a.does.not.Exists2;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import com.ali.fixHelper;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.view.LoadingDialog;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class VerifyActivity extends BaseToolBarActivity {
    private C0898a f5306d;
    private int f5307e;
    private String f5308f;
    private String f5309g;
    private Menu f5310h;
    private Timer f5311i;
    private EditText f5312j;
    private View f5313k;
    private View f5314l;
    private TextView f5315m;

    /* renamed from: com.illuminate.texaspoker.activity.VerifyActivity.1 */
    class C08871 implements OnClickListener {
        final /* synthetic */ VerifyActivity f5294a;

        static {
            fixHelper.fixfunc(new int[]{2729, 2730});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C08871(VerifyActivity verifyActivity);

        public final native void onClick(View view);
    }

    /* renamed from: com.illuminate.texaspoker.activity.VerifyActivity.2 */
    class C08882 implements DialogInterface.OnClickListener {
        final /* synthetic */ VerifyActivity f5295a;

        static {
            fixHelper.fixfunc(new int[]{2624, 2625});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C08882(VerifyActivity verifyActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.activity.VerifyActivity.3 */
    class C08893 implements DialogInterface.OnClickListener {
        final /* synthetic */ VerifyActivity f5296a;

        static {
            fixHelper.fixfunc(new int[]{2695, 2696});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C08893(VerifyActivity verifyActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.activity.VerifyActivity.4 */
    class C08904 implements OnClickListener {
        final /* synthetic */ VerifyActivity f5297a;

        static {
            fixHelper.fixfunc(new int[]{2943, 2944});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C08904(VerifyActivity verifyActivity);

        public final native void onClick(View view);
    }

    /* renamed from: com.illuminate.texaspoker.activity.VerifyActivity.5 */
    class C08915 implements OnGlobalLayoutListener {
        final /* synthetic */ VerifyActivity f5298a;

        static {
            fixHelper.fixfunc(new int[]{2983, 2984});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C08915(VerifyActivity verifyActivity);

        public final native void onGlobalLayout();
    }

    /* renamed from: com.illuminate.texaspoker.activity.VerifyActivity.6 */
    class C08926 implements TextWatcher {
        final /* synthetic */ VerifyActivity f5299a;

        static {
            fixHelper.fixfunc(new int[]{2852, 2853, 2854, 2855});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C08926(VerifyActivity verifyActivity);

        public final native void afterTextChanged(Editable editable);

        public final native void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3);

        public final native void onTextChanged(CharSequence charSequence, int i, int i2, int i3);
    }

    /* renamed from: com.illuminate.texaspoker.activity.VerifyActivity.7 */
    class C08957 implements OnClickListener {
        final /* synthetic */ VerifyActivity f5302a;

        /* renamed from: com.illuminate.texaspoker.activity.VerifyActivity.7.1 */
        class C08931 implements DialogInterface.OnClickListener {
            final /* synthetic */ C08957 f5300a;

            C08931(C08957 c08957) {
                this.f5300a = c08957;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        /* renamed from: com.illuminate.texaspoker.activity.VerifyActivity.7.2 */
        class C08942 implements DialogInterface.OnClickListener {
            final /* synthetic */ C08957 f5301a;

            C08942(C08957 c08957) {
                this.f5301a = c08957;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f5301a.f5302a.b = new LoadingDialog(this.f5301a.f5302a);
                this.f5301a.f5302a.b.show();
                NetworkUtil.m4073a();
                NetworkUtil.m4120a(this.f5301a.f5302a.f5308f, this.f5301a.f5302a.f5309g);
            }
        }

        static {
            fixHelper.fixfunc(new int[]{2937, 2938});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C08957(VerifyActivity verifyActivity);

        public final native void onClick(View view);
    }

    /* renamed from: com.illuminate.texaspoker.activity.VerifyActivity.8 */
    class C08968 implements DialogInterface.OnClickListener {
        final /* synthetic */ VerifyActivity f5303a;

        static {
            fixHelper.fixfunc(new int[]{3059, 3060});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C08968(VerifyActivity verifyActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.activity.VerifyActivity.9 */
    class C08979 implements DialogInterface.OnClickListener {
        final /* synthetic */ VerifyActivity f5304a;

        static {
            fixHelper.fixfunc(new int[]{3168, 3169});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C08979(VerifyActivity verifyActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.activity.VerifyActivity.a */
    private static class C0898a extends Handler {
        private final WeakReference<VerifyActivity> f5305a;

        static {
            fixHelper.fixfunc(new int[]{1310, 1311});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        public native C0898a(VerifyActivity verifyActivity);

        public final native void handleMessage(Message message);
    }

    static /* synthetic */ void m3471b(VerifyActivity verifyActivity) {
        if (verifyActivity.f5310h == null) {
            return;
        }
        if (StringUtils.m4462a(verifyActivity.f5312j.getText().toString().trim())) {
            verifyActivity.f5310h.getItem(0).setEnabled(false);
        } else {
            verifyActivity.f5310h.getItem(0).setEnabled(true);
        }
    }

    static /* synthetic */ void m3475e(VerifyActivity verifyActivity) {
        verifyActivity.f5307e--;
        verifyActivity.f5315m.setText(String.format(verifyActivity.getResources().getString(2131165741), new Object[]{Integer.valueOf(verifyActivity.f5307e)}));
        if (verifyActivity.f5307e == 0) {
            verifyActivity.f5311i.cancel();
            verifyActivity.f5314l.setVisibility(4);
            verifyActivity.f5313k.setVisibility(0);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968673);
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        if (toolbar != null) {
            toolbar.setTitleTextAppearance(this, 2131296567);
            toolbar.setNavigationIcon(2130837591);
            toolbar.setNavigationOnClickListener(new C08871(this));
        }
        Bundle extras = getIntent().getExtras();
        this.f5308f = extras.getString("phoneNumStr");
        this.f5309g = extras.getString("countryCodeStr");
        View findViewById = findViewById(2131558810);
        if (findViewById != null) {
            findViewById.setOnClickListener(new C08904(this));
            findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new C08915(this));
        }
        CharSequence charSequence = "+" + this.f5309g + " " + this.f5308f;
        TextView textView = (TextView) findViewById(2131558811);
        if (textView != null) {
            textView.setText(charSequence);
        }
        this.f5312j = (EditText) findViewById(2131558812);
        this.f5312j.addTextChangedListener(new C08926(this));
        this.f5313k = findViewById(2131558814);
        this.f5314l = findViewById(2131558816);
        this.f5315m = (TextView) findViewById(2131558817);
        m3474d();
        ImageButton imageButton = (ImageButton) findViewById(2131558815);
        if (imageButton != null) {
            imageButton.setOnClickListener(new C08957(this));
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131689503, menu);
        this.f5310h = menu;
        this.f5310h.getItem(0).setEnabled(false);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131559439) {
            return super.onOptionsItemSelected(menuItem);
        }
        String trim = this.f5312j.getText().toString().trim();
        if (trim.length() != 6) {
            new Builder(this).setTitle(2131165514).setMessage(2131165743).setPositiveButton(2131165438, new DialogInterface.OnClickListener() {
                final /* synthetic */ VerifyActivity f5293a;

                {
                    this.f5293a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                }
            }).show();
        } else {
            this.b = new LoadingDialog(this);
            this.b.show();
            NetworkUtil.m4073a();
            NetworkUtil.m4153c(trim, this.f5308f, this.f5309g);
        }
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (this.b != null && this.b.isShowing()) {
                return true;
            }
            m3469a();
        }
        return super.onKeyDown(i, keyEvent);
    }

    private void m3469a() {
        new Builder(this).setTitle(2131165514).setMessage(2131165738).setPositiveButton(2131165746, new C08979(this)).setNegativeButton(2131165424, new C08968(this)).show();
    }

    private void m3474d() {
        if (this.f5311i != null) {
            this.f5311i.cancel();
        }
        this.f5307e = 60;
        this.f5315m.setText(String.format(getResources().getString(2131165741), new Object[]{Integer.valueOf(this.f5307e)}));
        this.f5306d = new C0898a(this);
        TimerTask anonymousClass10 = new TimerTask() {
            final /* synthetic */ VerifyActivity f5292a;

            {
                this.f5292a = r1;
            }

            public final void run() {
                Message message = new Message();
                message.what = 1;
                this.f5292a.f5306d.sendMessage(message);
            }
        };
        this.f5311i = new Timer();
        this.f5311i.schedule(anonymousClass10, 0, 1000);
    }

    protected final void m3477a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_UPLOAD_VERIFY_CODE_SUCCESS")) {
            this.b.dismiss();
            SharedPreferencesManager.m4337e(this.f5308f);
            startActivity(new Intent(this, CompleteActivity.class));
            finish();
            overridePendingTransition(0, 2131034133);
        } else if (str.equalsIgnoreCase("NOTIFY_UPLOAD_VERIFY_CODE_FAULT")) {
            r0 = ((Integer) list.get(0)).intValue();
            this.b.dismiss();
            new Builder(this).setTitle(2131165514).setMessage(r0).setPositiveButton(2131165438, new C08882(this)).show();
        } else if (str.equalsIgnoreCase("NOTIFY_REGET_VERIFY_CODE_SUCCESS")) {
            this.b.dismiss();
            this.f5314l.setVisibility(0);
            this.f5313k.setVisibility(4);
            m3474d();
        } else if (str.equalsIgnoreCase("NOTIFY_REGET_VERIFY_CODE_FAULT")) {
            r0 = ((Integer) list.get(0)).intValue();
            this.b.dismiss();
            new Builder(this).setTitle(2131165514).setMessage(r0).setPositiveButton(2131165438, new C08893(this)).show();
        }
    }
}
