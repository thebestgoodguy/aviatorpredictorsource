package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p000firebaseauthapi.cq;

/* loaded from: classes.dex */
public class v0 extends h {
    public static final Parcelable.Creator<v0> CREATOR = new i1();

    /* renamed from: e, reason: collision with root package name */
    private String f2578e;

    /* renamed from: f, reason: collision with root package name */
    private String f2579f;

    v0(String str, String str2) {
        this.f2578e = w.r.e(str);
        this.f2579f = w.r.e(str2);
    }

    public static cq m0(v0 v0Var, String str) {
        w.r.i(v0Var);
        return new cq(null, v0Var.f2578e, v0Var.j0(), null, v0Var.f2579f, null, str, null, null);
    }

    @Override // com.google.firebase.auth.h
    public String j0() {
        return "twitter.com";
    }

    @Override // com.google.firebase.auth.h
    public String k0() {
        return "twitter.com";
    }

    @Override // com.google.firebase.auth.h
    public final h l0() {
        return new v0(this.f2578e, this.f2579f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = x.c.a(parcel);
        x.c.m(parcel, 1, this.f2578e, false);
        x.c.m(parcel, 2, this.f2579f, false);
        x.c.b(parcel, a5);
    }
}
