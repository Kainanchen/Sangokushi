package com.illuminate.texaspoker.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.illuminate.texaspoker.utils.Config;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.utils.Utility;
import com.illuminate.texaspoker.view.LoadingDialog;
import java.util.List;

public class EditMeNameActivity extends BaseToolBarActivity {
    private static String f4369d;
    private EditText f4370e;
    private TextView f4371f;
    private TextView f4372g;
    private Button f4373h;
    private TextView f4374i;

    /* renamed from: com.illuminate.texaspoker.activity.EditMeNameActivity.1 */
    class C05801 implements OnClickListener {
        final /* synthetic */ EditMeNameActivity f4359a;

        C05801(EditMeNameActivity editMeNameActivity) {
            this.f4359a = editMeNameActivity;
        }

        public final void onClick(View view) {
            this.f4359a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.EditMeNameActivity.2 */
    class C05822 implements DialogInterface.OnClickListener {
        final /* synthetic */ EditMeNameActivity f4361a;

        /* renamed from: com.illuminate.texaspoker.activity.EditMeNameActivity.2.1 */
        class C05811 implements DialogInterface.OnClickListener {
            final /* synthetic */ C05822 f4360a;

            C05811(C05822 c05822) {
                this.f4360a = c05822;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (i == 0) {
                    this.f4360a.f4361a.startActivity(new Intent(this.f4360a.f4361a, RechargeForGoogleActivity.class));
                } else if (i == 1) {
                    this.f4360a.f4361a.startActivity(new Intent(this.f4360a.f4361a, RechargeActivity.class));
                }
            }
        }

        C05822(EditMeNameActivity editMeNameActivity) {
            this.f4361a = editMeNameActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (Config.f6659d == Config.f6657b) {
                this.f4361a.startActivity(new Intent(this.f4361a, RechargeForGoogleActivity.class));
            } else if (Config.f6659d == Config.f6658c) {
                this.f4361a.startActivity(new Intent(this.f4361a, RechargeActivity.class));
            } else {
                new Builder(this.f4361a).setTitle((CharSequence) "\u5f00\u53d1\u6d4b\u8bd5\u7528,\u8bf7\u65e0\u89c6!").setItems(2131492866, new C05811(this)).show();
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.EditMeNameActivity.3 */
    class C05833 implements DialogInterface.OnClickListener {
        final /* synthetic */ EditMeNameActivity f4362a;

        C05833(EditMeNameActivity editMeNameActivity) {
            this.f4362a = editMeNameActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f4362a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.EditMeNameActivity.4 */
    class C05844 implements OnClickListener {
        final /* synthetic */ EditMeNameActivity f4363a;

        C05844(EditMeNameActivity editMeNameActivity) {
            this.f4363a = editMeNameActivity;
        }

        public final void onClick(View view) {
            this.f4363a.m2734b();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.EditMeNameActivity.5 */
    class C05855 implements OnGlobalLayoutListener {
        final /* synthetic */ EditMeNameActivity f4364a;

        C05855(EditMeNameActivity editMeNameActivity) {
            this.f4364a = editMeNameActivity;
        }

        public final void onGlobalLayout() {
            this.f4364a.m2735c();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.EditMeNameActivity.6 */
    class C05866 implements TextWatcher {
        final /* synthetic */ EditMeNameActivity f4365a;

        C05866(EditMeNameActivity editMeNameActivity) {
            this.f4365a = editMeNameActivity;
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            if (StringUtils.m4462a(editable.toString())) {
                this.f4365a.f4373h.setEnabled(false);
            } else {
                this.f4365a.f4373h.setEnabled(true);
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.EditMeNameActivity.7 */
    class C05877 implements OnClickListener {
        final /* synthetic */ EditMeNameActivity f4366a;

        C05877(EditMeNameActivity editMeNameActivity) {
            this.f4366a = editMeNameActivity;
        }

        public final void onClick(View view) {
            EditMeNameActivity.m3082b(this.f4366a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.EditMeNameActivity.8 */
    class C05888 implements DialogInterface.OnClickListener {
        final /* synthetic */ EditMeNameActivity f4367a;

        C05888(EditMeNameActivity editMeNameActivity) {
            this.f4367a = editMeNameActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.EditMeNameActivity.9 */
    class C05899 implements DialogInterface.OnClickListener {
        final /* synthetic */ EditMeNameActivity f4368a;

        C05899(EditMeNameActivity editMeNameActivity) {
            this.f4368a = editMeNameActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    static /* synthetic */ void m3082b(EditMeNameActivity editMeNameActivity) {
        String trim = editMeNameActivity.f4370e.getText().toString().trim();
        if (StringUtils.m4462a((CharSequence) trim)) {
            new Builder(editMeNameActivity).setTitle(2131165514).setMessage(2131165776).setPositiveButton(2131165438, new C05888(editMeNameActivity)).show();
        } else if (StringUtils.m4460a(trim) > 16) {
            new Builder(editMeNameActivity).setTitle(2131165514).setMessage(2131165750).setPositiveButton(2131165438, new C05899(editMeNameActivity)).show();
        } else {
            editMeNameActivity.b = new LoadingDialog(editMeNameActivity);
            editMeNameActivity.b.show();
            editMeNameActivity.m2734b();
            NetworkUtil.m4073a();
            NetworkUtil.m4110a(trim);
        }
    }

    static {
        f4369d = "EditMeNameActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968631);
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C05801(this));
        View findViewById = findViewById(2131558601);
        findViewById.setOnClickListener(new C05844(this));
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new C05855(this));
        this.f4370e = (EditText) findViewById(2131558715);
        this.f4371f = (TextView) findViewById(2131558558);
        this.f4371f.setText(SharedPreferencesManager.m4292W());
        this.f4372g = (TextView) findViewById(2131558557);
        this.f4372g.setText(Utility.m4502g(SharedPreferencesManager.m4413q()));
        this.f4374i = (TextView) findViewById(2131558716);
        this.f4374i.setText(String.format(getResources().getString(2131165754), new Object[]{Long.valueOf(SharedPreferencesManager.m4292W())}));
        if (SharedPreferencesManager.m4292W() > SharedPreferencesManager.m4413q()) {
            this.f4372g.setTextColor(-1811364);
        } else {
            this.f4372g.setTextColor(-1);
        }
        this.f4373h = (Button) findViewById(2131558717);
        this.f4370e.addTextChangedListener(new C05866(this));
        this.f4373h.setOnClickListener(new C05877(this));
    }

    protected void onResume() {
        super.onResume();
        this.b = new LoadingDialog(this);
        this.b.show();
        NetworkUtil.m4073a();
        NetworkUtil.m4172j();
    }

    protected final void m3083a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_REFRESH_CHECK_NICKNAME_SUCCESS")) {
            this.b.dismiss();
            if (((Integer) list.get(0)).intValue() == 0) {
                this.f4371f.setText("0");
                this.f4374i.setText(String.format(getResources().getString(2131165753), new Object[]{Long.valueOf(SharedPreferencesManager.m4292W())}));
            } else {
                this.f4371f.setText(SharedPreferencesManager.m4292W());
                this.f4374i.setText(String.format(getResources().getString(2131165754), new Object[]{Long.valueOf(SharedPreferencesManager.m4292W())}));
            }
            this.f4372g.setText(Utility.m4502g(SharedPreferencesManager.m4413q()));
            if (SharedPreferencesManager.m4292W() > SharedPreferencesManager.m4413q()) {
                this.f4372g.setTextColor(-1811364);
            } else {
                this.f4372g.setTextColor(-1);
            }
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_CHECK_NICKNAME_FAILED")) {
            this.b.dismiss();
            new Builder(this).setTitle(2131165514).setMessage(((Integer) list.get(0)).intValue()).setPositiveButton(2131165438, new DialogInterface.OnClickListener() {
                final /* synthetic */ EditMeNameActivity f4357a;

                {
                    this.f4357a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f4357a.finish();
                }
            }).show();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_BUY_NICKNAME_SUCCESS")) {
            this.b.dismiss();
            this.f4372g.setText(Utility.m4502g(SharedPreferencesManager.m4413q()));
            if (SharedPreferencesManager.m4292W() > SharedPreferencesManager.m4413q()) {
                this.f4372g.setTextColor(-1811364);
            } else {
                this.f4372g.setTextColor(-1);
            }
            m2732a(2130903589, 2131165752, 1);
            finish();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_BUY_NICKNAME_FAILED")) {
            this.b.dismiss();
            int intValue = ((Integer) list.get(0)).intValue();
            int intValue2 = ((Integer) list.get(1)).intValue();
            if (intValue2 == 51) {
                m2732a(2130903246, 2131165623, 1);
            } else if (intValue2 == 21) {
                new Builder(this).setTitle(2131165514).setMessage(2131165594).setPositiveButton(2131165427, new C05822(this)).setNegativeButton(2131165432, new DialogInterface.OnClickListener() {
                    final /* synthetic */ EditMeNameActivity f4358a;

                    {
                        this.f4358a = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                    }
                }).show();
            } else {
                new Builder(this).setTitle(2131165514).setMessage(intValue).setPositiveButton(2131165438, new C05833(this)).show();
            }
        }
    }
}
