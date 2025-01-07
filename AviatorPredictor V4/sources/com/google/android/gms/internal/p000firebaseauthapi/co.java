package com.google.android.gms.internal.p000firebaseauthapi;

import org.json.JSONObject;
import w.r;

/* loaded from: classes.dex */
public final class co {

    /* renamed from: a, reason: collision with root package name */
    private final String f1493a;

    public co(String str) {
        this.f1493a = r.e(str);
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appSignatureHash", this.f1493a);
        return jSONObject;
    }
}
