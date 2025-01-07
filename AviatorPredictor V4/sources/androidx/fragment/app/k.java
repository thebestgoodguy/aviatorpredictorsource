package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: e, reason: collision with root package name */
    ArrayList<m> f367e;

    /* renamed from: f, reason: collision with root package name */
    ArrayList<String> f368f;

    /* renamed from: g, reason: collision with root package name */
    b[] f369g;

    /* renamed from: h, reason: collision with root package name */
    String f370h;

    /* renamed from: i, reason: collision with root package name */
    int f371i;

    static class a implements Parcelable.Creator<k> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public k[] newArray(int r12) {
            return new k[r12];
        }
    }

    public k() {
        this.f370h = null;
    }

    public k(Parcel parcel) {
        this.f370h = null;
        this.f367e = parcel.createTypedArrayList(m.CREATOR);
        this.f368f = parcel.createStringArrayList();
        this.f369g = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f370h = parcel.readString();
        this.f371i = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r32) {
        parcel.writeTypedList(this.f367e);
        parcel.writeStringList(this.f368f);
        parcel.writeTypedArray(this.f369g, r32);
        parcel.writeString(this.f370h);
        parcel.writeInt(this.f371i);
    }
}
