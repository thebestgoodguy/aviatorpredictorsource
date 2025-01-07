package com.google.android.gms.internal.p000firebaseauthapi;

import b0.l;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class vp implements om {

    /* renamed from: j, reason: collision with root package name */
    private static final String f2249j = "vp";

    /* renamed from: e, reason: collision with root package name */
    private String f2250e;

    /* renamed from: f, reason: collision with root package name */
    private String f2251f;

    /* renamed from: g, reason: collision with root package name */
    private String f2252g;

    /* renamed from: h, reason: collision with root package name */
    private String f2253h;

    /* renamed from: i, reason: collision with root package name */
    private long f2254i;

    public final long a() {
        return this.f2254i;
    }

    public final String b() {
        return this.f2250e;
    }

    public final String c() {
        return this.f2253h;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.om
    public final /* bridge */ /* synthetic */ om d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f2250e = l.a(jSONObject.optString("idToken", null));
            this.f2251f = l.a(jSONObject.optString("displayName", null));
            this.f2252g = l.a(jSONObject.optString("email", null));
            this.f2253h = l.a(jSONObject.optString("refreshToken", null));
            this.f2254i = jSONObject.optLong("expiresIn", 0L);
            return this;
        } catch (NullPointerException | JSONException e5) {
            throw pq.a(e5, f2249j, str);
        }
    }
}
