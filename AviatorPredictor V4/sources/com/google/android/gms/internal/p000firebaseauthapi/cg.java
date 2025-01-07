package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class cg extends a {
    public static final Parcelable.Creator<cg> CREATOR = new dg();

    /* renamed from: e, reason: collision with root package name */
    private final String f1463e;

    /* renamed from: f, reason: collision with root package name */
    private final String f1464f;

    public cg(String str, String str2) {
        this.f1463e = str;
        this.f1464f = str2;
    }

    public final String a() {
        return this.f1463e;
    }

    public final String j0() {
        return this.f1464f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = c.a(parcel);
        c.m(parcel, 1, this.f1463e, false);
        c.m(parcel, 2, this.f1464f, false);
        c.b(parcel, a5);
    }
}
