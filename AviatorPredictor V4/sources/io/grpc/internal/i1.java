package io.grpc.internal;

import b3.c;
import b3.e0;
import b3.f1;
import b3.n0;
import io.grpc.internal.y1;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class i1 {

    /* renamed from: a, reason: collision with root package name */
    private final b f5375a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, b> f5376b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, b> f5377c;

    /* renamed from: d, reason: collision with root package name */
    private final y1.c0 f5378d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f5379e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, ?> f5380f;

    static final class b {

        /* renamed from: g, reason: collision with root package name */
        static final c.a<b> f5381g = c.a.b("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");

        /* renamed from: a, reason: collision with root package name */
        final Long f5382a;

        /* renamed from: b, reason: collision with root package name */
        final Boolean f5383b;

        /* renamed from: c, reason: collision with root package name */
        final Integer f5384c;

        /* renamed from: d, reason: collision with root package name */
        final Integer f5385d;

        /* renamed from: e, reason: collision with root package name */
        final z1 f5386e;

        /* renamed from: f, reason: collision with root package name */
        final s0 f5387f;

        b(Map<String, ?> map, boolean z4, int r8, int r9) {
            this.f5382a = d2.w(map);
            this.f5383b = d2.x(map);
            Integer l4 = d2.l(map);
            this.f5384c = l4;
            if (l4 != null) {
                q0.l.j(l4.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", l4);
            }
            Integer k4 = d2.k(map);
            this.f5385d = k4;
            if (k4 != null) {
                q0.l.j(k4.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", k4);
            }
            Map<String, ?> r4 = z4 ? d2.r(map) : null;
            this.f5386e = r4 == null ? null : b(r4, r8);
            Map<String, ?> d5 = z4 ? d2.d(map) : null;
            this.f5387f = d5 != null ? a(d5, r9) : null;
        }

        private static s0 a(Map<String, ?> map, int r8) {
            int intValue = ((Integer) q0.l.o(d2.h(map), "maxAttempts cannot be empty")).intValue();
            q0.l.h(intValue >= 2, "maxAttempts must be greater than 1: %s", intValue);
            int min = Math.min(intValue, r8);
            long longValue = ((Long) q0.l.o(d2.c(map), "hedgingDelay cannot be empty")).longValue();
            q0.l.i(longValue >= 0, "hedgingDelay must not be negative: %s", longValue);
            return new s0(min, longValue, d2.p(map));
        }

        private static z1 b(Map<String, ?> map, int r16) {
            int intValue = ((Integer) q0.l.o(d2.i(map), "maxAttempts cannot be empty")).intValue();
            boolean z4 = true;
            q0.l.h(intValue >= 2, "maxAttempts must be greater than 1: %s", intValue);
            int min = Math.min(intValue, r16);
            long longValue = ((Long) q0.l.o(d2.e(map), "initialBackoff cannot be empty")).longValue();
            q0.l.i(longValue > 0, "initialBackoffNanos must be greater than 0: %s", longValue);
            long longValue2 = ((Long) q0.l.o(d2.j(map), "maxBackoff cannot be empty")).longValue();
            q0.l.i(longValue2 > 0, "maxBackoff must be greater than 0: %s", longValue2);
            double doubleValue = ((Double) q0.l.o(d2.a(map), "backoffMultiplier cannot be empty")).doubleValue();
            q0.l.j(doubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", Double.valueOf(doubleValue));
            Long q4 = d2.q(map);
            q0.l.j(q4 == null || q4.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", q4);
            Set<f1.b> s4 = d2.s(map);
            if (q4 == null && s4.isEmpty()) {
                z4 = false;
            }
            q0.l.e(z4, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            return new z1(min, longValue, longValue2, doubleValue, q4, s4);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return q0.i.a(this.f5382a, bVar.f5382a) && q0.i.a(this.f5383b, bVar.f5383b) && q0.i.a(this.f5384c, bVar.f5384c) && q0.i.a(this.f5385d, bVar.f5385d) && q0.i.a(this.f5386e, bVar.f5386e) && q0.i.a(this.f5387f, bVar.f5387f);
        }

        public int hashCode() {
            return q0.i.b(this.f5382a, this.f5383b, this.f5384c, this.f5385d, this.f5386e, this.f5387f);
        }

        public String toString() {
            return q0.h.c(this).d("timeoutNanos", this.f5382a).d("waitForReady", this.f5383b).d("maxInboundMessageSize", this.f5384c).d("maxOutboundMessageSize", this.f5385d).d("retryPolicy", this.f5386e).d("hedgingPolicy", this.f5387f).toString();
        }
    }

    static final class c extends b3.e0 {

        /* renamed from: b, reason: collision with root package name */
        final i1 f5388b;

        private c(i1 i1Var) {
            this.f5388b = i1Var;
        }

        @Override // b3.e0
        public e0.b a(n0.f fVar) {
            return e0.b.d().b(this.f5388b).a();
        }
    }

    i1(b bVar, Map<String, b> map, Map<String, b> map2, y1.c0 c0Var, Object obj, Map<String, ?> map3) {
        this.f5375a = bVar;
        this.f5376b = Collections.unmodifiableMap(new HashMap(map));
        this.f5377c = Collections.unmodifiableMap(new HashMap(map2));
        this.f5378d = c0Var;
        this.f5379e = obj;
        this.f5380f = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
    }

    static i1 a() {
        return new i1(null, new HashMap(), new HashMap(), null, null, null);
    }

    static i1 b(Map<String, ?> map, boolean z4, int r18, int r19, Object obj) {
        y1.c0 v4 = z4 ? d2.v(map) : null;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Map<String, ?> b5 = d2.b(map);
        List<Map<String, ?>> m4 = d2.m(map);
        if (m4 == null) {
            return new i1(null, hashMap, hashMap2, v4, obj, b5);
        }
        b bVar = null;
        for (Map<String, ?> map2 : m4) {
            b bVar2 = new b(map2, z4, r18, r19);
            List<Map<String, ?>> o4 = d2.o(map2);
            if (o4 != null && !o4.isEmpty()) {
                for (Map<String, ?> map3 : o4) {
                    String t4 = d2.t(map3);
                    String n4 = d2.n(map3);
                    if (q0.o.a(t4)) {
                        q0.l.j(q0.o.a(n4), "missing service name for method %s", n4);
                        q0.l.j(bVar == null, "Duplicate default method config in service config %s", map);
                        bVar = bVar2;
                    } else if (q0.o.a(n4)) {
                        q0.l.j(!hashMap2.containsKey(t4), "Duplicate service %s", t4);
                        hashMap2.put(t4, bVar2);
                    } else {
                        String b6 = b3.v0.b(t4, n4);
                        q0.l.j(!hashMap.containsKey(b6), "Duplicate method name %s", b6);
                        hashMap.put(b6, bVar2);
                    }
                }
            }
        }
        return new i1(bVar, hashMap, hashMap2, v4, obj, b5);
    }

    b3.e0 c() {
        if (this.f5377c.isEmpty() && this.f5376b.isEmpty() && this.f5375a == null) {
            return null;
        }
        return new c();
    }

    Map<String, ?> d() {
        return this.f5380f;
    }

    Object e() {
        return this.f5379e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i1.class != obj.getClass()) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return q0.i.a(this.f5375a, i1Var.f5375a) && q0.i.a(this.f5376b, i1Var.f5376b) && q0.i.a(this.f5377c, i1Var.f5377c) && q0.i.a(this.f5378d, i1Var.f5378d) && q0.i.a(this.f5379e, i1Var.f5379e);
    }

    b f(b3.v0<?, ?> v0Var) {
        b bVar = this.f5376b.get(v0Var.c());
        if (bVar == null) {
            bVar = this.f5377c.get(v0Var.d());
        }
        return bVar == null ? this.f5375a : bVar;
    }

    y1.c0 g() {
        return this.f5378d;
    }

    public int hashCode() {
        return q0.i.b(this.f5375a, this.f5376b, this.f5377c, this.f5378d, this.f5379e);
    }

    public String toString() {
        return q0.h.c(this).d("defaultMethodConfig", this.f5375a).d("serviceMethodMap", this.f5376b).d("serviceMap", this.f5377c).d("retryThrottling", this.f5378d).d("loadBalancingConfig", this.f5379e).toString();
    }
}
