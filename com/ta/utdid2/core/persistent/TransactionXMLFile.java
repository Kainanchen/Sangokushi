package com.ta.utdid2.core.persistent;

import com.loopj.android.http.AsyncHttpResponseHandler;
import com.ta.utdid2.core.persistent.MySharedPreferences.MyEditor;
import com.ta.utdid2.core.persistent.MySharedPreferences.OnSharedPreferenceChangeListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

public class TransactionXMLFile {
    private static final Object GLOBAL_COMMIT_LOCK;
    public static final int MODE_PRIVATE = 0;
    public static final int MODE_WORLD_READABLE = 1;
    public static final int MODE_WORLD_WRITEABLE = 2;
    private File mPreferencesDir;
    private final Object mSync;
    private HashMap<File, MySharedPreferencesImpl> sSharedPrefs;

    private static final class MySharedPreferencesImpl implements MySharedPreferences {
        private static final Object mContent;
        private boolean hasChange;
        private final File mBackupFile;
        private final File mFile;
        private WeakHashMap<OnSharedPreferenceChangeListener, Object> mListeners;
        private Map mMap;
        private final int mMode;

        public final class EditorImpl implements MyEditor {
            private boolean mClear;
            private final Map<String, Object> mModified;

            public EditorImpl() {
                this.mModified = new HashMap();
                this.mClear = false;
            }

            public MyEditor putString(String key, String value) {
                synchronized (this) {
                    this.mModified.put(key, value);
                }
                return this;
            }

            public MyEditor putInt(String key, int value) {
                synchronized (this) {
                    this.mModified.put(key, Integer.valueOf(value));
                }
                return this;
            }

            public MyEditor putLong(String key, long value) {
                synchronized (this) {
                    this.mModified.put(key, Long.valueOf(value));
                }
                return this;
            }

            public MyEditor putFloat(String key, float value) {
                synchronized (this) {
                    this.mModified.put(key, Float.valueOf(value));
                }
                return this;
            }

            public MyEditor putBoolean(String key, boolean value) {
                synchronized (this) {
                    this.mModified.put(key, Boolean.valueOf(value));
                }
                return this;
            }

            public MyEditor remove(String key) {
                synchronized (this) {
                    this.mModified.put(key, this);
                }
                return this;
            }

            public MyEditor clear() {
                synchronized (this) {
                    this.mClear = true;
                }
                return this;
            }

            public boolean commit() {
                Throwable th;
                boolean hasListeners = true;
                List<String> keysModified = null;
                Set<OnSharedPreferenceChangeListener> listeners = null;
                synchronized (TransactionXMLFile.GLOBAL_COMMIT_LOCK) {
                    try {
                        if (MySharedPreferencesImpl.this.mListeners.size() <= 0) {
                            hasListeners = false;
                        }
                        if (hasListeners) {
                            List<String> keysModified2 = new ArrayList();
                            try {
                                listeners = new HashSet(MySharedPreferencesImpl.this.mListeners.keySet());
                                keysModified = keysModified2;
                            } catch (Throwable th2) {
                                th = th2;
                                keysModified = keysModified2;
                                throw th;
                            }
                        }
                        synchronized (this) {
                            if (this.mClear) {
                                MySharedPreferencesImpl.this.mMap.clear();
                                this.mClear = false;
                            }
                            for (Entry<String, Object> e : this.mModified.entrySet()) {
                                String k = (String) e.getKey();
                                EditorImpl v = e.getValue();
                                if (v == this) {
                                    MySharedPreferencesImpl.this.mMap.remove(k);
                                } else {
                                    MySharedPreferencesImpl.this.mMap.put(k, v);
                                }
                                if (hasListeners) {
                                    keysModified.add(k);
                                }
                            }
                            this.mModified.clear();
                        }
                        boolean returnValue = MySharedPreferencesImpl.this.writeFileLocked();
                        if (returnValue) {
                            MySharedPreferencesImpl.this.setHasChange(true);
                        }
                        if (hasListeners) {
                            for (int i = keysModified.size() - 1; i >= 0; i--) {
                                String key = (String) keysModified.get(i);
                                for (OnSharedPreferenceChangeListener listener : listeners) {
                                    if (listener != null) {
                                        listener.onSharedPreferenceChanged(MySharedPreferencesImpl.this, key);
                                    }
                                }
                            }
                        }
                        return returnValue;
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                }
            }
        }

        static {
            mContent = new Object();
        }

        MySharedPreferencesImpl(File file, int mode, Map initialContents) {
            this.hasChange = false;
            this.mFile = file;
            this.mBackupFile = TransactionXMLFile.makeBackupFile(file);
            this.mMode = mode;
            if (initialContents == null) {
                initialContents = new HashMap();
            }
            this.mMap = initialContents;
            this.mListeners = new WeakHashMap();
        }

        public boolean checkFile() {
            if (this.mFile == null || !new File(this.mFile.getAbsolutePath()).exists()) {
                return false;
            }
            return true;
        }

        public void setHasChange(boolean hasChange) {
            synchronized (this) {
                this.hasChange = hasChange;
            }
        }

        public boolean hasFileChanged() {
            boolean z;
            synchronized (this) {
                z = this.hasChange;
            }
            return z;
        }

        public void replace(Map newContents) {
            if (newContents != null) {
                synchronized (this) {
                    this.mMap = newContents;
                }
            }
        }

        public void registerOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener listener) {
            synchronized (this) {
                this.mListeners.put(listener, mContent);
            }
        }

        public void unregisterOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener listener) {
            synchronized (this) {
                this.mListeners.remove(listener);
            }
        }

        public Map<String, ?> getAll() {
            Map hashMap;
            synchronized (this) {
                hashMap = new HashMap(this.mMap);
            }
            return hashMap;
        }

        public String getString(String key, String defValue) {
            String v;
            synchronized (this) {
                v = (String) this.mMap.get(key);
                if (v == null) {
                    v = defValue;
                }
            }
            return v;
        }

        public int getInt(String key, int defValue) {
            synchronized (this) {
                Integer v = (Integer) this.mMap.get(key);
                if (v != null) {
                    defValue = v.intValue();
                }
            }
            return defValue;
        }

        public long getLong(String key, long defValue) {
            synchronized (this) {
                Long v = (Long) this.mMap.get(key);
                if (v != null) {
                    defValue = v.longValue();
                }
            }
            return defValue;
        }

        public float getFloat(String key, float defValue) {
            synchronized (this) {
                Float v = (Float) this.mMap.get(key);
                if (v != null) {
                    defValue = v.floatValue();
                }
            }
            return defValue;
        }

        public boolean getBoolean(String key, boolean defValue) {
            synchronized (this) {
                Boolean v = (Boolean) this.mMap.get(key);
                if (v != null) {
                    defValue = v.booleanValue();
                }
            }
            return defValue;
        }

        public boolean contains(String key) {
            boolean containsKey;
            synchronized (this) {
                containsKey = this.mMap.containsKey(key);
            }
            return containsKey;
        }

        public MyEditor edit() {
            return new EditorImpl();
        }

        private FileOutputStream createFileOutputStream(File file) {
            FileOutputStream str = null;
            try {
                str = new FileOutputStream(file);
            } catch (FileNotFoundException e) {
                if (!file.getParentFile().mkdir()) {
                    return null;
                }
                try {
                    str = new FileOutputStream(file);
                } catch (FileNotFoundException e2) {
                }
            }
            return str;
        }

        private boolean writeFileLocked() {
            if (this.mFile.exists()) {
                if (this.mBackupFile.exists()) {
                    this.mFile.delete();
                } else if (!this.mFile.renameTo(this.mBackupFile)) {
                    return false;
                }
            }
            try {
                FileOutputStream str = createFileOutputStream(this.mFile);
                if (str == null) {
                    return false;
                }
                XmlUtils.writeMapXml(this.mMap, str);
                str.close();
                this.mBackupFile.delete();
                return true;
            } catch (XmlPullParserException e) {
                if (this.mFile.exists()) {
                    return false;
                }
                this.mFile.delete();
                return false;
            } catch (IOException e2) {
                if (this.mFile.exists()) {
                    return false;
                }
                this.mFile.delete();
                return false;
            }
        }
    }

    static {
        GLOBAL_COMMIT_LOCK = new Object();
    }

    public TransactionXMLFile(String dir) {
        this.mSync = new Object();
        this.sSharedPrefs = new HashMap();
        if (dir == null || dir.length() <= 0) {
            throw new RuntimeException("Directory can not be empty");
        }
        this.mPreferencesDir = new File(dir);
    }

    private File makeFilename(File base, String name) {
        if (name.indexOf(File.separatorChar) < 0) {
            return new File(base, name);
        }
        throw new IllegalArgumentException("File " + name + " contains a path separator");
    }

    private File getPreferencesDir() {
        File file;
        synchronized (this.mSync) {
            file = this.mPreferencesDir;
        }
        return file;
    }

    private File getSharedPrefsFile(String name) {
        return makeFilename(getPreferencesDir(), new StringBuilder(String.valueOf(name)).append(".xml").toString());
    }

    public MySharedPreferences getMySharedPreferences(String name, int mode) {
        FileInputStream fileInputStream;
        byte[] buf;
        String str;
        FileNotFoundException e1;
        MySharedPreferencesImpl sp;
        Throwable th;
        IOException e2;
        FileNotFoundException e;
        IOException e3;
        Exception e4;
        File f = getSharedPrefsFile(name);
        synchronized (GLOBAL_COMMIT_LOCK) {
            MySharedPreferencesImpl sp2 = (MySharedPreferencesImpl) this.sSharedPrefs.get(f);
            if (sp2 == null || sp2.hasFileChanged()) {
                File backup = makeBackupFile(f);
                if (backup.exists()) {
                    f.delete();
                    backup.renameTo(f);
                }
                if (f.exists()) {
                    f.canRead();
                }
                Map map = null;
                if (f.exists() && f.canRead()) {
                    FileInputStream str2;
                    try {
                        str2 = new FileInputStream(f);
                        try {
                            map = XmlUtils.readMapXml(str2);
                            str2.close();
                            fileInputStream = str2;
                        } catch (XmlPullParserException e5) {
                            try {
                                fileInputStream = new FileInputStream(f);
                                try {
                                    buf = new byte[fileInputStream.available()];
                                    fileInputStream.read(buf);
                                    str = new String(buf, MODE_PRIVATE, buf.length, AsyncHttpResponseHandler.DEFAULT_CHARSET);
                                } catch (FileNotFoundException e6) {
                                    e1 = e6;
                                    e1.printStackTrace();
                                    synchronized (GLOBAL_COMMIT_LOCK) {
                                        if (sp2 != null) {
                                            sp2 = (MySharedPreferencesImpl) this.sSharedPrefs.get(f);
                                            if (sp2 == null) {
                                                sp = new MySharedPreferencesImpl(f, mode, map);
                                                try {
                                                    this.sSharedPrefs.put(f, sp);
                                                    sp2 = sp;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    sp2 = sp;
                                                    throw th;
                                                }
                                            }
                                        }
                                        try {
                                            sp2.replace(map);
                                        } catch (Throwable th3) {
                                            th = th3;
                                            throw th;
                                        }
                                        return sp2;
                                    }
                                } catch (IOException e7) {
                                    e2 = e7;
                                    e2.printStackTrace();
                                    synchronized (GLOBAL_COMMIT_LOCK) {
                                        if (sp2 != null) {
                                            sp2.replace(map);
                                        } else {
                                            sp2 = (MySharedPreferencesImpl) this.sSharedPrefs.get(f);
                                            if (sp2 == null) {
                                                sp = new MySharedPreferencesImpl(f, mode, map);
                                                this.sSharedPrefs.put(f, sp);
                                                sp2 = sp;
                                            }
                                        }
                                        return sp2;
                                    }
                                }
                            } catch (FileNotFoundException e8) {
                                e1 = e8;
                                fileInputStream = str2;
                                e1.printStackTrace();
                                synchronized (GLOBAL_COMMIT_LOCK) {
                                    if (sp2 != null) {
                                        sp2 = (MySharedPreferencesImpl) this.sSharedPrefs.get(f);
                                        if (sp2 == null) {
                                            sp = new MySharedPreferencesImpl(f, mode, map);
                                            this.sSharedPrefs.put(f, sp);
                                            sp2 = sp;
                                        }
                                    } else {
                                        sp2.replace(map);
                                    }
                                    return sp2;
                                }
                            } catch (IOException e9) {
                                e2 = e9;
                                fileInputStream = str2;
                                e2.printStackTrace();
                                synchronized (GLOBAL_COMMIT_LOCK) {
                                    if (sp2 != null) {
                                        sp2.replace(map);
                                    } else {
                                        sp2 = (MySharedPreferencesImpl) this.sSharedPrefs.get(f);
                                        if (sp2 == null) {
                                            sp = new MySharedPreferencesImpl(f, mode, map);
                                            this.sSharedPrefs.put(f, sp);
                                            sp2 = sp;
                                        }
                                    }
                                    return sp2;
                                }
                            }
                            synchronized (GLOBAL_COMMIT_LOCK) {
                                if (sp2 != null) {
                                    sp2 = (MySharedPreferencesImpl) this.sSharedPrefs.get(f);
                                    if (sp2 == null) {
                                        sp = new MySharedPreferencesImpl(f, mode, map);
                                        this.sSharedPrefs.put(f, sp);
                                        sp2 = sp;
                                    }
                                } else {
                                    sp2.replace(map);
                                }
                                return sp2;
                            }
                        } catch (FileNotFoundException e10) {
                            e = e10;
                            fileInputStream = str2;
                            e.printStackTrace();
                            synchronized (GLOBAL_COMMIT_LOCK) {
                                if (sp2 != null) {
                                    sp2.replace(map);
                                } else {
                                    sp2 = (MySharedPreferencesImpl) this.sSharedPrefs.get(f);
                                    if (sp2 == null) {
                                        sp = new MySharedPreferencesImpl(f, mode, map);
                                        this.sSharedPrefs.put(f, sp);
                                        sp2 = sp;
                                    }
                                }
                                return sp2;
                            }
                        } catch (IOException e11) {
                            e3 = e11;
                            fileInputStream = str2;
                            e3.printStackTrace();
                            synchronized (GLOBAL_COMMIT_LOCK) {
                                if (sp2 != null) {
                                    sp2 = (MySharedPreferencesImpl) this.sSharedPrefs.get(f);
                                    if (sp2 == null) {
                                        sp = new MySharedPreferencesImpl(f, mode, map);
                                        this.sSharedPrefs.put(f, sp);
                                        sp2 = sp;
                                    }
                                } else {
                                    sp2.replace(map);
                                }
                                return sp2;
                            }
                        } catch (Exception e12) {
                            e4 = e12;
                            fileInputStream = str2;
                            e4.printStackTrace();
                            synchronized (GLOBAL_COMMIT_LOCK) {
                                if (sp2 != null) {
                                    sp2.replace(map);
                                } else {
                                    sp2 = (MySharedPreferencesImpl) this.sSharedPrefs.get(f);
                                    if (sp2 == null) {
                                        sp = new MySharedPreferencesImpl(f, mode, map);
                                        this.sSharedPrefs.put(f, sp);
                                        sp2 = sp;
                                    }
                                }
                                return sp2;
                            }
                        }
                    } catch (XmlPullParserException e13) {
                        str2 = null;
                        fileInputStream = new FileInputStream(f);
                        buf = new byte[fileInputStream.available()];
                        fileInputStream.read(buf);
                        str = new String(buf, MODE_PRIVATE, buf.length, AsyncHttpResponseHandler.DEFAULT_CHARSET);
                        synchronized (GLOBAL_COMMIT_LOCK) {
                            if (sp2 != null) {
                                sp2 = (MySharedPreferencesImpl) this.sSharedPrefs.get(f);
                                if (sp2 == null) {
                                    sp = new MySharedPreferencesImpl(f, mode, map);
                                    this.sSharedPrefs.put(f, sp);
                                    sp2 = sp;
                                }
                            } else {
                                sp2.replace(map);
                            }
                            return sp2;
                        }
                    } catch (FileNotFoundException e14) {
                        e = e14;
                        e.printStackTrace();
                        synchronized (GLOBAL_COMMIT_LOCK) {
                            if (sp2 != null) {
                                sp2.replace(map);
                            } else {
                                sp2 = (MySharedPreferencesImpl) this.sSharedPrefs.get(f);
                                if (sp2 == null) {
                                    sp = new MySharedPreferencesImpl(f, mode, map);
                                    this.sSharedPrefs.put(f, sp);
                                    sp2 = sp;
                                }
                            }
                            return sp2;
                        }
                    } catch (IOException e15) {
                        e3 = e15;
                        e3.printStackTrace();
                        synchronized (GLOBAL_COMMIT_LOCK) {
                            if (sp2 != null) {
                                sp2 = (MySharedPreferencesImpl) this.sSharedPrefs.get(f);
                                if (sp2 == null) {
                                    sp = new MySharedPreferencesImpl(f, mode, map);
                                    this.sSharedPrefs.put(f, sp);
                                    sp2 = sp;
                                }
                            } else {
                                sp2.replace(map);
                            }
                            return sp2;
                        }
                    } catch (Exception e16) {
                        e4 = e16;
                        e4.printStackTrace();
                        synchronized (GLOBAL_COMMIT_LOCK) {
                            if (sp2 != null) {
                                sp2.replace(map);
                            } else {
                                sp2 = (MySharedPreferencesImpl) this.sSharedPrefs.get(f);
                                if (sp2 == null) {
                                    sp = new MySharedPreferencesImpl(f, mode, map);
                                    this.sSharedPrefs.put(f, sp);
                                    sp2 = sp;
                                }
                            }
                            return sp2;
                        }
                    }
                }
                synchronized (GLOBAL_COMMIT_LOCK) {
                    if (sp2 != null) {
                        sp2.replace(map);
                    } else {
                        sp2 = (MySharedPreferencesImpl) this.sSharedPrefs.get(f);
                        if (sp2 == null) {
                            sp = new MySharedPreferencesImpl(f, mode, map);
                            this.sSharedPrefs.put(f, sp);
                            sp2 = sp;
                        }
                    }
                    return sp2;
                }
            }
            return sp2;
        }
    }

    private static File makeBackupFile(File prefsFile) {
        return new File(prefsFile.getPath() + ".bak");
    }
}
