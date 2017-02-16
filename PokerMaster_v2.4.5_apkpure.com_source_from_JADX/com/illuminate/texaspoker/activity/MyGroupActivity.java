package com.illuminate.texaspoker.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.illuminate.texaspoker.dao.ChatRoomDao.Properties;
import com.illuminate.texaspoker.p055a.af;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.texaspoker.moment.TexasPoker.CHAT_TYPE;
import java.util.ArrayList;
import java.util.List;
import org.a.a.d.g;
import org.a.a.d.i;
import org.a.a.f;

public class MyGroupActivity extends BaseToolBarActivity {
    private static String f4707d;
    private List<ChatRoom> f4708e;
    private af f4709f;
    private View f4710g;
    private View f4711h;
    private TextView f4712i;

    /* renamed from: com.illuminate.texaspoker.activity.MyGroupActivity.1 */
    class C06971 implements OnClickListener {
        final /* synthetic */ MyGroupActivity f4705a;

        C06971(MyGroupActivity myGroupActivity) {
            this.f4705a = myGroupActivity;
        }

        public final void onClick(View view) {
            this.f4705a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.MyGroupActivity.2 */
    class C06982 implements OnItemClickListener {
        final /* synthetic */ MyGroupActivity f4706a;

        C06982(MyGroupActivity myGroupActivity) {
            this.f4706a = myGroupActivity;
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            MyGroupActivity.m3230a(this.f4706a, ((ChatRoom) this.f4706a.f4708e.get(i)).f5741b.longValue());
        }
    }

    static {
        f4707d = "MyGroupActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968652);
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        if (toolbar != null) {
            toolbar.setTitleTextAppearance(this, 2131296567);
            toolbar.setNavigationIcon(2130837591);
            toolbar.setNavigationOnClickListener(new C06971(this));
        }
        this.f4708e = new ArrayList();
        ListView listView = (ListView) findViewById(2131558779);
        View inflate = LayoutInflater.from(this).inflate(2130968803, null);
        if (listView != null) {
            listView.addFooterView(inflate, null, false);
        }
        this.f4712i = (TextView) inflate.findViewById(2131559280);
        this.f4709f = new af(this, this.f4708e);
        if (listView != null) {
            listView.setAdapter(this.f4709f);
            listView.setOnItemClickListener(new C06982(this));
        }
        this.f4710g = findViewById(2131558780);
        this.f4711h = findViewById(2131558778);
    }

    private void m3229a() {
        if (!DBManager.m3631a().m3632b()) {
            this.f4708e.clear();
            g a = g.a(DBManager.m3631a().f5565e.f5527b.f6426A);
            a.a(Properties.f6153K.a(Integer.valueOf(CHAT_TYPE.CHAT_TYPE_GROUP.getNumber())), new i[0]);
            a.a(Properties.f6144B.a(Boolean.valueOf(false)), new i[0]);
            a.a(Properties.f6146D.a(Boolean.valueOf(true)), new i[0]);
            a.a(Properties.f6147E.a(Boolean.valueOf(false)), new i[0]);
            a.b(new f[]{Properties.f6170f});
            this.f4708e.addAll(a.a().b());
            if (this.f4708e.size() > 0) {
                this.f4710g.setVisibility(4);
                this.f4711h.setVisibility(0);
            } else {
                this.f4710g.setVisibility(0);
                this.f4711h.setVisibility(4);
            }
            this.f4709f.notifyDataSetChanged();
            this.f4712i.setText(String.format(getResources().getString(2131165768), new Object[]{Integer.valueOf(this.f4708e.size())}));
        }
    }

    protected void onResume() {
        super.onResume();
        m3229a();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131559447) {
            return super.onOptionsItemSelected(menuItem);
        }
        Intent intent = new Intent(this, NewGroupActivity.class);
        intent.putExtra("fromSingle", false);
        intent.putExtra("lChatRoomId", -1);
        startActivity(intent);
        return true;
    }

    protected final void m3231a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_REFRESH_IMAGE")) {
            m3229a();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_MOMENTS")) {
            m3229a();
        }
    }

    static /* synthetic */ void m3230a(MyGroupActivity myGroupActivity, long j) {
        Intent intent = new Intent(myGroupActivity, ChatRoomActivity.class);
        Bundle bundle = new Bundle();
        bundle.putInt("eTalkType", 2);
        bundle.putLong("lChatRoomId", j);
        intent.putExtras(bundle);
        myGroupActivity.startActivity(intent);
    }
}
