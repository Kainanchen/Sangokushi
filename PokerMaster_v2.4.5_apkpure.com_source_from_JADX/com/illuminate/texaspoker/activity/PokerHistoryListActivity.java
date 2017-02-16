package com.illuminate.texaspoker.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.illuminate.texaspoker.p055a.aj;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.PokerHistory;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.ShareUtil;
import com.illuminate.texaspoker.view.LoadingDialog;
import com.illuminate.texaspoker.view.ShareSocialDialog;
import java.util.ArrayList;
import java.util.List;

public class PokerHistoryListActivity extends BaseToolBarActivity {
    private static String f4867d;
    private List<PokerHistory> f4868e;
    private LoadingDialog f4869f;
    private aj f4870g;
    private ListView f4871h;
    private TextView f4872i;

    /* renamed from: com.illuminate.texaspoker.activity.PokerHistoryListActivity.10 */
    class AnonymousClass10 implements OnClickListener {
        final /* synthetic */ PokerHistory f4834a;
        final /* synthetic */ boolean f4835b;
        final /* synthetic */ ShareSocialDialog f4836c;
        final /* synthetic */ PokerHistoryListActivity f4837d;

        AnonymousClass10(PokerHistoryListActivity pokerHistoryListActivity, PokerHistory pokerHistory, boolean z, ShareSocialDialog shareSocialDialog) {
            this.f4837d = pokerHistoryListActivity;
            this.f4834a = pokerHistory;
            this.f4835b = z;
            this.f4836c = shareSocialDialog;
        }

        public final void onClick(View view) {
            ShareUtil.m4248a().m4257a(this.f4834a, -2, this.f4835b);
            this.f4836c.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.PokerHistoryListActivity.11 */
    class AnonymousClass11 implements OnClickListener {
        final /* synthetic */ PokerHistory f4838a;
        final /* synthetic */ boolean f4839b;
        final /* synthetic */ ShareSocialDialog f4840c;
        final /* synthetic */ PokerHistoryListActivity f4841d;

        AnonymousClass11(PokerHistoryListActivity pokerHistoryListActivity, PokerHistory pokerHistory, boolean z, ShareSocialDialog shareSocialDialog) {
            this.f4841d = pokerHistoryListActivity;
            this.f4838a = pokerHistory;
            this.f4839b = z;
            this.f4840c = shareSocialDialog;
        }

        public final void onClick(View view) {
            ShareUtil.m4248a().m4257a(this.f4838a, -1, this.f4839b);
            this.f4840c.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.PokerHistoryListActivity.12 */
    class AnonymousClass12 implements OnClickListener {
        final /* synthetic */ PokerHistory f4842a;
        final /* synthetic */ boolean f4843b;
        final /* synthetic */ ShareSocialDialog f4844c;
        final /* synthetic */ PokerHistoryListActivity f4845d;

        AnonymousClass12(PokerHistoryListActivity pokerHistoryListActivity, PokerHistory pokerHistory, boolean z, ShareSocialDialog shareSocialDialog) {
            this.f4845d = pokerHistoryListActivity;
            this.f4842a = pokerHistory;
            this.f4843b = z;
            this.f4844c = shareSocialDialog;
        }

        public final void onClick(View view) {
            ShareUtil.m4248a().m4257a(this.f4842a, -3, this.f4843b);
            this.f4844c.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.PokerHistoryListActivity.1 */
    class C07461 implements OnClickListener {
        final /* synthetic */ PokerHistoryListActivity f4846a;

        C07461(PokerHistoryListActivity pokerHistoryListActivity) {
            this.f4846a = pokerHistoryListActivity;
        }

        public final void onClick(View view) {
            this.f4846a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.PokerHistoryListActivity.2 */
    class C07472 implements OnClickListener {
        final /* synthetic */ PokerHistory f4847a;
        final /* synthetic */ boolean f4848b;
        final /* synthetic */ ShareSocialDialog f4849c;
        final /* synthetic */ PokerHistoryListActivity f4850d;

        C07472(PokerHistoryListActivity pokerHistoryListActivity, PokerHistory pokerHistory, boolean z, ShareSocialDialog shareSocialDialog) {
            this.f4850d = pokerHistoryListActivity;
            this.f4847a = pokerHistory;
            this.f4848b = z;
            this.f4849c = shareSocialDialog;
        }

        public final void onClick(View view) {
            ShareUtil.m4248a().m4257a(this.f4847a, -4, this.f4848b);
            this.f4849c.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.PokerHistoryListActivity.3 */
    class C07483 implements DialogInterface.OnClickListener {
        final /* synthetic */ PokerHistoryListActivity f4851a;

        C07483(PokerHistoryListActivity pokerHistoryListActivity) {
            this.f4851a = pokerHistoryListActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.PokerHistoryListActivity.4 */
    class C07494 implements DialogInterface.OnClickListener {
        final /* synthetic */ PokerHistory f4852a;
        final /* synthetic */ PokerHistoryListActivity f4853b;

        C07494(PokerHistoryListActivity pokerHistoryListActivity, PokerHistory pokerHistory) {
            this.f4853b = pokerHistoryListActivity;
            this.f4852a = pokerHistory;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f4853b.f4869f = new LoadingDialog(this.f4853b);
            this.f4853b.f4869f.show();
            NetworkUtil.m4073a();
            NetworkUtil.m4135b(this.f4852a.f5970p.longValue(), this.f4852a.f5968n.longValue(), this.f4852a.f5967m.longValue());
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.PokerHistoryListActivity.5 */
    class C07505 implements OnItemClickListener {
        final /* synthetic */ PokerHistoryListActivity f4854a;

        C07505(PokerHistoryListActivity pokerHistoryListActivity) {
            this.f4854a = pokerHistoryListActivity;
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            PokerHistoryListActivity.m3277a(this.f4854a, (PokerHistory) this.f4854a.f4868e.get(i));
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.PokerHistoryListActivity.6 */
    class C07516 implements OnItemLongClickListener {
        final /* synthetic */ PokerHistoryListActivity f4855a;

        C07516(PokerHistoryListActivity pokerHistoryListActivity) {
            this.f4855a = pokerHistoryListActivity;
        }

        public final boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            PokerHistory pokerHistory = (PokerHistory) this.f4855a.f4868e.get(i);
            new Builder(this.f4855a).setItems(2131492874, new C07527(this.f4855a, pokerHistory, pokerHistory.f5962h.booleanValue())).show();
            return true;
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.PokerHistoryListActivity.7 */
    class C07527 implements DialogInterface.OnClickListener {
        final /* synthetic */ PokerHistory f4856a;
        final /* synthetic */ boolean f4857b;
        final /* synthetic */ PokerHistoryListActivity f4858c;

        C07527(PokerHistoryListActivity pokerHistoryListActivity, PokerHistory pokerHistory, boolean z) {
            this.f4858c = pokerHistoryListActivity;
            this.f4856a = pokerHistory;
            this.f4857b = z;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (i == 0) {
                PokerHistoryListActivity.m3281b(this.f4858c, this.f4856a, this.f4857b);
            } else {
                new Builder(this.f4858c).setTitle(2131165514).setMessage(2131165819).setPositiveButton(2131165438, new C07494(this.f4858c, this.f4856a)).setNegativeButton(2131165432, new C07483(this.f4858c)).show();
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.PokerHistoryListActivity.8 */
    class C07538 implements OnClickListener {
        final /* synthetic */ PokerHistory f4859a;
        final /* synthetic */ boolean f4860b;
        final /* synthetic */ ShareSocialDialog f4861c;
        final /* synthetic */ PokerHistoryListActivity f4862d;

        C07538(PokerHistoryListActivity pokerHistoryListActivity, PokerHistory pokerHistory, boolean z, ShareSocialDialog shareSocialDialog) {
            this.f4862d = pokerHistoryListActivity;
            this.f4859a = pokerHistory;
            this.f4860b = z;
            this.f4861c = shareSocialDialog;
        }

        public final void onClick(View view) {
            ShareUtil.m4248a().m4257a(this.f4859a, 0, this.f4860b);
            this.f4861c.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.PokerHistoryListActivity.9 */
    class C07549 implements OnClickListener {
        final /* synthetic */ PokerHistory f4863a;
        final /* synthetic */ boolean f4864b;
        final /* synthetic */ ShareSocialDialog f4865c;
        final /* synthetic */ PokerHistoryListActivity f4866d;

        C07549(PokerHistoryListActivity pokerHistoryListActivity, PokerHistory pokerHistory, boolean z, ShareSocialDialog shareSocialDialog) {
            this.f4866d = pokerHistoryListActivity;
            this.f4863a = pokerHistory;
            this.f4864b = z;
            this.f4865c = shareSocialDialog;
        }

        public final void onClick(View view) {
            ShareUtil.m4248a().m4257a(this.f4863a, 1, this.f4864b);
            this.f4865c.dismiss();
        }
    }

    static {
        f4867d = "PokerHistoryListActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968657);
        this.f4868e = new ArrayList();
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C07461(this));
        this.f4871h = (ListView) findViewById(2131558734);
        View inflate = LayoutInflater.from(this).inflate(2130968811, null);
        this.f4871h.addFooterView(inflate, null, false);
        this.f4872i = (TextView) inflate.findViewById(2131559336);
        this.f4870g = new aj(this, this.f4868e);
        this.f4871h.setAdapter(this.f4870g);
        this.f4871h.setOnItemClickListener(new C07505(this));
        this.f4871h.setOnItemLongClickListener(new C07516(this));
    }

    protected void onResume() {
        super.onResume();
        m3276a();
        NetworkUtil.m4073a();
        NetworkUtil.m4186q();
    }

    protected void onStop() {
        super.onStop();
    }

    private void m3276a() {
        if (!DBManager.m3631a().m3632b()) {
            this.f4868e.clear();
            this.f4868e.addAll(DBManager.m3631a().f5578r.m3697b());
            this.f4872i.setText(String.format(getResources().getString(2131165817), new Object[]{Integer.valueOf(r0.size())}));
            this.f4870g.notifyDataSetChanged();
        }
    }

    protected final void m3282a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_GET_FAVORITE_LIST_SUCCESS")) {
            m3276a();
        } else if (str.equalsIgnoreCase("NOTIFY_DEL_FAVORITE_SUCCESS")) {
            this.f4869f.dismiss();
            m3276a();
            m2732a(2130903589, 2131165821, 1);
        } else if (str.equalsIgnoreCase("NOTIFY_DEL_FAVORITE_FAULT")) {
            this.f4869f.dismiss();
            m2732a(2130903246, 2131165820, 1);
        }
    }

    static /* synthetic */ void m3277a(PokerHistoryListActivity pokerHistoryListActivity, PokerHistory pokerHistory) {
        Intent intent = new Intent(pokerHistoryListActivity, PlayPokerHistoryActivity.class);
        intent.putExtra("from", PlayPokerHistoryActivity.f4815f);
        intent.putExtra("pokerHistoryShareUrl", pokerHistory.f5977w);
        intent.putExtra("pokerHistoryUrl", pokerHistory.f5978x);
        intent.putExtra("lSaveUuid", pokerHistory.f5970p);
        intent.putExtra("lRoomId", pokerHistory.f5968n);
        intent.putExtra("lHandId", pokerHistory.f5967m);
        intent.putExtra("isOmaha", pokerHistory.f5962h);
        if (pokerHistory.f5958d == null) {
            intent.putExtra("iPoker1", -1);
        } else {
            intent.putExtra("iPoker1", pokerHistory.f5958d);
        }
        if (pokerHistory.f5959e == null) {
            intent.putExtra("iPoker2", -1);
        } else {
            intent.putExtra("iPoker2", pokerHistory.f5959e);
        }
        if (pokerHistory.f5960f == null) {
            intent.putExtra("iPoker3", -1);
        } else {
            intent.putExtra("iPoker3", pokerHistory.f5960f);
        }
        if (pokerHistory.f5961g == null) {
            intent.putExtra("iPoker4", -1);
        } else {
            intent.putExtra("iPoker4", pokerHistory.f5961g);
        }
        pokerHistoryListActivity.startActivity(intent);
    }

    static /* synthetic */ void m3281b(PokerHistoryListActivity pokerHistoryListActivity, PokerHistory pokerHistory, boolean z) {
        ShareSocialDialog shareSocialDialog = new ShareSocialDialog(pokerHistoryListActivity);
        shareSocialDialog.f7078a = new C07538(pokerHistoryListActivity, pokerHistory, z, shareSocialDialog);
        shareSocialDialog.f7079b = new C07549(pokerHistoryListActivity, pokerHistory, z, shareSocialDialog);
        shareSocialDialog.f7080c = new AnonymousClass10(pokerHistoryListActivity, pokerHistory, z, shareSocialDialog);
        shareSocialDialog.f7081d = new AnonymousClass11(pokerHistoryListActivity, pokerHistory, z, shareSocialDialog);
        shareSocialDialog.f7082e = new AnonymousClass12(pokerHistoryListActivity, pokerHistory, z, shareSocialDialog);
        shareSocialDialog.f7083f = new C07472(pokerHistoryListActivity, pokerHistory, z, shareSocialDialog);
        shareSocialDialog.show();
    }
}
