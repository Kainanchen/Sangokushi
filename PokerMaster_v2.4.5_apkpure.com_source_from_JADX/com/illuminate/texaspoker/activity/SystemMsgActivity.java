package com.illuminate.texaspoker.activity;

import a.does.not.Exists2;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.ali.fixHelper;
import com.illuminate.texaspoker.dao.MessageMsgDao.Properties;
import com.illuminate.texaspoker.p055a.as;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.MessageMsg;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.view.refreshlayout.RefreshDefaultHandler;
import com.illuminate.texaspoker.view.refreshlayout.RefreshDefaultLayout;
import com.illuminate.texaspoker.view.refreshlayout.RefreshHandler;
import com.illuminate.texaspoker.view.refreshlayout.RefreshListView;
import com.illuminate.texaspoker.view.refreshlayout.RefreshListView.C0372a;
import com.sina.weibo.sdk.constant.WBPageConstants.ParamKey;
import com.texaspoker.moment.TexasPokerHttp.SCGetSystemMsgsRsp;
import com.texaspoker.moment.TexasPokerHttp.SystemMsgBaseInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.a.a.d.g;
import org.a.a.d.i;
import org.a.a.f;

public class SystemMsgActivity extends BaseToolBarActivity {
    private static String f5276d;
    private int f5277e;
    private List<Object> f5278f;
    private as f5279g;
    private RefreshListView f5280h;
    private RefreshDefaultLayout f5281i;

    /* renamed from: com.illuminate.texaspoker.activity.SystemMsgActivity.1 */
    class C08731 implements OnClickListener {
        final /* synthetic */ SystemMsgActivity f5265a;

        C08731(SystemMsgActivity systemMsgActivity) {
            this.f5265a = systemMsgActivity;
        }

        public final void onClick(View view) {
            this.f5265a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SystemMsgActivity.2 */
    class C08762 implements RefreshHandler {
        final /* synthetic */ SystemMsgActivity f5268a;

        /* renamed from: com.illuminate.texaspoker.activity.SystemMsgActivity.2.1 */
        class C08741 implements Runnable {
            final /* synthetic */ C08762 f5266a;

            C08741(C08762 c08762) {
                this.f5266a = c08762;
            }

            public final void run() {
                SystemMsgActivity.m3458a();
            }
        }

        /* renamed from: com.illuminate.texaspoker.activity.SystemMsgActivity.2.2 */
        class C08752 implements Runnable {
            final /* synthetic */ C08762 f5267a;

            C08752(C08762 c08762) {
                this.f5267a = c08762;
            }

            public final void run() {
                if (this.f5267a.f5268a.f5281i.m4589a()) {
                    this.f5267a.f5268a.f5281i.m4590b();
                }
            }
        }

        C08762(SystemMsgActivity systemMsgActivity) {
            this.f5268a = systemMsgActivity;
        }

        public final void m3454a() {
            new Handler().post(new C08741(this));
            new Handler().postDelayed(new C08752(this), 20000);
        }

        public final boolean m3455a(View view) {
            return RefreshDefaultHandler.m4596b(view);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SystemMsgActivity.3 */
    class C08793 implements C0372a {
        final /* synthetic */ SystemMsgActivity f5271a;

        /* renamed from: com.illuminate.texaspoker.activity.SystemMsgActivity.3.1 */
        class C08771 implements Runnable {
            final /* synthetic */ C08793 f5269a;

            C08771(C08793 c08793) {
                this.f5269a = c08793;
            }

            public final void run() {
                SystemMsgActivity.m3460b(this.f5269a.f5271a);
            }
        }

        /* renamed from: com.illuminate.texaspoker.activity.SystemMsgActivity.3.2 */
        class C08782 implements Runnable {
            final /* synthetic */ C08793 f5270a;

            C08782(C08793 c08793) {
                this.f5270a = c08793;
            }

            public final void run() {
                if (this.f5270a.f5271a.f5280h.f7135a) {
                    this.f5270a.f5271a.f5280h.m4595a();
                }
            }
        }

        C08793(SystemMsgActivity systemMsgActivity) {
            this.f5271a = systemMsgActivity;
        }

        public final void m3456a() {
            new Handler().post(new C08771(this));
            new Handler().postDelayed(new C08782(this), 20000);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SystemMsgActivity.4 */
    class C08804 implements OnItemClickListener {
        final /* synthetic */ SystemMsgActivity f5272a;

        C08804(SystemMsgActivity systemMsgActivity) {
            this.f5272a = systemMsgActivity;
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int intValue;
            String str;
            int intValue2;
            long j2;
            Object obj = this.f5272a.f5278f.get(i);
            long longValue;
            String str2;
            long j3;
            if (obj instanceof MessageMsg) {
                MessageMsg messageMsg = (MessageMsg) obj;
                longValue = messageMsg.f5945f.longValue();
                str2 = messageMsg.f5950k;
                intValue = messageMsg.f5943d.intValue();
                j3 = longValue;
                str = str2;
                intValue2 = messageMsg.f5944e.intValue();
                j2 = j3;
            } else {
                SystemMsgBaseInfo systemMsgBaseInfo = (SystemMsgBaseInfo) obj;
                longValue = systemMsgBaseInfo.getLSystemMsgID();
                str2 = systemMsgBaseInfo.getSSystemMsgUrl();
                intValue = systemMsgBaseInfo.getESystemMessageContentType().getNumber();
                j3 = longValue;
                str = str2;
                intValue2 = systemMsgBaseInfo.getESystemMessageType().getNumber();
                j2 = j3;
            }
            if (intValue == 1) {
                Intent intent = new Intent(this.f5272a, WebActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString(ParamKey.URL, str);
                if (intValue2 == 1) {
                    bundle.putInt("titleId", 2131165936);
                } else if (intValue2 == 2) {
                    bundle.putInt("titleId", 2131165931);
                }
                intent.putExtras(bundle);
                this.f5272a.startActivity(intent);
            } else if (intValue == 2) {
                Intent intent2 = new Intent(this.f5272a, SystemMsgBenefitActivity.class);
                intent2.putExtra("systemMsgId", j2);
                this.f5272a.startActivity(intent2);
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SystemMsgActivity.5 */
    class C08815 implements Runnable {
        final /* synthetic */ SystemMsgActivity f5273a;

        C08815(SystemMsgActivity systemMsgActivity) {
            this.f5273a = systemMsgActivity;
        }

        public final void run() {
            this.f5273a.m3463d();
            this.f5273a.f5281i.m4590b();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SystemMsgActivity.6 */
    class C08826 implements Runnable {
        final /* synthetic */ SCGetSystemMsgsRsp f5274a;
        final /* synthetic */ SystemMsgActivity f5275b;

        static {
            fixHelper.fixfunc(new int[]{3444, 3445});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C08826(SystemMsgActivity systemMsgActivity, SCGetSystemMsgsRsp sCGetSystemMsgsRsp);

        public final native void run();
    }

    static {
        f5276d = "SystemMsgActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968671);
        this.f5278f = new ArrayList();
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C08731(this));
        this.f5280h = (RefreshListView) findViewById(2131558874);
        this.f5279g = new as(this, this.f5278f);
        this.f5280h.setAdapter(this.f5279g);
        this.f5281i = (RefreshDefaultLayout) findViewById(2131558544);
        this.f5281i.setPtrHandler(new C08762(this));
        this.f5280h.setOnLoadMoreListener(new C08793(this));
        this.f5280h.setOnItemClickListener(new C08804(this));
        m3463d();
        NetworkUtil.m4073a();
        NetworkUtil.m4145c(0);
    }

    protected void onResume() {
        super.onResume();
    }

    protected void onStop() {
        super.onStop();
        if (!DBManager.m3631a().m3632b()) {
            DBManager.m3631a().f5574n.m3687a();
        }
    }

    private void m3463d() {
        if (!DBManager.m3631a().m3632b()) {
            this.f5278f.clear();
            DBManager.m3631a().f5574n.m3687a();
            g a = g.a(DBManager.m3631a().f5574n.f5603a.f6439N);
            a.a(Properties.f6357f.e(Integer.valueOf(0)), new i[0]);
            a.b(new f[]{Properties.f6357f});
            a.a(20);
            Collection b = a.a().b();
            this.f5277e = b.size();
            this.f5278f.addAll(b);
            this.f5279g.notifyDataSetChanged();
        }
    }

    protected final void m3465a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_REFRESH_SYSTEM_MESSAGE")) {
            new Handler().postDelayed(new C08815(this), 500);
        } else if (str.equalsIgnoreCase("NOTIFY_LOAD_SYSTEM_MESSAGE")) {
            new Handler().postDelayed(new C08826(this, (SCGetSystemMsgsRsp) list.get(0)), 500);
        }
    }

    static /* synthetic */ void m3458a() {
        NetworkUtil.m4073a();
        NetworkUtil.m4145c(0);
    }

    static /* synthetic */ void m3460b(SystemMsgActivity systemMsgActivity) {
        NetworkUtil.m4073a();
        NetworkUtil.m4145c(systemMsgActivity.f5277e);
    }

    static /* synthetic */ void m3459a(SystemMsgActivity systemMsgActivity, SCGetSystemMsgsRsp sCGetSystemMsgsRsp) {
        systemMsgActivity.f5277e += sCGetSystemMsgsRsp.getVSystemMsgBaseInfosList().size();
        systemMsgActivity.f5278f.addAll(sCGetSystemMsgsRsp.getVSystemMsgBaseInfosList());
        systemMsgActivity.f5279g.notifyDataSetChanged();
        systemMsgActivity.f5280h.m4595a();
    }
}
