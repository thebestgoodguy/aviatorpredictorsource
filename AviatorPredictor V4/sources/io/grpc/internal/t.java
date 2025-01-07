package io.grpc.internal;

import java.io.Closeable;
import java.net.SocketAddress;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public interface t extends Closeable {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f5654a = "unknown-authority";

        /* renamed from: b, reason: collision with root package name */
        private b3.a f5655b = b3.a.f683b;

        /* renamed from: c, reason: collision with root package name */
        private String f5656c;

        /* renamed from: d, reason: collision with root package name */
        private b3.b0 f5657d;

        public String a() {
            return this.f5654a;
        }

        public b3.a b() {
            return this.f5655b;
        }

        public b3.b0 c() {
            return this.f5657d;
        }

        public String d() {
            return this.f5656c;
        }

        public a e(String str) {
            this.f5654a = (String) q0.l.o(str, "authority");
            return this;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f5654a.equals(aVar.f5654a) && this.f5655b.equals(aVar.f5655b) && q0.i.a(this.f5656c, aVar.f5656c) && q0.i.a(this.f5657d, aVar.f5657d);
        }

        public a f(b3.a aVar) {
            q0.l.o(aVar, "eagAttributes");
            this.f5655b = aVar;
            return this;
        }

        public a g(b3.b0 b0Var) {
            this.f5657d = b0Var;
            return this;
        }

        public a h(String str) {
            this.f5656c = str;
            return this;
        }

        public int hashCode() {
            return q0.i.b(this.f5654a, this.f5655b, this.f5656c, this.f5657d);
        }
    }

    ScheduledExecutorService B();

    v V(SocketAddress socketAddress, a aVar, b3.f fVar);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();
}
