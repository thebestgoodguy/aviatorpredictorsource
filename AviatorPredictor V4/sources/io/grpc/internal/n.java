package io.grpc.internal;

import b3.d0;
import b3.f;
import java.text.MessageFormat;
import java.util.logging.Level;

/* loaded from: classes.dex */
final class n extends b3.f {

    /* renamed from: a, reason: collision with root package name */
    private final o f5479a;

    /* renamed from: b, reason: collision with root package name */
    private final k2 f5480b;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5481a;

        static {
            int[] r02 = new int[f.a.values().length];
            f5481a = r02;
            try {
                r02[f.a.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5481a[f.a.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5481a[f.a.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    n(o oVar, k2 k2Var) {
        this.f5479a = (o) q0.l.o(oVar, "tracer");
        this.f5480b = (k2) q0.l.o(k2Var, "time");
    }

    private boolean c(f.a aVar) {
        return aVar != f.a.DEBUG && this.f5479a.c();
    }

    static void d(b3.h0 h0Var, f.a aVar, String str) {
        Level f5 = f(aVar);
        if (o.f5497f.isLoggable(f5)) {
            o.d(h0Var, f5, str);
        }
    }

    static void e(b3.h0 h0Var, f.a aVar, String str, Object... objArr) {
        Level f5 = f(aVar);
        if (o.f5497f.isLoggable(f5)) {
            o.d(h0Var, f5, MessageFormat.format(str, objArr));
        }
    }

    private static Level f(f.a aVar) {
        int r12 = a.f5481a[aVar.ordinal()];
        return (r12 == 1 || r12 == 2) ? Level.FINE : r12 != 3 ? Level.FINEST : Level.FINER;
    }

    private static d0.b g(f.a aVar) {
        int r12 = a.f5481a[aVar.ordinal()];
        return r12 != 1 ? r12 != 2 ? d0.b.CT_INFO : d0.b.CT_WARNING : d0.b.CT_ERROR;
    }

    private void h(f.a aVar, String str) {
        if (aVar == f.a.DEBUG) {
            return;
        }
        this.f5479a.f(new d0.a().b(str).c(g(aVar)).e(this.f5480b.a()).a());
    }

    @Override // b3.f
    public void a(f.a aVar, String str) {
        d(this.f5479a.b(), aVar, str);
        if (c(aVar)) {
            h(aVar, str);
        }
    }

    @Override // b3.f
    public void b(f.a aVar, String str, Object... objArr) {
        a(aVar, (c(aVar) || o.f5497f.isLoggable(f(aVar))) ? MessageFormat.format(str, objArr) : null);
    }
}
