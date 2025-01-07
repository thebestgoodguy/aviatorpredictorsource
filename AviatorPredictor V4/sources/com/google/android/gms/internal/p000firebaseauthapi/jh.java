package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class jh extends a {
    public static final Parcelable.Creator<jh> CREATOR = new kh();

    /* renamed from: e, reason: collision with root package name */
    private final pp f1805e;

    public jh(pp ppVar) {
        this.f1805e = ppVar;
    }

    public final pp j0() {
        return this.f1805e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int a5 = c.a(parcel);
        c.l(parcel, 1, this.f1805e, r6, false);
        c.b(parcel, a5);
    }
}
