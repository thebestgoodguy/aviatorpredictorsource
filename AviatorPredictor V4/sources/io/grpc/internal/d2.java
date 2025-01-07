package io.grpc.internal;

import b3.f1;
import b3.w0;
import io.grpc.internal.y1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class d2 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f5138a;

        /* renamed from: b, reason: collision with root package name */
        private final Map<String, ?> f5139b;

        public a(String str, Map<String, ?> map) {
            this.f5138a = (String) q0.l.o(str, "policyName");
            this.f5139b = (Map) q0.l.o(map, "rawConfigValue");
        }

        public String a() {
            return this.f5138a;
        }

        public Map<String, ?> b() {
            return this.f5139b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f5138a.equals(aVar.f5138a) && this.f5139b.equals(aVar.f5139b);
        }

        public int hashCode() {
            return q0.i.b(this.f5138a, this.f5139b);
        }

        public String toString() {
            return q0.h.c(this).d("policyName", this.f5138a).d("rawConfigValue", this.f5139b).toString();
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final b3.o0 f5140a;

        /* renamed from: b, reason: collision with root package name */
        final Object f5141b;

        public b(b3.o0 o0Var, Object obj) {
            this.f5140a = (b3.o0) q0.l.o(o0Var, "provider");
            this.f5141b = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return q0.i.a(this.f5140a, bVar.f5140a) && q0.i.a(this.f5141b, bVar.f5141b);
        }

        public int hashCode() {
            return q0.i.b(this.f5140a, this.f5141b);
        }

        public String toString() {
            return q0.h.c(this).d("provider", this.f5140a).d("config", this.f5141b).toString();
        }
    }

    private d2() {
    }

    public static List<a> A(List<Map<String, ?>> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Map<String, ?>> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(z(it.next()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    static Double a(Map<String, ?> map) {
        return a1.h(map, "backoffMultiplier");
    }

    public static Map<String, ?> b(Map<String, ?> map) {
        if (map == null) {
            return null;
        }
        return a1.j(map, "healthCheckConfig");
    }

    static Long c(Map<String, ?> map) {
        return a1.l(map, "hedgingDelay");
    }

    static Map<String, ?> d(Map<String, ?> map) {
        return a1.j(map, "hedgingPolicy");
    }

    static Long e(Map<String, ?> map) {
        return a1.l(map, "initialBackoff");
    }

    private static Set<f1.b> f(Map<String, ?> map, String str) {
        List<?> e5 = a1.e(map, str);
        if (e5 == null) {
            return null;
        }
        return u(e5);
    }

    public static List<Map<String, ?>> g(Map<String, ?> map) {
        String k4;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            arrayList.addAll(a1.f(map, "loadBalancingConfig"));
        }
        if (arrayList.isEmpty() && (k4 = a1.k(map, "loadBalancingPolicy")) != null) {
            arrayList.add(Collections.singletonMap(k4.toLowerCase(Locale.ROOT), Collections.emptyMap()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    static Integer h(Map<String, ?> map) {
        return a1.i(map, "maxAttempts");
    }

    static Integer i(Map<String, ?> map) {
        return a1.i(map, "maxAttempts");
    }

    static Long j(Map<String, ?> map) {
        return a1.l(map, "maxBackoff");
    }

    static Integer k(Map<String, ?> map) {
        return a1.i(map, "maxRequestMessageBytes");
    }

    static Integer l(Map<String, ?> map) {
        return a1.i(map, "maxResponseMessageBytes");
    }

    static List<Map<String, ?>> m(Map<String, ?> map) {
        return a1.f(map, "methodConfig");
    }

    static String n(Map<String, ?> map) {
        return a1.k(map, "method");
    }

    static List<Map<String, ?>> o(Map<String, ?> map) {
        return a1.f(map, "name");
    }

    static Set<f1.b> p(Map<String, ?> map) {
        Set<f1.b> f5 = f(map, "nonFatalStatusCodes");
        if (f5 == null) {
            return Collections.unmodifiableSet(EnumSet.noneOf(f1.b.class));
        }
        q0.s.a(!f5.contains(f1.b.OK), "%s must not contain OK", "nonFatalStatusCodes");
        return f5;
    }

    static Long q(Map<String, ?> map) {
        return a1.l(map, "perAttemptRecvTimeout");
    }

    static Map<String, ?> r(Map<String, ?> map) {
        return a1.j(map, "retryPolicy");
    }

    static Set<f1.b> s(Map<String, ?> map) {
        Set<f1.b> f5 = f(map, "retryableStatusCodes");
        q0.s.a(f5 != null, "%s is required in retry policy", "retryableStatusCodes");
        q0.s.a(true ^ f5.contains(f1.b.OK), "%s must not contain OK", "retryableStatusCodes");
        return f5;
    }

    static String t(Map<String, ?> map) {
        return a1.k(map, "service");
    }

    private static Set<f1.b> u(List<?> list) {
        f1.b valueOf;
        EnumSet noneOf = EnumSet.noneOf(f1.b.class);
        for (Object obj : list) {
            if (obj instanceof Double) {
                Double d5 = (Double) obj;
                int intValue = d5.intValue();
                q0.s.a(((double) intValue) == d5.doubleValue(), "Status code %s is not integral", obj);
                valueOf = b3.f1.h(intValue).m();
                q0.s.a(valueOf.h() == d5.intValue(), "Status code %s is not valid", obj);
            } else {
                if (!(obj instanceof String)) {
                    throw new q0.t("Can not convert status code " + obj + " to Status.Code, because its type is " + obj.getClass());
                }
                try {
                    valueOf = f1.b.valueOf((String) obj);
                } catch (IllegalArgumentException e5) {
                    throw new q0.t("Status code " + obj + " is not valid", e5);
                }
            }
            noneOf.add(valueOf);
        }
        return Collections.unmodifiableSet(noneOf);
    }

    static y1.c0 v(Map<String, ?> map) {
        Map<String, ?> j4;
        if (map == null || (j4 = a1.j(map, "retryThrottling")) == null) {
            return null;
        }
        float floatValue = a1.h(j4, "maxTokens").floatValue();
        float floatValue2 = a1.h(j4, "tokenRatio").floatValue();
        q0.l.u(floatValue > 0.0f, "maxToken should be greater than zero");
        q0.l.u(floatValue2 > 0.0f, "tokenRatio should be greater than zero");
        return new y1.c0(floatValue, floatValue2);
    }

    static Long w(Map<String, ?> map) {
        return a1.l(map, "timeout");
    }

    static Boolean x(Map<String, ?> map) {
        return a1.d(map, "waitForReady");
    }

    public static w0.c y(List<a> list, b3.p0 p0Var) {
        ArrayList arrayList = new ArrayList();
        for (a aVar : list) {
            String a5 = aVar.a();
            b3.o0 d5 = p0Var.d(a5);
            if (d5 != null) {
                if (!arrayList.isEmpty()) {
                    Logger.getLogger(d2.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", arrayList);
                }
                w0.c e5 = d5.e(aVar.b());
                return e5.d() != null ? e5 : w0.c.a(new b(d5, e5.c()));
            }
            arrayList.add(a5);
        }
        return w0.c.b(b3.f1.f758h.q("None of " + arrayList + " specified by Service Config are available."));
    }

    public static a z(Map<String, ?> map) {
        if (map.size() == 1) {
            String key = map.entrySet().iterator().next().getKey();
            return new a(key, a1.j(map, key));
        }
        throw new RuntimeException("There are " + map.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + map);
    }
}
