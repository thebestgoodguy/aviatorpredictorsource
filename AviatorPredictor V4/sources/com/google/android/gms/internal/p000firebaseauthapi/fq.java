package com.google.android.gms.internal.p000firebaseauthapi;

import org.json.JSONObject;
import w.r;

/* loaded from: classes.dex */
public final class fq implements nm {

    /* renamed from: e, reason: collision with root package name */
    private final String f1666e;

    /* renamed from: f, reason: collision with root package name */
    private final String f1667f;

    public fq(String str, String str2) {
        this.f1666e = r.e(str);
        this.f1667f = str2;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.nm
    public final String a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token", this.f1666e);
        jSONObject.put("returnSecureToken", true);
        String str = this.f1667f;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
