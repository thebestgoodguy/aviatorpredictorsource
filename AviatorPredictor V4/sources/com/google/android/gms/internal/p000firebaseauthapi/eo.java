package com.google.android.gms.internal.p000firebaseauthapi;

import org.json.JSONObject;
import w.r;

/* loaded from: classes.dex */
public final class eo implements nm {

    /* renamed from: e, reason: collision with root package name */
    private final String f1572e;

    /* renamed from: f, reason: collision with root package name */
    private final String f1573f = "http://localhost";

    /* renamed from: g, reason: collision with root package name */
    private final String f1574g;

    public eo(String str, String str2) {
        this.f1572e = r.e(str);
        this.f1574g = str2;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.nm
    public final String a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("identifier", this.f1572e);
        jSONObject.put("continueUri", this.f1573f);
        String str = this.f1574g;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
