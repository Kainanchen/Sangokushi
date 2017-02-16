package com.illuminate.texaspoker.activity;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AlertDialog.Builder;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.GraphRequest.GraphRequest;
import com.facebook.p036h.CallbackManagerImpl;
import com.facebook.p037i.LoginManager;
import com.facebook.p037i.LoginResult;
import com.google.protobuf.DescriptorProtos.ServiceOptions;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p059d.Country;
import com.illuminate.texaspoker.service.ForegroundService;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.RuntimeData;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.utils.Utility;
import com.illuminate.texaspoker.view.LoadingDialog;
import com.illuminate.texaspoker.view.SelectCountryListDialog;
import com.sina.weibo.sdk.component.ShareRequestParam;
import com.sina.weibo.sdk.constant.WBPageConstants.ParamKey;
import com.sina.weibo.sdk.register.mobile.SelectCountryActivity;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage;
import com.texaspoker.moment.TexasPokerHttp.SCUpdateRsp;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import net.sqlcipher.database.SQLiteDatabase;
import org.json.JSONException;
import org.json.JSONObject;

public class LoginActivity extends BaseActivity {
    private CallbackManager f4635c;
    private Country f4636d;
    private List<Country> f4637e;
    private Map<String, Country> f4638f;
    private ImageButton f4639g;
    private TextView f4640h;
    private ImageView f4641i;
    private EditText f4642j;
    private View f4643k;
    private EditText f4644l;
    private View f4645m;
    private Button f4646n;
    private TextView f4647o;
    private View f4648p;
    private ImageButton f4649q;
    private TextView f4650r;
    private ImageView f4651s;
    private SelectCountryListDialog f4652t;

    /* renamed from: com.illuminate.texaspoker.activity.LoginActivity.1 */
    class C06691 implements OnClickListener {
        final /* synthetic */ LoginActivity f4625a;

        C06691(LoginActivity loginActivity) {
            this.f4625a = loginActivity;
        }

        public final void onClick(View view) {
            this.f4625a.m3187b();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.LoginActivity.2 */
    class C06702 implements OnClickListener {
        final /* synthetic */ LoginActivity f4626a;

        C06702(LoginActivity loginActivity) {
            this.f4626a = loginActivity;
        }

        public final void onClick(View view) {
            LoginActivity.m3192f(this.f4626a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.LoginActivity.3 */
    class C06713 implements OnTouchListener {
        final /* synthetic */ LoginActivity f4627a;

        C06713(LoginActivity loginActivity) {
            this.f4627a = loginActivity;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            switch (motionEvent.getAction()) {
                case SQLiteDatabase.OPEN_READWRITE /*0*/:
                    this.f4627a.f4647o.setTextColor(-10399690);
                    this.f4627a.f4648p.setBackgroundColor(-10399690);
                    break;
                case SQLiteDatabase.OPEN_READONLY /*1*/:
                    this.f4627a.f4647o.setTextColor(-2510995);
                    this.f4627a.f4648p.setBackgroundColor(-2510995);
                    break;
            }
            return false;
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.LoginActivity.4 */
    class C06724 implements OnClickListener {
        final /* synthetic */ LoginActivity f4628a;

        C06724(LoginActivity loginActivity) {
            this.f4628a = loginActivity;
        }

        public final void onClick(View view) {
            LoginActivity.m3195i(this.f4628a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.LoginActivity.5 */
    class C06735 implements OnClickListener {
        final /* synthetic */ LoginActivity f4629a;

        C06735(LoginActivity loginActivity) {
            this.f4629a = loginActivity;
        }

        public final void onClick(View view) {
            this.f4629a.m3183a();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.LoginActivity.6 */
    class C06746 implements OnTouchListener {
        final /* synthetic */ LoginActivity f4630a;

        C06746(LoginActivity loginActivity) {
            this.f4630a = loginActivity;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            switch (motionEvent.getAction()) {
                case SQLiteDatabase.OPEN_READWRITE /*0*/:
                    this.f4630a.f4650r.setTextColor(-14081512);
                    this.f4630a.f4651s.setImageResource(2130903404);
                    break;
                case SQLiteDatabase.OPEN_READONLY /*1*/:
                    this.f4630a.f4650r.setTextColor(-9677003);
                    this.f4630a.f4651s.setImageResource(2130903403);
                    break;
            }
            return false;
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.LoginActivity.7 */
    class C06767 implements FacebookCallback<LoginResult> {
        final /* synthetic */ LoginActivity f4632a;

        /* renamed from: com.illuminate.texaspoker.activity.LoginActivity.7.1 */
        class C06751 implements GraphRequest {
            final /* synthetic */ C06767 f4631a;

            C06751(C06767 c06767) {
                this.f4631a = c06767;
            }

            public final void m3178a(JSONObject jSONObject) {
                try {
                    int i;
                    String string = jSONObject.getString(SelectCountryActivity.EXTRA_COUNTRY_NAME);
                    String string2 = jSONObject.getString("id");
                    jSONObject.getJSONObject("picture").getJSONObject(ShareRequestParam.RESP_UPLOAD_PIC_PARAM_DATA).getString(ParamKey.URL);
                    if (jSONObject.getString("gender").equalsIgnoreCase("male")) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    this.f4631a.f4632a.a = new LoadingDialog(this.f4631a.f4632a);
                    this.f4631a.f4632a.a.show();
                    NetworkUtil.m4073a();
                    NetworkUtil.m4121a(string2, string, i);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }

        C06767(LoginActivity loginActivity) {
            this.f4632a = loginActivity;
        }

        public final void m3180a(FacebookException facebookException) {
            facebookException.printStackTrace();
            Log.e("LoginActivity", facebookException.getMessage(), facebookException);
        }

        public final /* synthetic */ void m3179a() {
            AccessToken a = AccessToken.m883a();
            if (a != null) {
                com.facebook.GraphRequest a2 = com.facebook.GraphRequest.m2615a(a, new C06751(this));
                Bundle bundle = new Bundle();
                bundle.putString("fields", "picture,name,gender,id");
                a2.f2713d = bundle;
                a2.m2644b();
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.LoginActivity.8 */
    class C06778 implements SelectCountryListDialog.SelectCountryListDialog {
        final /* synthetic */ LoginActivity f4633a;

        C06778(LoginActivity loginActivity) {
            this.f4633a = loginActivity;
        }

        public final void m3181a(Country country) {
            this.f4633a.f4636d = country;
            this.f4633a.f4640h.setText(this.f4633a.f4636d.f6040b + " +" + this.f4633a.f4636d.f6041c);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.LoginActivity.9 */
    class C06789 implements DialogInterface.OnClickListener {
        final /* synthetic */ LoginActivity f4634a;

        C06789(LoginActivity loginActivity) {
            this.f4634a = loginActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    public LoginActivity() {
        this.f4636d = null;
    }

    static /* synthetic */ void m3191e(LoginActivity loginActivity) {
        String obj = loginActivity.f4642j.getText().toString();
        String obj2 = loginActivity.f4644l.getText().toString();
        if (StringUtils.m4462a((CharSequence) obj)) {
            Toast.makeText(loginActivity.getApplicationContext(), 2131165730, 0).show();
        } else if (StringUtils.m4462a((CharSequence) obj2)) {
            Toast.makeText(loginActivity.getApplicationContext(), 2131165727, 0).show();
        } else if (loginActivity.f4642j.isFocused() || loginActivity.f4644l.isFocused()) {
            loginActivity.m3187b();
            loginActivity.a = new LoadingDialog(loginActivity);
            loginActivity.a.show();
            String str = loginActivity.f4636d.f6041c;
            NetworkUtil.m4073a();
            NetworkUtil.m4122a(obj, obj2, str);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NetworkUtil.m4073a();
        NetworkUtil.m4178m();
        setContentView(2130968648);
        new StringBuilder("country = ").append(Utility.m4488c());
        this.f4635c = new CallbackManagerImpl();
        LoginManager.m1842a().m1849a(this.f4635c, new C06767(this));
        View findViewById = findViewById(2131558755);
        findViewById.setOnClickListener(new C06691(this));
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            final /* synthetic */ LoginActivity f4617a;

            {
                this.f4617a = r1;
            }

            public final void onGlobalLayout() {
                int i;
                BaseActivity baseActivity = this.f4617a;
                Rect rect = new Rect();
                baseActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                int height = baseActivity.getWindow().getDecorView().getRootView().getHeight() - rect.bottom;
                if (VERSION.SDK_INT >= 20) {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    baseActivity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                    int i2 = displayMetrics.heightPixels;
                    baseActivity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
                    i = displayMetrics.heightPixels;
                    if (i > i2) {
                        i -= i2;
                    } else {
                        i = 0;
                    }
                    i = height - i;
                } else {
                    i = height;
                }
                if (i > 210 && SharedPreferencesManager.m4296a(baseActivity.getResources()) != i) {
                    SharedPreferencesManager.m4384l(i);
                }
            }
        });
        this.f4639g = (ImageButton) findViewById(2131558726);
        this.f4639g.setOnClickListener(new OnClickListener() {
            final /* synthetic */ LoginActivity f4618a;

            {
                this.f4618a = r1;
            }

            public final void onClick(View view) {
                LoginActivity.m3188b(this.f4618a);
            }
        });
        this.f4639g.setOnTouchListener(new OnTouchListener() {
            final /* synthetic */ LoginActivity f4619a;

            {
                this.f4619a = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case SQLiteDatabase.OPEN_READWRITE /*0*/:
                        this.f4619a.f4641i.setImageResource(2130903401);
                        break;
                    case SQLiteDatabase.OPEN_READONLY /*1*/:
                        this.f4619a.f4641i.setImageResource(2130903400);
                        break;
                }
                return false;
            }
        });
        this.f4640h = (TextView) findViewById(2131558724);
        this.f4641i = (ImageView) findViewById(2131558725);
        this.f4642j = (EditText) findViewById(2131558757);
        this.f4642j.setOnTouchListener(new OnTouchListener() {
            final /* synthetic */ LoginActivity f4620a;

            {
                this.f4620a = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                LoginActivity.m3186a(this.f4620a, 2);
                return false;
            }
        });
        this.f4642j.addTextChangedListener(new TextWatcher() {
            final /* synthetic */ LoginActivity f4621a;

            {
                this.f4621a = r1;
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                LoginActivity.m3190d(this.f4621a);
            }
        });
        this.f4643k = findViewById(2131558758);
        this.f4644l = (EditText) findViewById(2131558759);
        this.f4644l.setOnTouchListener(new OnTouchListener() {
            final /* synthetic */ LoginActivity f4622a;

            {
                this.f4622a = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                LoginActivity.m3186a(this.f4622a, 3);
                return false;
            }
        });
        this.f4644l.addTextChangedListener(new TextWatcher() {
            final /* synthetic */ LoginActivity f4623a;

            {
                this.f4623a = r1;
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                LoginActivity.m3190d(this.f4623a);
            }
        });
        this.f4645m = findViewById(2131558760);
        this.f4646n = (Button) findViewById(2131558761);
        this.f4646n.setOnClickListener(new OnClickListener() {
            final /* synthetic */ LoginActivity f4624a;

            {
                this.f4624a = r1;
            }

            public final void onClick(View view) {
                LoginActivity.m3191e(this.f4624a);
            }
        });
        ImageButton imageButton = (ImageButton) findViewById(2131558762);
        imageButton.setOnClickListener(new C06702(this));
        imageButton.setOnTouchListener(new C06713(this));
        this.f4647o = (TextView) findViewById(2131558763);
        this.f4648p = findViewById(2131558764);
        ((ImageButton) findViewById(2131558765)).setOnClickListener(new C06724(this));
        this.f4649q = (ImageButton) findViewById(2131558766);
        this.f4649q.setOnClickListener(new C06735(this));
        this.f4649q.setOnTouchListener(new C06746(this));
        this.f4650r = (TextView) findViewById(2131558768);
        this.f4651s = (ImageView) findViewById(2131558767);
    }

    protected void onResume() {
        super.onResume();
        Utility.m4509i();
        this.f4637e = RuntimeData.f6689t;
        this.f4638f = RuntimeData.f6690u;
        if (this.f4636d == null) {
            this.f4636d = (Country) this.f4638f.get(Utility.m4488c());
            if (this.f4636d == null) {
                this.f4636d = (Country) this.f4638f.get("AU");
            }
        }
        this.f4640h.setText(this.f4636d.f6040b + " +" + this.f4636d.f6041c);
        if (SharedPreferencesManager.m4325c()) {
            m3184a(2131165514, 2131165721);
        }
        if (SharedPreferencesManager.m4339e()) {
            m3184a(2131165488, 2131165487);
        }
    }

    protected void onPause() {
        super.onPause();
        if (this.f4652t != null) {
            this.f4652t.dismiss();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (this.a != null && this.a.isShowing()) {
                return true;
            }
            Intent intent = new Intent();
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            startActivity(intent);
        }
        return super.onKeyDown(i, keyEvent);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == ServiceOptions.UNINTERPRETED_OPTION_FIELD_NUMBER) {
            if (i2 == ServiceOptions.UNINTERPRETED_OPTION_FIELD_NUMBER) {
                m3183a();
            }
        } else if (i == CallbackManagerImpl.CallbackManagerImpl.Login.m1610a() && i2 == -1) {
            this.f4635c.m1446a(i, i2, intent);
        }
    }

    private void m3183a() {
        LoginManager.m1842a().m1848a((Activity) this, Arrays.asList(new String[]{"public_profile", NotificationCompatApi24.CATEGORY_EMAIL, "user_friends"}));
    }

    private void m3187b() {
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
        }
    }

    private void m3184a(int i, int i2) {
        ForegroundService.f6510a = false;
        String ac = SharedPreferencesManager.ac();
        SharedPreferencesManager.m4300a();
        SharedPreferencesManager.m4379k(ac);
        SharedPreferencesManager.m4354h();
        DBManager.m3631a().m3633c();
        new Builder(this).setTitle(i).setMessage(i2).setPositiveButton(2131165438, new C06789(this)).setCancelable(false).create().show();
    }

    public final void m3201a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_LOGIN_FAULT")) {
            this.a.dismiss();
            new Builder(this).setTitle(2131165514).setMessage(((Integer) list.get(0)).intValue()).setPositiveButton(2131165438, new DialogInterface.OnClickListener() {
                final /* synthetic */ LoginActivity f4615a;

                {
                    this.f4615a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                }
            }).show();
        } else if (str.equalsIgnoreCase("NOTIFY_LOGIN_SUCCESS")) {
            SharedPreferencesManager.m4337e(this.f4642j.getText().toString());
            this.a.dismiss();
            if (StringUtils.m4462a(SharedPreferencesManager.m4361i())) {
                r0 = new Intent(this, CompleteActivity.class);
                r0.setFlags(67108864);
                r0.setFlags(WXMediaMessage.THUMB_LENGTH_LIMIT);
                r0.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                startActivity(r0);
                finish();
                return;
            }
            r0 = new Intent(this, MainActivity.class);
            r0.setFlags(67108864);
            r0.setFlags(WXMediaMessage.THUMB_LENGTH_LIMIT);
            r0.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            r0.putExtra("returnTo", -1);
            startActivity(r0);
            finish();
        } else if (str.equalsIgnoreCase("NOTIFY_UPDATE_RESULT")) {
            Utility.m4476a((Context) this, (SCUpdateRsp) list.get(0));
        } else if (str.equalsIgnoreCase("NOTIFY_LOGIN_FACEBOOK_SUCCESS")) {
            this.a.dismiss();
            r0 = new Intent(this, MainActivity.class);
            r0.setFlags(67108864);
            r0.setFlags(WXMediaMessage.THUMB_LENGTH_LIMIT);
            r0.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            r0.putExtra("returnTo", -1);
            startActivity(r0);
            finish();
        } else if (str.equalsIgnoreCase("NOTIFY_LOGIN_FACEBOOK_FAULT")) {
            this.a.dismiss();
            new Builder(this).setTitle(2131165514).setMessage(((Integer) list.get(0)).intValue()).setPositiveButton(2131165438, new DialogInterface.OnClickListener() {
                final /* synthetic */ LoginActivity f4616a;

                {
                    this.f4616a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                }
            }).show();
        }
    }

    static /* synthetic */ void m3188b(LoginActivity loginActivity) {
        loginActivity.m3187b();
        loginActivity.f4652t = new SelectCountryListDialog(loginActivity, loginActivity.f4637e, new C06778(loginActivity));
        loginActivity.f4652t.show();
    }

    static /* synthetic */ void m3186a(LoginActivity loginActivity, int i) {
        switch (i) {
            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                loginActivity.f4643k.setBackgroundColor(-5140645);
                loginActivity.f4645m.setBackgroundColor(-12371672);
                return;
            case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                loginActivity.f4645m.setBackgroundColor(-5140645);
                loginActivity.f4643k.setBackgroundColor(-12371672);
                return;
            case SQLiteDatabase.CONFLICT_IGNORE /*4*/:
                loginActivity.f4645m.setBackgroundColor(-12371672);
                loginActivity.f4643k.setBackgroundColor(-12371672);
                break;
        }
        loginActivity.f4643k.setBackgroundColor(-5140645);
        loginActivity.f4645m.setBackgroundColor(-12371672);
    }

    static /* synthetic */ void m3190d(LoginActivity loginActivity) {
        String obj = loginActivity.f4642j.getText().toString();
        String obj2 = loginActivity.f4644l.getText().toString();
        CharSequence trim = obj.trim();
        CharSequence trim2 = obj2.trim();
        if (StringUtils.m4462a(trim) || StringUtils.m4462a(trim2)) {
            loginActivity.f4646n.setEnabled(false);
            loginActivity.f4646n.setTextColor(-9476002);
            return;
        }
        loginActivity.f4646n.setEnabled(true);
        loginActivity.f4646n.setTextColor(ViewCompat.MEASURED_STATE_MASK);
    }

    static /* synthetic */ void m3192f(LoginActivity loginActivity) {
        loginActivity.startActivity(new Intent(loginActivity, ForgetPassActivity.class));
        loginActivity.overridePendingTransition(2131034124, 0);
    }

    static /* synthetic */ void m3195i(LoginActivity loginActivity) {
        loginActivity.startActivityForResult(new Intent(loginActivity, RegisterActivity.class), ServiceOptions.UNINTERPRETED_OPTION_FIELD_NUMBER);
        loginActivity.overridePendingTransition(2131034124, 0);
    }
}
