package com.google.android.gms.internal.p000firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class mo implements om {

    /* renamed from: g, reason: collision with root package name */
    private static final String f1937g = "mo";

    /* renamed from: e, reason: collision with root package name */
    private String f1938e;

    /* renamed from: f, reason: collision with root package name */
    private String f1939f;

    public final String a() {
        return this.f1938e;
    }

    public final String b() {
        return this.f1939f;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.om
    public final /* bridge */ /* synthetic */ om d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f1938e = jSONObject.optString("idToken", null);
            this.f1939f = jSONObject.optString("refreshToken", null);
            return this;
        } catch (NullPointerException | JSONException e5) {
            throw pq.a(e5, f1937g, str);
        }
    }
}
