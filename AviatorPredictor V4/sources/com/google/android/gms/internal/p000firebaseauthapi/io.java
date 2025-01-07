package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.firebase.auth.f;
import com.google.firebase.auth.j;
import org.json.JSONObject;
import w.r;
import z.a;

/* loaded from: classes.dex */
public final class io implements nm {

    /* renamed from: h, reason: collision with root package name */
    private static final a f1780h = new a(io.class.getSimpleName(), new String[0]);

    /* renamed from: e, reason: collision with root package name */
    private final String f1781e;

    /* renamed from: f, reason: collision with root package name */
    private final String f1782f;

    /* renamed from: g, reason: collision with root package name */
    private final String f1783g;

    public io(j jVar, String str) {
        this.f1781e = r.e(jVar.o0());
        this.f1782f = r.e(jVar.q0());
        this.f1783g = str;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.nm
    public final String a() {
        f c5 = f.c(this.f1782f);
        String a5 = c5 != null ? c5.a() : null;
        String d5 = c5 != null ? c5.d() : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.f1781e);
        if (a5 != null) {
            jSONObject.put("oobCode", a5);
        }
        if (d5 != null) {
            jSONObject.put("tenantId", d5);
        }
        String str = this.f1783g;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        return jSONObject.toString();
    }
}
