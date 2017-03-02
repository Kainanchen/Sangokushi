package com.igexin.getuiext.data;

import com.tencent.wxop.stat.common.StatConstants;

public class Consts {
    public static String APPID = null;
    public static final int BIDB_MAX = 20;
    public static final int BISEND_MAX = 20;
    public static final String BITYPE_PROMOTION_TEXT_OR_IMG = "13";
    public static final String BITYPE_RECOMMEND = "3";
    public static final String BITYPE_UPDATE = "2";
    public static String CID = null;
    public static final String CMD_ACTION = "action";
    public static int DEFAULT_RETRY_TIMES = 0;
    public static final String DELIVER_URL = "http://sdk.open.inc2.igexin.com/api.php";
    public static final String DOWNLOAD_HANDLER_OWNER = "GETUI_INC";
    public static final int GET_CID_DATA = 10002;
    public static final int GET_MSG_DATA = 10001;
    public static String INC_APPID = null;
    public static final int INSTALL_APP = 11003;
    public static final int ORIGINAL_URL_CLICK = 13;
    public static final String PHONE_ADDRESS_URL = "http://sdk.open.phone.igexin.com/api.php";
    public static final int PROMOTION_ACTION_CLICK = 2;
    public static final int PROMOTION_ACTION_SHOW = 1;
    public static final String PROMOTION_TYPE_IMG = "image";
    public static final String PROMOTION_TYPE_TEXT = "text";
    public static final int RECOMMEND_DOWNLOAD_CONTINUE = 7;
    public static final int RECOMMEND_DOWNLOAD_FINISHED = 3;
    public static final int RECOMMEND_DOWNLOAD_PAUSE = 6;
    public static final int RECOMMEND_DOWNLOAD_START = 2;
    public static final int RECOMMEND_INSTALL_CLICK = 5;
    public static final int RECOMMEND_INSTALL_FINISHED = 4;
    public static final int RECOMMEND_SHOW = 1;
    public static final int SEND_BI = 11002;
    public static final int SERVICE_ONRECEIVE = 11001;
    public static final int SERVICE_ONSTART = 11000;
    public static final long TIME_24HOUR = 86400000;
    public static final int UPDATE_APP_MANAGE = 10;
    public static final int UPDATE_CLICK = 2;
    public static final int UPDATE_CLOSE = 7;
    public static final int UPDATE_DOWNLOAD_CONTINUE = 9;
    public static final int UPDATE_DOWNLOAD_FINISHED = 4;
    public static final int UPDATE_DOWNLOAD_PAUSE = 8;
    public static final int UPDATE_DOWNLOAD_START = 3;
    public static final int UPDATE_DOWNLOAD_WIFI = 11;
    public static final int UPDATE_INSTALL_CLICK = 6;
    public static final int UPDATE_INSTALL_FINISHED = 5;
    public static final int UPDATE_NEXTTIME_CLICK = 12;
    public static final int UPDATE_RESULT = 10003;
    public static final int UPDATE_SHOW = 1;
    public static String VERSION = null;
    public static final String channelid = "tencent";
    public static int verifyCode;

    static {
        DEFAULT_RETRY_TIMES = UPDATE_DOWNLOAD_START;
        VERSION = StatConstants.VERSION;
        APPID = null;
        CID = null;
        INC_APPID = "7fjUl2Z3LH6xYy7NQK4ni4";
    }
}
