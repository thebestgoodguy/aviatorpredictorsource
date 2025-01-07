package com.google.android.gms.common.api.internal;

import t.a;
import t.a.b;

/* loaded from: classes.dex */
public abstract class d<A extends a.b, ResultT> {

    /* renamed from: a, reason: collision with root package name */
    private final s.c[] f1265a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f1266b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1267c;

    public static class a<A extends a.b, ResultT> {

        /* renamed from: a, reason: collision with root package name */
        private u.j<A, o0.i<ResultT>> f1268a;

        /* renamed from: c, reason: collision with root package name */
        private s.c[] f1270c;

        /* renamed from: b, reason: collision with root package name */
        private boolean f1269b = true;

        /* renamed from: d, reason: collision with root package name */
        private int f1271d = 0;

        /* synthetic */ a(u.b0 b0Var) {
        }

        public d<A, ResultT> a() {
            w.r.b(this.f1268a != null, "execute parameter required");
            return new u(this, this.f1270c, this.f1269b, this.f1271d);
        }

        public a<A, ResultT> b(u.j<A, o0.i<ResultT>> jVar) {
            this.f1268a = jVar;
            return this;
        }

        public a<A, ResultT> c(boolean z4) {
            this.f1269b = z4;
            return this;
        }

        public a<A, ResultT> d(s.c... cVarArr) {
            this.f1270c = cVarArr;
            return this;
        }
    }

    protected d(s.c[] cVarArr, boolean z4, int r4) {
        this.f1265a = cVarArr;
        boolean z5 = false;
        if (cVarArr != null && z4) {
            z5 = true;
        }
        this.f1266b = z5;
        this.f1267c = r4;
    }

    public static <A extends a.b, ResultT> a<A, ResultT> a() {
        return new a<>(null);
    }

    protected abstract void b(A a5, o0.i<ResultT> iVar);

    public boolean c() {
        return this.f1266b;
    }

    public final int d() {
        return this.f1267c;
    }

    public final s.c[] e() {
        return this.f1265a;
    }
}
