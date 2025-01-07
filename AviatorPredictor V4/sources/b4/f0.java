package b4;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f1000a;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
    
        if (r0.equals("on") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        if (r0.equals("") != false) goto L21;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.scheduler"
            java.lang.String r0 = kotlinx.coroutines.internal.z.d(r0)
            if (r0 == 0) goto L53
            int r1 = r0.hashCode()
            if (r1 == 0) goto L2a
            r2 = 3551(0xddf, float:4.976E-42)
            if (r1 == r2) goto L21
            r2 = 109935(0x1ad6f, float:1.54052E-40)
            if (r1 != r2) goto L33
            java.lang.String r1 = "off"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L33
            r0 = 0
            goto L54
        L21:
            java.lang.String r1 = "on"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L33
            goto L53
        L2a:
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L33
            goto L53
        L33:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "System property 'kotlinx.coroutines.scheduler' has unrecognized value '"
            r1.append(r2)
            r1.append(r0)
            r0 = 39
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L53:
            r0 = 1
        L54:
            b4.f0.f1000a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.f0.<clinit>():void");
    }

    public static final g0 a() {
        return f1000a ? kotlinx.coroutines.scheduling.b.f6494l : w.f1055g;
    }

    public static final String b(n3.g gVar) {
        k0 k0Var;
        String F;
        if (!q0.c() || (k0Var = (k0) gVar.get(k0.f1014f)) == null) {
            return null;
        }
        l0 l0Var = (l0) gVar.get(l0.f1018f);
        String str = "coroutine";
        if (l0Var != null && (F = l0Var.F()) != null) {
            str = F;
        }
        return str + '#' + k0Var.F();
    }

    public static final n3.g c(m0 m0Var, n3.g gVar) {
        n3.g plus = m0Var.c().plus(gVar);
        n3.g plus2 = q0.c() ? plus.plus(new k0(q0.b().incrementAndGet())) : plus;
        return (plus == x0.a() || plus.get(n3.e.f6691d) != null) ? plus2 : plus2.plus(x0.a());
    }

    public static final i2<?> d(kotlin.coroutines.jvm.internal.e eVar) {
        while (!(eVar instanceof t0) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof i2) {
                return (i2) eVar;
            }
        }
        return null;
    }

    public static final i2<?> e(n3.d<?> dVar, n3.g gVar, Object obj) {
        if (!(dVar instanceof kotlin.coroutines.jvm.internal.e)) {
            return null;
        }
        if (!(gVar.get(j2.f1013e) != null)) {
            return null;
        }
        i2<?> d5 = d((kotlin.coroutines.jvm.internal.e) dVar);
        if (d5 != null) {
            d5.z0(gVar, obj);
        }
        return d5;
    }
}
