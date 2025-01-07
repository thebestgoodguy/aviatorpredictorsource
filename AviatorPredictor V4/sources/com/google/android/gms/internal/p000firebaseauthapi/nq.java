package com.google.android.gms.internal.p000firebaseauthapi;

import org.json.JSONObject;
import w.r;

/* loaded from: classes.dex */
public final class nq implements nm {

    /* renamed from: e, reason: collision with root package name */
    private final String f1978e;

    /* renamed from: f, reason: collision with root package name */
    private final String f1979f;

    public nq(String str, String str2) {
        this.f1978e = r.e(str);
        this.f1979f = r.e(str2);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.nm
    public final String a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.f1978e);
        jSONObject.put("mfaEnrollmentId", this.f1979f);
        return jSONObject.toString();
    }
}
