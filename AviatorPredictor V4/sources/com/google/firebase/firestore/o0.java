package com.google.firebase.firestore;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: c, reason: collision with root package name */
    static final o0 f2704c = new o0(false, null);

    /* renamed from: d, reason: collision with root package name */
    private static final o0 f2705d = new o0(true, null);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f2706a;

    /* renamed from: b, reason: collision with root package name */
    private final m1.d f2707b;

    private o0(boolean z4, m1.d dVar) {
        p1.x.a(dVar == null || z4, "Cannot specify a fieldMask for non-merge sets()", new Object[0]);
        this.f2706a = z4;
        this.f2707b = dVar;
    }

    public static o0 c() {
        return f2705d;
    }

    public static o0 d(List<l> list) {
        HashSet hashSet = new HashSet();
        Iterator<l> it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().c());
        }
        return new o0(true, m1.d.b(hashSet));
    }

    public m1.d a() {
        return this.f2707b;
    }

    boolean b() {
        return this.f2706a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o0.class != obj.getClass()) {
            return false;
        }
        o0 o0Var = (o0) obj;
        if (this.f2706a != o0Var.f2706a) {
            return false;
        }
        m1.d dVar = this.f2707b;
        m1.d dVar2 = o0Var.f2707b;
        return dVar != null ? dVar.equals(dVar2) : dVar2 == null;
    }

    public int hashCode() {
        int r02 = (this.f2706a ? 1 : 0) * 31;
        m1.d dVar = this.f2707b;
        return r02 + (dVar != null ? dVar.hashCode() : 0);
    }
}
