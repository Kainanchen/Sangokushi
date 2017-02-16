package org.cocos2dx.lib;

import a.does.not.Exists0;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build.VERSION;
import com.ali.fixHelper;

public class Cocos2dxAccelerometer implements SensorEventListener {
    private static final String TAG = null;
    private final Sensor mAccelerometer;
    private final Context mContext;
    private final int mNaturalOrientation;
    private final SensorManager mSensorManager;

    static {
        fixHelper.fixfunc(new int[]{15994, 15995, 15996, 15997, 15998, 15999});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native Cocos2dxAccelerometer(Context context);

    public static native void onSensorChanged(float f, float f2, float f3, long j);

    public native void disable();

    public native void enable();

    public native void onAccuracyChanged(Sensor sensor, int i);

    public native void onSensorChanged(SensorEvent sensorEvent);

    public native void setInterval(float f);

    static void __clinit__() {
        TAG = Cocos2dxAccelerometer.class.getSimpleName();
    }
}
