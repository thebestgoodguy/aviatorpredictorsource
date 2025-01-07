package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class ig extends a {
    public static final Parcelable.Creator<ig> CREATOR = new jg();

    /* renamed from: e, reason: collision with root package name */
    private final String f1771e;

    /* renamed from: f, reason: collision with root package name */
    private final String f1772f;

    /* renamed from: g, reason: collision with root package name */
    private final String f1773g;

    public ig(String str, String str2, String str3) {
        this.f1771e = str;
        this.f1772f = str2;
        this.f1773g = str3;
    }

    public final String a() {
        return this.f1771e;
    }

    public final String j0() {
        return this.f1772f;
    }

    public final String k0() {
        return this.f1773g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = c.a(parcel);
        c.m(parcel, 1, this.f1771e, false);
        c.m(parcel, 2, this.f1772f, false);
        c.m(parcel, 3, this.f1773g, false);
        c.b(parcel, a5);
    }
}
