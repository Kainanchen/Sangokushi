package android.support.v4.app;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.provider.Settings.Secure;
import android.support.v4.app.INotificationSideChannel.Stub;
import android.support.v4.os.BuildCompat;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class NotificationManagerCompat {
    public static final String ACTION_BIND_SIDE_CHANNEL = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
    public static final String EXTRA_USE_SIDE_CHANNEL = "android.support.useSideChannel";
    private static final Impl IMPL;
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MAX = 5;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;
    static final int MAX_SIDE_CHANNEL_SDK_VERSION = 19;
    private static final String SETTING_ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
    static final int SIDE_CHANNEL_BIND_FLAGS;
    private static final int SIDE_CHANNEL_RETRY_BASE_INTERVAL_MS = 1000;
    private static final int SIDE_CHANNEL_RETRY_MAX_COUNT = 6;
    private static final String TAG = "NotifManCompat";
    private static Set<String> sEnabledNotificationListenerPackages;
    private static String sEnabledNotificationListeners;
    private static final Object sEnabledNotificationListenersLock;
    private static final Object sLock;
    private static SideChannelManager sSideChannelManager;
    private final Context mContext;
    private final NotificationManager mNotificationManager;

    private interface Task {
        void send(INotificationSideChannel iNotificationSideChannel);
    }

    private static class CancelTask implements Task {
        final boolean all;
        final int id;
        final String packageName;
        final String tag;

        public CancelTask(String str) {
            this.packageName = str;
            this.id = NotificationManagerCompat.SIDE_CHANNEL_BIND_FLAGS;
            this.tag = null;
            this.all = true;
        }

        public CancelTask(String str, int i, String str2) {
            this.packageName = str;
            this.id = i;
            this.tag = str2;
            this.all = false;
        }

        public void send(INotificationSideChannel iNotificationSideChannel) {
            if (this.all) {
                iNotificationSideChannel.cancelAll(this.packageName);
            } else {
                iNotificationSideChannel.cancel(this.packageName, this.id, this.tag);
            }
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("CancelTask[");
            stringBuilder.append("packageName:").append(this.packageName);
            stringBuilder.append(", id:").append(this.id);
            stringBuilder.append(", tag:").append(this.tag);
            stringBuilder.append(", all:").append(this.all);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    interface Impl {
        boolean areNotificationsEnabled(Context context, NotificationManager notificationManager);

        void cancelNotification(NotificationManager notificationManager, String str, int i);

        int getImportance(NotificationManager notificationManager);

        int getSideChannelBindFlags();

        void postNotification(NotificationManager notificationManager, String str, int i, Notification notification);
    }

    static class ImplBase implements Impl {
        ImplBase() {
        }

        public void cancelNotification(NotificationManager notificationManager, String str, int i) {
            notificationManager.cancel(str, i);
        }

        public void postNotification(NotificationManager notificationManager, String str, int i, Notification notification) {
            notificationManager.notify(str, i, notification);
        }

        public int getSideChannelBindFlags() {
            return NotificationManagerCompat.IMPORTANCE_MIN;
        }

        public boolean areNotificationsEnabled(Context context, NotificationManager notificationManager) {
            return true;
        }

        public int getImportance(NotificationManager notificationManager) {
            return NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
        }
    }

    static class ImplIceCreamSandwich extends ImplBase {
        ImplIceCreamSandwich() {
        }

        public int getSideChannelBindFlags() {
            return 33;
        }
    }

    static class ImplKitKat extends ImplIceCreamSandwich {
        ImplKitKat() {
        }

        public boolean areNotificationsEnabled(Context context, NotificationManager notificationManager) {
            return NotificationManagerCompatKitKat.areNotificationsEnabled(context);
        }
    }

    static class ImplApi24 extends ImplKitKat {
        ImplApi24() {
        }

        public boolean areNotificationsEnabled(Context context, NotificationManager notificationManager) {
            return NotificationManagerCompatApi24.areNotificationsEnabled(notificationManager);
        }

        public int getImportance(NotificationManager notificationManager) {
            return NotificationManagerCompatApi24.getImportance(notificationManager);
        }
    }

    private static class NotifyTask implements Task {
        final int id;
        final Notification notif;
        final String packageName;
        final String tag;

        public NotifyTask(String str, int i, String str2, Notification notification) {
            this.packageName = str;
            this.id = i;
            this.tag = str2;
            this.notif = notification;
        }

        public void send(INotificationSideChannel iNotificationSideChannel) {
            iNotificationSideChannel.notify(this.packageName, this.id, this.tag, this.notif);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("NotifyTask[");
            stringBuilder.append("packageName:").append(this.packageName);
            stringBuilder.append(", id:").append(this.id);
            stringBuilder.append(", tag:").append(this.tag);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    private static class ServiceConnectedEvent {
        final ComponentName componentName;
        final IBinder iBinder;

        public ServiceConnectedEvent(ComponentName componentName, IBinder iBinder) {
            this.componentName = componentName;
            this.iBinder = iBinder;
        }
    }

    private static class SideChannelManager implements ServiceConnection, Callback {
        private static final String KEY_BINDER = "binder";
        private static final int MSG_QUEUE_TASK = 0;
        private static final int MSG_RETRY_LISTENER_QUEUE = 3;
        private static final int MSG_SERVICE_CONNECTED = 1;
        private static final int MSG_SERVICE_DISCONNECTED = 2;
        private Set<String> mCachedEnabledPackages;
        private final Context mContext;
        private final Handler mHandler;
        private final HandlerThread mHandlerThread;
        private final Map<ComponentName, ListenerRecord> mRecordMap;

        private static class ListenerRecord {
            public boolean bound;
            public final ComponentName componentName;
            public int retryCount;
            public INotificationSideChannel service;
            public LinkedList<Task> taskQueue;

            public ListenerRecord(ComponentName componentName) {
                this.bound = false;
                this.taskQueue = new LinkedList();
                this.retryCount = SideChannelManager.MSG_QUEUE_TASK;
                this.componentName = componentName;
            }
        }

        public SideChannelManager(Context context) {
            this.mRecordMap = new HashMap();
            this.mCachedEnabledPackages = new HashSet();
            this.mContext = context;
            this.mHandlerThread = new HandlerThread("NotificationManagerCompat");
            this.mHandlerThread.start();
            this.mHandler = new Handler(this.mHandlerThread.getLooper(), this);
        }

        public void queueTask(Task task) {
            this.mHandler.obtainMessage(MSG_QUEUE_TASK, task).sendToTarget();
        }

        public boolean handleMessage(Message message) {
            switch (message.what) {
                case MSG_QUEUE_TASK /*0*/:
                    handleQueueTask((Task) message.obj);
                    return true;
                case MSG_SERVICE_CONNECTED /*1*/:
                    ServiceConnectedEvent serviceConnectedEvent = (ServiceConnectedEvent) message.obj;
                    handleServiceConnected(serviceConnectedEvent.componentName, serviceConnectedEvent.iBinder);
                    return true;
                case MSG_SERVICE_DISCONNECTED /*2*/:
                    handleServiceDisconnected((ComponentName) message.obj);
                    return true;
                case MSG_RETRY_LISTENER_QUEUE /*3*/:
                    handleRetryListenerQueue((ComponentName) message.obj);
                    return true;
                default:
                    return false;
            }
        }

        private void handleQueueTask(Task task) {
            updateListenerMap();
            for (ListenerRecord listenerRecord : this.mRecordMap.values()) {
                listenerRecord.taskQueue.add(task);
                processListenerQueue(listenerRecord);
            }
        }

        private void handleServiceConnected(ComponentName componentName, IBinder iBinder) {
            ListenerRecord listenerRecord = (ListenerRecord) this.mRecordMap.get(componentName);
            if (listenerRecord != null) {
                listenerRecord.service = Stub.asInterface(iBinder);
                listenerRecord.retryCount = MSG_QUEUE_TASK;
                processListenerQueue(listenerRecord);
            }
        }

        private void handleServiceDisconnected(ComponentName componentName) {
            ListenerRecord listenerRecord = (ListenerRecord) this.mRecordMap.get(componentName);
            if (listenerRecord != null) {
                ensureServiceUnbound(listenerRecord);
            }
        }

        private void handleRetryListenerQueue(ComponentName componentName) {
            ListenerRecord listenerRecord = (ListenerRecord) this.mRecordMap.get(componentName);
            if (listenerRecord != null) {
                processListenerQueue(listenerRecord);
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable(NotificationManagerCompat.TAG, MSG_RETRY_LISTENER_QUEUE)) {
                new StringBuilder("Connected to service ").append(componentName);
            }
            this.mHandler.obtainMessage(MSG_SERVICE_CONNECTED, new ServiceConnectedEvent(componentName, iBinder)).sendToTarget();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable(NotificationManagerCompat.TAG, MSG_RETRY_LISTENER_QUEUE)) {
                new StringBuilder("Disconnected from service ").append(componentName);
            }
            this.mHandler.obtainMessage(MSG_SERVICE_DISCONNECTED, componentName).sendToTarget();
        }

        private void updateListenerMap() {
            Set enabledListenerPackages = NotificationManagerCompat.getEnabledListenerPackages(this.mContext);
            if (!enabledListenerPackages.equals(this.mCachedEnabledPackages)) {
                this.mCachedEnabledPackages = enabledListenerPackages;
                List<ResolveInfo> queryIntentServices = this.mContext.getPackageManager().queryIntentServices(new Intent().setAction(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL), NotificationManagerCompat.IMPORTANCE_HIGH);
                Set<ComponentName> hashSet = new HashSet();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (enabledListenerPackages.contains(resolveInfo.serviceInfo.packageName)) {
                        ComponentName componentName = new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w(NotificationManagerCompat.TAG, "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!this.mRecordMap.containsKey(componentName2)) {
                        if (Log.isLoggable(NotificationManagerCompat.TAG, MSG_RETRY_LISTENER_QUEUE)) {
                            new StringBuilder("Adding listener record for ").append(componentName2);
                        }
                        this.mRecordMap.put(componentName2, new ListenerRecord(componentName2));
                    }
                }
                Iterator it = this.mRecordMap.entrySet().iterator();
                while (it.hasNext()) {
                    Entry entry = (Entry) it.next();
                    if (!hashSet.contains(entry.getKey())) {
                        if (Log.isLoggable(NotificationManagerCompat.TAG, MSG_RETRY_LISTENER_QUEUE)) {
                            new StringBuilder("Removing listener record for ").append(entry.getKey());
                        }
                        ensureServiceUnbound((ListenerRecord) entry.getValue());
                        it.remove();
                    }
                }
            }
        }

        private boolean ensureServiceBound(ListenerRecord listenerRecord) {
            if (listenerRecord.bound) {
                return true;
            }
            listenerRecord.bound = this.mContext.bindService(new Intent(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL).setComponent(listenerRecord.componentName), this, NotificationManagerCompat.SIDE_CHANNEL_BIND_FLAGS);
            if (listenerRecord.bound) {
                listenerRecord.retryCount = MSG_QUEUE_TASK;
            } else {
                Log.w(NotificationManagerCompat.TAG, "Unable to bind to listener " + listenerRecord.componentName);
                this.mContext.unbindService(this);
            }
            return listenerRecord.bound;
        }

        private void ensureServiceUnbound(ListenerRecord listenerRecord) {
            if (listenerRecord.bound) {
                this.mContext.unbindService(this);
                listenerRecord.bound = false;
            }
            listenerRecord.service = null;
        }

        private void scheduleListenerRetry(ListenerRecord listenerRecord) {
            if (!this.mHandler.hasMessages(MSG_RETRY_LISTENER_QUEUE, listenerRecord.componentName)) {
                listenerRecord.retryCount += MSG_SERVICE_CONNECTED;
                if (listenerRecord.retryCount > NotificationManagerCompat.SIDE_CHANNEL_RETRY_MAX_COUNT) {
                    Log.w(NotificationManagerCompat.TAG, "Giving up on delivering " + listenerRecord.taskQueue.size() + " tasks to " + listenerRecord.componentName + " after " + listenerRecord.retryCount + " retries");
                    listenerRecord.taskQueue.clear();
                    return;
                }
                int i = (MSG_SERVICE_CONNECTED << (listenerRecord.retryCount - 1)) * NotificationManagerCompat.SIDE_CHANNEL_RETRY_BASE_INTERVAL_MS;
                if (Log.isLoggable(NotificationManagerCompat.TAG, MSG_RETRY_LISTENER_QUEUE)) {
                    new StringBuilder("Scheduling retry for ").append(i).append(" ms");
                }
                this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(MSG_RETRY_LISTENER_QUEUE, listenerRecord.componentName), (long) i);
            }
        }

        private void processListenerQueue(ListenerRecord listenerRecord) {
            if (Log.isLoggable(NotificationManagerCompat.TAG, MSG_RETRY_LISTENER_QUEUE)) {
                new StringBuilder("Processing component ").append(listenerRecord.componentName).append(", ").append(listenerRecord.taskQueue.size()).append(" queued tasks");
            }
            if (!listenerRecord.taskQueue.isEmpty()) {
                if (!ensureServiceBound(listenerRecord) || listenerRecord.service == null) {
                    scheduleListenerRetry(listenerRecord);
                    return;
                }
                while (true) {
                    Task task = (Task) listenerRecord.taskQueue.peek();
                    if (task == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable(NotificationManagerCompat.TAG, MSG_RETRY_LISTENER_QUEUE)) {
                            new StringBuilder("Sending task ").append(task);
                        }
                        task.send(listenerRecord.service);
                        listenerRecord.taskQueue.remove();
                    } catch (DeadObjectException e) {
                        if (Log.isLoggable(NotificationManagerCompat.TAG, MSG_RETRY_LISTENER_QUEUE)) {
                            new StringBuilder("Remote service has died: ").append(listenerRecord.componentName);
                        }
                    } catch (Throwable e2) {
                        Log.w(NotificationManagerCompat.TAG, "RemoteException communicating with " + listenerRecord.componentName, e2);
                    }
                }
                if (!listenerRecord.taskQueue.isEmpty()) {
                    scheduleListenerRetry(listenerRecord);
                }
            }
        }
    }

    static {
        sEnabledNotificationListenersLock = new Object();
        sEnabledNotificationListenerPackages = new HashSet();
        sLock = new Object();
        if (BuildCompat.isAtLeastN()) {
            IMPL = new ImplApi24();
        } else if (VERSION.SDK_INT >= MAX_SIDE_CHANNEL_SDK_VERSION) {
            IMPL = new ImplKitKat();
        } else if (VERSION.SDK_INT >= 14) {
            IMPL = new ImplIceCreamSandwich();
        } else {
            IMPL = new ImplBase();
        }
        SIDE_CHANNEL_BIND_FLAGS = IMPL.getSideChannelBindFlags();
    }

    public static NotificationManagerCompat from(Context context) {
        return new NotificationManagerCompat(context);
    }

    private NotificationManagerCompat(Context context) {
        this.mContext = context;
        this.mNotificationManager = (NotificationManager) this.mContext.getSystemService("notification");
    }

    public final void cancel(int i) {
        cancel(null, i);
    }

    public final void cancel(String str, int i) {
        IMPL.cancelNotification(this.mNotificationManager, str, i);
        if (VERSION.SDK_INT <= MAX_SIDE_CHANNEL_SDK_VERSION) {
            pushSideChannelQueue(new CancelTask(this.mContext.getPackageName(), i, str));
        }
    }

    public final void cancelAll() {
        this.mNotificationManager.cancelAll();
        if (VERSION.SDK_INT <= MAX_SIDE_CHANNEL_SDK_VERSION) {
            pushSideChannelQueue(new CancelTask(this.mContext.getPackageName()));
        }
    }

    public final void notify(int i, Notification notification) {
        notify(null, i, notification);
    }

    public final void notify(String str, int i, Notification notification) {
        if (useSideChannelForNotification(notification)) {
            pushSideChannelQueue(new NotifyTask(this.mContext.getPackageName(), i, str, notification));
            IMPL.cancelNotification(this.mNotificationManager, str, i);
            return;
        }
        IMPL.postNotification(this.mNotificationManager, str, i, notification);
    }

    public final boolean areNotificationsEnabled() {
        return IMPL.areNotificationsEnabled(this.mContext, this.mNotificationManager);
    }

    public final int getImportance() {
        return IMPL.getImportance(this.mNotificationManager);
    }

    public static Set<String> getEnabledListenerPackages(Context context) {
        Set<String> set;
        String string = Secure.getString(context.getContentResolver(), SETTING_ENABLED_NOTIFICATION_LISTENERS);
        synchronized (sEnabledNotificationListenersLock) {
            if (string != null) {
                if (!string.equals(sEnabledNotificationListeners)) {
                    String[] split = string.split(":");
                    Set hashSet = new HashSet(split.length);
                    int length = split.length;
                    for (int i = SIDE_CHANNEL_BIND_FLAGS; i < length; i += IMPORTANCE_MIN) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(split[i]);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    sEnabledNotificationListenerPackages = hashSet;
                    sEnabledNotificationListeners = string;
                }
            }
            set = sEnabledNotificationListenerPackages;
        }
        return set;
    }

    private static boolean useSideChannelForNotification(Notification notification) {
        Bundle extras = NotificationCompat.getExtras(notification);
        return extras != null && extras.getBoolean(EXTRA_USE_SIDE_CHANNEL);
    }

    private void pushSideChannelQueue(Task task) {
        synchronized (sLock) {
            if (sSideChannelManager == null) {
                sSideChannelManager = new SideChannelManager(this.mContext.getApplicationContext());
            }
            sSideChannelManager.queueTask(task);
        }
    }
}