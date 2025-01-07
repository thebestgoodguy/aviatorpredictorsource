package k0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class f extends x.a {
    public static final Parcelable.Creator<f> CREATOR = new g();

    /* renamed from: e, reason: collision with root package name */
    private final String f6011e;

    public f(String str) {
        this.f6011e = str;
    }

    public final String v() {
        return this.f6011e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = x.c.a(parcel);
        x.c.m(parcel, 2, this.f6011e, false);
        x.c.b(parcel, a5);
    }
}
