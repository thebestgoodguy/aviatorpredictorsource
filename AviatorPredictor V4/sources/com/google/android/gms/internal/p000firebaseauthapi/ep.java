package com.google.android.gms.internal.p000firebaseauthapi;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ep {

    /* renamed from: a, reason: collision with root package name */
    private String f1575a;

    /* renamed from: b, reason: collision with root package name */
    private String f1576b;

    /* renamed from: c, reason: collision with root package name */
    private String f1577c;

    /* renamed from: d, reason: collision with root package name */
    private Long f1578d;

    /* renamed from: e, reason: collision with root package name */
    private Long f1579e;

    public static ep a(String str) {
        try {
            ep epVar = new ep();
            JSONObject jSONObject = new JSONObject(str);
            epVar.f1575a = jSONObject.optString("iss");
            epVar.f1576b = jSONObject.optString("aud");
            epVar.f1577c = jSONObject.optString("sub");
            epVar.f1578d = Long.valueOf(jSONObject.optLong("iat"));
            epVar.f1579e = Long.valueOf(jSONObject.optLong("exp"));
            jSONObject.optBoolean("is_anonymous");
            return epVar;
        } catch (JSONException e5) {
            if (Log.isLoggable("JwtToken", 3)) {
                Log.d("JwtToken", "Failed to read JwtToken from JSONObject. ".concat(e5.toString()));
            }
            throw new UnsupportedEncodingException("Failed to read JwtToken from JSONObject. ".concat(e5.toString()));
        }
    }

    public final Long b() {
        return this.f1579e;
    }

    public final Long c() {
        return this.f1578d;
    }
}
