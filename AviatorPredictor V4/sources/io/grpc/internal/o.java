package io.grpc.internal;

import b3.d0;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* loaded from: classes.dex */
final class o {

    /* renamed from: f, reason: collision with root package name */
    static final Logger f5497f = Logger.getLogger(b3.f.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final Object f5498a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final b3.h0 f5499b;

    /* renamed from: c, reason: collision with root package name */
    private final Collection<b3.d0> f5500c;

    /* renamed from: d, reason: collision with root package name */
    private final long f5501d;

    /* renamed from: e, reason: collision with root package name */
    private int f5502e;

    class a extends ArrayDeque<b3.d0> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f5503e;

        a(int r22) {
            this.f5503e = r22;
        }

        @Override // java.util.ArrayDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public boolean add(b3.d0 d0Var) {
            if (size() == this.f5503e) {
                removeFirst();
            }
            o.a(o.this);
            return super.add(d0Var);
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5505a;

        static {
            int[] r02 = new int[d0.b.values().length];
            f5505a = r02;
            try {
                r02[d0.b.CT_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5505a[d0.b.CT_WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    o(b3.h0 h0Var, int r32, long j4, String str) {
        q0.l.o(str, "description");
        this.f5499b = (b3.h0) q0.l.o(h0Var, "logId");
        this.f5500c = r32 > 0 ? new a(r32) : null;
        this.f5501d = j4;
        e(new d0.a().b(str + " created").c(d0.b.CT_INFO).e(j4).a());
    }

    static /* synthetic */ int a(o oVar) {
        int r02 = oVar.f5502e;
        oVar.f5502e = r02 + 1;
        return r02;
    }

    static void d(b3.h0 h0Var, Level level, String str) {
        Logger logger = f5497f;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + h0Var + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    b3.h0 b() {
        return this.f5499b;
    }

    boolean c() {
        boolean z4;
        synchronized (this.f5498a) {
            z4 = this.f5500c != null;
        }
        return z4;
    }

    void e(b3.d0 d0Var) {
        int r02 = b.f5505a[d0Var.f724b.ordinal()];
        Level level = r02 != 1 ? r02 != 2 ? Level.FINEST : Level.FINER : Level.FINE;
        f(d0Var);
        d(this.f5499b, level, d0Var.f723a);
    }

    void f(b3.d0 d0Var) {
        synchronized (this.f5498a) {
            Collection<b3.d0> collection = this.f5500c;
            if (collection != null) {
                collection.add(d0Var);
            }
        }
    }
}
