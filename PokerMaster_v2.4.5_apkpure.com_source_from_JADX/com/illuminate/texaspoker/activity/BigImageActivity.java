package com.illuminate.texaspoker.activity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.drawee.p024a.p025a.Fresco;
import com.facebook.drawee.p024a.p025a.PipelineDraweeControllerBuilder;
import com.facebook.drawee.p031e.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.p050l.ImageRequest;
import java.util.List;

public class BigImageActivity extends BaseActivity {
    public static int f3541c;
    public static int f3542d;
    public static int f3543e;
    public static int f3544f;
    public static int f3545g;
    public static String f3546h;
    public static String f3547i;
    public static String f3548j;
    public static String f3549k;
    public static String f3550l;
    public static String f3551m;
    private long f3552n;
    private long f3553o;
    private int f3554p;
    private int f3555q;
    private String f3556r;
    private String f3557s;
    private SimpleDraweeView f3558t;

    /* renamed from: com.illuminate.texaspoker.activity.BigImageActivity.1 */
    class C03531 implements OnClickListener {
        final /* synthetic */ BigImageActivity f3536a;

        C03531(BigImageActivity bigImageActivity) {
            this.f3536a = bigImageActivity;
        }

        public final void onClick(View view) {
            this.f3536a.finish();
        }
    }

    static {
        f3541c = 100;
        f3542d = 200;
        f3543e = 300;
        f3544f = 400;
        f3545g = 500;
        f3546h = "TYPE";
        f3547i = "SMALL_URL";
        f3548j = "BIG_URL";
        f3549k = "IMAGE_ID";
        f3550l = "UUID";
        f3551m = "GENDER";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968605);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        Bundle extras = getIntent().getExtras();
        this.f3554p = extras.getInt(f3546h);
        this.f3556r = extras.getString(f3547i);
        this.f3557s = extras.getString(f3548j);
        this.f3553o = extras.getLong(f3549k);
        this.f3552n = extras.getLong(f3550l);
        this.f3555q = extras.getInt(f3551m, 1);
        this.f3558t = (SimpleDraweeView) findViewById(2131558522);
        LayoutParams layoutParams = (LayoutParams) this.f3558t.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.f3558t.setLayoutParams(layoutParams);
        this.f3558t.setOnClickListener(new C03531(this));
        m2746a();
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 17432577);
    }

    private void m2746a() {
        if (this.f3554p == f3542d) {
            ((GenericDraweeHierarchy) this.f3558t.getHierarchy()).m1407a(2130903172);
        } else if (this.f3554p == f3543e) {
            ((GenericDraweeHierarchy) this.f3558t.getHierarchy()).m1407a(2130903172);
        } else if (this.f3554p == f3544f) {
            ((GenericDraweeHierarchy) this.f3558t.getHierarchy()).m1407a(2130903182);
        } else if (this.f3554p == f3545g) {
            ((GenericDraweeHierarchy) this.f3558t.getHierarchy()).m1407a(2130903194);
        } else if (this.f3554p == f3541c) {
            if (this.f3555q == 1) {
                ((GenericDraweeHierarchy) this.f3558t.getHierarchy()).m1407a(2130903197);
            } else {
                ((GenericDraweeHierarchy) this.f3558t.getHierarchy()).m1407a(2130903192);
            }
        }
        this.f3558t.setController(((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.m1211a().m1270b((Object) ImageRequest.m2328a(this.f3556r))).m1268a((Object) ImageRequest.m2328a(this.f3557s))).m1267a(this.f3558t.getController())).m1272c());
    }

    public final void m2747a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_REFRESH_IMAGE")) {
            m2746a();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            finish();
        }
        return super.onKeyDown(i, keyEvent);
    }
}
