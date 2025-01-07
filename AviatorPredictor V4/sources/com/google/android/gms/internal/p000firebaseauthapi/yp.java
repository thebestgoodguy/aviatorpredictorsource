package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import org.json.JSONObject;
import w.r;

/* loaded from: classes.dex */
public final class yp implements nm {

    /* renamed from: e, reason: collision with root package name */
    private final String f2397e = r.e("phone");

    /* renamed from: f, reason: collision with root package name */
    private final String f2398f;

    /* renamed from: g, reason: collision with root package name */
    private final String f2399g;

    /* renamed from: h, reason: collision with root package name */
    private final String f2400h;

    /* renamed from: i, reason: collision with root package name */
    private final String f2401i;

    /* renamed from: j, reason: collision with root package name */
    private final String f2402j;

    /* renamed from: k, reason: collision with root package name */
    private final String f2403k;

    /* renamed from: l, reason: collision with root package name */
    private co f2404l;

    private yp(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f2398f = r.e(str2);
        this.f2399g = r.e(str3);
        this.f2401i = str4;
        this.f2400h = str5;
        this.f2402j = str6;
        this.f2403k = str7;
    }

    public static yp b(String str, String str2, String str3, String str4, String str5, String str6) {
        r.e(str3);
        return new yp("phone", str, str2, str3, str4, str5, str6);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.nm
    public final String a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mfaPendingCredential", this.f2398f);
        jSONObject.put("mfaEnrollmentId", this.f2399g);
        this.f2397e.hashCode();
        jSONObject.put("mfaProvider", 1);
        if (this.f2401i != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("phoneNumber", this.f2401i);
            if (!TextUtils.isEmpty(this.f2402j)) {
                jSONObject2.put("recaptchaToken", this.f2402j);
            }
            if (!TextUtils.isEmpty(this.f2403k)) {
                jSONObject2.put("safetyNetToken", this.f2403k);
            }
            co coVar = this.f2404l;
            if (coVar != null) {
                jSONObject2.put("autoRetrievalInfo", coVar.a());
            }
            jSONObject.put("phoneSignInInfo", jSONObject2);
        }
        return jSONObject.toString();
    }

    public final String c() {
        return this.f2400h;
    }

    public final void d(co coVar) {
        this.f2404l = coVar;
    }
}
