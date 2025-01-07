package com.google.android.gms.internal.p000firebaseauthapi;

import a1.e0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.n1;
import java.util.List;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class pi extends a {
    public static final Parcelable.Creator<pi> CREATOR = new qi();

    /* renamed from: e, reason: collision with root package name */
    final String f2026e;

    /* renamed from: f, reason: collision with root package name */
    final List f2027f;

    /* renamed from: g, reason: collision with root package name */
    final n1 f2028g;

    public pi(String str, List list, n1 n1Var) {
        this.f2026e = str;
        this.f2027f = list;
        this.f2028g = n1Var;
    }

    public final n1 j0() {
        return this.f2028g;
    }

    public final String k0() {
        return this.f2026e;
    }

    public final List l0() {
        return e0.b(this.f2027f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int a5 = c.a(parcel);
        c.m(parcel, 1, this.f2026e, false);
        c.q(parcel, 2, this.f2027f, false);
        c.l(parcel, 3, this.f2028g, r6, false);
        c.b(parcel, a5);
    }
}
