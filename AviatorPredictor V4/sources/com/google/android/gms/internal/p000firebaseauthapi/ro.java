package com.google.android.gms.internal.p000firebaseauthapi;

import org.json.JSONObject;
import w.r;

/* loaded from: classes.dex */
public final class ro implements nm {

    /* renamed from: e, reason: collision with root package name */
    private final String f2103e;

    public ro(String str) {
        this.f2103e = r.e(str);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.nm
    public final String a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.f2103e);
        return jSONObject.toString();
    }
}
