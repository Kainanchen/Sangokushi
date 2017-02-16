package com.illuminate.texaspoker.activity;

import a.does.not.Exists2;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.media.MediaRecorder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.ali.fixHelper;
import com.android.volley.DefaultRetryPolicy;
import com.illuminate.texaspoker.application.BaseApplication;
import com.illuminate.texaspoker.dao.BillDao;
import com.illuminate.texaspoker.dao.GameRoomDao.Properties;
import com.illuminate.texaspoker.dao.PokerHistoryDao;
import com.illuminate.texaspoker.dao.UserBillDao;
import com.illuminate.texaspoker.p055a.ChatGameAdapter;
import com.illuminate.texaspoker.p055a.ChatMsgListAdapter;
import com.illuminate.texaspoker.p055a.ExpressionAdapter;
import com.illuminate.texaspoker.p057b.BillDBManager;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p057b.GameRoomDBManager;
import com.illuminate.texaspoker.p057b.PokerHistoryDBManager;
import com.illuminate.texaspoker.p057b.UserBillDBManager;
import com.illuminate.texaspoker.p058c.Bill;
import com.illuminate.texaspoker.p058c.ChatMsg;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.illuminate.texaspoker.p058c.FriendUser;
import com.illuminate.texaspoker.p058c.GameRoom;
import com.illuminate.texaspoker.p058c.PokerHistory;
import com.illuminate.texaspoker.p058c.UserBill;
import com.illuminate.texaspoker.p059d.Expression;
import com.illuminate.texaspoker.utils.MapList;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.RuntimeData;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.utils.Utility;
import com.illuminate.texaspoker.utils.VoiceFileUtility;
import com.illuminate.texaspoker.view.LoadingDialog;
import com.illuminate.texaspoker.view.refreshlayout.RefreshDefaultHandler;
import com.illuminate.texaspoker.view.refreshlayout.RefreshDefaultLayout;
import com.illuminate.texaspoker.view.refreshlayout.RefreshHandler;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage;
import com.texaspoker.moment.TexasPoker.CHAT_MESSAGE_TYPE;
import com.texaspoker.moment.TexasPoker.CHAT_TYPE;
import com.texaspoker.moment.TexasPokerHttpBill.BillInfoNet;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.a.a.d.g;
import org.a.a.d.i;
import org.cocos2dx.lua.AppActivity;

public class ChatRoomActivity extends BaseToolBarActivity implements SensorEventListener {
    private static String f3776A;
    private static int aC;
    private static int aD;
    private static String aF;
    public static int f3777d;
    public static int f3778e;
    public static int f3779f;
    public static int f3780g;
    public static int f3781h;
    public static int f3782i;
    public static int f3783j;
    public static int f3784k;
    private static String f3785n;
    private Pattern f3786B;
    private MapList<Long, ChatMsg> f3787C;
    private ChatRoom f3788D;
    private FriendUser f3789E;
    private ChatMsgListAdapter f3790F;
    private ListView f3791G;
    private View f3792H;
    private ImageButton f3793I;
    private ImageButton f3794J;
    private ImageButton f3795K;
    private Button f3796L;
    private Button f3797M;
    private EditText f3798N;
    private ImageButton f3799O;
    private View f3800P;
    private GridView f3801Q;
    private ExpressionAdapter f3802R;
    private View f3803S;
    private ImageButton f3804T;
    private ImageButton f3805U;
    private ImageButton f3806V;
    private View f3807W;
    private View f3808X;
    private ImageView f3809Y;
    private View f3810Z;
    private ChatGameAdapter aA;
    private ImageButton aB;
    private MediaRecorder aE;
    private File aG;
    private int aH;
    private long aI;
    private Timer aJ;
    private Timer aK;
    private double aL;
    private Handler aM;
    private PowerManager aa;
    private WakeLock ab;
    private AudioManager ac;
    private SensorManager ad;
    private Sensor ae;
    private boolean af;
    private View ag;
    private boolean ah;
    private Button ai;
    private Button aj;
    private TextView ak;
    private TextView al;
    private View am;
    private View an;
    private View ao;
    private View ap;
    private View aq;
    private TextView ar;
    private View as;
    private TextView at;
    private long au;
    private int av;
    private View aw;
    private View ax;
    private RefreshDefaultLayout ay;
    private List<GameRoom> az;
    long f3811l;
    long f3812m;
    private int f3813o;
    private boolean f3814p;
    private Toolbar f3815q;
    private int f3816r;
    private boolean f3817s;
    private boolean f3818t;
    private boolean f3819u;
    private long f3820v;
    private int f3821w;
    private boolean f3822x;
    private boolean f3823y;
    private boolean f3824z;

    /* renamed from: com.illuminate.texaspoker.activity.ChatRoomActivity.1 */
    class C03921 implements OnClickListener {
        final /* synthetic */ ChatRoomActivity f3747a;

        C03921(ChatRoomActivity chatRoomActivity) {
            this.f3747a = chatRoomActivity;
        }

        public final void onClick(View view) {
            this.f3747a.m2878b();
            this.f3747a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ChatRoomActivity.2 */
    class C03972 implements OnGlobalLayoutListener {
        final /* synthetic */ ChatRoomActivity f3762a;

        C03972(ChatRoomActivity chatRoomActivity) {
            this.f3762a = chatRoomActivity;
        }

        public final void onGlobalLayout() {
            this.f3762a.m2735c();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ChatRoomActivity.3 */
    class C03993 implements OnClickListener {
        final /* synthetic */ ChatRoomActivity f3768a;

        C03993(ChatRoomActivity chatRoomActivity) {
            this.f3768a = chatRoomActivity;
        }

        public final void onClick(View view) {
            ChatRoomActivity.m2804F(this.f3768a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ChatRoomActivity.4 */
    class C04004 implements OnClickListener {
        final /* synthetic */ ChatRoomActivity f3769a;

        C04004(ChatRoomActivity chatRoomActivity) {
            this.f3769a = chatRoomActivity;
        }

        public final void onClick(View view) {
            this.f3769a.m2834c(false);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ChatRoomActivity.5 */
    class C04015 implements OnClickListener {
        final /* synthetic */ ChatRoomActivity f3770a;

        C04015(ChatRoomActivity chatRoomActivity) {
            this.f3770a = chatRoomActivity;
        }

        public final void onClick(View view) {
            ChatRoomActivity.m2806H(this.f3770a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ChatRoomActivity.6 */
    class C04026 implements OnClickListener {
        final /* synthetic */ ChatRoomActivity f3771a;

        C04026(ChatRoomActivity chatRoomActivity) {
            this.f3771a = chatRoomActivity;
        }

        public final void onClick(View view) {
            ChatRoomActivity.m2807I(this.f3771a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ChatRoomActivity.7 */
    class C04037 implements OnFocusChangeListener {
        final /* synthetic */ ChatRoomActivity f3772a;

        C04037(ChatRoomActivity chatRoomActivity) {
            this.f3772a = chatRoomActivity;
        }

        public final void onFocusChange(View view, boolean z) {
            ChatRoomActivity.m2833c(this.f3772a, z);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ChatRoomActivity.8 */
    class C04048 implements TextWatcher {
        final /* synthetic */ ChatRoomActivity f3773a;

        C04048(ChatRoomActivity chatRoomActivity) {
            this.f3773a = chatRoomActivity;
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            this.f3773a.m2855m();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ChatRoomActivity.9 */
    class C04069 implements OnTouchListener {
        final /* synthetic */ ChatRoomActivity f3775a;

        /* renamed from: com.illuminate.texaspoker.activity.ChatRoomActivity.9.1 */
        class C04051 implements Runnable {
            final /* synthetic */ C04069 f3774a;

            static {
                fixHelper.fixfunc(new int[]{821, 822});
                if (VERSION.SDK_INT <= 0) {
                    Exists2.class.toString();
                }
            }

            native C04051(C04069 c04069);

            public final native void run();
        }

        C04069(ChatRoomActivity chatRoomActivity) {
            this.f3775a = chatRoomActivity;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            this.f3775a.m2862p();
            if (this.f3775a.f3823y) {
                ChatRoomActivity.m2810L(this.f3775a);
            }
            if (this.f3775a.f3824z) {
                ChatRoomActivity.m2806H(this.f3775a);
            }
            if (this.f3775a.m2735c() == 0) {
                this.f3775a.f3798N.postDelayed(new C04051(this), 400);
            }
            return false;
        }
    }

    public ChatRoomActivity() {
        this.af = false;
        this.ah = true;
        this.au = 0;
        this.aL = 0.0d;
        this.aM = new Handler() {
            final /* synthetic */ ChatRoomActivity f3749a;

            {
                this.f3749a = r1;
            }

            public final void handleMessage(Message message) {
                if (message.what == ChatRoomActivity.aC) {
                    if (this.f3749a.aH == 300) {
                        this.f3749a.m2838d(false);
                        this.f3749a.m2867s();
                    } else {
                        this.f3749a.aH = this.f3749a.aH + 1;
                    }
                } else if (message.what == ChatRoomActivity.aD) {
                    ChatRoomActivity.m2819U(this.f3749a);
                }
                super.handleMessage(message);
            }
        };
    }

    static /* synthetic */ void m2804F(ChatRoomActivity chatRoomActivity) {
        chatRoomActivity.f3793I.setVisibility(4);
        chatRoomActivity.f3794J.setVisibility(0);
        chatRoomActivity.f3795K.setVisibility(0);
        chatRoomActivity.f3797M.setVisibility(0);
        chatRoomActivity.f3800P.setVisibility(4);
        chatRoomActivity.f3798N.setVisibility(8);
        chatRoomActivity.f3799O.setVisibility(4);
        chatRoomActivity.f3796L.setVisibility(4);
        chatRoomActivity.f3798N.clearFocus();
        chatRoomActivity.f3823y = false;
        chatRoomActivity.f3824z = false;
        chatRoomActivity.f3799O.setBackgroundResource(2130837605);
        chatRoomActivity.f3792H.setVisibility(8);
        chatRoomActivity.m2878b();
    }

    static /* synthetic */ void m2806H(ChatRoomActivity chatRoomActivity) {
        if (chatRoomActivity.f3824z) {
            chatRoomActivity.f3798N.requestFocus();
            chatRoomActivity.f3824z = false;
            chatRoomActivity.f3803S.setVisibility(4);
            chatRoomActivity.m2859o();
            return;
        }
        chatRoomActivity.f3798N.clearFocus();
        chatRoomActivity.f3824z = true;
        chatRoomActivity.f3823y = false;
        chatRoomActivity.f3801Q.setVisibility(4);
        chatRoomActivity.f3799O.setBackgroundResource(2130837605);
        chatRoomActivity.f3803S.setVisibility(0);
        chatRoomActivity.m2834c(true);
        chatRoomActivity.m2858n();
    }

    static /* synthetic */ void m2810L(ChatRoomActivity chatRoomActivity) {
        chatRoomActivity.f3798N.requestFocus();
        if (chatRoomActivity.f3823y) {
            chatRoomActivity.f3823y = false;
            chatRoomActivity.f3799O.setBackgroundResource(2130837605);
            chatRoomActivity.f3801Q.setVisibility(4);
            chatRoomActivity.m2859o();
            return;
        }
        chatRoomActivity.f3823y = true;
        chatRoomActivity.f3824z = false;
        chatRoomActivity.f3799O.setBackgroundResource(2130903075);
        chatRoomActivity.f3803S.setVisibility(4);
        chatRoomActivity.f3801Q.setVisibility(0);
        chatRoomActivity.m2858n();
    }

    static /* synthetic */ void m2819U(ChatRoomActivity chatRoomActivity) {
        if (chatRoomActivity.aE != null) {
            double maxAmplitude = ((double) chatRoomActivity.aE.getMaxAmplitude()) / 1.0d;
            chatRoomActivity.aL += maxAmplitude;
            if (maxAmplitude > 1.0d) {
                maxAmplitude = Math.log10(maxAmplitude) * 20.0d;
            } else {
                maxAmplitude = 0.0d;
            }
            if (maxAmplitude >= 0.0d && maxAmplitude < 20.0d) {
                chatRoomActivity.f3809Y.setImageBitmap(null);
            } else if (maxAmplitude >= 20.0d && maxAmplitude < 40.0d) {
                chatRoomActivity.f3809Y.setImageResource(2130903616);
            } else if (maxAmplitude >= 40.0d && maxAmplitude < 60.0d) {
                chatRoomActivity.f3809Y.setImageResource(2130903617);
            } else if (maxAmplitude >= 60.0d && maxAmplitude < 80.0d) {
                chatRoomActivity.f3809Y.setImageResource(2130903618);
            } else if (maxAmplitude >= 80.0d && maxAmplitude < 100.0d) {
                chatRoomActivity.f3809Y.setImageResource(2130903619);
            } else if (maxAmplitude >= 100.0d && maxAmplitude < 120.0d) {
                chatRoomActivity.f3809Y.setImageResource(2130903620);
            } else if (maxAmplitude >= 120.0d && maxAmplitude < 140.0d) {
                chatRoomActivity.f3809Y.setImageResource(2130903621);
            }
        }
    }

    static /* synthetic */ void m2823a(ChatRoomActivity chatRoomActivity, int i) {
        int selectionStart = chatRoomActivity.f3798N.getSelectionStart();
        int selectionEnd = chatRoomActivity.f3798N.getSelectionEnd();
        if (i + 1 != RuntimeData.f6692w.size()) {
            Object obj;
            CharSequence text = chatRoomActivity.f3798N.getText();
            text.delete(selectionStart, selectionEnd);
            Expression expression = (Expression) RuntimeData.f6692w.get(i);
            if (Utility.m4480a()) {
                obj = expression.f6045b;
            } else if (Utility.m4485b()) {
                r1 = expression.f6046c;
            } else {
                r1 = expression.f6044a;
            }
            text.insert(selectionStart, obj);
            CharSequence spannableStringBuilder = new SpannableStringBuilder(text);
            Matcher matcher = chatRoomActivity.f3786B.matcher(text);
            while (matcher.find()) {
                expression = (Expression) RuntimeData.f6691v.get(matcher.group());
                if (expression != null) {
                    spannableStringBuilder.setSpan(new ImageSpan(chatRoomActivity, BitmapFactory.decodeResource(chatRoomActivity.getResources(), expression.f6047d), 0), matcher.start(), matcher.end(), 33);
                }
            }
            chatRoomActivity.f3798N.setText(spannableStringBuilder);
            chatRoomActivity.f3798N.setSelection(obj.length() + selectionStart);
        } else if (selectionStart == selectionEnd) {
            chatRoomActivity.f3798N.onKeyDown(67, new KeyEvent(0, 67));
        } else {
            chatRoomActivity.f3798N.getText().delete(selectionStart, selectionEnd);
        }
    }

    static /* synthetic */ void m2860o(ChatRoomActivity chatRoomActivity) {
        if (chatRoomActivity.f3822x) {
            Intent intent = new Intent(chatRoomActivity, CreateGameActivity.class);
            intent.putExtra("lChatRoomId", chatRoomActivity.f3820v);
            chatRoomActivity.startActivityForResult(intent, f3779f);
            chatRoomActivity.overridePendingTransition(2131034124, 0);
            return;
        }
        int i;
        if (chatRoomActivity.f3821w == 1) {
            i = 2131165304;
        } else {
            i = 2131165291;
        }
        chatRoomActivity.m2732a(2130903246, i, 1);
    }

    static {
        f3785n = "ChatRoomActivity";
        f3777d = 1;
        f3778e = 2;
        f3779f = 3;
        f3780g = 1;
        f3781h = 2;
        f3782i = 3;
        f3783j = 4;
        f3784k = 5;
        f3776A = "\\[[a-zA-Z0-9\\-\\\\!\\u4e00-\\u9fa5]+\\]";
        aC = 1;
        aD = 2;
        aF = VoiceFileUtility.f6576a + "voice_temp";
    }

    protected void onCreate(Bundle bundle) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.f3813o = displayMetrics.widthPixels;
        this.f3818t = false;
        this.f3822x = false;
        this.f3819u = false;
        this.f3823y = false;
        this.f3824z = false;
        Bundle extras = getIntent().getExtras();
        this.f3820v = extras.getLong("lChatRoomId");
        this.f3821w = extras.getInt("eTalkType");
        this.f3788D = DBManager.m3631a().f5565e.m3590a(this.f3820v, this.f3821w);
        this.f3786B = Pattern.compile(f3776A);
        if (this.f3821w == 1) {
            this.f3816r = 2131165304;
        } else {
            this.f3816r = 2131165291;
        }
        super.onCreate(bundle);
        setContentView(2130968611);
        this.f3815q = (Toolbar) findViewById(2131558769);
        setSupportActionBar(this.f3815q);
        this.f3815q.setTitleTextAppearance(this, 2131296567);
        this.f3815q.setNavigationIcon(2130837591);
        this.f3815q.setNavigationOnClickListener(new C03921(this));
        this.aa = (PowerManager) getSystemService("power");
        this.ac = (AudioManager) getSystemService("audio");
        this.ad = (SensorManager) getSystemService("sensor");
        this.ae = this.ad.getDefaultSensor(8);
        this.ag = findViewById(2131558562);
        this.ai = (Button) findViewById(2131558563);
        this.aj = (Button) findViewById(2131558568);
        this.ak = (TextView) findViewById(2131558564);
        this.al = (TextView) findViewById(2131558569);
        this.am = findViewById(2131558567);
        this.an = findViewById(2131558572);
        this.ao = findViewById(2131558578);
        this.ap = findViewById(2131558574);
        this.aq = findViewById(2131558565);
        this.ar = (TextView) findViewById(2131558566);
        this.as = findViewById(2131558570);
        this.at = (TextView) findViewById(2131558571);
        this.ai.setOnClickListener(new OnClickListener() {
            final /* synthetic */ ChatRoomActivity f3739a;

            {
                this.f3739a = r1;
            }

            public final void onClick(View view) {
                this.f3739a.ah = true;
                this.f3739a.ai.setEnabled(false);
                this.f3739a.ak.setTextColor(-1783665);
                this.f3739a.am.setVisibility(0);
                this.f3739a.ao.setVisibility(0);
                this.f3739a.aj.setEnabled(true);
                this.f3739a.al.setTextColor(-9211280);
                this.f3739a.an.setVisibility(4);
                this.f3739a.ap.setVisibility(4);
                DBManager.m3631a().f5566f.m3580c(this.f3739a.f3820v, this.f3739a.f3821w);
                DBManager.m3631a().f5572l.m3667b(this.f3739a.f3820v);
                this.f3739a.m2842f();
            }
        });
        this.aj.setOnClickListener(new OnClickListener() {
            final /* synthetic */ ChatRoomActivity f3751a;

            {
                this.f3751a = r1;
            }

            public final void onClick(View view) {
                this.f3751a.ah = false;
                this.f3751a.aj.setEnabled(false);
                this.f3751a.al.setTextColor(-1783665);
                this.f3751a.an.setVisibility(0);
                this.f3751a.ap.setVisibility(0);
                this.f3751a.ai.setEnabled(true);
                this.f3751a.ak.setTextColor(-9211280);
                this.f3751a.am.setVisibility(4);
                this.f3751a.ao.setVisibility(4);
                DBManager.m3631a().f5572l.m3667b(this.f3751a.f3820v);
                this.f3751a.m2840e();
                this.f3751a.m2842f();
            }
        });
        this.aB = (ImageButton) findViewById(2131558573);
        this.aB.setOnClickListener(new OnClickListener() {
            final /* synthetic */ ChatRoomActivity f3756a;

            {
                this.f3756a = r1;
            }

            public final void onClick(View view) {
                Context context = this.f3756a;
                context.startActivity(new Intent(context, BuyInMsgActivity.class));
            }
        });
        this.av = 0;
        this.az = new ArrayList();
        this.ax = findViewById(2131558575);
        this.aw = findViewById(2131558576);
        ListView listView = (ListView) findViewById(2131558577);
        listView.addHeaderView(View.inflate(this, 2130968748, null), null, true);
        this.aA = new ChatGameAdapter(this, this.az);
        listView.setAdapter(this.aA);
        this.ay = (RefreshDefaultLayout) findViewById(2131558544);
        this.ay.setPtrHandler(new RefreshHandler() {
            final /* synthetic */ ChatRoomActivity f3761a;

            /* renamed from: com.illuminate.texaspoker.activity.ChatRoomActivity.29.1 */
            class C03931 implements Runnable {
                final /* synthetic */ AnonymousClass29 f3757a;

                C03931(AnonymousClass29 anonymousClass29) {
                    this.f3757a = anonymousClass29;
                }

                public final void run() {
                    this.f3757a.f3761a.m2840e();
                }
            }

            /* renamed from: com.illuminate.texaspoker.activity.ChatRoomActivity.29.2 */
            class C03962 implements Runnable {
                final /* synthetic */ AnonymousClass29 f3760a;

                /* renamed from: com.illuminate.texaspoker.activity.ChatRoomActivity.29.2.1 */
                class C03941 implements DialogInterface.OnClickListener {
                    final /* synthetic */ C03962 f3758a;

                    static {
                        fixHelper.fixfunc(new int[]{3440, 3441});
                        if (VERSION.SDK_INT <= 0) {
                            Exists2.class.toString();
                        }
                    }

                    native C03941(C03962 c03962);

                    public final native void onClick(DialogInterface dialogInterface, int i);
                }

                /* renamed from: com.illuminate.texaspoker.activity.ChatRoomActivity.29.2.2 */
                class C03952 implements DialogInterface.OnClickListener {
                    final /* synthetic */ C03962 f3759a;

                    static {
                        fixHelper.fixfunc(new int[]{3429, 3430});
                        if (VERSION.SDK_INT <= 0) {
                            Exists2.class.toString();
                        }
                    }

                    native C03952(C03962 c03962);

                    public final native void onClick(DialogInterface dialogInterface, int i);
                }

                C03962(AnonymousClass29 anonymousClass29) {
                    this.f3760a = anonymousClass29;
                }

                public final void run() {
                    if (this.f3760a.f3761a.ay.m4589a()) {
                        this.f3760a.f3761a.ay.m4590b();
                        if (!this.f3760a.f3761a.isFinishing()) {
                            new Builder(this.f3760a.f3761a).setTitle(2131165514).setMessage(2131165425).setPositiveButton(2131165481, new C03952(this)).setNegativeButton(2131165432, new C03941(this)).show();
                        }
                    }
                }
            }

            {
                this.f3761a = r1;
            }

            public final void m2797a() {
                new Handler().post(new C03931(this));
                new Handler().postDelayed(new C03962(this), 20000);
            }

            public final boolean m2798a(View view) {
                return RefreshDefaultHandler.m4596b(view);
            }
        });
        listView.setOnItemClickListener(new OnItemClickListener() {
            final /* synthetic */ ChatRoomActivity f3763a;

            {
                this.f3763a = r1;
            }

            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (i == 0) {
                    ChatRoomActivity.m2860o(this.f3763a);
                    return;
                }
                ChatRoomActivity.m2825a(this.f3763a, (GameRoom) this.f3763a.az.get(i - 1));
            }
        });
        findViewById(2131558561).getViewTreeObserver().addOnGlobalLayoutListener(new C03972(this));
        this.f3793I = (ImageButton) findViewById(2131558883);
        this.f3793I.setOnClickListener(new C03993(this));
        this.f3794J = (ImageButton) findViewById(2131558889);
        this.f3794J.setOnClickListener(new C04004(this));
        this.f3795K = (ImageButton) findViewById(2131558884);
        this.f3795K.setOnClickListener(new C04015(this));
        this.f3799O = (ImageButton) findViewById(2131558885);
        this.f3796L = (Button) findViewById(2131558886);
        this.f3796L.setOnClickListener(new C04026(this));
        this.f3798N = (EditText) findViewById(2131558882);
        this.f3798N.setOnFocusChangeListener(new C04037(this));
        this.f3798N.addTextChangedListener(new C04048(this));
        this.f3798N.setOnTouchListener(new C04069(this));
        this.f3800P = findViewById(2131558887);
        this.f3797M = (Button) findViewById(2131558888);
        this.f3797M.setOnTouchListener(new OnTouchListener() {
            final /* synthetic */ ChatRoomActivity f3737a;

            {
                this.f3737a = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ChatRoomActivity.m2824a(this.f3737a, motionEvent);
                return false;
            }
        });
        this.f3792H = findViewById(2131558582);
        this.f3801Q = (GridView) findViewById(2131558583);
        this.f3799O.setOnClickListener(new OnClickListener() {
            final /* synthetic */ ChatRoomActivity f3738a;

            {
                this.f3738a = r1;
            }

            public final void onClick(View view) {
                ChatRoomActivity.m2810L(this.f3738a);
            }
        });
        this.f3802R = new ExpressionAdapter(this);
        this.f3801Q.setAdapter(this.f3802R);
        this.f3801Q.setOnItemClickListener(new OnItemClickListener() {
            final /* synthetic */ ChatRoomActivity f3740a;

            {
                this.f3740a = r1;
            }

            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                ChatRoomActivity.m2823a(this.f3740a, i);
            }
        });
        this.f3803S = findViewById(2131558584);
        this.f3804T = (ImageButton) findViewById(2131558585);
        this.f3804T.setOnClickListener(new OnClickListener() {
            final /* synthetic */ ChatRoomActivity f3741a;

            {
                this.f3741a = r1;
            }

            public final void onClick(View view) {
                this.f3741a.startActivityForResult(new Intent(this.f3741a, BillShareActivity.class), ChatRoomActivity.f3777d);
            }
        });
        this.f3805U = (ImageButton) findViewById(2131558586);
        this.f3805U.setOnClickListener(new OnClickListener() {
            final /* synthetic */ ChatRoomActivity f3742a;

            {
                this.f3742a = r1;
            }

            public final void onClick(View view) {
                this.f3742a.startActivityForResult(new Intent(this.f3742a, PokerHistoryShareActivity.class), ChatRoomActivity.f3778e);
            }
        });
        this.f3806V = (ImageButton) findViewById(2131558587);
        this.f3806V.setOnClickListener(new OnClickListener() {
            final /* synthetic */ ChatRoomActivity f3743a;

            {
                this.f3743a = r1;
            }

            public final void onClick(View view) {
                ChatRoomActivity.m2860o(this.f3743a);
            }
        });
        TextView textView = (TextView) findViewById(2131558588);
        if (this.f3821w == 2) {
            this.f3806V.setVisibility(0);
            textView.setVisibility(0);
        } else {
            this.f3806V.setVisibility(4);
            textView.setVisibility(4);
        }
        m2851k();
        this.f3807W = findViewById(2131558589);
        this.f3808X = findViewById(2131558590);
        this.f3809Y = (ImageView) findViewById(2131558591);
        this.f3810Z = findViewById(2131558592);
        m2830b(false);
    }

    public void finish() {
        BaseApplication.f5509b.m3212d();
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(67108864);
        intent.putExtra("returnTo", -1);
        startActivity(intent);
        overridePendingTransition(2131034127, 2131034127);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131689474, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131559425) {
            return super.onOptionsItemSelected(menuItem);
        }
        Intent intent;
        if (this.f3821w != 2) {
            intent = new Intent(this, SingleSettingsActivity.class);
            intent.putExtra("friendUuid", this.f3820v);
            startActivity(intent);
        } else if (this.f3814p) {
            intent = new Intent(this, ClubInfoActivity.class);
            intent.putExtra("clubId", this.f3820v);
            startActivity(intent);
        } else {
            intent = new Intent(this, GroupSettingsActivity.class);
            intent.putExtra("lChatRoomId", this.f3820v);
            startActivity(intent);
        }
        return true;
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.values[0] == this.ae.getMaximumRange()) {
            this.ac.setSpeakerphoneOn(true);
            this.ac.setMode(0);
            if (this.ab != null && this.ab.isHeld()) {
                this.ab.release();
                this.ab = null;
                this.af = false;
            }
        } else if (this.f3790F != null && this.f3790F.m2709b()) {
            this.ab = this.aa.newWakeLock(32, getClass().getCanonicalName());
            this.af = true;
            this.ab.acquire();
            this.ac.setSpeakerphoneOn(false);
            this.ac.setMode(3);
            this.f3790F.m2710c();
        }
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    protected void onStop() {
        super.onStop();
        if (!this.af && !DBManager.m3631a().m3632b()) {
            DBManager.m3631a().f5566f.m3580c(this.f3820v, this.f3821w);
            DBManager.m3631a().f5572l.m3667b(this.f3820v);
        }
    }

    protected void onPause() {
        super.onPause();
        if (!this.af) {
            this.ad.unregisterListener(this);
            this.f3790F.m2708a();
        }
    }

    protected void onResume() {
        super.onResume();
        this.ad.registerListener(this, this.ae, 3);
        if (!DBManager.m3631a().m3632b()) {
            if (DBManager.m3631a().f5566f.m3576b(this.f3820v, this.f3821w) == 0) {
                this.f3787C.m4243b();
                this.aq.setVisibility(8);
            }
            m2848i();
            m2877a(false);
            if (this.ah) {
                DBManager.m3631a().f5566f.m3580c(this.f3820v, this.f3821w);
            }
            m2850j();
            m2844g();
            this.f3788D = DBManager.m3631a().f5565e.m3590a(this.f3820v, this.f3821w);
            if (this.f3822x) {
                m2840e();
            } else if (this.f3788D.f5715B != null) {
                this.f3814p = this.f3788D.f5715B.booleanValue();
            } else {
                this.f3814p = false;
            }
            NetworkUtil.m4073a();
            NetworkUtil.m4174k();
            m2846h();
        }
    }

    private void m2840e() {
        if (this.f3788D != null) {
            this.f3814p = this.f3788D.f5715B.booleanValue();
            if (this.f3814p) {
                NetworkUtil.m4073a();
                NetworkUtil.m4132b(this.f3820v);
                NetworkUtil.m4073a();
                NetworkUtil.m4195u(this.f3820v);
                return;
            } else if (this.f3821w != 1) {
                NetworkUtil.m4073a();
                NetworkUtil.m4146c(this.f3820v);
                return;
            } else {
                return;
            }
        }
        this.f3814p = false;
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        if (!DBManager.m3631a().m3632b()) {
            CHAT_TYPE chat_type;
            int i3;
            if (i == f3777d) {
                if (i2 == f3780g) {
                    if (this.f3822x) {
                        Bill a = DBManager.m3631a().f5570j.m3554a(intent.getExtras().getLong("bill_id"), false);
                        m2853l();
                        BillDBManager billDBManager = DBManager.m3631a().f5570j;
                        billDBManager.f5517a.a();
                        try {
                            BillDao billDao = billDBManager.f5518b.f6467x;
                            Bill a2 = billDBManager.m3554a(a.f5643b.longValue(), true);
                            if (a2 == null) {
                                a2 = new Bill();
                                a2.f5643b = a.f5643b;
                                a2.f5646e = Boolean.valueOf(false);
                                a2.f5647f = Boolean.valueOf(true);
                            }
                            a2.f5629M = a.f5629M;
                            a2.f5631O = a.f5631O;
                            a2.f5626J = a.f5626J;
                            a2.f5627K = a.f5627K;
                            a2.f5644c = a.f5644c;
                            a2.f5662u = a.f5662u;
                            a2.f5663v = a.f5663v;
                            a2.f5666y = a.f5666y;
                            a2.f5661t = a.f5661t;
                            a2.f5649h = Boolean.valueOf(true);
                            a2.f5665x = a.f5665x;
                            a2.f5660s = a.f5660s;
                            if (StringUtils.m4462a(a.f5630N)) {
                                a2.f5630N = LetterIndexBar.SEARCH_ICON_LETTER;
                            } else {
                                a2.f5630N = a.f5630N;
                            }
                            a2.f5645d = a.f5645d;
                            a2.f5667z = a.f5667z;
                            a2.m3707a(a.m3715i());
                            a2.f5664w = a.f5664w;
                            a2.f5655n = a.f5655n;
                            a2.f5654m = a.f5654m;
                            if (a.f5656o == null) {
                                a2.f5656o = Integer.valueOf(0);
                            } else {
                                a2.f5656o = a.f5656o;
                            }
                            if (a.f5651j == null || !a.f5651j.booleanValue()) {
                                a2.f5651j = Boolean.valueOf(false);
                            } else {
                                a2.f5651j = Boolean.valueOf(true);
                            }
                            if (a.f5652k != null) {
                                a2.f5652k = a.f5652k;
                            }
                            if (a.f5653l != null) {
                                a2.f5653l = a.f5653l;
                            }
                            if (a.f5655n != null) {
                                a2.f5655n = a.f5655n;
                            }
                            a2.f5625I = a.f5625I;
                            a2.f5633Q = Boolean.valueOf(false);
                            a2.f5634R = a.f5634R;
                            a2.f5635S = a.f5635S;
                            if (a.f5634R != null && a.f5634R.longValue() > 0) {
                                a2.f5636T = a.f5636T;
                                a2.f5637U = a.f5637U;
                            }
                            billDao.d(a2);
                            for (UserBill userBill : DBManager.m3631a().f5571k.m3705a(a.f5643b.longValue(), false)) {
                                UserBillDBManager userBillDBManager = DBManager.m3631a().f5571k;
                                long longValue = a.f5643b.longValue();
                                UserBillDao userBillDao = userBillDBManager.f5611a.f6443R;
                                UserBill a3 = userBillDBManager.m3703a(longValue, userBill.f6009f.longValue(), true);
                                if (a3 == null) {
                                    a3 = new UserBill();
                                    a3.f6013j = Boolean.valueOf(true);
                                }
                                a3.f6005b = Long.valueOf(longValue);
                                a3.f6009f = userBill.f6009f;
                                a3.f6007d = userBill.f6007d;
                                a3.f6006c = userBill.f6006c;
                                a3.f6010g = userBill.f6010g;
                                if (userBill.f6011h != null) {
                                    a3.f6011h = userBill.f6011h;
                                } else {
                                    a3.f6011h = Long.valueOf(0);
                                }
                                if (userBill.f6012i != null) {
                                    a3.f6012i = userBill.f6012i;
                                } else {
                                    a3.f6012i = Long.valueOf(0);
                                }
                                if (userBill.f6014k != null) {
                                    a3.f6014k = userBill.f6014k;
                                } else {
                                    a3.f6014k = Long.valueOf(0);
                                }
                                if (userBill.f6015l != null) {
                                    a3.f6015l = userBill.f6015l;
                                } else {
                                    a3.f6015l = LetterIndexBar.SEARCH_ICON_LETTER;
                                }
                                userBillDao.d(a3);
                            }
                            billDBManager.f5517a.c();
                        } catch (Exception e) {
                            e.printStackTrace();
                        } finally {
                            billDBManager.f5517a.b();
                        }
                        if (this.f3821w == 1) {
                            chat_type = CHAT_TYPE.CHAT_TYPE_SINGLE;
                        } else if (this.f3788D.f5715B.booleanValue()) {
                            chat_type = CHAT_TYPE.CHAT_TYPE_CLUB;
                        } else {
                            chat_type = CHAT_TYPE.CHAT_TYPE_GROUP;
                        }
                        NetworkUtil.m4073a();
                        NetworkUtil.m4089a(this.f3820v, a, chat_type);
                        m2877a(true);
                        return;
                    }
                    if (this.f3821w == 1) {
                        i3 = 2131165304;
                    } else {
                        i3 = 2131165291;
                    }
                    m2732a(2130903246, i3, 1);
                } else if (i2 != f3781h) {
                } else {
                    if (this.f3822x) {
                        CHAT_TYPE chat_type2;
                        BillInfoNet billInfoNet = (BillInfoNet) ((List) intent.getSerializableExtra("bill")).get(0);
                        m2853l();
                        DBManager.m3631a().f5570j.m3555a(billInfoNet, true);
                        if (this.f3821w == 1) {
                            chat_type2 = CHAT_TYPE.CHAT_TYPE_SINGLE;
                        } else if (this.f3788D.f5715B.booleanValue()) {
                            chat_type2 = CHAT_TYPE.CHAT_TYPE_CLUB;
                        } else {
                            chat_type2 = CHAT_TYPE.CHAT_TYPE_GROUP;
                        }
                        NetworkUtil.m4073a();
                        NetworkUtil.m4092a(this.f3820v, billInfoNet, chat_type2);
                        m2877a(true);
                        return;
                    }
                    if (this.f3821w == 1) {
                        i3 = 2131165304;
                    } else {
                        i3 = 2131165291;
                    }
                    m2732a(2130903246, i3, 1);
                }
            } else if (i == f3778e) {
                if (i2 != f3782i) {
                    return;
                }
                if (this.f3822x) {
                    Bundle extras = intent.getExtras();
                    PokerHistory a4 = DBManager.m3631a().f5578r.m3692a(extras.getLong("lSaveUuid"), extras.getLong("lRoomId"), extras.getLong("lHandId"), false);
                    m2853l();
                    PokerHistoryDBManager pokerHistoryDBManager = DBManager.m3631a().f5578r;
                    PokerHistoryDao pokerHistoryDao = pokerHistoryDBManager.f5606b.f6440O;
                    PokerHistory a5 = pokerHistoryDBManager.m3692a(a4.f5970p.longValue(), a4.f5968n.longValue(), a4.f5967m.longValue(), true);
                    if (a5 == null) {
                        a5 = new PokerHistory();
                    }
                    a5.f5956b = a4.f5956b;
                    a5.f5957c = Boolean.valueOf(true);
                    a5.f5958d = a4.f5958d;
                    a5.f5959e = a4.f5959e;
                    a5.f5960f = a4.f5960f;
                    a5.f5961g = a4.f5961g;
                    a5.f5962h = a4.f5962h;
                    a5.f5963i = a4.f5963i;
                    a5.f5964j = a4.f5964j;
                    a5.f5966l = a4.f5966l;
                    a5.f5967m = a4.f5967m;
                    a5.f5968n = a4.f5968n;
                    a5.f5969o = a4.f5969o;
                    a5.f5965k = a4.f5965k;
                    a5.f5970p = a4.f5970p;
                    a5.f5971q = a4.f5971q;
                    a5.f5972r = a4.f5972r;
                    a5.f5973s = a4.f5975u;
                    a5.f5976v = a4.f5976v;
                    a5.f5975u = a4.f5975u;
                    a5.f5978x = a4.f5978x;
                    a5.f5977w = a4.f5977w;
                    a5.f5974t = a4.f5974t;
                    a5.f5980z = a4.f5980z;
                    if (a4.f5979y != null) {
                        a5.f5979y = a4.f5979y;
                    } else {
                        a5.f5979y = Integer.valueOf(0);
                    }
                    if (a4.f5952A != null) {
                        a5.f5952A = a4.f5979y;
                    } else {
                        a5.f5952A = Integer.valueOf(0);
                    }
                    if (a4.f5953B != null) {
                        a5.f5953B = a4.f5953B;
                    } else {
                        a5.f5953B = Long.valueOf(0);
                    }
                    if (a4.f5954C != null) {
                        a5.f5954C = a4.f5954C;
                    } else {
                        a5.f5954C = LetterIndexBar.SEARCH_ICON_LETTER;
                    }
                    pokerHistoryDao.d(a5);
                    if (this.f3821w == 1) {
                        chat_type = CHAT_TYPE.CHAT_TYPE_SINGLE;
                    } else if (this.f3788D.f5715B.booleanValue()) {
                        chat_type = CHAT_TYPE.CHAT_TYPE_CLUB;
                    } else {
                        chat_type = CHAT_TYPE.CHAT_TYPE_GROUP;
                    }
                    NetworkUtil.m4073a();
                    NetworkUtil.m4090a(this.f3820v, a4, chat_type);
                    m2877a(true);
                    return;
                }
                if (this.f3821w == 1) {
                    i3 = 2131165304;
                } else {
                    i3 = 2131165291;
                }
                m2732a(2130903246, i3, 1);
            } else if (i == f3779f && i2 == f3783j) {
                m2844g();
            }
        }
    }

    private void m2842f() {
        if (!DBManager.m3631a().m3632b()) {
            GameRoomDBManager gameRoomDBManager = DBManager.m3631a().f5572l;
            long j = this.f3820v;
            g a = g.a(gameRoomDBManager.f5595a.f6435J);
            a.a(Properties.f6315x.a(Long.valueOf(j)), new i[0]);
            a.a(Properties.f6293b.a(Boolean.valueOf(true)), new i[0]);
            long b = a.b();
            if (b <= 99) {
                this.at.setText(String.valueOf(b));
            } else {
                this.at.setText("\u22c5\u22c5\u22c5");
            }
            j = DBManager.m3631a().f5566f.m3565a(this.f3820v, 2);
            if (j <= 99) {
                this.ar.setText(String.valueOf(j));
            } else {
                this.ar.setText("\u22c5\u22c5\u22c5");
            }
            if (this.ah) {
                this.aq.setVisibility(4);
                if (b != 0) {
                    this.as.setVisibility(0);
                }
                this.as.setVisibility(4);
            } else {
                if (j == 0) {
                    this.aq.setVisibility(4);
                } else {
                    this.aq.setVisibility(0);
                }
                this.as.setVisibility(4);
            }
            this.al.setText(String.format(getResources().getString(2131165261), new Object[]{Integer.valueOf(this.av)}));
        }
    }

    private void m2844g() {
        this.az.clear();
        if (!DBManager.m3631a().m3632b()) {
            this.az.addAll(DBManager.m3631a().f5572l.m3662a(this.f3820v));
            this.aA.notifyDataSetChanged();
            this.av = this.az.size();
            if (this.av != 0) {
                this.au = ((GameRoom) this.az.get(0)).f5893q.longValue();
                this.ax.setVisibility(4);
            } else {
                this.ax.setVisibility(0);
            }
            m2842f();
        }
    }

    private void m2846h() {
        if (!DBManager.m3631a().m3632b()) {
            if (DBManager.m3631a().f5579s.m3559a() <= 0) {
                this.aB.setVisibility(8);
                LayoutParams layoutParams = (LayoutParams) this.aB.getLayoutParams();
                layoutParams.rightMargin = (int) (-getResources().getDimension(2131230827));
                this.aB.setLayoutParams(layoutParams);
            } else if (((LayoutParams) this.aB.getLayoutParams()).rightMargin != 0) {
                this.aB.setVisibility(0);
                Animation translateAnimation = new TranslateAnimation(0.0f, -getResources().getDimension(2131230827), 0.0f, 0.0f);
                translateAnimation.setDuration(500);
                translateAnimation.setAnimationListener(new AnimationListener() {
                    final /* synthetic */ ChatRoomActivity f3764a;

                    {
                        this.f3764a = r1;
                    }

                    public final void onAnimationStart(Animation animation) {
                    }

                    public final void onAnimationEnd(Animation animation) {
                        LayoutParams layoutParams = (LayoutParams) this.f3764a.aB.getLayoutParams();
                        layoutParams.rightMargin = 0;
                        this.f3764a.aB.setLayoutParams(layoutParams);
                        this.f3764a.aB.setAnimation(new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f));
                    }

                    public final void onAnimationRepeat(Animation animation) {
                    }
                });
                this.aB.startAnimation(translateAnimation);
            }
        }
    }

    private void m2848i() {
        if (!DBManager.m3631a().m3632b()) {
            this.f3790F.notifyDataSetChanged();
        }
    }

    public final void m2877a(boolean z) {
        if (!DBManager.m3631a().m3632b()) {
            List b = DBManager.m3631a().f5566f.m3577b(this.f3820v, this.f3811l, this.f3821w);
            int size = b.size();
            if (size != 0) {
                for (int i = 0; i < size; i++) {
                    ChatMsg chatMsg = (ChatMsg) b.get(i);
                    this.f3787C.m4241a(chatMsg.f5689b, chatMsg);
                    if (i == size - 1) {
                        this.f3811l = chatMsg.f5703p.longValue();
                    }
                }
                m2848i();
                if (z) {
                    m2830b(true);
                } else {
                    int lastVisiblePosition = this.f3791G.getLastVisiblePosition();
                    if (lastVisiblePosition == -1) {
                        lastVisiblePosition = this.f3787C.m4238a();
                    }
                    if (this.f3787C.m4238a() - lastVisiblePosition < 5) {
                        m2830b(true);
                    }
                }
            }
            m2842f();
        }
    }

    private void m2850j() {
        if (!DBManager.m3631a().m3632b()) {
            boolean booleanValue;
            this.f3788D = DBManager.m3631a().f5565e.m3590a(this.f3820v, this.f3821w);
            String str = LetterIndexBar.SEARCH_ICON_LETTER;
            String str2 = LetterIndexBar.SEARCH_ICON_LETTER;
            if (this.f3821w == 1) {
                this.f3789E = DBManager.m3631a().f5563c.m3639a(this.f3820v);
                booleanValue = this.f3789E.f5823b.booleanValue();
                str = this.f3789E.f5838q;
                str2 = LetterIndexBar.SEARCH_ICON_LETTER;
                if (this.f3789E.f5826e.intValue() == 3) {
                    this.f3822x = true;
                } else {
                    this.f3822x = false;
                }
                this.ag.setVisibility(8);
            } else if (this.f3788D != null) {
                booleanValue = this.f3788D.f5719F.booleanValue();
                str = "(" + this.f3788D.f5729P + ")";
                if (StringUtils.m4462a(this.f3788D.f5755p)) {
                    str2 = getResources().getString(2131165268);
                } else {
                    str2 = this.f3788D.f5755p;
                }
                this.f3822x = false;
                String str3;
                if (this.f3788D.f5717D == null || !this.f3788D.f5717D.booleanValue()) {
                    this.f3822x = false;
                    str3 = str;
                    str = str2;
                    str2 = str3;
                } else {
                    this.f3822x = true;
                    str3 = str;
                    str = str2;
                    str2 = str3;
                }
            } else {
                booleanValue = true;
            }
            CharSequence charSequence = str + str2;
            if (booleanValue) {
                this.f3815q.setTitle(charSequence);
                return;
            }
            str2 = charSequence + "mute";
            CharSequence spannableStringBuilder = new SpannableStringBuilder(str2);
            spannableStringBuilder.setSpan(new ImageSpan(this, BitmapFactory.decodeResource(getResources(), 2130903097), 0), str2.length() - 4, str2.length(), 33);
            this.f3815q.setTitle(spannableStringBuilder);
        }
    }

    private void m2851k() {
        this.f3791G = (ListView) findViewById(2131558579);
        this.f3791G.setOnTouchListener(new OnTouchListener() {
            final /* synthetic */ ChatRoomActivity f3765a;

            {
                this.f3765a = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (this.f3765a.f3823y) {
                    this.f3765a.f3823y = false;
                }
                if (this.f3765a.f3824z) {
                    this.f3765a.f3824z = false;
                }
                this.f3765a.f3792H.setVisibility(8);
                this.f3765a.m2878b();
                return false;
            }
        });
        long currentTimeMillis = System.currentTimeMillis() + RuntimeData.f6671b;
        this.f3787C = new MapList();
        List<ChatMsg> c = DBManager.m3631a().f5566f.m3579c(this.f3820v, currentTimeMillis, this.f3821w);
        if (c.size() != 0) {
            this.f3811l = ((ChatMsg) c.get(c.size() - 1)).f5703p.longValue();
            this.f3812m = ((ChatMsg) c.get(0)).f5703p.longValue();
        } else {
            this.f3812m = currentTimeMillis;
            this.f3811l = currentTimeMillis;
        }
        for (ChatMsg chatMsg : c) {
            this.f3787C.m4241a(chatMsg.f5689b, chatMsg);
        }
        this.f3790F = new ChatMsgListAdapter(this, this.f3820v, this.f3821w, this.f3814p);
        this.f3790F.f3262e = this.f3787C;
        this.f3791G.setAdapter(this.f3790F);
        this.f3791G.setOnScrollListener(new OnScrollListener() {
            final /* synthetic */ ChatRoomActivity f3767a;

            /* renamed from: com.illuminate.texaspoker.activity.ChatRoomActivity.33.1 */
            class C03981 implements Runnable {
                final /* synthetic */ AnonymousClass33 f3766a;

                static {
                    fixHelper.fixfunc(new int[]{3030, 3031});
                    if (VERSION.SDK_INT <= 0) {
                        Exists2.class.toString();
                    }
                }

                native C03981(AnonymousClass33 anonymousClass33);

                public final native void run();
            }

            {
                this.f3767a = r1;
            }

            public final void onScrollStateChanged(AbsListView absListView, int i) {
                if ((i == 0 || i == 2) && this.f3767a.f3817s && !this.f3767a.f3819u && ((ChatMsg) this.f3767a.f3787C.m4239a(0)) != null) {
                    this.f3767a.f3819u = true;
                    this.f3767a.f3787C.m4244b(Long.valueOf(-1), null);
                    this.f3767a.f3790F.notifyDataSetChanged();
                    this.f3767a.f3791G.smoothScrollToPosition(0);
                    this.f3767a.f3791G.postDelayed(new C03981(this), 500);
                }
            }

            public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
                if (!this.f3767a.f3818t && this.f3767a.f3791G.getLastVisiblePosition() == this.f3767a.f3787C.m4238a() - 1) {
                    this.f3767a.f3818t = true;
                } else if (i == 0 && this.f3767a.f3818t && !this.f3767a.f3819u) {
                    this.f3767a.f3817s = true;
                } else {
                    this.f3767a.f3817s = false;
                }
            }
        });
    }

    private void m2853l() {
        if (this.f3821w == 1 && this.f3788D == null) {
            this.f3788D = DBManager.m3631a().f5565e.m3589a(this.f3820v);
            this.f3814p = false;
        }
    }

    private void m2830b(boolean z) {
        if (z) {
            this.f3791G.smoothScrollToPosition(this.f3790F.getCount() - 1);
        } else {
            this.f3791G.setSelection(this.f3790F.getCount() - 1);
        }
    }

    private void m2834c(boolean z) {
        this.f3794J.setVisibility(4);
        this.f3793I.setVisibility(0);
        this.f3797M.setVisibility(4);
        this.f3798N.setVisibility(0);
        this.f3800P.setVisibility(0);
        this.f3799O.setVisibility(0);
        if (!z) {
            this.f3798N.requestFocus();
            m2862p();
            m2855m();
        }
    }

    private void m2855m() {
        if (StringUtils.m4462a(this.f3798N.getText().toString())) {
            this.f3796L.setVisibility(4);
            this.f3795K.setVisibility(0);
            return;
        }
        this.f3795K.setVisibility(4);
        this.f3796L.setVisibility(0);
    }

    private void m2858n() {
        this.f3792H.getLayoutParams().height = SharedPreferencesManager.m4296a(getResources());
        if (m2735c() != 0) {
            m2864q();
            m2878b();
            this.f3792H.setVisibility(0);
            m2865r();
            return;
        }
        this.f3792H.setVisibility(0);
        this.f3792H.postDelayed(new Runnable() {
            final /* synthetic */ ChatRoomActivity f3744a;

            {
                this.f3744a = r1;
            }

            public final void run() {
                this.f3744a.m2830b(false);
            }
        }, 200);
    }

    private void m2859o() {
        m2864q();
        this.f3792H.setVisibility(8);
        m2862p();
        m2865r();
    }

    private void m2862p() {
        ((InputMethodManager) getSystemService("input_method")).showSoftInput(this.f3798N, 1);
    }

    protected final void m2878b() {
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.f3798N.getWindowToken(), 0);
    }

    private void m2864q() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f3791G.getLayoutParams();
        layoutParams.height = this.f3791G.getHeight();
        layoutParams.weight = 0.0f;
    }

    private void m2865r() {
        this.f3798N.postDelayed(new Runnable() {
            final /* synthetic */ ChatRoomActivity f3745a;

            {
                this.f3745a = r1;
            }

            public final void run() {
                ((LinearLayout.LayoutParams) this.f3745a.f3791G.getLayoutParams()).weight = DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
                this.f3745a.m2830b(true);
            }
        }, 200);
    }

    protected final void m2876a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_REFRESH_MSG")) {
            if (this.ah) {
                DBManager.m3631a().f5566f.m3580c(this.f3820v, this.f3821w);
            }
            if (!DBManager.m3631a().m3632b()) {
                m2877a(false);
            }
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_MOMENTS")) {
            m2850j();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_IMAGE")) {
            this.f3790F.notifyDataSetChanged();
        } else if (str.equalsIgnoreCase("NOTIFY_PLAY_MSG_SOUND")) {
            Map map = (Map) list.get(0);
            Integer num;
            if (this.f3821w == 1) {
                num = (Integer) map.get(this.f3820v + "s");
                if (num == null || num.intValue() <= 0) {
                    Utility.m4479a(true);
                    return;
                } else {
                    Utility.m4479a(false);
                    return;
                }
            }
            num = (Integer) map.get(this.f3820v);
            if (num == null || num.intValue() <= 0) {
                Utility.m4479a(true);
            } else {
                Utility.m4479a(false);
            }
        } else if (str.equalsIgnoreCase("NOTIFY_SEND_MSG_SUCCES")) {
            r2 = ((Long) list.get(0)).longValue();
            ChatMsg chatMsg = (ChatMsg) this.f3787C.m4240a(Long.valueOf(r2));
            if (chatMsg != null) {
                chatMsg.f5707t = Integer.valueOf(DBManager.f5540C);
                Timer timer = (Timer) this.f3790F.f3258a.get(Long.valueOf(r2));
                if (timer != null) {
                    timer.cancel();
                    this.f3790F.f3258a.remove(Long.valueOf(r2));
                }
                this.f3790F.notifyDataSetChanged();
                m2830b(true);
            }
        } else if (str.equalsIgnoreCase("NOTIFY_CREATE_GAME_ROOM_SUCCESS")) {
            m2877a(true);
            m2844g();
        } else if (str.equalsIgnoreCase("NOTIFY_ENTER_GAME_ROOM_SUCCESS")) {
            r2 = ((Long) list.get(0)).longValue();
            r0 = (byte[]) list.get(1);
            this.b.dismiss();
            RuntimeData.f6674e = r2;
            RuntimeData.f6672c = LetterIndexBar.SEARCH_ICON_LETTER;
            RuntimeData.f6675f = this.f3820v;
            r1 = new Intent(this, AppActivity.class);
            r1.putExtra("gameType", AppActivity.k);
            r1.putExtra("responseData", r0);
            r1.putExtra("CMD", "NOTIFY_CC_ENTER_GAME_ROOM_SUCCESS");
            r1.putExtra("lGameRoomId", r2);
            r1.setFlags(67108864);
            r1.setFlags(WXMediaMessage.THUMB_LENGTH_LIMIT);
            r1.putExtra("returnTo", AppActivity.i);
            startActivity(r1);
            overridePendingTransition(0, 0);
        } else if (str.equalsIgnoreCase("NOTIFY_ENTER_GAME_ROOM_FAULT")) {
            m2826a((List) list);
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_CHATROOM")) {
            m2850j();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_SETTING")) {
            m2850j();
        } else if (str.equalsIgnoreCase("NOTIFY_RFRESH_USER_INFO")) {
            m2850j();
            m2877a(false);
        } else if (str.equalsIgnoreCase("NOTIFY_SIGN_UP_SNG_GAME_ROOM_SUCCESS")) {
            r2 = ((Long) list.get(0)).longValue();
            r0 = (byte[]) list.get(1);
            RuntimeData.f6674e = r2;
            RuntimeData.f6672c = LetterIndexBar.SEARCH_ICON_LETTER;
            RuntimeData.f6675f = this.f3820v;
            r1 = new Intent(this, AppActivity.class);
            r1.putExtra("gameType", AppActivity.k);
            r1.putExtra("responseData", r0);
            r1.putExtra("CMD", "NOTIFY_CC_SIGN_UP_SNG_GAME_ROOM_SUCCESS");
            r1.putExtra("lGameRoomId", r2);
            r1.setFlags(67108864);
            r1.setFlags(WXMediaMessage.THUMB_LENGTH_LIMIT);
            r1.putExtra("returnTo", AppActivity.i);
            startActivity(r1);
            overridePendingTransition(0, 0);
            this.b.dismiss();
        } else if (str.equalsIgnoreCase("NOTIFY_SIGN_UP_SNG_GAME_ROOM__FAULT")) {
            m2826a((List) list);
        } else if (str.equalsIgnoreCase("NOTIFY_WATCH_SNG_GAME_ROOM_SUCCESS")) {
            r2 = ((Long) list.get(0)).longValue();
            r0 = (byte[]) list.get(1);
            RuntimeData.f6674e = r2;
            RuntimeData.f6672c = LetterIndexBar.SEARCH_ICON_LETTER;
            RuntimeData.f6675f = this.f3820v;
            r1 = new Intent(this, AppActivity.class);
            r1.putExtra("gameType", AppActivity.k);
            r1.putExtra("responseData", r0);
            r1.putExtra("CMD", "NOTIFY_CC_WATCH_SNG_GAME_ROOM_SUCCESS");
            r1.putExtra("lGameRoomId", r2);
            r1.setFlags(67108864);
            r1.setFlags(WXMediaMessage.THUMB_LENGTH_LIMIT);
            r1.putExtra("returnTo", AppActivity.i);
            startActivity(r1);
            overridePendingTransition(0, 0);
            this.b.dismiss();
        } else if (str.equalsIgnoreCase("NOTIFY_WATCH_SNG_GAME_ROOM_FAULT")) {
            m2826a((List) list);
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_CHAT_ROOM_GAME")) {
            new Handler().postDelayed(new Runnable() {
                final /* synthetic */ ChatRoomActivity f3746a;

                {
                    this.f3746a = r1;
                }

                public final void run() {
                    GameRoomDBManager gameRoomDBManager = DBManager.m3631a().f5572l;
                    long i = this.f3746a.f3820v;
                    long P = this.f3746a.au;
                    g a = g.a(gameRoomDBManager.f5595a.f6435J);
                    a.a(Properties.f6312u.c(Integer.valueOf(0)), new i[0]);
                    a.a(Properties.f6315x.a(Long.valueOf(i)), new i[0]);
                    a.a(Properties.f6308q.c(Long.valueOf(P)), new i[0]);
                    long b = a.b();
                    if (this.f3746a.ay.m4589a()) {
                        CharSequence format;
                        if (b > 0) {
                            format = String.format(this.f3746a.getResources().getString(2131165570), new Object[]{Long.valueOf(b)});
                        } else {
                            Object string = this.f3746a.getResources().getString(2131165569);
                        }
                        Context context = this.f3746a;
                        if (context.f3525c == null) {
                            context.f3525c = (RelativeLayout) LayoutInflater.from(context).inflate(2130968833, null);
                        }
                        ((ImageView) context.f3525c.findViewById(2131559415)).setImageResource(2130903589);
                        ((TextView) context.f3525c.findViewById(2131559416)).setText(format);
                        Toast toast = new Toast(context);
                        toast.setGravity(17, 0, 0);
                        toast.setDuration(0);
                        toast.setView(context.f3525c);
                        toast.show();
                    }
                    this.f3746a.m2844g();
                    this.f3746a.ay.m4590b();
                }
            }, 500);
        } else if (str.equalsIgnoreCase("NOTIFY_GAME_ROOM_ScbuyinControlMsg")) {
            m2844g();
            m2846h();
        } else if (str.equalsIgnoreCase("NOTIFY_GAME_ROOM_ScgetallbuyinControl_SUCCESS")) {
            m2846h();
        } else if (str.equalsIgnoreCase("NOTIFY_TO_REFRESH_VIEW_AFTER_DENNY")) {
            m2840e();
        } else if (str.equalsIgnoreCase("NOTIFY_TO_GET_GAMEROOMS")) {
            m2840e();
        } else if (str.equalsIgnoreCase("NOTIFY_SIGN_UP_SNG_GAME_ROOM_INVITE_WAITTING")) {
            m2840e();
            this.b.dismiss();
            m2732a(2130903589, 2131165306, 1);
        } else if (str.equalsIgnoreCase("NOTIFY_RECONNECT_SUCCESS")) {
            NetworkUtil.m4073a();
            NetworkUtil.m4174k();
        }
    }

    private void m2826a(List<Object> list) {
        m2844g();
        int intValue = ((Integer) list.get(0)).intValue();
        this.b.dismiss();
        new Builder(this).setTitle(2131165514).setMessage(intValue).setPositiveButton(2131165438, new DialogInterface.OnClickListener() {
            final /* synthetic */ ChatRoomActivity f3748a;

            {
                this.f3748a = r1;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
            }
        }).show();
    }

    private void m2867s() {
        if (this.aJ != null) {
            this.f3797M.setText(2131165292);
            this.f3797M.setBackgroundResource(2130903124);
            this.f3807W.setVisibility(8);
            this.f3809Y.setImageBitmap(null);
            this.aJ.cancel();
            this.aJ.purge();
            this.aJ = null;
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 1 && iArr[0] != 0) {
            m2867s();
            new Builder(this).setTitle(2131165473).setMessage(2131165461).setPositiveButton(2131165472, new DialogInterface.OnClickListener() {
                final /* synthetic */ ChatRoomActivity f3753a;

                {
                    this.f3753a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.applications.InstalledAppDetails"));
                    intent.setData(Uri.parse("package:" + this.f3753a.getPackageName()));
                    this.f3753a.startActivity(intent);
                }
            }).setNegativeButton(2131165432, new DialogInterface.OnClickListener() {
                final /* synthetic */ ChatRoomActivity f3752a;

                {
                    this.f3752a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                }
            }).show();
        }
    }

    private void m2838d(boolean z) {
        if (this.aE != null) {
            long ceil = (long) Math.ceil((double) (((float) (System.currentTimeMillis() - this.aI)) / 1000.0f));
            if (ceil == 0) {
                ceil = 1;
            }
            if (this.aK != null) {
                this.aK.cancel();
                this.aK.purge();
            }
            try {
                this.aE.stop();
                this.aE.reset();
                this.aE.release();
            } catch (Throwable e) {
                Log.e(f3785n, e.getMessage(), e);
                e.printStackTrace();
            }
            if (!z) {
                if (!this.f3822x) {
                    m2732a(2130903246, this.f3816r, 1);
                } else if (this.aL != 0.0d) {
                    try {
                        int i;
                        FileInputStream fileInputStream = new FileInputStream(this.aG);
                        byte[] bArr = new byte[fileInputStream.available()];
                        fileInputStream.read(bArr);
                        fileInputStream.close();
                        m2853l();
                        long currentTimeMillis = System.currentTimeMillis() + RuntimeData.f6671b;
                        if (this.f3821w != 2) {
                            i = this.f3821w;
                        } else if (this.f3814p) {
                            i = 3;
                        } else {
                            i = 2;
                        }
                        NetworkUtil.m4073a();
                        NetworkUtil.m4079a(this.f3820v, i, CHAT_MESSAGE_TYPE.CHAT_MESSAGE_TYPE_VOICE, LetterIndexBar.SEARCH_ICON_LETTER, currentTimeMillis, bArr, ceil);
                        String str = currentTimeMillis + ".amr";
                        long j = currentTimeMillis;
                        DBManager.m3631a().f5566f.m3568a(this.f3820v, j, this.f3821w, 2, str, ceil);
                        VoiceFileUtility.m4201a(this.f3820v, currentTimeMillis, bArr, this.f3821w);
                        m2877a(false);
                        m2830b(false);
                    } catch (Throwable e2) {
                        e2.printStackTrace();
                        Log.e(f3785n, e2.getMessage(), e2);
                    }
                } else {
                    this.aG.delete();
                    new Builder(this).setTitle(2131165478).setMessage(2131165477).setPositiveButton(2131165438, new DialogInterface.OnClickListener() {
                        final /* synthetic */ ChatRoomActivity f3755a;

                        {
                            this.f3755a = r1;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                        }
                    }).show();
                }
            }
            this.aE = null;
        }
    }

    static /* synthetic */ void m2825a(ChatRoomActivity chatRoomActivity, GameRoom gameRoom) {
        if (gameRoom.f5887k.intValue() != 2) {
            chatRoomActivity.b = new LoadingDialog(chatRoomActivity);
            chatRoomActivity.b.show();
            if (StringUtils.m4462a(gameRoom.f5863C)) {
                RuntimeData.f6672c = LetterIndexBar.SEARCH_ICON_LETTER;
            } else {
                RuntimeData.f6672c = gameRoom.f5863C;
            }
            NetworkUtil.m4073a();
            NetworkUtil.m4169h(gameRoom.f5897u.longValue());
        } else if (gameRoom.f5880d.booleanValue()) {
            chatRoomActivity.b = new LoadingDialog(chatRoomActivity);
            chatRoomActivity.b.show();
            NetworkUtil.m4073a();
            NetworkUtil.m4171i(gameRoom.f5897u.longValue());
        } else if (gameRoom.f5882f.booleanValue()) {
            r0 = new Intent(chatRoomActivity, SngDetailActivity.class);
            r1 = new Bundle();
            r1.putLong("lGameRoomId", gameRoom.f5897u.longValue());
            r1.putBoolean("fromQuickChat", false);
            r1.putLong("lChatRoomId", gameRoom.f5900x.longValue());
            r0.putExtras(r1);
            chatRoomActivity.startActivity(r0);
        } else if (gameRoom.f5881e.booleanValue()) {
            chatRoomActivity.b = new LoadingDialog(chatRoomActivity);
            chatRoomActivity.b.show();
            NetworkUtil.m4073a();
            NetworkUtil.m4171i(gameRoom.f5897u.longValue());
        } else {
            r0 = new Intent(chatRoomActivity, SngDetailActivity.class);
            r1 = new Bundle();
            r1.putLong("lGameRoomId", gameRoom.f5897u.longValue());
            r1.putBoolean("fromQuickChat", false);
            r1.putLong("lChatRoomId", gameRoom.f5900x.longValue());
            r0.putExtras(r1);
            chatRoomActivity.startActivity(r0);
        }
    }

    static /* synthetic */ void m2801C(ChatRoomActivity chatRoomActivity) {
        if (!DBManager.m3631a().m3632b()) {
            List<ChatMsg> c = DBManager.m3631a().f5566f.m3579c(chatRoomActivity.f3820v, chatRoomActivity.f3812m, chatRoomActivity.f3821w);
            if (c.size() != 0) {
                chatRoomActivity.f3812m = ((ChatMsg) c.get(0)).f5703p.longValue();
                ChatMsg chatMsg = (ChatMsg) c.get(c.size() - 1);
                Collections.reverse(c);
                chatRoomActivity.f3787C.m4245c(Long.valueOf(-1));
                for (ChatMsg chatMsg2 : c) {
                    chatRoomActivity.f3787C.m4244b(chatMsg2.f5689b, chatMsg2);
                }
                chatRoomActivity.f3790F.notifyDataSetChanged();
                chatRoomActivity.f3791G.setSelection(chatRoomActivity.f3787C.m4242b(chatMsg.f5689b));
            } else {
                chatRoomActivity.f3787C.m4245c(Long.valueOf(-1));
                chatRoomActivity.f3790F.notifyDataSetChanged();
            }
            chatRoomActivity.f3819u = false;
        }
    }

    static /* synthetic */ boolean m2807I(ChatRoomActivity chatRoomActivity) {
        if (chatRoomActivity.f3822x) {
            int i;
            String obj = chatRoomActivity.f3798N.getText().toString();
            chatRoomActivity.m2853l();
            long currentTimeMillis = System.currentTimeMillis() + RuntimeData.f6671b;
            if (chatRoomActivity.f3821w != 2) {
                i = chatRoomActivity.f3821w;
            } else if (chatRoomActivity.f3814p) {
                i = 3;
            } else {
                i = 2;
            }
            NetworkUtil.m4073a();
            NetworkUtil.m4079a(chatRoomActivity.f3820v, i, CHAT_MESSAGE_TYPE.CHAT_MESSAGE_TYPE_TEXT, obj, currentTimeMillis, null, 0);
            DBManager.m3631a().f5566f.m3568a(chatRoomActivity.f3820v, currentTimeMillis, chatRoomActivity.f3821w, 1, obj, 0);
            chatRoomActivity.f3798N.setText(LetterIndexBar.SEARCH_ICON_LETTER);
            chatRoomActivity.m2877a(true);
            return false;
        }
        int i2;
        if (chatRoomActivity.f3821w == 1) {
            i2 = 2131165304;
        } else {
            i2 = 2131165291;
        }
        chatRoomActivity.m2732a(2130903246, i2, 1);
        return false;
    }

    static /* synthetic */ void m2833c(ChatRoomActivity chatRoomActivity, boolean z) {
        if (z) {
            chatRoomActivity.f3800P.setBackgroundColor(-938427);
            return;
        }
        chatRoomActivity.f3800P.setBackgroundColor(-5855578);
        chatRoomActivity.m2878b();
    }

    static /* synthetic */ void m2824a(ChatRoomActivity chatRoomActivity, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            chatRoomActivity.f3797M.setText(2131165294);
            chatRoomActivity.f3797M.setBackgroundResource(2130903125);
            chatRoomActivity.f3807W.setVisibility(0);
            chatRoomActivity.f3808X.setVisibility(0);
            chatRoomActivity.f3810Z.setVisibility(8);
            chatRoomActivity.aH = 1;
            TimerTask anonymousClass22 = new TimerTask() {
                final /* synthetic */ ChatRoomActivity f3750a;

                {
                    this.f3750a = r1;
                }

                public final void run() {
                    Message message = new Message();
                    message.what = ChatRoomActivity.aC;
                    this.f3750a.aM.sendMessage(message);
                }
            };
            chatRoomActivity.aJ = new Timer();
            chatRoomActivity.aJ.schedule(anonymousClass22, 0, 100);
            if (ContextCompat.checkSelfPermission(chatRoomActivity, "android.permission.RECORD_AUDIO") != 0) {
                ActivityCompat.requestPermissions(chatRoomActivity, new String[]{"android.permission.RECORD_AUDIO"}, 1);
                return;
            }
            try {
                File file = new File(VoiceFileUtility.f6576a);
                if (!file.exists()) {
                    file.mkdirs();
                }
                chatRoomActivity.aL = 0.0d;
                chatRoomActivity.aG = new File(aF);
                chatRoomActivity.aG.delete();
                chatRoomActivity.aE = new MediaRecorder();
                chatRoomActivity.aE.setAudioSource(1);
                chatRoomActivity.aE.setOutputFormat(3);
                chatRoomActivity.aE.setAudioEncoder(1);
                chatRoomActivity.aE.setAudioChannels(1);
                chatRoomActivity.aE.setAudioSamplingRate(8000);
                chatRoomActivity.aE.setOutputFile(aF);
                chatRoomActivity.aE.prepare();
                chatRoomActivity.aE.start();
                chatRoomActivity.aI = System.currentTimeMillis();
            } catch (Throwable e) {
                e.printStackTrace();
                Log.e(f3785n, e.getMessage(), e);
            }
            anonymousClass22 = new TimerTask() {
                final /* synthetic */ ChatRoomActivity f3754a;

                {
                    this.f3754a = r1;
                }

                public final void run() {
                    Message message = new Message();
                    message.what = ChatRoomActivity.aD;
                    this.f3754a.aM.sendMessage(message);
                }
            };
            chatRoomActivity.aK = new Timer();
            chatRoomActivity.aK.schedule(anonymousClass22, 0, 100);
        } else if (motionEvent.getAction() == 1) {
            if (motionEvent.getY() < -300.0f) {
                chatRoomActivity.m2838d(true);
            } else if (chatRoomActivity.aH > 10) {
                chatRoomActivity.m2838d(false);
            } else {
                chatRoomActivity.m2838d(true);
                if (ContextCompat.checkSelfPermission(chatRoomActivity, "android.permission.RECORD_AUDIO") == 0) {
                    chatRoomActivity.m2732a(2130903246, 2131165308, 0);
                }
            }
            chatRoomActivity.m2867s();
        } else if (motionEvent.getAction() == 2) {
            if (motionEvent.getY() < -300.0f) {
                chatRoomActivity.f3808X.setVisibility(8);
                chatRoomActivity.f3810Z.setVisibility(0);
                return;
            }
            chatRoomActivity.f3808X.setVisibility(0);
            chatRoomActivity.f3810Z.setVisibility(8);
        } else if (motionEvent.getAction() == 3) {
            chatRoomActivity.m2838d(true);
            chatRoomActivity.m2867s();
        }
    }
}
