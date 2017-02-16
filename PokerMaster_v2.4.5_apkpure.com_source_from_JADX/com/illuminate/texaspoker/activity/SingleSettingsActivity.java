package com.illuminate.texaspoker.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import com.facebook.drawee.p031e.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.FriendUser;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.texaspoker.moment.TexasPoker.CHAT_TYPE;
import java.util.List;

public class SingleSettingsActivity extends BaseToolBarActivity {
    private static String f5163d;
    private long f5164e;
    private FriendUser f5165f;
    private SimpleDraweeView f5166g;
    private TextView f5167h;
    private Switch f5168i;

    /* renamed from: com.illuminate.texaspoker.activity.SingleSettingsActivity.1 */
    class C08371 implements OnClickListener {
        final /* synthetic */ SingleSettingsActivity f5157a;

        C08371(SingleSettingsActivity singleSettingsActivity) {
            this.f5157a = singleSettingsActivity;
        }

        public final void onClick(View view) {
            this.f5157a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SingleSettingsActivity.2 */
    class C08382 implements OnClickListener {
        final /* synthetic */ SingleSettingsActivity f5158a;

        C08382(SingleSettingsActivity singleSettingsActivity) {
            this.f5158a = singleSettingsActivity;
        }

        public final void onClick(View view) {
            SingleSettingsActivity.m3415a(this.f5158a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SingleSettingsActivity.3 */
    class C08393 implements OnClickListener {
        final /* synthetic */ SingleSettingsActivity f5159a;

        C08393(SingleSettingsActivity singleSettingsActivity) {
            this.f5159a = singleSettingsActivity;
        }

        public final void onClick(View view) {
            SingleSettingsActivity.m3416b(this.f5159a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SingleSettingsActivity.4 */
    class C08404 implements OnClickListener {
        final /* synthetic */ SingleSettingsActivity f5160a;

        C08404(SingleSettingsActivity singleSettingsActivity) {
            this.f5160a = singleSettingsActivity;
        }

        public final void onClick(View view) {
            new Builder(this.f5160a).setTitle(2131165514).setMessage(2131165253).setPositiveButton(2131165435, new C08426(this.f5160a)).setNegativeButton(2131165432, new C08415(this.f5160a)).show();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SingleSettingsActivity.5 */
    class C08415 implements DialogInterface.OnClickListener {
        final /* synthetic */ SingleSettingsActivity f5161a;

        C08415(SingleSettingsActivity singleSettingsActivity) {
            this.f5161a = singleSettingsActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SingleSettingsActivity.6 */
    class C08426 implements DialogInterface.OnClickListener {
        final /* synthetic */ SingleSettingsActivity f5162a;

        C08426(SingleSettingsActivity singleSettingsActivity) {
            this.f5162a = singleSettingsActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            DBManager.m3631a().f5566f.m3574a(this.f5162a.f5164e, 1, false);
        }
    }

    static {
        f5163d = "SingleSettingsActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968666);
        this.f5164e = getIntent().getExtras().getLong("friendUuid");
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C08371(this));
        this.f5166g = (SimpleDraweeView) findViewById(2131558838);
        ((Button) findViewById(2131558839)).setOnClickListener(new C08382(this));
        this.f5167h = (TextView) findViewById(2131558840);
        this.f5168i = (Switch) findViewById(2131558650);
        this.f5168i.setOnClickListener(new C08393(this));
        ((ImageButton) findViewById(2131558651)).setOnClickListener(new C08404(this));
    }

    protected void onResume() {
        super.onResume();
        m3414a();
        NetworkUtil.m4073a();
        NetworkUtil.m4137b(this.f5164e, false);
    }

    private void m3414a() {
        if (!DBManager.m3631a().m3632b()) {
            this.f5165f = DBManager.m3631a().f5563c.m3639a(this.f5164e);
            if (this.f5165f.f5832k.intValue() == 1) {
                ((GenericDraweeHierarchy) this.f5166g.getHierarchy()).m1407a(2130903198);
            } else {
                ((GenericDraweeHierarchy) this.f5166g.getHierarchy()).m1407a(2130903193);
            }
            this.f5166g.setImageURI(Uri.parse(this.f5165f.f5836o));
            this.f5167h.setText(this.f5165f.f5838q);
            if (this.f5165f.f5823b.booleanValue()) {
                this.f5168i.setChecked(true);
            } else {
                this.f5168i.setChecked(false);
            }
        }
    }

    protected final void m3419a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_REFRESH_IMAGE")) {
            m3414a();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_FRIEND")) {
            m3414a();
        } else if (str.equalsIgnoreCase("NOTIFY_CHANGE_ROOM_SOUND_SUCCESS")) {
            m3414a();
        } else if (str.equalsIgnoreCase("NOTIFY_CHANGE_ROOM_SOUND_FAULT")) {
            m3414a();
        } else if (str.equalsIgnoreCase("NOTIFY_RFRESH_USER_INFO")) {
            m3414a();
        }
    }

    static /* synthetic */ void m3415a(SingleSettingsActivity singleSettingsActivity) {
        long j = singleSettingsActivity.f5164e;
        if (j != SharedPreferencesManager.m4308b()) {
            Intent intent = new Intent(singleSettingsActivity, FriendInfoActivity.class);
            intent.putExtra("friendUuid", j);
            singleSettingsActivity.startActivity(intent);
        }
    }

    static /* synthetic */ void m3416b(SingleSettingsActivity singleSettingsActivity) {
        NetworkUtil.m4073a();
        NetworkUtil.m4091a(singleSettingsActivity.f5164e, CHAT_TYPE.CHAT_TYPE_SINGLE, singleSettingsActivity.f5168i.isChecked(), true);
    }
}
