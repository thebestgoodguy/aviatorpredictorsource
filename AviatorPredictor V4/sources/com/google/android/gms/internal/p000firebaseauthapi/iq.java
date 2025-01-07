package com.google.android.gms.internal.p000firebaseauthapi;

import org.json.JSONObject;
import w.r;

/* loaded from: classes.dex */
public final class iq implements nm {

    /* renamed from: e, reason: collision with root package name */
    private final String f1784e;

    /* renamed from: f, reason: collision with root package name */
    private final String f1785f;

    /* renamed from: g, reason: collision with root package name */
    private final String f1786g;

    public iq(String str, String str2, String str3) {
        this.f1784e = r.e(str);
        this.f1785f = r.e(str2);
        this.f1786g = str3;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.nm
    public final String a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.f1784e);
        jSONObject.put("password", this.f1785f);
        jSONObject.put("returnSecureToken", true);
        String str = this.f1786g;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
