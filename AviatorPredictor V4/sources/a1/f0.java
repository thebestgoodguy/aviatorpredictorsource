package a1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class f0 extends x.a {
    public static final Parcelable.Creator<f0> CREATOR = new g0();

    /* renamed from: e, reason: collision with root package name */
    private final List f39e;

    f0(List list) {
        this.f39e = list == null ? new ArrayList() : list;
    }

    public final List j0() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f39e.iterator();
        while (it.hasNext()) {
            arrayList.add((com.google.firebase.auth.s0) it.next());
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = x.c.a(parcel);
        x.c.q(parcel, 1, this.f39e, false);
        x.c.b(parcel, a5);
    }
}
