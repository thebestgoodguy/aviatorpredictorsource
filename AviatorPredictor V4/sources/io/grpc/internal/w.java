package io.grpc.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class w {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<a> f5697a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private volatile b3.p f5698b = b3.p.IDLE;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        final Runnable f5699a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f5700b;

        a(Runnable runnable, Executor executor) {
            this.f5699a = runnable;
            this.f5700b = executor;
        }

        void a() {
            this.f5700b.execute(this.f5699a);
        }
    }

    w() {
    }

    b3.p a() {
        b3.p pVar = this.f5698b;
        if (pVar != null) {
            return pVar;
        }
        throw new UnsupportedOperationException("Channel state API is not implemented");
    }

    void b(b3.p pVar) {
        q0.l.o(pVar, "newState");
        if (this.f5698b == pVar || this.f5698b == b3.p.SHUTDOWN) {
            return;
        }
        this.f5698b = pVar;
        if (this.f5697a.isEmpty()) {
            return;
        }
        ArrayList<a> arrayList = this.f5697a;
        this.f5697a = new ArrayList<>();
        Iterator<a> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    void c(Runnable runnable, Executor executor, b3.p pVar) {
        q0.l.o(runnable, "callback");
        q0.l.o(executor, "executor");
        q0.l.o(pVar, "source");
        a aVar = new a(runnable, executor);
        if (this.f5698b != pVar) {
            aVar.a();
        } else {
            this.f5697a.add(aVar);
        }
    }
}
