package com.illuminate.texaspoker.activity;

import a.does.not.Exists2;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.ali.fixHelper;
import com.illuminate.texaspoker.p055a.aj;
import com.illuminate.texaspoker.p058c.PokerHistory;
import java.util.List;

public class PokerHistoryShareActivity extends BaseToolBarActivity {
    private static String f4878d;
    private List<PokerHistory> f4879e;
    private aj f4880f;
    private ListView f4881g;
    private TextView f4882h;

    /* renamed from: com.illuminate.texaspoker.activity.PokerHistoryShareActivity.1 */
    class C07551 implements OnClickListener {
        final /* synthetic */ PokerHistoryShareActivity f4873a;

        C07551(PokerHistoryShareActivity pokerHistoryShareActivity) {
            this.f4873a = pokerHistoryShareActivity;
        }

        public final void onClick(View view) {
            this.f4873a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.PokerHistoryShareActivity.2 */
    class C07562 implements OnItemClickListener {
        final /* synthetic */ PokerHistoryShareActivity f4874a;

        C07562(PokerHistoryShareActivity pokerHistoryShareActivity) {
            this.f4874a = pokerHistoryShareActivity;
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            new Builder(this.f4874a).setTitle(2131165514).setMessage(2131165517).setPositiveButton(2131165438, new C07584(this.f4874a, (PokerHistory) this.f4874a.f4879e.get(i))).setNegativeButton(2131165432, new C07573(this.f4874a)).show();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.PokerHistoryShareActivity.3 */
    class C07573 implements DialogInterface.OnClickListener {
        final /* synthetic */ PokerHistoryShareActivity f4875a;

        C07573(PokerHistoryShareActivity pokerHistoryShareActivity) {
            this.f4875a = pokerHistoryShareActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.PokerHistoryShareActivity.4 */
    class C07584 implements DialogInterface.OnClickListener {
        final /* synthetic */ PokerHistory f4876a;
        final /* synthetic */ PokerHistoryShareActivity f4877b;

        C07584(PokerHistoryShareActivity pokerHistoryShareActivity, PokerHistory pokerHistory) {
            this.f4877b = pokerHistoryShareActivity;
            this.f4876a = pokerHistory;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putLong("lSaveUuid", this.f4876a.f5970p.longValue());
            bundle.putLong("lRoomId", this.f4876a.f5968n.longValue());
            bundle.putLong("lHandId", this.f4876a.f5967m.longValue());
            intent.putExtras(bundle);
            this.f4877b.setResult(ChatRoomActivity.f3782i, intent);
            this.f4877b.finish();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{1228, 1229, 1230, 1231, 1232, 1233});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    private native void m3284a();

    protected final native void m3286a(String str, List<Object> list);

    protected native void onCreate(Bundle bundle);

    protected native void onResume();

    protected native void onStop();

    static void __clinit__() {
        f4878d = "PokerHistoryShareActivity";
    }
}
