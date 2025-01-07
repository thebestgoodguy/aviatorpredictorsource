package io.grpc.internal;

import b3.w0;
import java.net.URI;

/* loaded from: classes.dex */
public final class d0 extends b3.x0 {
    @Override // b3.w0.d
    public String a() {
        return "dns";
    }

    @Override // b3.x0
    protected boolean d() {
        return true;
    }

    @Override // b3.x0
    public int e() {
        return 5;
    }

    @Override // b3.w0.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public c0 b(URI r10, w0.b bVar) {
        if (!"dns".equals(r10.getScheme())) {
            return null;
        }
        String str = (String) q0.l.o(r10.getPath(), "targetPath");
        q0.l.k(str.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", str, r10);
        return new c0(r10.getAuthority(), str.substring(1), bVar, q0.f5582t, q0.n.c(), b3.j0.a(d0.class.getClassLoader()));
    }
}
