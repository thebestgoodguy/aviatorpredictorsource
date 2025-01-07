package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;
import w.r;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class pp extends a implements nm {
    public static final Parcelable.Creator<pp> CREATOR = new qp();

    /* renamed from: e, reason: collision with root package name */
    private final String f2039e;

    /* renamed from: f, reason: collision with root package name */
    private final long f2040f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f2041g;

    /* renamed from: h, reason: collision with root package name */
    private final String f2042h;

    /* renamed from: i, reason: collision with root package name */
    private final String f2043i;

    /* renamed from: j, reason: collision with root package name */
    private final String f2044j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f2045k;

    /* renamed from: l, reason: collision with root package name */
    private final String f2046l;

    /* renamed from: m, reason: collision with root package name */
    private co f2047m;

    public pp(String str, long j4, boolean z4, String str2, String str3, String str4, boolean z5, String str5) {
        this.f2039e = r.e(str);
        this.f2040f = j4;
        this.f2041g = z4;
        this.f2042h = str2;
        this.f2043i = str3;
        this.f2044j = str4;
        this.f2045k = z5;
        this.f2046l = str5;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.nm
    public final String a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("phoneNumber", this.f2039e);
        String str = this.f2043i;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = this.f2044j;
        if (str2 != null) {
            jSONObject.put("recaptchaToken", str2);
        }
        co coVar = this.f2047m;
        if (coVar != null) {
            jSONObject.put("autoRetrievalInfo", coVar.a());
        }
        String str3 = this.f2046l;
        if (str3 != null) {
            jSONObject.put("safetyNetToken", str3);
        }
        return jSONObject.toString();
    }

    public final long j0() {
        return this.f2040f;
    }

    public final String k0() {
        return this.f2042h;
    }

    public final String l0() {
        return this.f2039e;
    }

    public final void m0(co coVar) {
        this.f2047m = coVar;
    }

    public final boolean n0() {
        return this.f2041g;
    }

    public final boolean o0() {
        return this.f2045k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int a5 = c.a(parcel);
        c.m(parcel, 1, this.f2039e, false);
        c.j(parcel, 2, this.f2040f);
        c.c(parcel, 3, this.f2041g);
        c.m(parcel, 4, this.f2042h, false);
        c.m(parcel, 5, this.f2043i, false);
        c.m(parcel, 6, this.f2044j, false);
        c.c(parcel, 7, this.f2045k);
        c.m(parcel, 8, this.f2046l, false);
        c.b(parcel, a5);
    }
}
