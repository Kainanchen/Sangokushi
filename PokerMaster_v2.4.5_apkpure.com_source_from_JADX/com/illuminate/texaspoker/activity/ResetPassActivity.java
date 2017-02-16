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
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import com.ali.fixHelper;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.view.LoadingDialog;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import net.sqlcipher.database.SQLiteDatabase;

public class ResetPassActivity extends BaseToolBarActivity {
    private C0807a f5090d;
    private int f5091e;
    private String f5092f;
    private String f5093g;
    private Menu f5094h;
    private Timer f5095i;
    private EditText f5096j;
    private View f5097k;
    private EditText f5098l;
    private View f5099m;
    private View f5100n;
    private View f5101o;
    private TextView f5102p;

    /* renamed from: com.illuminate.texaspoker.activity.ResetPassActivity.1 */
    class C07981 implements OnClickListener {
        final /* synthetic */ ResetPassActivity f5080a;

        static {
            fixHelper.fixfunc(new int[]{3061, 3062});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C07981(ResetPassActivity resetPassActivity);

        public final native void onClick(View view);
    }

    /* renamed from: com.illuminate.texaspoker.activity.ResetPassActivity.2 */
    class C07992 implements DialogInterface.OnClickListener {
        final /* synthetic */ ResetPassActivity f5081a;

        static {
            fixHelper.fixfunc(new int[]{3422, 3423});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C07992(ResetPassActivity resetPassActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.activity.ResetPassActivity.3 */
    class C08003 extends TimerTask {
        final /* synthetic */ ResetPassActivity f5082a;

        static {
            fixHelper.fixfunc(new int[]{3335, 3336});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C08003(ResetPassActivity resetPassActivity);

        public final native void run();
    }

    /* renamed from: com.illuminate.texaspoker.activity.ResetPassActivity.4 */
    class C08014 implements DialogInterface.OnClickListener {
        final /* synthetic */ ResetPassActivity f5083a;

        static {
            fixHelper.fixfunc(new int[]{3506, 3507});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C08014(ResetPassActivity resetPassActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.activity.ResetPassActivity.5 */
    class C08025 implements DialogInterface.OnClickListener {
        final /* synthetic */ ResetPassActivity f5084a;

        static {
            fixHelper.fixfunc(new int[]{3431, 3432});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C08025(ResetPassActivity resetPassActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.activity.ResetPassActivity.6 */
    class C08036 implements DialogInterface.OnClickListener {
        final /* synthetic */ ResetPassActivity f5085a;

        static {
            fixHelper.fixfunc(new int[]{1478, 1479});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C08036(ResetPassActivity resetPassActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.activity.ResetPassActivity.7 */
    class C08047 implements DialogInterface.OnClickListener {
        final /* synthetic */ ResetPassActivity f5086a;

        static {
            fixHelper.fixfunc(new int[]{1525, 1526});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C08047(ResetPassActivity resetPassActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.activity.ResetPassActivity.8 */
    class C08058 implements OnClickListener {
        final /* synthetic */ ResetPassActivity f5087a;

        static {
            fixHelper.fixfunc(new int[]{1356, 1357});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C08058(ResetPassActivity resetPassActivity);

        public final native void onClick(View view);
    }

    /* renamed from: com.illuminate.texaspoker.activity.ResetPassActivity.9 */
    class C08069 implements OnGlobalLayoutListener {
        final /* synthetic */ ResetPassActivity f5088a;

        static {
            fixHelper.fixfunc(new int[]{1471, 1472});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C08069(ResetPassActivity resetPassActivity);

        public final native void onGlobalLayout();
    }

    /* renamed from: com.illuminate.texaspoker.activity.ResetPassActivity.a */
    private static class C0807a extends Handler {
        private final WeakReference<ResetPassActivity> f5089a;

        public C0807a(ResetPassActivity resetPassActivity) {
            this.f5089a = new WeakReference(resetPassActivity);
        }

        public final void handleMessage(Message message) {
            ResetPassActivity resetPassActivity = (ResetPassActivity) this.f5089a.get();
            if (resetPassActivity != null) {
                switch (message.what) {
                    case SQLiteDatabase.OPEN_READONLY /*1*/:
                        ResetPassActivity.m3398e(resetPassActivity);
                    default:
                }
            }
        }
    }

    static /* synthetic */ void m3394b(ResetPassActivity resetPassActivity) {
        if (resetPassActivity.f5094h == null) {
            return;
        }
        if (StringUtils.m4462a(resetPassActivity.f5096j.getText().toString().trim()) || StringUtils.m4462a(resetPassActivity.f5098l.getText().toString().trim())) {
            resetPassActivity.f5094h.getItem(0).setEnabled(false);
        } else {
            resetPassActivity.f5094h.getItem(0).setEnabled(true);
        }
    }

    static /* synthetic */ void m3398e(ResetPassActivity resetPassActivity) {
        resetPassActivity.f5091e--;
        resetPassActivity.f5102p.setText(String.format(resetPassActivity.getResources().getString(2131165741), new Object[]{Integer.valueOf(resetPassActivity.f5091e)}));
        if (resetPassActivity.f5091e == 0) {
            resetPassActivity.f5095i.cancel();
            resetPassActivity.f5101o.setVisibility(4);
            resetPassActivity.f5100n.setVisibility(0);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968661);
        Bundle extras = getIntent().getExtras();
        this.f5092f = extras.getString("phoneNumStr");
        this.f5093g = extras.getString("countryCodeStr");
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        if (toolbar != null) {
            toolbar.setTitleTextAppearance(this, 2131296567);
            toolbar.setNavigationIcon(2130837591);
            toolbar.setNavigationOnClickListener(new C07981(this));
        }
        View findViewById = findViewById(2131558810);
        if (findViewById != null) {
            findViewById.setOnClickListener(new C08058(this));
            findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new C08069(this));
        }
        this.f5096j = (EditText) findViewById(2131558759);
        this.f5096j.setOnTouchListener(new OnTouchListener() {
            final /* synthetic */ ResetPassActivity f5072a;

            {
                this.f5072a = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ResetPassActivity.m3393a(this.f5072a, 1);
                return false;
            }
        });
        this.f5096j.addTextChangedListener(new TextWatcher() {
            final /* synthetic */ ResetPassActivity f5073a;

            {
                this.f5073a = r1;
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                ResetPassActivity.m3394b(this.f5073a);
            }
        });
        this.f5097k = findViewById(2131558807);
        TextView textView = (TextView) findViewById(2131558811);
        CharSequence charSequence = "+" + this.f5093g + " " + this.f5092f;
        if (textView != null) {
            textView.setText(charSequence);
        }
        this.f5098l = (EditText) findViewById(2131558812);
        this.f5098l.setOnTouchListener(new OnTouchListener() {
            final /* synthetic */ ResetPassActivity f5074a;

            {
                this.f5074a = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ResetPassActivity.m3393a(this.f5074a, 2);
                return false;
            }
        });
        this.f5098l.addTextChangedListener(new TextWatcher() {
            final /* synthetic */ ResetPassActivity f5075a;

            {
                this.f5075a = r1;
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                ResetPassActivity.m3394b(this.f5075a);
            }
        });
        this.f5099m = findViewById(2131558813);
        this.f5100n = findViewById(2131558814);
        this.f5101o = findViewById(2131558816);
        this.f5102p = (TextView) findViewById(2131558817);
        m3397d();
        ImageButton imageButton = (ImageButton) findViewById(2131558815);
        if (imageButton != null) {
            imageButton.setOnClickListener(new OnClickListener() {
                final /* synthetic */ ResetPassActivity f5078a;

                /* renamed from: com.illuminate.texaspoker.activity.ResetPassActivity.14.1 */
                class C07961 implements DialogInterface.OnClickListener {
                    final /* synthetic */ AnonymousClass14 f5076a;

                    C07961(AnonymousClass14 anonymousClass14) {
                        this.f5076a = anonymousClass14;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                    }
                }

                /* renamed from: com.illuminate.texaspoker.activity.ResetPassActivity.14.2 */
                class C07972 implements DialogInterface.OnClickListener {
                    final /* synthetic */ AnonymousClass14 f5077a;

                    C07972(AnonymousClass14 anonymousClass14) {
                        this.f5077a = anonymousClass14;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        this.f5077a.f5078a.b = new LoadingDialog(this.f5077a.f5078a);
                        this.f5077a.f5078a.b.show();
                        NetworkUtil.m4073a();
                        NetworkUtil.m4120a(this.f5077a.f5078a.f5092f, this.f5077a.f5078a.f5093g);
                    }
                }

                {
                    this.f5078a = r1;
                }

                public final void onClick(View view) {
                    new Builder(this.f5078a).setTitle(2131165438).setMessage(2131165745).setPositiveButton(2131165438, new C07972(this)).setNegativeButton(2131165432, new C07961(this)).show();
                }
            });
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131689503, menu);
        this.f5094h = menu;
        this.f5094h.getItem(0).setEnabled(false);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131559439) {
            return super.onOptionsItemSelected(menuItem);
        }
        m2734b();
        String obj = this.f5096j.getText().toString();
        if (obj.length() < 6) {
            new Builder(this).setTitle(2131165514).setMessage(2131165729).setPositiveButton(2131165438, new C08014(this)).show();
        } else {
            String trim = this.f5098l.getText().toString().trim();
            if (trim.length() != 6) {
                new Builder(this).setTitle(2131165514).setMessage(2131165743).setPositiveButton(2131165438, new C08025(this)).show();
            } else {
                this.b = new LoadingDialog(this);
                this.b.show();
                NetworkUtil.m4073a();
                NetworkUtil.m4123a(trim, obj, this.f5092f, this.f5093g);
            }
        }
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (this.b != null && this.b.isShowing()) {
                return true;
            }
            m3391a();
        }
        return super.onKeyDown(i, keyEvent);
    }

    private void m3391a() {
        new Builder(this).setTitle(2131165514).setMessage(2131165738).setPositiveButton(2131165746, new C07992(this)).setNegativeButton(2131165424, new DialogInterface.OnClickListener() {
            final /* synthetic */ ResetPassActivity f5079a;

            {
                this.f5079a = r1;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f5079a.finish();
            }
        }).show();
    }

    private void m3397d() {
        if (this.f5095i != null) {
            this.f5095i.cancel();
        }
        this.f5091e = 60;
        this.f5102p.setText(String.format(getResources().getString(2131165741), new Object[]{Integer.valueOf(this.f5091e)}));
        this.f5090d = new C0807a(this);
        TimerTask c08003 = new C08003(this);
        this.f5095i = new Timer();
        this.f5095i.schedule(c08003, 0, 1000);
    }

    protected final void m3400a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_RESET_PWD_SUCCESS")) {
            this.b.dismiss();
            m2732a(2130903589, 2131165736, 1);
            Intent intent = new Intent(this, LoginActivity.class);
            intent.setFlags(67108864);
            intent.setFlags(WXMediaMessage.THUMB_LENGTH_LIMIT);
            startActivity(intent);
            finish();
            overridePendingTransition(0, 2131034133);
        } else if (str.equalsIgnoreCase("NOTIFY_RESET_PWD_FAULT")) {
            r0 = ((Integer) list.get(0)).intValue();
            this.b.dismiss();
            new Builder(this).setTitle(2131165514).setMessage(r0).setPositiveButton(2131165438, new C08036(this)).show();
        } else if (str.equalsIgnoreCase("NOTIFY_REGET_VERIFY_CODE_SUCCESS")) {
            this.b.dismiss();
            this.f5101o.setVisibility(0);
            this.f5100n.setVisibility(4);
            m3397d();
        } else if (str.equalsIgnoreCase("NOTIFY_REGET_VERIFY_CODE_FAULT")) {
            r0 = ((Integer) list.get(0)).intValue();
            this.b.dismiss();
            new Builder(this).setTitle(2131165514).setMessage(r0).setPositiveButton(2131165438, new C08047(this)).show();
        }
    }

    static /* synthetic */ void m3393a(ResetPassActivity resetPassActivity, int i) {
        switch (i) {
            case SQLiteDatabase.OPEN_READONLY /*1*/:
                resetPassActivity.f5097k.setBackgroundColor(-5140645);
                resetPassActivity.f5099m.setBackgroundColor(-12371672);
                return;
            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                resetPassActivity.f5097k.setBackgroundColor(-12371672);
                resetPassActivity.f5099m.setBackgroundColor(-5140645);
                break;
        }
        resetPassActivity.f5097k.setBackgroundColor(-5140645);
        resetPassActivity.f5099m.setBackgroundColor(-12371672);
    }
}
