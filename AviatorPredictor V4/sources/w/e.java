package w;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class e extends x.a {
    public static final Parcelable.Creator<e> CREATOR = new h1();

    /* renamed from: e, reason: collision with root package name */
    private final t f7960e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f7961f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f7962g;

    /* renamed from: h, reason: collision with root package name */
    private final int[] f7963h;

    /* renamed from: i, reason: collision with root package name */
    private final int f7964i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f7965j;

    public e(t tVar, boolean z4, boolean z5, int[] r4, int r5, int[] r6) {
        this.f7960e = tVar;
        this.f7961f = z4;
        this.f7962g = z5;
        this.f7963h = r4;
        this.f7964i = r5;
        this.f7965j = r6;
    }

    public int j0() {
        return this.f7964i;
    }

    public int[] k0() {
        return this.f7963h;
    }

    public int[] l0() {
        return this.f7965j;
    }

    public boolean m0() {
        return this.f7961f;
    }

    public boolean n0() {
        return this.f7962g;
    }

    public final t o0() {
        return this.f7960e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int a5 = x.c.a(parcel);
        x.c.l(parcel, 1, this.f7960e, r6, false);
        x.c.c(parcel, 2, m0());
        x.c.c(parcel, 3, n0());
        x.c.i(parcel, 4, k0(), false);
        x.c.h(parcel, 5, j0());
        x.c.i(parcel, 6, l0(), false);
        x.c.b(parcel, a5);
    }
}
