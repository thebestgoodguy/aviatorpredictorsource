package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class yh extends a {
    public static final Parcelable.Creator<yh> CREATOR = new zh();

    /* renamed from: e, reason: collision with root package name */
    private final String f2376e;

    /* renamed from: f, reason: collision with root package name */
    private final String f2377f;

    /* renamed from: g, reason: collision with root package name */
    private final String f2378g;

    /* renamed from: h, reason: collision with root package name */
    private final long f2379h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f2380i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f2381j;

    /* renamed from: k, reason: collision with root package name */
    private final String f2382k;

    /* renamed from: l, reason: collision with root package name */
    private final String f2383l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f2384m;

    public yh(String str, String str2, String str3, long j4, boolean z4, boolean z5, String str4, String str5, boolean z6) {
        this.f2376e = str;
        this.f2377f = str2;
        this.f2378g = str3;
        this.f2379h = j4;
        this.f2380i = z4;
        this.f2381j = z5;
        this.f2382k = str4;
        this.f2383l = str5;
        this.f2384m = z6;
    }

    public final long j0() {
        return this.f2379h;
    }

    public final String k0() {
        return this.f2376e;
    }

    public final String l0() {
        return this.f2378g;
    }

    public final String m0() {
        return this.f2377f;
    }

    public final String n0() {
        return this.f2383l;
    }

    public final String o0() {
        return this.f2382k;
    }

    public final boolean p0() {
        return this.f2380i;
    }

    public final boolean q0() {
        return this.f2384m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int a5 = c.a(parcel);
        c.m(parcel, 1, this.f2376e, false);
        c.m(parcel, 2, this.f2377f, false);
        c.m(parcel, 3, this.f2378g, false);
        c.j(parcel, 4, this.f2379h);
        c.c(parcel, 5, this.f2380i);
        c.c(parcel, 6, this.f2381j);
        c.m(parcel, 7, this.f2382k, false);
        c.m(parcel, 8, this.f2383l, false);
        c.c(parcel, 9, this.f2384m);
        c.b(parcel, a5);
    }
}
