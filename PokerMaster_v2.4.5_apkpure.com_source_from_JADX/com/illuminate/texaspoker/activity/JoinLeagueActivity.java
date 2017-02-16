package com.illuminate.texaspoker.activity;

import a.does.not.Exists2;
import android.content.DialogInterface;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.EditText;
import com.ali.fixHelper;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.view.LoadingDialog;
import com.texaspoker.moment.TexasPokerHttpLeague.LeagueInfo;
import java.util.List;

public class JoinLeagueActivity extends BaseToolBarActivity {
    private static String f4586d;
    private long f4587e;
    private boolean f4588f;
    private LeagueInfo f4589g;
    private Menu f4590h;
    private EditText f4591i;

    /* renamed from: com.illuminate.texaspoker.activity.JoinLeagueActivity.1 */
    class C06541 implements OnClickListener {
        final /* synthetic */ JoinLeagueActivity f4578a;

        C06541(JoinLeagueActivity joinLeagueActivity) {
            this.f4578a = joinLeagueActivity;
        }

        public final void onClick(View view) {
            this.f4578a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.JoinLeagueActivity.2 */
    class C06552 implements OnClickListener {
        final /* synthetic */ JoinLeagueActivity f4579a;

        C06552(JoinLeagueActivity joinLeagueActivity) {
            this.f4579a = joinLeagueActivity;
        }

        public final void onClick(View view) {
            this.f4579a.m2734b();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.JoinLeagueActivity.3 */
    class C06563 implements OnGlobalLayoutListener {
        final /* synthetic */ JoinLeagueActivity f4580a;

        C06563(JoinLeagueActivity joinLeagueActivity) {
            this.f4580a = joinLeagueActivity;
        }

        public final void onGlobalLayout() {
            this.f4580a.m2735c();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.JoinLeagueActivity.4 */
    class C06574 implements TextWatcher {
        final /* synthetic */ JoinLeagueActivity f4581a;

        C06574(JoinLeagueActivity joinLeagueActivity) {
            this.f4581a = joinLeagueActivity;
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            if (this.f4581a.f4590h == null) {
                return;
            }
            if (!this.f4581a.f4588f || StringUtils.m4462a(editable.toString())) {
                this.f4581a.f4590h.getItem(0).setEnabled(false);
            } else {
                this.f4581a.f4590h.getItem(0).setEnabled(true);
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.JoinLeagueActivity.5 */
    class C06585 implements DialogInterface.OnClickListener {
        final /* synthetic */ JoinLeagueActivity f4582a;

        C06585(JoinLeagueActivity joinLeagueActivity) {
            this.f4582a = joinLeagueActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.JoinLeagueActivity.6 */
    class C06596 implements DialogInterface.OnClickListener {
        final /* synthetic */ JoinLeagueActivity f4583a;

        C06596(JoinLeagueActivity joinLeagueActivity) {
            this.f4583a = joinLeagueActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f4583a.b = new LoadingDialog(this.f4583a);
            this.f4583a.b.show();
            NetworkUtil.m4073a();
            NetworkUtil.m4158d(this.f4583a.f4587e, this.f4583a.f4589g.getStLeagueBaseInfo().getLLeagueID());
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.JoinLeagueActivity.7 */
    class C06607 implements DialogInterface.OnClickListener {
        final /* synthetic */ JoinLeagueActivity f4584a;

        C06607(JoinLeagueActivity joinLeagueActivity) {
            this.f4584a = joinLeagueActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.JoinLeagueActivity.8 */
    class C06618 implements DialogInterface.OnClickListener {
        final /* synthetic */ JoinLeagueActivity f4585a;

        C06618(JoinLeagueActivity joinLeagueActivity) {
            this.f4585a = joinLeagueActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    static {
        fixHelper.fixfunc(new int[]{1196, 1197, 1198, 1199, 1200, 1201, 1202});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    private native void m3168a();

    protected final native void m3172a(String str, List<Object> list);

    protected native void onCreate(Bundle bundle);

    public native boolean onCreateOptionsMenu(Menu menu);

    public native boolean onOptionsItemSelected(MenuItem menuItem);

    protected native void onResume();

    static void __clinit__() {
        f4586d = "CreateLeagueActivity";
    }
}
