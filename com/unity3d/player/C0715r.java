package com.unity3d.player;

import android.content.Context;
import android.hardware.GeomagneticField;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationProvider;
import android.os.Bundle;
import com.igexin.download.Downloads;
import java.util.List;

/* renamed from: com.unity3d.player.r */
final class C0715r implements LocationListener {
    private final Context f2304a;
    private final UnityPlayer f2305b;
    private Location f2306c;
    private float f2307d;
    private boolean f2308e;
    private int f2309f;
    private boolean f2310g;
    private int f2311h;

    protected C0715r(Context context, UnityPlayer unityPlayer) {
        this.f2307d = 0.0f;
        this.f2308e = false;
        this.f2309f = 0;
        this.f2310g = false;
        this.f2311h = 0;
        this.f2304a = context;
        this.f2305b = unityPlayer;
    }

    private void m2601a(int i) {
        this.f2311h = i;
        this.f2305b.nativeSetLocationStatus(i);
    }

    private void m2602a(Location location) {
        if (location != null && C0715r.m2603a(location, this.f2306c)) {
            this.f2306c = location;
            this.f2305b.nativeSetLocation((float) location.getLatitude(), (float) location.getLongitude(), (float) location.getAltitude(), location.getAccuracy(), ((double) location.getTime()) / 1000.0d, new GeomagneticField((float) this.f2306c.getLatitude(), (float) this.f2306c.getLongitude(), (float) this.f2306c.getAltitude(), this.f2306c.getTime()).getDeclination());
        }
    }

    private static boolean m2603a(Location location, Location location2) {
        if (location2 == null) {
            return true;
        }
        long time = location.getTime() - location2.getTime();
        boolean z = time > 120000;
        boolean z2 = time < -120000;
        boolean z3 = time > 0;
        if (z) {
            return true;
        }
        if (z2) {
            return false;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        return !(accuracy < 0) ? (!z3 || (accuracy > 0)) ? z3 && ((accuracy > Downloads.STATUS_SUCCESS ? 1 : 0) | (location.getAccuracy() == 0.0f ? 1 : 0)) == 0 && C0715r.m2604a(location.getProvider(), location2.getProvider()) : true : true;
    }

    private static boolean m2604a(String str, String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }

    public final void m2605a(float f) {
        this.f2307d = f;
    }

    public final boolean m2606a() {
        return !((LocationManager) this.f2304a.getSystemService("location")).getProviders(new Criteria(), true).isEmpty();
    }

    public final void m2607b() {
        this.f2310g = false;
        if (this.f2308e) {
            C0708m.Log(5, "Location_StartUpdatingLocation already started!");
        } else if (m2606a()) {
            LocationManager locationManager = (LocationManager) this.f2304a.getSystemService("location");
            m2601a(1);
            List<String> providers = locationManager.getProviders(true);
            if (providers.isEmpty()) {
                m2601a(3);
                return;
            }
            LocationProvider locationProvider;
            if (this.f2309f == 2) {
                for (String provider : providers) {
                    LocationProvider provider2 = locationManager.getProvider(provider);
                    if (provider2.getAccuracy() == 2) {
                        locationProvider = provider2;
                        break;
                    }
                }
            }
            locationProvider = null;
            for (String provider3 : providers) {
                if (locationProvider == null || locationManager.getProvider(provider3).getAccuracy() != 1) {
                    m2602a(locationManager.getLastKnownLocation(provider3));
                    locationManager.requestLocationUpdates(provider3, 0, this.f2307d, this, this.f2304a.getMainLooper());
                    this.f2308e = true;
                }
            }
        } else {
            m2601a(3);
        }
    }

    public final void m2608b(float f) {
        if (f < 100.0f) {
            this.f2309f = 1;
        } else if (f < 500.0f) {
            this.f2309f = 1;
        } else {
            this.f2309f = 2;
        }
    }

    public final void m2609c() {
        ((LocationManager) this.f2304a.getSystemService("location")).removeUpdates(this);
        this.f2308e = false;
        this.f2306c = null;
        m2601a(0);
    }

    public final void m2610d() {
        if (this.f2311h == 1 || this.f2311h == 2) {
            this.f2310g = true;
            m2609c();
        }
    }

    public final void m2611e() {
        if (this.f2310g) {
            m2607b();
        }
    }

    public final void onLocationChanged(Location location) {
        m2601a(2);
        m2602a(location);
    }

    public final void onProviderDisabled(String str) {
        this.f2306c = null;
    }

    public final void onProviderEnabled(String str) {
    }

    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
