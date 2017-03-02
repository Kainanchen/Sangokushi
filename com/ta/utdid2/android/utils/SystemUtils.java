package com.ta.utdid2.android.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Environment;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.Log;
import com.tencent.connect.common.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SystemUtils {
    public static String getCpuInfo() {
        IOException localIOException;
        FileNotFoundException localFileNotFoundException;
        String str = null;
        try {
            FileReader localFileReader = new FileReader("/proc/cpuinfo");
            FileReader fileReader;
            if (localFileReader != null) {
                BufferedReader localBufferedReader;
                try {
                    localBufferedReader = new BufferedReader(localFileReader, AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT);
                } catch (IOException e) {
                    localIOException = e;
                    try {
                        Log.e("Could not read from file /proc/cpuinfo", localIOException.toString());
                        fileReader = localFileReader;
                    } catch (FileNotFoundException e2) {
                        localFileNotFoundException = e2;
                        fileReader = localFileReader;
                        Log.e("BaseParameter-Could not open file /proc/cpuinfo", localFileNotFoundException.toString());
                        if (str == null) {
                            return Constants.STR_EMPTY;
                        }
                        return str.substring(str.indexOf(58) + 1).trim();
                    }
                    if (str == null) {
                        return str.substring(str.indexOf(58) + 1).trim();
                    }
                    return Constants.STR_EMPTY;
                }
                BufferedReader bufferedReader;
                try {
                    str = localBufferedReader.readLine();
                    localBufferedReader.close();
                    localFileReader.close();
                    bufferedReader = localBufferedReader;
                    fileReader = localFileReader;
                } catch (IOException e3) {
                    localIOException = e3;
                    bufferedReader = localBufferedReader;
                    Log.e("Could not read from file /proc/cpuinfo", localIOException.toString());
                    fileReader = localFileReader;
                    if (str == null) {
                        return Constants.STR_EMPTY;
                    }
                    return str.substring(str.indexOf(58) + 1).trim();
                } catch (FileNotFoundException e4) {
                    localFileNotFoundException = e4;
                    bufferedReader = localBufferedReader;
                    fileReader = localFileReader;
                    Log.e("BaseParameter-Could not open file /proc/cpuinfo", localFileNotFoundException.toString());
                    if (str == null) {
                        return str.substring(str.indexOf(58) + 1).trim();
                    }
                    return Constants.STR_EMPTY;
                }
            }
            fileReader = localFileReader;
        } catch (FileNotFoundException e5) {
            localFileNotFoundException = e5;
            Log.e("BaseParameter-Could not open file /proc/cpuinfo", localFileNotFoundException.toString());
            if (str == null) {
                return Constants.STR_EMPTY;
            }
            return str.substring(str.indexOf(58) + 1).trim();
        }
        if (str == null) {
            return str.substring(str.indexOf(58) + 1).trim();
        }
        return Constants.STR_EMPTY;
    }

    public static int getSystemVersion() {
        try {
            return VERSION.class.getField("SDK_INT").getInt(null);
        } catch (Exception e) {
            try {
                return Integer.parseInt((String) VERSION.class.getField("SDK").get(null));
            } catch (Exception e2) {
                e2.printStackTrace();
                return 2;
            }
        }
    }

    public static File getRootFolder(String folderName) {
        if (Environment.getExternalStorageDirectory() == null) {
            return null;
        }
        File rootFolder = new File(String.format("%s%s%s", new Object[]{Environment.getExternalStorageDirectory().getAbsolutePath(), File.separator, folderName}));
        if (rootFolder == null || rootFolder.exists()) {
            return rootFolder;
        }
        rootFolder.mkdirs();
        return rootFolder;
    }

    public static String getAppLabel(Context pContext) {
        try {
            PackageManager lPM = pContext.getPackageManager();
            String lPackageName = pContext.getPackageName();
            if (!(lPM == null || lPackageName == null)) {
                return lPM.getApplicationLabel(lPM.getPackageInfo(lPackageName, 1).applicationInfo).toString();
            }
        } catch (NameNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
