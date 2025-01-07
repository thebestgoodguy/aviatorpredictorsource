package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class jo implements om {

    /* renamed from: m, reason: collision with root package name */
    private static final String f1812m = "jo";

    /* renamed from: e, reason: collision with root package name */
    private String f1813e;

    /* renamed from: f, reason: collision with root package name */
    private String f1814f;

    /* renamed from: g, reason: collision with root package name */
    private String f1815g;

    /* renamed from: h, reason: collision with root package name */
    private String f1816h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1817i;

    /* renamed from: j, reason: collision with root package name */
    private long f1818j;

    /* renamed from: k, reason: collision with root package name */
    private List f1819k;

    /* renamed from: l, reason: collision with root package name */
    private String f1820l;

    public final long a() {
        return this.f1818j;
    }

    public final String b() {
        return this.f1815g;
    }

    public final String c() {
        return this.f1820l;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.om
    public final /* bridge */ /* synthetic */ om d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f1813e = jSONObject.optString("localId", null);
            this.f1814f = jSONObject.optString("email", null);
            this.f1815g = jSONObject.optString("idToken", null);
            this.f1816h = jSONObject.optString("refreshToken", null);
            this.f1817i = jSONObject.optBoolean("isNewUser", false);
            this.f1818j = jSONObject.optLong("expiresIn", 0L);
            this.f1819k = fp.o0(jSONObject.optJSONArray("mfaInfo"));
            this.f1820l = jSONObject.optString("mfaPendingCredential", null);
            return this;
        } catch (NullPointerException | JSONException e5) {
            throw pq.a(e5, f1812m, str);
        }
    }

    public final String e() {
        return this.f1816h;
    }

    public final List f() {
        return this.f1819k;
    }

    public final boolean g() {
        return !TextUtils.isEmpty(this.f1820l);
    }

    public final boolean h() {
        return this.f1817i;
    }
}
