package com.illuminate.texaspoker.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.Bill;
import com.illuminate.texaspoker.view.RecordRingProgress;
import com.illuminate.texaspoker.view.RecordWinProgress;
import com.texaspoker.moment.TexasPokerHttpBill.BillInfoNet;
import com.texaspoker.moment.TexasPokerHttpBill.GameUserStatisticsInfoNet;
import java.util.List;

public class BillRecordActivity extends BaseToolBarActivity {
    private static String f3634d;
    private String f3635e;
    private long f3636f;
    private String f3637g;
    private String f3638h;
    private double f3639i;
    private double f3640j;
    private double f3641k;
    private double f3642l;
    private double f3643m;
    private double f3644n;
    private double f3645o;
    private double f3646p;
    private double f3647q;
    private double f3648r;

    /* renamed from: com.illuminate.texaspoker.activity.BillRecordActivity.1 */
    class C03631 implements OnClickListener {
        final /* synthetic */ BillRecordActivity f3633a;

        C03631(BillRecordActivity billRecordActivity) {
            this.f3633a = billRecordActivity;
        }

        public final void onClick(View view) {
            this.f3633a.finish();
        }
    }

    static {
        f3634d = "BillRecordActivity";
    }

    protected void onCreate(Bundle bundle) {
        long longValue;
        long longValue2;
        long longValue3;
        long longValue4;
        long longValue5;
        long longValue6;
        long longValue7;
        long longValue8;
        long longValue9;
        long longValue10;
        super.onCreate(bundle);
        setContentView(2130968607);
        Bundle extras = getIntent().getExtras();
        BillInfoNet billInfoNet = (BillInfoNet) extras.getSerializable("billInfoNet");
        if (billInfoNet == null) {
            Bill a = DBManager.m3631a().f5570j.m3554a(extras.getLong("billId"), false);
            this.f3635e = a.f5629M;
            this.f3636f = a.f5659r.longValue();
            longValue = a.f5658q.longValue();
            longValue2 = a.f5657p.longValue();
            longValue3 = a.f5617A.longValue();
            longValue4 = a.f5619C.longValue();
            longValue5 = a.f5618B.longValue();
            longValue6 = a.f5620D.longValue();
            longValue7 = a.f5623G.longValue();
            longValue8 = a.f5621E.longValue();
            longValue9 = a.f5624H.longValue();
            longValue10 = a.f5622F.longValue();
        } else {
            this.f3635e = billInfoNet.getStNormalBillInfoNet().getSPlayName();
            GameUserStatisticsInfoNet stGameUserStatisticsInfoNet = billInfoNet.getStNormalBillInfoNet().getStGameUserStatisticsInfoNet();
            this.f3636f = stGameUserStatisticsInfoNet.getLTotalHand();
            longValue = stGameUserStatisticsInfoNet.getLTotalJoinHand();
            longValue2 = stGameUserStatisticsInfoNet.getLTotalWin();
            longValue3 = stGameUserStatisticsInfoNet.getLCountJoinFlop();
            longValue4 = stGameUserStatisticsInfoNet.getLCountJoinTurn();
            longValue5 = stGameUserStatisticsInfoNet.getLCountJoinRiver();
            longValue6 = stGameUserStatisticsInfoNet.getLCountShowdownFlopWin();
            longValue7 = stGameUserStatisticsInfoNet.getLCountShowdownTurnWin();
            longValue8 = stGameUserStatisticsInfoNet.getLCountShowdownRiverWin();
            longValue9 = stGameUserStatisticsInfoNet.getLCountShowdownWinShow();
            longValue10 = stGameUserStatisticsInfoNet.getLCountShowdownShow();
        }
        this.f3639i = 0.0d;
        if (this.f3636f != 0) {
            this.f3639i = ((double) longValue) / ((double) this.f3636f);
            if (this.f3639i >= 1.0d) {
                this.f3639i = 1.0d;
            }
        }
        this.f3637g = ((int) (this.f3639i * 100.0d)) + "%";
        this.f3640j = 0.0d;
        if (longValue != 0) {
            this.f3640j = ((double) longValue2) / ((double) longValue);
            if (this.f3640j >= 1.0d) {
                this.f3640j = 1.0d;
            }
        }
        this.f3638h = ((int) (this.f3640j * 100.0d)) + "%";
        this.f3641k = 0.0d;
        if (longValue != 0) {
            this.f3641k = ((double) longValue3) / ((double) longValue);
        }
        this.f3642l = 0.0d;
        if (longValue2 != 0) {
            this.f3642l = ((double) longValue6) / ((double) longValue2);
        }
        this.f3643m = 0.0d;
        if (longValue != 0) {
            this.f3643m = ((double) longValue4) / ((double) longValue);
        }
        this.f3644n = 0.0d;
        if (longValue2 != 0) {
            this.f3644n = ((double) longValue7) / ((double) longValue2);
        }
        this.f3645o = 0.0d;
        if (longValue != 0) {
            this.f3645o = ((double) longValue5) / ((double) longValue);
        }
        this.f3646p = 0.0d;
        if (longValue2 != 0) {
            this.f3646p = ((double) longValue8) / ((double) longValue2);
        }
        this.f3647q = 0.0d;
        if (longValue != 0) {
            this.f3647q = ((double) longValue10) / ((double) longValue);
        }
        this.f3648r = 0.0d;
        if (longValue2 != 0) {
            this.f3648r = ((double) longValue9) / ((double) longValue2);
        }
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C03631(this));
        setTitle(String.format(getResources().getString(2131165865), new Object[]{this.f3635e}));
        ((TextView) findViewById(2131558524)).setText(this.f3637g);
        ((TextView) findViewById(2131558526)).setText(this.f3638h);
        ((TextView) findViewById(2131558527)).setText(this.f3636f);
        ((RecordWinProgress) findViewById(2131558525)).m4560a((float) this.f3639i, (float) (this.f3639i * this.f3640j));
        ((RecordRingProgress) findViewById(2131558528)).m4558a(this.f3641k, this.f3642l * this.f3641k);
        ((TextView) findViewById(2131558529)).setText(((int) (this.f3641k * 100.0d)) + "%");
        ((TextView) findViewById(2131558530)).setText(((int) (this.f3642l * 100.0d)) + "%");
        ((RecordRingProgress) findViewById(2131558531)).m4558a(this.f3643m, this.f3644n * this.f3643m);
        ((TextView) findViewById(2131558532)).setText(((int) (this.f3643m * 100.0d)) + "%");
        ((TextView) findViewById(2131558533)).setText(((int) (this.f3644n * 100.0d)) + "%");
        ((RecordRingProgress) findViewById(2131558534)).m4558a(this.f3645o, this.f3646p * this.f3645o);
        ((TextView) findViewById(2131558535)).setText(((int) (this.f3645o * 100.0d)) + "%");
        ((TextView) findViewById(2131558536)).setText(((int) (this.f3646p * 100.0d)) + "%");
        ((RecordRingProgress) findViewById(2131558537)).m4558a(this.f3647q, this.f3648r * this.f3647q);
        ((TextView) findViewById(2131558538)).setText(((int) (this.f3647q * 100.0d)) + "%");
        ((TextView) findViewById(2131558539)).setText(((int) (this.f3648r * 100.0d)) + "%");
    }

    protected final void m2765a(String str, List<Object> list) {
    }
}
