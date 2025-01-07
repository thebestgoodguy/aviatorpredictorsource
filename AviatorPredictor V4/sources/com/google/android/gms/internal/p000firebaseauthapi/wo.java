package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import w.r;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class wo extends a {
    public static final Parcelable.Creator<wo> CREATOR = new xo();

    /* renamed from: e, reason: collision with root package name */
    private final List f2299e;

    public wo() {
        this.f2299e = new ArrayList();
    }

    wo(List list) {
        this.f2299e = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
    }

    public static wo j0(wo woVar) {
        r.i(woVar);
        List list = woVar.f2299e;
        wo woVar2 = new wo();
        if (list != null && !list.isEmpty()) {
            woVar2.f2299e.addAll(list);
        }
        return woVar2;
    }

    public final List k0() {
        return this.f2299e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = c.a(parcel);
        c.q(parcel, 2, this.f2299e, false);
        c.b(parcel, a5);
    }
}
