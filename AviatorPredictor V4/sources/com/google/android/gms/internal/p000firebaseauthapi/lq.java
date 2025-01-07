package com.google.android.gms.internal.p000firebaseauthapi;

import b0.l;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class lq implements om {

    /* renamed from: l, reason: collision with root package name */
    private static final String f1894l = "lq";

    /* renamed from: e, reason: collision with root package name */
    private String f1895e;

    /* renamed from: f, reason: collision with root package name */
    private String f1896f;

    /* renamed from: g, reason: collision with root package name */
    private long f1897g;

    /* renamed from: h, reason: collision with root package name */
    private String f1898h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1899i;

    /* renamed from: j, reason: collision with root package name */
    private String f1900j;

    /* renamed from: k, reason: collision with root package name */
    private String f1901k;

    public final long a() {
        return this.f1897g;
    }

    public final String b() {
        return this.f1895e;
    }

    public final String c() {
        return this.f1901k;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.om
    public final /* bridge */ /* synthetic */ om d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f1895e = l.a(jSONObject.optString("idToken", null));
            this.f1896f = l.a(jSONObject.optString("refreshToken", null));
            this.f1897g = jSONObject.optLong("expiresIn", 0L);
            this.f1898h = l.a(jSONObject.optString("localId", null));
            this.f1899i = jSONObject.optBoolean("isNewUser", false);
            this.f1900j = l.a(jSONObject.optString("temporaryProof", null));
            this.f1901k = l.a(jSONObject.optString("phoneNumber", null));
            return this;
        } catch (NullPointerException | JSONException e5) {
            throw pq.a(e5, f1894l, str);
        }
    }

    public final String e() {
        return this.f1896f;
    }

    public final String f() {
        return this.f1900j;
    }

    public final boolean g() {
        return this.f1899i;
    }
}
