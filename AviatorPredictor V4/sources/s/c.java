package s;

import android.os.Parcel;
import android.os.Parcelable;
import w.p;

/* loaded from: classes.dex */
public class c extends x.a {
    public static final Parcelable.Creator<c> CREATOR = new p();

    /* renamed from: e, reason: collision with root package name */
    private final String f7482e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    private final int f7483f;

    /* renamed from: g, reason: collision with root package name */
    private final long f7484g;

    public c(String str, int r22, long j4) {
        this.f7482e = str;
        this.f7483f = r22;
        this.f7484g = j4;
    }

    public c(String str, long j4) {
        this.f7482e = str;
        this.f7484g = j4;
        this.f7483f = -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (((j0() != null && j0().equals(cVar.j0())) || (j0() == null && cVar.j0() == null)) && k0() == cVar.k0()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return w.p.b(j0(), Long.valueOf(k0()));
    }

    public String j0() {
        return this.f7482e;
    }

    public long k0() {
        long j4 = this.f7484g;
        return j4 == -1 ? this.f7483f : j4;
    }

    public final String toString() {
        p.a c5 = w.p.c(this);
        c5.a("name", j0());
        c5.a("version", Long.valueOf(k0()));
        return c5.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = x.c.a(parcel);
        x.c.m(parcel, 1, j0(), false);
        x.c.h(parcel, 2, this.f7483f);
        x.c.j(parcel, 3, k0());
        x.c.b(parcel, a5);
    }
}
