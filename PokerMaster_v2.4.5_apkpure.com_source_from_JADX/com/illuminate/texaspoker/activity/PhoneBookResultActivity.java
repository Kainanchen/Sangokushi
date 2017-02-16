package com.illuminate.texaspoker.activity;

import a.does.not.Exists2;
import android.content.DialogInterface;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.ali.fixHelper;
import com.illuminate.texaspoker.p055a.ai;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.FriendshipChain;
import com.illuminate.texaspoker.utils.Utility;
import com.illuminate.texaspoker.view.LoadingDialog;
import java.util.ArrayList;
import java.util.List;

public class PhoneBookResultActivity extends BaseToolBarActivity {
    private static String f4771d;
    private List<FriendshipChain> f4772e;
    private LoadingDialog f4773f;
    private ai f4774g;
    private ListView f4775h;
    private TextView f4776i;

    /* renamed from: com.illuminate.texaspoker.activity.PhoneBookResultActivity.1 */
    class C07201 implements OnClickListener {
        final /* synthetic */ PhoneBookResultActivity f4768a;

        static {
            fixHelper.fixfunc(new int[]{3412, 3413});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C07201(PhoneBookResultActivity phoneBookResultActivity);

        public final native void onClick(View view);
    }

    /* renamed from: com.illuminate.texaspoker.activity.PhoneBookResultActivity.2 */
    class C07212 implements DialogInterface.OnClickListener {
        final /* synthetic */ PhoneBookResultActivity f4769a;

        static {
            fixHelper.fixfunc(new int[]{3425, 3426});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C07212(PhoneBookResultActivity phoneBookResultActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.activity.PhoneBookResultActivity.3 */
    class C07223 implements DialogInterface.OnClickListener {
        final /* synthetic */ PhoneBookResultActivity f4770a;

        static {
            fixHelper.fixfunc(new int[]{3442, 3443});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C07223(PhoneBookResultActivity phoneBookResultActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    static {
        f4771d = "PhoneBookResultActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968656);
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        if (toolbar != null) {
            toolbar.setTitleTextAppearance(this, 2131296567);
            toolbar.setNavigationIcon(2130837591);
            toolbar.setNavigationOnClickListener(new C07201(this));
        }
        this.f4772e = new ArrayList();
        if (ContextCompat.checkSelfPermission(this, "android.permission.READ_CONTACTS") != 0) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.READ_CONTACTS"}, 1);
        } else {
            this.f4773f = new LoadingDialog(this, 60000);
            this.f4773f.show();
            Utility.m4498e();
        }
        this.f4776i = (TextView) findViewById(2131558509);
        this.f4775h = (ListView) findViewById(2131558800);
        this.f4774g = new ai(this, this.f4772e);
        this.f4775h.setAdapter(this.f4774g);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 1) {
            return;
        }
        if (iArr[0] == 0) {
            this.f4773f = new LoadingDialog(this, 60000);
            this.f4773f.show();
            Utility.m4498e();
            return;
        }
        new Builder(this).setTitle(2131165473).setMessage(2131165476).setPositiveButton(2131165472, new C07223(this)).setNegativeButton(2131165432, new C07212(this)).show();
    }

    protected void onResume() {
        super.onResume();
        m3244a();
    }

    private void m3244a() {
        if (!DBManager.m3631a().m3632b()) {
            this.f4772e.clear();
            this.f4772e.addAll(DBManager.m3631a().f5562b.m3651a(DBManager.f5556z));
            this.f4774g.notifyDataSetChanged();
            if (Utility.m4494d()) {
                this.f4775h.setVisibility(0);
                this.f4776i.setVisibility(4);
                return;
            }
            this.f4775h.setVisibility(4);
            this.f4776i.setVisibility(0);
        }
    }

    protected final void m3245a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("UPLOAD_FRIEND_RELATION_SUCCESS")) {
            if (this.f4773f != null && this.f4773f.isShowing()) {
                this.f4773f.dismiss();
            }
            m3244a();
        } else if (str.equalsIgnoreCase("UPLOAD_FRIEND_RELATION_FAULT")) {
            m2732a(2130903246, 2131165666, 1);
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_NEW_FRIEND")) {
            m3244a();
        }
    }
}
