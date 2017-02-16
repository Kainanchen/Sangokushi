package com.facebook;

import android.support.v4.os.EnvironmentCompat;
import com.facebook.p036h.Logger;
import com.facebook.p036h.af;
import com.sina.weibo.sdk.register.mobile.SelectCountryActivity;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.facebook.s */
public final class GraphResponse {
    public final JSONObject f2735a;
    public final FacebookRequestError f2736b;
    private final HttpURLConnection f2737c;
    private final JSONArray f2738d;
    private final String f2739e;
    private final GraphRequest f2740f;

    GraphResponse(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(graphRequest, httpURLConnection, str, jSONObject, null, null);
    }

    private GraphResponse(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONArray jSONArray) {
        this(graphRequest, httpURLConnection, str, null, jSONArray, null);
    }

    GraphResponse(GraphRequest graphRequest, HttpURLConnection httpURLConnection, FacebookRequestError facebookRequestError) {
        this(graphRequest, httpURLConnection, null, null, null, facebookRequestError);
    }

    private GraphResponse(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        this.f2740f = graphRequest;
        this.f2737c = httpURLConnection;
        this.f2739e = str;
        this.f2735a = jSONObject;
        this.f2738d = jSONArray;
        this.f2736b = facebookRequestError;
    }

    public final String toString() {
        String format;
        try {
            Locale locale = Locale.US;
            String str = "%d";
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(this.f2737c != null ? this.f2737c.getResponseCode() : 200);
            format = String.format(locale, str, objArr);
        } catch (IOException e) {
            format = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        return "{Response:  responseCode: " + format + ", graphObject: " + this.f2735a + ", error: " + this.f2736b + "}";
    }

    static List<GraphResponse> m2648a(HttpURLConnection httpURLConnection, GraphRequestBatch graphRequestBatch) {
        List<GraphResponse> a;
        Closeable closeable = null;
        try {
            if (httpURLConnection.getResponseCode() >= 400) {
                closeable = httpURLConnection.getErrorStream();
            } else {
                closeable = httpURLConnection.getInputStream();
            }
            Logger.m1683a(LoggingBehavior.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(af.m1498a((InputStream) closeable).length()), r0);
            a = GraphResponse.m2647a(r0, httpURLConnection, graphRequestBatch);
        } catch (FacebookException e) {
            Logger.m1683a(LoggingBehavior.REQUESTS, "Response", "Response <Error>: %s", e);
            a = GraphResponse.m2650a((List) graphRequestBatch, httpURLConnection, e);
        } catch (Throwable e2) {
            Logger.m1683a(LoggingBehavior.REQUESTS, "Response", "Response <Error>: %s", e2);
            a = GraphResponse.m2650a((List) graphRequestBatch, httpURLConnection, new FacebookException(e2));
        } finally {
            af.m1513a(closeable);
        }
        return a;
    }

    static List<GraphResponse> m2647a(String str, HttpURLConnection httpURLConnection, GraphRequestBatch graphRequestBatch) {
        Logger.m1683a(LoggingBehavior.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", graphRequestBatch.f2732d, Integer.valueOf(str.length()), GraphResponse.m2649a(httpURLConnection, (List) graphRequestBatch, new JSONTokener(str).nextValue()));
        return GraphResponse.m2649a(httpURLConnection, (List) graphRequestBatch, new JSONTokener(str).nextValue());
    }

    private static List<GraphResponse> m2649a(HttpURLConnection httpURLConnection, List<GraphRequest> list, Object obj) {
        JSONArray jSONArray;
        int size = list.size();
        List<GraphResponse> arrayList = new ArrayList(size);
        if (size == 1) {
            GraphRequest graphRequest = (GraphRequest) list.get(0);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("body", obj);
                jSONObject.put(SelectCountryActivity.EXTRA_COUNTRY_CODE, httpURLConnection != null ? httpURLConnection.getResponseCode() : 200);
                jSONArray = new JSONArray();
                jSONArray.put(jSONObject);
            } catch (Exception e) {
                arrayList.add(new GraphResponse(graphRequest, httpURLConnection, new FacebookRequestError(httpURLConnection, e)));
                jSONArray = obj;
            } catch (Exception e2) {
                arrayList.add(new GraphResponse(graphRequest, httpURLConnection, new FacebookRequestError(httpURLConnection, e2)));
            }
            if ((jSONArray instanceof JSONArray) || jSONArray.length() != size) {
                throw new FacebookException("Unexpected number of results");
            }
            jSONArray = jSONArray;
            for (size = 0; size < jSONArray.length(); size++) {
                GraphRequest graphRequest2 = (GraphRequest) list.get(size);
                try {
                    Object obj2 = jSONArray.get(size);
                    Object obj3;
                    if (obj2 instanceof JSONObject) {
                        JSONObject jSONObject2 = (JSONObject) obj2;
                        FacebookRequestError a = FacebookRequestError.m2571a(jSONObject2, obj, httpURLConnection);
                        if (a != null) {
                            if (a.f2652c == 190 && af.m1521a(graphRequest2.f2711b)) {
                                AccessToken.m887a(null);
                            }
                            obj2 = new GraphResponse(graphRequest2, httpURLConnection, a);
                        } else {
                            obj2 = af.m1495a(jSONObject2, "body", "FACEBOOK_NON_JSON_RESULT");
                            GraphResponse graphResponse;
                            if (obj2 instanceof JSONObject) {
                                graphResponse = new GraphResponse(graphRequest2, httpURLConnection, obj2.toString(), (JSONObject) obj2);
                            } else if (obj2 instanceof JSONArray) {
                                graphResponse = new GraphResponse(graphRequest2, httpURLConnection, obj2.toString(), (JSONArray) obj2);
                            } else {
                                obj3 = JSONObject.NULL;
                                if (obj3 != JSONObject.NULL) {
                                    obj2 = new GraphResponse(graphRequest2, httpURLConnection, obj3.toString(), null);
                                } else {
                                    throw new FacebookException("Got unexpected object type in response, class: " + obj3.getClass().getSimpleName());
                                }
                            }
                        }
                    }
                    obj3 = obj2;
                    if (obj3 != JSONObject.NULL) {
                        throw new FacebookException("Got unexpected object type in response, class: " + obj3.getClass().getSimpleName());
                    }
                    obj2 = new GraphResponse(graphRequest2, httpURLConnection, obj3.toString(), null);
                    arrayList.add(obj2);
                } catch (Exception e3) {
                    arrayList.add(new GraphResponse(graphRequest2, httpURLConnection, new FacebookRequestError(httpURLConnection, e3)));
                } catch (Exception e32) {
                    arrayList.add(new GraphResponse(graphRequest2, httpURLConnection, new FacebookRequestError(httpURLConnection, e32)));
                }
            }
            return arrayList;
        }
        jSONArray = obj;
        if (jSONArray instanceof JSONArray) {
        }
        throw new FacebookException("Unexpected number of results");
    }

    static List<GraphResponse> m2650a(List<GraphRequest> list, HttpURLConnection httpURLConnection, FacebookException facebookException) {
        int size = list.size();
        List<GraphResponse> arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new GraphResponse((GraphRequest) list.get(i), httpURLConnection, new FacebookRequestError(httpURLConnection, (Exception) facebookException)));
        }
        return arrayList;
    }
}
