package h4;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    static final Logger f3984a = Logger.getLogger(g.class.getName());

    final class a implements m {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ o f3985e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ OutputStream f3986f;

        a(o oVar, OutputStream outputStream) {
            this.f3985e = oVar;
            this.f3986f = outputStream;
        }

        @Override // h4.m, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f3986f.close();
        }

        @Override // h4.m, java.io.Flushable
        public void flush() {
            this.f3986f.flush();
        }

        public String toString() {
            return "sink(" + this.f3986f + ")";
        }

        @Override // h4.m
        public void w(h4.c cVar, long j4) {
            p.b(cVar.f3977f, 0L, j4);
            while (j4 > 0) {
                this.f3985e.c();
                j jVar = cVar.f3976e;
                int min = (int) Math.min(j4, jVar.f3998c - jVar.f3997b);
                this.f3986f.write(jVar.f3996a, jVar.f3997b, min);
                int r12 = jVar.f3997b + min;
                jVar.f3997b = r12;
                long j5 = min;
                j4 -= j5;
                cVar.f3977f -= j5;
                if (r12 == jVar.f3998c) {
                    cVar.f3976e = jVar.b();
                    k.a(jVar);
                }
            }
        }
    }

    final class b implements n {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ o f3987e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InputStream f3988f;

        b(o oVar, InputStream inputStream) {
            this.f3987e = oVar;
            this.f3988f = inputStream;
        }

        @Override // h4.n, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f3988f.close();
        }

        @Override // h4.n
        public long o(h4.c cVar, long j4) {
            if (j4 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j4);
            }
            if (j4 == 0) {
                return 0L;
            }
            try {
                this.f3987e.c();
                j l02 = cVar.l0(1);
                int read = this.f3988f.read(l02.f3996a, l02.f3998c, (int) Math.min(j4, 8192 - l02.f3998c));
                if (read != -1) {
                    l02.f3998c += read;
                    long j5 = read;
                    cVar.f3977f += j5;
                    return j5;
                }
                if (l02.f3997b != l02.f3998c) {
                    return -1L;
                }
                cVar.f3976e = l02.b();
                k.a(l02);
                return -1L;
            } catch (AssertionError e5) {
                if (g.c(e5)) {
                    throw new IOException(e5);
                }
                throw e5;
            }
        }

        public String toString() {
            return "source(" + this.f3988f + ")";
        }
    }

    final class c extends h4.a {

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Socket f3989k;

        c(Socket socket) {
            this.f3989k = socket;
        }

        @Override // h4.a
        protected IOException k(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h4.a
        protected void p() {
            Level level;
            StringBuilder sb;
            Logger logger;
            Exception exc;
            try {
                this.f3989k.close();
            } catch (AssertionError e5) {
                if (!g.c(e5)) {
                    throw e5;
                }
                Logger logger2 = g.f3984a;
                level = Level.WARNING;
                sb = new StringBuilder();
                exc = e5;
                logger = logger2;
                sb.append("Failed to close timed out socket ");
                sb.append(this.f3989k);
                logger.log(level, sb.toString(), (Throwable) exc);
            } catch (Exception e6) {
                Logger logger3 = g.f3984a;
                level = Level.WARNING;
                sb = new StringBuilder();
                exc = e6;
                logger = logger3;
                sb.append("Failed to close timed out socket ");
                sb.append(this.f3989k);
                logger.log(level, sb.toString(), (Throwable) exc);
            }
        }
    }

    private g() {
    }

    public static d a(m mVar) {
        return new h(mVar);
    }

    public static e b(n nVar) {
        return new i(nVar);
    }

    static boolean c(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    private static m d(OutputStream outputStream, o oVar) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        if (oVar != null) {
            return new a(oVar, outputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }

    public static m e(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getOutputStream() == null) {
            throw new IOException("socket's output stream == null");
        }
        h4.a h5 = h(socket);
        return h5.n(d(socket.getOutputStream(), h5));
    }

    private static n f(InputStream inputStream, o oVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (oVar != null) {
            return new b(oVar, inputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }

    public static n g(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getInputStream() == null) {
            throw new IOException("socket's input stream == null");
        }
        h4.a h5 = h(socket);
        return h5.o(f(socket.getInputStream(), h5));
    }

    private static h4.a h(Socket socket) {
        return new c(socket);
    }
}
