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
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.ali.fixHelper;
import com.illuminate.texaspoker.p055a.ar;
import com.illuminate.texaspoker.p058c.SellItem;
import com.illuminate.texaspoker.utils.Config;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.view.LoadingDialog;
import java.util.ArrayList;
import java.util.List;

public class StoreActivity extends BaseToolBarActivity {
    private static String f5246d;
    private ArrayList<SellItem> f5247e;
    private SellItem f5248f;
    private LoadingDialog f5249g;
    private ar f5250h;
    private ListView f5251i;
    private View f5252j;
    private ImageView f5253k;
    private TextView f5254l;
    private TextView f5255m;
    private TextView f5256n;
    private boolean f5257o;

    /* renamed from: com.illuminate.texaspoker.activity.StoreActivity.1 */
    class C08621 implements OnClickListener {
        final /* synthetic */ StoreActivity f5236a;

        C08621(StoreActivity storeActivity) {
            this.f5236a = storeActivity;
        }

        public final void onClick(View view) {
            this.f5236a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.StoreActivity.2 */
    class C08642 implements OnItemClickListener {
        final /* synthetic */ StoreActivity f5238a;

        /* renamed from: com.illuminate.texaspoker.activity.StoreActivity.2.1 */
        class C08631 implements DialogInterface.OnClickListener {
            final /* synthetic */ C08642 f5237a;

            static {
                fixHelper.fixfunc(new int[]{3617, 3618});
                if (VERSION.SDK_INT <= 0) {
                    Exists2.class.toString();
                }
            }

            native C08631(C08642 c08642);

            public final native void onClick(DialogInterface dialogInterface, int i);
        }

        C08642(StoreActivity storeActivity) {
            this.f5238a = storeActivity;
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (i != 0) {
                StoreActivity.m3446a(this.f5238a, (SellItem) this.f5238a.f5247e.get(i - 1));
            } else if (Config.f6659d == Config.f6657b) {
                this.f5238a.startActivity(new Intent(this.f5238a, RechargeForGoogleActivity.class));
            } else if (Config.f6659d == Config.f6658c) {
                this.f5238a.startActivity(new Intent(this.f5238a, RechargeActivity.class));
            } else {
                new Builder(this.f5238a).setTitle((CharSequence) "\u5f00\u53d1\u6d4b\u8bd5\u7528,\u8bf7\u65e0\u89c6!").setItems(2131492866, new C08631(this)).show();
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.StoreActivity.3 */
    class C08653 implements DialogInterface.OnClickListener {
        final /* synthetic */ StoreActivity f5239a;

        C08653(StoreActivity storeActivity) {
            this.f5239a = storeActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.StoreActivity.4 */
    class C08664 implements DialogInterface.OnClickListener {
        final /* synthetic */ StoreActivity f5240a;

        C08664(StoreActivity storeActivity) {
            this.f5240a = storeActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.StoreActivity.5 */
    class C08675 implements DialogInterface.OnClickListener {
        final /* synthetic */ StoreActivity f5241a;

        C08675(StoreActivity storeActivity) {
            this.f5241a = storeActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.StoreActivity.6 */
    class C08686 implements DialogInterface.OnClickListener {
        final /* synthetic */ SellItem f5242a;
        final /* synthetic */ StoreActivity f5243b;

        C08686(StoreActivity storeActivity, SellItem sellItem) {
            this.f5243b = storeActivity;
            this.f5242a = sellItem;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f5243b.f5249g = new LoadingDialog(this.f5243b);
            this.f5243b.f5249g.show();
            NetworkUtil.m4073a();
            NetworkUtil.m4131b(this.f5242a.f5987g.intValue());
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.StoreActivity.7 */
    class C08697 implements DialogInterface.OnClickListener {
        final /* synthetic */ StoreActivity f5244a;

        C08697(StoreActivity storeActivity) {
            this.f5244a = storeActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.StoreActivity.8 */
    class C08708 implements DialogInterface.OnClickListener {
        final /* synthetic */ StoreActivity f5245a;

        C08708(StoreActivity storeActivity) {
            this.f5245a = storeActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    static {
        fixHelper.fixfunc(new int[]{2992, 2993, 2994, 2995, 2996, 2997, 2998});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    private native void m3445a();

    protected final native void m3448a(String str, List<Object> list);

    public native void finish();

    protected native void onCreate(Bundle bundle);

    protected native void onResume();

    protected native void onStop();

    static /* synthetic */ void m3446a(StoreActivity storeActivity, SellItem sellItem) {
        storeActivity.f5248f = sellItem;
        if (sellItem.f5984d.intValue() == 1) {
            if (SharedPreferencesManager.m4413q() < ((long) sellItem.f5986f.intValue())) {
                new Builder(storeActivity).setTitle(2131165920).setMessage(2131165927).setPositiveButton(2131165438, new C08653(storeActivity)).show();
                return;
            }
        } else if (SharedPreferencesManager.m4417r() < ((long) sellItem.f5986f.intValue())) {
            new Builder(storeActivity).setTitle(2131165920).setMessage(2131165926).setPositiveButton(2131165438, new C08664(storeActivity)).show();
            return;
        }
        new Builder(storeActivity).setTitle(2131165921).setMessage(String.format(storeActivity.getResources().getString(2131165919), new Object[]{sellItem.f5991k})).setPositiveButton(2131165438, new C08686(storeActivity, sellItem)).setNegativeButton(2131165432, new C08675(storeActivity)).show();
    }

    static void __clinit__() {
        f5246d = "StoreActivity";
    }
}
