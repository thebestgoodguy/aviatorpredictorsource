package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import b0.l;
import com.google.firebase.auth.n1;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class eq implements om {

    /* renamed from: x, reason: collision with root package name */
    private static final String f1580x = "eq";

    /* renamed from: e, reason: collision with root package name */
    private boolean f1581e;

    /* renamed from: f, reason: collision with root package name */
    private String f1582f;

    /* renamed from: g, reason: collision with root package name */
    private String f1583g;

    /* renamed from: h, reason: collision with root package name */
    private long f1584h;

    /* renamed from: i, reason: collision with root package name */
    private String f1585i;

    /* renamed from: j, reason: collision with root package name */
    private String f1586j;

    /* renamed from: k, reason: collision with root package name */
    private String f1587k;

    /* renamed from: l, reason: collision with root package name */
    private String f1588l;

    /* renamed from: m, reason: collision with root package name */
    private String f1589m;

    /* renamed from: n, reason: collision with root package name */
    private String f1590n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f1591o;

    /* renamed from: p, reason: collision with root package name */
    private String f1592p;

    /* renamed from: q, reason: collision with root package name */
    private String f1593q;

    /* renamed from: r, reason: collision with root package name */
    private String f1594r;

    /* renamed from: s, reason: collision with root package name */
    private String f1595s;

    /* renamed from: t, reason: collision with root package name */
    private String f1596t;

    /* renamed from: u, reason: collision with root package name */
    private String f1597u;

    /* renamed from: v, reason: collision with root package name */
    private List f1598v;

    /* renamed from: w, reason: collision with root package name */
    private String f1599w;

    public final long a() {
        return this.f1584h;
    }

    public final n1 b() {
        if (TextUtils.isEmpty(this.f1592p) && TextUtils.isEmpty(this.f1593q)) {
            return null;
        }
        return n1.n0(this.f1589m, this.f1593q, this.f1592p, this.f1596t, this.f1594r);
    }

    public final String c() {
        return this.f1586j;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.om
    public final /* bridge */ /* synthetic */ om d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f1581e = jSONObject.optBoolean("needConfirmation", false);
            jSONObject.optBoolean("needEmail", false);
            this.f1582f = l.a(jSONObject.optString("idToken", null));
            this.f1583g = l.a(jSONObject.optString("refreshToken", null));
            this.f1584h = jSONObject.optLong("expiresIn", 0L);
            this.f1585i = l.a(jSONObject.optString("localId", null));
            this.f1586j = l.a(jSONObject.optString("email", null));
            this.f1587k = l.a(jSONObject.optString("displayName", null));
            this.f1588l = l.a(jSONObject.optString("photoUrl", null));
            this.f1589m = l.a(jSONObject.optString("providerId", null));
            this.f1590n = l.a(jSONObject.optString("rawUserInfo", null));
            this.f1591o = jSONObject.optBoolean("isNewUser", false);
            this.f1592p = jSONObject.optString("oauthAccessToken", null);
            this.f1593q = jSONObject.optString("oauthIdToken", null);
            this.f1595s = l.a(jSONObject.optString("errorMessage", null));
            this.f1596t = l.a(jSONObject.optString("pendingToken", null));
            this.f1597u = l.a(jSONObject.optString("tenantId", null));
            this.f1598v = fp.o0(jSONObject.optJSONArray("mfaInfo"));
            this.f1599w = l.a(jSONObject.optString("mfaPendingCredential", null));
            this.f1594r = l.a(jSONObject.optString("oauthTokenSecret", null));
            return this;
        } catch (NullPointerException | JSONException e5) {
            throw pq.a(e5, f1580x, str);
        }
    }

    public final String e() {
        return this.f1595s;
    }

    public final String f() {
        return this.f1582f;
    }

    public final String g() {
        return this.f1599w;
    }

    public final String h() {
        return this.f1589m;
    }

    public final String i() {
        return this.f1590n;
    }

    public final String j() {
        return this.f1583g;
    }

    public final String k() {
        return this.f1597u;
    }

    public final List l() {
        return this.f1598v;
    }

    public final boolean m() {
        return !TextUtils.isEmpty(this.f1599w);
    }

    public final boolean n() {
        return this.f1581e;
    }

    public final boolean o() {
        return this.f1591o;
    }

    public final boolean p() {
        return this.f1581e || !TextUtils.isEmpty(this.f1595s);
    }
}
