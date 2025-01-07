package com.google.firebase.firestore;

import android.util.SparseArray;

/* loaded from: classes.dex */
public class u extends x0.k {

    /* renamed from: e, reason: collision with root package name */
    private final a f2728e;

    public enum a {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);


        /* renamed from: w, reason: collision with root package name */
        private static final SparseArray<a> f2746w = d();

        /* renamed from: e, reason: collision with root package name */
        private final int f2748e;

        a(int r32) {
            this.f2748e = r32;
        }

        private static SparseArray<a> d() {
            SparseArray<a> sparseArray = new SparseArray<>();
            for (a aVar : values()) {
                a aVar2 = sparseArray.get(aVar.h());
                if (aVar2 != null) {
                    throw new IllegalStateException("Code value duplication between " + aVar2 + "&" + aVar.name());
                }
                sparseArray.put(aVar.h(), aVar);
            }
            return sparseArray;
        }

        public static a g(int r22) {
            return f2746w.get(r22, UNKNOWN);
        }

        public int h() {
            return this.f2748e;
        }
    }

    public u(String str, a aVar) {
        super(str);
        p1.x.c(str, "Provided message must not be null.");
        p1.b.d(aVar != a.OK, "A FirebaseFirestoreException should never be thrown for OK", new Object[0]);
        this.f2728e = (a) p1.x.c(aVar, "Provided code must not be null.");
    }

    public u(String str, a aVar, Throwable th) {
        super(str, th);
        p1.x.c(str, "Provided message must not be null.");
        p1.b.d(aVar != a.OK, "A FirebaseFirestoreException should never be thrown for OK", new Object[0]);
        this.f2728e = (a) p1.x.c(aVar, "Provided code must not be null.");
    }

    public a a() {
        return this.f2728e;
    }
}
