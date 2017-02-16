package com.illuminate.texaspoker.activity;

import a.does.not.Exists2;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import com.ali.fixHelper;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.GraphRequest.GraphRequest;
import com.facebook.p036h.CallbackManagerImpl;
import com.facebook.p037i.LoginManager;
import com.facebook.p037i.LoginResult;
import com.illuminate.texaspoker.p055a.FacebookResultListAdapter;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.FriendshipChain;
import com.illuminate.texaspoker.view.LoadingDialog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;

public class FacebookResultActivity extends BaseToolBarActivity {
    private static String f4390d;
    private CallbackManager f4391e;
    private List<FriendshipChain> f4392f;
    private LoadingDialog f4393g;
    private FacebookResultListAdapter f4394h;

    /* renamed from: com.illuminate.texaspoker.activity.FacebookResultActivity.1 */
    class C05951 implements OnClickListener {
        final /* synthetic */ FacebookResultActivity f4386a;

        C05951(FacebookResultActivity facebookResultActivity) {
            this.f4386a = facebookResultActivity;
        }

        public final void onClick(View view) {
            this.f4386a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.FacebookResultActivity.2 */
    class C05972 implements FacebookCallback<LoginResult> {
        final /* synthetic */ FacebookResultActivity f4388a;

        /* renamed from: com.illuminate.texaspoker.activity.FacebookResultActivity.2.1 */
        class C05961 implements DialogInterface.OnClickListener {
            final /* synthetic */ C05972 f4387a;

            C05961(C05972 c05972) {
                this.f4387a = c05972;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        static {
            fixHelper.fixfunc(new int[]{239, 240, 241});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C05972(FacebookResultActivity facebookResultActivity);

        public final native /* synthetic */ void m3089a();

        public final native void m3090a(FacebookException facebookException);
    }

    /* renamed from: com.illuminate.texaspoker.activity.FacebookResultActivity.3 */
    class C05983 implements GraphRequest {
        final /* synthetic */ FacebookResultActivity f4389a;

        static {
            fixHelper.fixfunc(new int[]{406, 407});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C05983(FacebookResultActivity facebookResultActivity);

        public final native void m3091a(JSONArray jSONArray);
    }

    static {
        f4390d = "FacebookResultActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968633);
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        if (toolbar != null) {
            toolbar.setTitleTextAppearance(this, 2131296567);
            toolbar.setNavigationIcon(2130837591);
            toolbar.setNavigationOnClickListener(new C05951(this));
        }
        this.f4391e = new CallbackManagerImpl();
        LoginManager.m1842a().m1849a(this.f4391e, new C05972(this));
        this.f4392f = new ArrayList();
        ListView listView = (ListView) findViewById(2131558721);
        this.f4394h = new FacebookResultListAdapter(this, this.f4392f);
        if (listView != null) {
            listView.setAdapter(this.f4394h);
        }
        m3097e();
        if (AccessToken.m883a() != null) {
            this.f4393g = new LoadingDialog(this);
            this.f4393g.show();
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f4391e.m1446a(i, i2, intent);
    }

    protected void onResume() {
        super.onResume();
    }

    private void m3096d() {
        if (!DBManager.m3631a().m3632b()) {
            this.f4392f.clear();
            this.f4392f.addAll(DBManager.m3631a().f5562b.m3651a(DBManager.f5539B));
            this.f4394h.notifyDataSetChanged();
        }
    }

    private void m3097e() {
        AccessToken a = AccessToken.m883a();
        if (a != null) {
            com.facebook.GraphRequest a2 = com.facebook.GraphRequest.m2614a(a, new C05983(this));
            Bundle bundle = new Bundle();
            bundle.putString("fields", "picture,name,id");
            bundle.putString("limit", "100");
            a2.f2713d = bundle;
            a2.m2644b();
            return;
        }
        LoginManager.m1842a().m1848a((Activity) this, Arrays.asList(new String[]{"public_profile", NotificationCompatApi24.CATEGORY_EMAIL, "user_friends"}));
    }

    protected final void m3098a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("UPLOAD_FACBOOK_FRIEND_RELATION_SUCCESS")) {
            if (this.f4393g != null && this.f4393g.isShowing()) {
                this.f4393g.dismiss();
            }
            m3096d();
        } else if (str.equalsIgnoreCase("UPLOAD_FRIEND_RELATION_FAULT")) {
            m2732a(2130903246, 2131165666, 1);
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_NEW_FRIEND")) {
            m3096d();
        }
    }
}
