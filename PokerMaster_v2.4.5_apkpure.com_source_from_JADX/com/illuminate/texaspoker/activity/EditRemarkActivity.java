package com.illuminate.texaspoker.activity;

import a.does.not.Exists2;
import android.content.DialogInterface;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.EditText;
import android.widget.TextView;
import com.ali.fixHelper;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.view.LoadingDialog;
import java.util.List;

public class EditRemarkActivity extends BaseToolBarActivity {
    private static String f4380d;
    private long f4381e;
    private String f4382f;
    private Menu f4383g;
    private EditText f4384h;
    private TextView f4385i;

    /* renamed from: com.illuminate.texaspoker.activity.EditRemarkActivity.1 */
    class C05901 implements OnClickListener {
        final /* synthetic */ EditRemarkActivity f4375a;

        static {
            fixHelper.fixfunc(new int[]{3612, 3613});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C05901(EditRemarkActivity editRemarkActivity);

        public final native void onClick(View view);
    }

    /* renamed from: com.illuminate.texaspoker.activity.EditRemarkActivity.2 */
    class C05912 implements OnClickListener {
        final /* synthetic */ EditRemarkActivity f4376a;

        static {
            fixHelper.fixfunc(new int[]{3504, 3505});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C05912(EditRemarkActivity editRemarkActivity);

        public final native void onClick(View view);
    }

    /* renamed from: com.illuminate.texaspoker.activity.EditRemarkActivity.3 */
    class C05923 implements OnGlobalLayoutListener {
        final /* synthetic */ EditRemarkActivity f4377a;

        static {
            fixHelper.fixfunc(new int[]{2628, 2629});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C05923(EditRemarkActivity editRemarkActivity);

        public final native void onGlobalLayout();
    }

    /* renamed from: com.illuminate.texaspoker.activity.EditRemarkActivity.4 */
    class C05934 implements TextWatcher {
        final /* synthetic */ EditRemarkActivity f4378a;

        static {
            fixHelper.fixfunc(new int[]{2608, 2609, 2610, 2611});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C05934(EditRemarkActivity editRemarkActivity);

        public final native void afterTextChanged(Editable editable);

        public final native void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3);

        public final native void onTextChanged(CharSequence charSequence, int i, int i2, int i3);
    }

    /* renamed from: com.illuminate.texaspoker.activity.EditRemarkActivity.5 */
    class C05945 implements DialogInterface.OnClickListener {
        final /* synthetic */ EditRemarkActivity f4379a;

        static {
            fixHelper.fixfunc(new int[]{2723, 2724});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C05945(EditRemarkActivity editRemarkActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    static {
        f4380d = "EditRemarkActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968632);
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        if (toolbar != null) {
            toolbar.setTitleTextAppearance(this, 2131296567);
            toolbar.setNavigationIcon(2130837591);
            toolbar.setNavigationOnClickListener(new C05901(this));
        }
        Bundle extras = getIntent().getExtras();
        this.f4381e = extras.getLong("friendUuid");
        this.f4382f = extras.getString("remarkStr");
        View findViewById = findViewById(2131558718);
        if (findViewById != null) {
            findViewById.setOnClickListener(new C05912(this));
            findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new C05923(this));
        }
        this.f4384h = (EditText) findViewById(2131558719);
        this.f4385i = (TextView) findViewById(2131558720);
        this.f4384h.addTextChangedListener(new C05934(this));
        this.f4384h.setText(this.f4382f);
        m3086a();
    }

    protected void onResume() {
        super.onResume();
        if (!DBManager.m3631a().m3632b() && this.f4383g != null) {
            if (StringUtils.m4462a(this.f4382f)) {
                this.f4383g.getItem(0).setEnabled(false);
            } else {
                this.f4383g.getItem(0).setEnabled(true);
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131689485, menu);
        this.f4383g = menu;
        if (StringUtils.m4462a(this.f4382f)) {
            this.f4383g.getItem(0).setEnabled(false);
        } else {
            this.f4383g.getItem(0).setEnabled(true);
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131559438) {
            return super.onOptionsItemSelected(menuItem);
        }
        m2734b();
        if (!StringUtils.m4462a(this.f4382f)) {
            String replaceAll = this.f4382f.replaceAll("(\r?\n(\\s*\r?\n)+)", "\r\n");
            if (StringUtils.m4460a(replaceAll) > 40) {
                new Builder(this).setTitle(2131165514).setMessage(2131165540).setPositiveButton(2131165438, new C05945(this)).show();
            } else {
                this.b = new LoadingDialog(this);
                this.b.show();
                NetworkUtil.m4073a();
                NetworkUtil.m4136b(this.f4381e, replaceAll);
            }
        }
        return true;
    }

    private void m3086a() {
        if (!DBManager.m3631a().m3632b()) {
            this.f4385i.setText(StringUtils.m4460a(this.f4382f) + "/40");
        }
    }

    protected final void m3088a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_REMARK_friend_UCCESS")) {
            this.b.dismiss();
            finish();
        }
    }
}
