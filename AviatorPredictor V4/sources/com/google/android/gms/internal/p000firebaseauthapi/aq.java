package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import b0.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class aq extends a {
    public static final Parcelable.Creator<aq> CREATOR = new bq();

    /* renamed from: e, reason: collision with root package name */
    public final int f1400e;

    /* renamed from: f, reason: collision with root package name */
    private List f1401f;

    public aq() {
        this(null);
    }

    aq(int r22, List list) {
        List emptyList;
        this.f1400e = r22;
        if (list == null || list.isEmpty()) {
            emptyList = Collections.emptyList();
        } else {
            for (int r23 = 0; r23 < list.size(); r23++) {
                list.set(r23, l.a((String) list.get(r23)));
            }
            emptyList = Collections.unmodifiableList(list);
        }
        this.f1401f = emptyList;
    }

    public aq(List list) {
        this.f1400e = 1;
        this.f1401f = new ArrayList();
        if (list == null || list.isEmpty()) {
            return;
        }
        this.f1401f.addAll(list);
    }

    public static aq j0(aq aqVar) {
        return new aq(aqVar.f1401f);
    }

    public final List k0() {
        return this.f1401f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = c.a(parcel);
        c.h(parcel, 1, this.f1400e);
        c.o(parcel, 2, this.f1401f, false);
        c.b(parcel, a5);
    }
}
