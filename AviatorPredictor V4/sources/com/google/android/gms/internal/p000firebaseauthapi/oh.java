package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class oh extends a {
    public static final Parcelable.Creator<oh> CREATOR = new ph();

    /* renamed from: e, reason: collision with root package name */
    private final cq f1996e;

    public oh(cq cqVar) {
        this.f1996e = cqVar;
    }

    public final cq j0() {
        return this.f1996e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int a5 = c.a(parcel);
        c.l(parcel, 1, this.f1996e, r6, false);
        c.b(parcel, a5);
    }
}
