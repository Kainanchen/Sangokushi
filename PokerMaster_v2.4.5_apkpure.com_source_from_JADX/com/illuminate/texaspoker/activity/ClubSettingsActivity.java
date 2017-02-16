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
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.illuminate.texaspoker.R.R;
import com.illuminate.texaspoker.p055a.AlbumAdapter;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.illuminate.texaspoker.p058c.ClubAlbum;
import com.illuminate.texaspoker.utils.ImageUtility;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.view.LoadingDialog;
import com.tencent.android.tpush.XGPushManager;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClubSettingsActivity extends BaseToolBarActivity {
    private static String f4139e;
    private static int f4140j;
    private static int f4141k;
    private static int f4142l;
    private static int f4143m;
    private static int f4144n;
    private static int f4145o;
    int f4146d;
    private long f4147f;
    private ChatRoom f4148g;
    private Bitmap f4149h;
    private List f4150i;
    private GridView f4151p;
    private AlbumAdapter f4152q;
    private View f4153r;
    private Button f4154s;
    private SimpleDraweeView f4155t;
    private EditText f4156u;
    private EditText f4157v;
    private Uri f4158w;
    private Uri f4159x;

    /* renamed from: com.illuminate.texaspoker.activity.ClubSettingsActivity.1 */
    class C05001 implements OnClickListener {
        final /* synthetic */ ClubSettingsActivity f4123a;

        C05001(ClubSettingsActivity clubSettingsActivity) {
            this.f4123a = clubSettingsActivity;
        }

        public final void onClick(View view) {
            this.f4123a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubSettingsActivity.2 */
    class C05012 implements DialogInterface.OnClickListener {
        final /* synthetic */ ClubSettingsActivity f4124a;

        C05012(ClubSettingsActivity clubSettingsActivity) {
            this.f4124a = clubSettingsActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubSettingsActivity.3 */
    class C05023 implements DialogInterface.OnClickListener {
        final /* synthetic */ ClubSettingsActivity f4125a;

        C05023(ClubSettingsActivity clubSettingsActivity) {
            this.f4125a = clubSettingsActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubSettingsActivity.4 */
    class C05034 implements OnClickListener {
        final /* synthetic */ ClubSettingsActivity f4126a;

        C05034(ClubSettingsActivity clubSettingsActivity) {
            this.f4126a = clubSettingsActivity;
        }

        public final void onClick(View view) {
            this.f4126a.m2734b();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubSettingsActivity.5 */
    class C05045 implements OnGlobalLayoutListener {
        final /* synthetic */ ClubSettingsActivity f4127a;

        C05045(ClubSettingsActivity clubSettingsActivity) {
            this.f4127a = clubSettingsActivity;
        }

        public final void onGlobalLayout() {
            this.f4127a.m2735c();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubSettingsActivity.6 */
    class C05076 implements OnClickListener {
        final /* synthetic */ ClubSettingsActivity f4130a;

        /* renamed from: com.illuminate.texaspoker.activity.ClubSettingsActivity.6.1 */
        class C05051 implements DialogInterface.OnClickListener {
            final /* synthetic */ C05076 f4128a;

            C05051(C05076 c05076) {
                this.f4128a = c05076;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f4128a.f4130a.finish();
            }
        }

        /* renamed from: com.illuminate.texaspoker.activity.ClubSettingsActivity.6.2 */
        class C05062 implements DialogInterface.OnClickListener {
            final /* synthetic */ C05076 f4129a;

            C05062(C05076 c05076) {
                this.f4129a = c05076;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (i == 1) {
                    this.f4129a.f4130a.startActivityForResult(new Intent("android.intent.action.PICK", Media.EXTERNAL_CONTENT_URI), ClubSettingsActivity.f4140j);
                } else if (ContextCompat.checkSelfPermission(this.f4129a.f4130a, "android.permission.CAMERA") != 0) {
                    ActivityCompat.requestPermissions(this.f4129a.f4130a, new String[]{"android.permission.CAMERA"}, 1);
                } else {
                    Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                    this.f4129a.f4130a.f4159x = Uri.fromFile(new File(this.f4129a.f4130a.getExternalCacheDir(), "tempOriginalImage.jpg"));
                    intent.putExtra("output", this.f4129a.f4130a.f4159x);
                    this.f4129a.f4130a.startActivityForResult(intent, ClubSettingsActivity.f4142l);
                }
            }
        }

        C05076(ClubSettingsActivity clubSettingsActivity) {
            this.f4130a = clubSettingsActivity;
        }

        public final void onClick(View view) {
            if (this.f4130a.f4148g.f5734U == null || !this.f4130a.f4148g.f5734U.booleanValue()) {
                new Builder(this.f4130a).setTitle(2131165514).setMessage(2131165609).setPositiveButton(2131165438, new C05051(this)).show();
            } else {
                new Builder(this.f4130a).setItems(2131492870, new C05062(this)).show();
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubSettingsActivity.7 */
    class C05117 implements OnItemClickListener {
        final /* synthetic */ ClubSettingsActivity f4136a;

        /* renamed from: com.illuminate.texaspoker.activity.ClubSettingsActivity.7.1 */
        class C05081 implements DialogInterface.OnClickListener {
            final /* synthetic */ C05117 f4131a;

            C05081(C05117 c05117) {
                this.f4131a = c05117;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f4131a.f4136a.finish();
            }
        }

        /* renamed from: com.illuminate.texaspoker.activity.ClubSettingsActivity.7.2 */
        class C05092 implements DialogInterface.OnClickListener {
            final /* synthetic */ int f4132a;
            final /* synthetic */ ClubAlbum f4133b;
            final /* synthetic */ C05117 f4134c;

            C05092(C05117 c05117, int i, ClubAlbum clubAlbum) {
                this.f4134c = c05117;
                this.f4132a = i;
                this.f4133b = clubAlbum;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (i == 0) {
                    this.f4134c.f4136a.b = new LoadingDialog(this.f4134c.f4136a);
                    this.f4134c.f4136a.b.show();
                    NetworkUtil.m4073a();
                    NetworkUtil.m4147c(this.f4134c.f4136a.f4147f, this.f4132a + 1);
                } else if (i == 1) {
                    if (ContextCompat.checkSelfPermission(this.f4134c.f4136a, "android.permission.CAMERA") != 0) {
                        ActivityCompat.requestPermissions(this.f4134c.f4136a, new String[]{"android.permission.CAMERA"}, 2);
                        return;
                    }
                    r0 = new Intent("android.media.action.IMAGE_CAPTURE");
                    this.f4134c.f4136a.f4159x = Uri.fromFile(new File(this.f4134c.f4136a.getExternalCacheDir(), "tempOriginalImage.jpg"));
                    r0.putExtra("output", this.f4134c.f4136a.f4159x);
                    this.f4134c.f4136a.startActivityForResult(r0, ClubSettingsActivity.f4145o);
                } else if (i == 2) {
                    this.f4134c.f4136a.startActivityForResult(new Intent("android.intent.action.PICK", Media.EXTERNAL_CONTENT_URI), ClubSettingsActivity.f4143m);
                } else {
                    r0 = new Intent(this.f4134c.f4136a, BigImageActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt(BigImageActivity.f3546h, BigImageActivity.f3543e);
                    bundle.putString(BigImageActivity.f3547i, this.f4133b.f5783e);
                    bundle.putString(BigImageActivity.f3548j, this.f4133b.f5782d);
                    bundle.putLong(BigImageActivity.f3550l, this.f4134c.f4136a.f4147f);
                    r0.putExtras(bundle);
                    this.f4134c.f4136a.startActivity(r0);
                    this.f4134c.f4136a.overridePendingTransition(17432576, 17432577);
                }
            }
        }

        /* renamed from: com.illuminate.texaspoker.activity.ClubSettingsActivity.7.3 */
        class C05103 implements DialogInterface.OnClickListener {
            final /* synthetic */ C05117 f4135a;

            C05103(C05117 c05117) {
                this.f4135a = c05117;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (i == 1) {
                    this.f4135a.f4136a.startActivityForResult(new Intent("android.intent.action.PICK", Media.EXTERNAL_CONTENT_URI), ClubSettingsActivity.f4143m);
                } else if (ContextCompat.checkSelfPermission(this.f4135a.f4136a, "android.permission.CAMERA") != 0) {
                    ActivityCompat.requestPermissions(this.f4135a.f4136a, new String[]{"android.permission.CAMERA"}, 2);
                } else {
                    Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                    this.f4135a.f4136a.f4159x = Uri.fromFile(new File(this.f4135a.f4136a.getExternalCacheDir(), "tempOriginalImage.jpg"));
                    intent.putExtra("output", this.f4135a.f4136a.f4159x);
                    this.f4135a.f4136a.startActivityForResult(intent, ClubSettingsActivity.f4145o);
                }
            }
        }

        C05117(ClubSettingsActivity clubSettingsActivity) {
            this.f4136a = clubSettingsActivity;
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.f4136a.f4148g.f5734U == null || !this.f4136a.f4148g.f5734U.booleanValue()) {
                new Builder(this.f4136a).setTitle(2131165514).setMessage(2131165609).setPositiveButton(2131165438, new C05081(this)).show();
                return;
            }
            this.f4136a.f4146d = i;
            Object obj = this.f4136a.f4150i.get(i);
            if (obj instanceof ClubAlbum) {
                new Builder(this.f4136a).setItems(2131492871, new C05092(this, i, (ClubAlbum) obj)).show();
                return;
            }
            new Builder(this.f4136a).setItems(2131492870, new C05103(this)).show();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubSettingsActivity.8 */
    class C05128 implements DialogInterface.OnClickListener {
        final /* synthetic */ ClubSettingsActivity f4137a;

        C05128(ClubSettingsActivity clubSettingsActivity) {
            this.f4137a = clubSettingsActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubSettingsActivity.9 */
    class C05139 implements DialogInterface.OnClickListener {
        final /* synthetic */ ClubSettingsActivity f4138a;

        C05139(ClubSettingsActivity clubSettingsActivity) {
            this.f4138a = clubSettingsActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.applications.InstalledAppDetails"));
            intent.setData(Uri.parse("package:" + this.f4138a.getPackageName()));
            this.f4138a.startActivity(intent);
        }
    }

    static {
        f4139e = "ClubSettingsActivity";
        f4140j = 100;
        f4141k = XGPushManager.OPERATION_REQ_UNREGISTER;
        f4142l = R.AppCompatTheme_buttonStyle;
        f4143m = 200;
        f4144n = 201;
        f4145o = 202;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968624);
        this.f4147f = getIntent().getExtras().getLong("lClubId");
        this.f4146d = -1;
        this.f4150i = new ArrayList();
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C05001(this));
        View findViewById = findViewById(2131558669);
        findViewById.setOnClickListener(new C05034(this));
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new C05045(this));
        this.f4153r = findViewById(2131558671);
        this.f4151p = (GridView) findViewById(2131558673);
        this.f4152q = new AlbumAdapter(this, this.f4150i);
        this.f4151p.setAdapter(this.f4152q);
        this.f4151p.setOnItemClickListener(new C05117(this));
        this.f4154s = (Button) findViewById(2131558675);
        this.f4154s.setOnClickListener(new C05076(this));
        this.f4155t = (SimpleDraweeView) findViewById(2131558674);
        this.f4156u = (EditText) findViewById(2131558678);
        this.f4157v = (EditText) findViewById(2131558680);
    }

    protected void onResume() {
        super.onResume();
        m2988g();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131689481, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131559434) {
            return super.onOptionsItemSelected(menuItem);
        }
        m2734b();
        if (this.f4148g.f5734U == null || !this.f4148g.f5734U.booleanValue()) {
            new Builder(this).setTitle(2131165514).setMessage(2131165609).setPositiveButton(2131165438, new DialogInterface.OnClickListener() {
                final /* synthetic */ ClubSettingsActivity f4121a;

                {
                    this.f4121a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f4121a.finish();
                }
            }).show();
        } else {
            String trim = this.f4156u.getText().toString().trim();
            if (StringUtils.m4462a((CharSequence) trim)) {
                new Builder(this).setTitle(2131165514).setMessage(2131165398).setPositiveButton(2131165438, new DialogInterface.OnClickListener() {
                    final /* synthetic */ ClubSettingsActivity f4122a;

                    {
                        this.f4122a = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                    }
                }).show();
            } else if (StringUtils.m4460a(trim) > 20) {
                new Builder(this).setTitle(2131165514).setMessage(2131165399).setPositiveButton(2131165438, new C05012(this)).show();
            } else {
                String trim2 = this.f4157v.getText().toString().trim();
                this.b = new LoadingDialog(this);
                this.b.show();
                NetworkUtil.m4073a();
                NetworkUtil.m4096a(this.f4147f, trim, trim2);
            }
        }
        return true;
    }

    private void m2988g() {
        if (!DBManager.m3631a().m3632b()) {
            this.f4148g = DBManager.m3631a().f5565e.m3590a(this.f4147f, 2);
            this.f4150i.clear();
            this.f4150i.addAll(DBManager.m3631a().f5567g.m3618a(this.f4147f));
            if (this.f4150i.size() == 0) {
                this.f4153r.setVisibility(0);
            } else {
                this.f4153r.setVisibility(4);
            }
            if (this.f4150i.size() <= 7) {
                this.f4150i.add("addBtn");
            }
            this.f4152q.notifyDataSetChanged();
            this.f4155t.setImageURI(Uri.parse(this.f4148g.f5760u));
            this.f4156u.setText(this.f4148g.f5755p);
            this.f4157v.setText(this.f4148g.f5764y);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (iArr[0] != 0) {
            new Builder(this).setTitle(2131165514).setMessage(2131165431).setPositiveButton(2131165472, new C05139(this)).setNegativeButton(2131165432, new C05128(this)).show();
        } else if (i == 2) {
            r0 = new Intent("android.media.action.IMAGE_CAPTURE");
            this.f4159x = Uri.fromFile(new File(getExternalCacheDir(), "tempOriginalImage.jpg"));
            r0.putExtra("output", this.f4159x);
            startActivityForResult(r0, f4145o);
        } else if (i == 1) {
            r0 = new Intent("android.media.action.IMAGE_CAPTURE");
            this.f4159x = Uri.fromFile(new File(getExternalCacheDir(), "tempOriginalImage.jpg"));
            r0.putExtra("output", this.f4159x);
            startActivityForResult(r0, f4142l);
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Uri data;
        if ((i == f4140j || i == f4142l) && i2 == -1) {
            if (i == f4140j) {
                data = intent.getData();
                this.f4158w = Uri.fromFile(new File(getExternalCacheDir(), "tempImage.jpg"));
                m2980a(data);
                return;
            }
            this.f4158w = Uri.fromFile(new File(getExternalCacheDir(), "tempImage.jpg"));
            m2980a(this.f4159x);
        } else if (i == f4141k && i2 == -1 && intent != null) {
            try {
                r0 = BitmapFactory.decodeStream(getContentResolver().openInputStream(this.f4158w));
                this.b = new LoadingDialog(this);
                this.b.show();
                byte[] a = ImageUtility.m4071a(r0);
                NetworkUtil.m4073a();
                NetworkUtil.m4154c(a, this.f4147f);
                this.f4149h = r0;
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if ((i == f4143m || i == f4145o) && i2 == -1) {
            if (i == f4143m) {
                data = intent.getData();
                this.f4158w = Uri.fromFile(new File(getExternalCacheDir(), "tempImage.jpg"));
                m2982b(data);
                return;
            }
            this.f4158w = Uri.fromFile(new File(getExternalCacheDir(), "tempImage.jpg"));
            m2982b(this.f4159x);
        } else if (i == f4144n && i2 == -1 && intent != null) {
            try {
                r0 = BitmapFactory.decodeStream(getContentResolver().openInputStream(this.f4158w));
                this.b = new LoadingDialog(this);
                this.b.show();
                byte[] a2 = ImageUtility.m4071a(r0);
                NetworkUtil.m4073a();
                NetworkUtil.m4129a(a2, this.f4147f, this.f4146d + 1);
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    private void m2980a(Uri uri) {
        Intent intent = new Intent("com.android.camera.action.CROP");
        intent.setDataAndType(uri, "image/*");
        intent.putExtra("crop", "true");
        intent.putExtra("aspectX", 1);
        intent.putExtra("aspectY", 1);
        intent.putExtra("outputX", 640);
        intent.putExtra("outputY", 640);
        intent.putExtra("scale", true);
        intent.putExtra("return-data", false);
        intent.putExtra("output", this.f4158w);
        intent.putExtra("outputFormat", CompressFormat.JPEG.toString());
        intent.putExtra("noFaceDetection", true);
        startActivityForResult(intent, f4141k);
    }

    private void m2982b(Uri uri) {
        Intent intent = new Intent("com.android.camera.action.CROP");
        intent.setDataAndType(uri, "image/*");
        intent.putExtra("crop", "true");
        intent.putExtra("aspectX", 1);
        intent.putExtra("aspectY", 1);
        intent.putExtra("outputX", 1080);
        intent.putExtra("outputY", 1080);
        intent.putExtra("scale", true);
        intent.putExtra("return-data", false);
        intent.putExtra("output", this.f4158w);
        intent.putExtra("outputFormat", CompressFormat.JPEG.toString());
        intent.putExtra("noFaceDetection", true);
        startActivityForResult(intent, f4144n);
    }

    protected final void m2989a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_REFRESH_IMAGE")) {
            m2988g();
        } else if (str.equalsIgnoreCase("NOTIFY_SET_CLUB_SUCCESS")) {
            this.b.dismiss();
            m2988g();
            m2732a(2130903246, 2131165410, 1);
        } else if (str.equalsIgnoreCase("NOTIFY_SET_CLUB_FAULT")) {
            this.b.dismiss();
            int intValue = ((Integer) list.get(0)).intValue();
            this.b.dismiss();
            new Builder(this).setTitle(2131165514).setMessage(intValue).setPositiveButton(2131165438, new C05023(this)).show();
        } else if (str.equalsIgnoreCase("NOTIFY_UPLOAD_CLUB_HEAD_PHOTO_SUCCESS")) {
            this.b.dismiss();
            m2988g();
        } else if (str.equalsIgnoreCase("NOTIFY_UPLOAD_CLUB_HEAD_PHOTO_FAULT")) {
            ((Integer) list.get(0)).intValue();
            this.b.dismiss();
            m2732a(2130903246, 2131165800, 1);
        } else if (str.equalsIgnoreCase("NOTIFY_UPLOAD_CLUB_COVER_PHOTO_SUCCESS")) {
            this.b.dismiss();
            m2988g();
        } else if (str.equalsIgnoreCase("NOTIFY_UPLOAD_CLUB_COVER_PHOTO_FAULT")) {
            ((Integer) list.get(0)).intValue();
            this.b.dismiss();
            m2732a(2130903246, 2131165799, 1);
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_SYS_MSG")) {
            m2988g();
        }
    }
}
