package w;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import w.j;

/* loaded from: classes.dex */
public final class r0 extends x.a {
    public static final Parcelable.Creator<r0> CREATOR = new s0();

    /* renamed from: e, reason: collision with root package name */
    final int f8052e;

    /* renamed from: f, reason: collision with root package name */
    final IBinder f8053f;

    /* renamed from: g, reason: collision with root package name */
    private final s.a f8054g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f8055h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f8056i;

    r0(int r12, IBinder iBinder, s.a aVar, boolean z4, boolean z5) {
        this.f8052e = r12;
        this.f8053f = iBinder;
        this.f8054g = aVar;
        this.f8055h = z4;
        this.f8056i = z5;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.f8054g.equals(r0Var.f8054g) && p.a(k0(), r0Var.k0());
    }

    public final s.a j0() {
        return this.f8054g;
    }

    public final j k0() {
        IBinder iBinder = this.f8053f;
        if (iBinder == null) {
            return null;
        }
        return j.a.f(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int a5 = x.c.a(parcel);
        x.c.h(parcel, 1, this.f8052e);
        x.c.g(parcel, 2, this.f8053f, false);
        x.c.l(parcel, 3, this.f8054g, r6, false);
        x.c.c(parcel, 4, this.f8055h);
        x.c.c(parcel, 5, this.f8056i);
        x.c.b(parcel, a5);
    }
}
