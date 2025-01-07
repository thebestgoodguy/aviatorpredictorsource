package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class zg extends a {
    public static final Parcelable.Creator<zg> CREATOR = new ah();

    /* renamed from: e, reason: collision with root package name */
    private final String f2437e;

    /* renamed from: f, reason: collision with root package name */
    private final cq f2438f;

    public zg(String str, cq cqVar) {
        this.f2437e = str;
        this.f2438f = cqVar;
    }

    public final cq j0() {
        return this.f2438f;
    }

    public final String k0() {
        return this.f2437e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int a5 = c.a(parcel);
        c.m(parcel, 1, this.f2437e, false);
        c.l(parcel, 2, this.f2438f, r6, false);
        c.b(parcel, a5);
    }
}
