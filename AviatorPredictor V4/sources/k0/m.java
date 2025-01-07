package k0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class m extends x.a {
    public static final Parcelable.Creator<m> CREATOR = new n();

    /* renamed from: e, reason: collision with root package name */
    private final int f6017e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f6018f;

    public m(int r12, boolean z4) {
        this.f6017e = r12;
        this.f6018f = z4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int a5 = x.c.a(parcel);
        x.c.h(parcel, 2, this.f6017e);
        x.c.c(parcel, 3, this.f6018f);
        x.c.b(parcel, a5);
    }
}
