package w;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class v extends x.a {
    public static final Parcelable.Creator<v> CREATOR = new z();

    /* renamed from: e, reason: collision with root package name */
    private final int f8070e;

    /* renamed from: f, reason: collision with root package name */
    private List<o> f8071f;

    public v(int r12, List<o> list) {
        this.f8070e = r12;
        this.f8071f = list;
    }

    public final int j0() {
        return this.f8070e;
    }

    public final List<o> k0() {
        return this.f8071f;
    }

    public final void l0(o oVar) {
        if (this.f8071f == null) {
            this.f8071f = new ArrayList();
        }
        this.f8071f.add(oVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = x.c.a(parcel);
        x.c.h(parcel, 1, this.f8070e);
        x.c.q(parcel, 2, this.f8071f, false);
        x.c.b(parcel, a5);
    }
}
