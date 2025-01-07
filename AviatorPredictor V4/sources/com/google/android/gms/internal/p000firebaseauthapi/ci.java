package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class ci extends a {
    public static final Parcelable.Creator<ci> CREATOR = new di();

    /* renamed from: e, reason: collision with root package name */
    private final String f1465e;

    /* renamed from: f, reason: collision with root package name */
    private final String f1466f;

    public ci(String str, String str2) {
        this.f1465e = str;
        this.f1466f = str2;
    }

    public final String a() {
        return this.f1465e;
    }

    public final String j0() {
        return this.f1466f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = c.a(parcel);
        c.m(parcel, 1, this.f1465e, false);
        c.m(parcel, 2, this.f1466f, false);
        c.b(parcel, a5);
    }
}
