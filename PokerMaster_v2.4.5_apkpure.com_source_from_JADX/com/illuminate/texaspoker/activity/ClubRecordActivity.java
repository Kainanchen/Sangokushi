package com.illuminate.texaspoker.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.illuminate.texaspoker.p055a.ClubRecordPagerAdapter;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.view.LoadingDialog;
import com.texaspoker.moment.TexasPokerHttpClub.CLUB_SEARCH_TYPE;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ClubRecordActivity extends BaseToolBarActivity {
    private static String f4073d;
    private LayoutInflater f4074e;
    private List<ChatRoom> f4075f;
    private View f4076g;
    private View f4077h;
    private ClubRecordPagerAdapter f4078i;
    private List<ImageView> f4079j;
    private int f4080k;
    private ViewPager f4081l;
    private ViewGroup f4082m;
    private EditText f4083n;
    private ImageButton f4084o;

    /* renamed from: com.illuminate.texaspoker.activity.ClubRecordActivity.1 */
    class C04731 implements OnClickListener {
        final /* synthetic */ ClubRecordActivity f4064a;

        C04731(ClubRecordActivity clubRecordActivity) {
            this.f4064a = clubRecordActivity;
        }

        public final void onClick(View view) {
            this.f4064a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubRecordActivity.2 */
    class C04742 implements OnPageChangeListener {
        final /* synthetic */ ClubRecordActivity f4065a;

        C04742(ClubRecordActivity clubRecordActivity) {
            this.f4065a = clubRecordActivity;
        }

        public final void onPageScrolled(int i, float f, int i2) {
        }

        public final void onPageSelected(int i) {
            this.f4065a.m2952a(i);
        }

        public final void onPageScrollStateChanged(int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubRecordActivity.3 */
    class C04753 implements OnClickListener {
        final /* synthetic */ ClubRecordActivity f4066a;

        C04753(ClubRecordActivity clubRecordActivity) {
            this.f4066a = clubRecordActivity;
        }

        public final void onClick(View view) {
            this.f4066a.startActivity(new Intent(this.f4066a, NewClubActivity.class));
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubRecordActivity.4 */
    class C04764 implements OnClickListener {
        final /* synthetic */ ClubRecordActivity f4067a;

        C04764(ClubRecordActivity clubRecordActivity) {
            this.f4067a = clubRecordActivity;
        }

        public final void onClick(View view) {
            this.f4067a.startActivity(new Intent(this.f4066a, NewClubActivity.class));
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubRecordActivity.5 */
    class C04775 implements TextWatcher {
        final /* synthetic */ ClubRecordActivity f4068a;

        C04775(ClubRecordActivity clubRecordActivity) {
            this.f4068a = clubRecordActivity;
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            if (StringUtils.m4462a(editable.toString())) {
                this.f4068a.f4084o.setEnabled(false);
            } else {
                this.f4068a.f4084o.setEnabled(true);
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubRecordActivity.6 */
    class C04786 implements OnEditorActionListener {
        final /* synthetic */ ClubRecordActivity f4069a;

        C04786(ClubRecordActivity clubRecordActivity) {
            this.f4069a = clubRecordActivity;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 3) {
                return false;
            }
            ClubRecordActivity.m2956c(this.f4069a);
            return true;
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubRecordActivity.7 */
    class C04797 implements OnClickListener {
        final /* synthetic */ ClubRecordActivity f4070a;

        C04797(ClubRecordActivity clubRecordActivity) {
            this.f4070a = clubRecordActivity;
        }

        public final void onClick(View view) {
            ClubRecordActivity.m2956c(this.f4070a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubRecordActivity.8 */
    class C04808 implements DialogInterface.OnClickListener {
        final /* synthetic */ ClubRecordActivity f4071a;

        C04808(ClubRecordActivity clubRecordActivity) {
            this.f4071a = clubRecordActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubRecordActivity.9 */
    class C04819 implements DialogInterface.OnClickListener {
        final /* synthetic */ ClubRecordActivity f4072a;

        C04819(ClubRecordActivity clubRecordActivity) {
            this.f4072a = clubRecordActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    static {
        f4073d = "ClubRecordActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968621);
        this.f4080k = 0;
        this.f4079j = new ArrayList();
        this.f4075f = new ArrayList();
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C04731(this));
        this.f4074e = LayoutInflater.from(this);
        this.f4076g = findViewById(2131558656);
        this.f4077h = findViewById(2131558653);
        this.f4081l = (ViewPager) findViewById(2131558657);
        this.f4078i = new ClubRecordPagerAdapter(this, this.f4075f);
        this.f4081l.setAdapter(this.f4078i);
        this.f4081l.addOnPageChangeListener(new C04742(this));
        this.f4082m = (ViewGroup) findViewById(2131558658);
        ((Button) findViewById(2131558659)).setOnClickListener(new C04753(this));
        ((ImageButton) findViewById(2131558660)).setOnClickListener(new C04764(this));
        this.f4083n = (EditText) findViewById(2131558662);
        this.f4083n.addTextChangedListener(new C04775(this));
        this.f4083n.setOnEditorActionListener(new C04786(this));
        this.f4084o = (ImageButton) findViewById(2131558661);
        this.f4084o.setEnabled(false);
        this.f4084o.setOnClickListener(new C04797(this));
    }

    protected void onResume() {
        super.onResume();
        if (!DBManager.m3631a().m3632b()) {
            Collection c = DBManager.m3631a().f5565e.m3605c();
            this.f4075f.clear();
            if (c.size() > 0) {
                this.f4075f.addAll(c);
                this.f4077h.setVisibility(8);
                this.f4076g.setVisibility(0);
            } else {
                this.f4077h.setVisibility(0);
                this.f4076g.setVisibility(8);
            }
            this.f4079j.clear();
            this.f4082m.removeAllViews();
            for (int i = 0; i < this.f4075f.size(); i++) {
                View inflate = this.f4074e.inflate(2130968722, null);
                ImageView imageView = (ImageView) inflate.findViewById(2131559014);
                imageView.setEnabled(false);
                imageView.setTag(Integer.valueOf(i));
                this.f4079j.add(imageView);
                this.f4082m.addView(inflate);
            }
            this.f4078i.notifyDataSetChanged();
            if (this.f4075f.size() - 1 < this.f4080k) {
                this.f4080k = this.f4075f.size() - 1;
                this.f4081l.setCurrentItem(this.f4080k);
            }
            m2952a(this.f4080k);
        }
    }

    private void m2952a(int i) {
        if (i >= 0 && i <= this.f4079j.size() - 1) {
            ((ImageView) this.f4079j.get(this.f4080k)).setEnabled(false);
            ((ImageView) this.f4079j.get(i)).setEnabled(true);
            this.f4080k = i;
        }
    }

    protected final void m2957a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_REFRESH_IMAGE")) {
            if (!DBManager.m3631a().m3632b()) {
                this.f4078i.notifyDataSetChanged();
            }
        } else if (str.equalsIgnoreCase("NOTIFY_SEARCH_CLUB_RESULT")) {
            List list2 = (List) list.get(0);
            this.b.dismiss();
            if (list2.size() > 0) {
                String trim = this.f4083n.getText().toString().trim();
                Serializable arrayList = new ArrayList(list2);
                Intent intent = new Intent(this, ClubSearchResultActivity.class);
                intent.putExtra("searchKey", trim);
                intent.putExtra("fromSearch", true);
                intent.putExtra("search_result", arrayList);
                startActivity(intent);
                return;
            }
            new Builder(this).setTitle(2131165412).setMessage(2131165411).setPositiveButton(2131165438, new C04819(this)).show();
        }
    }

    static /* synthetic */ void m2956c(ClubRecordActivity clubRecordActivity) {
        String trim = clubRecordActivity.f4083n.getText().toString().trim();
        if (!StringUtils.m4462a((CharSequence) trim)) {
            if (trim.length() > 10) {
                new Builder(clubRecordActivity).setTitle(2131165514).setMessage(2131165355).setPositiveButton(2131165438, new C04808(clubRecordActivity)).show();
                return;
            }
            clubRecordActivity.m2734b();
            clubRecordActivity.b = new LoadingDialog(clubRecordActivity);
            clubRecordActivity.b.show();
            NetworkUtil.m4073a();
            NetworkUtil.m4112a(trim, 0, CLUB_SEARCH_TYPE.CLUB_ID_SEARCH);
        }
    }
}
