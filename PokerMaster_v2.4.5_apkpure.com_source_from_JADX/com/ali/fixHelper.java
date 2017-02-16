package com.ali;

import android.content.Context;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.Log;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import dalvik.system.DexFile;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class fixHelper {
    static final String TAG = "ALi";
    static String dataDir;
    private static String local_datafile;
    private static String local_timefile;
    private static String local_verifysofile;
    static String nativeLibraryDir;
    static String sourcedir;

    public static native void fixfunc(int[] iArr);

    private static String getCurrentTimeMillis() {
        return "1483533495375";
    }

    public static native void soInit();

    static {
        dataDir = null;
        local_datafile = "/files/mobisec/libdemolishdata.so";
        local_timefile = LetterIndexBar.SEARCH_ICON_LETTER;
        local_verifysofile = "/files/mobisec/libpreverify1.so";
        nativeLibraryDir = null;
        sourcedir = null;
        prepareAllFiles();
        System.loadLibrary("demolish");
        soInit();
    }

    private static void prepareAllFiles() {
        Log.e(TAG, "prepare files begin at : " + System.currentTimeMillis());
        genAppInfo();
        if (checkDataFile()) {
            doUnzip();
        }
        Log.e(TAG, "prepare files end   at : " + System.currentTimeMillis());
    }

    private static void doUnzip() {
        Exception e2;
        ZipFile zipFile2 = null;
        try {
            local_timefile = "/files/mobisec/" + getCurrentTimeMillis();
            File timeStamp = new File(dataDir, local_timefile);
            timeStamp.createNewFile();
            Log.i(TAG, "unzip files to mobisec, Create timeStamp file success. " + timeStamp.getPath());
            ZipFile zipFile22 = new ZipFile(sourcedir);
            try {
                File libdemolishdata = new File(dataDir, local_datafile);
                if (libdemolishdata.exists()) {
                    libdemolishdata.delete();
                }
                File libpreverify1 = new File(dataDir, local_verifysofile);
                ZipEntry entry = zipFile22.getEntry("lib/armeabi/libdemolishdata.so");
                if (entry != null) {
                    unzipfile(zipFile22, entry, libdemolishdata);
                    unzipfile(zipFile22, zipFile22.getEntry("lib/armeabi/libpreverify1.so"), libpreverify1);
                    zipFile22.close();
                    zipFile2 = zipFile22;
                    return;
                }
                entry = zipFile22.getEntry("lib/armeabi-v7a/libdemolishdata.so");
                if (entry != null) {
                    unzipfile(zipFile22, entry, libdemolishdata);
                    unzipfile(zipFile22, zipFile22.getEntry("lib/armeabi-v7a/libpreverify1.so"), libpreverify1);
                    zipFile22.close();
                    zipFile2 = zipFile22;
                    return;
                }
                entry = zipFile22.getEntry("lib/arm64-v8a/libdemolishdata.so");
                if (entry != null) {
                    unzipfile(zipFile22, entry, libdemolishdata);
                    unzipfile(zipFile22, zipFile22.getEntry("lib/arm64-v8a/libpreverify1.so"), libpreverify1);
                    zipFile22.close();
                    zipFile2 = zipFile22;
                    return;
                }
                entry = zipFile22.getEntry("lib/x86/libdemolishdata.so");
                if (entry != null) {
                    unzipfile(zipFile22, entry, libdemolishdata);
                    unzipfile(zipFile22, zipFile22.getEntry("lib/x86/libpreverify1.so"), libpreverify1);
                    zipFile22.close();
                    zipFile2 = zipFile22;
                    return;
                }
                entry = zipFile22.getEntry("lib/mips/libdemolishdata.so");
                if (entry != null) {
                    unzipfile(zipFile22, entry, libdemolishdata);
                    unzipfile(zipFile22, zipFile22.getEntry("lib/mips/libpreverify1.so"), libpreverify1);
                    zipFile22.close();
                    zipFile2 = zipFile22;
                    return;
                }
                zipFile22.close();
                zipFile2 = zipFile22;
            } catch (Exception e) {
                e2 = e;
                zipFile2 = zipFile22;
                if (zipFile2 != null) {
                    try {
                        zipFile2.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
                Log.w(TAG, "unzip libdemolishdata.so error.", e2);
            }
        } catch (Exception e4) {
            e2 = e4;
            if (zipFile2 != null) {
                zipFile2.close();
            }
            Log.w(TAG, "unzip libdemolishdata.so error.", e2);
        }
    }

    private static boolean checkDataFile() {
        Log.i(TAG, "the dex time " + getCurrentTimeMillis());
        if (new File(nativeLibraryDir, "/libdemolishdata.so").exists()) {
            Log.i(TAG, "tks god. data file in nativelibDir is exists. ");
            return false;
        }
        File dataFile = new File(dataDir, local_datafile);
        if (!dataFile.getParentFile().exists()) {
            dataFile.getParentFile().mkdirs();
        }
        if (dataFile.exists()) {
            local_timefile = "/files/mobisec/" + getCurrentTimeMillis();
            File timeStamp = new File(dataDir, local_timefile);
            if (timeStamp.exists()) {
                Log.i(TAG, "timeStamp is exists, the data file is okay." + timeStamp.getPath());
                return false;
            }
            try {
                Log.i(TAG, "timeStamp is not exists, the data file maybe is old. need to unzip.");
                timeStamp.createNewFile();
                Log.i(TAG, "Create timeStamp file success. ");
                return true;
            } catch (IOException e) {
                Log.w(TAG, "Create timeStamp file error. ");
                return true;
            }
        }
        Log.i(TAG, "data file in dataDir is not exists, need to unzip . ");
        return true;
    }

    public static void genAppInfo() {
        try {
            Class<?> activityThread = Class.forName("android.app.ActivityThread");
            Method m_currentActivityThread = activityThread.getDeclaredMethod("currentActivityThread", new Class[0]);
            m_currentActivityThread.setAccessible(true);
            Object ApplicationInfo = getField(getField(m_currentActivityThread.invoke(null, new Object[0]), activityThread, "mBoundApplication"), Class.forName("android.app.ActivityThread$AppBindData"), "appInfo");
            Class<?> appinfo_cls = Class.forName("android.content.pm.ApplicationInfo");
            sourcedir = (String) getField(ApplicationInfo, appinfo_cls, "sourceDir");
            dataDir = (String) getField(ApplicationInfo, appinfo_cls, "dataDir");
            nativeLibraryDir = (String) getField(ApplicationInfo, appinfo_cls, "nativeLibraryDir");
            Log.i(TAG, "sourcedir " + sourcedir);
            Log.i(TAG, "nativeLibraryDir " + nativeLibraryDir);
        } catch (Exception e) {
            Log.w(TAG, "gen appInfo error.", e);
        }
    }

    private static void unzipfile(ZipFile zipFile, ZipEntry zipEntry, File localfilepath) {
        try {
            if (!localfilepath.getParentFile().exists()) {
                localfilepath.getParentFile().mkdirs();
            }
            FileOutputStream foStream = new FileOutputStream(localfilepath);
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(zipFile.getInputStream(zipEntry));
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(foStream);
            byte[] bArr = new byte[AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT];
            for (int read = bufferedInputStream2.read(bArr); read != -1; read = bufferedInputStream2.read(bArr)) {
                bufferedOutputStream2.write(bArr, 0, read);
            }
            if (bufferedInputStream2 != null) {
                bufferedInputStream2.close();
            }
            if (bufferedOutputStream2 != null) {
                bufferedOutputStream2.close();
            }
            if (foStream != null) {
                foStream.close();
            }
        } catch (Throwable e) {
            Log.e(TAG, "unzip " + zipEntry.getName() + " found a exception.", e);
        }
    }

    public static Object getField(Object obj, Class<?> cl, String field) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Field localField = cl.getDeclaredField(field);
        localField.setAccessible(true);
        return localField.get(obj);
    }

    public static void prepareForWalkaroundPreVerify(Context context) {
        File file = new File(context.getFilesDir(), "verify_walkround1.dex");
        File file2 = new File(context.getFilesDir(), "verify_raw1.dex");
        try {
            if (!file2.exists()) {
                String str = context.getApplicationInfo().nativeLibraryDir + "/libpreverify1.so";
                if (new File(str).exists()) {
                    copyInputStreamToFile(new FileInputStream(str), file2);
                } else {
                    Log.e(TAG, str + " is not exists. so try to open file in mobisec .");
                    copyInputStreamToFile(new FileInputStream(context.getApplicationInfo().dataDir + local_verifysofile), file2);
                }
            }
            DexFile loaddex = DexFile.loadDex(file2.getCanonicalPath(), file.getCanonicalPath(), 0);
            if (loaddex != null) {
                Object makeDexElement = makeDexElement(null, loaddex);
                if (makeDexElement != null) {
                    ClassLoader classLoader = context.getClassLoader();
                    setfield(getfield(classLoader, "pathList").get(classLoader), "dexElements", makeDexElement);
                    Log.i(TAG, "insert small dex in pathList success.");
                }
            }
        } catch (Exception e) {
            Log.w(TAG, "insert small dex in pathList error.", e);
        }
    }

    private static void setfield(Object obj, String str, Object obj2) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Field a = getfield(obj, str);
        Object[] objArr = (Object[]) a.get(obj);
        Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), objArr.length + 1);
        objArr2[0] = obj2;
        System.arraycopy(objArr, 0, objArr2, 1, objArr.length);
        a.set(obj, objArr2);
    }

    private static Field getfield(Object obj, String str) throws NoSuchFieldException {
        Class<?> cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException e) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    public static Object makeDexElement(File file, DexFile dexFile) {
        Class<?>[] d = new Class[]{File.class, ZipFile.class, DexFile.class};
        Class<?>[] e = new Class[]{File.class, File.class, DexFile.class};
        Class<?>[] f = new Class[]{File.class, Boolean.TYPE, File.class, DexFile.class};
        try {
            Class<?> cls = Class.forName("dalvik.system.DexPathList$Element");
            Constructor<?> a = cls.getDeclaredConstructor(f);
            if (a != null) {
                return a.newInstance(new Object[]{null, Boolean.valueOf(false), null, dexFile});
            }
            a = cls.getDeclaredConstructor(e);
            if (a != null) {
                return a.newInstance(new Object[]{null, null, dexFile});
            }
            Constructor<?> a2 = cls.getDeclaredConstructor(d);
            if (a2 != null) {
                return a2.newInstance(new Object[]{null, null, dexFile});
            }
            throw new Exception("make DexElement fail");
        } catch (Exception ee) {
            ee.printStackTrace();
            return null;
        }
    }

    public static void copyInputStreamToFile(InputStream inputStream, File file) {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            FileChannel fileChannel = fos.getChannel();
            byte[] bArr = new byte[AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT];
            int read = inputStream.read(bArr);
            while (read != -1) {
                fileChannel.write(ByteBuffer.wrap(bArr, 0, read));
                read = inputStream.read(bArr);
            }
            if (fileChannel != null) {
                fileChannel.close();
            }
            if (fos != null) {
                fos.close();
            }
        } catch (Exception e) {
            Log.e(TAG, "copyInputStreamToFile " + file.getName() + " error.", e);
        }
    }
}
