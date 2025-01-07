package w;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class f1 extends x.a {
    public static final Parcelable.Creator<f1> CREATOR = new g1();

    /* renamed from: e, reason: collision with root package name */
    Bundle f7986e;

    /* renamed from: f, reason: collision with root package name */
    s.c[] f7987f;

    /* renamed from: g, reason: collision with root package name */
    int f7988g;

    /* renamed from: h, reason: collision with root package name */
    e f7989h;

    public f1() {
    }

    f1(Bundle bundle, s.c[] cVarArr, int r32, e eVar) {
        this.f7986e = bundle;
        this.f7987f = cVarArr;
        this.f7988g = r32;
        this.f7989h = eVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int a5 = x.c.a(parcel);
        x.c.e(parcel, 1, this.f7986e, false);
        x.c.p(parcel, 2, this.f7987f, r6, false);
        x.c.h(parcel, 3, this.f7988g);
        x.c.l(parcel, 4, this.f7989h, r6, false);
        x.c.b(parcel, a5);
    }
}
