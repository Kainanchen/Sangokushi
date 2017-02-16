package com.tencent.android.tpush.service.cache;

import android.content.Context;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.android.tpush.common.Constants;
import com.tencent.android.tpush.encrypt.Rijndael;
import com.tencent.android.tpush.horse.data.OptStrategyList;
import com.tencent.android.tpush.horse.data.StrategyItem;
import com.tencent.android.tpush.service.ProGuard;
import com.tencent.android.tpush.service.channel.exception.NullReturnException;
import com.tencent.android.tpush.service.channel.protocol.AppInfo;
import com.tencent.android.tpush.service.channel.protocol.UnregInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: ProGuard */
public class CacheManager {
    private CacheManager() {
    }

    public static void addRegisterInfos(String str) {
        try {
            Context e = ProGuard.m5376e();
            String a = com.tencent.android.tpush.service.p077d.ProGuard.m5307a(e, m5112c("tpush_reginfos", ".reg"), true);
            if (com.tencent.android.tpush.service.p077d.ProGuard.m5317a(a)) {
                a = Rijndael.encrypt(str + ",");
            } else {
                String decrypt = Rijndael.decrypt(a);
                if (!decrypt.contains(str)) {
                    a = Rijndael.encrypt(decrypt + str + ",");
                }
            }
            com.tencent.android.tpush.service.p077d.ProGuard.m5315a(e, m5112c("tpush_reginfos", ".reg"), a, true);
        } catch (Throwable e2) {
            com.tencent.android.tpush.p067a.ProGuard.m4716c(Constants.ServiceLogTag, LetterIndexBar.SEARCH_ICON_LETTER, e2);
        }
    }

    public static void removeRegisterInfos(String str) {
        try {
            Context e = ProGuard.m5376e();
            String a = com.tencent.android.tpush.service.p077d.ProGuard.m5307a(e, m5112c("tpush_reginfos", ".reg"), true);
            if (!com.tencent.android.tpush.service.p077d.ProGuard.m5317a(a)) {
                String decrypt = Rijndael.decrypt(a);
                if (decrypt.contains(str + ",")) {
                    a = Rijndael.encrypt(decrypt.replaceAll(str + ",", LetterIndexBar.SEARCH_ICON_LETTER));
                }
            }
            com.tencent.android.tpush.service.p077d.ProGuard.m5315a(e, m5112c("tpush_reginfos", ".reg"), a, true);
        } catch (Throwable e2) {
            com.tencent.android.tpush.p067a.ProGuard.m4716c(Constants.ServiceLogTag, LetterIndexBar.SEARCH_ICON_LETTER, e2);
        }
    }

    public static List getRegisterInfos(Context context) {
        List arrayList;
        try {
            String decrypt = Rijndael.decrypt(com.tencent.android.tpush.service.p077d.ProGuard.m5307a(context, m5112c("tpush_reginfos", ".reg"), true));
            if (com.tencent.android.tpush.service.p077d.ProGuard.m5317a(decrypt)) {
                arrayList = new ArrayList();
            } else {
                arrayList = new ArrayList(Arrays.asList(decrypt.split(",")));
            }
        } catch (Throwable e) {
            com.tencent.android.tpush.p067a.ProGuard.m4716c(Constants.ServiceLogTag, LetterIndexBar.SEARCH_ICON_LETTER, e);
            arrayList = new ArrayList();
        }
        if (!arrayList.contains(context.getPackageName())) {
            arrayList.add(context.getPackageName());
        }
        return arrayList;
    }

    public static boolean addRegisterInfo(com.tencent.android.tpush.data.ProGuard proGuard) {
        return m5110a(proGuard, m5112c(proGuard.f7422d, ".reg"), 0);
    }

    public static List getRegisterInfo(Context context) {
        if (context == null) {
            return null;
        }
        List<String> registerInfos = getRegisterInfos(context);
        if (registerInfos == null || registerInfos.size() <= 0) {
            return null;
        }
        List arrayList = new ArrayList();
        for (String registerInfoByPkgName : registerInfos) {
            com.tencent.android.tpush.data.ProGuard registerInfoByPkgName2 = getRegisterInfoByPkgName(registerInfoByPkgName);
            if (registerInfoByPkgName2 != null && registerInfoByPkgName2.f7423e < 4) {
                arrayList.add(registerInfoByPkgName2);
            }
        }
        return arrayList;
    }

    public static List getUnregisterInfo(Context context) {
        if (context == null) {
            return null;
        }
        List<String> registerInfos = getRegisterInfos(context);
        if (registerInfos == null || registerInfos.size() <= 0) {
            return null;
        }
        List arrayList = new ArrayList();
        for (String registerInfoByPkgName : registerInfos) {
            com.tencent.android.tpush.data.ProGuard registerInfoByPkgName2 = getRegisterInfoByPkgName(registerInfoByPkgName);
            if (registerInfoByPkgName2 != null && registerInfoByPkgName2.f7423e > 0 && registerInfoByPkgName2.f7423e < 2) {
                arrayList.add(registerInfoByPkgName2);
            }
        }
        return arrayList;
    }

    public static List getUninstallInfo(Context context) {
        if (context == null) {
            return null;
        }
        List<String> registerInfos = getRegisterInfos(context);
        if (registerInfos == null || registerInfos.size() <= 0) {
            return null;
        }
        List arrayList = new ArrayList();
        for (String registerInfoByPkgName : registerInfos) {
            com.tencent.android.tpush.data.ProGuard registerInfoByPkgName2 = getRegisterInfoByPkgName(registerInfoByPkgName);
            if (registerInfoByPkgName2 != null && registerInfoByPkgName2.f7423e > 1 && registerInfoByPkgName2.f7423e < 3) {
                arrayList.add(registerInfoByPkgName2);
            }
        }
        return arrayList;
    }

    public static ArrayList getUninstallAndUnregisterInfo(Context context) {
        if (context == null) {
            return null;
        }
        List<String> registerInfos = getRegisterInfos(context);
        if (registerInfos == null || registerInfos.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String registerInfoByPkgName : registerInfos) {
            com.tencent.android.tpush.data.ProGuard registerInfoByPkgName2 = getRegisterInfoByPkgName(registerInfoByPkgName);
            if (registerInfoByPkgName2 != null && registerInfoByPkgName2.f7423e > 0 && registerInfoByPkgName2.f7423e < 3) {
                UnregInfo unregInfo = new UnregInfo();
                unregInfo.appInfo = new AppInfo(registerInfoByPkgName2.f7419a, registerInfoByPkgName2.f7420b, com.tencent.android.tpush.service.p077d.ProGuard.m5327c(registerInfoByPkgName2.f7422d), (byte) 0);
                unregInfo.isUninstall = (byte) registerInfoByPkgName2.f7423e;
                unregInfo.timestamp = registerInfoByPkgName2.f7424f;
                arrayList.add(unregInfo);
            }
        }
        return arrayList;
    }

    public static com.tencent.android.tpush.data.ProGuard getRegisterInfoByPkgName(String str) {
        return m5107a(str, m5112c(str, ".reg"));
    }

    public static boolean UnregisterInfoByPkgName(String str) {
        if (ProGuard.m5376e() == null || com.tencent.android.tpush.service.p077d.ProGuard.m5317a(str)) {
            com.tencent.android.tpush.p067a.ProGuard.m4723h(Constants.ServiceLogTag, ">>> unregister registerInfo : " + str + " failed!");
            return false;
        }
        m5109a(str, m5112c(str, ".reg"), 1);
        return true;
    }

    public static boolean UnregisterInfoSuccessByPkgName(String str) {
        if (ProGuard.m5376e() == null || com.tencent.android.tpush.service.p077d.ProGuard.m5317a(str)) {
            com.tencent.android.tpush.p067a.ProGuard.m4723h(Constants.ServiceLogTag, ">>> unregister registerInfo : " + str + " failed!");
            return false;
        }
        m5109a(str, m5112c(str, ".reg"), 3);
        return true;
    }

    public static boolean UninstallInfoByPkgName(String str) {
        if (ProGuard.m5376e() == null || com.tencent.android.tpush.service.p077d.ProGuard.m5317a(str)) {
            com.tencent.android.tpush.p067a.ProGuard.m4723h(Constants.ServiceLogTag, ">>> uninstall registerInfo : " + str + " failed!");
            return false;
        }
        m5109a(str, m5112c(str, ".reg"), 2);
        return true;
    }

    public static boolean UninstallInfoSuccessByPkgName(String str) {
        if (ProGuard.m5376e() == null || com.tencent.android.tpush.service.p077d.ProGuard.m5317a(str)) {
            com.tencent.android.tpush.p067a.ProGuard.m4723h(Constants.ServiceLogTag, ">>> uninstall registerInfo : " + str + " failed!");
            return false;
        }
        m5109a(str, m5112c(str, ".reg"), 4);
        return true;
    }

    public static void removeRegisterInfoByPkgName(String str) {
        m5108a(str);
    }

    private static boolean m5110a(com.tencent.android.tpush.data.ProGuard proGuard, String str, int i) {
        if (!(ProGuard.m5376e() == null || proGuard == null)) {
            String encrypt = Rijndael.encrypt(proGuard.f7419a + "|" + proGuard.f7420b + "|" + proGuard.f7421c + "|" + i + "|" + System.currentTimeMillis());
            if (!com.tencent.android.tpush.service.p077d.ProGuard.m5317a(encrypt)) {
                com.tencent.android.tpush.service.p077d.ProGuard.m5315a(ProGuard.m5376e(), str, encrypt, true);
                return true;
            }
        }
        com.tencent.android.tpush.p067a.ProGuard.m4723h(Constants.ServiceLogTag, ">> add registerInfo failed!");
        return false;
    }

    private static com.tencent.android.tpush.data.ProGuard m5107a(String str, String str2) {
        if (ProGuard.m5376e() == null || com.tencent.android.tpush.service.p077d.ProGuard.m5317a(str)) {
            return null;
        }
        return m5111b(com.tencent.android.tpush.service.p077d.ProGuard.m5307a(ProGuard.m5376e(), str2, true), str);
    }

    private static void m5109a(String str, String str2, int i) {
        com.tencent.android.tpush.data.ProGuard a = m5107a(str, m5112c(str, ".reg"));
        if (a != null) {
            m5110a(a, str2, i);
        }
    }

    private static void m5108a(String str) {
        if (ProGuard.m5376e() != null) {
            com.tencent.android.tpush.service.p077d.ProGuard.m5315a(ProGuard.m5376e(), m5112c(str, ".reg"), LetterIndexBar.SEARCH_ICON_LETTER, true);
        }
    }

    private static com.tencent.android.tpush.data.ProGuard m5111b(String str, String str2) {
        try {
            String decrypt = Rijndael.decrypt(str);
            if (com.tencent.android.tpush.service.p077d.ProGuard.m5317a(decrypt)) {
                return null;
            }
            String[] split = decrypt.split("\\|");
            if (split.length < 5) {
                return null;
            }
            com.tencent.android.tpush.data.ProGuard proGuard = new com.tencent.android.tpush.data.ProGuard();
            proGuard.f7419a = Long.parseLong(split[0]);
            proGuard.f7420b = split[1];
            proGuard.f7421c = split[2];
            proGuard.f7423e = Integer.parseInt(split[3]);
            proGuard.f7424f = Long.parseLong(split[4]);
            proGuard.f7422d = str2;
            return proGuard;
        } catch (Throwable e) {
            com.tencent.android.tpush.p067a.ProGuard.m4716c(Constants.ServiceLogTag, LetterIndexBar.SEARCH_ICON_LETTER, e);
            return null;
        }
    }

    public static void updateUnregUninList(Context context, ArrayList arrayList) {
        if (context != null && arrayList != null && arrayList.size() > 0) {
            List unregisterInfo = getUnregisterInfo(context);
            List<com.tencent.android.tpush.data.ProGuard> uninstallInfo = getUninstallInfo(context);
            if (unregisterInfo != null) {
                for (int i = 0; i < arrayList.size(); i++) {
                    com.tencent.android.tpush.data.ProGuard proGuard;
                    UnregInfo unregInfo = (UnregInfo) arrayList.get(i);
                    if (unregInfo.isUninstall == 1) {
                        for (int i2 = 0; i2 < unregisterInfo.size(); i2++) {
                            proGuard = (com.tencent.android.tpush.data.ProGuard) unregisterInfo.get(i2);
                            if (proGuard.f7419a == unregInfo.appInfo.accessId) {
                                m5109a(proGuard.f7422d, m5112c(proGuard.f7422d, ".reg"), 3);
                            }
                        }
                    }
                    if (unregInfo.isUninstall == 2) {
                        for (com.tencent.android.tpush.data.ProGuard proGuard2 : uninstallInfo) {
                            if (proGuard2.f7419a == unregInfo.appInfo.accessId) {
                                m5109a(proGuard2.f7422d, m5112c(proGuard2.f7422d, ".reg"), 4);
                            }
                        }
                    }
                }
            }
        }
    }

    public static String getToken(Context context) {
        return com.tencent.android.tpush.stat.p079b.ProGuard.m5543a(context);
    }

    public static boolean setToken(Context context, String str) {
        if (context == null || com.tencent.android.tpush.service.p077d.ProGuard.m5317a(str) || str.equals(getToken(context))) {
            return false;
        }
        com.tencent.android.tpush.stat.p079b.ProGuard.m5544a(context, str);
        return true;
    }

    public static String getQua(Context context, long j) {
        String str = LetterIndexBar.SEARCH_ICON_LETTER;
        if (context != null) {
            return Rijndael.decrypt(com.tencent.android.tpush.service.p077d.ProGuard.m5307a(context, ".com.tencent.tpush.cache.qua." + j, true));
        }
        return str;
    }

    public static boolean setQua(Context context, long j, String str) {
        if (context == null || com.tencent.android.tpush.service.p077d.ProGuard.m5317a(str) || j <= 0) {
            return false;
        }
        return com.tencent.android.tpush.service.p077d.ProGuard.m5315a(context, ".com.tencent.tpush.cache.qua." + j, Rijndael.encrypt(str), true);
    }

    public static synchronized boolean addOptStrategyList(Context context, String str, OptStrategyList optStrategyList) {
        boolean z = false;
        synchronized (CacheManager.class) {
            if (!(context == null || str == null)) {
                addOptKey(context, str);
                String str2 = str + ".com.tencent.tpush.cache.redirect";
                try {
                    optStrategyList.m4882a(System.currentTimeMillis());
                    z = com.tencent.android.tpush.service.p077d.ProGuard.m5315a(context, str2, Rijndael.encrypt(com.tencent.android.tpush.common.ProGuard.m4805a((Serializable) optStrategyList)), true);
                } catch (Throwable e) {
                    com.tencent.android.tpush.p067a.ProGuard.m4716c(Constants.ServiceLogTag, LetterIndexBar.SEARCH_ICON_LETTER, e);
                }
            }
        }
        return z;
    }

    public static synchronized void removeOptStrategyList(Context context, String str) {
        synchronized (CacheManager.class) {
            addOptStrategyList(context, str, new OptStrategyList());
        }
    }

    public static OptStrategyList getOptStrategyList(Context context, String str) {
        boolean z = true;
        if (context == null || str == null) {
            try {
                StringBuffer stringBuffer = new StringBuffer("getStrategy return null,contex is null(");
                if (context != null) {
                    z = false;
                }
                throw new NullReturnException(stringBuffer.append(z).append(") and key=").append(str).toString());
            } catch (Exception e) {
                throw new NullReturnException("getOptStrategyList return null,deserialize err", e);
            }
        }
        Object a = com.tencent.android.tpush.common.ProGuard.m4804a(Rijndael.decrypt(com.tencent.android.tpush.service.p077d.ProGuard.m5307a(context, str + ".com.tencent.tpush.cache.redirect", true)));
        if (a instanceof OptStrategyList) {
            return (OptStrategyList) a;
        }
        throw new NullReturnException("getStrategy return null, because serializer object is not instanceof OptStrategyList");
    }

    public static synchronized boolean addOptStrategy(StrategyItem strategyItem) {
        boolean addOptStrategyList;
        synchronized (CacheManager.class) {
            OptStrategyList optStrategyList;
            String h = com.tencent.android.tpush.service.p077d.ProGuard.m5341h(ProGuard.m5376e());
            try {
                optStrategyList = getOptStrategyList(ProGuard.m5376e(), h);
            } catch (Throwable e) {
                com.tencent.android.tpush.p067a.ProGuard.m4716c(Constants.ServiceLogTag, ">> Can not get OptStrategyList from local", e);
                optStrategyList = new OptStrategyList();
            }
            if (strategyItem.m4902d() == 1) {
                if (strategyItem.m4904f() == 0) {
                    optStrategyList.m4889d(strategyItem);
                } else {
                    optStrategyList.m4887c(strategyItem);
                }
            } else if (strategyItem.m4904f() == 0) {
                optStrategyList.m4885b(strategyItem);
            } else {
                optStrategyList.m4883a(strategyItem);
            }
            addOptStrategyList = addOptStrategyList(ProGuard.m5376e(), h, optStrategyList);
        }
        return addOptStrategyList;
    }

    public static boolean addServerItems(Context context, String str, ArrayList arrayList) {
        boolean z = false;
        if (!(context == null || str == null)) {
            saveDomainKey(context, str);
            try {
                z = com.tencent.android.tpush.service.p077d.ProGuard.m5315a(context, str + ".com.tencent.tpush.cache.server", Rijndael.encrypt(com.tencent.android.tpush.common.ProGuard.m4805a((Serializable) arrayList)), true);
            } catch (Throwable e) {
                com.tencent.android.tpush.p067a.ProGuard.m4716c(Constants.ServiceLogTag, LetterIndexBar.SEARCH_ICON_LETTER, e);
            }
        }
        return z;
    }

    public static ArrayList getServerItems(Context context, String str) {
        if (str == null) {
            throw new NullReturnException("getServerItems return null,because key is null");
        }
        try {
            Object a = com.tencent.android.tpush.common.ProGuard.m4804a(Rijndael.decrypt(com.tencent.android.tpush.service.p077d.ProGuard.m5307a(context, str + ".com.tencent.tpush.cache.server", true)));
            if (a instanceof ArrayList) {
                return (ArrayList) a;
            }
            throw new NullReturnException("getServerItems return null,because object not instance of Arraylist<?>");
        } catch (Exception e) {
            throw new NullReturnException("getServerItem return null,deseriallize err", e);
        }
    }

    public static void addOptKeyList(Context context, HashSet hashSet) {
        if (context != null) {
            try {
                com.tencent.android.tpush.service.p077d.ProGuard.m5315a(context, ".com.tencent.tpush.cache.keylist", Rijndael.encrypt(com.tencent.android.tpush.common.ProGuard.m4805a((Serializable) hashSet)), true);
            } catch (Throwable e) {
                com.tencent.android.tpush.p067a.ProGuard.m4716c(Constants.ServiceLogTag, LetterIndexBar.SEARCH_ICON_LETTER, e);
            }
        }
    }

    public static void addOptKey(Context context, String str) {
        HashSet optKeyList;
        try {
            optKeyList = getOptKeyList(context);
        } catch (Exception e) {
            optKeyList = new HashSet();
        }
        optKeyList.add(str);
        addOptKeyList(context, optKeyList);
    }

    public static HashSet getOptKeyList(Context context) {
        if (context == null) {
            throw new NullReturnException("getOptKeyList return null,because ctx is null");
        }
        try {
            Object a = com.tencent.android.tpush.common.ProGuard.m4804a(Rijndael.decrypt(com.tencent.android.tpush.service.p077d.ProGuard.m5307a(context, ".com.tencent.tpush.cache.keylist", true)));
            if (a instanceof HashSet) {
                return (HashSet) a;
            }
            throw new NullReturnException("getOptKeyList return null,because object not instance of ArrayList<?>");
        } catch (Exception e) {
            throw new NullReturnException("getOptKeyList return null\uff0cdeseriallize err", e);
        }
    }

    public static void clearOptKeyList(Context context) {
        if (context != null) {
            com.tencent.android.tpush.service.p077d.ProGuard.m5315a(context, ".com.tencent.tpush.cache.keylist", LetterIndexBar.SEARCH_ICON_LETTER, true);
        }
    }

    public static boolean saveLoadIpTime(Context context, long j) {
        if (context == null || j <= 0) {
            return false;
        }
        return com.tencent.android.tpush.service.p077d.ProGuard.m5324b(context, ".com.tencent.tpush.cache.load.ip.last.time", j);
    }

    public static long getLastLoadIpTime(Context context) {
        if (context != null) {
            return com.tencent.android.tpush.service.p077d.ProGuard.m5326c(context, ".com.tencent.tpush.cache.load.ip.last.time", 0);
        }
        return 0;
    }

    public static void saveSpeedTestList(Context context, ArrayList arrayList) {
        if (context != null) {
            try {
                com.tencent.android.tpush.service.p077d.ProGuard.m5315a(context, ".com.tencent.tpush.cache.speed.test", Rijndael.encrypt(com.tencent.android.tpush.common.ProGuard.m4805a((Serializable) arrayList)), true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static ArrayList getSpeedTestList(Context context) {
        if (context == null) {
            throw new NullReturnException("getSpeedTestList return null ,because ctx is null");
        }
        try {
            Object a = com.tencent.android.tpush.common.ProGuard.m4804a(Rijndael.decrypt(com.tencent.android.tpush.service.p077d.ProGuard.m5307a(context, ".com.tencent.tpush.cache.speed.test", true)));
            if (a instanceof ArrayList) {
                return (ArrayList) a;
            }
            throw new NullReturnException("getSpeedTestList return null ,because instanceof err");
        } catch (Exception e) {
            throw new NullReturnException("getSpeedTestList return null ,because deserialize err", e);
        }
    }

    public static boolean setTestSpeedTime(Context context, long j) {
        if (context == null || j <= 0) {
            return false;
        }
        return com.tencent.android.tpush.service.p077d.ProGuard.m5324b(context, "Channel.SpeedDetector.LastActivationTimestamp", j);
    }

    public static long getTestSpeedTime(Context context) {
        if (context != null) {
            return com.tencent.android.tpush.service.p077d.ProGuard.m5326c(context, "Channel.SpeedDetector.LastActivationTimestamp", 0);
        }
        return 0;
    }

    public static void saveDomain(Context context, String str) {
        if (context != null) {
            com.tencent.android.tpush.service.p077d.ProGuard.m5315a(context, ".com.tencent.tpush.cache.domain", str, true);
        }
    }

    public static String getDomain(Context context) {
        if (context != null) {
            return com.tencent.android.tpush.service.p077d.ProGuard.m5307a(context, ".com.tencent.tpush.cache.domain", true);
        }
        return LetterIndexBar.SEARCH_ICON_LETTER;
    }

    public static void saveDomainKeyList(Context context, ArrayList arrayList) {
        if (context != null) {
            try {
                String str = LetterIndexBar.SEARCH_ICON_LETTER;
                if (arrayList != null) {
                    str = com.tencent.android.tpush.common.ProGuard.m4805a((Serializable) arrayList);
                }
                com.tencent.android.tpush.service.p077d.ProGuard.m5315a(context, ".com.tencent.tpush.cache.domain.key", Rijndael.encrypt(str), true);
            } catch (Throwable e) {
                com.tencent.android.tpush.p067a.ProGuard.m4716c(Constants.ServiceLogTag, LetterIndexBar.SEARCH_ICON_LETTER, e);
            }
        }
    }

    public static void saveDomainKey(Context context, String str) {
        if (context != null) {
            ArrayList domainKeyList;
            try {
                domainKeyList = getDomainKeyList(context);
            } catch (Exception e) {
                domainKeyList = new ArrayList();
            }
            domainKeyList.add(str);
            saveDomainKeyList(context, domainKeyList);
        }
    }

    public static ArrayList getDomainKeyList(Context context) {
        if (context == null) {
            throw new NullReturnException("getDomainKeyList return null,because ctx is null");
        }
        try {
            Object a = com.tencent.android.tpush.common.ProGuard.m4804a(Rijndael.decrypt(com.tencent.android.tpush.service.p077d.ProGuard.m5307a(context, ".com.tencent.tpush.cache.domain.key", true)));
            if (a instanceof ArrayList) {
                return (ArrayList) a;
            }
            throw new NullReturnException("getDomainKeyList return null,because object not instance of ArrayList<?>");
        } catch (Exception e) {
            throw new NullReturnException("getDomainKeyList return null\uff0cdeseriallize err", e);
        }
    }

    public static void clearDomainServerItem(Context context) {
        ArrayList domainKeyList;
        try {
            domainKeyList = getDomainKeyList(context);
        } catch (NullReturnException e) {
            domainKeyList = new ArrayList();
        }
        domainKeyList.add("3");
        domainKeyList.add("1");
        domainKeyList.add("2");
        Iterator it = domainKeyList.iterator();
        while (it.hasNext()) {
            try {
                com.tencent.android.tpush.service.p077d.ProGuard.m5315a(context, ((String) it.next()) + ".com.tencent.tpush.cache.server", LetterIndexBar.SEARCH_ICON_LETTER, true);
            } catch (Throwable e2) {
                com.tencent.android.tpush.p067a.ProGuard.m4716c(Constants.ServiceLogTag, LetterIndexBar.SEARCH_ICON_LETTER, e2);
            }
        }
    }

    private static String m5112c(String str, String str2) {
        return str + ".com.tencent.tpush.cache" + str2;
    }
}
