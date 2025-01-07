package com.google.firebase.firestore;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: b, reason: collision with root package name */
    static final u0 f2749b = new b().a();

    /* renamed from: a, reason: collision with root package name */
    private final int f2750a;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private int f2751a = 5;

        public u0 a() {
            return new u0(this.f2751a);
        }

        public b b(int r22) {
            if (r22 < 1) {
                throw new IllegalArgumentException("Max attempts must be at least 1");
            }
            this.f2751a = r22;
            return this;
        }
    }

    private u0(int r12) {
        this.f2750a = r12;
    }

    public int a() {
        return this.f2750a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && u0.class == obj.getClass() && this.f2750a == ((u0) obj).f2750a;
    }

    public int hashCode() {
        return this.f2750a;
    }

    public String toString() {
        return "TransactionOptions{maxAttempts=" + this.f2750a + '}';
    }
}
