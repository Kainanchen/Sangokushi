package com.alipay.apmobilesecuritysdk.p010g;

import android.content.Context;
import android.os.Environment;
import com.alipay.p011b.p012a.p013a.p014a.C0110a;
import com.alipay.p011b.p012a.p013a.p014a.p015a.C0109c;
import com.alipay.p011b.p012a.p013a.p020d.C0125a;
import com.alipay.p011b.p012a.p013a.p020d.C0126b;
import com.alipay.p011b.p012a.p013a.p020d.C0127c;
import com.tencent.connect.common.Constants;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.alipay.apmobilesecuritysdk.g.a */
public final class C0104a {
    public static String m216a(Context context, String str, String str2) {
        String str3 = null;
        if (!(context == null || C0110a.m234a(str) || C0110a.m234a(str2))) {
            try {
                String a = C0127c.m343a(context, str, str2, Constants.STR_EMPTY);
                if (!C0110a.m234a(a)) {
                    str3 = C0109c.m229b(C0109c.m226a(), a);
                }
            } catch (Exception e) {
            }
        }
        return str3;
    }

    public static String m217a(String str, String str2) {
        String str3 = null;
        if (!(C0110a.m234a(str) || C0110a.m234a(str2))) {
            try {
                String a = C0125a.m340a(str);
                if (!C0110a.m234a(a)) {
                    a = new JSONObject(a).getString(str2);
                    if (!C0110a.m234a(a)) {
                        str3 = C0109c.m229b(C0109c.m226a(), a);
                    }
                }
            } catch (Exception e) {
            }
        }
        return str3;
    }

    public static void m218a(Context context, String str, String str2, String str3) {
        if (!C0110a.m234a(str) && !C0110a.m234a(str2) && context != null) {
            try {
                String a = C0109c.m227a(C0109c.m226a(), str3);
                Map hashMap = new HashMap();
                hashMap.put(str2, a);
                C0127c.m344a(context, str, hashMap);
            } catch (Exception e) {
            }
        }
    }

    public static void m219a(String str, String str2, String str3) {
        Throwable th;
        if (!C0110a.m234a(str) && !C0110a.m234a(str2)) {
            try {
                String a = C0109c.m227a(C0109c.m226a(), str3);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(str2, a);
                String jSONObject2 = jSONObject.toString();
                try {
                    if (!C0110a.m234a(jSONObject2)) {
                        System.setProperty(str, jSONObject2);
                    }
                } catch (Throwable th2) {
                }
                if (C0126b.m342a()) {
                    a = ".SystemConfig" + File.separator + str;
                    try {
                        if (C0126b.m342a()) {
                            File file = new File(Environment.getExternalStorageDirectory(), a);
                            if (!file.exists()) {
                                file.getParentFile().mkdirs();
                            }
                            File file2 = new File(file.getAbsolutePath());
                            FileWriter fileWriter = null;
                            FileWriter fileWriter2;
                            try {
                                fileWriter2 = new FileWriter(file2, false);
                                try {
                                    fileWriter2.write(jSONObject2);
                                    try {
                                        fileWriter2.close();
                                    } catch (IOException e) {
                                    }
                                } catch (Exception e2) {
                                    if (fileWriter2 != null) {
                                        try {
                                            fileWriter2.close();
                                        } catch (IOException e3) {
                                        }
                                    }
                                } catch (Throwable th3) {
                                    Throwable th4 = th3;
                                    fileWriter = fileWriter2;
                                    th = th4;
                                    if (fileWriter != null) {
                                        try {
                                            fileWriter.close();
                                        } catch (IOException e4) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Exception e5) {
                                fileWriter2 = null;
                                if (fileWriter2 != null) {
                                    fileWriter2.close();
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                if (fileWriter != null) {
                                    fileWriter.close();
                                }
                                throw th;
                            }
                        }
                    } catch (Exception e6) {
                    }
                }
            } catch (Exception e7) {
            }
        }
    }
}
