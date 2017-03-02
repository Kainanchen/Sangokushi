package com.zkunity.core;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.alipay.sdk.app.PayTask;
import com.alipay.sdk.util.C0201h;
import com.alipay.sdk.util.C0203j;
import com.android.volley.VolleyError;
import com.igexin.download.Downloads;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.zkunity.app.AppManager;
import com.zkunity.config.MConfig;
import com.zkunity.model.MJSONObject;
import com.zkunity.network.SyncNetworkCall;
import com.zkunity.network.SyncNetworkUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class MAlipay implements MPay {
    private Handler payHandler;

    /* renamed from: com.zkunity.core.MAlipay.1 */
    class C07281 extends Handler {
        C07281() {
        }

        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 333:
                    String resultStatus = new PayResult((String) msg.obj).getResultStatus();
                    if (TextUtils.equals(resultStatus, "9000")) {
                        PayManager.getManager().sPayCall(1);
                    } else if (TextUtils.equals(resultStatus, "8000")) {
                        PayManager.getManager().sPayCall(1);
                    } else if (TextUtils.equals(resultStatus, "6001")) {
                        PayManager.getManager().sPayCall(0);
                    } else {
                        PayManager.getManager().sPayCall(-1);
                    }
                default:
            }
        }
    }

    /* renamed from: com.zkunity.core.MAlipay.2 */
    class C07292 implements Runnable {
        private final /* synthetic */ String val$payInfos;

        C07292(String str) {
            this.val$payInfos = str;
        }

        public void run() {
            String sign = SignUtils.sign(this.val$payInfos, "MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBAKNPWtIoK1vJe+leiusHHzeAZDAtlnDMZDM7fCrADrIcqkRKigVupvL7kXLHb83cesvvYruewuGfCetgV2tAIZCIlOp8dSSeQ6Lge+oUiLpx4aiE9cKgTcbV2FhIGQM3LhGjevuDgfYsPGO8PYkAzyhjdRovrJ5w5GSm1BzXvrgVAgMBAAECgYAXxwgMLTkS5iUad192lNTgudrcgOa0ia3VH8YWW1xIZpAL3WZ3IANCwYoN0iffK0jdxH71nkn1m7hQAvj3bqD0NMEmIDYu2r7ulA7aatN/ETeJnmVvjEMKLaPC/V0HKn/AgZ9fWaprY/HZQRU2fOVhMyBku6e/DPC4jFEBW9NbiQJBANCV8C6CRTPrkmR7LUL0ABNqtLPQimu777RflnZxR/Qi9Lwxl8lEoYE8pcDMJ1d/nu8C2OMZq9t3A+pHvJ4cOlsCQQDIbrkFPAhwQIbhRRWhZho8YDuczQ/PMeOPodeFI5zMD2DngSrSmzP7E5Av9gjNNgwLLmHQc4n8neXi+qaZ/AJPAkBNoTAVryggTbFbMjjDLVqF33XHYnrR480vnU+7Xye/Ze8dx3tNTfypw6+Q1Kpjtzyoia+8vcYnVOEhJXe+hJT3AkA1RdChhopLo6r19xG/u06f24gcrhhUntL4GzEYbxW+2xuLjLZgEeZoBpQdW0yNlp7u3d4btInpfeJbSPm9FdFbAkBncc3/DXICwhaEX0BXJA08BWM592Q1xp7JkDxFtkA0ylhBflLoU8IB9pVJqav6aaf0si6jSN7acVAr3PbeXpHA");
            try {
                sign = URLEncoder.encode(sign, AsyncHttpResponseHandler.DEFAULT_CHARSET);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            String result = new PayTask(AppManager.getManager().getAppActivity()).pay(this.val$payInfos + "&sign=\"" + sign + "\"&sign_type=\"RSA\"", true);
            Message msg = new Message();
            msg.what = 333;
            msg.obj = result;
            MAlipay.this.payHandler.sendMessage(msg);
        }
    }

    private class CreateAlipayListener implements SyncNetworkCall {
        private CreateAlipayListener() {
        }

        public void onSuccess(int statusCode, String rs) {
            MJSONObject mObj = new MJSONObject();
            mObj.invokeData(rs);
            MAlipay.this.activePay(mObj.getString("alipayInfos"));
        }

        public void onFailure(int statusCode, VolleyError error) {
            PayManager.getManager().sPayCall(-3);
        }
    }

    public class PayResult {
        private String memo;
        private String result;
        private String resultStatus;

        public PayResult(String rawResult) {
            if (!TextUtils.isEmpty(rawResult)) {
                for (String resultParam : rawResult.split(C0201h.f510b)) {
                    if (resultParam.startsWith(C0203j.f517a)) {
                        this.resultStatus = gatValue(resultParam, C0203j.f517a);
                    }
                    if (resultParam.startsWith(C0203j.f519c)) {
                        this.result = gatValue(resultParam, C0203j.f519c);
                    }
                    if (resultParam.startsWith(C0203j.f518b)) {
                        this.memo = gatValue(resultParam, C0203j.f518b);
                    }
                }
            }
        }

        public String toString() {
            return "resultStatus={" + this.resultStatus + "};memo={" + this.memo + "};result={" + this.result + C0201h.f512d;
        }

        private String gatValue(String content, String key) {
            String prefix = new StringBuilder(String.valueOf(key)).append("={").toString();
            return content.substring(content.indexOf(prefix) + prefix.length(), content.lastIndexOf(C0201h.f512d));
        }

        public String getResultStatus() {
            return this.resultStatus;
        }

        public String getMemo() {
            return this.memo;
        }

        public String getResult() {
            return this.result;
        }
    }

    public MAlipay() {
        this.payHandler = new C07281();
    }

    public void init() {
    }

    public void pay(String sid, String gid, String uid, String roleId) {
        paySync(sid, gid, uid, roleId);
    }

    private void paySync(String sid, String gid, String uid, String roleId) {
        MJSONObject mObj = new MJSONObject();
        mObj.createNewFromNull();
        mObj.putString(Downloads.COLUMN_URI, "createAlipayOrderInfo");
        mObj.putString("sid", sid);
        mObj.putString("gid", gid);
        mObj.putString("uid", uid);
        mObj.putString("roleId", roleId);
        SyncNetworkUtils.postByHttp(new StringBuilder(String.valueOf(MConfig.getString("baseUrl"))).append("pay").toString(), mObj.toString(), new CreateAlipayListener());
    }

    private void activePay(String payInfos) {
        new Thread(new C07292(payInfos)).start();
    }

    public void close() {
    }
}
