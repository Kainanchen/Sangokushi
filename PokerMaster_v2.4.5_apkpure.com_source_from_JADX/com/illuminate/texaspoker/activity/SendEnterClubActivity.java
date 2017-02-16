package com.illuminate.texaspoker.activity;

import a.does.not.Exists2;
import android.content.DialogInterface;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Button;
import android.widget.EditText;
import com.ali.fixHelper;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.view.LoadingDialog;
import java.util.List;
import net.sqlcipher.database.SQLiteDatabase;

public class SendEnterClubActivity extends BaseToolBarActivity {
    private static String f5108d;
    private long f5109e;
    private EditText f5110f;
    private Button f5111g;
    private LoadingDialog f5112h;

    /* renamed from: com.illuminate.texaspoker.activity.SendEnterClubActivity.1 */
    class C08081 implements OnClickListener {
        final /* synthetic */ SendEnterClubActivity f5103a;

        static {
            fixHelper.fixfunc(new int[]{2969, 2970});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C08081(SendEnterClubActivity sendEnterClubActivity);

        public final native void onClick(View view);
    }

    /* renamed from: com.illuminate.texaspoker.activity.SendEnterClubActivity.2 */
    class C08092 implements OnClickListener {
        final /* synthetic */ SendEnterClubActivity f5104a;

        static {
            fixHelper.fixfunc(new int[]{2822, 2823});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C08092(SendEnterClubActivity sendEnterClubActivity);

        public final native void onClick(View view);
    }

    /* renamed from: com.illuminate.texaspoker.activity.SendEnterClubActivity.3 */
    class C08103 implements OnGlobalLayoutListener {
        final /* synthetic */ SendEnterClubActivity f5105a;

        static {
            fixHelper.fixfunc(new int[]{2858, 2859});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C08103(SendEnterClubActivity sendEnterClubActivity);

        public final native void onGlobalLayout();
    }

    /* renamed from: com.illuminate.texaspoker.activity.SendEnterClubActivity.4 */
    class C08114 implements OnClickListener {
        final /* synthetic */ SendEnterClubActivity f5106a;

        C08114(SendEnterClubActivity sendEnterClubActivity) {
            this.f5106a = sendEnterClubActivity;
        }

        public final void onClick(View view) {
            SendEnterClubActivity.m3401a(this.f5106a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SendEnterClubActivity.5 */
    class C08125 implements DialogInterface.OnClickListener {
        final /* synthetic */ SendEnterClubActivity f5107a;

        C08125(SendEnterClubActivity sendEnterClubActivity) {
            this.f5107a = sendEnterClubActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    static {
        fixHelper.fixfunc(new int[]{246, 247, 248, 249, SQLiteDatabase.MAX_SQL_CACHE_SIZE});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    protected final native void m3402a(String str, List<Object> list);

    protected native void onCreate(Bundle bundle);

    protected native void onResume();

    protected native void onStart();

    static void __clinit__() {
        f5108d = "SendEnterClubActivity";
    }

    static /* synthetic */ void m3401a(SendEnterClubActivity sendEnterClubActivity) {
        sendEnterClubActivity.m2734b();
        sendEnterClubActivity.f5112h = new LoadingDialog(sendEnterClubActivity);
        sendEnterClubActivity.f5112h.show();
        String obj = sendEnterClubActivity.f5110f.getText().toString();
        NetworkUtil.m4073a();
        NetworkUtil.m4094a(sendEnterClubActivity.f5109e, obj);
    }
}
