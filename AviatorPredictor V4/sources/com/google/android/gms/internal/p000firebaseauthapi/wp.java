package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import org.json.JSONObject;
import w.r;

/* loaded from: classes.dex */
public final class wp implements nm {

    /* renamed from: e, reason: collision with root package name */
    private final String f2300e;

    /* renamed from: f, reason: collision with root package name */
    private final String f2301f = r.e("phone");

    /* renamed from: g, reason: collision with root package name */
    private final String f2302g;

    /* renamed from: h, reason: collision with root package name */
    private final String f2303h;

    /* renamed from: i, reason: collision with root package name */
    private final String f2304i;

    /* renamed from: j, reason: collision with root package name */
    private final String f2305j;

    /* renamed from: k, reason: collision with root package name */
    private co f2306k;

    private wp(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f2300e = r.e(str);
        this.f2302g = str3;
        this.f2303h = str4;
        this.f2304i = str5;
        this.f2305j = str6;
    }

    public static wp b(String str, String str2, String str3, String str4, String str5) {
        r.e(str2);
        return new wp(str, "phone", str2, str3, str4, str5);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.nm
    public final String a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.f2300e);
        this.f2301f.hashCode();
        jSONObject.put("mfaProvider", 1);
        if (this.f2302g != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("phoneNumber", this.f2302g);
            if (!TextUtils.isEmpty(this.f2304i)) {
                jSONObject2.put("recaptchaToken", this.f2304i);
            }
            if (!TextUtils.isEmpty(this.f2305j)) {
                jSONObject2.put("safetyNetToken", this.f2305j);
            }
            co coVar = this.f2306k;
            if (coVar != null) {
                jSONObject2.put("autoRetrievalInfo", coVar.a());
            }
            jSONObject.put("phoneEnrollmentInfo", jSONObject2);
        }
        return jSONObject.toString();
    }

    public final String c() {
        return this.f2303h;
    }

    public final void d(co coVar) {
        this.f2306k = coVar;
    }
}
