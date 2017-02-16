package com.illuminate.texaspoker.activity;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.ali.fixHelper;
import com.illuminate.texaspoker.p058c.FriendUser;
import com.illuminate.texaspoker.view.RecordWinProgress;
import java.util.List;

public class FriendRecordActivity extends BaseToolBarActivity {
    private static String f4479d;
    private long f4480e;
    private FriendUser f4481f;
    private TextView f4482g;
    private TextView f4483h;
    private TextView f4484i;
    private TextView f4485j;
    private RecordWinProgress f4486k;

    /* renamed from: com.illuminate.texaspoker.activity.FriendRecordActivity.1 */
    class C06261 implements OnClickListener {
        final /* synthetic */ FriendRecordActivity f4478a;

        C06261(FriendRecordActivity friendRecordActivity) {
            this.f4478a = friendRecordActivity;
        }

        public final void onClick(View view) {
            this.f4478a.finish();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{2701, 2702, 2703, 2704, 2705});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    private native void m3122a();

    protected final native void m3123a(String str, List<Object> list);

    protected native void onCreate(Bundle bundle);

    protected native void onResume();

    static void __clinit__() {
        f4479d = "FriendRecordActivity";
    }
}
