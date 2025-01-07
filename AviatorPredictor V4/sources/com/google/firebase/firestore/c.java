package com.google.firebase.firestore;

import i1.n;
import i1.u1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final b f2623a;

    /* renamed from: b, reason: collision with root package name */
    private final l0 f2624b;

    /* renamed from: c, reason: collision with root package name */
    private final int f2625c;

    /* renamed from: d, reason: collision with root package name */
    private final int f2626d;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2627a;

        static {
            int[] r02 = new int[n.a.values().length];
            f2627a = r02;
            try {
                r02[n.a.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2627a[n.a.METADATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2627a[n.a.MODIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2627a[n.a.REMOVED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum b {
        ADDED,
        MODIFIED,
        REMOVED
    }

    c(l0 l0Var, b bVar, int r32, int r4) {
        this.f2623a = bVar;
        this.f2624b = l0Var;
        this.f2625c = r32;
        this.f2626d = r4;
    }

    static List<c> a(FirebaseFirestore firebaseFirestore, e0 e0Var, u1 u1Var) {
        int r9;
        int r7;
        ArrayList arrayList = new ArrayList();
        if (u1Var.g().isEmpty()) {
            l1.i iVar = null;
            int r5 = 0;
            for (i1.n nVar : u1Var.d()) {
                l1.i b5 = nVar.b();
                l0 h5 = l0.h(firebaseFirestore, b5, u1Var.j(), u1Var.f().contains(b5.getKey()));
                p1.b.d(nVar.c() == n.a.ADDED, "Invalid added event for first snapshot", new Object[0]);
                p1.b.d(iVar == null || u1Var.h().c().compare(iVar, b5) < 0, "Got added events in wrong order", new Object[0]);
                arrayList.add(new c(h5, b.ADDED, -1, r5));
                iVar = b5;
                r5++;
            }
        } else {
            l1.n g5 = u1Var.g();
            for (i1.n nVar2 : u1Var.d()) {
                if (e0Var != e0.EXCLUDE || nVar2.c() != n.a.METADATA) {
                    l1.i b6 = nVar2.b();
                    l0 h6 = l0.h(firebaseFirestore, b6, u1Var.j(), u1Var.f().contains(b6.getKey()));
                    b f5 = f(nVar2);
                    if (f5 != b.ADDED) {
                        r9 = g5.u(b6.getKey());
                        p1.b.d(r9 >= 0, "Index for document not found", new Object[0]);
                        g5 = g5.w(b6.getKey());
                    } else {
                        r9 = -1;
                    }
                    if (f5 != b.REMOVED) {
                        g5 = g5.p(b6);
                        r7 = g5.u(b6.getKey());
                        p1.b.d(r7 >= 0, "Index for document not found", new Object[0]);
                    } else {
                        r7 = -1;
                    }
                    arrayList.add(new c(h6, f5, r9, r7));
                }
            }
        }
        return arrayList;
    }

    private static b f(i1.n nVar) {
        int r02 = a.f2627a[nVar.c().ordinal()];
        if (r02 == 1) {
            return b.ADDED;
        }
        if (r02 == 2 || r02 == 3) {
            return b.MODIFIED;
        }
        if (r02 == 4) {
            return b.REMOVED;
        }
        throw new IllegalArgumentException("Unknown view change type: " + nVar.c());
    }

    public l0 b() {
        return this.f2624b;
    }

    public int c() {
        return this.f2626d;
    }

    public int d() {
        return this.f2625c;
    }

    public b e() {
        return this.f2623a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f2623a.equals(cVar.f2623a) && this.f2624b.equals(cVar.f2624b) && this.f2625c == cVar.f2625c && this.f2626d == cVar.f2626d;
    }

    public int hashCode() {
        return (((((this.f2623a.hashCode() * 31) + this.f2624b.hashCode()) * 31) + this.f2625c) * 31) + this.f2626d;
    }
}
