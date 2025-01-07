package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.y0;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class ii extends a {
    public static final Parcelable.Creator<ii> CREATOR = new ji();

    /* renamed from: e, reason: collision with root package name */
    private final y0 f1774e;

    /* renamed from: f, reason: collision with root package name */
    private final String f1775f;

    public ii(y0 y0Var, String str) {
        this.f1774e = y0Var;
        this.f1775f = str;
    }

    public final y0 j0() {
        return this.f1774e;
    }

    public final String k0() {
        return this.f1775f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int a5 = c.a(parcel);
        c.l(parcel, 1, this.f1774e, r6, false);
        c.m(parcel, 2, this.f1775f, false);
        c.b(parcel, a5);
    }
}
