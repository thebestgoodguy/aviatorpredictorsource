package com.google.android.gms.internal.p000firebaseauthapi;

import org.json.JSONObject;
import w.r;

/* loaded from: classes.dex */
public final class mp implements nm {

    /* renamed from: e, reason: collision with root package name */
    private final String f1940e;

    /* renamed from: f, reason: collision with root package name */
    private final String f1941f;

    /* renamed from: g, reason: collision with root package name */
    private final String f1942g;

    public mp(String str, String str2, String str3) {
        this.f1940e = r.e(str);
        this.f1941f = str2;
        this.f1942g = str3;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.nm
    public final String a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("oobCode", this.f1940e);
        String str = this.f1941f;
        if (str != null) {
            jSONObject.put("newPassword", str);
        }
        String str2 = this.f1942g;
        if (str2 != null) {
            jSONObject.put("tenantId", str2);
        }
        return jSONObject.toString();
    }
}
