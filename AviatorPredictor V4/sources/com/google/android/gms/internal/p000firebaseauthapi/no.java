package com.google.android.gms.internal.p000firebaseauthapi;

import org.json.JSONObject;
import w.r;

/* loaded from: classes.dex */
public final class no implements nm {

    /* renamed from: e, reason: collision with root package name */
    private final String f1969e = r.e("phone");

    /* renamed from: f, reason: collision with root package name */
    private final String f1970f;

    /* renamed from: g, reason: collision with root package name */
    private final String f1971g;

    /* renamed from: h, reason: collision with root package name */
    private final String f1972h;

    no(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f1970f = r.e(str2);
        this.f1971g = str3;
        this.f1972h = str4;
    }

    public static no b(String str, String str2, String str3) {
        r.e(str3);
        r.e(str2);
        return new no("phone", str, str2, str3, null, null);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.nm
    public final String a() {
        JSONObject jSONObject = new JSONObject();
        this.f1969e.hashCode();
        jSONObject.put("mfaProvider", 1);
        jSONObject.put("mfaPendingCredential", this.f1970f);
        JSONObject jSONObject2 = new JSONObject();
        String str = this.f1971g;
        if (str != null) {
            jSONObject2.put("sessionInfo", str);
        }
        String str2 = this.f1972h;
        if (str2 != null) {
            jSONObject2.put("code", str2);
        }
        jSONObject.put("phoneVerificationInfo", jSONObject2);
        return jSONObject.toString();
    }
}
