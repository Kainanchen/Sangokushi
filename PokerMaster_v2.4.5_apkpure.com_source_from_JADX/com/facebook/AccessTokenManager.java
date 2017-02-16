package com.facebook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;
import com.facebook.AccessToken.AccessToken;
import com.facebook.GraphRequest.GraphRequest;
import com.facebook.GraphRequestBatch.GraphRequestBatch;
import com.facebook.p036h.af;
import com.facebook.p036h.ag;
import com.sina.weibo.sdk.component.ShareRequestParam;
import com.sina.weibo.sdk.constant.WBConstants;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.c */
final class AccessTokenManager {
    private static volatile AccessTokenManager f1094d;
    final AccessTokenCache f1095a;
    AccessToken f1096b;
    Date f1097c;
    private final LocalBroadcastManager f1098e;
    private AtomicBoolean f1099f;

    /* renamed from: com.facebook.c.1 */
    class AccessTokenManager implements Runnable {
        final /* synthetic */ AccessToken f950a;
        final /* synthetic */ AccessTokenManager f951b;

        AccessTokenManager(AccessTokenManager accessTokenManager) {
            this.f951b = accessTokenManager;
            this.f950a = null;
        }

        public final void run() {
            this.f951b.m1002a(this.f950a);
        }
    }

    /* renamed from: com.facebook.c.2 */
    class AccessTokenManager implements GraphRequest {
        final /* synthetic */ AtomicBoolean f952a;
        final /* synthetic */ Set f953b;
        final /* synthetic */ Set f954c;
        final /* synthetic */ AccessTokenManager f955d;

        AccessTokenManager(AccessTokenManager accessTokenManager, AtomicBoolean atomicBoolean, Set set, Set set2) {
            this.f955d = accessTokenManager;
            this.f952a = atomicBoolean;
            this.f953b = set;
            this.f954c = set2;
        }

        public final void m903a(GraphResponse graphResponse) {
            JSONObject jSONObject = graphResponse.f2735a;
            if (jSONObject != null) {
                JSONArray optJSONArray = jSONObject.optJSONArray(ShareRequestParam.RESP_UPLOAD_PIC_PARAM_DATA);
                if (optJSONArray != null) {
                    this.f952a.set(true);
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("permission");
                            String optString2 = optJSONObject.optString(NotificationCompatApi24.CATEGORY_STATUS);
                            if (!(af.m1523a(optString) || af.m1523a(optString2))) {
                                optString2 = optString2.toLowerCase(Locale.US);
                                if (optString2.equals("granted")) {
                                    this.f953b.add(optString);
                                } else if (optString2.equals("declined")) {
                                    this.f954c.add(optString);
                                } else {
                                    Log.w("AccessTokenManager", "Unexpected status: " + optString2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.facebook.c.3 */
    class AccessTokenManager implements GraphRequest {
        final /* synthetic */ AccessTokenManager f956a;
        final /* synthetic */ AccessTokenManager f957b;

        AccessTokenManager(AccessTokenManager accessTokenManager, AccessTokenManager accessTokenManager2) {
            this.f957b = accessTokenManager;
            this.f956a = accessTokenManager2;
        }

        public final void m904a(GraphResponse graphResponse) {
            JSONObject jSONObject = graphResponse.f2735a;
            if (jSONObject != null) {
                this.f956a.f965a = jSONObject.optString(WBConstants.AUTH_ACCESS_TOKEN);
                this.f956a.f966b = jSONObject.optInt("expires_at");
            }
        }
    }

    /* renamed from: com.facebook.c.4 */
    class AccessTokenManager implements GraphRequestBatch {
        final /* synthetic */ AccessToken f958a;
        final /* synthetic */ AccessToken f959b;
        final /* synthetic */ AtomicBoolean f960c;
        final /* synthetic */ AccessTokenManager f961d;
        final /* synthetic */ Set f962e;
        final /* synthetic */ Set f963f;
        final /* synthetic */ AccessTokenManager f964g;

        AccessTokenManager(AccessTokenManager accessTokenManager, AccessToken accessToken, AccessToken accessToken2, AtomicBoolean atomicBoolean, AccessTokenManager accessTokenManager2, Set set, Set set2) {
            this.f964g = accessTokenManager;
            this.f958a = accessToken;
            this.f959b = accessToken2;
            this.f960c = atomicBoolean;
            this.f961d = accessTokenManager2;
            this.f962e = set;
            this.f963f = set2;
        }

        public final void m906a() {
            try {
                FacebookException facebookException;
                if (AccessTokenManager.m999a().f1096b == null || AccessTokenManager.m999a().f1096b.f926h != this.f958a.f926h) {
                    if (this.f959b != null) {
                        facebookException = new FacebookException("No current access token to refresh");
                    }
                    this.f964g.f1099f.set(false);
                } else if (!this.f960c.get() && this.f961d.f965a == null && this.f961d.f966b == 0) {
                    if (this.f959b != null) {
                        facebookException = new FacebookException("Failed to refresh access token");
                    }
                    this.f964g.f1099f.set(false);
                } else {
                    String str;
                    Collection collection;
                    Collection collection2;
                    Date date;
                    if (this.f961d.f965a != null) {
                        str = this.f961d.f965a;
                    } else {
                        str = this.f958a.f922d;
                    }
                    String str2 = this.f958a.f925g;
                    String str3 = this.f958a.f926h;
                    if (this.f960c.get()) {
                        collection = this.f962e;
                    } else {
                        collection = this.f958a.f920b;
                    }
                    if (this.f960c.get()) {
                        collection2 = this.f963f;
                    } else {
                        collection2 = this.f958a.f921c;
                    }
                    AccessTokenSource accessTokenSource = this.f958a.f923e;
                    if (this.f961d.f966b != 0) {
                        date = new Date(((long) this.f961d.f966b) * 1000);
                    } else {
                        date = this.f958a.f919a;
                    }
                    AccessTokenManager.m999a().m1003a(new AccessToken(str, str2, str3, collection, collection2, accessTokenSource, date, new Date()), true);
                    this.f964g.f1099f.set(false);
                    if (this.f959b == null) {
                    }
                }
            } catch (Throwable th) {
                this.f964g.f1099f.set(false);
            }
        }
    }

    /* renamed from: com.facebook.c.a */
    private static class AccessTokenManager {
        public String f965a;
        public int f966b;

        private AccessTokenManager() {
        }
    }

    private AccessTokenManager(LocalBroadcastManager localBroadcastManager, AccessTokenCache accessTokenCache) {
        this.f1099f = new AtomicBoolean(false);
        this.f1097c = new Date(0);
        ag.m1544a((Object) localBroadcastManager, "localBroadcastManager");
        ag.m1544a((Object) accessTokenCache, "accessTokenCache");
        this.f1098e = localBroadcastManager;
        this.f1095a = accessTokenCache;
    }

    static AccessTokenManager m999a() {
        if (f1094d == null) {
            synchronized (AccessTokenManager.class) {
                if (f1094d == null) {
                    f1094d = new AccessTokenManager(LocalBroadcastManager.getInstance(FacebookSdk.m2586f()), new AccessTokenCache());
                }
            }
        }
        return f1094d;
    }

    final void m1003a(AccessToken accessToken, boolean z) {
        Object obj = this.f1096b;
        this.f1096b = accessToken;
        this.f1099f.set(false);
        this.f1097c = new Date(0);
        if (z) {
            if (accessToken != null) {
                this.f1095a.m901a(accessToken);
            } else {
                AccessTokenCache accessTokenCache = this.f1095a;
                accessTokenCache.f947a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
                if (FacebookSdk.m2582c()) {
                    accessTokenCache.m902b().m2658b();
                }
                af.m1529b(FacebookSdk.m2586f());
            }
        }
        if (!af.m1522a(obj, (Object) accessToken)) {
            Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", obj);
            intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken);
            this.f1098e.sendBroadcast(intent);
        }
    }

    final void m1002a(AccessToken accessToken) {
        AccessToken accessToken2 = this.f1096b;
        FacebookException facebookException;
        if (accessToken2 == null) {
            if (accessToken != null) {
                facebookException = new FacebookException("No current access token to refresh");
            }
        } else if (this.f1099f.compareAndSet(false, true)) {
            this.f1097c = new Date();
            Set hashSet = new HashSet();
            Set hashSet2 = new HashSet();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            AccessTokenManager accessTokenManager = new AccessTokenManager();
            GraphRequest[] graphRequestArr = new GraphRequest[2];
            String str = "me/permissions";
            graphRequestArr[0] = new GraphRequest(accessToken2, str, new Bundle(), HttpMethod.GET, new AccessTokenManager(this, atomicBoolean, hashSet, hashSet2));
            GraphRequest accessTokenManager2 = new AccessTokenManager(this, accessTokenManager);
            Bundle bundle = new Bundle();
            bundle.putString(WBConstants.AUTH_PARAMS_GRANT_TYPE, "fb_extend_sso_token");
            graphRequestArr[1] = new GraphRequest(accessToken2, "oauth/access_token", bundle, HttpMethod.GET, accessTokenManager2);
            GraphRequestBatch graphRequestBatch = new GraphRequestBatch(graphRequestArr);
            AccessTokenManager accessTokenManager3 = new AccessTokenManager(this, accessToken2, accessToken, atomicBoolean, accessTokenManager, hashSet, hashSet2);
            if (!graphRequestBatch.f2733e.contains(accessTokenManager3)) {
                graphRequestBatch.f2733e.add(accessTokenManager3);
            }
            GraphRequest.m2629b(graphRequestBatch);
        } else if (accessToken != null) {
            facebookException = new FacebookException("Refresh already in progress");
        }
    }
}
