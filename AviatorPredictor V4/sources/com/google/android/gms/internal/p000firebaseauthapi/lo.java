package com.google.android.gms.internal.p000firebaseauthapi;

import org.json.JSONObject;
import w.r;

/* loaded from: classes.dex */
public final class lo implements nm {

    /* renamed from: e, reason: collision with root package name */
    private final String f1887e = r.e("phone");

    /* renamed from: f, reason: collision with root package name */
    private String f1888f;

    /* renamed from: g, reason: collision with root package name */
    private final String f1889g;

    /* renamed from: h, reason: collision with root package name */
    private final String f1890h;

    /* renamed from: i, reason: collision with root package name */
    private final String f1891i;

    lo(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f1888f = r.e(str2);
        this.f1889g = str3;
        this.f1891i = str4;
        this.f1890h = str7;
    }

    public static lo b(String str, String str2, String str3, String str4) {
        r.e(str3);
        r.e(str2);
        return new lo("phone", str, str2, str3, null, null, str4);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.nm
    public final String a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.f1888f);
        this.f1887e.hashCode();
        jSONObject.put("mfaProvider", 1);
        String str = this.f1890h;
        if (str != null) {
            jSONObject.put("displayName", str);
        }
        JSONObject jSONObject2 = new JSONObject();
        String str2 = this.f1889g;
        if (str2 != null) {
            jSONObject2.put("sessionInfo", str2);
        }
        String str3 = this.f1891i;
        if (str3 != null) {
            jSONObject2.put("code", str3);
        }
        jSONObject.put("phoneVerificationInfo", jSONObject2);
        return jSONObject.toString();
    }

    public final lo c(String str) {
        this.f1888f = str;
        return this;
    }
}
