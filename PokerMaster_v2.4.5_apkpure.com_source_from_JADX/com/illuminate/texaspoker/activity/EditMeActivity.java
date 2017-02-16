package com.illuminate.texaspoker.activity;

import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore.Images.Media;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;
import com.facebook.drawee.p031e.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.illuminate.texaspoker.R.R;
import com.illuminate.texaspoker.p055a.AlbumAdapter;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.FriendAlbum;
import com.illuminate.texaspoker.utils.ImageUtility;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.view.LoadingDialog;
import com.tencent.android.tpush.XGPushManager;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class EditMeActivity extends BaseToolBarActivity {
    private static String f4337d;
    private static int f4338i;
    private static int f4339j;
    private static int f4340k;
    private static int f4341l;
    private static int f4342m;
    private static int f4343n;
    private int f4344e;
    private Bitmap f4345f;
    private List f4346g;
    private int f4347h;
    private View f4348o;
    private GridView f4349p;
    private AlbumAdapter f4350q;
    private SimpleDraweeView f4351r;
    private CheckBox f4352s;
    private TextView f4353t;
    private EditText f4354u;
    private Uri f4355v;
    private Uri f4356w;

    /* renamed from: com.illuminate.texaspoker.activity.EditMeActivity.1 */
    class C05681 implements OnClickListener {
        final /* synthetic */ EditMeActivity f4323a;

        C05681(EditMeActivity editMeActivity) {
            this.f4323a = editMeActivity;
        }

        public final void onClick(View view) {
            this.f4323a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.EditMeActivity.2 */
    class C05692 implements DialogInterface.OnClickListener {
        final /* synthetic */ EditMeActivity f4324a;

        C05692(EditMeActivity editMeActivity) {
            this.f4324a = editMeActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.EditMeActivity.3 */
    class C05703 implements DialogInterface.OnClickListener {
        final /* synthetic */ EditMeActivity f4325a;

        C05703(EditMeActivity editMeActivity) {
            this.f4325a = editMeActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.EditMeActivity.4 */
    class C05714 implements OnClickListener {
        final /* synthetic */ EditMeActivity f4326a;

        C05714(EditMeActivity editMeActivity) {
            this.f4326a = editMeActivity;
        }

        public final void onClick(View view) {
            this.f4326a.m2734b();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.EditMeActivity.5 */
    class C05725 implements OnGlobalLayoutListener {
        final /* synthetic */ EditMeActivity f4327a;

        C05725(EditMeActivity editMeActivity) {
            this.f4327a = editMeActivity;
        }

        public final void onGlobalLayout() {
            this.f4327a.m2735c();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.EditMeActivity.6 */
    class C05746 implements OnClickListener {
        final /* synthetic */ EditMeActivity f4329a;

        /* renamed from: com.illuminate.texaspoker.activity.EditMeActivity.6.1 */
        class C05731 implements DialogInterface.OnClickListener {
            final /* synthetic */ C05746 f4328a;

            C05731(C05746 c05746) {
                this.f4328a = c05746;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (i == 1) {
                    this.f4328a.f4329a.startActivityForResult(new Intent("android.intent.action.PICK", Media.EXTERNAL_CONTENT_URI), EditMeActivity.f4338i);
                } else if (ContextCompat.checkSelfPermission(this.f4328a.f4329a, "android.permission.CAMERA") != 0) {
                    ActivityCompat.requestPermissions(this.f4328a.f4329a, new String[]{"android.permission.CAMERA"}, 1);
                } else {
                    Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                    this.f4328a.f4329a.f4356w = Uri.fromFile(new File(this.f4328a.f4329a.getExternalCacheDir(), "tempOriginalImage.jpg"));
                    intent.putExtra("output", this.f4328a.f4329a.f4356w);
                    this.f4328a.f4329a.startActivityForResult(intent, EditMeActivity.f4340k);
                }
            }
        }

        C05746(EditMeActivity editMeActivity) {
            this.f4329a = editMeActivity;
        }

        public final void onClick(View view) {
            new Builder(this.f4329a).setItems(2131492870, new C05731(this)).show();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.EditMeActivity.7 */
    class C05757 implements OnCheckedChangeListener {
        final /* synthetic */ EditMeActivity f4330a;

        C05757(EditMeActivity editMeActivity) {
            this.f4330a = editMeActivity;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            CharSequence k = SharedPreferencesManager.m4375k();
            if (z) {
                this.f4330a.f4344e = 1;
            } else {
                this.f4330a.f4344e = 0;
            }
            if (StringUtils.m4462a(k) && this.f4330a.f4345f == null) {
                SharedPreferencesManager.m4308b();
                if (this.f4330a.f4344e == 1) {
                    ((GenericDraweeHierarchy) this.f4330a.f4351r.getHierarchy()).m1407a(2130903198);
                } else {
                    ((GenericDraweeHierarchy) this.f4330a.f4351r.getHierarchy()).m1407a(2130903193);
                }
                this.f4330a.f4351r.setImageURI(Uri.parse(k));
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.EditMeActivity.8 */
    class C05768 implements OnClickListener {
        final /* synthetic */ EditMeActivity f4331a;

        C05768(EditMeActivity editMeActivity) {
            this.f4331a = editMeActivity;
        }

        public final void onClick(View view) {
            this.f4331a.startActivity(new Intent(this.f4331a, EditMeNameActivity.class));
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.EditMeActivity.9 */
    class C05799 implements OnItemClickListener {
        final /* synthetic */ EditMeActivity f4336a;

        /* renamed from: com.illuminate.texaspoker.activity.EditMeActivity.9.1 */
        class C05771 implements DialogInterface.OnClickListener {
            final /* synthetic */ int f4332a;
            final /* synthetic */ FriendAlbum f4333b;
            final /* synthetic */ C05799 f4334c;

            C05771(C05799 c05799, int i, FriendAlbum friendAlbum) {
                this.f4334c = c05799;
                this.f4332a = i;
                this.f4333b = friendAlbum;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (i == 0) {
                    this.f4334c.f4336a.b = new LoadingDialog(this.f4334c.f4336a);
                    this.f4334c.f4336a.b.show();
                    NetworkUtil.m4073a();
                    NetworkUtil.m4074a(this.f4332a + 1);
                } else if (i == 1) {
                    if (ContextCompat.checkSelfPermission(this.f4334c.f4336a, "android.permission.CAMERA") != 0) {
                        ActivityCompat.requestPermissions(this.f4334c.f4336a, new String[]{"android.permission.CAMERA"}, 2);
                        return;
                    }
                    r0 = new Intent("android.media.action.IMAGE_CAPTURE");
                    this.f4334c.f4336a.f4356w = Uri.fromFile(new File(this.f4334c.f4336a.getExternalCacheDir(), "tempOriginalImage.jpg"));
                    r0.putExtra("output", this.f4334c.f4336a.f4356w);
                    this.f4334c.f4336a.startActivityForResult(r0, EditMeActivity.f4343n);
                } else if (i == 2) {
                    this.f4334c.f4336a.startActivityForResult(new Intent("android.intent.action.PICK", Media.EXTERNAL_CONTENT_URI), EditMeActivity.f4341l);
                } else {
                    r0 = new Intent(this.f4334c.f4336a, BigImageActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt(BigImageActivity.f3546h, BigImageActivity.f3542d);
                    bundle.putString(BigImageActivity.f3547i, this.f4333b.f5818e);
                    bundle.putString(BigImageActivity.f3548j, this.f4333b.f5817d);
                    bundle.putLong(BigImageActivity.f3550l, SharedPreferencesManager.m4308b());
                    r0.putExtras(bundle);
                    this.f4334c.f4336a.startActivity(r0);
                    this.f4334c.f4336a.overridePendingTransition(17432576, 17432577);
                }
            }
        }

        /* renamed from: com.illuminate.texaspoker.activity.EditMeActivity.9.2 */
        class C05782 implements DialogInterface.OnClickListener {
            final /* synthetic */ C05799 f4335a;

            C05782(C05799 c05799) {
                this.f4335a = c05799;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (i == 1) {
                    this.f4335a.f4336a.startActivityForResult(new Intent("android.intent.action.PICK", Media.EXTERNAL_CONTENT_URI), EditMeActivity.f4341l);
                } else if (ContextCompat.checkSelfPermission(this.f4335a.f4336a, "android.permission.CAMERA") != 0) {
                    ActivityCompat.requestPermissions(this.f4335a.f4336a, new String[]{"android.permission.CAMERA"}, 2);
                } else {
                    Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                    this.f4335a.f4336a.f4356w = Uri.fromFile(new File(this.f4335a.f4336a.getExternalCacheDir(), "tempOriginalImage.jpg"));
                    intent.putExtra("output", this.f4335a.f4336a.f4356w);
                    this.f4335a.f4336a.startActivityForResult(intent, EditMeActivity.f4343n);
                }
            }
        }

        C05799(EditMeActivity editMeActivity) {
            this.f4336a = editMeActivity;
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            this.f4336a.f4347h = i;
            Object obj = this.f4336a.f4346g.get(i);
            if (obj instanceof FriendAlbum) {
                new Builder(this.f4336a).setItems(2131492871, new C05771(this, i, (FriendAlbum) obj)).show();
                return;
            }
            new Builder(this.f4336a).setItems(2131492870, new C05782(this)).show();
        }
    }

    static {
        f4337d = "EditMeActivity";
        f4338i = 100;
        f4339j = XGPushManager.OPERATION_REQ_UNREGISTER;
        f4340k = R.AppCompatTheme_buttonStyle;
        f4341l = 200;
        f4342m = 201;
        f4343n = 202;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968630);
        this.f4347h = -1;
        this.f4346g = new ArrayList();
        this.f4344e = SharedPreferencesManager.m4408p();
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C05681(this));
        View findViewById = findViewById(2131558707);
        findViewById.setOnClickListener(new C05714(this));
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new C05725(this));
        this.f4349p = (GridView) findViewById(2131558673);
        this.f4350q = new AlbumAdapter(this, this.f4346g);
        this.f4349p.setAdapter(this.f4350q);
        this.f4349p.setOnItemClickListener(new C05799(this));
        Button button = (Button) findViewById(2131558675);
        if (button != null) {
            button.setOnClickListener(new C05746(this));
        }
        this.f4351r = (SimpleDraweeView) findViewById(2131558674);
        this.f4352s = (CheckBox) findViewById(2131558712);
        this.f4352s.setOnCheckedChangeListener(new C05757(this));
        this.f4353t = (TextView) findViewById(2131558709);
        ((ImageButton) findViewById(2131558710)).setOnClickListener(new C05768(this));
        this.f4354u = (EditText) findViewById(2131558714);
        this.f4348o = findViewById(2131558671);
    }

    protected void onResume() {
        super.onResume();
        m3079g();
    }

    private void m3079g() {
        if (!DBManager.m3631a().m3632b()) {
            SharedPreferencesManager.m4308b();
            String k = SharedPreferencesManager.m4375k();
            if (this.f4344e == 1) {
                ((GenericDraweeHierarchy) this.f4351r.getHierarchy()).m1407a(2130903198);
            } else {
                ((GenericDraweeHierarchy) this.f4351r.getHierarchy()).m1407a(2130903193);
            }
            this.f4351r.setImageURI(Uri.parse(k));
            if (SharedPreferencesManager.m4408p() == 1) {
                this.f4352s.setChecked(true);
            } else {
                this.f4352s.setChecked(false);
            }
            this.f4353t.setText(SharedPreferencesManager.m4361i());
            this.f4354u.setText(SharedPreferencesManager.m4420s());
            this.f4346g.clear();
            this.f4346g.addAll(DBManager.m3631a().f5561a.m3636a(SharedPreferencesManager.m4308b()));
            if (this.f4346g.size() == 0) {
                this.f4348o.setVisibility(0);
            } else {
                this.f4348o.setVisibility(4);
            }
            if (this.f4346g.size() <= 7) {
                this.f4346g.add("addBtn");
            }
            this.f4350q.notifyDataSetChanged();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (iArr[0] != 0) {
            new Builder(this).setTitle(2131165514).setMessage(2131165431).setPositiveButton(2131165472, new DialogInterface.OnClickListener() {
                final /* synthetic */ EditMeActivity f4322a;

                {
                    this.f4322a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.applications.InstalledAppDetails"));
                    intent.setData(Uri.parse("package:" + this.f4322a.getPackageName()));
                    this.f4322a.startActivity(intent);
                }
            }).setNegativeButton(2131165432, new DialogInterface.OnClickListener() {
                final /* synthetic */ EditMeActivity f4321a;

                {
                    this.f4321a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                }
            }).show();
        } else if (i == 2) {
            r0 = new Intent("android.media.action.IMAGE_CAPTURE");
            this.f4356w = Uri.fromFile(new File(getExternalCacheDir(), "tempOriginalImage.jpg"));
            r0.putExtra("output", this.f4356w);
            startActivityForResult(r0, f4343n);
        } else if (i == 1) {
            r0 = new Intent("android.media.action.IMAGE_CAPTURE");
            this.f4356w = Uri.fromFile(new File(getExternalCacheDir(), "tempOriginalImage.jpg"));
            r0.putExtra("output", this.f4356w);
            startActivityForResult(r0, f4340k);
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Uri data;
        if ((i == f4338i || i == f4340k) && i2 == -1) {
            if (i == f4338i) {
                data = intent.getData();
                this.f4355v = Uri.fromFile(new File(getExternalCacheDir(), "tempImage.jpg"));
                m3068a(data);
                return;
            }
            this.f4355v = Uri.fromFile(new File(getExternalCacheDir(), "tempImage.jpg"));
            m3068a(this.f4356w);
        } else if (i == f4339j && i2 == -1 && intent != null) {
            try {
                r0 = BitmapFactory.decodeStream(getContentResolver().openInputStream(this.f4355v));
                this.b = new LoadingDialog(this);
                this.b.show();
                byte[] a = ImageUtility.m4071a(r0);
                NetworkUtil.m4073a();
                NetworkUtil.m4126a(a);
                this.f4345f = r0;
            } catch (Throwable e) {
                Log.e(f4337d, e.getMessage(), e);
                e.printStackTrace();
            }
        } else if ((i == f4341l || i == f4343n) && i2 == -1) {
            if (i == f4341l) {
                data = intent.getData();
                this.f4355v = Uri.fromFile(new File(getExternalCacheDir(), "tempImage.jpg"));
                m3071b(data);
                return;
            }
            this.f4355v = Uri.fromFile(new File(getExternalCacheDir(), "tempImage.jpg"));
            m3071b(this.f4356w);
        } else if (i == f4342m && i2 == -1 && intent != null) {
            try {
                r0 = BitmapFactory.decodeStream(getContentResolver().openInputStream(this.f4355v));
                this.b = new LoadingDialog(this);
                this.b.show();
                byte[] a2 = ImageUtility.m4071a(r0);
                NetworkUtil.m4073a();
                NetworkUtil.m4127a(a2, this.f4347h + 1);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private void m3068a(Uri uri) {
        Intent intent = new Intent("com.android.camera.action.CROP");
        intent.setDataAndType(uri, "image/*");
        intent.putExtra("crop", "true");
        intent.putExtra("aspectX", 1);
        intent.putExtra("aspectY", 1);
        intent.putExtra("outputX", 640);
        intent.putExtra("outputY", 640);
        intent.putExtra("scale", true);
        intent.putExtra("return-data", false);
        intent.putExtra("output", this.f4355v);
        intent.putExtra("outputFormat", CompressFormat.JPEG.toString());
        intent.putExtra("noFaceDetection", true);
        startActivityForResult(intent, f4339j);
    }

    private void m3071b(Uri uri) {
        Intent intent = new Intent("com.android.camera.action.CROP");
        intent.setDataAndType(uri, "image/*");
        intent.putExtra("crop", "true");
        intent.putExtra("aspectX", 1);
        intent.putExtra("aspectY", 1);
        intent.putExtra("outputX", 1080);
        intent.putExtra("outputY", 1080);
        intent.putExtra("scale", true);
        intent.putExtra("return-data", false);
        intent.putExtra("output", this.f4355v);
        intent.putExtra("outputFormat", CompressFormat.JPEG.toString());
        intent.putExtra("noFaceDetection", true);
        startActivityForResult(intent, f4342m);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131689492, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131559444) {
            return super.onOptionsItemSelected(menuItem);
        }
        m2734b();
        String trim = this.f4354u.getText().toString().trim();
        if (StringUtils.m4460a(trim) > 60) {
            new Builder(this).setTitle(2131165514).setMessage(2131165796).setPositiveButton(2131165438, new C05703(this)).show();
        } else if (!(trim.equals(SharedPreferencesManager.m4420s()) && this.f4344e == SharedPreferencesManager.m4408p())) {
            this.b = new LoadingDialog(this);
            this.b.show();
            NetworkUtil.m4073a();
            NetworkUtil.m4075a(this.f4344e, trim);
        }
        return true;
    }

    protected final void m3080a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_REFRESH_IMAGE")) {
            m3079g();
        } else if (str.equalsIgnoreCase("NOTIFY_UPLOAD_PHOTO_SUCCESS")) {
            if (this.b != null) {
                this.b.dismiss();
            }
            m3079g();
        } else if (str.equalsIgnoreCase("NOTIFY_UPLOAD_ICON_FAULT")) {
            if (this.b != null) {
                this.b.dismiss();
            }
            m2732a(2130903246, 2131165800, 1);
        } else if (str.equalsIgnoreCase("NOTIFY_DELETE_USER_COVER_PHOTO_SUCCESS")) {
            if (this.b != null) {
                this.b.dismiss();
            }
            m3079g();
        } else if (str.equalsIgnoreCase("NOTIFY_DELETE_USER_COVER_PHOTO_FAULT")) {
            if (this.b != null) {
                this.b.dismiss();
            }
            m2732a(2130903246, 2131165759, 1);
        } else if (str.equalsIgnoreCase("NOTIFY_UPLOAD_USER_COVER_PHOTO_SUCCESS")) {
            if (this.b != null) {
                this.b.dismiss();
            }
            m3079g();
        } else if (str.equalsIgnoreCase("NOTIFY_UPLOAD_USER_COVER_PHOTO_FAULT")) {
            if (this.b != null) {
                this.b.dismiss();
            }
            m2732a(2130903246, 2131165799, 1);
        } else if (str.equalsIgnoreCase("NOTIFY_SET_USERINFO_SUCCESS")) {
            if (this.b != null) {
                this.b.dismiss();
            }
            finish();
        } else if (str.equalsIgnoreCase("NOTIFY_SET_USERINFO_FAULT")) {
            int intValue = ((Integer) list.get(0)).intValue();
            if (this.b != null) {
                this.b.dismiss();
            }
            new Builder(this).setTitle(2131165514).setMessage(intValue).setPositiveButton(2131165438, new C05692(this)).show();
        }
    }
}
