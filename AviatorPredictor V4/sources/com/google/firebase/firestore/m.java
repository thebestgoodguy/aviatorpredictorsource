package com.google.firebase.firestore;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    private static final c f2685a = new c();

    /* renamed from: b, reason: collision with root package name */
    private static final e f2686b = new e();

    static class a extends m {

        /* renamed from: c, reason: collision with root package name */
        private final List<Object> f2687c;

        a(List<Object> list) {
            this.f2687c = list;
        }

        @Override // com.google.firebase.firestore.m
        String d() {
            return "FieldValue.arrayRemove";
        }

        List<Object> h() {
            return this.f2687c;
        }
    }

    static class b extends m {

        /* renamed from: c, reason: collision with root package name */
        private final List<Object> f2688c;

        b(List<Object> list) {
            this.f2688c = list;
        }

        @Override // com.google.firebase.firestore.m
        String d() {
            return "FieldValue.arrayUnion";
        }

        List<Object> h() {
            return this.f2688c;
        }
    }

    static class c extends m {
        c() {
        }

        @Override // com.google.firebase.firestore.m
        String d() {
            return "FieldValue.delete";
        }
    }

    static class d extends m {

        /* renamed from: c, reason: collision with root package name */
        private final Number f2689c;

        d(Number number) {
            this.f2689c = number;
        }

        @Override // com.google.firebase.firestore.m
        String d() {
            return "FieldValue.increment";
        }

        Number h() {
            return this.f2689c;
        }
    }

    static class e extends m {
        e() {
        }

        @Override // com.google.firebase.firestore.m
        String d() {
            return "FieldValue.serverTimestamp";
        }
    }

    m() {
    }

    public static m a(Object... objArr) {
        return new a(Arrays.asList(objArr));
    }

    public static m b(Object... objArr) {
        return new b(Arrays.asList(objArr));
    }

    public static m c() {
        return f2685a;
    }

    public static m e(double d5) {
        return new d(Double.valueOf(d5));
    }

    public static m f(long j4) {
        return new d(Long.valueOf(j4));
    }

    public static m g() {
        return f2686b;
    }

    abstract String d();
}
