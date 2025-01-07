package com.google.android.gms.internal.p000firebaseauthapi;

import b0.l;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class rp implements om {

    /* renamed from: f, reason: collision with root package name */
    private static final String f2104f = "rp";

    /* renamed from: e, reason: collision with root package name */
    private String f2105e;

    public final String a() {
        return this.f2105e;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.om
    public final /* bridge */ /* synthetic */ om d(String str) {
        try {
            this.f2105e = l.a(new JSONObject(str).optString("sessionInfo", null));
            return this;
        } catch (NullPointerException | JSONException e5) {
            throw pq.a(e5, f2104f, str);
        }
    }
}
