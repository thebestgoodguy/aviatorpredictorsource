package a1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class j extends com.google.firebase.auth.k0 {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: e, reason: collision with root package name */
    private String f65e;

    /* renamed from: f, reason: collision with root package name */
    private String f66f;

    /* renamed from: g, reason: collision with root package name */
    private List f67g;

    private j() {
    }

    j(String str, String str2, List list) {
        this.f65e = str;
        this.f66f = str2;
        this.f67g = list;
    }

    public static j j0(String str) {
        w.r.e(str);
        j jVar = new j();
        jVar.f65e = str;
        return jVar;
    }

    public static j k0(List list, String str) {
        w.r.i(list);
        w.r.e(str);
        j jVar = new j();
        jVar.f67g = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.firebase.auth.i0 i0Var = (com.google.firebase.auth.i0) it.next();
            if (i0Var instanceof com.google.firebase.auth.s0) {
                jVar.f67g.add((com.google.firebase.auth.s0) i0Var);
            }
        }
        jVar.f66f = str;
        return jVar;
    }

    public final String l0() {
        return this.f65e;
    }

    public final String m0() {
        return this.f66f;
    }

    public final boolean n0() {
        return this.f65e != null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = x.c.a(parcel);
        x.c.m(parcel, 1, this.f65e, false);
        x.c.m(parcel, 2, this.f66f, false);
        x.c.q(parcel, 3, this.f67g, false);
        x.c.b(parcel, a5);
    }
}
