package com.illuminate.texaspoker.activity;

import a.does.not.Exists2;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.ali.fixHelper;
import com.illuminate.texaspoker.p055a.al;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.p056a.IabHelper.IabHelper;
import com.illuminate.texaspoker.utils.p056a.IabResult;
import com.illuminate.texaspoker.utils.p056a.Inventory;
import com.illuminate.texaspoker.utils.p056a.Purchase;
import com.illuminate.texaspoker.view.LoadingDialog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RechargeForGoogleActivity extends BaseToolBarActivity {
    private static String f5025d;
    private static String f5026r;
    private static String f5027s;
    private static String f5028t;
    private static String f5029u;
    private static String f5030v;
    private LoadingDialog f5031e;
    private al f5032f;
    private ListView f5033g;
    private Map<String, String> f5034h;
    private boolean f5035i;
    private String f5036j;
    private int f5037k;
    private Purchase f5038l;
    private boolean f5039m;
    private IabHelper f5040n;
    private IabHelper f5041o;
    private IabHelper f5042p;
    private com.illuminate.texaspoker.utils.p056a.IabHelper f5043q;

    /* renamed from: com.illuminate.texaspoker.activity.RechargeForGoogleActivity.1 */
    class C07761 implements IabHelper {
        final /* synthetic */ RechargeForGoogleActivity f5014a;

        /* renamed from: com.illuminate.texaspoker.activity.RechargeForGoogleActivity.1.1 */
        class C07741 implements OnClickListener {
            final /* synthetic */ C07761 f5012a;

            C07741(C07761 c07761) {
                this.f5012a = c07761;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f5012a.f5014a.finish();
            }
        }

        /* renamed from: com.illuminate.texaspoker.activity.RechargeForGoogleActivity.1.2 */
        class C07752 implements IabHelper {
            final /* synthetic */ C07761 f5013a;

            C07752(C07761 c07761) {
                this.f5013a = c07761;
            }

            public final void m3354a() {
                if (this.f5013a.f5014a.f5031e != null) {
                    this.f5013a.f5014a.f5031e.dismiss();
                }
            }
        }

        static {
            fixHelper.fixfunc(new int[]{2697, 2698});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C07761(RechargeForGoogleActivity rechargeForGoogleActivity);

        public final native void m3356a(IabResult iabResult, Inventory inventory);
    }

    /* renamed from: com.illuminate.texaspoker.activity.RechargeForGoogleActivity.2 */
    class C07792 implements IabHelper {
        final /* synthetic */ RechargeForGoogleActivity f5017a;

        /* renamed from: com.illuminate.texaspoker.activity.RechargeForGoogleActivity.2.1 */
        class C07771 implements OnClickListener {
            final /* synthetic */ C07792 f5015a;

            static {
                fixHelper.fixfunc(new int[]{2004, 2005});
                if (VERSION.SDK_INT <= 0) {
                    Exists2.class.toString();
                }
            }

            native C07771(C07792 c07792);

            public final native void onClick(DialogInterface dialogInterface, int i);
        }

        /* renamed from: com.illuminate.texaspoker.activity.RechargeForGoogleActivity.2.2 */
        class C07782 implements OnClickListener {
            final /* synthetic */ C07792 f5016a;

            static {
                fixHelper.fixfunc(new int[]{1822, 1823});
                if (VERSION.SDK_INT <= 0) {
                    Exists2.class.toString();
                }
            }

            native C07782(C07792 c07792);

            public final native void onClick(DialogInterface dialogInterface, int i);
        }

        static {
            fixHelper.fixfunc(new int[]{2626, 2627});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C07792(RechargeForGoogleActivity rechargeForGoogleActivity);

        public final native void m3358a(IabResult iabResult, Purchase purchase);
    }

    /* renamed from: com.illuminate.texaspoker.activity.RechargeForGoogleActivity.3 */
    class C07803 implements IabHelper {
        final /* synthetic */ RechargeForGoogleActivity f5018a;

        static {
            fixHelper.fixfunc(new int[]{2728, 1});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C07803(RechargeForGoogleActivity rechargeForGoogleActivity);
    }

    /* renamed from: com.illuminate.texaspoker.activity.RechargeForGoogleActivity.4 */
    class C07814 implements View.OnClickListener {
        final /* synthetic */ RechargeForGoogleActivity f5019a;

        static {
            fixHelper.fixfunc(new int[]{2712, 2713});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C07814(RechargeForGoogleActivity rechargeForGoogleActivity);

        public final native void onClick(View view);
    }

    /* renamed from: com.illuminate.texaspoker.activity.RechargeForGoogleActivity.5 */
    class C07835 implements IabHelper {
        final /* synthetic */ RechargeForGoogleActivity f5021a;

        /* renamed from: com.illuminate.texaspoker.activity.RechargeForGoogleActivity.5.1 */
        class C07821 implements OnClickListener {
            final /* synthetic */ C07835 f5020a;

            C07821(C07835 c07835) {
                this.f5020a = c07835;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f5020a.f5021a.finish();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{2919, 2920});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C07835(RechargeForGoogleActivity rechargeForGoogleActivity);

        public final native void m3360a(IabResult iabResult);
    }

    /* renamed from: com.illuminate.texaspoker.activity.RechargeForGoogleActivity.6 */
    class C07846 implements OnItemClickListener {
        final /* synthetic */ RechargeForGoogleActivity f5022a;

        static {
            fixHelper.fixfunc(new int[]{2833, 2834});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C07846(RechargeForGoogleActivity rechargeForGoogleActivity);

        public final native void onItemClick(AdapterView<?> adapterView, View view, int i, long j);
    }

    /* renamed from: com.illuminate.texaspoker.activity.RechargeForGoogleActivity.7 */
    class C07857 implements OnClickListener {
        final /* synthetic */ RechargeForGoogleActivity f5023a;

        static {
            fixHelper.fixfunc(new int[]{2985, 2986});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C07857(RechargeForGoogleActivity rechargeForGoogleActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.activity.RechargeForGoogleActivity.8 */
    class C07868 implements OnClickListener {
        final /* synthetic */ RechargeForGoogleActivity f5024a;

        static {
            fixHelper.fixfunc(new int[]{2949, 2950});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C07868(RechargeForGoogleActivity rechargeForGoogleActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    public RechargeForGoogleActivity() {
        this.f5034h = new HashMap();
        this.f5035i = false;
        this.f5039m = false;
        this.f5040n = new C07761(this);
        this.f5041o = new C07792(this);
        this.f5042p = new C07803(this);
    }

    static {
        f5025d = "RechargeActivity";
        f5026r = "com.texaspoker.60diamond";
        f5027s = "com.texaspoker.300diamond";
        f5028t = "com.texaspoker.1280diamond";
        f5029u = "com.texaspoker.3280diamond";
        f5030v = "com.texaspoker.6180diamond";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (!(extras == null || extras.get("fromGame") == null)) {
            this.f5039m = extras.getBoolean("fromGame", false);
        }
        setContentView(2130968659);
        this.f5043q = new com.illuminate.texaspoker.utils.p056a.IabHelper(this, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAkK52NWPibnLDkxjgGEJalk5JqzL+SRn3nANEA/p7fgK23xY+vr5AUGPJEXcMa2KLTFeAK0O1lnLTaYJ3fYOkzSFB6HguswDzPE573Mvus/x6RRnQAgtf4SPb3T5bNiD8l+Yn0HZf4191SRrUEBSgLMEnzMkAu4wH9WWhCou9tlV8kmrFq3pdMz3aacFR30u0FLC6PadERAB7nOP825hTZyqMHu5+zSFpzil9Uj3iGUoQaVH/nOtJSduVNxfRJmHOLLkH1mNBDJBtchnDuEKQvkPTQS6ATxyEWF1T/dKV89vJ3giemtKh5dQEG3g0DlekPRqEz4y1UY7UUVBM05zuIQIDAQAB");
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        if (this.f5039m) {
            toolbar.setNavigationIcon(2130837653);
        } else {
            toolbar.setNavigationIcon(2130837591);
        }
        toolbar.setNavigationOnClickListener(new C07814(this));
        com.illuminate.texaspoker.utils.p056a.IabHelper iabHelper = this.f5043q;
        IabHelper c07835 = new C07835(this);
        iabHelper.m4219a();
        if (iabHelper.f6623c) {
            throw new IllegalStateException("IAB helper is already set up.");
        }
        iabHelper.f6630j = new IabHelper(iabHelper, c07835);
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        if (iabHelper.f6628h.getPackageManager().queryIntentServices(intent, 0) == null || iabHelper.f6628h.getPackageManager().queryIntentServices(intent, 0).isEmpty()) {
            c07835.m3359a(new IabResult(3, "Billing service unavailable on device."));
        } else {
            iabHelper.f6628h.bindService(intent, iabHelper.f6630j, 1);
        }
        this.f5031e = new LoadingDialog(this, StatisticConfig.MIN_UPLOAD_INTERVAL);
        this.f5031e.show();
        this.f5033g = (ListView) findViewById(2131558803);
        this.f5032f = new al(this, this.f5034h);
        this.f5033g.setAdapter(this.f5032f);
        this.f5033g.setOnItemClickListener(new C07846(this));
    }

    public void finish() {
        super.finish();
        if (this.f5039m) {
            overridePendingTransition(0, 2131034133);
        }
    }

    protected void onResume() {
        super.onResume();
        if (!DBManager.m3631a().m3632b()) {
            this.f5032f.notifyDataSetChanged();
        }
        NetworkUtil.m4073a();
        NetworkUtil.m4137b(SharedPreferencesManager.m4308b(), false);
        NetworkUtil.m4073a();
        NetworkUtil.m4190s();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        new StringBuilder("onActivityResult(").append(i).append(",").append(i2).append(",").append(intent);
        if (this.f5043q != null && !this.f5043q.m4222a(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    protected void onStop() {
        super.onStop();
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f5043q != null) {
            com.illuminate.texaspoker.utils.p056a.IabHelper iabHelper = this.f5043q;
            iabHelper.f6623c = false;
            if (!(iabHelper.f6630j == null || iabHelper.f6628h == null)) {
                try {
                    iabHelper.f6628h.unbindService(iabHelper.f6630j);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            iabHelper.f6624d = true;
            iabHelper.f6628h = null;
            iabHelper.f6630j = null;
            iabHelper.f6629i = null;
            iabHelper.f6634n = null;
        }
        this.f5043q = null;
    }

    protected final void m3379a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_GET_COIN_LIST_SUCCESS")) {
            if (!DBManager.m3631a().m3632b()) {
                this.f5032f.notifyDataSetChanged();
            }
        } else if (str.equalsIgnoreCase("NOTIFY_GET_COIN_LIST_FAULT")) {
            new Builder(this).setTitle(2131165514).setMessage(((Integer) list.get(0)).intValue()).setPositiveButton(2131165438, new C07868(this)).show();
        } else if (str.equalsIgnoreCase("NOTIFY_BUY_DIAMOND_SUCCESS")) {
            if (this.f5031e != null) {
                this.f5031e.dismiss();
            }
            com.illuminate.texaspoker.utils.p056a.IabHelper iabHelper = this.f5043q;
            Purchase purchase = this.f5038l;
            IabHelper iabHelper2 = this.f5042p;
            iabHelper.m4219a();
            iabHelper.m4220a("consume");
            List arrayList = new ArrayList();
            arrayList.add(purchase);
            iabHelper.m4221a(arrayList, iabHelper2, null);
            this.f5038l = null;
            this.f5037k = -1;
            this.f5036j = null;
        } else if (str.equalsIgnoreCase("NOTIFY_BUY_DIAMOND_FAULT")) {
            int intValue = ((Integer) list.get(0)).intValue();
            if (this.f5031e != null) {
                this.f5031e.dismiss();
            }
            new Builder(this).setTitle(2131165514).setMessage(intValue).setPositiveButton(2131165438, new C07857(this)).show();
        }
    }
}
