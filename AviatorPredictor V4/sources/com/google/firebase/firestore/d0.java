package com.google.firebase.firestore;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: g, reason: collision with root package name */
    static final d0 f2639g = new d0(0, 0, 0, 0, null, a.SUCCESS);

    /* renamed from: a, reason: collision with root package name */
    private final int f2640a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2641b;

    /* renamed from: c, reason: collision with root package name */
    private final long f2642c;

    /* renamed from: d, reason: collision with root package name */
    private final long f2643d;

    /* renamed from: e, reason: collision with root package name */
    private final a f2644e;

    /* renamed from: f, reason: collision with root package name */
    private final Exception f2645f;

    public enum a {
        ERROR,
        RUNNING,
        SUCCESS
    }

    public d0(int r12, int r22, long j4, long j5, Exception exc, a aVar) {
        this.f2640a = r12;
        this.f2641b = r22;
        this.f2642c = j4;
        this.f2643d = j5;
        this.f2644e = aVar;
        this.f2645f = exc;
    }

    public static d0 a(h1.e eVar) {
        return new d0(0, eVar.e(), 0L, eVar.d(), null, a.RUNNING);
    }

    public static d0 b(h1.e eVar) {
        return new d0(eVar.e(), eVar.e(), eVar.d(), eVar.d(), null, a.SUCCESS);
    }

    public long c() {
        return this.f2642c;
    }

    public int d() {
        return this.f2640a;
    }

    public a e() {
        return this.f2644e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d0.class != obj.getClass()) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (this.f2640a != d0Var.f2640a || this.f2641b != d0Var.f2641b || this.f2642c != d0Var.f2642c || this.f2643d != d0Var.f2643d || this.f2644e != d0Var.f2644e) {
            return false;
        }
        Exception exc = this.f2645f;
        Exception exc2 = d0Var.f2645f;
        return exc != null ? exc.equals(exc2) : exc2 == null;
    }

    public long f() {
        return this.f2643d;
    }

    public int g() {
        return this.f2641b;
    }

    public int hashCode() {
        int r02 = ((this.f2640a * 31) + this.f2641b) * 31;
        long j4 = this.f2642c;
        int r03 = (r02 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f2643d;
        int hashCode = (((r03 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f2644e.hashCode()) * 31;
        Exception exc = this.f2645f;
        return hashCode + (exc != null ? exc.hashCode() : 0);
    }
}
