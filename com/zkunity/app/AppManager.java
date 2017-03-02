package com.zkunity.app;

import android.app.Activity;
import android.content.Context;

public class AppManager {
    private static AppManager app;
    private ZKActivity zkActivity;

    static {
        app = new AppManager();
    }

    private AppManager() {
    }

    public static AppManager getManager() {
        return app;
    }

    public void initAppManager(Activity appActivity) {
        this.zkActivity = new ZKActivity(appActivity);
    }

    public Activity getAppActivity() {
        return this.zkActivity.getAppActivity();
    }

    public Context getAppContext() {
        return this.zkActivity.getAppContext();
    }

    public String getAppString(String keyName) {
        return getAppString(this.zkActivity.getAppContext(), keyName);
    }

    public String getAppString(Context ctx, String keyName) {
        return MetaDataUtil.getAppString(ctx, keyName);
    }

    public String getActivityString(String keyName) {
        return getActivityString(this.zkActivity.getAppActivity(), keyName);
    }

    public String getActivityString(Activity act, String keyName) {
        return MetaDataUtil.getActivityString(act.getApplicationContext(), act.getComponentName(), keyName);
    }

    public String getServiceString(Class clazz, String keyName) {
        return getServiceString(this.zkActivity.getAppContext(), clazz, keyName);
    }

    public String getServiceString(Context ctx, Class clazz, String keyName) {
        return MetaDataUtil.getServiceString(ctx, clazz, keyName);
    }

    public String getReceiverString(Class clazz, String keyName) {
        return getServiceString(this.zkActivity.getAppContext(), clazz, keyName);
    }

    public String getReceiverString(Context ctx, Class clazz, String keyName) {
        return MetaDataUtil.getServiceString(ctx, clazz, keyName);
    }

    public int getStringId(String pVariableName) {
        return getStringId(this.zkActivity.getAppContext(), pVariableName);
    }

    public int getStringId(Context ctx, String pVariableName) {
        return ResourceIDs.getResourseId(ctx, pVariableName, ResourceIDs.STRING_ID);
    }

    public int getDrawableId(String pVariableName) {
        return getStringId(this.zkActivity.getAppContext(), pVariableName);
    }

    public int getDrawableId(Context ctx, String pVariableName) {
        return ResourceIDs.getResourseId(ctx, pVariableName, ResourceIDs.DRAWABLE_ID);
    }

    public int getId(String pVariableName) {
        return getStringId(this.zkActivity.getAppContext(), pVariableName);
    }

    public int getId(Context ctx, String pVariableName) {
        return ResourceIDs.getResourseId(ctx, pVariableName, ResourceIDs.ID);
    }

    public int getLayoutId(String pVariableName) {
        return getStringId(this.zkActivity.getAppContext(), pVariableName);
    }

    public int getLayoutId(Context ctx, String pVariableName) {
        return ResourceIDs.getResourseId(ctx, pVariableName, ResourceIDs.LAYOUT);
    }

    public int getIconId() {
        return ApkManager.getIconId(getAppContext());
    }

    public String getAppVersion() {
        return ApkManager.getAppVersion(getAppContext());
    }

    public String getAppName() {
        return ApkManager.getAppName(getAppContext());
    }

    public String[] getAppPremission() {
        return ApkManager.getAppPremission(getAppContext());
    }

    public String getAppSignature() {
        return ApkManager.getAppSignature(getAppContext());
    }
}
