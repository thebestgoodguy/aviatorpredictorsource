package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.n1;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class ni extends a {
    public static final Parcelable.Creator<ni> CREATOR = new oi();

    /* renamed from: e, reason: collision with root package name */
    private final Status f1960e;

    /* renamed from: f, reason: collision with root package name */
    private final n1 f1961f;

    /* renamed from: g, reason: collision with root package name */
    private final String f1962g;

    /* renamed from: h, reason: collision with root package name */
    private final String f1963h;

    public ni(Status status, n1 n1Var, String str, String str2) {
        this.f1960e = status;
        this.f1961f = n1Var;
        this.f1962g = str;
        this.f1963h = str2;
    }

    public final Status j0() {
        return this.f1960e;
    }

    public final n1 k0() {
        return this.f1961f;
    }

    public final String l0() {
        return this.f1962g;
    }

    public final String m0() {
        return this.f1963h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int a5 = c.a(parcel);
        c.l(parcel, 1, this.f1960e, r6, false);
        c.l(parcel, 2, this.f1961f, r6, false);
        c.m(parcel, 3, this.f1962g, false);
        c.m(parcel, 4, this.f1963h, false);
        c.b(parcel, a5);
    }
}
