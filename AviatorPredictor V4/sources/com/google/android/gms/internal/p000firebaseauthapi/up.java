package com.google.android.gms.internal.p000firebaseauthapi;

import org.json.JSONObject;
import w.r;

/* loaded from: classes.dex */
public final class up implements nm {

    /* renamed from: e, reason: collision with root package name */
    private String f2215e;

    /* renamed from: f, reason: collision with root package name */
    private String f2216f;

    /* renamed from: g, reason: collision with root package name */
    private final String f2217g;

    public up(String str) {
        this.f2217g = str;
    }

    public up(String str, String str2, String str3, String str4) {
        this.f2215e = r.e(str);
        this.f2216f = r.e(str2);
        this.f2217g = str4;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.nm
    public final String a() {
        JSONObject jSONObject = new JSONObject();
        String str = this.f2215e;
        if (str != null) {
            jSONObject.put("email", str);
        }
        String str2 = this.f2216f;
        if (str2 != null) {
            jSONObject.put("password", str2);
        }
        String str3 = this.f2217g;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        return jSONObject.toString();
    }
}
