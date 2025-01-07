package com.google.android.gms.internal.p000firebaseauthapi;

import b0.l;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class tp implements om {

    /* renamed from: n, reason: collision with root package name */
    private static final String f2166n = "tp";

    /* renamed from: e, reason: collision with root package name */
    private String f2167e;

    /* renamed from: f, reason: collision with root package name */
    private String f2168f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f2169g;

    /* renamed from: h, reason: collision with root package name */
    private String f2170h;

    /* renamed from: i, reason: collision with root package name */
    private String f2171i;

    /* renamed from: j, reason: collision with root package name */
    private jp f2172j;

    /* renamed from: k, reason: collision with root package name */
    private String f2173k;

    /* renamed from: l, reason: collision with root package name */
    private String f2174l;

    /* renamed from: m, reason: collision with root package name */
    private long f2175m;

    public final long a() {
        return this.f2175m;
    }

    public final String b() {
        return this.f2167e;
    }

    public final String c() {
        return this.f2173k;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.om
    public final /* bridge */ /* synthetic */ om d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f2167e = l.a(jSONObject.optString("email", null));
            this.f2168f = l.a(jSONObject.optString("passwordHash", null));
            this.f2169g = Boolean.valueOf(jSONObject.optBoolean("emailVerified", false));
            this.f2170h = l.a(jSONObject.optString("displayName", null));
            this.f2171i = l.a(jSONObject.optString("photoUrl", null));
            this.f2172j = jp.j0(jSONObject.optJSONArray("providerUserInfo"));
            this.f2173k = l.a(jSONObject.optString("idToken", null));
            this.f2174l = l.a(jSONObject.optString("refreshToken", null));
            this.f2175m = jSONObject.optLong("expiresIn", 0L);
            return this;
        } catch (NullPointerException | JSONException e5) {
            throw pq.a(e5, f2166n, str);
        }
    }

    public final String e() {
        return this.f2174l;
    }

    public final List f() {
        jp jpVar = this.f2172j;
        if (jpVar != null) {
            return jpVar.l0();
        }
        return null;
    }
}
