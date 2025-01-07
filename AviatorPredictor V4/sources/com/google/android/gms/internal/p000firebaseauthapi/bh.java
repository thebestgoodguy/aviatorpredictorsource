package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.n0;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class bh extends a {
    public static final Parcelable.Creator<bh> CREATOR = new ch();

    /* renamed from: e, reason: collision with root package name */
    private final String f1424e;

    /* renamed from: f, reason: collision with root package name */
    private final n0 f1425f;

    public bh(String str, n0 n0Var) {
        this.f1424e = str;
        this.f1425f = n0Var;
    }

    public final n0 j0() {
        return this.f1425f;
    }

    public final String k0() {
        return this.f1424e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int a5 = c.a(parcel);
        c.m(parcel, 1, this.f1424e, false);
        c.l(parcel, 2, this.f1425f, r6, false);
        c.b(parcel, a5);
    }
}
