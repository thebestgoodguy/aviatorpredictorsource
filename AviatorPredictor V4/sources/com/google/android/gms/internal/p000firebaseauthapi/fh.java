package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.e;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class fh extends a {
    public static final Parcelable.Creator<fh> CREATOR = new gh();

    /* renamed from: e, reason: collision with root package name */
    private final String f1642e;

    /* renamed from: f, reason: collision with root package name */
    private final e f1643f;

    public fh(String str, e eVar) {
        this.f1642e = str;
        this.f1643f = eVar;
    }

    public final e j0() {
        return this.f1643f;
    }

    public final String k0() {
        return this.f1642e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int a5 = c.a(parcel);
        c.m(parcel, 1, this.f1642e, false);
        c.l(parcel, 2, this.f1643f, r6, false);
        c.b(parcel, a5);
    }
}
