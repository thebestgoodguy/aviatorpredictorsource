package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import b0.l;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class jq implements om {

    /* renamed from: n, reason: collision with root package name */
    private static final String f1822n = "jq";

    /* renamed from: e, reason: collision with root package name */
    private String f1823e;

    /* renamed from: f, reason: collision with root package name */
    private String f1824f;

    /* renamed from: g, reason: collision with root package name */
    private String f1825g;

    /* renamed from: h, reason: collision with root package name */
    private String f1826h;

    /* renamed from: i, reason: collision with root package name */
    private String f1827i;

    /* renamed from: j, reason: collision with root package name */
    private String f1828j;

    /* renamed from: k, reason: collision with root package name */
    private long f1829k;

    /* renamed from: l, reason: collision with root package name */
    private List f1830l;

    /* renamed from: m, reason: collision with root package name */
    private String f1831m;

    public final long a() {
        return this.f1829k;
    }

    public final String b() {
        return this.f1826h;
    }

    public final String c() {
        return this.f1831m;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.om
    public final /* bridge */ /* synthetic */ om d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f1823e = l.a(jSONObject.optString("localId", null));
            this.f1824f = l.a(jSONObject.optString("email", null));
            this.f1825g = l.a(jSONObject.optString("displayName", null));
            this.f1826h = l.a(jSONObject.optString("idToken", null));
            this.f1827i = l.a(jSONObject.optString("photoUrl", null));
            this.f1828j = l.a(jSONObject.optString("refreshToken", null));
            this.f1829k = jSONObject.optLong("expiresIn", 0L);
            this.f1830l = fp.o0(jSONObject.optJSONArray("mfaInfo"));
            this.f1831m = jSONObject.optString("mfaPendingCredential", null);
            return this;
        } catch (NullPointerException | JSONException e5) {
            throw pq.a(e5, f1822n, str);
        }
    }

    public final String e() {
        return this.f1828j;
    }

    public final List f() {
        return this.f1830l;
    }

    public final boolean g() {
        return !TextUtils.isEmpty(this.f1831m);
    }
}
