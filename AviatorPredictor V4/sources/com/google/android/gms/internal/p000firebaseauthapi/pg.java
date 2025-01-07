package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.n0;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class pg extends a {
    public static final Parcelable.Creator<pg> CREATOR = new qg();

    /* renamed from: e, reason: collision with root package name */
    private final n0 f2023e;

    /* renamed from: f, reason: collision with root package name */
    private final String f2024f;

    /* renamed from: g, reason: collision with root package name */
    private final String f2025g;

    public pg(n0 n0Var, String str, String str2) {
        this.f2023e = n0Var;
        this.f2024f = str;
        this.f2025g = str2;
    }

    public final n0 j0() {
        return this.f2023e;
    }

    public final String k0() {
        return this.f2024f;
    }

    public final String l0() {
        return this.f2025g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int a5 = c.a(parcel);
        c.l(parcel, 1, this.f2023e, r6, false);
        c.m(parcel, 2, this.f2024f, false);
        c.m(parcel, 3, this.f2025g, false);
        c.b(parcel, a5);
    }
}
