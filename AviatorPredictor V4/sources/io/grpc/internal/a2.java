package io.grpc.internal;

import b3.w0;
import java.util.Map;

/* loaded from: classes.dex */
public final class a2 extends w0.h {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f5006a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5007b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5008c;

    /* renamed from: d, reason: collision with root package name */
    private final j f5009d;

    public a2(boolean z4, int r22, int r32, j jVar) {
        this.f5006a = z4;
        this.f5007b = r22;
        this.f5008c = r32;
        this.f5009d = (j) q0.l.o(jVar, "autoLoadBalancerFactory");
    }

    @Override // b3.w0.h
    public w0.c a(Map<String, ?> map) {
        Object c5;
        try {
            w0.c f5 = this.f5009d.f(map);
            if (f5 == null) {
                c5 = null;
            } else {
                if (f5.d() != null) {
                    return w0.c.b(f5.d());
                }
                c5 = f5.c();
            }
            return w0.c.a(i1.b(map, this.f5006a, this.f5007b, this.f5008c, c5));
        } catch (RuntimeException e5) {
            return w0.c.b(b3.f1.f758h.q("failed to parse service config").p(e5));
        }
    }
}
