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
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.illuminate.texaspoker.p059d.Country;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.RuntimeData;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.utils.Utility;
import com.illuminate.texaspoker.view.LoadingDialog;
import com.illuminate.texaspoker.view.SelectCountryListDialog;
import java.util.List;
import java.util.Map;
import net.sqlcipher.database.SQLiteDatabase;

public class ForgetPassActivity extends BaseMainActivity {
    private static String f4413c;
    private Menu f4414d;
    private Country f4415e;
    private List<Country> f4416f;
    private TextView f4417g;
    private ImageView f4418h;
    private EditText f4419i;
    private SelectCountryListDialog f4420j;

    /* renamed from: com.illuminate.texaspoker.activity.ForgetPassActivity.1 */
    class C06051 implements OnClickListener {
        final /* synthetic */ ForgetPassActivity f4403a;

        C06051(ForgetPassActivity forgetPassActivity) {
            this.f4403a = forgetPassActivity;
        }

        public final void onClick(View view) {
            this.f4403a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ForgetPassActivity.2 */
    class C06062 implements OnClickListener {
        final /* synthetic */ ForgetPassActivity f4404a;

        C06062(ForgetPassActivity forgetPassActivity) {
            this.f4404a = forgetPassActivity;
        }

        public final void onClick(View view) {
            this.f4404a.m3013a();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ForgetPassActivity.3 */
    class C06073 implements OnGlobalLayoutListener {
        final /* synthetic */ ForgetPassActivity f4405a;

        C06073(ForgetPassActivity forgetPassActivity) {
            this.f4405a = forgetPassActivity;
        }

        public final void onGlobalLayout() {
            this.f4405a.m3016b();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ForgetPassActivity.4 */
    class C06084 implements OnClickListener {
        final /* synthetic */ ForgetPassActivity f4406a;

        C06084(ForgetPassActivity forgetPassActivity) {
            this.f4406a = forgetPassActivity;
        }

        public final void onClick(View view) {
            ForgetPassActivity.m3103a(this.f4406a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ForgetPassActivity.5 */
    class C06095 implements OnTouchListener {
        final /* synthetic */ ForgetPassActivity f4407a;

        C06095(ForgetPassActivity forgetPassActivity) {
            this.f4407a = forgetPassActivity;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            switch (motionEvent.getAction()) {
                case SQLiteDatabase.OPEN_READWRITE /*0*/:
                    this.f4407a.f4418h.setImageResource(2130903401);
                    break;
                case SQLiteDatabase.OPEN_READONLY /*1*/:
                    this.f4407a.f4418h.setImageResource(2130903400);
                    break;
            }
            return false;
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ForgetPassActivity.6 */
    class C06106 implements TextWatcher {
        final /* synthetic */ ForgetPassActivity f4408a;

        C06106(ForgetPassActivity forgetPassActivity) {
            this.f4408a = forgetPassActivity;
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            if (this.f4408a.f4414d == null) {
                return;
            }
            if (StringUtils.m4462a(editable.toString())) {
                this.f4408a.f4414d.getItem(0).setEnabled(false);
            } else {
                this.f4408a.f4414d.getItem(0).setEnabled(true);
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ForgetPassActivity.7 */
    class C06117 implements SelectCountryListDialog.SelectCountryListDialog {
        final /* synthetic */ ForgetPassActivity f4409a;

        C06117(ForgetPassActivity forgetPassActivity) {
            this.f4409a = forgetPassActivity;
        }

        public final void m3101a(Country country) {
            this.f4409a.f4415e = country;
            this.f4409a.f4417g.setText(this.f4409a.f4415e.f6040b + " +" + this.f4409a.f4415e.f6041c);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ForgetPassActivity.8 */
    class C06128 implements DialogInterface.OnClickListener {
        final /* synthetic */ ForgetPassActivity f4410a;

        C06128(ForgetPassActivity forgetPassActivity) {
            this.f4410a = forgetPassActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ForgetPassActivity.9 */
    class C06139 implements DialogInterface.OnClickListener {
        final /* synthetic */ String f4411a;
        final /* synthetic */ ForgetPassActivity f4412b;

        C06139(ForgetPassActivity forgetPassActivity, String str) {
            this.f4412b = forgetPassActivity;
            this.f4411a = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f4412b.b = new LoadingDialog(this.f4412b);
            this.f4412b.b.show();
            String str = this.f4412b.f4415e.f6041c;
            NetworkUtil.m4073a();
            NetworkUtil.m4140b(this.f4411a, str);
        }
    }

    static {
        f4413c = "ForgetPassActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968635);
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        if (toolbar != null) {
            toolbar.setTitleTextAppearance(this, 2131296567);
            toolbar.setNavigationIcon(2130837653);
            toolbar.setNavigationOnClickListener(new C06051(this));
        }
        View findViewById = findViewById(2131558601);
        if (findViewById != null) {
            findViewById.setOnClickListener(new C06062(this));
            findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new C06073(this));
        }
        ImageButton imageButton = (ImageButton) findViewById(2131558726);
        if (imageButton != null) {
            imageButton.setOnClickListener(new C06084(this));
            imageButton.setOnTouchListener(new C06095(this));
        }
        this.f4417g = (TextView) findViewById(2131558724);
        this.f4418h = (ImageView) findViewById(2131558725);
        this.f4419i = (EditText) findViewById(2131558727);
        this.f4419i.addTextChangedListener(new C06106(this));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131689487, menu);
        this.f4414d = menu;
        this.f4414d.getItem(0).setEnabled(false);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131559436) {
            return super.onOptionsItemSelected(menuItem);
        }
        m3013a();
        String trim = this.f4419i.getText().toString().trim();
        new Builder(this).setTitle(2131165716).setMessage(String.format(getResources().getString(2131165715), new Object[]{trim})).setPositiveButton(2131165438, new C06139(this, trim)).setNegativeButton(2131165432, new C06128(this)).show();
        return true;
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 2131034133);
    }

    protected void onResume() {
        super.onResume();
        Utility.m4509i();
        this.f4416f = RuntimeData.f6689t;
        Map map = RuntimeData.f6690u;
        if (this.f4415e == null) {
            this.f4415e = (Country) map.get(Utility.m4488c());
            if (this.f4415e == null) {
                this.f4415e = (Country) map.get("AU");
            }
        }
        CharSequence charSequence = this.f4415e.f6040b + " +" + this.f4415e.f6041c;
        if (this.f4417g != null) {
            this.f4417g.setText(charSequence);
        }
    }

    protected void onPause() {
        super.onPause();
        if (this.f4420j != null) {
            this.f4420j.dismiss();
        }
    }

    protected final void m3108a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_RESET_PWD_UPLOAD_SUCCESS")) {
            this.b.dismiss();
            Intent intent = new Intent(this, ResetPassActivity.class);
            intent.putExtra("phoneNumStr", this.f4419i.getText().toString().trim());
            intent.putExtra("countryCodeStr", this.f4415e.f6041c);
            startActivity(intent);
            overridePendingTransition(2131034126, 2131034126);
        }
    }

    static /* synthetic */ void m3103a(ForgetPassActivity forgetPassActivity) {
        forgetPassActivity.f4420j = new SelectCountryListDialog(forgetPassActivity, forgetPassActivity.f4416f, new C06117(forgetPassActivity));
        forgetPassActivity.f4420j.show();
    }
}
