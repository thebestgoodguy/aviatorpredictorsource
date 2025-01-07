package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class vg extends a {
    public static final Parcelable.Creator<vg> CREATOR = new wg();

    /* renamed from: e, reason: collision with root package name */
    private final String f2236e;

    /* renamed from: f, reason: collision with root package name */
    private final String f2237f;

    public vg(String str, String str2) {
        this.f2236e = str;
        this.f2237f = str2;
    }

    public final String a() {
        return this.f2236e;
    }

    public final String j0() {
        return this.f2237f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = c.a(parcel);
        c.m(parcel, 1, this.f2236e, false);
        c.m(parcel, 2, this.f2237f, false);
        c.b(parcel, a5);
    }
}
