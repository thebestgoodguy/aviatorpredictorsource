package com.google.android.gms.internal.p000firebaseauthapi;

import org.json.JSONObject;
import w.r;

/* loaded from: classes.dex */
public final class qo implements nm {

    /* renamed from: e, reason: collision with root package name */
    private final String f2076e = po.REFRESH_TOKEN.toString();

    /* renamed from: f, reason: collision with root package name */
    private final String f2077f;

    public qo(String str) {
        this.f2077f = r.e(str);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.nm
    public final String a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("grantType", this.f2076e);
        jSONObject.put("refreshToken", this.f2077f);
        return jSONObject.toString();
    }
}
