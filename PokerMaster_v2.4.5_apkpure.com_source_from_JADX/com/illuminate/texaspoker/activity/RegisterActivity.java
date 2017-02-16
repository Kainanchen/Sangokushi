package com.illuminate.texaspoker.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.protobuf.DescriptorProtos.ServiceOptions;
import com.illuminate.texaspoker.p059d.Country;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.RuntimeData;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.utils.Utility;
import com.illuminate.texaspoker.view.LoadingDialog;
import com.illuminate.texaspoker.view.SelectCountryListDialog;
import com.sina.weibo.sdk.constant.WBPageConstants.ParamKey;
import java.util.List;
import java.util.Map;
import net.sqlcipher.database.SQLiteDatabase;

public class RegisterActivity extends BaseMainActivity {
    private String f5060c;
    private String f5061d;
    private Menu f5062e;
    private Country f5063f;
    private List<Country> f5064g;
    private TextView f5065h;
    private ImageView f5066i;
    private EditText f5067j;
    private View f5068k;
    private EditText f5069l;
    private View f5070m;
    private SelectCountryListDialog f5071n;

    /* renamed from: com.illuminate.texaspoker.activity.RegisterActivity.1 */
    class C07871 implements OnClickListener {
        final /* synthetic */ RegisterActivity f5051a;

        C07871(RegisterActivity registerActivity) {
            this.f5051a = registerActivity;
        }

        public final void onClick(View view) {
            this.f5051a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.RegisterActivity.2 */
    class C07882 implements OnClickListener {
        final /* synthetic */ RegisterActivity f5052a;

        C07882(RegisterActivity registerActivity) {
            this.f5052a = registerActivity;
        }

        public final void onClick(View view) {
            this.f5052a.setResult(ServiceOptions.UNINTERPRETED_OPTION_FIELD_NUMBER, new Intent());
            this.f5052a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.RegisterActivity.3 */
    class C07893 implements OnClickListener {
        final /* synthetic */ RegisterActivity f5053a;

        C07893(RegisterActivity registerActivity) {
            this.f5053a = registerActivity;
        }

        public final void onClick(View view) {
            Intent intent = new Intent(this.f5053a, WebPopupActivity.class);
            Bundle bundle = new Bundle();
            if (Utility.m4480a()) {
                bundle.putString(ParamKey.URL, "http://upyun.pokermate.net/web/cn/agreement.html");
            } else if (Utility.m4485b()) {
                bundle.putString(ParamKey.URL, "http://upyun.pokermate.net/web/tw/agreement.html");
            } else {
                bundle.putString(ParamKey.URL, "http://upyun.pokermate.net/web/en/agreement.html");
            }
            bundle.putInt("titleId", 2131165713);
            intent.putExtras(bundle);
            this.f5053a.startActivity(intent);
            this.f5053a.overridePendingTransition(2131034124, 0);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.RegisterActivity.4 */
    class C07904 implements SelectCountryListDialog.SelectCountryListDialog {
        final /* synthetic */ RegisterActivity f5054a;

        C07904(RegisterActivity registerActivity) {
            this.f5054a = registerActivity;
        }

        public final void m3380a(Country country) {
            this.f5054a.f5063f = country;
            this.f5054a.f5065h.setText(this.f5054a.f5063f.f6040b + " +" + this.f5054a.f5063f.f6041c);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.RegisterActivity.5 */
    class C07915 implements DialogInterface.OnClickListener {
        final /* synthetic */ RegisterActivity f5055a;

        C07915(RegisterActivity registerActivity) {
            this.f5055a = registerActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.RegisterActivity.6 */
    class C07926 implements DialogInterface.OnClickListener {
        final /* synthetic */ RegisterActivity f5056a;

        C07926(RegisterActivity registerActivity) {
            this.f5056a = registerActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.RegisterActivity.7 */
    class C07937 implements DialogInterface.OnClickListener {
        final /* synthetic */ RegisterActivity f5057a;

        C07937(RegisterActivity registerActivity) {
            this.f5057a = registerActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f5057a.b = new LoadingDialog(this.f5057a);
            this.f5057a.b.show();
            String str = this.f5057a.f5063f.f6041c;
            NetworkUtil.m4073a();
            NetworkUtil.m4130b(this.f5057a.f5060c, this.f5057a.f5061d, str);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.RegisterActivity.8 */
    class C07948 implements DialogInterface.OnClickListener {
        final /* synthetic */ RegisterActivity f5058a;

        C07948(RegisterActivity registerActivity) {
            this.f5058a = registerActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.RegisterActivity.9 */
    class C07959 implements OnClickListener {
        final /* synthetic */ RegisterActivity f5059a;

        C07959(RegisterActivity registerActivity) {
            this.f5059a = registerActivity;
        }

        public final void onClick(View view) {
            this.f5059a.m3013a();
        }
    }

    static /* synthetic */ void m3385c(RegisterActivity registerActivity) {
        if (registerActivity.f5062e == null) {
            return;
        }
        if (StringUtils.m4462a(registerActivity.f5067j.getText().toString().trim()) || StringUtils.m4462a(registerActivity.f5069l.getText().toString().trim())) {
            registerActivity.f5062e.getItem(0).setEnabled(false);
        } else {
            registerActivity.f5062e.getItem(0).setEnabled(true);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968660);
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        if (toolbar != null) {
            toolbar.setTitleTextAppearance(this, 2131296567);
            toolbar.setNavigationIcon(2130837653);
            toolbar.setNavigationOnClickListener(new C07871(this));
        }
        View findViewById = findViewById(2131558804);
        if (findViewById != null) {
            findViewById.setOnClickListener(new C07959(this));
            findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
                final /* synthetic */ RegisterActivity f5044a;

                {
                    this.f5044a = r1;
                }

                public final void onGlobalLayout() {
                    this.f5044a.m3016b();
                }
            });
        }
        ImageButton imageButton = (ImageButton) findViewById(2131558726);
        if (imageButton != null) {
            imageButton.setOnClickListener(new OnClickListener() {
                final /* synthetic */ RegisterActivity f5045a;

                {
                    this.f5045a = r1;
                }

                public final void onClick(View view) {
                    RegisterActivity.m3382a(this.f5045a);
                }
            });
            imageButton.setOnTouchListener(new OnTouchListener() {
                final /* synthetic */ RegisterActivity f5046a;

                {
                    this.f5046a = r1;
                }

                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    switch (motionEvent.getAction()) {
                        case SQLiteDatabase.OPEN_READWRITE /*0*/:
                            this.f5046a.f5066i.setImageResource(2130903401);
                            break;
                        case SQLiteDatabase.OPEN_READONLY /*1*/:
                            this.f5046a.f5066i.setImageResource(2130903400);
                            break;
                    }
                    return false;
                }
            });
        }
        this.f5065h = (TextView) findViewById(2131558724);
        this.f5066i = (ImageView) findViewById(2131558725);
        this.f5067j = (EditText) findViewById(2131558805);
        this.f5067j.setOnTouchListener(new OnTouchListener() {
            final /* synthetic */ RegisterActivity f5047a;

            {
                this.f5047a = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                RegisterActivity.m3383a(this.f5047a, 2);
                return false;
            }
        });
        this.f5067j.addTextChangedListener(new TextWatcher() {
            final /* synthetic */ RegisterActivity f5048a;

            {
                this.f5048a = r1;
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                RegisterActivity.m3385c(this.f5048a);
            }
        });
        this.f5068k = findViewById(2131558728);
        this.f5069l = (EditText) findViewById(2131558806);
        this.f5069l.setOnTouchListener(new OnTouchListener() {
            final /* synthetic */ RegisterActivity f5049a;

            {
                this.f5049a = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                RegisterActivity.m3383a(this.f5049a, 3);
                return false;
            }
        });
        this.f5069l.addTextChangedListener(new TextWatcher() {
            final /* synthetic */ RegisterActivity f5050a;

            {
                this.f5050a = r1;
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                RegisterActivity.m3385c(this.f5050a);
            }
        });
        this.f5070m = findViewById(2131558807);
        Button button = (Button) findViewById(2131558808);
        if (button != null) {
            button.setOnClickListener(new C07882(this));
        }
        button = (Button) findViewById(2131558809);
        if (button != null) {
            button.setOnClickListener(new C07893(this));
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131689500, menu);
        this.f5062e = menu;
        this.f5062e.getItem(0).setEnabled(false);
        return true;
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 2131034133);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131559453) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (this.f5067j.isFocused() || this.f5069l.isFocused()) {
            m3013a();
        }
        this.f5060c = this.f5067j.getText().toString();
        this.f5061d = this.f5069l.getText().toString();
        if (this.f5061d.length() < 6) {
            new Builder(this).setTitle(2131165514).setMessage(2131165729).setPositiveButton(2131165438, new C07915(this)).show();
            return true;
        }
        new Builder(this).setTitle(2131165716).setMessage(String.format(getResources().getString(2131165715), new Object[]{this.f5060c})).setPositiveButton(2131165438, new C07937(this)).setNegativeButton(2131165432, new C07926(this)).show();
        return true;
    }

    protected void onResume() {
        super.onResume();
        Utility.m4509i();
        this.f5064g = RuntimeData.f6689t;
        Map map = RuntimeData.f6690u;
        if (this.f5063f == null) {
            this.f5063f = (Country) map.get(Utility.m4488c());
            if (this.f5063f == null) {
                this.f5063f = (Country) map.get("AU");
            }
        }
        CharSequence charSequence = this.f5063f.f6040b + " +" + this.f5063f.f6041c;
        if (this.f5065h != null) {
            this.f5065h.setText(charSequence);
        }
    }

    protected void onPause() {
        super.onPause();
        if (this.f5071n != null) {
            this.f5071n.dismiss();
        }
    }

    protected final void m3390a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_REGISTER_SUCCESS")) {
            this.b.dismiss();
            Intent intent = new Intent(this, VerifyActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("phoneNumStr", this.f5060c);
            bundle.putString("countryCodeStr", this.f5063f.f6041c);
            intent.putExtras(bundle);
            startActivity(intent);
            overridePendingTransition(2131034126, 2131034126);
        } else if (str.equalsIgnoreCase("NOTIFY_REGISTER_FAULT")) {
            int intValue = ((Integer) list.get(0)).intValue();
            this.b.dismiss();
            new Builder(this).setTitle(2131165514).setMessage(intValue).setPositiveButton(2131165438, new C07948(this)).show();
        }
    }

    static /* synthetic */ void m3382a(RegisterActivity registerActivity) {
        registerActivity.f5071n = new SelectCountryListDialog(registerActivity, registerActivity.f5064g, new C07904(registerActivity));
        registerActivity.f5071n.show();
    }

    static /* synthetic */ void m3383a(RegisterActivity registerActivity, int i) {
        switch (i) {
            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                registerActivity.f5068k.setBackgroundColor(-5140645);
                registerActivity.f5070m.setBackgroundColor(-12371672);
                return;
            case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                registerActivity.f5070m.setBackgroundColor(-5140645);
                registerActivity.f5068k.setBackgroundColor(-12371672);
                return;
            case SQLiteDatabase.CONFLICT_IGNORE /*4*/:
                registerActivity.f5070m.setBackgroundColor(-12371672);
                registerActivity.f5068k.setBackgroundColor(-12371672);
                break;
        }
        registerActivity.f5068k.setBackgroundColor(-5140645);
        registerActivity.f5070m.setBackgroundColor(-12371672);
    }
}
