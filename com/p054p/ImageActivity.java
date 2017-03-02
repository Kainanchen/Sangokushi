package com.p054p;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore.Images.Media;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.Log;
import com.tencent.connect.common.Constants;
import com.tencent.open.SocialConstants;
import com.zkunity.app.ResourceIDs;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.text.SimpleDateFormat;

/* renamed from: com.p.ImageActivity */
public class ImageActivity extends Activity {
    public static final String ACCOUNT_DIR;
    public static final String ACCOUNT_MAINTRANCE_ICON_CACHE = "icon_cache/";
    private static final String IMGPATH;
    public static final int SELECET_A_PICTURE_AFTER_KIKAT = 50;
    public static final int SELECT_A_PICTURE = 20;
    public static final int SET_ALBUM_PICTURE_KITKAT = 40;
    public static final int SET_PICTURE = 30;
    public static final int TAKE_A_PICTURE = 10;
    private int f1449h;
    private String mAlbumPicturePath;
    final boolean mIsKitKat;
    private Uri photoUri;
    private int f1450w;

    /* renamed from: com.p.ImageActivity.1 */
    class C05641 implements OnClickListener {
        C05641() {
        }

        public void onClick(DialogInterface dialog, int which) {
            if (which == 0) {
                ImageActivity.this.takePicture();
            } else if (which != 1) {
            } else {
                if (ImageActivity.this.mIsKitKat) {
                    ImageActivity.this.selectImageUriAfterKikat();
                } else {
                    ImageActivity.this.cropImageUri();
                }
            }
        }
    }

    /* renamed from: com.p.ImageActivity.2 */
    class C05652 implements OnCancelListener {
        C05652() {
        }

        public void onCancel(DialogInterface dialog) {
            ImageActivity.this.finish();
        }
    }

    public ImageActivity() {
        this.mIsKitKat = VERSION.SDK_INT >= 19;
        this.mAlbumPicturePath = null;
    }

    static {
        ACCOUNT_DIR = new StringBuilder(String.valueOf(Environment.getExternalStorageDirectory().getPath())).append("/account/").toString();
        IMGPATH = ACCOUNT_DIR + ACCOUNT_MAINTRANCE_ICON_CACHE;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        getWindow().setFlags(AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT, AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT);
        this.f1450w = getIntent().getIntExtra("w", AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
        this.f1449h = getIntent().getIntExtra("h", AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
        File f = new File(IMGPATH);
        if (!f.exists()) {
            f.mkdirs();
        }
        new Builder(this, 1).setIcon(17301544).setTitle(getString("select")).setItems(new String[]{getString("camera"), getString("album")}, new C05641()).setOnCancelListener(new C05652()).show();
    }

    public String getString(String name) {
        int id = getResourseId(this, name, ResourceIDs.STRING_ID);
        if (id == -1) {
            return Constants.STR_EMPTY;
        }
        String p = getResources().getString(id);
        if (p != null) {
            return p;
        }
        return Constants.STR_EMPTY;
    }

    public int getResourseId(Context ctx, String pVariableName, String pResourcename) {
        if (ctx != null) {
            try {
                return ctx.getResources().getIdentifier(pVariableName, pResourcename, ctx.getPackageName());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return -1;
    }

    private void takePicture() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE", null);
        String filename = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date(0));
        ContentValues values = new ContentValues();
        values.put(SocialConstants.PARAM_TITLE, filename);
        this.photoUri = getContentResolver().insert(Media.EXTERNAL_CONTENT_URI, values);
        intent.putExtra("output", this.photoUri);
        startActivityForResult(intent, TAKE_A_PICTURE);
    }

    private void cropImageUri() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT", null);
        intent.setType("image/*");
        intent.putExtra("crop", "true");
        intent.putExtra("aspectX", 1);
        intent.putExtra("aspectY", 1);
        intent.putExtra("outputX", this.f1450w);
        intent.putExtra("outputY", this.f1449h);
        intent.putExtra("scale", true);
        intent.putExtra("return-data", false);
        intent.putExtra("output", Uri.fromFile(new File(IMGPATH, "tmp_r.png")));
        intent.putExtra("outputFormat", CompressFormat.PNG.toString());
        intent.putExtra("noFaceDetection", true);
        startActivityForResult(intent, SELECT_A_PICTURE);
    }

    private void selectImageUriAfterKikat() {
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("image/*");
        startActivityForResult(intent, SELECET_A_PICTURE_AFTER_KIKAT);
    }

    private void cameraCropImageUri(Uri uri) {
        Intent intent = new Intent("com.android.camera.action.CROP");
        intent.setDataAndType(uri, "image/png");
        intent.putExtra("crop", "true");
        intent.putExtra("aspectX", 1);
        intent.putExtra("aspectY", 1);
        intent.putExtra("outputX", this.f1450w);
        intent.putExtra("outputY", this.f1449h);
        intent.putExtra("scale", true);
        intent.putExtra("return-data", false);
        intent.putExtra("output", uri);
        intent.putExtra("outputFormat", CompressFormat.PNG.toString());
        intent.putExtra("noFaceDetection", true);
        startActivityForResult(intent, SET_PICTURE);
    }

    private void cropImageUriAfterKikat(Uri uri) {
        Intent intent = new Intent("com.android.camera.action.CROP");
        intent.setDataAndType(uri, "image/png");
        intent.putExtra("crop", "true");
        intent.putExtra("aspectX", 1);
        intent.putExtra("aspectY", 1);
        intent.putExtra("outputX", this.f1450w);
        intent.putExtra("outputY", this.f1449h);
        intent.putExtra("scale", true);
        intent.putExtra("return-data", false);
        intent.putExtra("output", Uri.fromFile(new File(IMGPATH, "tmp_r.png")));
        intent.putExtra("outputFormat", CompressFormat.PNG.toString());
        intent.putExtra("noFaceDetection", true);
        startActivityForResult(intent, SET_ALBUM_PICTURE_KITKAT);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == SELECT_A_PICTURE) {
            if (resultCode != -1 || data == null) {
                finish();
            } else {
                finishBitmap(new File(IMGPATH, "tmp_r.png").getAbsolutePath());
            }
        } else if (requestCode == SELECET_A_PICTURE_AFTER_KIKAT) {
            if (resultCode != -1 || data == null) {
                finish();
                return;
            }
            this.mAlbumPicturePath = AlbumUtil.getPath(getApplicationContext(), data.getData());
            cropImageUriAfterKikat(Uri.fromFile(new File(this.mAlbumPicturePath)));
        } else if (requestCode == SET_ALBUM_PICTURE_KITKAT) {
            if (resultCode != -1 || data == null) {
                finish();
            } else {
                finishBitmap(new File(IMGPATH, "tmp_r.png").getAbsolutePath());
            }
        } else if (requestCode == TAKE_A_PICTURE) {
            if (resultCode == -1) {
                String oldPath = AlbumUtil.getPath(getApplicationContext(), this.photoUri);
                String newPath = new File(IMGPATH, "r.jpg").getAbsolutePath();
                try {
                    ImageActivity.copyFile(oldPath, newPath, true);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (this.mIsKitKat) {
                    cropImageUriAfterKikat(Uri.fromFile(new File(newPath)));
                    return;
                } else {
                    cameraCropImageUri(Uri.fromFile(new File(newPath)));
                    return;
                }
            }
            finish();
        } else if (requestCode != SET_PICTURE) {
        } else {
            if (resultCode != -1 || data == null) {
                finish();
            } else {
                finishBitmap(AlbumUtil.getPath(getApplicationContext(), data.getData()));
            }
        }
    }

    private void finishBitmap(String path) {
        finish();
        NativeTools.getPictureCallBack(path);
    }

    public static boolean copyFile(String srcFileName, String destFileName, boolean reWrite) throws IOException {
        File srcFile = new File(srcFileName);
        File destFile = new File(destFileName);
        if (!srcFile.exists()) {
            return false;
        }
        if (destFile.exists() && reWrite) {
            Log.d("copyFile", "copyFile, before copy File, delete first.");
            destFile.delete();
        }
        try {
            InputStream inStream = new FileInputStream(srcFile);
            FileOutputStream outStream = new FileOutputStream(destFile);
            byte[] buf = new byte[AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT];
            while (true) {
                int byteRead = inStream.read(buf);
                if (byteRead == -1) {
                    break;
                }
                outStream.write(buf, 0, byteRead);
            }
            outStream.flush();
            outStream.close();
            inStream.close();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        Log.d("copyFile", "copyFile, success");
        return true;
    }
}
