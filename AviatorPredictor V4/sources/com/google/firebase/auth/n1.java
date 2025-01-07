package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.p000firebaseauthapi.cq;

/* loaded from: classes.dex */
public final class n1 extends l0 {
    public static final Parcelable.Creator<n1> CREATOR = new o1();

    /* renamed from: e, reason: collision with root package name */
    private final String f2534e;

    /* renamed from: f, reason: collision with root package name */
    private final String f2535f;

    /* renamed from: g, reason: collision with root package name */
    private final String f2536g;

    /* renamed from: h, reason: collision with root package name */
    private final cq f2537h;

    /* renamed from: i, reason: collision with root package name */
    private final String f2538i;

    /* renamed from: j, reason: collision with root package name */
    private final String f2539j;

    /* renamed from: k, reason: collision with root package name */
    private final String f2540k;

    n1(String str, String str2, String str3, cq cqVar, String str4, String str5, String str6) {
        this.f2534e = com.google.android.gms.internal.p000firebaseauthapi.d2.c(str);
        this.f2535f = str2;
        this.f2536g = str3;
        this.f2537h = cqVar;
        this.f2538i = str4;
        this.f2539j = str5;
        this.f2540k = str6;
    }

    public static n1 m0(cq cqVar) {
        w.r.j(cqVar, "Must specify a non-null webSignInCredential");
        return new n1(null, null, null, cqVar, null, null, null);
    }

    public static n1 n0(String str, String str2, String str3, String str4, String str5) {
        w.r.f(str, "Must specify a non-empty providerId");
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        return new n1(str, str2, str3, null, str4, str5, null);
    }

    public static cq o0(n1 n1Var, String str) {
        w.r.i(n1Var);
        cq cqVar = n1Var.f2537h;
        return cqVar != null ? cqVar : new cq(n1Var.f2535f, n1Var.f2536g, n1Var.f2534e, null, n1Var.f2539j, null, str, n1Var.f2538i, n1Var.f2540k);
    }

    @Override // com.google.firebase.auth.h
    public final String j0() {
        return this.f2534e;
    }

    @Override // com.google.firebase.auth.h
    public final String k0() {
        return this.f2534e;
    }

    @Override // com.google.firebase.auth.h
    public final h l0() {
        return new n1(this.f2534e, this.f2535f, this.f2536g, this.f2537h, this.f2538i, this.f2539j, this.f2540k);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int a5 = x.c.a(parcel);
        x.c.m(parcel, 1, this.f2534e, false);
        x.c.m(parcel, 2, this.f2535f, false);
        x.c.m(parcel, 3, this.f2536g, false);
        x.c.l(parcel, 4, this.f2537h, r6, false);
        x.c.m(parcel, 5, this.f2538i, false);
        x.c.m(parcel, 6, this.f2539j, false);
        x.c.m(parcel, 7, this.f2540k, false);
        x.c.b(parcel, a5);
    }
}
