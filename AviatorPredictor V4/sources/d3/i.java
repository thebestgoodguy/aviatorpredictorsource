package d3;

import java.util.EnumMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
class i {

    /* renamed from: a, reason: collision with root package name */
    private final Logger f3348a;

    /* renamed from: b, reason: collision with root package name */
    private final Level f3349b;

    enum a {
        INBOUND,
        OUTBOUND
    }

    private enum b {
        HEADER_TABLE_SIZE(1),
        ENABLE_PUSH(2),
        MAX_CONCURRENT_STREAMS(4),
        MAX_FRAME_SIZE(5),
        MAX_HEADER_LIST_SIZE(6),
        INITIAL_WINDOW_SIZE(7);


        /* renamed from: e, reason: collision with root package name */
        private final int f3360e;

        b(int r32) {
            this.f3360e = r32;
        }

        public int d() {
            return this.f3360e;
        }
    }

    i(Level level, Class<?> cls) {
        this(level, Logger.getLogger(cls.getName()));
    }

    i(Level level, Logger logger) {
        this.f3349b = (Level) q0.l.o(level, "level");
        this.f3348a = (Logger) q0.l.o(logger, "logger");
    }

    private boolean a() {
        return this.f3348a.isLoggable(this.f3349b);
    }

    private static String l(f3.i iVar) {
        EnumMap enumMap = new EnumMap(b.class);
        for (b bVar : b.values()) {
            if (iVar.d(bVar.d())) {
                enumMap.put((EnumMap) bVar, (b) Integer.valueOf(iVar.a(bVar.d())));
            }
        }
        return enumMap.toString();
    }

    private static String m(h4.c cVar) {
        if (cVar.i0() <= 64) {
            return cVar.j0().n();
        }
        return cVar.k0((int) Math.min(cVar.i0(), 64L)).n() + "...";
    }

    void b(a aVar, int r5, h4.c cVar, int r7, boolean z4) {
        if (a()) {
            this.f3348a.log(this.f3349b, aVar + " DATA: streamId=" + r5 + " endStream=" + z4 + " length=" + r7 + " bytes=" + m(cVar));
        }
    }

    void c(a aVar, int r5, f3.a aVar2, h4.f fVar) {
        if (a()) {
            this.f3348a.log(this.f3349b, aVar + " GO_AWAY: lastStreamId=" + r5 + " errorCode=" + aVar2 + " length=" + fVar.s() + " bytes=" + m(new h4.c().m0(fVar)));
        }
    }

    void d(a aVar, int r5, List<f3.d> list, boolean z4) {
        if (a()) {
            this.f3348a.log(this.f3349b, aVar + " HEADERS: streamId=" + r5 + " headers=" + list + " endStream=" + z4);
        }
    }

    void e(a aVar, long j4) {
        if (a()) {
            this.f3348a.log(this.f3349b, aVar + " PING: ack=false bytes=" + j4);
        }
    }

    void f(a aVar, long j4) {
        if (a()) {
            this.f3348a.log(this.f3349b, aVar + " PING: ack=true bytes=" + j4);
        }
    }

    void g(a aVar, int r5, int r6, List<f3.d> list) {
        if (a()) {
            this.f3348a.log(this.f3349b, aVar + " PUSH_PROMISE: streamId=" + r5 + " promisedStreamId=" + r6 + " headers=" + list);
        }
    }

    void h(a aVar, int r5, f3.a aVar2) {
        if (a()) {
            this.f3348a.log(this.f3349b, aVar + " RST_STREAM: streamId=" + r5 + " errorCode=" + aVar2);
        }
    }

    void i(a aVar, f3.i iVar) {
        if (a()) {
            this.f3348a.log(this.f3349b, aVar + " SETTINGS: ack=false settings=" + l(iVar));
        }
    }

    void j(a aVar) {
        if (a()) {
            this.f3348a.log(this.f3349b, aVar + " SETTINGS: ack=true");
        }
    }

    void k(a aVar, int r5, long j4) {
        if (a()) {
            this.f3348a.log(this.f3349b, aVar + " WINDOW_UPDATE: streamId=" + r5 + " windowSizeIncrement=" + j4);
        }
    }
}
