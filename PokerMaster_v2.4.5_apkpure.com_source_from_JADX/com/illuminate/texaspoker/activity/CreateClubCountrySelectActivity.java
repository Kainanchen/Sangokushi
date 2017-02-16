package com.illuminate.texaspoker.activity;

import a.does.not.Exists2;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import com.ali.fixHelper;
import com.illuminate.texaspoker.p055a.aa;
import com.illuminate.texaspoker.p059d.CountryRegion;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.utils.Utility;
import java.util.List;

public class CreateClubCountrySelectActivity extends BaseToolBarActivity {
    private static String f4253d;
    private List f4254e;
    private aa f4255f;
    private ListView f4256g;
    private EditText f4257h;
    private ImageButton f4258i;
    private String f4259j;
    private String f4260k;

    /* renamed from: com.illuminate.texaspoker.activity.CreateClubCountrySelectActivity.1 */
    class C05371 implements OnClickListener {
        final /* synthetic */ CreateClubCountrySelectActivity f4246a;

        C05371(CreateClubCountrySelectActivity createClubCountrySelectActivity) {
            this.f4246a = createClubCountrySelectActivity;
        }

        public final void onClick(View view) {
            this.f4246a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.CreateClubCountrySelectActivity.2 */
    class C05382 implements TextWatcher {
        final /* synthetic */ CreateClubCountrySelectActivity f4247a;

        C05382(CreateClubCountrySelectActivity createClubCountrySelectActivity) {
            this.f4247a = createClubCountrySelectActivity;
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            String trim = this.f4247a.f4257h.getText().toString().trim();
            if (StringUtils.m4462a((CharSequence) trim)) {
                this.f4247a.f4258i.setVisibility(4);
            } else {
                this.f4247a.f4258i.setVisibility(0);
            }
            CreateClubCountrySelectActivity.m3034a(this.f4247a, trim);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.CreateClubCountrySelectActivity.3 */
    class C05393 implements OnKeyListener {
        final /* synthetic */ CreateClubCountrySelectActivity f4248a;

        C05393(CreateClubCountrySelectActivity createClubCountrySelectActivity) {
            this.f4248a = createClubCountrySelectActivity;
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (i == 66 && keyEvent.getAction() == 0) {
                this.f4248a.m2734b();
            }
            return false;
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.CreateClubCountrySelectActivity.4 */
    class C05404 implements OnClickListener {
        final /* synthetic */ CreateClubCountrySelectActivity f4249a;

        C05404(CreateClubCountrySelectActivity createClubCountrySelectActivity) {
            this.f4249a = createClubCountrySelectActivity;
        }

        public final void onClick(View view) {
            CreateClubCountrySelectActivity.m3034a(this.f4249a, this.f4249a.f4257h.getText().toString().trim());
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.CreateClubCountrySelectActivity.5 */
    class C05415 implements OnGlobalLayoutListener {
        final /* synthetic */ CreateClubCountrySelectActivity f4250a;

        C05415(CreateClubCountrySelectActivity createClubCountrySelectActivity) {
            this.f4250a = createClubCountrySelectActivity;
        }

        public final void onGlobalLayout() {
            this.f4250a.m2735c();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.CreateClubCountrySelectActivity.6 */
    class C05426 implements OnClickListener {
        final /* synthetic */ CreateClubCountrySelectActivity f4251a;

        C05426(CreateClubCountrySelectActivity createClubCountrySelectActivity) {
            this.f4251a = createClubCountrySelectActivity;
        }

        public final void onClick(View view) {
            this.f4251a.m2734b();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.CreateClubCountrySelectActivity.7 */
    class C05437 implements OnItemClickListener {
        final /* synthetic */ CreateClubCountrySelectActivity f4252a;

        static {
            fixHelper.fixfunc(new int[]{3637, 3638});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C05437(CreateClubCountrySelectActivity createClubCountrySelectActivity);

        public final native void onItemClick(AdapterView<?> adapterView, View view, int i, long j);
    }

    static {
        fixHelper.fixfunc(new int[]{881, 882, 883, 884, 885});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    protected final native void m3037a(String str, List<Object> list);

    protected native void onActivityResult(int i, int i2, Intent intent);

    protected native void onCreate(Bundle bundle);

    protected native void onResume();

    static void __clinit__() {
        f4253d = "ClubAreaSelectActivity";
    }

    static /* synthetic */ void m3034a(CreateClubCountrySelectActivity createClubCountrySelectActivity, String str) {
        createClubCountrySelectActivity.f4254e.clear();
        if (StringUtils.m4462a((CharSequence) str)) {
            createClubCountrySelectActivity.f4254e.addAll(Utility.m4507h());
        } else {
            for (CountryRegion countryRegion : Utility.m4507h()) {
                if (countryRegion.d.toUpperCase().contains(str.toUpperCase())) {
                    createClubCountrySelectActivity.f4254e.add(countryRegion);
                }
            }
        }
        createClubCountrySelectActivity.f4255f.notifyDataSetChanged();
    }
}
