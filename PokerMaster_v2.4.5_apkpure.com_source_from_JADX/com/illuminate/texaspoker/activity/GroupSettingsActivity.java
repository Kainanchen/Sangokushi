package com.illuminate.texaspoker.activity;

import a.does.not.Exists2;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.Toolbar;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import com.ali.fixHelper;
import com.facebook.drawee.view.SimpleDraweeView;
import com.illuminate.texaspoker.R.R;
import com.illuminate.texaspoker.application.BaseApplication;
import com.illuminate.texaspoker.dao.ChatUserDao.Properties;
import com.illuminate.texaspoker.p055a.GroupMemberAdapter;
import com.illuminate.texaspoker.p057b.ChatUserDBManager;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.illuminate.texaspoker.p058c.ChatUser;
import com.illuminate.texaspoker.utils.ImageUtility;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.utils.Utility;
import com.illuminate.texaspoker.view.LoadingDialog;
import com.tencent.android.tpush.XGPushManager;
import com.texaspoker.moment.TexasPoker.CHAT_TYPE;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.a.a.d.g;
import org.a.a.d.i;

public class GroupSettingsActivity extends BaseToolBarActivity {
    private static String f4523d;
    private static int f4524r;
    private static int f4525s;
    private static int f4526t;
    private long f4527e;
    private ChatRoom f4528f;
    private boolean f4529g;
    private boolean f4530h;
    private List f4531i;
    private SimpleDraweeView f4532j;
    private TextView f4533k;
    private TextView f4534l;
    private GridView f4535m;
    private GroupMemberAdapter f4536n;
    private Switch f4537o;
    private Switch f4538p;
    private Switch f4539q;
    private Uri f4540u;
    private Uri f4541v;

    /* renamed from: com.illuminate.texaspoker.activity.GroupSettingsActivity.1 */
    class C06321 implements OnClickListener {
        final /* synthetic */ GroupSettingsActivity f4513a;

        C06321(GroupSettingsActivity groupSettingsActivity) {
            this.f4513a = groupSettingsActivity;
        }

        public final void onClick(View view) {
            this.f4513a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.GroupSettingsActivity.2 */
    class C06332 implements DialogInterface.OnClickListener {
        final /* synthetic */ GroupSettingsActivity f4515a;

        C06332(GroupSettingsActivity groupSettingsActivity) {
            this.f4515a = groupSettingsActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.GroupSettingsActivity.3 */
    class C06343 implements DialogInterface.OnClickListener {
        final /* synthetic */ GroupSettingsActivity f4516a;

        C06343(GroupSettingsActivity groupSettingsActivity) {
            this.f4516a = groupSettingsActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            DBManager.m3631a().f5566f.m3574a(this.f4516a.f4527e, 2, false);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.GroupSettingsActivity.4 */
    class C06354 implements DialogInterface.OnClickListener {
        final /* synthetic */ GroupSettingsActivity f4517a;

        C06354(GroupSettingsActivity groupSettingsActivity) {
            this.f4517a = groupSettingsActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.GroupSettingsActivity.5 */
    class C06365 implements DialogInterface.OnClickListener {
        final /* synthetic */ GroupSettingsActivity f4518a;

        C06365(GroupSettingsActivity groupSettingsActivity) {
            this.f4518a = groupSettingsActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            GroupSettingsActivity.m3153l(this.f4518a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.GroupSettingsActivity.6 */
    class C06376 implements DialogInterface.OnClickListener {
        final /* synthetic */ GroupSettingsActivity f4519a;

        static {
            fixHelper.fixfunc(new int[]{2281, 2282});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C06376(GroupSettingsActivity groupSettingsActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.activity.GroupSettingsActivity.7 */
    class C06387 implements DialogInterface.OnClickListener {
        final /* synthetic */ GroupSettingsActivity f4520a;

        static {
            fixHelper.fixfunc(new int[]{2184, 2185});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C06387(GroupSettingsActivity groupSettingsActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.activity.GroupSettingsActivity.8 */
    class C06398 implements DialogInterface.OnClickListener {
        final /* synthetic */ GroupSettingsActivity f4521a;

        static {
            fixHelper.fixfunc(new int[]{2606, 2607});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C06398(GroupSettingsActivity groupSettingsActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.activity.GroupSettingsActivity.9 */
    class C06409 implements DialogInterface.OnClickListener {
        final /* synthetic */ GroupSettingsActivity f4522a;

        static {
            fixHelper.fixfunc(new int[]{2283, 2284});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C06409(GroupSettingsActivity groupSettingsActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    static /* synthetic */ void m3145e(GroupSettingsActivity groupSettingsActivity) {
        boolean z = true;
        if (groupSettingsActivity.f4529g) {
            if (groupSettingsActivity.f4530h) {
                z = false;
            }
            groupSettingsActivity.f4530h = z;
            groupSettingsActivity.f4536n.f3448a = groupSettingsActivity.f4530h;
            groupSettingsActivity.f4536n.notifyDataSetChanged();
            return;
        }
        groupSettingsActivity.m2732a(2130903246, 2131165291, 1);
    }

    static {
        f4523d = "GroupSettingsActivity";
        f4524r = 100;
        f4525s = XGPushManager.OPERATION_REQ_UNREGISTER;
        f4526t = R.AppCompatTheme_buttonStyle;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968642);
        this.f4527e = getIntent().getExtras().getLong("lChatRoomId");
        this.f4531i = new ArrayList();
        this.f4529g = false;
        this.f4530h = false;
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C06321(this));
        this.f4532j = (SimpleDraweeView) findViewById(2131558674);
        ((ImageButton) findViewById(2131558675)).setOnClickListener(new OnClickListener() {
            final /* synthetic */ GroupSettingsActivity f4505a;

            {
                this.f4505a = r1;
            }

            public final void onClick(View view) {
                GroupSettingsActivity.m3138a(this.f4505a);
            }
        });
        ((ImageButton) findViewById(2131558735)).setOnClickListener(new OnClickListener() {
            final /* synthetic */ GroupSettingsActivity f4507a;

            {
                this.f4507a = r1;
            }

            public final void onClick(View view) {
                GroupSettingsActivity.m3140b(this.f4507a);
            }
        });
        this.f4533k = (TextView) findViewById(2131558706);
        this.f4534l = (TextView) findViewById(2131558737);
        this.f4535m = (GridView) findViewById(2131558738);
        this.f4536n = new GroupMemberAdapter(this, this.f4531i, this.f4527e);
        this.f4535m.setAdapter(this.f4536n);
        this.f4535m.setOnItemClickListener(new OnItemClickListener() {
            final /* synthetic */ GroupSettingsActivity f4508a;

            {
                this.f4508a = r1;
            }

            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                Object obj = this.f4508a.f4531i.get(i);
                if (obj instanceof ChatUser) {
                    GroupSettingsActivity.m3139a(this.f4508a, ((ChatUser) obj).f5771f.longValue());
                } else if (!(obj instanceof String)) {
                } else {
                    if (((String) obj).equalsIgnoreCase("add_btn")) {
                        GroupSettingsActivity.m3143d(this.f4508a);
                    } else {
                        GroupSettingsActivity.m3145e(this.f4508a);
                    }
                }
            }
        });
        this.f4537o = (Switch) findViewById(2131558650);
        this.f4537o.setOnClickListener(new OnClickListener() {
            final /* synthetic */ GroupSettingsActivity f4509a;

            {
                this.f4509a = r1;
            }

            public final void onClick(View view) {
                GroupSettingsActivity.m3147f(this.f4509a);
            }
        });
        this.f4538p = (Switch) findViewById(2131558739);
        this.f4538p.setOnClickListener(new OnClickListener() {
            final /* synthetic */ GroupSettingsActivity f4510a;

            {
                this.f4510a = r1;
            }

            public final void onClick(View view) {
                this.f4510a.m3146f();
            }
        });
        this.f4539q = (Switch) findViewById(2131558740);
        this.f4539q.setOnClickListener(new OnClickListener() {
            final /* synthetic */ GroupSettingsActivity f4511a;

            {
                this.f4511a = r1;
            }

            public final void onClick(View view) {
                this.f4511a.m3146f();
            }
        });
        ((ImageButton) findViewById(2131558651)).setOnClickListener(new OnClickListener() {
            final /* synthetic */ GroupSettingsActivity f4512a;

            {
                this.f4512a = r1;
            }

            public final void onClick(View view) {
                new Builder(this.f4512a).setTitle(2131165514).setMessage(2131165253).setPositiveButton(2131165435, new C06343(this.f4512a)).setNegativeButton(2131165432, new C06332(this.f4512a)).show();
            }
        });
        ((Button) findViewById(2131558741)).setOnClickListener(new OnClickListener() {
            final /* synthetic */ GroupSettingsActivity f4514a;

            {
                this.f4514a = r1;
            }

            public final void onClick(View view) {
                new Builder(this.f4514a).setMessage(2131165257).setPositiveButton(2131165438, new C06365(this.f4514a)).setNegativeButton(2131165432, new C06354(this.f4514a)).show();
            }
        });
    }

    protected void onResume() {
        super.onResume();
        m3144e();
        NetworkUtil.m4073a();
        NetworkUtil.m4162e(this.f4527e);
    }

    private void m3144e() {
        if (!DBManager.m3631a().m3632b()) {
            this.f4529g = false;
            this.f4530h = false;
            this.f4528f = DBManager.m3631a().f5565e.m3590a(this.f4527e, 2);
            if (!DBManager.m3631a().m3632b()) {
                boolean booleanValue = this.f4528f.f5719F.booleanValue();
                Object format = String.format(getResources().getString(2131165297), new Object[]{this.f4528f.f5729P});
                if (booleanValue) {
                    setTitle(format);
                } else {
                    String str = format + "mute";
                    CharSequence spannableStringBuilder = new SpannableStringBuilder(str);
                    spannableStringBuilder.setSpan(new ImageSpan(this, BitmapFactory.decodeResource(getResources(), 2130903097), 0), str.length() - 4, str.length(), 33);
                    setTitle(spannableStringBuilder);
                }
            }
            if (this.f4528f.f5717D == null) {
                this.f4529g = false;
            } else {
                this.f4529g = this.f4528f.f5717D.booleanValue();
            }
            Collection a = DBManager.m3631a().f5569i.m3610a(this.f4527e);
            this.f4531i.clear();
            this.f4531i.addAll(a);
            if (SharedPreferencesManager.m4308b() == this.f4528f.f5748i.longValue() || this.f4528f.f5733T.intValue() == 0) {
                this.f4531i.add("add_btn");
            }
            if (SharedPreferencesManager.m4308b() == this.f4528f.f5748i.longValue()) {
                this.f4531i.add("reduce_btn");
            }
            this.f4536n.f3448a = this.f4530h;
            int ceil = (int) Math.ceil(((double) this.f4531i.size()) / 5.0d);
            this.f4535m.getLayoutParams().height = (int) (((float) ceil) * Utility.m4467a((Context) this, 80.0f));
            this.f4536n.f3449b = this.f4528f.f5748i.longValue();
            this.f4536n.notifyDataSetChanged();
            if (StringUtils.m4462a(this.f4528f.f5755p)) {
                this.f4533k.setText(2131165290);
            } else {
                this.f4533k.setText(this.f4528f.f5755p);
            }
            this.f4532j.setImageURI(Uri.parse(this.f4528f.f5760u));
            this.f4534l.setText(this.f4528f.f5729P + "/" + this.f4528f.f5731R);
            if (SharedPreferencesManager.m4308b() == this.f4528f.f5748i.longValue()) {
                this.f4538p.setEnabled(true);
            } else {
                this.f4538p.setEnabled(false);
            }
            if (this.f4528f.f5733T.intValue() == 1) {
                this.f4538p.setChecked(true);
            } else {
                this.f4538p.setChecked(false);
            }
            if (SharedPreferencesManager.m4308b() == this.f4528f.f5748i.longValue()) {
                this.f4539q.setEnabled(true);
            } else {
                this.f4539q.setEnabled(false);
            }
            if (this.f4528f.f5732S.intValue() == 1) {
                this.f4539q.setChecked(true);
            } else {
                this.f4539q.setChecked(false);
            }
            if (this.f4528f.f5719F.booleanValue()) {
                this.f4537o.setChecked(true);
            } else {
                this.f4537o.setChecked(false);
            }
        }
    }

    private void m3146f() {
        int i = 1;
        if (this.f4529g) {
            this.b = new LoadingDialog(this);
            this.b.show();
            if (SharedPreferencesManager.m4308b() == this.f4528f.f5748i.longValue()) {
                int i2;
                if (this.f4539q.isChecked()) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                if (!this.f4538p.isChecked()) {
                    i = 0;
                }
                NetworkUtil.m4073a();
                NetworkUtil.m4114a(this.f4528f.f5755p, this.f4527e, i2, i);
                return;
            }
            return;
        }
        m2732a(2130903246, 2131165291, 1);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (iArr[0] != 0) {
            new Builder(this).setTitle(2131165514).setMessage(2131165431).setPositiveButton(2131165472, new C06409(this)).setNegativeButton(2131165432, new C06398(this)).show();
        } else if (i == 1) {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            this.f4540u = Uri.fromFile(new File(getExternalCacheDir(), "tempOriginalImage.jpg"));
            intent.putExtra("output", this.f4540u);
            startActivityForResult(intent, f4526t);
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if ((i == f4524r || i == f4526t) && i2 == -1) {
            if (i == f4524r) {
                Uri data = intent.getData();
                this.f4541v = Uri.fromFile(new File(getExternalCacheDir(), "tempImage.jpg"));
                m3137a(data);
                return;
            }
            this.f4541v = Uri.fromFile(new File(getExternalCacheDir(), "tempImage.jpg"));
            m3137a(this.f4540u);
        } else if (i == f4524r && i2 == -1 && intent != null) {
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(getContentResolver().openInputStream(this.f4541v));
                this.b = new LoadingDialog(this);
                this.b.show();
                byte[] a = ImageUtility.m4071a(decodeStream);
                NetworkUtil.m4073a();
                NetworkUtil.m4142b(a, this.f4527e);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void m3137a(Uri uri) {
        Intent intent = new Intent("com.android.camera.action.CROP");
        intent.setDataAndType(uri, "image/*");
        intent.putExtra("crop", "true");
        intent.putExtra("aspectX", 1);
        intent.putExtra("aspectY", 1);
        intent.putExtra("outputX", 640);
        intent.putExtra("outputY", 640);
        intent.putExtra("scale", true);
        intent.putExtra("return-data", false);
        intent.putExtra("output", this.f4541v);
        intent.putExtra("outputFormat", CompressFormat.JPEG.toString());
        intent.putExtra("noFaceDetection", true);
        startActivityForResult(intent, f4525s);
    }

    protected final void m3156a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_REFRESH_IMAGE")) {
            m3144e();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_SETTING")) {
            m3144e();
        } else if (str.equalsIgnoreCase("NOTIFY_REMOVE_CHATROOM_USER_SUCCESS")) {
            this.b.dismiss();
            this.f4530h = false;
            m3144e();
        } else if (str.equalsIgnoreCase("NOTIFY_REMOVE_CHATROOM_USER_FAULT")) {
            r0 = ((Integer) list.get(0)).intValue();
            this.b.dismiss();
            new Builder(this).setTitle(2131165514).setMessage(r0).setPositiveButton(2131165438, new DialogInterface.OnClickListener() {
                final /* synthetic */ GroupSettingsActivity f4503a;

                {
                    this.f4503a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                }
            }).show();
        } else if (str.equalsIgnoreCase("NOTIFY_LEAVE_CHATROOM_SUCCESS")) {
            this.b.dismiss();
            BaseApplication.f5509b.m3212d();
            Intent intent = new Intent(this, MainActivity.class);
            intent.setFlags(67108864);
            intent.putExtra("returnTo", -1);
            startActivity(intent);
            overridePendingTransition(2131034127, 2131034127);
        } else if (str.equalsIgnoreCase("NOTIFY_LEAVE_CHATROOM_FAULT")) {
            r0 = ((Integer) list.get(0)).intValue();
            this.b.dismiss();
            new Builder(this).setTitle(2131165514).setMessage(r0).setPositiveButton(2131165438, new DialogInterface.OnClickListener() {
                final /* synthetic */ GroupSettingsActivity f4504a;

                {
                    this.f4504a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                }
            }).show();
        } else if (str.equalsIgnoreCase("NOTIFY_SET_CHATROOM_SUCCESS")) {
            this.b.dismiss();
        } else if (str.equalsIgnoreCase("NOTIFY_SET_CHATROOM_FAULT")) {
            r0 = ((Integer) list.get(0)).intValue();
            this.b.dismiss();
            new Builder(this).setTitle(2131165514).setMessage(r0).setPositiveButton(2131165438, new DialogInterface.OnClickListener() {
                final /* synthetic */ GroupSettingsActivity f4506a;

                {
                    this.f4506a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                }
            }).show();
        } else if (str.equalsIgnoreCase("NOTIFY_CHANGE_ROOM_SOUND_SUCCESS")) {
            m3144e();
        } else if (str.equalsIgnoreCase("NOTIFY_CHANGE_ROOM_SOUND_FAULT")) {
            m3144e();
        } else if (str.equalsIgnoreCase("NOTIFY_UPLOAD_GROUP_PHOTO_SUCCESS")) {
            this.b.dismiss();
            m3144e();
        } else if (str.equalsIgnoreCase("NOTIFY_UPLOAD_GROUP_PHOTO_FAULT")) {
            m2732a(2130903246, 2131165307, 1);
        }
    }

    static /* synthetic */ void m3138a(GroupSettingsActivity groupSettingsActivity) {
        if (groupSettingsActivity.f4529g) {
            new Builder(groupSettingsActivity).setItems(2131492869, new C06387(groupSettingsActivity)).show();
        } else {
            groupSettingsActivity.m2732a(2130903246, 2131165291, 1);
        }
    }

    static /* synthetic */ void m3140b(GroupSettingsActivity groupSettingsActivity) {
        if (groupSettingsActivity.f4529g) {
            Intent intent = new Intent(groupSettingsActivity, EditGroupNameActivity.class);
            intent.putExtra("lChatRoomId", groupSettingsActivity.f4527e);
            groupSettingsActivity.startActivity(intent);
            return;
        }
        groupSettingsActivity.m2732a(2130903246, 2131165291, 1);
    }

    static /* synthetic */ void m3139a(GroupSettingsActivity groupSettingsActivity, long j) {
        if (j != SharedPreferencesManager.m4308b()) {
            Intent intent = new Intent(groupSettingsActivity, FriendInfoActivity.class);
            intent.putExtra("friendUuid", j);
            groupSettingsActivity.startActivity(intent);
        }
    }

    static /* synthetic */ void m3143d(GroupSettingsActivity groupSettingsActivity) {
        if (groupSettingsActivity.f4529g) {
            Intent intent = new Intent(groupSettingsActivity, NewGroupActivity.class);
            intent.putExtra("fromSingle", false);
            intent.putExtra("lChatRoomId", groupSettingsActivity.f4527e);
            groupSettingsActivity.startActivity(intent);
            return;
        }
        groupSettingsActivity.m2732a(2130903246, 2131165291, 1);
    }

    static /* synthetic */ void m3147f(GroupSettingsActivity groupSettingsActivity) {
        NetworkUtil.m4073a();
        NetworkUtil.m4091a(groupSettingsActivity.f4527e, CHAT_TYPE.CHAT_TYPE_GROUP, groupSettingsActivity.f4537o.isChecked(), false);
    }

    static /* synthetic */ void m3153l(GroupSettingsActivity groupSettingsActivity) {
        if (SharedPreferencesManager.m4308b() == groupSettingsActivity.f4528f.f5748i.longValue()) {
            ChatUserDBManager chatUserDBManager = DBManager.m3631a().f5569i;
            long j = groupSettingsActivity.f4527e;
            g a = g.a(chatUserDBManager.f5528a.f6427B);
            a.a(Properties.f6194c.a(Long.valueOf(j)), new i[0]);
            if (a.b() > 1) {
                new Builder(groupSettingsActivity).setTitle(2131165514).setMessage(2131165254).setPositiveButton(2131165438, new C06376(groupSettingsActivity)).show();
                return;
            }
            groupSettingsActivity.b = new LoadingDialog(groupSettingsActivity);
            groupSettingsActivity.b.show();
            if (groupSettingsActivity.f4529g) {
                NetworkUtil.m4073a();
                NetworkUtil.m4157d(groupSettingsActivity.f4527e);
                return;
            }
            DBManager.m3631a().f5565e.m3606c(groupSettingsActivity.f4527e);
            groupSettingsActivity.b.dismiss();
            BaseApplication.f5509b.m3212d();
            Intent intent = new Intent(groupSettingsActivity, MainActivity.class);
            intent.setFlags(67108864);
            intent.putExtra("returnTo", -1);
            groupSettingsActivity.startActivity(intent);
            groupSettingsActivity.overridePendingTransition(2131034127, 2131034127);
            return;
        }
        groupSettingsActivity.b = new LoadingDialog(groupSettingsActivity);
        groupSettingsActivity.b.show();
        if (groupSettingsActivity.f4529g) {
            NetworkUtil.m4073a();
            NetworkUtil.m4157d(groupSettingsActivity.f4527e);
            return;
        }
        DBManager.m3631a().f5565e.m3606c(groupSettingsActivity.f4527e);
        groupSettingsActivity.b.dismiss();
        BaseApplication.f5509b.m3212d();
        intent = new Intent(groupSettingsActivity, MainActivity.class);
        intent.setFlags(67108864);
        intent.putExtra("returnTo", -1);
        groupSettingsActivity.startActivity(intent);
        groupSettingsActivity.overridePendingTransition(2131034127, 2131034127);
    }
}
