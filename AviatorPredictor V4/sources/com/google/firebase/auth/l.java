package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p000firebaseauthapi.cq;

/* loaded from: classes.dex */
public class l extends h {
    public static final Parcelable.Creator<l> CREATOR = new q1();

    /* renamed from: e, reason: collision with root package name */
    private final String f2518e;

    l(String str) {
        this.f2518e = w.r.e(str);
    }

    public static cq m0(l lVar, String str) {
        w.r.i(lVar);
        return new cq(null, lVar.f2518e, lVar.j0(), null, null, null, str, null, null);
    }

    @Override // com.google.firebase.auth.h
    public String j0() {
        return "facebook.com";
    }

    @Override // com.google.firebase.auth.h
    public String k0() {
        return "facebook.com";
    }

    @Override // com.google.firebase.auth.h
    public final h l0() {
        return new l(this.f2518e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = x.c.a(parcel);
        x.c.m(parcel, 1, this.f2518e, false);
        x.c.b(parcel, a5);
    }
}
