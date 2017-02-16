package com.facebook.p004a;

import android.content.Context;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.p004a.AccessTokenAppIdPair.AccessTokenAppIdPair;
import com.facebook.p004a.AppEvent.AppEvent;
import com.facebook.p036h.af;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

/* renamed from: com.facebook.a.f */
class AppEventStore {
    private static final String f889a;

    /* renamed from: com.facebook.a.f.a */
    private static class AppEventStore extends ObjectInputStream {
        public AppEventStore(InputStream inputStream) {
            super(inputStream);
        }

        protected final ObjectStreamClass readClassDescriptor() {
            ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
            if (readClassDescriptor.getName().equals("com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                return ObjectStreamClass.lookup(AccessTokenAppIdPair.class);
            }
            if (readClassDescriptor.getName().equals("com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV1")) {
                return ObjectStreamClass.lookup(AppEvent.class);
            }
            return readClassDescriptor;
        }
    }

    AppEventStore() {
    }

    static {
        f889a = AppEventStore.class.getName();
    }

    public static synchronized void m872a(AccessTokenAppIdPair accessTokenAppIdPair, SessionEventsState sessionEventsState) {
        synchronized (AppEventStore.class) {
            PersistedEvents a = AppEventStore.m871a();
            if (a.f908a.containsKey(accessTokenAppIdPair)) {
                a.m875a(accessTokenAppIdPair).addAll(sessionEventsState.m882b());
            } else {
                a.m876a(accessTokenAppIdPair, sessionEventsState.m882b());
            }
            AppEventStore.m874a(a);
        }
    }

    public static synchronized void m873a(AppEventCollection appEventCollection) {
        synchronized (AppEventStore.class) {
            PersistedEvents a = AppEventStore.m871a();
            for (AccessTokenAppIdPair accessTokenAppIdPair : appEventCollection.m853a()) {
                a.m876a(accessTokenAppIdPair, appEventCollection.m852a(accessTokenAppIdPair).m882b());
            }
            AppEventStore.m874a(a);
        }
    }

    public static synchronized PersistedEvents m871a() {
        Closeable appEventStore;
        PersistedEvents persistedEvents;
        Closeable closeable;
        Throwable e;
        Closeable closeable2 = null;
        synchronized (AppEventStore.class) {
            Context f = FacebookSdk.m2586f();
            try {
                appEventStore = new AppEventStore(new BufferedInputStream(f.openFileInput("AppEventsLogger.persistedevents")));
                try {
                    persistedEvents = (PersistedEvents) appEventStore.readObject();
                    af.m1513a(appEventStore);
                    try {
                        f.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Throwable e2) {
                        Log.w(f889a, "Got unexpected exception when removing events file: ", e2);
                    }
                } catch (FileNotFoundException e3) {
                    closeable = appEventStore;
                    af.m1513a(closeable);
                    try {
                        f.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                        persistedEvents = null;
                    } catch (Throwable e4) {
                        Log.w(f889a, "Got unexpected exception when removing events file: ", e4);
                        persistedEvents = null;
                    }
                    if (persistedEvents == null) {
                        persistedEvents = new PersistedEvents();
                    }
                    return persistedEvents;
                } catch (Exception e5) {
                    e4 = e5;
                    try {
                        Log.w(f889a, "Got unexpected exception while reading events: ", e4);
                        af.m1513a(appEventStore);
                        try {
                            f.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                            persistedEvents = null;
                        } catch (Throwable e42) {
                            Log.w(f889a, "Got unexpected exception when removing events file: ", e42);
                            persistedEvents = null;
                        }
                        if (persistedEvents == null) {
                            persistedEvents = new PersistedEvents();
                        }
                        return persistedEvents;
                    } catch (Throwable th) {
                        e42 = th;
                        closeable2 = appEventStore;
                        af.m1513a(closeable2);
                        try {
                            f.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                        } catch (Throwable e22) {
                            Log.w(f889a, "Got unexpected exception when removing events file: ", e22);
                        }
                        throw e42;
                    }
                }
            } catch (FileNotFoundException e6) {
                closeable = null;
                af.m1513a(closeable);
                f.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                persistedEvents = null;
                if (persistedEvents == null) {
                    persistedEvents = new PersistedEvents();
                }
                return persistedEvents;
            } catch (Exception e7) {
                e42 = e7;
                appEventStore = null;
                Log.w(f889a, "Got unexpected exception while reading events: ", e42);
                af.m1513a(appEventStore);
                f.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                persistedEvents = null;
                if (persistedEvents == null) {
                    persistedEvents = new PersistedEvents();
                }
                return persistedEvents;
            } catch (Throwable th2) {
                e42 = th2;
                af.m1513a(closeable2);
                f.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                throw e42;
            }
            if (persistedEvents == null) {
                persistedEvents = new PersistedEvents();
            }
        }
        return persistedEvents;
    }

    private static void m874a(PersistedEvents persistedEvents) {
        Closeable objectOutputStream;
        Throwable e;
        Context f = FacebookSdk.m2586f();
        try {
            objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(f.openFileOutput("AppEventsLogger.persistedevents", 0)));
            try {
                objectOutputStream.writeObject(persistedEvents);
                af.m1513a(objectOutputStream);
            } catch (Exception e2) {
                e = e2;
                try {
                    Log.w(f889a, "Got unexpected exception while persisting events: ", e);
                    try {
                        f.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception e3) {
                    }
                    af.m1513a(objectOutputStream);
                } catch (Throwable th) {
                    e = th;
                    af.m1513a(objectOutputStream);
                    throw e;
                }
            }
        } catch (Exception e4) {
            e = e4;
            objectOutputStream = null;
            Log.w(f889a, "Got unexpected exception while persisting events: ", e);
            f.getFileStreamPath("AppEventsLogger.persistedevents").delete();
            af.m1513a(objectOutputStream);
        } catch (Throwable th2) {
            e = th2;
            objectOutputStream = null;
            af.m1513a(objectOutputStream);
            throw e;
        }
    }
}
