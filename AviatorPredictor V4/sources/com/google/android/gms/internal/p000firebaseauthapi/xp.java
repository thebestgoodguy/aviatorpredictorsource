package com.google.android.gms.internal.p000firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class xp implements om {

    /* renamed from: f, reason: collision with root package name */
    private static final String f2347f = "xp";

    /* renamed from: e, reason: collision with root package name */
    private String f2348e;

    public final String a() {
        return this.f2348e;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.om
    public final /* bridge */ /* synthetic */ om d(String str) {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("phoneSessionInfo");
            if (optJSONObject != null) {
                this.f2348e = d2.a(optJSONObject.optString("sessionInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e5) {
            throw pq.a(e5, f2347f, str);
        }
    }
}
