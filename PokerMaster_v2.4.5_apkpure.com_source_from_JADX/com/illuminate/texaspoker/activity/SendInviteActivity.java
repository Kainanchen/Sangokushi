package com.illuminate.texaspoker.activity;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.drawee.p031e.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.FriendUser;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.view.LoadingDialog;
import com.texaspoker.moment.TexasPokerHttpUser.MSG_ACT;
import com.texaspoker.moment.TexasPokerHttpUser.USER_FRIEND_STATE;
import java.util.List;

public class SendInviteActivity extends BaseToolBarActivity {
    private static String f5135d;
    private long f5136e;
    private EditText f5137f;
    private Button f5138g;
    private LoadingDialog f5139h;
    private RelativeLayout f5140i;

    /* renamed from: com.illuminate.texaspoker.activity.SendInviteActivity.1 */
    class C08211 implements OnClickListener {
        final /* synthetic */ SendInviteActivity f5130a;

        C08211(SendInviteActivity sendInviteActivity) {
            this.f5130a = sendInviteActivity;
        }

        public final void onClick(View view) {
            this.f5130a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SendInviteActivity.2 */
    class C08222 implements OnClickListener {
        final /* synthetic */ SendInviteActivity f5131a;

        C08222(SendInviteActivity sendInviteActivity) {
            this.f5131a = sendInviteActivity;
        }

        public final void onClick(View view) {
            this.f5131a.m2734b();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SendInviteActivity.3 */
    class C08233 implements OnGlobalLayoutListener {
        final /* synthetic */ SendInviteActivity f5132a;

        C08233(SendInviteActivity sendInviteActivity) {
            this.f5132a = sendInviteActivity;
        }

        public final void onGlobalLayout() {
            this.f5132a.m2735c();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SendInviteActivity.4 */
    class C08244 implements OnClickListener {
        final /* synthetic */ SendInviteActivity f5133a;

        C08244(SendInviteActivity sendInviteActivity) {
            this.f5133a = sendInviteActivity;
        }

        public final void onClick(View view) {
            SendInviteActivity.m3405a(this.f5133a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SendInviteActivity.5 */
    class C08255 implements DialogInterface.OnClickListener {
        final /* synthetic */ SendInviteActivity f5134a;

        C08255(SendInviteActivity sendInviteActivity) {
            this.f5134a = sendInviteActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    static {
        f5135d = "SendInviteActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968664);
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C08211(this));
        this.f5136e = getIntent().getExtras().getLong("uuid");
        View findViewById = findViewById(2131558818);
        findViewById.setOnClickListener(new C08222(this));
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new C08233(this));
        CharSequence format = String.format(getResources().getString(2131165545), new Object[]{SharedPreferencesManager.m4361i()});
        this.f5137f = (EditText) findViewById(2131558820);
        this.f5137f.setText(format);
        this.f5138g = (Button) findViewById(2131558821);
        this.f5138g.setOnClickListener(new C08244(this));
    }

    protected void onStart() {
        super.onStart();
    }

    protected void onResume() {
        super.onResume();
    }

    protected final void m3406a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("INVITE_FRIEND_SUCCESS")) {
            this.f5139h.dismiss();
            finish();
        } else if (str.equalsIgnoreCase("INVITE_FRIEND_FAULT")) {
            this.f5139h.dismiss();
            new Builder(this).setTitle(2131165514).setMessage(((Integer) list.get(0)).intValue()).setPositiveButton(2131165438, new C08255(this)).show();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_NEW_FRIEND") && list.size() == 2) {
            USER_FRIEND_STATE user_friend_state = (USER_FRIEND_STATE) list.get(0);
            long longValue = ((Long) list.get(1)).longValue();
            if (user_friend_state == USER_FRIEND_STATE.USER_FRIEND_STATE_INVITING) {
                if (this.f5140i == null) {
                    this.f5140i = (RelativeLayout) LayoutInflater.from(this).inflate(2130968784, null);
                }
                FriendUser a = DBManager.m3631a().f5563c.m3639a(longValue);
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) this.f5140i.findViewById(2131558674);
                if (a.f5832k.intValue() == 1) {
                    ((GenericDraweeHierarchy) simpleDraweeView.getHierarchy()).m1407a(2130903198);
                } else {
                    ((GenericDraweeHierarchy) simpleDraweeView.getHierarchy()).m1407a(2130903193);
                }
                simpleDraweeView.setImageURI(Uri.parse(a.f5836o));
                ((TextView) this.f5140i.findViewById(2131559165)).setText(a.f5838q);
                Toast toast = new Toast(this);
                toast.setGravity(17, 0, 0);
                toast.setDuration(1);
                toast.setView(this.f5140i);
                toast.show();
            }
        }
    }

    static /* synthetic */ void m3405a(SendInviteActivity sendInviteActivity) {
        sendInviteActivity.m2734b();
        sendInviteActivity.f5139h = new LoadingDialog(sendInviteActivity);
        sendInviteActivity.f5139h.show();
        String obj = sendInviteActivity.f5137f.getText().toString();
        NetworkUtil.m4073a();
        NetworkUtil.m4093a(sendInviteActivity.f5136e, MSG_ACT.ACT_LAUNCH_INVITE, obj);
    }
}
