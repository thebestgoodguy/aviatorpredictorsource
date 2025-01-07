package com.google.android.gms.internal.p000firebaseauthapi;

import org.json.JSONObject;
import w.r;

/* loaded from: classes.dex */
public final class ho implements nm {

    /* renamed from: e, reason: collision with root package name */
    private final String f1731e;

    public ho(String str) {
        this.f1731e = r.e(str);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.nm
    public final String a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.f1731e);
        return jSONObject.toString();
    }
}
