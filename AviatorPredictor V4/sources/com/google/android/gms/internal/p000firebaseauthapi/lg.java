package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class lg extends a {
    public static final Parcelable.Creator<lg> CREATOR = new mg();

    /* renamed from: e, reason: collision with root package name */
    private final String f1879e;

    /* renamed from: f, reason: collision with root package name */
    private final String f1880f;

    /* renamed from: g, reason: collision with root package name */
    private final String f1881g;

    public lg(String str, String str2, String str3) {
        this.f1879e = str;
        this.f1880f = str2;
        this.f1881g = str3;
    }

    public final String a() {
        return this.f1879e;
    }

    public final String j0() {
        return this.f1880f;
    }

    public final String k0() {
        return this.f1881g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = c.a(parcel);
        c.m(parcel, 1, this.f1879e, false);
        c.m(parcel, 2, this.f1880f, false);
        c.m(parcel, 3, this.f1881g, false);
        c.b(parcel, a5);
    }
}
