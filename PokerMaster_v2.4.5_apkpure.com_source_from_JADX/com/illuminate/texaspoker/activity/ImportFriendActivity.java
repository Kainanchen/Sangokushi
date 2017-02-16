package com.illuminate.texaspoker.activity;

import a.does.not.Exists2;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import com.ali.fixHelper;
import com.facebook.p051j.p053b.ShareContent.ShareContent;
import com.facebook.p051j.p053b.ShareLinkContent;
import com.facebook.p051j.p054c.ShareDialog;
import com.illuminate.texaspoker.utils.ShareUtil;
import com.illuminate.texaspoker.view.ShareSocialDialog;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage;
import java.util.List;
import net.sqlcipher.database.SQLiteDatabase;

public class ImportFriendActivity extends BaseMainActivity {
    private static String f4567c;

    /* renamed from: com.illuminate.texaspoker.activity.ImportFriendActivity.10 */
    class AnonymousClass10 implements OnClickListener {
        final /* synthetic */ ShareSocialDialog f4550a;
        final /* synthetic */ ImportFriendActivity f4551b;

        AnonymousClass10(ImportFriendActivity importFriendActivity, ShareSocialDialog shareSocialDialog) {
            this.f4551b = importFriendActivity;
            this.f4550a = shareSocialDialog;
        }

        public final void onClick(View view) {
            String string = this.f4551b.getResources().getString(2131165494);
            String str = this.f4551b.getResources().getString(2131165230) + " - " + this.f4551b.getResources().getString(2131165504);
            if (ShareDialog.m2557a(ShareLinkContent.class)) {
                ShareContent shareLinkContent = new ShareLinkContent.ShareLinkContent();
                shareLinkContent.f2584g = str;
                shareLinkContent.f2583f = string;
                shareLinkContent.f2576a = Uri.parse("http://page.pokermate.net/download");
                ShareLinkContent.ShareLinkContent shareLinkContent2 = (ShareLinkContent.ShareLinkContent) shareLinkContent;
                shareLinkContent2.f2585h = Uri.parse("http://upyun.pokermate.net/web/images/ic_launcher.png");
                new ShareDialog(this.f4551b).m2567a(shareLinkContent2.m2500a(), ShareDialog.ShareDialog.AUTOMATIC);
            } else {
                this.f4551b.m3014a(2131165466);
            }
            this.f4550a.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ImportFriendActivity.11 */
    class AnonymousClass11 implements OnClickListener {
        final /* synthetic */ ShareSocialDialog f4552a;
        final /* synthetic */ ImportFriendActivity f4553b;

        AnonymousClass11(ImportFriendActivity importFriendActivity, ShareSocialDialog shareSocialDialog) {
            this.f4553b = importFriendActivity;
            this.f4552a = shareSocialDialog;
        }

        public final void onClick(View view) {
            ShareUtil.m4248a().m4255a(this.f4553b, this.f4553b.getResources().getString(2131165494) + " http://page.pokermate.net/download");
            this.f4552a.dismiss();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ImportFriendActivity.1 */
    class C06421 implements DialogInterface.OnClickListener {
        final /* synthetic */ ImportFriendActivity f4554a;

        static {
            fixHelper.fixfunc(new int[]{1062, 1063});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C06421(ImportFriendActivity importFriendActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.activity.ImportFriendActivity.2 */
    class C06432 implements OnClickListener {
        final /* synthetic */ ShareSocialDialog f4555a;
        final /* synthetic */ ImportFriendActivity f4556b;

        static {
            fixHelper.fixfunc(new int[]{954, 955});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C06432(ImportFriendActivity importFriendActivity, ShareSocialDialog shareSocialDialog);

        public final native void onClick(View view);
    }

    /* renamed from: com.illuminate.texaspoker.activity.ImportFriendActivity.3 */
    class C06443 implements OnClickListener {
        final /* synthetic */ ShareSocialDialog f4557a;
        final /* synthetic */ ImportFriendActivity f4558b;

        static {
            fixHelper.fixfunc(new int[]{1141, 1142});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C06443(ImportFriendActivity importFriendActivity, ShareSocialDialog shareSocialDialog);

        public final native void onClick(View view);
    }

    /* renamed from: com.illuminate.texaspoker.activity.ImportFriendActivity.4 */
    class C06454 implements DialogInterface.OnClickListener {
        final /* synthetic */ ImportFriendActivity f4559a;

        static {
            fixHelper.fixfunc(new int[]{1129, 1130});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C06454(ImportFriendActivity importFriendActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.activity.ImportFriendActivity.5 */
    class C06465 implements OnClickListener {
        final /* synthetic */ ImportFriendActivity f4560a;

        static {
            fixHelper.fixfunc(new int[]{1103, 1104});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C06465(ImportFriendActivity importFriendActivity);

        public final native void onClick(View view);
    }

    /* renamed from: com.illuminate.texaspoker.activity.ImportFriendActivity.6 */
    class C06476 implements OnClickListener {
        final /* synthetic */ ImportFriendActivity f4561a;

        static {
            fixHelper.fixfunc(new int[]{1234, 1235});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C06476(ImportFriendActivity importFriendActivity);

        public final native void onClick(View view);
    }

    /* renamed from: com.illuminate.texaspoker.activity.ImportFriendActivity.7 */
    class C06487 implements OnClickListener {
        final /* synthetic */ ImportFriendActivity f4562a;

        static {
            fixHelper.fixfunc(new int[]{1203, 1204});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C06487(ImportFriendActivity importFriendActivity);

        public final native void onClick(View view);
    }

    /* renamed from: com.illuminate.texaspoker.activity.ImportFriendActivity.8 */
    class C06498 implements OnClickListener {
        final /* synthetic */ ShareSocialDialog f4563a;
        final /* synthetic */ ImportFriendActivity f4564b;

        static {
            fixHelper.fixfunc(new int[]{1403, 1404});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C06498(ImportFriendActivity importFriendActivity, ShareSocialDialog shareSocialDialog);

        public final native void onClick(View view);
    }

    /* renamed from: com.illuminate.texaspoker.activity.ImportFriendActivity.9 */
    class C06509 implements OnClickListener {
        final /* synthetic */ ShareSocialDialog f4565a;
        final /* synthetic */ ImportFriendActivity f4566b;

        static {
            fixHelper.fixfunc(new int[]{1474, 1475});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C06509(ImportFriendActivity importFriendActivity, ShareSocialDialog shareSocialDialog);

        public final native void onClick(View view);
    }

    static /* synthetic */ void m3160a(ImportFriendActivity importFriendActivity) {
        if (ContextCompat.checkSelfPermission(importFriendActivity, "android.permission.READ_CONTACTS") != 0) {
            ActivityCompat.requestPermissions(importFriendActivity, new String[]{"android.permission.READ_CONTACTS"}, 1);
            return;
        }
        importFriendActivity.m3162c();
    }

    static {
        f4567c = "ImportFriendActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968644);
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        if (toolbar != null) {
            toolbar.setTitleTextAppearance(this, 2131296567);
        }
        Button button = (Button) findViewById(2131558746);
        if (button != null) {
            button.setOnClickListener(new C06465(this));
        }
        ImageButton imageButton = (ImageButton) findViewById(2131558518);
        if (imageButton != null) {
            imageButton.setOnClickListener(new C06476(this));
        }
        imageButton = (ImageButton) findViewById(2131558749);
        if (imageButton != null) {
            imageButton.setOnClickListener(new C06487(this));
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131689490, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131559442) {
            return super.onOptionsItemSelected(menuItem);
        }
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(67108864);
        intent.setFlags(WXMediaMessage.THUMB_LENGTH_LIMIT);
        intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        intent.putExtra("returnTo", -1);
        startActivity(intent);
        finish();
        overridePendingTransition(0, 0);
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (this.b != null && this.b.isShowing()) {
                return true;
            }
            Intent intent = new Intent();
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            startActivity(intent);
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 1) {
            return;
        }
        if (iArr[0] == 0) {
            m3162c();
        } else {
            new Builder(this).setTitle(2131165473).setMessage(2131165476).setPositiveButton(2131165472, new C06454(this)).setNegativeButton(2131165432, new C06421(this)).show();
        }
    }

    private void m3162c() {
        startActivity(new Intent(this, PhoneBookResultActivity.class));
        overridePendingTransition(2131034126, 2131034126);
    }

    protected final void m3164a(String str, List<Object> list) {
    }

    static /* synthetic */ void m3161b(ImportFriendActivity importFriendActivity) {
        importFriendActivity.startActivity(new Intent(importFriendActivity, FacebookResultActivity.class));
        importFriendActivity.overridePendingTransition(2131034126, 2131034126);
    }

    static /* synthetic */ void m3163c(ImportFriendActivity importFriendActivity) {
        ShareSocialDialog shareSocialDialog = new ShareSocialDialog(importFriendActivity);
        shareSocialDialog.f7078a = new C06498(importFriendActivity, shareSocialDialog);
        shareSocialDialog.f7079b = new C06509(importFriendActivity, shareSocialDialog);
        shareSocialDialog.f7080c = new AnonymousClass10(importFriendActivity, shareSocialDialog);
        shareSocialDialog.f7081d = new AnonymousClass11(importFriendActivity, shareSocialDialog);
        shareSocialDialog.f7082e = new C06432(importFriendActivity, shareSocialDialog);
        shareSocialDialog.f7083f = new C06443(importFriendActivity, shareSocialDialog);
        shareSocialDialog.show();
    }
}
