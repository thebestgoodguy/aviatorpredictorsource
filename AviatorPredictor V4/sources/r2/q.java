package r2;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import r2.p;

/* loaded from: classes.dex */
public final class q implements k {

    /* renamed from: b, reason: collision with root package name */
    public static final q f7470b = new q(p.f7467a);

    /* renamed from: a, reason: collision with root package name */
    private final p f7471a;

    public q(p pVar) {
        this.f7471a = pVar;
    }

    private static String g(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // r2.k
    public ByteBuffer a(Object obj) {
        p.a aVar = new p.a();
        aVar.write(0);
        this.f7471a.p(aVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    @Override // r2.k
    public i b(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        Object f5 = this.f7471a.f(byteBuffer);
        Object f6 = this.f7471a.f(byteBuffer);
        if (!(f5 instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new i((String) f5, f6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 == 1) goto L10;
     */
    @Override // r2.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(java.nio.ByteBuffer r5) {
        /*
            r4 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            r5.order(r0)
            byte r0 = r5.get()
            if (r0 == 0) goto L11
            r1 = 1
            if (r0 != r1) goto L4a
            goto L1e
        L11:
            r2.p r0 = r4.f7471a
            java.lang.Object r0 = r0.f(r5)
            boolean r1 = r5.hasRemaining()
            if (r1 != 0) goto L1e
            return r0
        L1e:
            r2.p r0 = r4.f7471a
            java.lang.Object r0 = r0.f(r5)
            r2.p r1 = r4.f7471a
            java.lang.Object r1 = r1.f(r5)
            r2.p r2 = r4.f7471a
            java.lang.Object r2 = r2.f(r5)
            boolean r3 = r0 instanceof java.lang.String
            if (r3 == 0) goto L4a
            if (r1 == 0) goto L3a
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L4a
        L3a:
            boolean r5 = r5.hasRemaining()
            if (r5 != 0) goto L4a
            r2.d r5 = new r2.d
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = (java.lang.String) r1
            r5.<init>(r0, r1, r2)
            throw r5
        L4a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Envelope corrupted"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.q.c(java.nio.ByteBuffer):java.lang.Object");
    }

    @Override // r2.k
    public ByteBuffer d(String str, String str2, Object obj, String str3) {
        p.a aVar = new p.a();
        aVar.write(1);
        this.f7471a.p(aVar, str);
        this.f7471a.p(aVar, str2);
        if (obj instanceof Throwable) {
            this.f7471a.p(aVar, g((Throwable) obj));
        } else {
            this.f7471a.p(aVar, obj);
        }
        this.f7471a.p(aVar, str3);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    @Override // r2.k
    public ByteBuffer e(i iVar) {
        p.a aVar = new p.a();
        this.f7471a.p(aVar, iVar.f7455a);
        this.f7471a.p(aVar, iVar.f7456b);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    @Override // r2.k
    public ByteBuffer f(String str, String str2, Object obj) {
        p.a aVar = new p.a();
        aVar.write(1);
        this.f7471a.p(aVar, str);
        this.f7471a.p(aVar, str2);
        if (obj instanceof Throwable) {
            this.f7471a.p(aVar, g((Throwable) obj));
        } else {
            this.f7471a.p(aVar, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }
}
