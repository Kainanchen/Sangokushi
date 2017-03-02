package com.ta.utdid2.android.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.support.v4.view.MotionEventCompat;
import android.util.Log;

public class NetworkUtils {
    public static final String DEFAULT_WIFI_ADDRESS = "00-00-00-00-00-00";
    private static final String TAG = "NetworkUtils";
    private static final int[] WEAK_NETWORK_GROUP;
    public static final String WIFI = "Wi-Fi";
    private static ConnectivityManager sConnManager;

    static {
        sConnManager = null;
        WEAK_NETWORK_GROUP = new int[]{4, 7, 2, 1};
    }

    public static boolean isConnected(Context context) {
        ConnectivityManager connManager = getConnManager(context);
        if (connManager != null) {
            try {
                NetworkInfo networkInfo = connManager.getActiveNetworkInfo();
                if (networkInfo != null) {
                    return networkInfo.isConnected();
                }
            } catch (Exception e) {
                Log.e(TAG, e.toString());
            }
        } else {
            Log.e(TAG, "connManager is null!");
        }
        return false;
    }

    public static boolean isConnectedToWeakNetwork(Context context) {
        ConnectivityManager connManager = getConnManager(context);
        if (connManager != null) {
            try {
                NetworkInfo networkInfo = connManager.getActiveNetworkInfo();
                if (networkInfo != null) {
                    int subType = networkInfo.getSubtype();
                    if (DebugUtils.DBG) {
                        Log.d(TAG, "subType:" + subType + ": name:" + networkInfo.getSubtypeName());
                    }
                    for (int element : WEAK_NETWORK_GROUP) {
                        if (element == subType) {
                            return true;
                        }
                    }
                    return false;
                }
                Log.e(TAG, "networkInfo is null!");
                return false;
            } catch (Exception e) {
                Log.e(TAG, e.toString());
                return false;
            }
        }
        Log.e(TAG, "connManager is null!");
        return false;
    }

    public static ConnectivityManager getConnManager(Context context) {
        if (context == null) {
            Log.e(TAG, "context is null!");
            return null;
        }
        if (sConnManager == null) {
            sConnManager = (ConnectivityManager) context.getSystemService("connectivity");
        }
        return sConnManager;
    }

    public static String[] getNetworkState(Context paramContext) {
        String[] arrayOfString = new String[]{"Unknown", "Unknown"};
        try {
            if (paramContext.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", paramContext.getPackageName()) != 0) {
                arrayOfString[0] = "Unknown";
            } else {
                ConnectivityManager localConnectivityManager = (ConnectivityManager) paramContext.getSystemService("connectivity");
                if (localConnectivityManager == null) {
                    arrayOfString[0] = "Unknown";
                } else {
                    NetworkInfo localNetworkInfo1 = localConnectivityManager.getNetworkInfo(1);
                    if (localNetworkInfo1 == null || localNetworkInfo1.getState() != State.CONNECTED) {
                        NetworkInfo localNetworkInfo2 = localConnectivityManager.getNetworkInfo(0);
                        if (localNetworkInfo2 != null && localNetworkInfo2.getState() == State.CONNECTED) {
                            arrayOfString[0] = "2G/3G";
                            arrayOfString[1] = localNetworkInfo2.getSubtypeName();
                        }
                    } else {
                        arrayOfString[0] = WIFI;
                    }
                }
            }
        } catch (Exception e) {
        }
        return arrayOfString;
    }

    public static String getWifiAddress(Context context) {
        if (context == null) {
            return DEFAULT_WIFI_ADDRESS;
        }
        WifiInfo wifiinfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
        if (wifiinfo == null) {
            return DEFAULT_WIFI_ADDRESS;
        }
        String address = wifiinfo.getMacAddress();
        if (StringUtils.isEmpty(address)) {
            return DEFAULT_WIFI_ADDRESS;
        }
        return address;
    }

    private static String _convertIntToIp(int i) {
        return (i & MotionEventCompat.ACTION_MASK) + "." + ((i >> 8) & MotionEventCompat.ACTION_MASK) + "." + ((i >> 16) & MotionEventCompat.ACTION_MASK) + "." + ((i >> 24) & MotionEventCompat.ACTION_MASK);
    }

    public static String getWifiIpAddress(Context context) {
        String str = null;
        if (context != null) {
            try {
                WifiInfo wifiinfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
                if (wifiinfo != null) {
                    str = _convertIntToIp(wifiinfo.getIpAddress());
                }
            } catch (Exception e) {
            }
        }
        return str;
    }

    public static boolean isWifi(Context context) {
        if (context == null) {
            return false;
        }
        try {
            if (getNetworkState(context)[0].equals(WIFI)) {
                return true;
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }
}
