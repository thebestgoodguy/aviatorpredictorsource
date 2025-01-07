package k0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class a extends x.a {
    public static final Parcelable.Creator<a> CREATOR = new h();

    /* renamed from: e, reason: collision with root package name */
    public final String f5995e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f5996f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5997g;

    public a(String str, byte[] bArr, int r32) {
        this.f5995e = str;
        this.f5996f = bArr;
        this.f5997g = r32;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r5) {
        int a5 = x.c.a(parcel);
        x.c.m(parcel, 2, this.f5995e, false);
        x.c.f(parcel, 3, this.f5996f, false);
        x.c.h(parcel, 4, this.f5997g);
        x.c.b(parcel, a5);
    }
}
