package com.google.firebase.firestore;

import i1.l;
import i1.q;
import java.util.List;

/* loaded from: classes.dex */
public class n {

    static class a extends n {

        /* renamed from: a, reason: collision with root package name */
        private final List<n> f2698a;

        /* renamed from: b, reason: collision with root package name */
        private final l.a f2699b;

        public List<n> k() {
            return this.f2698a;
        }

        public l.a l() {
            return this.f2699b;
        }
    }

    static class b extends n {

        /* renamed from: a, reason: collision with root package name */
        private final l f2700a;

        /* renamed from: b, reason: collision with root package name */
        private final q.b f2701b;

        /* renamed from: c, reason: collision with root package name */
        private final Object f2702c;

        public b(l lVar, q.b bVar, Object obj) {
            this.f2700a = lVar;
            this.f2701b = bVar;
            this.f2702c = obj;
        }

        public l k() {
            return this.f2700a;
        }

        public q.b l() {
            return this.f2701b;
        }

        public Object m() {
            return this.f2702c;
        }
    }

    public static n a(l lVar, Object obj) {
        return new b(lVar, q.b.ARRAY_CONTAINS, obj);
    }

    public static n b(l lVar, Object obj) {
        return new b(lVar, q.b.ARRAY_CONTAINS_ANY, obj);
    }

    public static n c(l lVar, Object obj) {
        return new b(lVar, q.b.EQUAL, obj);
    }

    public static n d(l lVar, Object obj) {
        return new b(lVar, q.b.GREATER_THAN, obj);
    }

    public static n e(l lVar, Object obj) {
        return new b(lVar, q.b.GREATER_THAN_OR_EQUAL, obj);
    }

    public static n f(l lVar, Object obj) {
        return new b(lVar, q.b.IN, obj);
    }

    public static n g(l lVar, Object obj) {
        return new b(lVar, q.b.LESS_THAN, obj);
    }

    public static n h(l lVar, Object obj) {
        return new b(lVar, q.b.LESS_THAN_OR_EQUAL, obj);
    }

    public static n i(l lVar, Object obj) {
        return new b(lVar, q.b.NOT_EQUAL, obj);
    }

    public static n j(l lVar, Object obj) {
        return new b(lVar, q.b.NOT_IN, obj);
    }
}
