package com.igexin.getuiext.ui.promotion;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import com.igexin.getuiext.util.C0329c;
import com.tencent.connect.common.Constants;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.MethodNotSupportedException;

/* renamed from: com.igexin.getuiext.ui.promotion.o */
class C0325o extends AsyncTask {
    final /* synthetic */ UrlImageView f889a;

    private C0325o(UrlImageView urlImageView) {
        this.f889a = urlImageView;
    }

    protected Bitmap m1087a(String... strArr) {
        InputStream a;
        Throwable th;
        Bitmap bitmap = null;
        try {
            a = C0329c.m1093a(Constants.HTTP_GET, strArr[0], null);
            try {
                bitmap = BitmapFactory.decodeStream(a);
                if (a != null) {
                    try {
                        a.close();
                    } catch (IOException e) {
                    }
                }
            } catch (MethodNotSupportedException e2) {
                if (a != null) {
                    try {
                        a.close();
                    } catch (IOException e3) {
                    }
                }
                return bitmap;
            } catch (Exception e4) {
                if (a != null) {
                    try {
                        a.close();
                    } catch (IOException e5) {
                    }
                }
                return bitmap;
            } catch (Throwable th2) {
                th = th2;
                if (a != null) {
                    try {
                        a.close();
                    } catch (IOException e6) {
                    }
                }
                throw th;
            }
        } catch (MethodNotSupportedException e7) {
            a = bitmap;
            if (a != null) {
                a.close();
            }
            return bitmap;
        } catch (Exception e8) {
            a = bitmap;
            if (a != null) {
                a.close();
            }
            return bitmap;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            a = bitmap;
            th = th4;
            if (a != null) {
                a.close();
            }
            throw th;
        }
        return bitmap;
    }

    protected void m1088a(Bitmap bitmap) {
        if (bitmap != null) {
            this.f889a.post(new C0326p(this, bitmap));
        }
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m1087a((String[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m1088a((Bitmap) obj);
    }
}
