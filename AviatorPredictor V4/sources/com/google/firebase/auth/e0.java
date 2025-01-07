package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p000firebaseauthapi.cq;

/* loaded from: classes.dex */
public class e0 extends h {
    public static final Parcelable.Creator<e0> CREATOR = new a1();

    /* renamed from: e, reason: collision with root package name */
    private final String f2489e;

    /* renamed from: f, reason: collision with root package name */
    private final String f2490f;

    e0(String str, String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("idToken cannot be empty");
        }
        if (str2 != null && str2.length() == 0) {
            throw new IllegalArgumentException("accessToken cannot be empty");
        }
        this.f2489e = str;
        this.f2490f = str2;
    }

    public static cq m0(e0 e0Var, String str) {
        w.r.i(e0Var);
        return new cq(e0Var.f2489e, e0Var.f2490f, e0Var.j0(), null, null, null, str, null, null);
    }

    @Override // com.google.firebase.auth.h
    public String j0() {
        return "google.com";
    }

    @Override // com.google.firebase.auth.h
    public String k0() {
        return "google.com";
    }

    @Override // com.google.firebase.auth.h
    public final h l0() {
        return new e0(this.f2489e, this.f2490f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = x.c.a(parcel);
        x.c.m(parcel, 1, this.f2489e, false);
        x.c.m(parcel, 2, this.f2490f, false);
        x.c.b(parcel, a5);
    }
}
