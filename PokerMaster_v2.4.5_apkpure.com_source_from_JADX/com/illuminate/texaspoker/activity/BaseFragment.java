package com.illuminate.texaspoker.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import java.util.List;

/* renamed from: com.illuminate.texaspoker.activity.b */
public abstract class BaseFragment extends Fragment {
    BaseFragment f5329a;
    protected boolean f5330b;
    private RelativeLayout f5331c;

    /* renamed from: com.illuminate.texaspoker.activity.b.a */
    private class BaseFragment extends BroadcastReceiver {
        final /* synthetic */ BaseFragment f5328a;

        private BaseFragment(BaseFragment baseFragment) {
            this.f5328a = baseFragment;
        }

        public final void onReceive(Context context, Intent intent) {
            this.f5328a.m3482a(intent.getStringExtra("NOTIFY_NAME"), (List) intent.getSerializableExtra("NOTIFY_DATA"));
        }
    }

    public abstract void m3482a(String str, List<Object> list);

    public BaseFragment() {
        this.f5330b = false;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f5330b = false;
    }

    public void onPause() {
        super.onPause();
        getContext().unregisterReceiver(this.f5329a);
    }

    public void onResume() {
        super.onResume();
        this.f5329a = new BaseFragment();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.illuminate.texaspoker.notifyaction");
        getContext().registerReceiver(this.f5329a, intentFilter);
        this.f5330b = true;
    }

    protected final int m3480a() {
        int i;
        Rect rect = new Rect();
        getActivity().getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int height = getActivity().getWindow().getDecorView().getRootView().getHeight() - rect.bottom;
        if (VERSION.SDK_INT >= 20) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i2 = displayMetrics.heightPixels;
            getActivity().getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
            i = displayMetrics.heightPixels;
            if (i > i2) {
                i -= i2;
            } else {
                i = 0;
            }
            i = height - i;
        } else {
            i = height;
        }
        if (i > 210 && SharedPreferencesManager.m4296a(getResources()) != i) {
            SharedPreferencesManager.m4384l(i);
        }
        return i;
    }

    public void startActivity(Intent intent) {
        super.startActivity(intent);
        getActivity().overridePendingTransition(2131034126, 2131034126);
    }

    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
        getActivity().overridePendingTransition(2131034126, 2131034126);
    }

    public final void m3481a(String str) {
        if (this.f5331c == null) {
            this.f5331c = (RelativeLayout) LayoutInflater.from(getContext()).inflate(2130968833, null);
        }
        ((ImageView) this.f5331c.findViewById(2131559415)).setImageResource(2130903589);
        ((TextView) this.f5331c.findViewById(2131559416)).setText(str);
        Toast toast = new Toast(getContext());
        toast.setGravity(17, 0, 0);
        toast.setDuration(0);
        toast.setView(this.f5331c);
        toast.show();
    }
}
