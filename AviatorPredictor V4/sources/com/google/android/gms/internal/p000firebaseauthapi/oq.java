package com.google.android.gms.internal.p000firebaseauthapi;

import b0.l;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class oq implements om {

    /* renamed from: g, reason: collision with root package name */
    private static final String f2003g = "oq";

    /* renamed from: e, reason: collision with root package name */
    private String f2004e;

    /* renamed from: f, reason: collision with root package name */
    private String f2005f;

    public final String a() {
        return this.f2004e;
    }

    public final String b() {
        return this.f2005f;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.om
    public final /* bridge */ /* synthetic */ om d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f2004e = l.a(jSONObject.optString("idToken", null));
            this.f2005f = l.a(jSONObject.optString("refreshToken", null));
            return this;
        } catch (NullPointerException | JSONException e5) {
            throw pq.a(e5, f2003g, str);
        }
    }
}
