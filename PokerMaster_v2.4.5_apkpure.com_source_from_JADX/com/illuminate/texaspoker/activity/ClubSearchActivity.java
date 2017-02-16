package com.illuminate.texaspoker.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.View.OnTouchListener;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ImageButton;
import android.widget.TextView;
import com.illuminate.texaspoker.p055a.LocationGroupListAdapter;
import com.illuminate.texaspoker.p059d.CountryRegion;
import com.illuminate.texaspoker.p059d.Location;
import com.illuminate.texaspoker.utils.MapList;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.utils.Utility;
import com.illuminate.texaspoker.view.LoadingDialog;
import com.illuminate.texaspoker.view.SideBar;
import com.illuminate.texaspoker.view.SideBar.C0489a;
import com.texaspoker.moment.TexasPokerHttpClub.CLUB_SEARCH_TYPE;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ClubSearchActivity extends BaseToolBarActivity {
    public static int f4094d;
    public static int f4095e;
    private static String f4096f;
    private String f4097g;
    private MapList<String, List<Location>> f4098h;
    private List<String> f4099i;
    private ExpandableListView f4100j;
    private LocationGroupListAdapter f4101k;
    private EditText f4102l;
    private ImageButton f4103m;

    /* renamed from: com.illuminate.texaspoker.activity.ClubSearchActivity.1 */
    class C04821 implements OnClickListener {
        final /* synthetic */ ClubSearchActivity f4085a;

        C04821(ClubSearchActivity clubSearchActivity) {
            this.f4085a = clubSearchActivity;
        }

        public final void onClick(View view) {
            this.f4085a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubSearchActivity.2 */
    class C04832 implements TextWatcher {
        final /* synthetic */ ClubSearchActivity f4086a;

        C04832(ClubSearchActivity clubSearchActivity) {
            this.f4086a = clubSearchActivity;
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            if (StringUtils.m4462a(this.f4086a.f4102l.getText().toString().trim())) {
                this.f4086a.f4103m.setVisibility(4);
            } else {
                this.f4086a.f4103m.setVisibility(0);
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubSearchActivity.3 */
    class C04843 implements OnKeyListener {
        final /* synthetic */ ClubSearchActivity f4087a;

        C04843(ClubSearchActivity clubSearchActivity) {
            this.f4087a = clubSearchActivity;
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (i == 66 && keyEvent.getAction() == 0) {
                ClubSearchActivity.m2965c(this.f4087a);
            }
            return false;
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubSearchActivity.4 */
    class C04854 implements OnClickListener {
        final /* synthetic */ ClubSearchActivity f4088a;

        C04854(ClubSearchActivity clubSearchActivity) {
            this.f4088a = clubSearchActivity;
        }

        public final void onClick(View view) {
            ClubSearchActivity.m2965c(this.f4088a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubSearchActivity.5 */
    class C04865 implements OnGroupClickListener {
        final /* synthetic */ ClubSearchActivity f4089a;

        C04865(ClubSearchActivity clubSearchActivity) {
            this.f4089a = clubSearchActivity;
        }

        public final boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
            return true;
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubSearchActivity.6 */
    class C04876 implements OnChildClickListener {
        final /* synthetic */ ClubSearchActivity f4090a;

        C04876(ClubSearchActivity clubSearchActivity) {
            this.f4090a = clubSearchActivity;
        }

        public final boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
            CountryRegion countryRegion = (CountryRegion) ((List) this.f4090a.f4098h.m4239a(i)).get(i2);
            if (countryRegion.f6042a.size() != 0) {
                Intent intent = new Intent(this.f4090a, ClubStateSelectActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("countryCode", countryRegion.e);
                intent.putExtras(bundle);
                this.f4090a.startActivityForResult(intent, ClubSearchActivity.f4094d);
                this.f4090a.overridePendingTransition(2131034126, 2131034126);
            } else {
                this.f4090a.m2963a(countryRegion.e);
            }
            return false;
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubSearchActivity.7 */
    class C04887 implements OnTouchListener {
        final /* synthetic */ ClubSearchActivity f4091a;

        C04887(ClubSearchActivity clubSearchActivity) {
            this.f4091a = clubSearchActivity;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            this.f4091a.m2734b();
            return false;
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubSearchActivity.8 */
    class C04908 implements C0489a {
        final /* synthetic */ ClubSearchActivity f4092a;

        C04908(ClubSearchActivity clubSearchActivity) {
            this.f4092a = clubSearchActivity;
        }

        public final void m2959a(String str) {
            int positionForSection = this.f4092a.f4101k.getPositionForSection(str.charAt(0));
            if (positionForSection != -1) {
                this.f4092a.f4100j.setSelectedGroup(positionForSection);
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubSearchActivity.9 */
    class C04919 implements DialogInterface.OnClickListener {
        final /* synthetic */ ClubSearchActivity f4093a;

        C04919(ClubSearchActivity clubSearchActivity) {
            this.f4093a = clubSearchActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    static {
        f4096f = "ClubSearchActivity";
        f4094d = 1;
        f4095e = 1;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968622);
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        if (toolbar != null) {
            toolbar.setTitleTextAppearance(this, 2131296567);
            toolbar.setNavigationIcon(2130837591);
            toolbar.setNavigationOnClickListener(new C04821(this));
        }
        this.f4098h = new MapList();
        this.f4099i = new ArrayList();
        for (Location location : Utility.m4507h()) {
            Object obj = location.f6026f;
            List list = (List) this.f4098h.m4240a(obj);
            if (list == null) {
                list = new ArrayList();
                this.f4098h.m4241a(obj, list);
                this.f4099i.add(obj);
            }
            list.add(location);
        }
        m2961a();
        SideBar sideBar = (SideBar) findViewById(2131558667);
        sideBar.setTextView((TextView) findViewById(2131558666));
        sideBar.setOnTouchingLetterChangedListener(new C04908(this));
    }

    protected void onResume() {
        super.onResume();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == f4094d && i2 == -1) {
            Bundle extras = intent.getExtras();
            String string = extras.getString("countryCode");
            this.f4097g = string + "-" + extras.getString("stateCode");
            m2963a(this.f4097g);
        }
    }

    private void m2961a() {
        this.f4102l = (EditText) findViewById(2131558665);
        this.f4102l.addTextChangedListener(new C04832(this));
        this.f4102l.setOnKeyListener(new C04843(this));
        this.f4103m = (ImageButton) findViewById(2131558664);
        this.f4103m.setOnClickListener(new C04854(this));
        this.f4100j = (ExpandableListView) findViewById(2131558605);
        this.f4101k = new LocationGroupListAdapter(this, this.f4098h);
        this.f4100j.setAdapter(this.f4101k);
        this.f4100j.setOnGroupClickListener(new C04865(this));
        this.f4100j.setOnChildClickListener(new C04876(this));
        this.f4100j.setOnTouchListener(new C04887(this));
        int a = this.f4098h.m4238a();
        for (int i = 0; i < a; i++) {
            this.f4100j.expandGroup(i);
        }
    }

    private void m2963a(String str) {
        this.b = new LoadingDialog(this);
        this.b.show();
        this.f4097g = str;
        NetworkUtil.m4073a();
        NetworkUtil.m4139b(str, 0);
    }

    protected final void m2969a(String str, List<Object> list) {
        List list2;
        Intent intent;
        if (str.equalsIgnoreCase("NOTIFY_SEARCH_CLUB_RESULT")) {
            list2 = (List) list.get(0);
            this.b.dismiss();
            if (list2.size() > 0) {
                String trim = this.f4102l.getText().toString().trim();
                new StringBuilder("clubBaseInfoList.size=").append(list2.size());
                Serializable arrayList = new ArrayList(list2);
                intent = new Intent(this, ClubSearchResultActivity.class);
                intent.putExtra("searchKey", trim);
                intent.putExtra("fromSearch", true);
                intent.putExtra("search_result", arrayList);
                startActivity(intent);
                return;
            }
            new Builder(this).setTitle(2131165412).setMessage(2131165411).setPositiveButton(2131165438, new C04919(this)).show();
        } else if (str.equalsIgnoreCase("NOTIFY_GET_CLUB_BY_LOCATION_RESULT")) {
            list2 = (List) list.get(0);
            this.b.dismiss();
            new StringBuilder("clubBaseInfoList.size=").append(list2.size());
            Serializable arrayList2 = new ArrayList(list2);
            intent = new Intent(this, ClubSearchResultActivity.class);
            intent.putExtra("searchKey", this.f4097g);
            intent.putExtra("fromSearch", false);
            intent.putExtra("search_result", arrayList2);
            this.f4097g = null;
            startActivity(intent);
        }
    }

    static /* synthetic */ void m2965c(ClubSearchActivity clubSearchActivity) {
        String trim = clubSearchActivity.f4102l.getText().toString().trim();
        if (!StringUtils.m4462a((CharSequence) trim)) {
            clubSearchActivity.b = new LoadingDialog(clubSearchActivity);
            clubSearchActivity.b.show();
            NetworkUtil.m4073a();
            NetworkUtil.m4112a(trim, 0, CLUB_SEARCH_TYPE.CLUB_OTHER_SEARCH);
        }
    }
}
