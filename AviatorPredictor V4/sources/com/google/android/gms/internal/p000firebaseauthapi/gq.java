package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import b0.l;
import org.json.JSONException;
import org.json.JSONObject;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class gq extends a implements om<gq> {

    /* renamed from: e, reason: collision with root package name */
    private String f1686e;

    /* renamed from: f, reason: collision with root package name */
    private String f1687f;

    /* renamed from: g, reason: collision with root package name */
    private long f1688g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1689h;

    /* renamed from: i, reason: collision with root package name */
    private static final String f1685i = gq.class.getSimpleName();
    public static final Parcelable.Creator<gq> CREATOR = new hq();

    public gq() {
    }

    gq(String str, String str2, long j4, boolean z4) {
        this.f1686e = str;
        this.f1687f = str2;
        this.f1688g = j4;
        this.f1689h = z4;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.om
    public final /* bridge */ /* synthetic */ om d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f1686e = l.a(jSONObject.optString("idToken", null));
            this.f1687f = l.a(jSONObject.optString("refreshToken", null));
            this.f1688g = jSONObject.optLong("expiresIn", 0L);
            this.f1689h = jSONObject.optBoolean("isNewUser", false);
            return this;
        } catch (NullPointerException | JSONException e5) {
            throw pq.a(e5, f1685i, str);
        }
    }

    public final long j0() {
        return this.f1688g;
    }

    public final String k0() {
        return this.f1686e;
    }

    public final String l0() {
        return this.f1687f;
    }

    public final boolean m0() {
        return this.f1689h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = c.a(parcel);
        c.m(parcel, 2, this.f1686e, false);
        c.m(parcel, 3, this.f1687f, false);
        c.j(parcel, 4, this.f1688g);
        c.c(parcel, 5, this.f1689h);
        c.b(parcel, a5);
    }
}
