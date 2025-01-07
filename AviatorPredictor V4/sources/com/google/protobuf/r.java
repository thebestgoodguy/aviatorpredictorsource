package com.google.protobuf;

import com.google.protobuf.a0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class r {

    /* renamed from: b, reason: collision with root package name */
    private static boolean f3064b = true;

    /* renamed from: c, reason: collision with root package name */
    private static volatile r f3065c;

    /* renamed from: d, reason: collision with root package name */
    static final r f3066d = new r(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map<a, a0.e<?, ?>> f3067a;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f3068a;

        /* renamed from: b, reason: collision with root package name */
        private final int f3069b;

        a(Object obj, int r22) {
            this.f3068a = obj;
            this.f3069b = r22;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f3068a == aVar.f3068a && this.f3069b == aVar.f3069b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f3068a) * 65535) + this.f3069b;
        }
    }

    r() {
        this.f3067a = new HashMap();
    }

    r(boolean z4) {
        this.f3067a = Collections.emptyMap();
    }

    public static r b() {
        r rVar = f3065c;
        if (rVar == null) {
            synchronized (r.class) {
                rVar = f3065c;
                if (rVar == null) {
                    rVar = f3064b ? q.a() : f3066d;
                    f3065c = rVar;
                }
            }
        }
        return rVar;
    }

    public <ContainingType extends v0> a0.e<ContainingType, ?> a(ContainingType containingtype, int r4) {
        return (a0.e) this.f3067a.get(new a(containingtype, r4));
    }
}
