package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class f3 {

    /* renamed from: a, reason: collision with root package name */
    private final cd f1638a;

    private f3(cd cdVar) {
        this.f1638a = cdVar;
    }

    public static f3 e() {
        return new f3(fd.B());
    }

    public static f3 f(e3 e3Var) {
        return new f3((cd) e3Var.c().t());
    }

    private final synchronized int g() {
        int a5;
        do {
            a5 = t7.a();
        } while (i(a5));
        return a5;
    }

    private final synchronized ed h(xc xcVar) {
        return j(x3.c(xcVar), xcVar.G());
    }

    private final synchronized boolean i(int r32) {
        boolean z4;
        Iterator it = this.f1638a.u().iterator();
        while (true) {
            if (!it.hasNext()) {
                z4 = false;
                break;
            }
            if (((ed) it.next()).z() == r32) {
                z4 = true;
                break;
            }
        }
        return z4;
    }

    private final synchronized ed j(sc scVar, int r4) {
        dd B;
        int g5 = g();
        if (r4 == 2) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        B = ed.B();
        B.p(scVar);
        B.q(g5);
        B.s(3);
        B.r(r4);
        return (ed) B.f();
    }

    @Deprecated
    public final synchronized int a(xc xcVar, boolean z4) {
        ed h5;
        h5 = h(xcVar);
        this.f1638a.q(h5);
        return h5.z();
    }

    public final synchronized e3 b() {
        return e3.a((fd) this.f1638a.f());
    }

    public final synchronized f3 c(c3 c3Var) {
        a(c3Var.a(), false);
        return this;
    }

    public final synchronized f3 d(int r4) {
        for (int r02 = 0; r02 < this.f1638a.p(); r02++) {
            ed s4 = this.f1638a.s(r02);
            if (s4.z() == r4) {
                if (s4.G() != 3) {
                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + r4);
                }
                this.f1638a.r(r4);
            }
        }
        throw new GeneralSecurityException("key not found: " + r4);
        return this;
    }
}
