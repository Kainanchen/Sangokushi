package com.illuminate.texaspoker.activity;

import a.does.not.Exists2;
import android.content.DialogInterface;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.InputDeviceCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v7.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import com.ali.fixHelper;
import com.illuminate.texaspoker.p055a.ClubMsgListAdapter;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.ClubMsg;
import com.illuminate.texaspoker.p058c.LeagueMsg;
import java.util.Comparator;
import java.util.List;

public class ClubMessageActivity extends BaseToolBarActivity {
    private static String f4059d;
    private long f4060e;
    private List<Object> f4061f;
    private ClubMsgListAdapter f4062g;
    private ListView f4063h;

    /* renamed from: com.illuminate.texaspoker.activity.ClubMessageActivity.1 */
    class C04681 implements OnClickListener {
        final /* synthetic */ ClubMessageActivity f4053a;

        C04681(ClubMessageActivity clubMessageActivity) {
            this.f4053a = clubMessageActivity;
        }

        public final void onClick(View view) {
            this.f4053a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubMessageActivity.2 */
    class C04692 implements Comparator<Object> {
        final /* synthetic */ ClubMessageActivity f4054a;

        C04692(ClubMessageActivity clubMessageActivity) {
            this.f4054a = clubMessageActivity;
        }

        public final int compare(Object obj, Object obj2) {
            long longValue;
            long longValue2;
            if (obj instanceof ClubMsg) {
                longValue = ((ClubMsg) obj).f5799g.longValue();
            } else {
                longValue = ((LeagueMsg) obj).f5928c.longValue();
            }
            if (obj2 instanceof ClubMsg) {
                longValue2 = ((ClubMsg) obj2).f5799g.longValue();
            } else {
                longValue2 = ((LeagueMsg) obj2).f5928c.longValue();
            }
            if (longValue > longValue2) {
                return -1;
            }
            return 1;
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubMessageActivity.3 */
    class C04703 implements OnItemLongClickListener {
        final /* synthetic */ ClubMessageActivity f4055a;

        C04703(ClubMessageActivity clubMessageActivity) {
            this.f4055a = clubMessageActivity;
        }

        public final boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            new Builder(this.f4055a).setItems(2131492865, new C04714(this.f4055a, i)).show();
            return true;
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubMessageActivity.4 */
    class C04714 implements DialogInterface.OnClickListener {
        final /* synthetic */ int f4056a;
        final /* synthetic */ ClubMessageActivity f4057b;

        C04714(ClubMessageActivity clubMessageActivity, int i) {
            this.f4057b = clubMessageActivity;
            this.f4056a = i;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (i == 0) {
                Object obj = this.f4057b.f4061f.get(this.f4056a);
                if (obj instanceof ClubMsg) {
                    ClubMsg clubMsg = (ClubMsg) obj;
                    DBManager.m3631a().f5575o.m3628b(clubMsg.f5796d.longValue(), clubMsg.f5798f.longValue());
                } else if (obj instanceof LeagueMsg) {
                    LeagueMsg leagueMsg = (LeagueMsg) obj;
                    DBManager.m3631a().f5582v.m3684b(leagueMsg.f5927b.longValue(), leagueMsg.f5933h.longValue(), leagueMsg.f5932g.longValue());
                }
                this.f4057b.m2946a();
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubMessageActivity.5 */
    class C04725 implements DialogInterface.OnClickListener {
        final /* synthetic */ ClubMessageActivity f4058a;

        C04725(ClubMessageActivity clubMessageActivity) {
            this.f4058a = clubMessageActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    static {
        fixHelper.fixfunc(new int[]{253, 254, MotionEventCompat.ACTION_MASK, AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY, InputDeviceCompat.SOURCE_KEYBOARD, 258, 259, 260});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    private native void m2946a();

    private native void m2948a(List<Object> list);

    private native void m2950d();

    protected final native void m2951a(String str, List<Object> list);

    public native void finish();

    protected native void onCreate(Bundle bundle);

    protected native void onResume();

    static void __clinit__() {
        f4059d = "ClubMessageActivity";
    }
}
