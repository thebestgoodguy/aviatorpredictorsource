package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.e;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class hh extends a {
    public static final Parcelable.Creator<hh> CREATOR = new ih();

    /* renamed from: e, reason: collision with root package name */
    private final String f1722e;

    /* renamed from: f, reason: collision with root package name */
    private final e f1723f;

    /* renamed from: g, reason: collision with root package name */
    private final String f1724g;

    public hh(String str, e eVar, String str2) {
        this.f1722e = str;
        this.f1723f = eVar;
        this.f1724g = str2;
    }

    public final e j0() {
        return this.f1723f;
    }

    public final String k0() {
        return this.f1722e;
    }

    public final String l0() {
        return this.f1724g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int a5 = c.a(parcel);
        c.m(parcel, 1, this.f1722e, false);
        c.l(parcel, 2, this.f1723f, r6, false);
        c.m(parcel, 3, this.f1724g, false);
        c.b(parcel, a5);
    }
}
