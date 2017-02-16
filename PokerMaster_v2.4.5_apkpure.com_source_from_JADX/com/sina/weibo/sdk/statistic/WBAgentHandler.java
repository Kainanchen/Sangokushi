package com.sina.weibo.sdk.statistic;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.sina.weibo.sdk.utils.LogUtil;
import com.tencent.android.tpush.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

class WBAgentHandler {
    private static int MAX_CACHE_SIZE;
    private static List<PageLog> mActivePages;
    private static WBAgentHandler mInstance;
    private static Map<String, PageLog> mPages;
    private static Timer mTimer;

    /* renamed from: com.sina.weibo.sdk.statistic.WBAgentHandler.1 */
    class C10151 implements Runnable {
        private final /* synthetic */ Context val$context;

        C10151(Context context) {
            this.val$context = context;
        }

        public void run() {
            LogReport.uploadAppLogs(this.val$context, WBAgentHandler.this.getLogsInMemory());
        }
    }

    /* renamed from: com.sina.weibo.sdk.statistic.WBAgentHandler.2 */
    class C10162 implements Runnable {
        private final /* synthetic */ String val$content;

        C10162(String str) {
            this.val$content = str;
        }

        public void run() {
            LogFileUtil.writeToFile(LogFileUtil.getAppLogPath(LogFileUtil.ANALYTICS_FILE_NAME), this.val$content, true);
        }
    }

    /* renamed from: com.sina.weibo.sdk.statistic.WBAgentHandler.3 */
    class C10173 extends TimerTask {
        private final /* synthetic */ Context val$context;

        C10173(Context context) {
            this.val$context = context;
        }

        public void run() {
            LogReport.uploadAppLogs(this.val$context, WBAgentHandler.this.getLogsInMemory());
        }
    }

    static {
        MAX_CACHE_SIZE = 5;
    }

    public static synchronized WBAgentHandler getInstance() {
        WBAgentHandler wBAgentHandler;
        synchronized (WBAgentHandler.class) {
            if (mInstance == null) {
                mInstance = new WBAgentHandler();
            }
            wBAgentHandler = mInstance;
        }
        return wBAgentHandler;
    }

    private WBAgentHandler() {
        mActivePages = new ArrayList();
        mPages = new HashMap();
        LogUtil.m4623i(WBAgent.TAG, "init handler");
    }

    public void onPageStart(String str) {
        if (!StatisticConfig.ACTIVITY_DURATION_OPEN) {
            PageLog pageLog = new PageLog(str);
            pageLog.setType(LogType.FRAGMENT);
            synchronized (mPages) {
                mPages.put(str, pageLog);
            }
            LogUtil.m4621d(WBAgent.TAG, new StringBuilder(String.valueOf(str)).append(", ").append(pageLog.getStartTime() / 1000).toString());
        }
    }

    public void onPageEnd(String str) {
        if (!StatisticConfig.ACTIVITY_DURATION_OPEN) {
            if (mPages.containsKey(str)) {
                PageLog pageLog = (PageLog) mPages.get(str);
                pageLog.setDuration(System.currentTimeMillis() - pageLog.getStartTime());
                synchronized (mActivePages) {
                    mActivePages.add(pageLog);
                }
                synchronized (mPages) {
                    mPages.remove(str);
                }
                LogUtil.m4621d(WBAgent.TAG, new StringBuilder(String.valueOf(str)).append(", ").append(pageLog.getStartTime() / 1000).append(", ").append(pageLog.getDuration() / 1000).toString());
            } else {
                LogUtil.m4622e(WBAgent.TAG, "please call onPageStart before onPageEnd");
            }
            if (mActivePages.size() >= MAX_CACHE_SIZE) {
                saveActivePages(mActivePages);
                mActivePages.clear();
            }
        }
    }

    public void onResume(Context context) {
        if (LogReport.getPackageName() == null) {
            LogReport.setPackageName(context.getPackageName());
        }
        if (mTimer == null) {
            mTimer = timerTask(context, 500, StatisticConfig.getUploadInterval());
        }
        long currentTimeMillis = System.currentTimeMillis();
        String name = context.getClass().getName();
        checkNewSession(context, currentTimeMillis);
        if (StatisticConfig.ACTIVITY_DURATION_OPEN) {
            PageLog pageLog = new PageLog(name, currentTimeMillis);
            pageLog.setType(LogType.ACTIVITY);
            synchronized (mPages) {
                mPages.put(name, pageLog);
            }
        }
        LogUtil.m4621d(WBAgent.TAG, new StringBuilder(String.valueOf(name)).append(", ").append(currentTimeMillis / 1000).toString());
    }

    public void onPause(Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        String name = context.getClass().getName();
        LogUtil.m4623i(WBAgent.TAG, "update last page endtime:" + (currentTimeMillis / 1000));
        PageLog.updateSession(context, null, Long.valueOf(0), Long.valueOf(currentTimeMillis));
        if (StatisticConfig.ACTIVITY_DURATION_OPEN) {
            if (mPages.containsKey(name)) {
                PageLog pageLog = (PageLog) mPages.get(name);
                pageLog.setDuration(currentTimeMillis - pageLog.getStartTime());
                synchronized (mActivePages) {
                    mActivePages.add(pageLog);
                }
                synchronized (mPages) {
                    mPages.remove(name);
                }
                LogUtil.m4621d(WBAgent.TAG, new StringBuilder(String.valueOf(name)).append(", ").append(pageLog.getStartTime() / 1000).append(", ").append(pageLog.getDuration() / 1000).toString());
            } else {
                LogUtil.m4622e(WBAgent.TAG, "please call onResume before onPause");
            }
            if (mActivePages.size() >= MAX_CACHE_SIZE) {
                saveActivePages(mActivePages);
                mActivePages.clear();
            }
        }
        checkAppStatus(context);
    }

    public void onEvent(String str, String str2, Map<String, String> map) {
        EventLog eventLog = new EventLog(str, str2, map);
        eventLog.setType(LogType.EVENT);
        synchronized (mActivePages) {
            mActivePages.add(eventLog);
        }
        if (map == null) {
            LogUtil.m4621d(WBAgent.TAG, "event--- page:" + str + " ,event name:" + str2);
        } else {
            LogUtil.m4621d(WBAgent.TAG, "event--- page:" + str + " ,event name:" + str2 + " ,extend:" + map.toString());
        }
        if (mActivePages.size() >= MAX_CACHE_SIZE) {
            saveActivePages(mActivePages);
            mActivePages.clear();
        }
    }

    public void uploadAppLogs(Context context) {
        long currentTimeMillis = System.currentTimeMillis() - LogReport.getTime(context);
        if (LogReport.getTime(context) <= 0 || currentTimeMillis >= StatisticConfig.MIN_UPLOAD_INTERVAL) {
            WBAgentExecutor.execute(new C10151(context));
            return;
        }
        timerTask(context, StatisticConfig.MIN_UPLOAD_INTERVAL - currentTimeMillis, 0);
    }

    public void onStop(Context context) {
        checkAppStatus(context);
    }

    private void checkAppStatus(Context context) {
        if (isBackground(context)) {
            saveActivePages(mActivePages);
            mActivePages.clear();
        }
    }

    private boolean isBackground(Context context) {
        for (RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService(Constants.FLAG_ACTIVITY_NAME)).getRunningAppProcesses()) {
            if (runningAppProcessInfo.processName.equals(context.getPackageName())) {
                if (runningAppProcessInfo.importance == 400) {
                    LogUtil.m4623i(WBAgent.TAG, "\u540e\u53f0:" + runningAppProcessInfo.processName);
                    return true;
                }
                LogUtil.m4623i(WBAgent.TAG, "\u524d\u53f0:" + runningAppProcessInfo.processName);
                return false;
            }
        }
        return false;
    }

    public void onKillProcess() {
        LogUtil.m4623i(WBAgent.TAG, "save applogs and close timer and shutdown thread executor");
        saveActivePages(mActivePages);
        mInstance = null;
        closeTimer();
        WBAgentExecutor.shutDownExecutor();
    }

    private void checkNewSession(Context context, long j) {
        if (PageLog.isNewSession(context, j)) {
            PageLog pageLog = new PageLog(context);
            pageLog.setType(LogType.SESSION_END);
            PageLog pageLog2 = new PageLog(context, j);
            pageLog2.setType(LogType.SESSION_START);
            synchronized (mActivePages) {
                if (pageLog.getEndTime() > 0) {
                    mActivePages.add(pageLog);
                } else {
                    LogUtil.m4621d(WBAgent.TAG, "is a new install");
                }
                mActivePages.add(pageLog2);
            }
            LogUtil.m4621d(WBAgent.TAG, "last session--- starttime:" + pageLog.getStartTime() + " ,endtime:" + pageLog.getEndTime());
            LogUtil.m4621d(WBAgent.TAG, "is a new session--- starttime:" + pageLog2.getStartTime());
            return;
        }
        LogUtil.m4623i(WBAgent.TAG, "is not a new session");
    }

    private synchronized void saveActivePages(List<PageLog> list) {
        WBAgentExecutor.execute(new C10162(LogBuilder.getPageLogs(list)));
    }

    private synchronized String getLogsInMemory() {
        String str;
        str = LetterIndexBar.SEARCH_ICON_LETTER;
        if (mActivePages.size() > 0) {
            str = LogBuilder.getPageLogs(mActivePages);
            mActivePages.clear();
        }
        return str;
    }

    private Timer timerTask(Context context, long j, long j2) {
        Timer timer = new Timer();
        TimerTask c10173 = new C10173(context);
        if (j2 == 0) {
            timer.schedule(c10173, j);
        } else {
            timer.schedule(c10173, j, j2);
        }
        return timer;
    }

    private void closeTimer() {
        if (mTimer != null) {
            mTimer.cancel();
        }
    }
}
