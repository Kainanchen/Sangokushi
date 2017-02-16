package com.illuminate.texaspoker.activity;

import a.does.not.Exists2;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.ali.fixHelper;
import com.facebook.drawee.view.SimpleDraweeView;
import com.illuminate.texaspoker.R.R;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.utils.ImageUtility;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.view.LoadingDialog;
import com.tencent.android.tpush.XGPushManager;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class CompleteActivity extends BaseMainActivity {
    private static String f4220c;
    private static int f4221h;
    private static int f4222i;
    private static int f4223j;
    private Menu f4224d;
    private int f4225e;
    private Uri f4226f;
    private Uri f4227g;
    private ImageView f4228k;
    private SimpleDraweeView f4229l;
    private ImageView f4230m;
    private EditText f4231n;
    private ImageButton f4232o;
    private ImageButton f4233p;
    private ImageView f4234q;
    private TextView f4235r;
    private ImageView f4236s;
    private TextView f4237t;

    /* renamed from: com.illuminate.texaspoker.activity.CompleteActivity.1 */
    class C05251 implements OnClickListener {
        final /* synthetic */ CompleteActivity f4205a;

        C05251(CompleteActivity completeActivity) {
            this.f4205a = completeActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.CompleteActivity.2 */
    class C05262 implements OnClickListener {
        final /* synthetic */ CompleteActivity f4206a;

        static {
            fixHelper.fixfunc(new int[]{528, 529});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C05262(CompleteActivity completeActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.activity.CompleteActivity.3 */
    class C05273 implements OnClickListener {
        final /* synthetic */ CompleteActivity f4207a;

        static {
            fixHelper.fixfunc(new int[]{648, 649});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C05273(CompleteActivity completeActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.activity.CompleteActivity.4 */
    class C05284 implements OnClickListener {
        final /* synthetic */ CompleteActivity f4208a;

        static {
            fixHelper.fixfunc(new int[]{707, 708});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C05284(CompleteActivity completeActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.activity.CompleteActivity.5 */
    class C05295 implements View.OnClickListener {
        final /* synthetic */ CompleteActivity f4209a;

        static {
            fixHelper.fixfunc(new int[]{875, 876});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C05295(CompleteActivity completeActivity);

        public final native void onClick(View view);
    }

    /* renamed from: com.illuminate.texaspoker.activity.CompleteActivity.6 */
    class C05306 implements OnGlobalLayoutListener {
        final /* synthetic */ CompleteActivity f4210a;

        static {
            fixHelper.fixfunc(new int[]{49, 50});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C05306(CompleteActivity completeActivity);

        public final native void onGlobalLayout();
    }

    /* renamed from: com.illuminate.texaspoker.activity.CompleteActivity.7 */
    class C05317 implements OnTouchListener {
        final /* synthetic */ CompleteActivity f4211a;

        static {
            fixHelper.fixfunc(new int[]{97, 98});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C05317(CompleteActivity completeActivity);

        public final native boolean onTouch(View view, MotionEvent motionEvent);
    }

    /* renamed from: com.illuminate.texaspoker.activity.CompleteActivity.8 */
    class C05338 implements View.OnClickListener {
        final /* synthetic */ CompleteActivity f4213a;

        /* renamed from: com.illuminate.texaspoker.activity.CompleteActivity.8.1 */
        class C05321 implements OnClickListener {
            final /* synthetic */ C05338 f4212a;

            static {
                fixHelper.fixfunc(new int[]{886, 887});
                if (VERSION.SDK_INT <= 0) {
                    Exists2.class.toString();
                }
            }

            native C05321(C05338 c05338);

            public final native void onClick(DialogInterface dialogInterface, int i);
        }

        static {
            fixHelper.fixfunc(new int[]{251, 252});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C05338(CompleteActivity completeActivity);

        public final native void onClick(View view);
    }

    /* renamed from: com.illuminate.texaspoker.activity.CompleteActivity.9 */
    class C05349 implements TextWatcher {
        final /* synthetic */ CompleteActivity f4214a;

        static {
            fixHelper.fixfunc(new int[]{423, 424, 425, 426});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C05349(CompleteActivity completeActivity);

        public final native void afterTextChanged(Editable editable);

        public final native void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3);

        public final native void onTextChanged(CharSequence charSequence, int i, int i2, int i3);
    }

    static {
        f4220c = "CompleteActivity";
        f4221h = 100;
        f4222i = XGPushManager.OPERATION_REQ_UNREGISTER;
        f4223j = R.AppCompatTheme_buttonStyle;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968626);
        this.f4225e = SharedPreferencesManager.m4408p();
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        if (toolbar != null) {
            toolbar.setTitleTextAppearance(this, 2131296567);
        }
        View findViewById = findViewById(2131558681);
        if (findViewById != null) {
            findViewById.setOnClickListener(new C05295(this));
            findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new C05306(this));
        }
        this.f4228k = (ImageView) findViewById(2131558682);
        this.f4229l = (SimpleDraweeView) findViewById(2131558674);
        this.f4230m = (ImageView) findViewById(2131558683);
        ImageButton imageButton = (ImageButton) findViewById(2131558675);
        if (imageButton != null) {
            imageButton.setOnTouchListener(new C05317(this));
            imageButton.setOnClickListener(new C05338(this));
        }
        this.f4231n = (EditText) findViewById(2131558684);
        this.f4231n.addTextChangedListener(new C05349(this));
        this.f4232o = (ImageButton) findViewById(2131558686);
        this.f4232o.setOnClickListener(new View.OnClickListener() {
            final /* synthetic */ CompleteActivity f4203a;

            {
                this.f4203a = r1;
            }

            public final void onClick(View view) {
                this.f4203a.m3022b(1);
            }
        });
        this.f4233p = (ImageButton) findViewById(2131558689);
        this.f4233p.setOnClickListener(new View.OnClickListener() {
            final /* synthetic */ CompleteActivity f4204a;

            {
                this.f4204a = r1;
            }

            public final void onClick(View view) {
                this.f4204a.m3022b(0);
            }
        });
        this.f4234q = (ImageView) findViewById(2131558687);
        this.f4235r = (TextView) findViewById(2131558688);
        this.f4236s = (ImageView) findViewById(2131558690);
        this.f4237t = (TextView) findViewById(2131558691);
        m3026e();
    }

    protected void onResume() {
        super.onResume();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (iArr[0] != 0) {
            new Builder(this).setTitle(2131165473).setMessage(2131165431).setPositiveButton(2131165472, new C05284(this)).setNegativeButton(2131165432, new C05251(this)).show();
        } else if (i == 2) {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            this.f4226f = Uri.fromFile(new File(getExternalCacheDir(), "tempOriginalImage.jpg"));
            intent.putExtra("output", this.f4226f);
            startActivityForResult(intent, f4223j);
        }
    }

    private void m3026e() {
        if (!DBManager.m3631a().m3632b()) {
            CharSequence k = SharedPreferencesManager.m4375k();
            if (StringUtils.m4462a(k) || k.equalsIgnoreCase("http://upyun.pokermate.net/images/male_head.png")) {
                this.f4228k.setVisibility(0);
                this.f4229l.setVisibility(4);
                this.f4230m.setVisibility(4);
            } else {
                this.f4228k.setVisibility(4);
                this.f4229l.setVisibility(0);
                this.f4230m.setVisibility(0);
                this.f4229l.setImageURI(Uri.parse(k));
            }
            if (SharedPreferencesManager.m4408p() == 1) {
                m3022b(1);
            } else {
                m3022b(0);
            }
            this.f4231n.setText(SharedPreferencesManager.m4361i());
            m3027f();
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if ((i == f4221h || i == f4223j) && i2 == -1) {
            if (i == f4221h) {
                Uri data = intent.getData();
                this.f4227g = Uri.fromFile(new File(getExternalCacheDir(), "tempImage.jpg"));
                m3019a(data);
                return;
            }
            this.f4227g = Uri.fromFile(new File(getExternalCacheDir(), "tempImage.jpg"));
            m3019a(this.f4226f);
        } else if (i == f4222i && i2 == -1 && intent != null) {
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(getContentResolver().openInputStream(this.f4227g));
                this.b = new LoadingDialog(this);
                this.b.show();
                byte[] a = ImageUtility.m4071a(decodeStream);
                NetworkUtil.m4073a();
                NetworkUtil.m4126a(a);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131689483, menu);
        this.f4224d = menu;
        this.f4224d.getItem(0).setEnabled(false);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131559436) {
            return super.onOptionsItemSelected(menuItem);
        }
        m3013a();
        String trim = this.f4231n.getText().toString().trim();
        if (StringUtils.m4460a(trim) > 16) {
            new Builder(this).setTitle(2131165514).setMessage(2131165777).setPositiveButton(2131165438, new C05262(this)).show();
        } else {
            this.b = new LoadingDialog(this);
            this.b.show();
            NetworkUtil.m4073a();
            NetworkUtil.m4111a(trim, this.f4225e);
        }
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

    private void m3022b(int i) {
        if (i == 1) {
            this.f4225e = 1;
            this.f4234q.setImageResource(2130903407);
            this.f4236s.setImageResource(2130903406);
            this.f4235r.setTextColor(ViewCompat.MEASURED_STATE_MASK);
            this.f4237t.setTextColor(-2510995);
            this.f4232o.setBackgroundResource(2130903414);
            this.f4233p.setBackgroundResource(2130903415);
            return;
        }
        this.f4225e = 0;
        this.f4234q.setImageResource(2130903408);
        this.f4236s.setImageResource(2130903405);
        this.f4235r.setTextColor(-2510995);
        this.f4237t.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.f4233p.setBackgroundResource(2130903414);
        this.f4232o.setBackgroundResource(2130903415);
    }

    private void m3027f() {
        if (this.f4224d == null) {
            return;
        }
        if (StringUtils.m4462a(this.f4231n.getText().toString().trim())) {
            this.f4224d.getItem(0).setEnabled(false);
        } else {
            this.f4224d.getItem(0).setEnabled(true);
        }
    }

    private void m3019a(Uri uri) {
        Intent intent = new Intent("com.android.camera.action.CROP");
        intent.setDataAndType(uri, "image/jpeg");
        intent.putExtra("crop", "true");
        intent.putExtra("aspectX", 1);
        intent.putExtra("aspectY", 1);
        intent.putExtra("outputX", 640);
        intent.putExtra("outputY", 640);
        intent.putExtra("scale", true);
        intent.putExtra("return-data", false);
        intent.putExtra("output", this.f4227g);
        intent.putExtra("outputFormat", CompressFormat.JPEG.toString());
        intent.putExtra("noFaceDetection", true);
        startActivityForResult(intent, f4222i);
    }

    protected final void m3028a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_REFRESH_IMAGE")) {
            m3026e();
        } else if (str.equalsIgnoreCase("NOTIFY_UPLOAD_USER_COVER_PHOTO_SUCCESS")) {
            if (this.b != null) {
                this.b.dismiss();
            }
            m3026e();
        } else if (str.equalsIgnoreCase("NOTIFY_UPLOAD_USER_COVER_PHOTO_FAULT")) {
            if (this.b != null) {
                this.b.dismiss();
            }
            m3014a(2131165799);
        } else if (str.equalsIgnoreCase("NOTIFY_DELETE_USER_COVER_PHOTO_SUCCESS")) {
            if (this.b != null) {
                this.b.dismiss();
            }
            m3026e();
        } else if (str.equalsIgnoreCase("NOTIFY_DELETE_USER_COVER_PHOTO_FAULT")) {
            if (this.b != null) {
                this.b.dismiss();
            }
            m3014a(2131165759);
        } else if (str.equalsIgnoreCase("NOTIFY_UPLOAD_PHOTO_SUCCESS")) {
            if (this.b != null) {
                this.b.dismiss();
            }
            m3026e();
        } else if (str.equalsIgnoreCase("NOTIFY_UPLOAD_ICON_FAULT")) {
            if (this.b != null) {
                this.b.dismiss();
            }
            m3014a(2131165800);
        } else if (str.equalsIgnoreCase("NOTIFY_SET_USERINFO_SUCCESS")) {
            if (this.b != null) {
                this.b.dismiss();
            }
            startActivity(new Intent(this, ImportFriendActivity.class));
        } else if (str.equalsIgnoreCase("NOTIFY_SET_USERINFO_FAULT")) {
            int intValue = ((Integer) list.get(0)).intValue();
            if (this.b != null) {
                this.b.dismiss();
            }
            new Builder(this).setTitle(2131165514).setMessage(intValue).setPositiveButton(2131165438, new C05273(this)).show();
        }
    }
}
