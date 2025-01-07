package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p000firebaseauthapi.cq;

/* loaded from: classes.dex */
public class c0 extends h {
    public static final Parcelable.Creator<c0> CREATOR = new h2();

    /* renamed from: e, reason: collision with root package name */
    private String f2469e;

    c0(String str) {
        this.f2469e = w.r.e(str);
    }

    public static cq m0(c0 c0Var, String str) {
        w.r.i(c0Var);
        return new cq(null, c0Var.f2469e, c0Var.j0(), null, null, null, str, null, null);
    }

    @Override // com.google.firebase.auth.h
    public String j0() {
        return "github.com";
    }

    @Override // com.google.firebase.auth.h
    public String k0() {
        return "github.com";
    }

    @Override // com.google.firebase.auth.h
    public final h l0() {
        return new c0(this.f2469e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = x.c.a(parcel);
        x.c.m(parcel, 1, this.f2469e, false);
        x.c.b(parcel, a5);
    }
}
