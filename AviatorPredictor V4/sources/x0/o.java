package x0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import p1.x;

/* loaded from: classes.dex */
public final class o implements Comparable<o>, Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* renamed from: e, reason: collision with root package name */
    private final long f8154e;

    /* renamed from: f, reason: collision with root package name */
    private final int f8155f;

    class a implements Parcelable.Creator<o> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public o createFromParcel(Parcel parcel) {
            return new o(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o[] newArray(int r12) {
            return new o[r12];
        }
    }

    public o(long j4, int r32) {
        p(j4, r32);
        this.f8154e = j4;
        this.f8155f = r32;
    }

    protected o(Parcel parcel) {
        this.f8154e = parcel.readLong();
        this.f8155f = parcel.readInt();
    }

    public o(Date date) {
        long time = date.getTime();
        long j4 = time / 1000;
        int r7 = ((int) (time % 1000)) * 1000000;
        if (r7 < 0) {
            j4--;
            r7 += 1000000000;
        }
        p(j4, r7);
        this.f8154e = j4;
        this.f8155f = r7;
    }

    public static o n() {
        return new o(new Date());
    }

    private static void p(long j4, int r10) {
        x.a(r10 >= 0, "Timestamp nanoseconds out of range: %s", Integer.valueOf(r10));
        x.a(((double) r10) < 1.0E9d, "Timestamp nanoseconds out of range: %s", Integer.valueOf(r10));
        x.a(j4 >= -62135596800L, "Timestamp seconds out of range: %s", Long.valueOf(j4));
        x.a(j4 < 253402300800L, "Timestamp seconds out of range: %s", Long.valueOf(j4));
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(o oVar) {
        long j4 = this.f8154e;
        long j5 = oVar.f8154e;
        return j4 == j5 ? Integer.signum(this.f8155f - oVar.f8155f) : Long.signum(j4 - j5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof o) && compareTo((o) obj) == 0;
    }

    public int g() {
        return this.f8155f;
    }

    public int hashCode() {
        long j4 = this.f8154e;
        return (((((int) j4) * 37 * 37) + ((int) (j4 >> 32))) * 37) + this.f8155f;
    }

    public long i() {
        return this.f8154e;
    }

    public String toString() {
        return "Timestamp(seconds=" + this.f8154e + ", nanoseconds=" + this.f8155f + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r4) {
        parcel.writeLong(this.f8154e);
        parcel.writeInt(this.f8155f);
    }
}
