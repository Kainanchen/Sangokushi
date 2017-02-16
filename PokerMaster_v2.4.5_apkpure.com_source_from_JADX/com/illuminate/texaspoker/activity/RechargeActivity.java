package com.illuminate.texaspoker.activity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.illuminate.texaspoker.application.BaseApplication;
import com.illuminate.texaspoker.p055a.am;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.PayUtil;
import com.illuminate.texaspoker.utils.RuntimeData;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.view.LoadingDialog;
import com.tencent.mm.sdk.modelbase.BaseReq;
import com.tencent.mm.sdk.modelpay.PayReq;
import com.texaspoker.moment.TexasPokerHttpTransaction.AndroidOrderInfo;
import com.texaspoker.moment.TexasPokerHttpTransaction.CoinStoreItemInfo;
import com.texaspoker.moment.TexasPokerHttpTransaction.WXOrderInfo;
import java.util.List;

public class RechargeActivity extends BaseToolBarActivity {
    private static String f5007d;
    private LoadingDialog f5008e;
    private am f5009f;
    private ListView f5010g;
    private boolean f5011h;

    /* renamed from: com.illuminate.texaspoker.activity.RechargeActivity.1 */
    class C07701 implements OnClickListener {
        final /* synthetic */ RechargeActivity f5003a;

        C07701(RechargeActivity rechargeActivity) {
            this.f5003a = rechargeActivity;
        }

        public final void onClick(View view) {
            this.f5003a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.RechargeActivity.2 */
    class C07712 implements OnItemClickListener {
        final /* synthetic */ RechargeActivity f5004a;

        C07712(RechargeActivity rechargeActivity) {
            this.f5004a = rechargeActivity;
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            this.f5004a.f5008e = new LoadingDialog(this.f5004a);
            this.f5004a.f5008e.show();
            CoinStoreItemInfo coinStoreItemInfo = (CoinStoreItemInfo) RuntimeData.f6680k.get(i);
            NetworkUtil.m4073a();
            NetworkUtil.m4156d(coinStoreItemInfo.getICoinStoreItemID());
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.RechargeActivity.3 */
    class C07723 implements DialogInterface.OnClickListener {
        final /* synthetic */ RechargeActivity f5005a;

        C07723(RechargeActivity rechargeActivity) {
            this.f5005a = rechargeActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.RechargeActivity.4 */
    class C07734 implements DialogInterface.OnClickListener {
        final /* synthetic */ RechargeActivity f5006a;

        C07734(RechargeActivity rechargeActivity) {
            this.f5006a = rechargeActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    public RechargeActivity() {
        this.f5011h = false;
    }

    static {
        f5007d = "RechargeActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968659);
        Bundle extras = getIntent().getExtras();
        if (!(extras == null || extras.get("fromGame") == null)) {
            this.f5011h = extras.getBoolean("fromGame", false);
        }
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        if (this.f5011h) {
            toolbar.setNavigationIcon(2130837653);
        } else {
            toolbar.setNavigationIcon(2130837591);
        }
        toolbar.setNavigationOnClickListener(new C07701(this));
        this.f5010g = (ListView) findViewById(2131558803);
        this.f5009f = new am(this);
        this.f5010g.setAdapter(this.f5009f);
        this.f5010g.setOnItemClickListener(new C07712(this));
    }

    public void finish() {
        super.finish();
        if (this.f5011h) {
            overridePendingTransition(0, 2131034133);
        }
    }

    protected void onResume() {
        super.onResume();
        m3351a();
        NetworkUtil.m4073a();
        NetworkUtil.m4137b(SharedPreferencesManager.m4308b(), false);
        NetworkUtil.m4073a();
        NetworkUtil.m4190s();
    }

    private void m3351a() {
        if (!DBManager.m3631a().m3632b()) {
            this.f5009f.notifyDataSetChanged();
        }
    }

    protected void onStop() {
        super.onStop();
    }

    protected final void m3352a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_PRE_BUY_SUCCESS")) {
            AndroidOrderInfo androidOrderInfo = (AndroidOrderInfo) list.get(0);
            androidOrderInfo.getLOrderID();
            androidOrderInfo.getICoinStoreItemID();
            androidOrderInfo.getLOrderTime();
            androidOrderInfo.getEOrderType();
            androidOrderInfo.getEPaymentType();
            PayUtil a = PayUtil.m4246a();
            WXOrderInfo stWXOrderInfo = androidOrderInfo.getStWXOrderInfo();
            if (a.f6669b.isWXAppInstalled()) {
                BaseReq payReq = new PayReq();
                payReq.appId = "wxc373d29b97145fd3";
                payReq.partnerId = "1284828701";
                payReq.prepayId = stWXOrderInfo.getLPrepayId();
                payReq.packageValue = "Sign=WXPay";
                payReq.nonceStr = stWXOrderInfo.getSNonceStr();
                payReq.timeStamp = String.valueOf(stWXOrderInfo.getLTimeStamp());
                payReq.sign = stWXOrderInfo.getSSign();
                a.f6669b.sendReq(payReq);
            } else {
                if (a.f6668a == null) {
                    a.f6668a = (RelativeLayout) LayoutInflater.from(BaseApplication.m3548a()).inflate(2130968833, null);
                }
                ((ImageView) a.f6668a.findViewById(2131559415)).setImageResource(2130903246);
                ((TextView) a.f6668a.findViewById(2131559416)).setText(2131165468);
                Toast toast = new Toast(BaseApplication.m3548a());
                toast.setGravity(17, 0, 0);
                toast.setDuration(0);
                toast.setView(a.f6668a);
                toast.show();
            }
            this.f5008e.dismiss();
        } else if (str.equalsIgnoreCase("NOTIFY_PRE_BUY__FAULT")) {
            int intValue = ((Integer) list.get(0)).intValue();
            this.f5008e.dismiss();
            new Builder(this).setTitle(2131165514).setMessage(intValue).setPositiveButton(2131165438, new C07723(this)).show();
        } else if (str.equalsIgnoreCase("NOTIFY_GET_COIN_LIST_SUCCESS")) {
            m3351a();
        } else if (str.equalsIgnoreCase("NOTIFY_GET_COIN_LIST_FAULT")) {
            new Builder(this).setTitle(2131165514).setMessage(((Integer) list.get(0)).intValue()).setPositiveButton(2131165438, new C07734(this)).show();
        }
    }
}
