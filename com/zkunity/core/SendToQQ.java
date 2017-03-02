package com.zkunity.core;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.tencent.connect.common.Constants;
import com.tencent.connect.share.QzoneShare;
import com.tencent.open.SocialConstants;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.Tencent;
import com.tencent.tauth.UiError;
import com.zkunity.app.AppManager;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

public class SendToQQ {
    private static Object mMainHandlerLock;
    private static Handler mManinHandler;
    private static Tencent mTen;
    private static IUiListener qqShareListener;

    /* renamed from: com.zkunity.core.SendToQQ.1 */
    class C07311 implements IUiListener {
        C07311() {
        }

        public void onCancel() {
            Log.e("1111111111111111111111111", "onCancel()");
        }

        public void onComplete(Object response) {
            Log.e("1111111111111111111111111", "onComplete():" + response.toString());
        }

        public void onError(UiError e) {
            Log.e("1111111111111111111111111", "onComplete():" + e.errorMessage);
        }
    }

    /* renamed from: com.zkunity.core.SendToQQ.2 */
    class C07322 implements Runnable {
        private final /* synthetic */ Bundle val$params;

        C07322(Bundle bundle) {
            this.val$params = bundle;
        }

        public void run() {
            SendToQQ.mTen.shareToQQ(AppManager.getManager().getAppActivity(), this.val$params, SendToQQ.qqShareListener);
        }
    }

    /* renamed from: com.zkunity.core.SendToQQ.3 */
    class C07333 implements Runnable {
        private final /* synthetic */ Bundle val$params;

        C07333(Bundle bundle) {
            this.val$params = bundle;
        }

        public void run() {
            SendToQQ.mTen.shareToQQ(AppManager.getManager().getAppActivity(), this.val$params, SendToQQ.qqShareListener);
        }
    }

    /* renamed from: com.zkunity.core.SendToQQ.4 */
    class C07344 implements Runnable {
        private final /* synthetic */ Bundle val$params;

        C07344(Bundle bundle) {
            this.val$params = bundle;
        }

        public void run() {
            SendToQQ.mTen.shareToQzone(AppManager.getManager().getAppActivity(), this.val$params, SendToQQ.qqShareListener);
        }
    }

    static {
        mMainHandlerLock = new Object();
        qqShareListener = new C07311();
    }

    public static boolean checkQQ() {
        if (mTen == null) {
            mTen = Tencent.createInstance("1105308232", AppManager.getManager().getAppActivity());
        }
        return true;
    }

    public static void sendBitmapAndWordsToFriends(String title, String summary, String targetUrl, Bitmap bmp) {
        if (checkQQ()) {
            try {
                File bitmapFile = new File(new StringBuilder(String.valueOf(Environment.getExternalStorageDirectory().getPath())).append("/account/pic.jpg").toString());
                Bitmap newBitmap = Bitmap.createBitmap(bmp.getWidth(), bmp.getHeight(), Config.ARGB_8888);
                Canvas canvas = new Canvas(newBitmap);
                canvas.drawColor(-1);
                canvas.drawBitmap(bmp, 0.0f, 0.0f, null);
                OutputStream stream = new FileOutputStream(bitmapFile);
                newBitmap.compress(CompressFormat.JPEG, 80, stream);
                stream.close();
                Bundle params = new Bundle();
                params.putInt(QzoneShare.SHARE_TO_QZONE_KEY_TYPE, 1);
                params.putString(SocialConstants.PARAM_TITLE, title);
                params.putString(SocialConstants.PARAM_SUMMARY, summary);
                params.putString(SocialConstants.PARAM_TARGET_URL, targetUrl);
                params.putString(SocialConstants.PARAM_IMAGE_URL, bitmapFile.getAbsolutePath());
                getMainHandler().post(new C07322(params));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void sendPictureToFriends(Bitmap bmp) {
        if (checkQQ()) {
            try {
                File bitmapFile = new File(new StringBuilder(String.valueOf(Environment.getExternalStorageDirectory().getPath())).append("/account/pic.jpg").toString());
                Bitmap newBitmap = Bitmap.createBitmap(bmp.getWidth(), bmp.getHeight(), Config.ARGB_8888);
                Canvas canvas = new Canvas(newBitmap);
                canvas.drawColor(-1);
                canvas.drawBitmap(bmp, 0.0f, 0.0f, null);
                OutputStream stream = new FileOutputStream(bitmapFile);
                newBitmap.compress(CompressFormat.JPEG, 80, stream);
                stream.close();
                Bundle params = new Bundle();
                params.putString(QzoneShare.SHARE_TO_QQ_IMAGE_LOCAL_URL, bitmapFile.getAbsolutePath());
                params.putInt(QzoneShare.SHARE_TO_QZONE_KEY_TYPE, 5);
                getMainHandler().post(new C07333(params));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void sendBitmapAndWordsToQzone(String title, String summary, String targetUrl, Bitmap bmp) {
        if (checkQQ()) {
            Bundle params = new Bundle();
            params.putInt(QzoneShare.SHARE_TO_QZONE_KEY_TYPE, 1);
            params.putString(SocialConstants.PARAM_TITLE, title);
            params.putString(SocialConstants.PARAM_SUMMARY, summary);
            params.putString(SocialConstants.PARAM_TARGET_URL, targetUrl);
            if (bmp != null) {
                try {
                    ArrayList<String> is = new ArrayList();
                    File bitmapFile = new File(new StringBuilder(String.valueOf(Environment.getExternalStorageDirectory().getPath())).append("/account/pic.jpg").toString());
                    Bitmap newBitmap = Bitmap.createBitmap(bmp.getWidth(), bmp.getHeight(), Config.ARGB_8888);
                    Canvas canvas = new Canvas(newBitmap);
                    canvas.drawColor(-1);
                    canvas.drawBitmap(bmp, 0.0f, 0.0f, null);
                    OutputStream stream = new FileOutputStream(bitmapFile);
                    newBitmap.compress(CompressFormat.JPEG, 80, stream);
                    stream.close();
                    is.add(bitmapFile.getAbsolutePath());
                    params.putStringArrayList(SocialConstants.PARAM_IMAGE_URL, is);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            getMainHandler().post(new C07344(params));
        }
    }

    private static Handler getMainHandler() {
        if (mManinHandler == null) {
            synchronized (mMainHandlerLock) {
                if (mManinHandler == null) {
                    mManinHandler = new Handler(Looper.getMainLooper());
                }
            }
        }
        return mManinHandler;
    }

    public static void onActivityResult(int requestCode, int resultCode, Intent data) {
        if ((checkQQ() && requestCode == Constants.REQUEST_QQ_SHARE) || requestCode == Constants.REQUEST_QZONE_SHARE) {
            Tencent.onActivityResultData(requestCode, resultCode, data, qqShareListener);
        }
    }
}
