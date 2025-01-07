package kotlinx.coroutines.internal;

import b4.q0;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class p<E> {
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a, reason: collision with root package name */
    private final int f6448a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f6449b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6450c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ AtomicReferenceArray f6451d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f6444e = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final y f6447h = new y("REMOVE_FROZEN");

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f6445f = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_next");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f6446g = AtomicLongFieldUpdater.newUpdater(p.class, "_state");

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final int a(long j4) {
            return (j4 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long b(long j4, int r5) {
            return d(j4, 1073741823L) | (r5 << 0);
        }

        public final long c(long j4, int r5) {
            return d(j4, 1152921503533105152L) | (r5 << 30);
        }

        public final long d(long j4, long j5) {
            return j4 & (~j5);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f6452a;

        public b(int r12) {
            this.f6452a = r12;
        }
    }

    public p(int r5, boolean z4) {
        this.f6448a = r5;
        this.f6449b = z4;
        int r6 = r5 - 1;
        this.f6450c = r6;
        this.f6451d = new AtomicReferenceArray(r5);
        if (!(r6 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((r5 & r6) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final p<E> b(long j4) {
        p<E> pVar = new p<>(this.f6448a * 2, this.f6449b);
        int r22 = (int) ((1073741823 & j4) >> 0);
        int r12 = (int) ((1152921503533105152L & j4) >> 30);
        while (true) {
            int r32 = this.f6450c;
            if ((r22 & r32) == (r12 & r32)) {
                pVar._state = f6444e.d(j4, 1152921504606846976L);
                return pVar;
            }
            Object obj = this.f6451d.get(r32 & r22);
            if (obj == null) {
                obj = new b(r22);
            }
            pVar.f6451d.set(pVar.f6450c & r22, obj);
            r22++;
        }
    }

    private final p<E> c(long j4) {
        while (true) {
            p<E> pVar = (p) this._next;
            if (pVar != null) {
                return pVar;
            }
            b4.l.a(f6445f, this, null, b(j4));
        }
    }

    private final p<E> e(int r32, E e5) {
        Object obj = this.f6451d.get(this.f6450c & r32);
        if (!(obj instanceof b) || ((b) obj).f6452a != r32) {
            return null;
        }
        this.f6451d.set(r32 & this.f6450c, e5);
        return this;
    }

    private final long h() {
        long j4;
        long j5;
        do {
            j4 = this._state;
            if ((j4 & 1152921504606846976L) != 0) {
                return j4;
            }
            j5 = j4 | 1152921504606846976L;
        } while (!f6446g.compareAndSet(this, j4, j5));
        return j5;
    }

    private final p<E> k(int r10, int r11) {
        long j4;
        a aVar;
        int r6;
        do {
            j4 = this._state;
            aVar = f6444e;
            r6 = (int) ((1073741823 & j4) >> 0);
            if (q0.a()) {
                if (!(r6 == r10)) {
                    throw new AssertionError();
                }
            }
            if ((1152921504606846976L & j4) != 0) {
                return i();
            }
        } while (!f6446g.compareAndSet(this, j4, aVar.b(j4, r11)));
        this.f6451d.set(this.f6450c & r6, null);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x004e, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(E r14) {
        /*
            r13 = this;
        L0:
            long r2 = r13._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 == 0) goto L12
            kotlinx.coroutines.internal.p$a r14 = kotlinx.coroutines.internal.p.f6444e
            int r14 = r14.a(r2)
            return r14
        L12:
            kotlinx.coroutines.internal.p$a r0 = kotlinx.coroutines.internal.p.f6444e
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            r8 = 0
            long r4 = r4 >> r8
            int r1 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r9 = 30
            long r4 = r4 >> r9
            int r9 = (int) r4
            int r10 = r13.f6450c
            int r4 = r9 + 2
            r4 = r4 & r10
            r5 = r1 & r10
            r11 = 1
            if (r4 != r5) goto L30
            return r11
        L30:
            boolean r4 = r13.f6449b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r4 != 0) goto L4f
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r13.f6451d
            r12 = r9 & r10
            java.lang.Object r4 = r4.get(r12)
            if (r4 == 0) goto L4f
            int r0 = r13.f6448a
            r2 = 1024(0x400, float:1.435E-42)
            if (r0 < r2) goto L4e
            int r9 = r9 - r1
            r1 = r9 & r5
            int r0 = r0 >> 1
            if (r1 <= r0) goto L0
        L4e:
            return r11
        L4f:
            int r1 = r9 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = kotlinx.coroutines.internal.p.f6446g
            long r11 = r0.c(r2, r1)
            r0 = r4
            r1 = r13
            r4 = r11
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r13.f6451d
            r1 = r9 & r10
            r0.set(r1, r14)
            r0 = r13
        L69:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 != 0) goto L73
            goto L7d
        L73:
            kotlinx.coroutines.internal.p r0 = r0.i()
            kotlinx.coroutines.internal.p r0 = r0.e(r9, r14)
            if (r0 != 0) goto L69
        L7d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.p.a(java.lang.Object):int");
    }

    public final boolean d() {
        long j4;
        do {
            j4 = this._state;
            if ((j4 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j4) != 0) {
                return false;
            }
        } while (!f6446g.compareAndSet(this, j4, j4 | 2305843009213693952L));
        return true;
    }

    public final int f() {
        long j4 = this._state;
        return 1073741823 & (((int) ((j4 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j4) >> 0)));
    }

    public final boolean g() {
        long j4 = this._state;
        return ((int) ((1073741823 & j4) >> 0)) == ((int) ((j4 & 1152921503533105152L) >> 30));
    }

    public final p<E> i() {
        return c(h());
    }

    public final Object j() {
        while (true) {
            long j4 = this._state;
            if ((1152921504606846976L & j4) != 0) {
                return f6447h;
            }
            a aVar = f6444e;
            int r6 = (int) ((1073741823 & j4) >> 0);
            int r12 = (int) ((1152921503533105152L & j4) >> 30);
            int r4 = this.f6450c;
            if ((r12 & r4) == (r6 & r4)) {
                return null;
            }
            Object obj = this.f6451d.get(r4 & r6);
            if (obj == null) {
                if (this.f6449b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int r9 = (r6 + 1) & 1073741823;
                if (f6446g.compareAndSet(this, j4, aVar.b(j4, r9))) {
                    this.f6451d.set(this.f6450c & r6, null);
                    return obj;
                }
                if (this.f6449b) {
                    p<E> pVar = this;
                    do {
                        pVar = pVar.k(r6, r9);
                    } while (pVar != null);
                    return obj;
                }
            }
        }
    }
}
