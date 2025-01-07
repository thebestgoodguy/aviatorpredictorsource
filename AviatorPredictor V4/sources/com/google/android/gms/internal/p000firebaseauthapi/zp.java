package com.google.android.gms.internal.p000firebaseauthapi;

import b0.l;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zp implements om {

    /* renamed from: f, reason: collision with root package name */
    private static final String f2446f = "zp";

    /* renamed from: e, reason: collision with root package name */
    private String f2447e;

    public final String a() {
        return this.f2447e;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.om
    public final /* bridge */ /* synthetic */ om d(String str) {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("phoneResponseInfo");
            if (optJSONObject != null) {
                this.f2447e = l.a(optJSONObject.optString("sessionInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e5) {
            throw pq.a(e5, f2446f, str);
        }
    }
}
