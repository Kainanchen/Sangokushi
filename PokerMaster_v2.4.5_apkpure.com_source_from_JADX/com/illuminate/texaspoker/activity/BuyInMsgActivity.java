package com.illuminate.texaspoker.activity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnGroupClickListener;
import com.illuminate.texaspoker.dao.BuyInControlMsgDao;
import com.illuminate.texaspoker.dao.BuyInControlMsgDao.Properties;
import com.illuminate.texaspoker.p055a.BuyInMsgExpandableListAdapter;
import com.illuminate.texaspoker.p057b.BuyInControlMsgDBManager;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.BuyInControlMsg;
import com.illuminate.texaspoker.p058c.GameRoom;
import com.illuminate.texaspoker.p059d.BuyinMsgGameInfo;
import com.illuminate.texaspoker.utils.NetworkUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.a.a.d.g;
import org.a.a.d.h;
import org.a.a.d.i;
import org.a.a.d.i.c;
import org.a.a.f;

public class BuyInMsgActivity extends BaseToolBarActivity {
    private static String f3733d;
    private List<BuyinMsgGameInfo> f3734e;
    private BuyInMsgExpandableListAdapter f3735f;
    private ExpandableListView f3736g;

    /* renamed from: com.illuminate.texaspoker.activity.BuyInMsgActivity.1 */
    class C03881 implements OnClickListener {
        final /* synthetic */ BuyInMsgActivity f3729a;

        C03881(BuyInMsgActivity buyInMsgActivity) {
            this.f3729a = buyInMsgActivity;
        }

        public final void onClick(View view) {
            this.f3729a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.BuyInMsgActivity.2 */
    class C03892 implements OnGroupClickListener {
        final /* synthetic */ BuyInMsgActivity f3730a;

        C03892(BuyInMsgActivity buyInMsgActivity) {
            this.f3730a = buyInMsgActivity;
        }

        public final boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
            return true;
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.BuyInMsgActivity.3 */
    class C03903 implements DialogInterface.OnClickListener {
        final /* synthetic */ BuyInMsgActivity f3731a;

        C03903(BuyInMsgActivity buyInMsgActivity) {
            this.f3731a = buyInMsgActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.BuyInMsgActivity.4 */
    class C03914 implements DialogInterface.OnClickListener {
        final /* synthetic */ BuyInMsgActivity f3732a;

        C03914(BuyInMsgActivity buyInMsgActivity) {
            this.f3732a = buyInMsgActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    static {
        f3733d = "BuyInMsgActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968610);
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C03881(this));
        this.f3734e = new ArrayList();
        this.f3736g = (ExpandableListView) findViewById(2131558560);
        this.f3735f = new BuyInMsgExpandableListAdapter(this, this.f3734e);
        this.f3736g.setAdapter(this.f3735f);
        this.f3736g.setOnGroupClickListener(new C03892(this));
    }

    protected void onStop() {
        super.onStop();
        if (!DBManager.m3631a().m3632b()) {
            BuyInControlMsgDBManager buyInControlMsgDBManager = DBManager.m3631a().f5579s;
            BuyInControlMsgDao buyInControlMsgDao = buyInControlMsgDBManager.f5520b.f6468y;
            buyInControlMsgDBManager.f5519a.a();
            try {
                g a = g.a(buyInControlMsgDao);
                a.a(Properties.f6106b.e(Integer.valueOf(0)), new i[0]);
                a.a(Properties.f6110f.a(Boolean.valueOf(false)), new i[0]);
                for (BuyInControlMsg buyInControlMsg : a.a().b()) {
                    buyInControlMsg.f5673f = Boolean.valueOf(true);
                    buyInControlMsgDao.d(buyInControlMsg);
                }
                a = g.a(buyInControlMsgDBManager.f5520b.f6468y);
                i e = Properties.f6106b.e(Integer.valueOf(0));
                i[] iVarArr = new i[1];
                i a2 = Properties.f6111g.a(Integer.valueOf(2));
                i a3 = Properties.f6111g.a(Integer.valueOf(3));
                h hVar = a.b;
                StringBuilder stringBuilder = new StringBuilder("(");
                List arrayList = new ArrayList();
                hVar.a(stringBuilder, arrayList, a2);
                stringBuilder.append(" OR ");
                hVar.a(stringBuilder, arrayList, a3);
                stringBuilder.append(')');
                iVarArr[0] = new c(stringBuilder.toString(), arrayList.toArray());
                a.a(e, iVarArr);
                for (BuyInControlMsg buyInControlMsg2 : a.a().b()) {
                    buyInControlMsgDao.e(buyInControlMsg2);
                }
                buyInControlMsgDBManager.f5519a.c();
            } catch (Throwable e2) {
                e2.printStackTrace();
                Log.e("MessageMsgDBManager", e2.getMessage(), e2);
            } finally {
                buyInControlMsgDBManager.f5519a.b();
            }
        }
    }

    private void m2795a() {
        if (!DBManager.m3631a().m3632b()) {
            this.f3734e.clear();
            Map hashMap = new HashMap();
            g a = g.a(DBManager.m3631a().f5579s.f5520b.f6468y);
            a.a(new f[]{Properties.f6106b});
            for (BuyInControlMsg buyInControlMsg : a.a().b()) {
                String str;
                String str2;
                GameRoom b = buyInControlMsg.m3720b();
                int intValue = b.f5886j.intValue();
                String str3;
                if (intValue == 2) {
                    str3 = b.f5897u + "_" + buyInControlMsg.f5679l;
                    if (b.f5887k.intValue() == 1 || b.f5887k.intValue() == 5 || b.f5887k.intValue() == 3 || b.f5887k.intValue() == 6) {
                        str = buyInControlMsg.f5680m;
                        str2 = str3;
                    } else {
                        str = b.f5861A;
                        str2 = str3;
                    }
                } else if (b.f5886j.intValue() == 1) {
                    str3 = b.f5897u;
                    str = b.f5861A;
                    str2 = str3;
                } else {
                    str3 = b.f5897u;
                    str = b.m3736a().f5838q;
                    str2 = str3;
                }
                BuyinMsgGameInfo buyinMsgGameInfo = (BuyinMsgGameInfo) hashMap.get(str2);
                if (buyinMsgGameInfo == null) {
                    buyinMsgGameInfo = new BuyinMsgGameInfo();
                    buyinMsgGameInfo.f6018a = str2;
                    buyinMsgGameInfo.f6019b = b.f5864D;
                    buyinMsgGameInfo.f6020c = b.f5887k.intValue();
                    buyinMsgGameInfo.f6021d = str;
                    buyinMsgGameInfo.f6022e = intValue;
                    hashMap.put(str2, buyinMsgGameInfo);
                }
                buyinMsgGameInfo.f6023f.add(buyInControlMsg);
            }
            Collection arrayList = new ArrayList();
            for (Entry value : hashMap.entrySet()) {
                arrayList.add(value.getValue());
            }
            this.f3734e.addAll(arrayList);
            int size = this.f3734e.size();
            for (int i = 0; i < size; i++) {
                this.f3736g.expandGroup(i);
            }
            this.f3735f.notifyDataSetChanged();
        }
    }

    protected void onResume() {
        super.onResume();
        m2795a();
        NetworkUtil.m4073a();
        NetworkUtil.m4174k();
    }

    protected final void m2796a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_GAME_ROOM_ScgetallbuyinControl_SUCCESS")) {
            m2795a();
        } else if (str.equalsIgnoreCase("NOTIFY_GAME_ROOM_ScgetallbuyinControl_FAILED")) {
            new Builder(this).setTitle(2131165514).setMessage(((Integer) list.get(0)).intValue()).setPositiveButton(2131165438, new C03903(this)).show();
        } else if (str.equalsIgnoreCase("NOTIFY_GAME_ROOM_ScbuyinActionRsp_SUCCESS")) {
            this.b.dismiss();
            m2795a();
        } else if (str.equalsIgnoreCase("NOTIFY_GAME_ROOM_ScbuyinActionRsp_FAILED")) {
            this.b.dismiss();
            new Builder(this).setTitle(2131165514).setMessage(((Integer) list.get(0)).intValue()).setPositiveButton(2131165438, new C03914(this)).show();
        } else if (str.equalsIgnoreCase("NOTIFY_GAME_ROOM_ScbuyinControlMsg")) {
            m2795a();
        } else if (str.equalsIgnoreCase("NOTIFY_RECONNECT_SUCCESS")) {
            NetworkUtil.m4073a();
            NetworkUtil.m4174k();
        }
    }
}
