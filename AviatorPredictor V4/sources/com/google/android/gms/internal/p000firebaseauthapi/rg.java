package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.n0;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class rg extends a {
    public static final Parcelable.Creator<rg> CREATOR = new sg();

    /* renamed from: e, reason: collision with root package name */
    private final n0 f2088e;

    /* renamed from: f, reason: collision with root package name */
    private final String f2089f;

    public rg(n0 n0Var, String str) {
        this.f2088e = n0Var;
        this.f2089f = str;
    }

    public final n0 j0() {
        return this.f2088e;
    }

    public final String k0() {
        return this.f2089f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int a5 = c.a(parcel);
        c.l(parcel, 1, this.f2088e, r6, false);
        c.m(parcel, 2, this.f2089f, false);
        c.b(parcel, a5);
    }
}
