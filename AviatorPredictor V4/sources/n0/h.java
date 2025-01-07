package n0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* loaded from: classes.dex */
public final class h extends x.a implements t.k {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: e, reason: collision with root package name */
    private final List<String> f6663e;

    /* renamed from: f, reason: collision with root package name */
    private final String f6664f;

    public h(List<String> list, String str) {
        this.f6663e = list;
        this.f6664f = str;
    }

    @Override // t.k
    public final Status i0() {
        return this.f6664f != null ? Status.f1203j : Status.f1207n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = x.c.a(parcel);
        x.c.o(parcel, 1, this.f6663e, false);
        x.c.m(parcel, 2, this.f6664f, false);
        x.c.b(parcel, a5);
    }
}
