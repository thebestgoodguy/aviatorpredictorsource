package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.d;

/* loaded from: classes.dex */
final class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: e, reason: collision with root package name */
    final String f379e;

    /* renamed from: f, reason: collision with root package name */
    final String f380f;

    /* renamed from: g, reason: collision with root package name */
    final boolean f381g;

    /* renamed from: h, reason: collision with root package name */
    final int f382h;

    /* renamed from: i, reason: collision with root package name */
    final int f383i;

    /* renamed from: j, reason: collision with root package name */
    final String f384j;

    /* renamed from: k, reason: collision with root package name */
    final boolean f385k;

    /* renamed from: l, reason: collision with root package name */
    final boolean f386l;

    /* renamed from: m, reason: collision with root package name */
    final boolean f387m;

    /* renamed from: n, reason: collision with root package name */
    final Bundle f388n;

    /* renamed from: o, reason: collision with root package name */
    final boolean f389o;

    /* renamed from: p, reason: collision with root package name */
    final int f390p;

    /* renamed from: q, reason: collision with root package name */
    Bundle f391q;

    /* renamed from: r, reason: collision with root package name */
    Fragment f392r;

    static class a implements Parcelable.Creator<m> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int r12) {
            return new m[r12];
        }
    }

    m(Parcel parcel) {
        this.f379e = parcel.readString();
        this.f380f = parcel.readString();
        this.f381g = parcel.readInt() != 0;
        this.f382h = parcel.readInt();
        this.f383i = parcel.readInt();
        this.f384j = parcel.readString();
        this.f385k = parcel.readInt() != 0;
        this.f386l = parcel.readInt() != 0;
        this.f387m = parcel.readInt() != 0;
        this.f388n = parcel.readBundle();
        this.f389o = parcel.readInt() != 0;
        this.f391q = parcel.readBundle();
        this.f390p = parcel.readInt();
    }

    m(Fragment fragment) {
        this.f379e = fragment.getClass().getName();
        this.f380f = fragment.f225i;
        this.f381g = fragment.f233q;
        this.f382h = fragment.f242z;
        this.f383i = fragment.A;
        this.f384j = fragment.B;
        this.f385k = fragment.E;
        this.f386l = fragment.f232p;
        this.f387m = fragment.D;
        this.f388n = fragment.f226j;
        this.f389o = fragment.C;
        this.f390p = fragment.V.ordinal();
    }

    public Fragment a(ClassLoader classLoader, g gVar) {
        Fragment fragment;
        Bundle bundle;
        if (this.f392r == null) {
            Bundle bundle2 = this.f388n;
            if (bundle2 != null) {
                bundle2.setClassLoader(classLoader);
            }
            Fragment a5 = gVar.a(classLoader, this.f379e);
            this.f392r = a5;
            a5.h1(this.f388n);
            Bundle bundle3 = this.f391q;
            if (bundle3 != null) {
                bundle3.setClassLoader(classLoader);
                fragment = this.f392r;
                bundle = this.f391q;
            } else {
                fragment = this.f392r;
                bundle = new Bundle();
            }
            fragment.f222f = bundle;
            Fragment fragment2 = this.f392r;
            fragment2.f225i = this.f380f;
            fragment2.f233q = this.f381g;
            fragment2.f235s = true;
            fragment2.f242z = this.f382h;
            fragment2.A = this.f383i;
            fragment2.B = this.f384j;
            fragment2.E = this.f385k;
            fragment2.f232p = this.f386l;
            fragment2.D = this.f387m;
            fragment2.C = this.f389o;
            fragment2.V = d.b.values()[this.f390p];
            if (j.L) {
                Log.v("FragmentManager", "Instantiated fragment " + this.f392r);
            }
        }
        return this.f392r;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f379e);
        sb.append(" (");
        sb.append(this.f380f);
        sb.append(")}:");
        if (this.f381g) {
            sb.append(" fromLayout");
        }
        if (this.f383i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f383i));
        }
        String str = this.f384j;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f384j);
        }
        if (this.f385k) {
            sb.append(" retainInstance");
        }
        if (this.f386l) {
            sb.append(" removing");
        }
        if (this.f387m) {
            sb.append(" detached");
        }
        if (this.f389o) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r22) {
        parcel.writeString(this.f379e);
        parcel.writeString(this.f380f);
        parcel.writeInt(this.f381g ? 1 : 0);
        parcel.writeInt(this.f382h);
        parcel.writeInt(this.f383i);
        parcel.writeString(this.f384j);
        parcel.writeInt(this.f385k ? 1 : 0);
        parcel.writeInt(this.f386l ? 1 : 0);
        parcel.writeInt(this.f387m ? 1 : 0);
        parcel.writeBundle(this.f388n);
        parcel.writeInt(this.f389o ? 1 : 0);
        parcel.writeBundle(this.f391q);
        parcel.writeInt(this.f390p);
    }
}
