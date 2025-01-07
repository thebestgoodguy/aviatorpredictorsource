package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.s0;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class ai extends a {
    public static final Parcelable.Creator<ai> CREATOR = new bi();

    /* renamed from: e, reason: collision with root package name */
    private final s0 f1384e;

    /* renamed from: f, reason: collision with root package name */
    private final String f1385f;

    /* renamed from: g, reason: collision with root package name */
    private final String f1386g;

    /* renamed from: h, reason: collision with root package name */
    private final long f1387h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f1388i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f1389j;

    /* renamed from: k, reason: collision with root package name */
    private final String f1390k;

    /* renamed from: l, reason: collision with root package name */
    private final String f1391l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f1392m;

    public ai(s0 s0Var, String str, String str2, long j4, boolean z4, boolean z5, String str3, String str4, boolean z6) {
        this.f1384e = s0Var;
        this.f1385f = str;
        this.f1386g = str2;
        this.f1387h = j4;
        this.f1388i = z4;
        this.f1389j = z5;
        this.f1390k = str3;
        this.f1391l = str4;
        this.f1392m = z6;
    }

    public final long j0() {
        return this.f1387h;
    }

    public final s0 k0() {
        return this.f1384e;
    }

    public final String l0() {
        return this.f1386g;
    }

    public final String m0() {
        return this.f1385f;
    }

    public final String n0() {
        return this.f1391l;
    }

    public final String o0() {
        return this.f1390k;
    }

    public final boolean p0() {
        return this.f1388i;
    }

    public final boolean q0() {
        return this.f1392m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int a5 = c.a(parcel);
        c.l(parcel, 1, this.f1384e, r6, false);
        c.m(parcel, 2, this.f1385f, false);
        c.m(parcel, 3, this.f1386g, false);
        c.j(parcel, 4, this.f1387h);
        c.c(parcel, 5, this.f1388i);
        c.c(parcel, 6, this.f1389j);
        c.m(parcel, 7, this.f1390k, false);
        c.m(parcel, 8, this.f1391l, false);
        c.c(parcel, 9, this.f1392m);
        c.b(parcel, a5);
    }
}
