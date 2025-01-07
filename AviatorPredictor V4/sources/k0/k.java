package k0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class k extends x.a {
    public static final Parcelable.Creator<k> CREATOR = new l();

    /* renamed from: e, reason: collision with root package name */
    private final String f6016e;

    public k(String str) {
        this.f6016e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = x.c.a(parcel);
        x.c.m(parcel, 2, this.f6016e, false);
        x.c.b(parcel, a5);
    }
}
