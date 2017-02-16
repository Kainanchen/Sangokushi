package com.illuminate.texaspoker.utils;

import a.does.not.Exists2;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaRecorder;
import android.os.Build.VERSION;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.Log;
import com.ali.fixHelper;
import com.illuminate.texaspoker.application.BaseApplication;
import com.texaspoker.moment.TexasPoker.PushMsg;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public class VoiceFileUtility {
    public static String f6576a;
    public static String f6577b;
    public static String f6578c;
    public static final Queue<PushMsg> f6579e;
    public static final Map<Long, PushMsg> f6580f;
    private static File f6581n;
    private static String f6582o;
    private static String f6583p;
    private static String f6584q;
    private static VoiceFileUtility f6585r;
    private static int f6586t;
    public MediaRecorder f6587d;
    public MediaPlayer f6588g;
    public MediaPlayer f6589h;
    public File f6590i;
    public double f6591j;
    public Timer f6592k;
    public boolean f6593l;
    public boolean f6594m;
    private boolean f6595s;

    /* renamed from: com.illuminate.texaspoker.utils.VoiceFileUtility.1 */
    static class C09141 implements OnCompletionListener {
        final /* synthetic */ MediaPlayer f6569a;

        static {
            fixHelper.fixfunc(new int[]{2035, 2036});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C09141(MediaPlayer mediaPlayer);

        public final native void onCompletion(MediaPlayer mediaPlayer);
    }

    /* renamed from: com.illuminate.texaspoker.utils.VoiceFileUtility.2 */
    class C09152 implements OnCompletionListener {
        final /* synthetic */ FileInputStream f6570a;
        final /* synthetic */ VoiceFileUtility f6571b;

        static {
            fixHelper.fixfunc(new int[]{520, 521});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C09152(VoiceFileUtility voiceFileUtility, FileInputStream fileInputStream);

        public final native void onCompletion(MediaPlayer mediaPlayer);
    }

    /* renamed from: com.illuminate.texaspoker.utils.VoiceFileUtility.3 */
    class C09163 implements OnCompletionListener {
        final /* synthetic */ long f6572a;
        final /* synthetic */ FileInputStream f6573b;
        final /* synthetic */ VoiceFileUtility f6574c;

        static {
            fixHelper.fixfunc(new int[]{597, 598});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C09163(VoiceFileUtility voiceFileUtility, long j, FileInputStream fileInputStream);

        public final native void onCompletion(MediaPlayer mediaPlayer);
    }

    /* renamed from: com.illuminate.texaspoker.utils.VoiceFileUtility.4 */
    class C09174 extends TimerTask {
        final /* synthetic */ VoiceFileUtility f6575a;

        static {
            fixHelper.fixfunc(new int[]{700, 701});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        public native C09174(VoiceFileUtility voiceFileUtility);

        public final native void run();
    }

    public VoiceFileUtility() {
        this.f6595s = false;
        this.f6591j = 0.0d;
        this.f6593l = false;
        this.f6594m = false;
    }

    static {
        f6581n = BaseApplication.m3548a().getExternalFilesDir(null);
        f6576a = f6581n.getAbsolutePath() + "/voice/";
        f6582o = "temp_game_voice";
        f6583p = "replay_temp_game_voice";
        f6584q = ".amr";
        f6577b = BaseApplication.m3548a().getExternalCacheDir() + "/game_voice/";
        f6578c = f6577b + "temp_game_record_voice.amr";
        f6579e = new ConcurrentLinkedQueue();
        f6580f = new ConcurrentHashMap();
        f6586t = 2;
    }

    public static VoiceFileUtility m4199a() {
        if (f6585r == null) {
            f6585r = new VoiceFileUtility();
            File file = new File(f6577b);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return f6585r;
    }

    public static void m4201a(long j, long j2, byte[] bArr, int i) {
        String str;
        if (i == 1) {
            str = j + "_s";
        } else {
            str = j + "_g";
        }
        File file = new File(f6576a + str + "/");
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(f6576a + str + "/" + j2 + ".amr")));
            bufferedOutputStream.write(bArr);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void m4202a(Context context, String str) {
        try {
            AssetFileDescriptor openFd = context.getAssets().openFd(str);
            MediaPlayer mediaPlayer = new MediaPlayer();
            mediaPlayer.setLooping(false);
            mediaPlayer.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
            mediaPlayer.setOnCompletionListener(new C09141(mediaPlayer));
            mediaPlayer.prepare();
            mediaPlayer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void m4200a(long j, long j2, int i) {
        String str;
        if (i == 1) {
            str = j + "_s";
        } else {
            str = j + "_g";
        }
        File file = new File(f6576a + str + "/" + j2 + ".amr");
        if (file.exists() && file.isFile()) {
            file.delete();
        }
    }

    public static String m4205b(long j, long j2, int i) {
        String str;
        if (i == 1) {
            str = j + "_s";
        } else {
            str = j + "_g";
        }
        return f6576a + str + "/" + j2 + ".amr";
    }

    public static byte[] m4208c(long j, long j2, int i) {
        String str;
        if (i == 1) {
            str = j + "_s";
        } else {
            str = j + "_g";
        }
        String str2 = f6576a + str + "/" + j2 + ".amr";
        byte[] bArr = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str2));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT];
            while (true) {
                int read = fileInputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            fileInputStream.close();
            byteArrayOutputStream.close();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            Log.e("VoiceFileUtility", e.getMessage());
        }
        return bArr;
    }

    public static void gameStartRecord() {
        Utility.m4478a("NOTIFY_CC_START_RECORD", new Object[0]);
    }

    public static void gameCanelRecordEvent() {
        VoiceFileUtility a = m4199a();
        if (a.f6587d != null) {
            if (a.f6592k != null) {
                a.f6592k.cancel();
                a.f6592k.purge();
            }
            try {
                a.f6587d.stop();
                a.f6587d.reset();
                a.f6587d.release();
            } catch (Throwable e) {
                Log.e("VoiceFileUtility", e.getMessage(), e);
                e.printStackTrace();
            }
            a.f6587d = null;
            if (a.f6589h != null) {
                a.f6589h.start();
            } else if (a.f6588g != null) {
                a.f6588g.start();
            }
        }
    }

    public static void gameReplayVoiceWithUuid(long j) {
        VoiceFileUtility a = m4199a();
        if (a.f6589h != null) {
            a.f6589h.stop();
            a.f6589h.release();
            a.f6589h = null;
            Utility.m4478a("NOTIFY_audioPlayerDidFinishPlaying", Long.valueOf(j));
        } else if (a.f6588g != null && a.f6588g.isPlaying()) {
            a.f6588g.pause();
        }
        try {
            if (a.f6589h == null) {
                a.f6589h = new MediaPlayer();
            }
            byte[] toByteArray = ((PushMsg) f6580f.get(Long.valueOf(j))).getVVoiceDatas().toByteArray();
            File createTempFile = File.createTempFile(f6583p, f6584q, new File(f6577b));
            createTempFile.deleteOnExit();
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(toByteArray);
            fileOutputStream.close();
            FileInputStream fileInputStream = new FileInputStream(createTempFile);
            a.f6589h.setDataSource(fileInputStream.getFD());
            a.f6589h.setAudioStreamType(3);
            a.f6589h.setOnCompletionListener(new C09163(a, j, fileInputStream));
            a.f6589h.prepare();
            a.f6589h.start();
            Utility.m4478a("NOTIFY_audioPlayerDidStartPlaying", r0.getStFromUser(), Long.valueOf(r0.getLDuration()));
        } catch (Exception e) {
            e.printStackTrace();
            a.f6589h.release();
            a.f6589h = null;
        }
    }

    public static void gameSendVoice(float f) {
        VoiceFileUtility a = m4199a();
        a.f6594m = true;
        if (a.f6587d != null) {
            if (a.f6592k != null) {
                a.f6592k.cancel();
                a.f6592k.purge();
            }
            if (a.f6593l) {
                try {
                    a.f6587d.stop();
                    a.f6587d.reset();
                    a.f6587d.release();
                    a.f6587d = null;
                    if (!a.f6590i.exists() || a.f6590i.length() <= 10 || a.f6591j == 0.0d) {
                        a.f6590i.delete();
                        Utility.m4478a("NOTIFY_RECORD_FAIL", new Object[0]);
                    } else {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(a.f6590i);
                            int available = fileInputStream.available();
                            if (available == 0) {
                                fileInputStream.close();
                                return;
                            }
                            byte[] bArr = new byte[available];
                            fileInputStream.read(bArr);
                            fileInputStream.close();
                            NetworkUtil.m4073a();
                            NetworkUtil.m4128a(bArr, (long) f);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                } catch (Throwable e2) {
                    Log.e("VoiceFileUtility", e2.getMessage(), e2);
                    e2.printStackTrace();
                }
            } else {
                Utility.m4478a("NOTIFY_RECORD_FAIL", new Object[0]);
            }
            if (a.f6589h != null) {
                a.f6589h.start();
            } else if (a.f6588g != null) {
                a.f6588g.start();
            }
        }
    }

    public static void gameCancelVoiceQueue() {
        VoiceFileUtility a = m4199a();
        synchronized (f6579e) {
            f6579e.clear();
            f6580f.clear();
            if (a.f6588g != null && a.f6588g.isPlaying()) {
                a.f6588g.stop();
                a.f6588g.release();
                a.f6588g = null;
            }
            if (a.f6589h != null && a.f6589h.isPlaying()) {
                a.f6589h.stop();
                a.f6589h.release();
                a.f6589h = null;
            }
            if (a.f6587d != null) {
                try {
                    a.f6587d.stop();
                    a.f6587d.reset();
                    a.f6587d.release();
                } catch (Throwable e) {
                    Log.e("VoiceFileUtility", e.getMessage(), e);
                    e.printStackTrace();
                }
                a.f6587d = null;
            }
        }
    }

    public static boolean gameIsHaveRecord(long j) {
        m4199a();
        if (f6580f.containsKey(Long.valueOf(j)) && RuntimeData.f6670a) {
            return true;
        }
        return false;
    }

    public final void m4210a(PushMsg pushMsg) {
        try {
            if (this.f6588g == null) {
                this.f6588g = new MediaPlayer();
            }
            byte[] toByteArray = pushMsg.getVVoiceDatas().toByteArray();
            File createTempFile = File.createTempFile(f6582o, f6584q, new File(f6577b));
            createTempFile.deleteOnExit();
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(toByteArray);
            fileOutputStream.close();
            FileInputStream fileInputStream = new FileInputStream(createTempFile);
            this.f6588g.setDataSource(fileInputStream.getFD());
            this.f6588g.setAudioStreamType(3);
            this.f6588g.setOnCompletionListener(new C09152(this, fileInputStream));
            this.f6588g.prepare();
            this.f6588g.start();
            Utility.m4478a("NOTIFY_audioPlayerDidStartPlaying", pushMsg.getStFromUser(), Long.valueOf(pushMsg.getLDuration()));
        } catch (IOException e) {
            e.printStackTrace();
            synchronized (f6579e) {
            }
            f6579e.poll();
            this.f6588g.release();
            this.f6588g = null;
        }
    }

    static /* synthetic */ void m4209d(VoiceFileUtility voiceFileUtility) {
        if (voiceFileUtility.f6587d != null) {
            try {
                voiceFileUtility.f6591j = (((double) voiceFileUtility.f6587d.getMaxAmplitude()) / 1.0d) + voiceFileUtility.f6591j;
            } catch (Exception e) {
            }
        }
    }
}
