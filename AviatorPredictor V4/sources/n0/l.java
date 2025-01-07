package n0;

import android.os.Parcel;
import android.os.Parcelable;
import w.r0;

/* loaded from: classes.dex */
public final class l extends x.a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: e, reason: collision with root package name */
    final int f6667e;

    /* renamed from: f, reason: collision with root package name */
    private final s.a f6668f;

    /* renamed from: g, reason: collision with root package name */
    private final r0 f6669g;

    l(int r12, s.a aVar, r0 r0Var) {
        this.f6667e = r12;
        this.f6668f = aVar;
        this.f6669g = r0Var;
    }

    public final s.a j0() {
        return this.f6668f;
    }

    public final r0 k0() {
        return this.f6669g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int a5 = x.c.a(parcel);
        x.c.h(parcel, 1, this.f6667e);
        x.c.l(parcel, 2, this.f6668f, r6, false);
        x.c.l(parcel, 3, this.f6669g, r6, false);
        x.c.b(parcel, a5);
    }
}
