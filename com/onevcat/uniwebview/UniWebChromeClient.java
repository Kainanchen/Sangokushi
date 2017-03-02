package com.onevcat.uniwebview;

import android.content.Intent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.unity3d.player.UnityPlayer;

public class UniWebChromeClient extends WebChromeClient {
    LayoutParams LayoutParameters;
    private View _customView;
    private CustomViewCallback _customViewCallback;
    private FrameLayout _customViewContainer;
    private FrameLayout _uniWebViewLayout;

    public UniWebChromeClient(FrameLayout oriLayout) {
        this.LayoutParameters = new LayoutParams(-1, -1);
        this._uniWebViewLayout = oriLayout;
    }

    public void onShowCustomView(View view, CustomViewCallback callback) {
        this._customView = view;
        this._customViewCallback = callback;
        UniWebViewCustomViewActivity.currentFullScreenClient = this;
        UnityPlayer.currentActivity.startActivity(new Intent(UnityPlayer.currentActivity, UniWebViewCustomViewActivity.class));
    }

    public void ToggleFullScreen(UniWebViewCustomViewActivity activity) {
        this._customViewContainer = new FrameLayout(activity);
        this._uniWebViewLayout.setVisibility(8);
        this._customViewContainer.setLayoutParams(this.LayoutParameters);
        this._customView.setLayoutParams(this.LayoutParameters);
        this._customViewContainer.addView(this._customView);
        this._customViewContainer.setVisibility(0);
        activity.setContentView(this._customViewContainer);
    }

    public void onHideCustomView() {
        if (this._customView != null) {
            this._customView.setVisibility(8);
            this._customViewContainer.removeView(this._customView);
            this._customView = null;
            this._customViewContainer.setVisibility(8);
            this._customViewCallback.onCustomViewHidden();
            this._uniWebViewLayout.setVisibility(0);
        }
    }
}
