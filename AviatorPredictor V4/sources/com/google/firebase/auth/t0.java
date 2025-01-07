package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p000firebaseauthapi.cq;

/* loaded from: classes.dex */
public class t0 extends h {
    public static final Parcelable.Creator<t0> CREATOR = new h1();

    /* renamed from: e, reason: collision with root package name */
    private final String f2573e;

    t0(String str) {
        this.f2573e = w.r.e(str);
    }

    public static cq m0(t0 t0Var, String str) {
        w.r.i(t0Var);
        return new cq(null, null, t0Var.j0(), null, null, t0Var.f2573e, str, null, null);
    }

    @Override // com.google.firebase.auth.h
    public String j0() {
        return "playgames.google.com";
    }

    @Override // com.google.firebase.auth.h
    public String k0() {
        return "playgames.google.com";
    }

    @Override // com.google.firebase.auth.h
    public final h l0() {
        return new t0(this.f2573e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = x.c.a(parcel);
        x.c.m(parcel, 1, this.f2573e, false);
        x.c.b(parcel, a5);
    }
}
