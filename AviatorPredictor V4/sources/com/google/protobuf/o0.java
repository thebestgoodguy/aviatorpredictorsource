package com.google.protobuf;

import com.google.protobuf.b2;

/* loaded from: classes.dex */
public class o0<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final a<K, V> f3029a;

    /* renamed from: b, reason: collision with root package name */
    private final K f3030b;

    /* renamed from: c, reason: collision with root package name */
    private final V f3031c;

    static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final b2.b f3032a;

        /* renamed from: b, reason: collision with root package name */
        public final K f3033b;

        /* renamed from: c, reason: collision with root package name */
        public final b2.b f3034c;

        /* renamed from: d, reason: collision with root package name */
        public final V f3035d;

        public a(b2.b bVar, K k4, b2.b bVar2, V v4) {
            this.f3032a = bVar;
            this.f3033b = k4;
            this.f3034c = bVar2;
            this.f3035d = v4;
        }
    }

    private o0(b2.b bVar, K k4, b2.b bVar2, V v4) {
        this.f3029a = new a<>(bVar, k4, bVar2, v4);
        this.f3030b = k4;
        this.f3031c = v4;
    }

    static <K, V> int b(a<K, V> aVar, K k4, V v4) {
        return w.d(aVar.f3032a, 1, k4) + w.d(aVar.f3034c, 2, v4);
    }

    public static <K, V> o0<K, V> d(b2.b bVar, K k4, b2.b bVar2, V v4) {
        return new o0<>(bVar, k4, bVar2, v4);
    }

    static <K, V> void e(m mVar, a<K, V> aVar, K k4, V v4) {
        w.z(mVar, aVar.f3032a, 1, k4);
        w.z(mVar, aVar.f3034c, 2, v4);
    }

    public int a(int r22, K k4, V v4) {
        return m.W(r22) + m.D(b(this.f3029a, k4, v4));
    }

    a<K, V> c() {
        return this.f3029a;
    }
}
