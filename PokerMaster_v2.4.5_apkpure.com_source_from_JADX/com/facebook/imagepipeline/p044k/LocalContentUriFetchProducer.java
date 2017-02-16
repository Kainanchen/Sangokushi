package com.facebook.imagepipeline.p044k;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import com.facebook.common.p021l.UriUtil;
import com.facebook.imagepipeline.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.p047h.EncodedImage;
import com.facebook.imagepipeline.p050l.ImageRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* renamed from: com.facebook.imagepipeline.k.u */
public final class LocalContentUriFetchProducer extends LocalFetchProducer {
    private static final String[] f2369a;
    private final ContentResolver f2370b;

    static {
        f2369a = new String[]{"_id", "_data"};
    }

    public LocalContentUriFetchProducer(Executor executor, PooledByteBufferFactory pooledByteBufferFactory, ContentResolver contentResolver, boolean z) {
        super(executor, pooledByteBufferFactory, z);
        this.f2370b = contentResolver;
    }

    protected final EncodedImage m2300a(ImageRequest imageRequest) {
        Uri uri = imageRequest.f2401b;
        if (UriUtil.m1125d(uri)) {
            InputStream openInputStream;
            if (uri.toString().endsWith("/photo")) {
                openInputStream = this.f2370b.openInputStream(uri);
            } else {
                openInputStream = Contacts.openContactPhotoInputStream(this.f2370b, uri);
                if (openInputStream == null) {
                    throw new IOException("Contact photo does not exist: " + uri);
                }
            }
            return m2247b(openInputStream, -1);
        }
        if (UriUtil.m1126e(uri)) {
            EncodedImage a = m2299a(uri);
            if (a != null) {
                return a;
            }
        }
        return m2247b(this.f2370b.openInputStream(uri), -1);
    }

    @Nullable
    private EncodedImage m2299a(Uri uri) {
        EncodedImage encodedImage = null;
        Cursor query = this.f2370b.query(uri, f2369a, null, null, null);
        if (query != null) {
            try {
                if (query.getCount() != 0) {
                    query.moveToFirst();
                    String string = query.getString(query.getColumnIndex("_data"));
                    if (string != null) {
                        int i;
                        InputStream fileInputStream = new FileInputStream(string);
                        if (string == null) {
                            i = -1;
                        } else {
                            encodedImage = new File(string);
                            i = (int) encodedImage.length();
                        }
                        encodedImage = m2247b(fileInputStream, i);
                        query.close();
                    } else {
                        query.close();
                    }
                }
            } finally {
                query.close();
            }
        }
        return encodedImage;
    }

    protected final String m2301a() {
        return "LocalContentUriFetchProducer";
    }
}
