package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class qh extends a {
    public static final Parcelable.Creator<qh> CREATOR = new rh();

    /* renamed from: e, reason: collision with root package name */
    private final String f2062e;

    /* renamed from: f, reason: collision with root package name */
    private final String f2063f;

    public qh(String str, String str2) {
        this.f2062e = str;
        this.f2063f = str2;
    }

    public final String a() {
        return this.f2063f;
    }

    public final String j0() {
        return this.f2062e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = c.a(parcel);
        c.m(parcel, 1, this.f2062e, false);
        c.m(parcel, 2, this.f2063f, false);
        c.b(parcel, a5);
    }
}
