package io.grpc.internal;

import b3.n0;
import b3.w0;
import java.util.Map;

/* loaded from: classes.dex */
public final class r1 extends b3.o0 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f5647b = 0;

    @Override // b3.n0.c
    public b3.n0 a(n0.d dVar) {
        return new q1(dVar);
    }

    @Override // b3.o0
    public String b() {
        return "pick_first";
    }

    @Override // b3.o0
    public int c() {
        return 5;
    }

    @Override // b3.o0
    public boolean d() {
        return true;
    }

    @Override // b3.o0
    public w0.c e(Map<String, ?> map) {
        return w0.c.a("no service config");
    }
}
