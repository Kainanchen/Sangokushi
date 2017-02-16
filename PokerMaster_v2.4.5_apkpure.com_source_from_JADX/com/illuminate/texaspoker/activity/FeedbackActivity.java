package com.illuminate.texaspoker.activity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.EditText;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.RuntimeData;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.view.LoadingDialog;
import java.util.List;

public class FeedbackActivity extends BaseToolBarActivity {
    private static String f4401d;
    private EditText f4402e;

    /* renamed from: com.illuminate.texaspoker.activity.FeedbackActivity.1 */
    class C05991 implements OnClickListener {
        final /* synthetic */ FeedbackActivity f4395a;

        C05991(FeedbackActivity feedbackActivity) {
            this.f4395a = feedbackActivity;
        }

        public final void onClick(View view) {
            this.f4395a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.FeedbackActivity.2 */
    class C06002 implements OnClickListener {
        final /* synthetic */ FeedbackActivity f4396a;

        C06002(FeedbackActivity feedbackActivity) {
            this.f4396a = feedbackActivity;
        }

        public final void onClick(View view) {
            this.f4396a.m2734b();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.FeedbackActivity.3 */
    class C06013 implements OnGlobalLayoutListener {
        final /* synthetic */ FeedbackActivity f4397a;

        C06013(FeedbackActivity feedbackActivity) {
            this.f4397a = feedbackActivity;
        }

        public final void onGlobalLayout() {
            this.f4397a.m2735c();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.FeedbackActivity.4 */
    class C06024 implements DialogInterface.OnClickListener {
        final /* synthetic */ FeedbackActivity f4398a;

        C06024(FeedbackActivity feedbackActivity) {
            this.f4398a = feedbackActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.FeedbackActivity.5 */
    class C06035 implements DialogInterface.OnClickListener {
        final /* synthetic */ FeedbackActivity f4399a;

        C06035(FeedbackActivity feedbackActivity) {
            this.f4399a = feedbackActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.FeedbackActivity.6 */
    class C06046 implements DialogInterface.OnClickListener {
        final /* synthetic */ FeedbackActivity f4400a;

        C06046(FeedbackActivity feedbackActivity) {
            this.f4400a = feedbackActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    static {
        f4401d = "FeedbackActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968634);
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C05991(this));
        View findViewById = findViewById(2131558601);
        findViewById.setOnClickListener(new C06002(this));
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new C06013(this));
        this.f4402e = (EditText) findViewById(2131558722);
    }

    protected void onResume() {
        super.onResume();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131689486, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131559439) {
            return super.onOptionsItemSelected(menuItem);
        }
        String trim = this.f4402e.getText().toString().trim();
        int a = StringUtils.m4460a(trim);
        if (StringUtils.m4462a((CharSequence) trim)) {
            new Builder(this).setTitle(2131165514).setMessage(2131165763).setPositiveButton(2131165438, new C06024(this)).show();
        } else if (a > 200) {
            new Builder(this).setTitle(2131165514).setMessage(2131165762).setPositiveButton(2131165438, new C06035(this)).show();
        } else {
            this.b = new LoadingDialog(this);
            this.b.show();
            long currentTimeMillis = System.currentTimeMillis() + RuntimeData.f6671b;
            NetworkUtil.m4073a();
            NetworkUtil.m4113a(trim, currentTimeMillis);
        }
        return true;
    }

    protected final void m3099a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_SEND_FEEDBACK_SUCCESS")) {
            this.b.dismiss();
            finish();
        } else if (str.equalsIgnoreCase("NOTIFY_SEND_FEEDBACK_FAULT")) {
            this.b.dismiss();
            ((Integer) list.get(0)).intValue();
            new Builder(this).setTitle(2131165514).setMessage(2131165761).setPositiveButton(2131165438, new C06046(this)).show();
        }
    }
}
