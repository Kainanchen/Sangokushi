package com.zkunity.core;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.zkunity.app.ResourceIDs;

public class ImageSelectDialog extends Dialog {
    private OnDataListener dataListener;

    /* renamed from: com.zkunity.core.ImageSelectDialog.1 */
    class C07251 implements OnClickListener {
        C07251() {
        }

        public void onClick(View v) {
            if (ImageSelectDialog.this.dataListener != null) {
                ImageSelectDialog.this.dataListener.onData("NativeGallery");
            }
            ImageSelectDialog.this.dismiss();
        }
    }

    /* renamed from: com.zkunity.core.ImageSelectDialog.2 */
    class C07262 implements OnClickListener {
        C07262() {
        }

        public void onClick(View v) {
            if (ImageSelectDialog.this.dataListener != null) {
                ImageSelectDialog.this.dataListener.onData("Camera");
            }
            ImageSelectDialog.this.dismiss();
        }
    }

    /* renamed from: com.zkunity.core.ImageSelectDialog.3 */
    class C07273 implements OnClickListener {
        C07273() {
        }

        public void onClick(View v) {
            ImageSelectDialog.this.cancel();
        }
    }

    public interface OnDataListener {
        void onData(String str);
    }

    public ImageSelectDialog(Context context) {
        super(context);
        setContentView(ResourceIDs.getResourseId(getContext(), "cp_imageselect", ResourceIDs.LAYOUT));
        init();
    }

    public ImageSelectDialog(Context context, int themeResId) {
        super(context, themeResId);
        setContentView(ResourceIDs.getResourseId(getContext(), "cp_imageselect", ResourceIDs.LAYOUT));
        init();
    }

    public void init() {
        setCanceledOnTouchOutside(true);
        ((Button) findViewById(ResourceIDs.getResourseId(getContext(), "cp_picname_btn", ResourceIDs.ID))).setOnClickListener(new C07251());
        ((Button) findViewById(ResourceIDs.getResourseId(getContext(), "cp_cameraname_btn", ResourceIDs.ID))).setOnClickListener(new C07262());
        ((Button) findViewById(ResourceIDs.getResourseId(getContext(), "cp_button_cancel_btn", ResourceIDs.ID))).setOnClickListener(new C07273());
    }

    public void setOnDataListener(OnDataListener dataListener) {
        this.dataListener = dataListener;
    }
}
