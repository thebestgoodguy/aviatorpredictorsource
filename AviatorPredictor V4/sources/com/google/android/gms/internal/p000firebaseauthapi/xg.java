package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class xg extends a {
    public static final Parcelable.Creator<xg> CREATOR = new yg();

    /* renamed from: e, reason: collision with root package name */
    private final String f2328e;

    /* renamed from: f, reason: collision with root package name */
    private final String f2329f;

    /* renamed from: g, reason: collision with root package name */
    private final String f2330g;

    public xg(String str, String str2, String str3) {
        this.f2328e = str;
        this.f2329f = str2;
        this.f2330g = str3;
    }

    public final String a() {
        return this.f2330g;
    }

    public final String j0() {
        return this.f2328e;
    }

    public final String k0() {
        return this.f2329f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = c.a(parcel);
        c.m(parcel, 1, this.f2328e, false);
        c.m(parcel, 2, this.f2329f, false);
        c.m(parcel, 3, this.f2330g, false);
        c.b(parcel, a5);
    }
}
