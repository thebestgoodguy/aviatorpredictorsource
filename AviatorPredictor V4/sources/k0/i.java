package k0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class i extends x.a {
    public static final Parcelable.Creator<i> CREATOR = new j();

    /* renamed from: e, reason: collision with root package name */
    public final long f6012e;

    /* renamed from: f, reason: collision with root package name */
    public final a[] f6013f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6014g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f6015h;

    public i(long j4, a[] aVarArr, int r4, boolean z4) {
        this.f6012e = j4;
        this.f6013f = aVarArr;
        this.f6015h = z4;
        if (z4) {
            this.f6014g = r4;
        } else {
            this.f6014g = -1;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int a5 = x.c.a(parcel);
        x.c.j(parcel, 2, this.f6012e);
        x.c.p(parcel, 3, this.f6013f, r6, false);
        x.c.h(parcel, 4, this.f6014g);
        x.c.c(parcel, 5, this.f6015h);
        x.c.b(parcel, a5);
    }
}
