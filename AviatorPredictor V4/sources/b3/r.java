package b3;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class r {

    /* renamed from: c, reason: collision with root package name */
    static final Logger f884c = Logger.getLogger(r.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public static final r f885d = new r();

    /* renamed from: a, reason: collision with root package name */
    final a1<Object, Object> f886a = null;

    /* renamed from: b, reason: collision with root package name */
    final int f887b = 0;

    public interface a {
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final c f888a;

        static {
            AtomicReference atomicReference = new AtomicReference();
            f888a = a(atomicReference);
            Throwable th = (Throwable) atomicReference.get();
            if (th != null) {
                r.f884c.log(Level.FINE, "Storage override doesn't exist. Using default", th);
            }
        }

        private static c a(AtomicReference<? super ClassNotFoundException> atomicReference) {
            try {
                return (c) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(c.class).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e5) {
                atomicReference.set(e5);
                return new k1();
            } catch (Exception e6) {
                throw new RuntimeException("Storage override failed to initialize", e6);
            }
        }
    }

    public static abstract class c {
        @Deprecated
        public void a(r rVar) {
            throw new UnsupportedOperationException("Deprecated. Do not call.");
        }

        public abstract r b();

        public abstract void c(r rVar, r rVar2);

        public r d(r rVar) {
            r b5 = b();
            a(rVar);
            return b5;
        }
    }

    private r() {
        k(0);
    }

    static <T> T d(T t4, Object obj) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static r e() {
        r b5 = j().b();
        return b5 == null ? f885d : b5;
    }

    static c j() {
        return b.f888a;
    }

    private static void k(int r32) {
        if (r32 == 1000) {
            f884c.log(Level.SEVERE, "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", (Throwable) new Exception());
        }
    }

    public void a(a aVar, Executor executor) {
        d(aVar, "cancellationListener");
        d(executor, "executor");
    }

    public r b() {
        r d5 = j().d(this);
        return d5 == null ? f885d : d5;
    }

    public Throwable c() {
        return null;
    }

    public void f(r rVar) {
        d(rVar, "toAttach");
        j().c(this, rVar);
    }

    public t g() {
        return null;
    }

    public boolean h() {
        return false;
    }

    public void i(a aVar) {
    }
}
