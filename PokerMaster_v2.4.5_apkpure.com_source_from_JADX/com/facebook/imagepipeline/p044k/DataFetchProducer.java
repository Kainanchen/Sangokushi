package com.facebook.imagepipeline.p044k;

import android.net.Uri;
import android.util.Base64;
import com.facebook.common.p011d.Preconditions;
import com.facebook.common.p013b.CallerThreadExecutor;
import com.facebook.imagepipeline.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.p047h.EncodedImage;
import com.facebook.imagepipeline.p050l.ImageRequest;
import java.io.ByteArrayInputStream;

/* renamed from: com.facebook.imagepipeline.k.k */
public final class DataFetchProducer extends LocalFetchProducer {
    public DataFetchProducer(PooledByteBufferFactory pooledByteBufferFactory, boolean z) {
        super(CallerThreadExecutor.m1005a(), pooledByteBufferFactory, z);
    }

    protected final EncodedImage m2248a(ImageRequest imageRequest) {
        boolean equals;
        byte[] decode;
        String uri = imageRequest.f2401b.toString();
        Preconditions.m1033a(uri.substring(0, 5).equals("data:"));
        int indexOf = uri.indexOf(44);
        String substring = uri.substring(indexOf + 1, uri.length());
        uri = uri.substring(0, indexOf);
        if (uri.contains(";")) {
            String[] split = uri.split(";");
            equals = split[split.length - 1].equals("base64");
        } else {
            equals = false;
        }
        if (equals) {
            decode = Base64.decode(substring, 0);
        } else {
            decode = Uri.decode(substring).getBytes();
        }
        return m2244a(new ByteArrayInputStream(decode), decode.length);
    }

    protected final String m2249a() {
        return "DataFetchProducer";
    }
}
