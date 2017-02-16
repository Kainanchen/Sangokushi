package org.apache.mina.filter.ssl;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.KeyStore;

public class KeyStoreFactory {
    private byte[] data;
    private char[] password;
    private String provider;
    private String type;

    public KeyStoreFactory() {
        this.type = "JKS";
        this.provider = null;
        this.password = null;
        this.data = null;
    }

    public KeyStore newInstance() {
        if (this.data == null) {
            throw new IllegalStateException("data property is not set.");
        }
        KeyStore instance;
        if (this.provider == null) {
            instance = KeyStore.getInstance(this.type);
        } else {
            instance = KeyStore.getInstance(this.type, this.provider);
        }
        InputStream byteArrayInputStream = new ByteArrayInputStream(this.data);
        try {
            instance.load(byteArrayInputStream, this.password);
            return instance;
        } finally {
            try {
                byteArrayInputStream.close();
            } catch (IOException e) {
            }
        }
    }

    public void setType(String str) {
        if (str == null) {
            throw new IllegalArgumentException("type");
        }
        this.type = str;
    }

    public void setPassword(String str) {
        if (str != null) {
            this.password = str.toCharArray();
        } else {
            this.password = null;
        }
    }

    public void setProvider(String str) {
        this.provider = str;
    }

    public void setData(byte[] bArr) {
        Object obj = new byte[bArr.length];
        System.arraycopy(bArr, 0, obj, 0, bArr.length);
        this.data = obj;
    }

    private void setData(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                int read = inputStream.read();
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(read);
            } finally {
                try {
                    inputStream.close();
                } catch (IOException e) {
                }
            }
        }
        setData(byteArrayOutputStream.toByteArray());
    }

    public void setDataFile(File file) {
        setData(new BufferedInputStream(new FileInputStream(file)));
    }

    public void setDataUrl(URL url) {
        setData(url.openStream());
    }
}
