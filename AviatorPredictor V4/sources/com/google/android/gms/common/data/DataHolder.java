package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import x.c;

@KeepName
/* loaded from: classes.dex */
public final class DataHolder extends x.a implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new b();

    /* renamed from: o, reason: collision with root package name */
    private static final a f1334o = new com.google.android.gms.common.data.a(new String[0], null);

    /* renamed from: e, reason: collision with root package name */
    final int f1335e;

    /* renamed from: f, reason: collision with root package name */
    private final String[] f1336f;

    /* renamed from: g, reason: collision with root package name */
    Bundle f1337g;

    /* renamed from: h, reason: collision with root package name */
    private final CursorWindow[] f1338h;

    /* renamed from: i, reason: collision with root package name */
    private final int f1339i;

    /* renamed from: j, reason: collision with root package name */
    private final Bundle f1340j;

    /* renamed from: k, reason: collision with root package name */
    int[] f1341k;

    /* renamed from: l, reason: collision with root package name */
    int f1342l;

    /* renamed from: m, reason: collision with root package name */
    boolean f1343m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f1344n = true;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String[] f1345a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<HashMap<String, Object>> f1346b = new ArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        private final HashMap<Object, Integer> f1347c = new HashMap<>();
    }

    DataHolder(int r22, String[] strArr, CursorWindow[] cursorWindowArr, int r5, Bundle bundle) {
        this.f1335e = r22;
        this.f1336f = strArr;
        this.f1338h = cursorWindowArr;
        this.f1339i = r5;
        this.f1340j = bundle;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (!this.f1343m) {
                this.f1343m = true;
                int r02 = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.f1338h;
                    if (r02 >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[r02].close();
                    r02++;
                }
            }
        }
    }

    protected final void finalize() {
        try {
            if (this.f1344n && this.f1338h.length > 0 && !l0()) {
                close();
                String obj = toString();
                StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(obj);
                sb.append(")");
                Log.e("DataBuffer", sb.toString());
            }
        } finally {
            super.finalize();
        }
    }

    public Bundle j0() {
        return this.f1340j;
    }

    public int k0() {
        return this.f1339i;
    }

    public boolean l0() {
        boolean z4;
        synchronized (this) {
            z4 = this.f1343m;
        }
        return z4;
    }

    public final void m0() {
        this.f1337g = new Bundle();
        int r02 = 0;
        int r12 = 0;
        while (true) {
            String[] strArr = this.f1336f;
            if (r12 >= strArr.length) {
                break;
            }
            this.f1337g.putInt(strArr[r12], r12);
            r12++;
        }
        this.f1341k = new int[this.f1338h.length];
        int r13 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f1338h;
            if (r02 >= cursorWindowArr.length) {
                this.f1342l = r13;
                return;
            }
            this.f1341k[r02] = r13;
            r13 += this.f1338h[r02].getNumRows() - (r13 - cursorWindowArr[r02].getStartPosition());
            r02++;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r7) {
        int a5 = c.a(parcel);
        c.n(parcel, 1, this.f1336f, false);
        c.p(parcel, 2, this.f1338h, r7, false);
        c.h(parcel, 3, k0());
        c.e(parcel, 4, j0(), false);
        c.h(parcel, 1000, this.f1335e);
        c.b(parcel, a5);
        if ((r7 & 1) != 0) {
            close();
        }
    }
}
