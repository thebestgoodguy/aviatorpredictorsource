package a4;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes.dex */
final class c implements z3.b<x3.c> {

    /* renamed from: a, reason: collision with root package name */
    private final CharSequence f158a;

    /* renamed from: b, reason: collision with root package name */
    private final int f159b;

    /* renamed from: c, reason: collision with root package name */
    private final int f160c;

    /* renamed from: d, reason: collision with root package name */
    private final u3.p<CharSequence, Integer, k3.l<Integer, Integer>> f161d;

    public static final class a implements Iterator<x3.c> {

        /* renamed from: e, reason: collision with root package name */
        private int f162e = -1;

        /* renamed from: f, reason: collision with root package name */
        private int f163f;

        /* renamed from: g, reason: collision with root package name */
        private int f164g;

        /* renamed from: h, reason: collision with root package name */
        private x3.c f165h;

        /* renamed from: i, reason: collision with root package name */
        private int f166i;

        a() {
            int e5;
            e5 = x3.f.e(c.this.f159b, 0, c.this.f158a.length());
            this.f163f = e5;
            this.f164g = e5;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            if (r0 < r6.f167j.f160c) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void c() {
            /*
                r6 = this;
                int r0 = r6.f164g
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f162e = r1
                r0 = 0
                r6.f165h = r0
                goto L99
            Lc:
                a4.c r0 = a4.c.this
                int r0 = a4.c.c(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f166i
                int r0 = r0 + r3
                r6.f166i = r0
                a4.c r4 = a4.c.this
                int r4 = a4.c.c(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f164g
                a4.c r4 = a4.c.this
                java.lang.CharSequence r4 = a4.c.b(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                x3.c r0 = new x3.c
                int r1 = r6.f163f
                a4.c r4 = a4.c.this
                java.lang.CharSequence r4 = a4.c.b(r4)
                int r4 = a4.n.u(r4)
                r0.<init>(r1, r4)
            L42:
                r6.f165h = r0
            L44:
                r6.f164g = r2
                goto L97
            L47:
                a4.c r0 = a4.c.this
                u3.p r0 = a4.c.a(r0)
                a4.c r4 = a4.c.this
                java.lang.CharSequence r4 = a4.c.b(r4)
                int r5 = r6.f164g
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                k3.l r0 = (k3.l) r0
                if (r0 != 0) goto L73
                x3.c r0 = new x3.c
                int r1 = r6.f163f
                a4.c r4 = a4.c.this
                java.lang.CharSequence r4 = a4.c.b(r4)
                int r4 = a4.n.u(r4)
                r0.<init>(r1, r4)
                goto L42
            L73:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f163f
                x3.c r4 = x3.d.g(r4, r2)
                r6.f165h = r4
                int r2 = r2 + r0
                r6.f163f = r2
                if (r0 != 0) goto L95
                r1 = 1
            L95:
                int r2 = r2 + r1
                goto L44
            L97:
                r6.f162e = r3
            L99:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a4.c.a.c():void");
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public x3.c next() {
            if (this.f162e == -1) {
                c();
            }
            if (this.f162e == 0) {
                throw new NoSuchElementException();
            }
            x3.c cVar = this.f165h;
            Objects.requireNonNull(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f165h = null;
            this.f162e = -1;
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f162e == -1) {
                c();
            }
            return this.f162e == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(CharSequence charSequence, int r32, int r4, u3.p<? super CharSequence, ? super Integer, k3.l<Integer, Integer>> pVar) {
        kotlin.jvm.internal.i.d(charSequence, "input");
        kotlin.jvm.internal.i.d(pVar, "getNextMatch");
        this.f158a = charSequence;
        this.f159b = r32;
        this.f160c = r4;
        this.f161d = pVar;
    }

    @Override // z3.b
    public Iterator<x3.c> iterator() {
        return new a();
    }
}
