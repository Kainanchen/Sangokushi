package com.facebook.p036h;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.util.Log;
import com.facebook.FacebookContentProvider;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.sina.weibo.sdk.component.GameManager;
import com.tencent.android.tpush.common.MessageKey;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

/* renamed from: com.facebook.h.y */
public final class NativeAppCallAttachmentStore {
    private static final String f1770a;
    private static File f1771b;

    /* renamed from: com.facebook.h.y.a */
    public static final class NativeAppCallAttachmentStore {
        final UUID f1763a;
        public final String f1764b;
        final String f1765c;
        Bitmap f1766d;
        Uri f1767e;
        boolean f1768f;
        boolean f1769g;

        private NativeAppCallAttachmentStore(UUID uuid, Bitmap bitmap, Uri uri) {
            boolean z = true;
            this.f1763a = uuid;
            this.f1766d = bitmap;
            this.f1767e = uri;
            if (uri != null) {
                String scheme = uri.getScheme();
                if (MessageKey.MSG_CONTENT.equalsIgnoreCase(scheme)) {
                    this.f1768f = true;
                    if (uri.getAuthority() == null || uri.getAuthority().startsWith("media")) {
                        z = false;
                    }
                    this.f1769g = z;
                } else if ("file".equalsIgnoreCase(uri.getScheme())) {
                    this.f1769g = true;
                } else if (!af.m1530b(uri)) {
                    throw new FacebookException("Unsupported scheme for media Uri : " + scheme);
                }
            } else if (bitmap != null) {
                this.f1769g = true;
            } else {
                throw new FacebookException("Cannot share media without a bitmap or Uri set");
            }
            this.f1765c = !this.f1769g ? null : UUID.randomUUID().toString();
            this.f1764b = !this.f1769g ? this.f1767e.toString() : FacebookContentProvider.m808a(FacebookSdk.m2590j(), uuid, this.f1765c);
        }
    }

    static {
        f1770a = NativeAppCallAttachmentStore.class.getName();
    }

    private NativeAppCallAttachmentStore() {
    }

    public static NativeAppCallAttachmentStore m1691a(UUID uuid, Bitmap bitmap) {
        ag.m1544a((Object) uuid, "callId");
        ag.m1544a((Object) bitmap, "attachmentBitmap");
        return new NativeAppCallAttachmentStore(bitmap, null, (byte) 0);
    }

    public static NativeAppCallAttachmentStore m1692a(UUID uuid, Uri uri) {
        ag.m1544a((Object) uuid, "callId");
        ag.m1544a((Object) uri, "attachmentUri");
        return new NativeAppCallAttachmentStore(null, uri, (byte) 0);
    }

    public static void m1697a(Collection<NativeAppCallAttachmentStore> collection) {
        if (collection != null && collection.size() != 0) {
            if (f1771b == null) {
                af.m1514a(NativeAppCallAttachmentStore.m1693a());
            }
            NativeAppCallAttachmentStore.m1693a().mkdirs();
            List<File> arrayList = new ArrayList();
            for (NativeAppCallAttachmentStore nativeAppCallAttachmentStore : collection) {
                if (nativeAppCallAttachmentStore.f1769g) {
                    File a = NativeAppCallAttachmentStore.m1695a(nativeAppCallAttachmentStore.f1763a, nativeAppCallAttachmentStore.f1765c, true);
                    arrayList.add(a);
                    Closeable fileOutputStream;
                    if (nativeAppCallAttachmentStore.f1766d != null) {
                        Bitmap bitmap = nativeAppCallAttachmentStore.f1766d;
                        Closeable fileOutputStream2 = new FileOutputStream(a);
                        try {
                            bitmap.compress(CompressFormat.JPEG, 100, fileOutputStream2);
                            af.m1513a(fileOutputStream2);
                        } catch (Throwable e) {
                            Throwable th = e;
                            Log.e(f1770a, "Got unexpected exception:" + th);
                            for (File delete : arrayList) {
                                try {
                                    delete.delete();
                                } catch (Exception e2) {
                                }
                            }
                            throw new FacebookException(th);
                        } catch (Throwable th2) {
                            af.m1513a(fileOutputStream2);
                        }
                    } else if (nativeAppCallAttachmentStore.f1767e != null) {
                        InputStream openInputStream;
                        Uri uri = nativeAppCallAttachmentStore.f1767e;
                        boolean z = nativeAppCallAttachmentStore.f1768f;
                        fileOutputStream = new FileOutputStream(a);
                        if (z) {
                            openInputStream = FacebookSdk.m2586f().getContentResolver().openInputStream(uri);
                        } else {
                            openInputStream = new FileInputStream(uri.getPath());
                        }
                        af.m1490a(openInputStream, (OutputStream) fileOutputStream);
                        af.m1513a(fileOutputStream);
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    public static void m1698a(UUID uuid) {
        File a = NativeAppCallAttachmentStore.m1696a(uuid, false);
        if (a != null) {
            af.m1514a(a);
        }
    }

    public static File m1694a(UUID uuid, String str) {
        if (af.m1523a(str) || uuid == null) {
            throw new FileNotFoundException();
        }
        try {
            return NativeAppCallAttachmentStore.m1695a(uuid, str, false);
        } catch (IOException e) {
            throw new FileNotFoundException();
        }
    }

    private static synchronized File m1693a() {
        File file;
        synchronized (NativeAppCallAttachmentStore.class) {
            if (f1771b == null) {
                f1771b = new File(FacebookSdk.m2586f().getCacheDir(), "com.facebook.NativeAppCallAttachmentStore.files");
            }
            file = f1771b;
        }
        return file;
    }

    private static File m1696a(UUID uuid, boolean z) {
        if (f1771b == null) {
            return null;
        }
        File file = new File(f1771b, uuid.toString());
        if (!z || file.exists()) {
            return file;
        }
        file.mkdirs();
        return file;
    }

    private static File m1695a(UUID uuid, String str, boolean z) {
        File a = NativeAppCallAttachmentStore.m1696a(uuid, z);
        if (a == null) {
            return null;
        }
        try {
            return new File(a, URLEncoder.encode(str, GameManager.DEFAULT_CHARSET));
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }
}
