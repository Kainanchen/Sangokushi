package com.illuminate.texaspoker.activity;

import a.does.not.Exists2;
import android.app.Activity;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.EditText;
import android.widget.ImageButton;
import com.ali.fixHelper;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.p036h.CallbackManagerImpl.CallbackManagerImpl;
import com.facebook.p036h.FacebookDialogBase;
import com.facebook.p051j.p053b.AppInviteContent.AppInviteContent;
import com.facebook.p051j.p054c.AppInviteDialog.AppInviteDialog;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.view.LoadingDialog;
import com.illuminate.texaspoker.view.ShareSocialDialog;
import com.texaspoker.moment.TexasPokerHttpUser.UserFriendInfoNet;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AddFriendActivity extends BaseToolBarActivity {
    private static String f3527d;
    private View f3528e;
    private EditText f3529f;
    private ImageButton f3530g;
    private ImageButton f3531h;
    private ImageButton f3532i;
    private ImageButton f3533j;
    private ImageButton f3534k;
    private CallbackManager f3535l;

    /* renamed from: com.illuminate.texaspoker.activity.AddFriendActivity.1 */
    class C03371 implements OnClickListener {
        final /* synthetic */ AddFriendActivity f3499a;

        C03371(AddFriendActivity addFriendActivity) {
            this.f3499a = addFriendActivity;
        }

        public final void onClick(View view) {
            this.f3499a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.AddFriendActivity.2 */
    class C03442 implements OnClickListener {
        final /* synthetic */ AddFriendActivity f3512a;

        /* renamed from: com.illuminate.texaspoker.activity.AddFriendActivity.2.1 */
        class C03381 implements OnClickListener {
            final /* synthetic */ ShareSocialDialog f3500a;
            final /* synthetic */ C03442 f3501b;

            static {
                fixHelper.fixfunc(new int[]{924, 925});
                if (VERSION.SDK_INT <= 0) {
                    Exists2.class.toString();
                }
            }

            native C03381(C03442 c03442, ShareSocialDialog shareSocialDialog);

            public final native void onClick(View view);
        }

        /* renamed from: com.illuminate.texaspoker.activity.AddFriendActivity.2.2 */
        class C03392 implements OnClickListener {
            final /* synthetic */ ShareSocialDialog f3502a;
            final /* synthetic */ C03442 f3503b;

            static {
                fixHelper.fixfunc(new int[]{901, 902});
                if (VERSION.SDK_INT <= 0) {
                    Exists2.class.toString();
                }
            }

            native C03392(C03442 c03442, ShareSocialDialog shareSocialDialog);

            public final native void onClick(View view);
        }

        /* renamed from: com.illuminate.texaspoker.activity.AddFriendActivity.2.3 */
        class C03403 implements OnClickListener {
            final /* synthetic */ ShareSocialDialog f3504a;
            final /* synthetic */ C03442 f3505b;

            static {
                fixHelper.fixfunc(new int[]{879, 880});
                if (VERSION.SDK_INT <= 0) {
                    Exists2.class.toString();
                }
            }

            native C03403(C03442 c03442, ShareSocialDialog shareSocialDialog);

            public final native void onClick(View view);
        }

        /* renamed from: com.illuminate.texaspoker.activity.AddFriendActivity.2.4 */
        class C03414 implements OnClickListener {
            final /* synthetic */ ShareSocialDialog f3506a;
            final /* synthetic */ C03442 f3507b;

            static {
                fixHelper.fixfunc(new int[]{1239, 1240});
                if (VERSION.SDK_INT <= 0) {
                    Exists2.class.toString();
                }
            }

            native C03414(C03442 c03442, ShareSocialDialog shareSocialDialog);

            public final native void onClick(View view);
        }

        /* renamed from: com.illuminate.texaspoker.activity.AddFriendActivity.2.5 */
        class C03425 implements OnClickListener {
            final /* synthetic */ ShareSocialDialog f3508a;
            final /* synthetic */ C03442 f3509b;

            static {
                fixHelper.fixfunc(new int[]{1214, 1215});
                if (VERSION.SDK_INT <= 0) {
                    Exists2.class.toString();
                }
            }

            native C03425(C03442 c03442, ShareSocialDialog shareSocialDialog);

            public final native void onClick(View view);
        }

        /* renamed from: com.illuminate.texaspoker.activity.AddFriendActivity.2.6 */
        class C03436 implements OnClickListener {
            final /* synthetic */ ShareSocialDialog f3510a;
            final /* synthetic */ C03442 f3511b;

            static {
                fixHelper.fixfunc(new int[]{1131, 1132});
                if (VERSION.SDK_INT <= 0) {
                    Exists2.class.toString();
                }
            }

            native C03436(C03442 c03442, ShareSocialDialog shareSocialDialog);

            public final native void onClick(View view);
        }

        C03442(AddFriendActivity addFriendActivity) {
            this.f3512a = addFriendActivity;
        }

        public final void onClick(View view) {
            ShareSocialDialog shareSocialDialog = new ShareSocialDialog(this.f3512a);
            shareSocialDialog.f7078a = new C03381(this, shareSocialDialog);
            shareSocialDialog.f7079b = new C03392(this, shareSocialDialog);
            shareSocialDialog.f7080c = new C03403(this, shareSocialDialog);
            shareSocialDialog.f7081d = new C03414(this, shareSocialDialog);
            shareSocialDialog.f7082e = new C03425(this, shareSocialDialog);
            shareSocialDialog.f7083f = new C03436(this, shareSocialDialog);
            shareSocialDialog.show();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.AddFriendActivity.3 */
    class C03453 implements OnClickListener {
        final /* synthetic */ AddFriendActivity f3513a;

        C03453(AddFriendActivity addFriendActivity) {
            this.f3513a = addFriendActivity;
        }

        public final void onClick(View view) {
            this.f3513a.startActivity(new Intent(this.f3513a, FacebookResultActivity.class));
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.AddFriendActivity.4 */
    class C03464 implements OnClickListener {
        final /* synthetic */ AddFriendActivity f3514a;

        C03464(AddFriendActivity addFriendActivity) {
            this.f3514a = addFriendActivity;
        }

        public final void onClick(View view) {
            AddFriendActivity.m2742e(this.f3514a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.AddFriendActivity.5 */
    class C03475 implements DialogInterface.OnClickListener {
        final /* synthetic */ AddFriendActivity f3515a;

        C03475(AddFriendActivity addFriendActivity) {
            this.f3515a = addFriendActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.AddFriendActivity.6 */
    class C03496 implements FacebookCallback<AppInviteDialog> {
        final /* synthetic */ AddFriendActivity f3517a;

        /* renamed from: com.illuminate.texaspoker.activity.AddFriendActivity.6.1 */
        class C03481 implements DialogInterface.OnClickListener {
            final /* synthetic */ C03496 f3516a;

            C03481(C03496 c03496) {
                this.f3516a = c03496;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        C03496(AddFriendActivity addFriendActivity) {
            this.f3517a = addFriendActivity;
        }

        public final /* bridge */ /* synthetic */ void m2726a() {
        }

        public final void m2727a(FacebookException facebookException) {
            facebookException.printStackTrace();
            Log.e(AddFriendActivity.f3527d, facebookException.getMessage(), facebookException);
            new Builder(this.f3517a).setTitle(2131165514).setMessage(2131165513).setPositiveButton(2131165438, new C03481(this)).show();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.AddFriendActivity.7 */
    class C03507 implements DialogInterface.OnClickListener {
        final /* synthetic */ AddFriendActivity f3518a;

        C03507(AddFriendActivity addFriendActivity) {
            this.f3518a = addFriendActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.AddFriendActivity.8 */
    class C03518 implements DialogInterface.OnClickListener {
        final /* synthetic */ AddFriendActivity f3519a;

        C03518(AddFriendActivity addFriendActivity) {
            this.f3519a = addFriendActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.applications.InstalledAppDetails"));
            intent.setData(Uri.parse("package:" + this.f3519a.getPackageName()));
            this.f3519a.startActivity(intent);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.AddFriendActivity.9 */
    class C03529 implements OnGlobalLayoutListener {
        final /* synthetic */ AddFriendActivity f3520a;

        C03529(AddFriendActivity addFriendActivity) {
            this.f3520a = addFriendActivity;
        }

        public final void onGlobalLayout() {
            this.f3520a.m2735c();
        }
    }

    static /* synthetic */ void m2741d(AddFriendActivity addFriendActivity) {
        if (ContextCompat.checkSelfPermission(addFriendActivity, "android.permission.READ_CONTACTS") != 0) {
            ActivityCompat.requestPermissions(addFriendActivity, new String[]{"android.permission.READ_CONTACTS"}, 1);
            return;
        }
        addFriendActivity.m2740d();
    }

    static {
        f3527d = "AddFriendActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968604);
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C03371(this));
        this.f3528e = findViewById(2131558511);
        this.f3528e.getViewTreeObserver().addOnGlobalLayoutListener(new C03529(this));
        this.f3528e.setOnClickListener(new OnClickListener() {
            final /* synthetic */ AddFriendActivity f3494a;

            {
                this.f3494a = r1;
            }

            public final void onClick(View view) {
                this.f3494a.m2734b();
            }
        });
        this.f3529f = (EditText) findViewById(2131558513);
        this.f3529f.addTextChangedListener(new TextWatcher() {
            final /* synthetic */ AddFriendActivity f3495a;

            {
                this.f3495a = r1;
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                if (StringUtils.m4462a(this.f3495a.f3529f.getText().toString().trim())) {
                    this.f3495a.f3530g.setVisibility(4);
                } else {
                    this.f3495a.f3530g.setVisibility(0);
                }
            }
        });
        this.f3529f.setOnKeyListener(new OnKeyListener() {
            final /* synthetic */ AddFriendActivity f3496a;

            {
                this.f3496a = r1;
            }

            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (i == 66 && keyEvent.getAction() == 0) {
                    AddFriendActivity.m2739c(this.f3496a);
                }
                return false;
            }
        });
        this.f3531h = (ImageButton) findViewById(2131558514);
        this.f3531h.setOnClickListener(new OnClickListener() {
            final /* synthetic */ AddFriendActivity f3497a;

            {
                this.f3497a = r1;
            }

            public final void onClick(View view) {
                AddFriendActivity.m2741d(this.f3497a);
            }
        });
        this.f3530g = (ImageButton) findViewById(2131558512);
        this.f3530g.setOnClickListener(new OnClickListener() {
            final /* synthetic */ AddFriendActivity f3498a;

            {
                this.f3498a = r1;
            }

            public final void onClick(View view) {
                AddFriendActivity.m2739c(this.f3498a);
            }
        });
        this.f3532i = (ImageButton) findViewById(2131558516);
        this.f3532i.setOnClickListener(new C03442(this));
        this.f3533j = (ImageButton) findViewById(2131558518);
        this.f3533j.setOnClickListener(new C03453(this));
        this.f3534k = (ImageButton) findViewById(2131558520);
        this.f3534k.setOnClickListener(new C03464(this));
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == CallbackManagerImpl.Login.m1610a() && i2 == -1) {
            this.f3535l.m1446a(i, i2, intent);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 1) {
            return;
        }
        if (iArr[0] == 0) {
            m2740d();
        } else {
            new Builder(this).setTitle(2131165473).setMessage(2131165476).setPositiveButton(2131165472, new C03518(this)).setNegativeButton(2131165432, new C03507(this)).show();
        }
    }

    private void m2740d() {
        startActivity(new Intent(this, PhoneBookResultActivity.class));
        overridePendingTransition(2131034126, 2131034126);
    }

    protected final void m2743a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_SEARCH_RESULT")) {
            List<UserFriendInfoNet> list2 = (List) list.get(0);
            this.b.dismiss();
            if (list2.size() > 0) {
                Serializable arrayList = new ArrayList();
                for (UserFriendInfoNet userFriendInfoNet : list2) {
                    if (userFriendInfoNet.getStUserBaseInfo().getUuid() != SharedPreferencesManager.m4308b()) {
                        arrayList.add(userFriendInfoNet);
                    }
                }
                Intent intent = new Intent(this, FriendSearchResultActivity.class);
                intent.putExtra("fromType", DBManager.f5538A);
                intent.putExtra("search_result", arrayList);
                startActivity(intent);
                return;
            }
            new Builder(this).setTitle(2131165560).setMessage(2131165559).setPositiveButton(2131165438, new C03475(this)).show();
        }
    }

    static /* synthetic */ void m2739c(AddFriendActivity addFriendActivity) {
        String trim = addFriendActivity.f3529f.getText().toString().trim();
        if (!StringUtils.m4462a((CharSequence) trim)) {
            addFriendActivity.m2734b();
            addFriendActivity.b = new LoadingDialog(addFriendActivity);
            addFriendActivity.b.show();
            NetworkUtil.m4073a();
            NetworkUtil.m4160d(trim);
        }
    }

    static /* synthetic */ void m2742e(AddFriendActivity addFriendActivity) {
        if (com.facebook.p051j.p054c.AppInviteDialog.m2536d()) {
            AppInviteContent appInviteContent = new AppInviteContent();
            appInviteContent.f2566a = "https://fb.me/1605916056367263";
            appInviteContent.f2567b = "https://fbcdn-profile-a.akamaihd.net/hprofile-ak-xfp1/v/t1.0-1/p160x160/12985468_101296513608770_5516938832300084158_n.jpg?oh=f69397a9df0ce67eca3a4aff86911260&oe=57F22F6B&__gda__=1479825152_9ab87e68ca5211e3b5023e90cf2934ac";
            com.facebook.p051j.p053b.AppInviteContent appInviteContent2 = new com.facebook.p051j.p053b.AppInviteContent((byte) 0);
            FacebookDialogBase appInviteDialog = new com.facebook.p051j.p054c.AppInviteDialog(addFriendActivity);
            addFriendActivity.f3535l = new com.facebook.p036h.CallbackManagerImpl();
            CallbackManager callbackManager = addFriendActivity.f3535l;
            FacebookCallback c03496 = new C03496(addFriendActivity);
            if (callbackManager instanceof com.facebook.p036h.CallbackManagerImpl) {
                appInviteDialog.m1630a((com.facebook.p036h.CallbackManagerImpl) callbackManager, c03496);
                com.facebook.p051j.p054c.AppInviteDialog.m2534a((Activity) addFriendActivity, appInviteContent2);
                return;
            }
            throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        }
        addFriendActivity.m2732a(2130903246, 2131165466, 1);
    }
}
