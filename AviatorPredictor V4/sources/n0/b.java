package n0;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class b extends x.a implements t.k {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: e, reason: collision with root package name */
    final int f6660e;

    /* renamed from: f, reason: collision with root package name */
    private int f6661f;

    /* renamed from: g, reason: collision with root package name */
    private Intent f6662g;

    public b() {
        this(2, 0, null);
    }

    b(int r12, int r22, Intent intent) {
        this.f6660e = r12;
        this.f6661f = r22;
        this.f6662g = intent;
    }

    @Override // t.k
    public final Status i0() {
        return this.f6661f == 0 ? Status.f1203j : Status.f1207n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int a5 = x.c.a(parcel);
        x.c.h(parcel, 1, this.f6660e);
        x.c.h(parcel, 2, this.f6661f);
        x.c.l(parcel, 3, this.f6662g, r6, false);
        x.c.b(parcel, a5);
    }
}
