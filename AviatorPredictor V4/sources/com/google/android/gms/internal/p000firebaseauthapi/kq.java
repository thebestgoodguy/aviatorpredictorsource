package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import org.json.JSONObject;
import w.r;

/* loaded from: classes.dex */
public final class kq implements nm {

    /* renamed from: e, reason: collision with root package name */
    private String f1859e;

    /* renamed from: f, reason: collision with root package name */
    private String f1860f;

    /* renamed from: g, reason: collision with root package name */
    private String f1861g;

    /* renamed from: h, reason: collision with root package name */
    private String f1862h;

    /* renamed from: i, reason: collision with root package name */
    private String f1863i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f1864j;

    private kq() {
    }

    public static kq b(String str, String str2, boolean z4) {
        kq kqVar = new kq();
        kqVar.f1860f = r.e(str);
        kqVar.f1861g = r.e(str2);
        kqVar.f1864j = z4;
        return kqVar;
    }

    public static kq c(String str, String str2, boolean z4) {
        kq kqVar = new kq();
        kqVar.f1859e = r.e(str);
        kqVar.f1862h = r.e(str2);
        kqVar.f1864j = z4;
        return kqVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.nm
    public final String a() {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(this.f1862h)) {
            jSONObject.put("sessionInfo", this.f1860f);
            str = this.f1861g;
            str2 = "code";
        } else {
            jSONObject.put("phoneNumber", this.f1859e);
            str = this.f1862h;
            str2 = "temporaryProof";
        }
        jSONObject.put(str2, str);
        String str3 = this.f1863i;
        if (str3 != null) {
            jSONObject.put("idToken", str3);
        }
        if (!this.f1864j) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }

    public final void d(String str) {
        this.f1863i = str;
    }
}
