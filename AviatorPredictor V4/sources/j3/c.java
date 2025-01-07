package j3;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final a f5961a;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0016 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003b  */
    static {
        /*
            java.util.logging.Level r0 = java.util.logging.Level.WARNING
            r1 = 0
            java.lang.String r2 = "io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> Lb java.lang.ClassNotFoundException -> Le
            r3 = r1
            goto L14
        Lb:
            r2 = move-exception
            r3 = r2
            goto L13
        Le:
            r0 = move-exception
            java.util.logging.Level r2 = java.util.logging.Level.FINE
            r3 = r0
            r0 = r2
        L13:
            r2 = r1
        L14:
            if (r2 == 0) goto L38
            java.lang.Class<j3.a> r4 = j3.a.class
            java.lang.Class r2 = r2.asSubclass(r4)     // Catch: java.lang.Throwable -> L36
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L36
            java.lang.Class<j3.d> r6 = j3.d.class
            r7 = 0
            r5[r7] = r6     // Catch: java.lang.Throwable -> L36
            java.lang.reflect.Constructor r2 = r2.getConstructor(r5)     // Catch: java.lang.Throwable -> L36
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L36
            j3.d r5 = j3.a.f5958a     // Catch: java.lang.Throwable -> L36
            r4[r7] = r5     // Catch: java.lang.Throwable -> L36
            java.lang.Object r2 = r2.newInstance(r4)     // Catch: java.lang.Throwable -> L36
            j3.a r2 = (j3.a) r2     // Catch: java.lang.Throwable -> L36
            r1 = r2
            goto L38
        L36:
            r2 = move-exception
            r3 = r2
        L38:
            if (r1 == 0) goto L3b
            goto L42
        L3b:
            j3.a r1 = new j3.a
            j3.d r2 = j3.a.f5958a
            r1.<init>(r2)
        L42:
            j3.c.f5961a = r1
            if (r3 == 0) goto L55
            java.lang.Class<j3.c> r1 = j3.c.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            java.lang.String r2 = "Error during PerfMark.<clinit>"
            r1.log(r0, r2, r3)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.c.<clinit>():void");
    }

    private c() {
    }

    public static d a(String str) {
        return f5961a.a(str, Long.MIN_VALUE);
    }

    public static d b(String str, long j4) {
        return f5961a.a(str, j4);
    }

    public static void c(String str, d dVar) {
        f5961a.b(str, dVar);
    }

    public static void d(b bVar) {
        f5961a.c(bVar);
    }

    public static b e() {
        return f5961a.d();
    }

    public static void f(String str) {
        f5961a.e(str);
    }

    public static void g(String str, d dVar) {
        f5961a.f(str, dVar);
    }

    public static void h(String str) {
        f5961a.g(str);
    }

    public static void i(String str, d dVar) {
        f5961a.h(str, dVar);
    }
}
