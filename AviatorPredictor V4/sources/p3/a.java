package p3;

import java.lang.reflect.Method;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public class a {

    /* renamed from: p3.a$a, reason: collision with other inner class name */
    private static final class C0075a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0075a f7123a = new C0075a();

        /* renamed from: b, reason: collision with root package name */
        public static final Method f7124b;

        /* renamed from: c, reason: collision with root package name */
        public static final Method f7125c;

        /* JADX WARN: Removed duplicated region for block: B:11:0x0042 A[EDGE_INSN: B:11:0x0042->B:12:0x0042 BREAK  A[LOOP:0: B:2:0x0015->B:23:?], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:23:? A[LOOP:0: B:2:0x0015->B:23:?, LOOP_END, SYNTHETIC] */
        static {
            /*
                p3.a$a r0 = new p3.a$a
                r0.<init>()
                p3.a.C0075a.f7123a = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                kotlin.jvm.internal.i.c(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = 0
            L15:
                r5 = 0
                if (r4 >= r2) goto L41
                r6 = r1[r4]
                int r4 = r4 + 1
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = kotlin.jvm.internal.i.a(r7, r8)
                if (r7 == 0) goto L3d
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "it.parameterTypes"
                kotlin.jvm.internal.i.c(r7, r8)
                java.lang.Object r7 = l3.a.h(r7)
                boolean r7 = kotlin.jvm.internal.i.a(r7, r0)
                if (r7 == 0) goto L3d
                r7 = 1
                goto L3e
            L3d:
                r7 = 0
            L3e:
                if (r7 == 0) goto L15
                goto L42
            L41:
                r6 = r5
            L42:
                p3.a.C0075a.f7124b = r6
                int r0 = r1.length
            L45:
                if (r3 >= r0) goto L58
                r2 = r1[r3]
                int r3 = r3 + 1
                java.lang.String r4 = r2.getName()
                java.lang.String r6 = "getSuppressed"
                boolean r4 = kotlin.jvm.internal.i.a(r4, r6)
                if (r4 == 0) goto L45
                r5 = r2
            L58:
                p3.a.C0075a.f7125c = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p3.a.C0075a.<clinit>():void");
        }

        private C0075a() {
        }
    }

    public void a(Throwable th, Throwable th2) {
        i.d(th, "cause");
        i.d(th2, "exception");
        Method method = C0075a.f7124b;
        if (method == null) {
            return;
        }
        method.invoke(th, th2);
    }

    public v3.c b() {
        return new v3.b();
    }
}
