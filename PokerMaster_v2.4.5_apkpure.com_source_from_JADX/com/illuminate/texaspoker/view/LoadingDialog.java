package com.illuminate.texaspoker.view;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Timer;
import java.util.TimerTask;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: com.illuminate.texaspoker.view.a */
public final class LoadingDialog extends Dialog {
    private Context f7040a;
    private long f7041b;
    private Timer f7042c;
    private TimerTask f7043d;
    private Handler f7044e;

    /* renamed from: com.illuminate.texaspoker.view.a.1 */
    class LoadingDialog extends Handler {
        final /* synthetic */ LoadingDialog f7038a;

        LoadingDialog(LoadingDialog loadingDialog) {
            this.f7038a = loadingDialog;
        }

        public final void handleMessage(Message message) {
            switch (message.what) {
                case SQLiteDatabase.OPEN_READONLY /*1*/:
                    this.f7038a.dismiss();
                    RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(this.f7038a.f7040a).inflate(2130968833, null);
                    ((ImageView) relativeLayout.findViewById(2131559415)).setImageResource(2130903246);
                    ((TextView) relativeLayout.findViewById(2131559416)).setText(2131165457);
                    Toast toast = new Toast(this.f7038a.f7040a);
                    toast.setGravity(17, 0, 0);
                    toast.setDuration(1);
                    toast.setView(relativeLayout);
                    toast.show();
                default:
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.a.2 */
    class LoadingDialog extends TimerTask {
        final /* synthetic */ LoadingDialog f7039a;

        LoadingDialog(LoadingDialog loadingDialog) {
            this.f7039a = loadingDialog;
        }

        public final void run() {
            Message message = new Message();
            message.what = 1;
            this.f7039a.f7044e.sendMessage(message);
        }
    }

    public LoadingDialog(Context context) {
        super(context, 2131296473);
        this.f7040a = context;
        this.f7041b = 15000;
    }

    public LoadingDialog(Context context, long j) {
        super(context, 2131296473);
        this.f7040a = context;
        this.f7041b = j;
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = LayoutInflater.from(this.f7040a).inflate(2130968788, null);
        setContentView(inflate);
        setCancelable(false);
        ((AnimationDrawable) ((ImageView) inflate.findViewById(2131559251)).getDrawable()).start();
        this.f7044e = new LoadingDialog(this);
        this.f7043d = new LoadingDialog(this);
        this.f7042c = new Timer();
        this.f7042c.schedule(this.f7043d, this.f7041b);
    }

    public final void dismiss() {
        this.f7042c.cancel();
        super.dismiss();
    }
}
