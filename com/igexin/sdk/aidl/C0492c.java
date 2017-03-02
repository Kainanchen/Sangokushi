package com.igexin.sdk.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.mm.sdk.constants.ConstantsAPI;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.wxop.stat.StatAccount;
import com.tencent.wxop.stat.common.StatConstants;

/* renamed from: com.igexin.sdk.aidl.c */
public abstract class C0492c extends Binder implements IGexinMsgService {
    public C0492c() {
        attachInterface(this, "com.igexin.sdk.aidl.IGexinMsgService");
    }

    public static IGexinMsgService m1741a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.igexin.sdk.aidl.IGexinMsgService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof IGexinMsgService)) ? new C0523d(iBinder) : (IGexinMsgService) queryLocalInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int startService;
        switch (i) {
            case StatConstants.XG_PRO_VERSION /*1*/:
                parcel.enforceInterface("com.igexin.sdk.aidl.IGexinMsgService");
                startService = startService(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(startService);
                return true;
            case StatConstants.USER_ONLINE_CONFIG_TYPE /*2*/:
                parcel.enforceInterface("com.igexin.sdk.aidl.IGexinMsgService");
                startService = stopService(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(startService);
                return true;
            case StatConstants.STAT_DB_VERSION /*3*/:
                parcel.enforceInterface("com.igexin.sdk.aidl.IGexinMsgService");
                startService = isStarted(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(startService);
                return true;
            case StatAccount.WECHAT_OPENID_TYPE /*4*/:
                parcel.enforceInterface("com.igexin.sdk.aidl.IGexinMsgService");
                startService = setSilentTime(parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(startService);
                return true;
            case StatAccount.PHONE_NUM_TYPE /*5*/:
                parcel.enforceInterface("com.igexin.sdk.aidl.IGexinMsgService");
                byte[] extFunction = extFunction(parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeByteArray(extFunction);
                return true;
            case StatAccount.EMAIL_TYPE /*6*/:
                parcel.enforceInterface("com.igexin.sdk.aidl.IGexinMsgService");
                startService = onASNLConnected(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong());
                parcel2.writeNoException();
                parcel2.writeInt(startService);
                return true;
            case StatAccount.CUSTOM_TYPE /*7*/:
                parcel.enforceInterface("com.igexin.sdk.aidl.IGexinMsgService");
                startService = onPSNLConnected(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong());
                parcel2.writeNoException();
                parcel2.writeInt(startService);
                return true;
            case IMediaObject.TYPE_EMOJI /*8*/:
                parcel.enforceInterface("com.igexin.sdk.aidl.IGexinMsgService");
                startService = sendByASNL(parcel.readString(), parcel.readString(), parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeInt(startService);
                return true;
            case ConstantsAPI.COMMAND_ADD_CARD_TO_EX_CARD_PACKAGE /*9*/:
                parcel.enforceInterface("com.igexin.sdk.aidl.IGexinMsgService");
                startService = receiveToPSNL(parcel.readString(), parcel.readString(), parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeInt(startService);
                return true;
            case IMediaObject.TYPE_PRODUCT /*10*/:
                parcel.enforceInterface("com.igexin.sdk.aidl.IGexinMsgService");
                startService = onASNLNetworkConnected();
                parcel2.writeNoException();
                parcel2.writeInt(startService);
                return true;
            case IMediaObject.TYPE_EMOTICON_GIFT /*11*/:
                parcel.enforceInterface("com.igexin.sdk.aidl.IGexinMsgService");
                startService = onASNLNetworkDisconnected();
                parcel2.writeNoException();
                parcel2.writeInt(startService);
                return true;
            case 1598968902:
                parcel2.writeString("com.igexin.sdk.aidl.IGexinMsgService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
