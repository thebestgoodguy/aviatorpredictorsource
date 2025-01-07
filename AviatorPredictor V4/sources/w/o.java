package w;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class o extends x.a {
    public static final Parcelable.Creator<o> CREATOR = new k0();

    /* renamed from: e, reason: collision with root package name */
    private final int f8030e;

    /* renamed from: f, reason: collision with root package name */
    private final int f8031f;

    /* renamed from: g, reason: collision with root package name */
    private final int f8032g;

    /* renamed from: h, reason: collision with root package name */
    private final long f8033h;

    /* renamed from: i, reason: collision with root package name */
    private final long f8034i;

    /* renamed from: j, reason: collision with root package name */
    private final String f8035j;

    /* renamed from: k, reason: collision with root package name */
    private final String f8036k;

    /* renamed from: l, reason: collision with root package name */
    private final int f8037l;

    /* renamed from: m, reason: collision with root package name */
    private final int f8038m;

    public o(int r12, int r22, int r32, long j4, long j5, String str, String str2, int r10, int r11) {
        this.f8030e = r12;
        this.f8031f = r22;
        this.f8032g = r32;
        this.f8033h = j4;
        this.f8034i = j5;
        this.f8035j = str;
        this.f8036k = str2;
        this.f8037l = r10;
        this.f8038m = r11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = x.c.a(parcel);
        x.c.h(parcel, 1, this.f8030e);
        x.c.h(parcel, 2, this.f8031f);
        x.c.h(parcel, 3, this.f8032g);
        x.c.j(parcel, 4, this.f8033h);
        x.c.j(parcel, 5, this.f8034i);
        x.c.m(parcel, 6, this.f8035j, false);
        x.c.m(parcel, 7, this.f8036k, false);
        x.c.h(parcel, 8, this.f8037l);
        x.c.h(parcel, 9, this.f8038m);
        x.c.b(parcel, a5);
    }
}
