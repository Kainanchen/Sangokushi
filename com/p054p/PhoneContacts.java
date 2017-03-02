package com.p054p;

import android.database.Cursor;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.text.TextUtils;
import com.alipay.sdk.cons.C0167c;
import com.unity3d.player.UnityPlayer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.p.PhoneContacts */
public class PhoneContacts {
    private static final String[] PHONES_PROJECTION;
    private JSONObject contacts;

    static {
        PHONES_PROJECTION = new String[]{"display_name", "data1"};
    }

    public String loadAllContacts() {
        JSONException e;
        this.contacts = new JSONObject();
        JSONArray arrays = new JSONArray();
        Cursor phoneCursor = UnityPlayer.currentActivity.getContentResolver().query(Phone.CONTENT_URI, PHONES_PROJECTION, null, null, null);
        if (phoneCursor != null) {
            while (phoneCursor.moveToNext()) {
                String phoneNumber = phoneCursor.getString(1);
                if (!TextUtils.isEmpty(phoneNumber)) {
                    String contactName = phoneCursor.getString(0);
                    JSONObject infos = new JSONObject();
                    try {
                        infos.put(C0167c.f364e, contactName);
                        JSONArray tels = new JSONArray();
                        JSONArray jSONArray;
                        try {
                            tels.put(phoneNumber);
                            infos.put("tel", tels);
                            jSONArray = tels;
                        } catch (JSONException e2) {
                            e = e2;
                            jSONArray = tels;
                            e.printStackTrace();
                            arrays.put(infos);
                        }
                    } catch (JSONException e3) {
                        e = e3;
                        e.printStackTrace();
                        arrays.put(infos);
                    }
                    arrays.put(infos);
                }
            }
            phoneCursor.close();
        }
        try {
            this.contacts.put("infos", arrays);
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
        return this.contacts.toString();
    }
}
