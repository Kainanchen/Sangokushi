package com.facebook.p036h;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import com.facebook.FacebookException;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.h.c */
public class AttributionIdentifiers {
    private static final String f1626e;
    private static AttributionIdentifiers f1627g;
    String f1628a;
    String f1629b;
    String f1630c;
    boolean f1631d;
    private long f1632f;

    /* renamed from: com.facebook.h.c.a */
    private static final class AttributionIdentifiers implements IInterface {
        private IBinder f1623a;

        AttributionIdentifiers(IBinder iBinder) {
            this.f1623a = iBinder;
        }

        public final IBinder asBinder() {
            return this.f1623a;
        }

        public final String m1584a() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f1623a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                String readString = obtain2.readString();
                return readString;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public final boolean m1585b() {
            boolean z = true;
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(1);
                this.f1623a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z = false;
                }
                obtain2.recycle();
                obtain.recycle();
                return z;
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    /* renamed from: com.facebook.h.c.b */
    private static final class AttributionIdentifiers implements ServiceConnection {
        AtomicBoolean f1624a;
        final BlockingQueue<IBinder> f1625b;

        private AttributionIdentifiers() {
            this.f1624a = new AtomicBoolean(false);
            this.f1625b = new LinkedBlockingDeque();
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f1625b.put(iBinder);
            } catch (InterruptedException e) {
            }
        }

        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    static {
        f1626e = AttributionIdentifiers.class.getCanonicalName();
    }

    private static AttributionIdentifiers m1588b(Context context) {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new FacebookException("getAndroidId cannot be called on the main thread.");
            }
            Method a = af.m1502a("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
            if (a == null) {
                return null;
            }
            Object a2 = af.m1494a(null, a, context);
            if (!(a2 instanceof Integer) || ((Integer) a2).intValue() != 0) {
                return null;
            }
            a = af.m1502a("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class);
            if (a == null) {
                return null;
            }
            Object a3 = af.m1494a(null, a, context);
            if (a3 == null) {
                return null;
            }
            a = af.m1501a(a3.getClass(), "getId", new Class[0]);
            Method a4 = af.m1501a(a3.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
            if (a == null || a4 == null) {
                return null;
            }
            AttributionIdentifiers attributionIdentifiers = new AttributionIdentifiers();
            attributionIdentifiers.f1629b = (String) af.m1494a(a3, a, new Object[0]);
            attributionIdentifiers.f1631d = ((Boolean) af.m1494a(a3, a4, new Object[0])).booleanValue();
            return attributionIdentifiers;
        } catch (Exception e) {
            af.m1515a(e);
            return null;
        }
    }

    private static AttributionIdentifiers m1589c(Context context) {
        AttributionIdentifiers attributionIdentifiers;
        ServiceConnection attributionIdentifiers2 = new AttributionIdentifiers();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (context.bindService(intent, attributionIdentifiers2, 1)) {
            try {
                if (attributionIdentifiers2.f1624a.compareAndSet(true, true)) {
                    throw new IllegalStateException("Binder already consumed");
                }
                AttributionIdentifiers attributionIdentifiers3 = new AttributionIdentifiers((IBinder) attributionIdentifiers2.f1625b.take());
                attributionIdentifiers = new AttributionIdentifiers();
                attributionIdentifiers.f1629b = attributionIdentifiers3.m1584a();
                attributionIdentifiers.f1631d = attributionIdentifiers3.m1585b();
                return attributionIdentifiers;
            } catch (Exception e) {
                attributionIdentifiers = e;
                af.m1515a((Exception) attributionIdentifiers);
            } finally {
                context.unbindService(attributionIdentifiers2);
            }
        }
        return null;
    }

    public static AttributionIdentifiers m1586a(Context context) {
        Exception e;
        Cursor cursor = null;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            Log.e(f1626e, "getAttributionIdentifiers should not be called from the main thread");
        }
        if (f1627g != null && System.currentTimeMillis() - f1627g.f1632f < 3600000) {
            return f1627g;
        }
        AttributionIdentifiers attributionIdentifiers;
        String[] strArr;
        Uri parse;
        PackageManager packageManager;
        String installerPackageName;
        Cursor query;
        int columnIndex;
        int columnIndex2;
        AttributionIdentifiers b = AttributionIdentifiers.m1588b(context);
        if (b == null) {
            b = AttributionIdentifiers.m1589c(context);
            if (b == null) {
                attributionIdentifiers = new AttributionIdentifiers();
                strArr = new String[]{LogBuilder.KEY_AID, "androidid", "limit_tracking"};
                if (context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0) != null) {
                    parse = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
                } else if (context.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0) == null) {
                    parse = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                } else {
                    parse = null;
                }
                packageManager = context.getPackageManager();
                if (packageManager == null) {
                    installerPackageName = packageManager.getInstallerPackageName(context.getPackageName());
                } else {
                    installerPackageName = null;
                }
                if (installerPackageName != null) {
                    attributionIdentifiers.f1630c = installerPackageName;
                }
                if (parse == null) {
                    return AttributionIdentifiers.m1587a(attributionIdentifiers);
                }
                query = context.getContentResolver().query(parse, strArr, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            int columnIndex3 = query.getColumnIndex(LogBuilder.KEY_AID);
                            columnIndex = query.getColumnIndex("androidid");
                            columnIndex2 = query.getColumnIndex("limit_tracking");
                            attributionIdentifiers.f1628a = query.getString(columnIndex3);
                            if (columnIndex > 0 && columnIndex2 > 0 && attributionIdentifiers.f1629b == null) {
                                attributionIdentifiers.f1629b = query.getString(columnIndex);
                                attributionIdentifiers.f1631d = Boolean.parseBoolean(query.getString(columnIndex2));
                            }
                            if (query != null) {
                                query.close();
                            }
                            return AttributionIdentifiers.m1587a(attributionIdentifiers);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        try {
                            new StringBuilder("Caught unexpected exception in getAttributionId(): ").append(e.toString());
                            if (query != null) {
                                query.close();
                            }
                            return null;
                        } catch (Throwable th) {
                            Throwable th2 = th;
                            cursor = query;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th2;
                        }
                    }
                }
                b = AttributionIdentifiers.m1587a(attributionIdentifiers);
                if (query != null) {
                    return b;
                }
                query.close();
                return b;
            }
        }
        attributionIdentifiers = b;
        try {
            strArr = new String[]{LogBuilder.KEY_AID, "androidid", "limit_tracking"};
            if (context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0) != null) {
                parse = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
            } else if (context.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0) == null) {
                parse = null;
            } else {
                parse = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
            }
            packageManager = context.getPackageManager();
            if (packageManager == null) {
                installerPackageName = null;
            } else {
                installerPackageName = packageManager.getInstallerPackageName(context.getPackageName());
            }
            if (installerPackageName != null) {
                attributionIdentifiers.f1630c = installerPackageName;
            }
            if (parse == null) {
                return AttributionIdentifiers.m1587a(attributionIdentifiers);
            }
            query = context.getContentResolver().query(parse, strArr, null, null, null);
            if (query != null) {
                if (query.moveToFirst()) {
                    int columnIndex32 = query.getColumnIndex(LogBuilder.KEY_AID);
                    columnIndex = query.getColumnIndex("androidid");
                    columnIndex2 = query.getColumnIndex("limit_tracking");
                    attributionIdentifiers.f1628a = query.getString(columnIndex32);
                    attributionIdentifiers.f1629b = query.getString(columnIndex);
                    attributionIdentifiers.f1631d = Boolean.parseBoolean(query.getString(columnIndex2));
                    if (query != null) {
                        query.close();
                    }
                    return AttributionIdentifiers.m1587a(attributionIdentifiers);
                }
            }
            b = AttributionIdentifiers.m1587a(attributionIdentifiers);
            if (query != null) {
                return b;
            }
            query.close();
            return b;
        } catch (Exception e3) {
            e = e3;
            query = null;
            new StringBuilder("Caught unexpected exception in getAttributionId(): ").append(e.toString());
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th3) {
            th2 = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    private static AttributionIdentifiers m1587a(AttributionIdentifiers attributionIdentifiers) {
        attributionIdentifiers.f1632f = System.currentTimeMillis();
        f1627g = attributionIdentifiers;
        return attributionIdentifiers;
    }
}
