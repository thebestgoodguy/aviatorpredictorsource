package n0;

import android.os.Parcel;
import android.os.Parcelable;
import w.p0;

/* loaded from: classes.dex */
public final class j extends x.a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: e, reason: collision with root package name */
    final int f6665e;

    /* renamed from: f, reason: collision with root package name */
    final p0 f6666f;

    j(int r12, p0 p0Var) {
        this.f6665e = r12;
        this.f6666f = p0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int a5 = x.c.a(parcel);
        x.c.h(parcel, 1, this.f6665e);
        x.c.l(parcel, 2, this.f6666f, r6, false);
        x.c.b(parcel, a5);
    }
}
