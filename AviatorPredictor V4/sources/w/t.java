package w;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class t extends x.a {
    public static final Parcelable.Creator<t> CREATOR = new y0();

    /* renamed from: e, reason: collision with root package name */
    private final int f8060e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f8061f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f8062g;

    /* renamed from: h, reason: collision with root package name */
    private final int f8063h;

    /* renamed from: i, reason: collision with root package name */
    private final int f8064i;

    public t(int r12, boolean z4, boolean z5, int r4, int r5) {
        this.f8060e = r12;
        this.f8061f = z4;
        this.f8062g = z5;
        this.f8063h = r4;
        this.f8064i = r5;
    }

    public int j0() {
        return this.f8063h;
    }

    public int k0() {
        return this.f8064i;
    }

    public boolean l0() {
        return this.f8061f;
    }

    public boolean m0() {
        return this.f8062g;
    }

    public int n0() {
        return this.f8060e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int a5 = x.c.a(parcel);
        x.c.h(parcel, 1, n0());
        x.c.c(parcel, 2, l0());
        x.c.c(parcel, 3, m0());
        x.c.h(parcel, 4, j0());
        x.c.h(parcel, 5, k0());
        x.c.b(parcel, a5);
    }
}
