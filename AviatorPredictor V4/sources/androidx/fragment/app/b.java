package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.n;
import androidx.lifecycle.d;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: e, reason: collision with root package name */
    final int[] f269e;

    /* renamed from: f, reason: collision with root package name */
    final ArrayList<String> f270f;

    /* renamed from: g, reason: collision with root package name */
    final int[] f271g;

    /* renamed from: h, reason: collision with root package name */
    final int[] f272h;

    /* renamed from: i, reason: collision with root package name */
    final int f273i;

    /* renamed from: j, reason: collision with root package name */
    final int f274j;

    /* renamed from: k, reason: collision with root package name */
    final String f275k;

    /* renamed from: l, reason: collision with root package name */
    final int f276l;

    /* renamed from: m, reason: collision with root package name */
    final int f277m;

    /* renamed from: n, reason: collision with root package name */
    final CharSequence f278n;

    /* renamed from: o, reason: collision with root package name */
    final int f279o;

    /* renamed from: p, reason: collision with root package name */
    final CharSequence f280p;

    /* renamed from: q, reason: collision with root package name */
    final ArrayList<String> f281q;

    /* renamed from: r, reason: collision with root package name */
    final ArrayList<String> f282r;

    /* renamed from: s, reason: collision with root package name */
    final boolean f283s;

    static class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int r12) {
            return new b[r12];
        }
    }

    public b(Parcel parcel) {
        this.f269e = parcel.createIntArray();
        this.f270f = parcel.createStringArrayList();
        this.f271g = parcel.createIntArray();
        this.f272h = parcel.createIntArray();
        this.f273i = parcel.readInt();
        this.f274j = parcel.readInt();
        this.f275k = parcel.readString();
        this.f276l = parcel.readInt();
        this.f277m = parcel.readInt();
        this.f278n = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f279o = parcel.readInt();
        this.f280p = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f281q = parcel.createStringArrayList();
        this.f282r = parcel.createStringArrayList();
        this.f283s = parcel.readInt() != 0;
    }

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.f393a.size();
        this.f269e = new int[size * 5];
        if (!aVar.f400h) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f270f = new ArrayList<>(size);
        this.f271g = new int[size];
        this.f272h = new int[size];
        int r12 = 0;
        int r22 = 0;
        while (r12 < size) {
            n.a aVar2 = aVar.f393a.get(r12);
            int r5 = r22 + 1;
            this.f269e[r22] = aVar2.f411a;
            ArrayList<String> arrayList = this.f270f;
            Fragment fragment = aVar2.f412b;
            arrayList.add(fragment != null ? fragment.f225i : null);
            int[] r23 = this.f269e;
            int r4 = r5 + 1;
            r23[r5] = aVar2.f413c;
            int r52 = r4 + 1;
            r23[r4] = aVar2.f414d;
            int r42 = r52 + 1;
            r23[r52] = aVar2.f415e;
            r23[r42] = aVar2.f416f;
            this.f271g[r12] = aVar2.f417g.ordinal();
            this.f272h[r12] = aVar2.f418h.ordinal();
            r12++;
            r22 = r42 + 1;
        }
        this.f273i = aVar.f398f;
        this.f274j = aVar.f399g;
        this.f275k = aVar.f402j;
        this.f276l = aVar.f268u;
        this.f277m = aVar.f403k;
        this.f278n = aVar.f404l;
        this.f279o = aVar.f405m;
        this.f280p = aVar.f406n;
        this.f281q = aVar.f407o;
        this.f282r = aVar.f408p;
        this.f283s = aVar.f409q;
    }

    public androidx.fragment.app.a a(j jVar) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(jVar);
        int r12 = 0;
        int r22 = 0;
        while (r12 < this.f269e.length) {
            n.a aVar2 = new n.a();
            int r5 = r12 + 1;
            aVar2.f411a = this.f269e[r12];
            if (j.L) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + r22 + " base fragment #" + this.f269e[r5]);
            }
            String str = this.f270f.get(r22);
            aVar2.f412b = str != null ? jVar.f319k.get(str) : null;
            aVar2.f417g = d.b.values()[this.f271g[r22]];
            aVar2.f418h = d.b.values()[this.f272h[r22]];
            int[] r13 = this.f269e;
            int r4 = r5 + 1;
            int r52 = r13[r5];
            aVar2.f413c = r52;
            int r6 = r4 + 1;
            int r42 = r13[r4];
            aVar2.f414d = r42;
            int r7 = r6 + 1;
            int r62 = r13[r6];
            aVar2.f415e = r62;
            int r14 = r13[r7];
            aVar2.f416f = r14;
            aVar.f394b = r52;
            aVar.f395c = r42;
            aVar.f396d = r62;
            aVar.f397e = r14;
            aVar.c(aVar2);
            r22++;
            r12 = r7 + 1;
        }
        aVar.f398f = this.f273i;
        aVar.f399g = this.f274j;
        aVar.f402j = this.f275k;
        aVar.f268u = this.f276l;
        aVar.f400h = true;
        aVar.f403k = this.f277m;
        aVar.f404l = this.f278n;
        aVar.f405m = this.f279o;
        aVar.f406n = this.f280p;
        aVar.f407o = this.f281q;
        aVar.f408p = this.f282r;
        aVar.f409q = this.f283s;
        aVar.h(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r32) {
        parcel.writeIntArray(this.f269e);
        parcel.writeStringList(this.f270f);
        parcel.writeIntArray(this.f271g);
        parcel.writeIntArray(this.f272h);
        parcel.writeInt(this.f273i);
        parcel.writeInt(this.f274j);
        parcel.writeString(this.f275k);
        parcel.writeInt(this.f276l);
        parcel.writeInt(this.f277m);
        TextUtils.writeToParcel(this.f278n, parcel, 0);
        parcel.writeInt(this.f279o);
        TextUtils.writeToParcel(this.f280p, parcel, 0);
        parcel.writeStringList(this.f281q);
        parcel.writeStringList(this.f282r);
        parcel.writeInt(this.f283s ? 1 : 0);
    }
}
