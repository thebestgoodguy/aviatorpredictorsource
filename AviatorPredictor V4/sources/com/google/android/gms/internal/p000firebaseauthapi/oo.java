package com.google.android.gms.internal.p000firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class oo implements om {

    /* renamed from: g, reason: collision with root package name */
    private static final String f2000g = "oo";

    /* renamed from: e, reason: collision with root package name */
    private String f2001e;

    /* renamed from: f, reason: collision with root package name */
    private String f2002f;

    public final String a() {
        return this.f2001e;
    }

    public final String b() {
        return this.f2002f;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.om
    public final /* bridge */ /* synthetic */ om d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f2001e = jSONObject.optString("idToken", null);
            this.f2002f = jSONObject.optString("refreshToken", null);
            return this;
        } catch (NullPointerException | JSONException e5) {
            throw pq.a(e5, f2000g, str);
        }
    }
}
