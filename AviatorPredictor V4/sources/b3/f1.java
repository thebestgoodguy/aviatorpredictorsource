package b3;

import b3.u0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import q0.h;

/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f754d = Boolean.parseBoolean(System.getProperty("io.grpc.Status.failOnEqualsForTest", "false"));

    /* renamed from: e, reason: collision with root package name */
    private static final List<f1> f755e = f();

    /* renamed from: f, reason: collision with root package name */
    public static final f1 f756f = b.OK.g();

    /* renamed from: g, reason: collision with root package name */
    public static final f1 f757g = b.CANCELLED.g();

    /* renamed from: h, reason: collision with root package name */
    public static final f1 f758h = b.UNKNOWN.g();

    /* renamed from: i, reason: collision with root package name */
    public static final f1 f759i = b.INVALID_ARGUMENT.g();

    /* renamed from: j, reason: collision with root package name */
    public static final f1 f760j = b.DEADLINE_EXCEEDED.g();

    /* renamed from: k, reason: collision with root package name */
    public static final f1 f761k = b.NOT_FOUND.g();

    /* renamed from: l, reason: collision with root package name */
    public static final f1 f762l = b.ALREADY_EXISTS.g();

    /* renamed from: m, reason: collision with root package name */
    public static final f1 f763m = b.PERMISSION_DENIED.g();

    /* renamed from: n, reason: collision with root package name */
    public static final f1 f764n = b.UNAUTHENTICATED.g();

    /* renamed from: o, reason: collision with root package name */
    public static final f1 f765o = b.RESOURCE_EXHAUSTED.g();

    /* renamed from: p, reason: collision with root package name */
    public static final f1 f766p = b.FAILED_PRECONDITION.g();

    /* renamed from: q, reason: collision with root package name */
    public static final f1 f767q = b.ABORTED.g();

    /* renamed from: r, reason: collision with root package name */
    public static final f1 f768r = b.OUT_OF_RANGE.g();

    /* renamed from: s, reason: collision with root package name */
    public static final f1 f769s = b.UNIMPLEMENTED.g();

    /* renamed from: t, reason: collision with root package name */
    public static final f1 f770t = b.INTERNAL.g();

    /* renamed from: u, reason: collision with root package name */
    public static final f1 f771u = b.UNAVAILABLE.g();

    /* renamed from: v, reason: collision with root package name */
    public static final f1 f772v = b.DATA_LOSS.g();

    /* renamed from: w, reason: collision with root package name */
    static final u0.g<f1> f773w;

    /* renamed from: x, reason: collision with root package name */
    private static final u0.j<String> f774x;

    /* renamed from: y, reason: collision with root package name */
    static final u0.g<String> f775y;

    /* renamed from: a, reason: collision with root package name */
    private final b f776a;

    /* renamed from: b, reason: collision with root package name */
    private final String f777b;

    /* renamed from: c, reason: collision with root package name */
    private final Throwable f778c;

    public enum b {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);


        /* renamed from: e, reason: collision with root package name */
        private final int f797e;

        /* renamed from: f, reason: collision with root package name */
        private final byte[] f798f;

        b(int r32) {
            this.f797e = r32;
            this.f798f = Integer.toString(r32).getBytes(q0.b.f7136a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte[] i() {
            return this.f798f;
        }

        public f1 g() {
            return (f1) f1.f755e.get(this.f797e);
        }

        public int h() {
            return this.f797e;
        }
    }

    private static final class c implements u0.j<f1> {
        private c() {
        }

        @Override // b3.u0.j
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public f1 b(byte[] bArr) {
            return f1.i(bArr);
        }

        @Override // b3.u0.j
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public byte[] a(f1 f1Var) {
            return f1Var.m().i();
        }
    }

    private static final class d implements u0.j<String> {

        /* renamed from: a, reason: collision with root package name */
        private static final byte[] f799a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

        private d() {
        }

        private static boolean c(byte b5) {
            return b5 < 32 || b5 >= 126 || b5 == 37;
        }

        private static String e(byte[] bArr) {
            ByteBuffer allocate = ByteBuffer.allocate(bArr.length);
            int r22 = 0;
            while (r22 < bArr.length) {
                if (bArr[r22] == 37 && r22 + 2 < bArr.length) {
                    try {
                        allocate.put((byte) Integer.parseInt(new String(bArr, r22 + 1, 2, q0.b.f7136a), 16));
                        r22 += 3;
                    } catch (NumberFormatException unused) {
                    }
                }
                allocate.put(bArr[r22]);
                r22++;
            }
            return new String(allocate.array(), 0, allocate.position(), q0.b.f7138c);
        }

        private static byte[] g(byte[] bArr, int r7) {
            byte[] bArr2 = new byte[((bArr.length - r7) * 3) + r7];
            if (r7 != 0) {
                System.arraycopy(bArr, 0, bArr2, 0, r7);
            }
            int r12 = r7;
            while (r7 < bArr.length) {
                byte b5 = bArr[r7];
                if (c(b5)) {
                    bArr2[r12] = 37;
                    byte[] bArr3 = f799a;
                    bArr2[r12 + 1] = bArr3[(b5 >> 4) & 15];
                    bArr2[r12 + 2] = bArr3[b5 & 15];
                    r12 += 3;
                } else {
                    bArr2[r12] = b5;
                    r12++;
                }
                r7++;
            }
            return Arrays.copyOf(bArr2, r12);
        }

        @Override // b3.u0.j
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String b(byte[] bArr) {
            for (int r12 = 0; r12 < bArr.length; r12++) {
                byte b5 = bArr[r12];
                if (b5 < 32 || b5 >= 126 || (b5 == 37 && r12 + 2 < bArr.length)) {
                    return e(bArr);
                }
            }
            return new String(bArr, 0);
        }

        @Override // b3.u0.j
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public byte[] a(String str) {
            byte[] bytes = str.getBytes(q0.b.f7138c);
            for (int r02 = 0; r02 < bytes.length; r02++) {
                if (c(bytes[r02])) {
                    return g(bytes, r02);
                }
            }
            return bytes;
        }
    }

    static {
        f773w = u0.g.g("grpc-status", false, new c());
        d dVar = new d();
        f774x = dVar;
        f775y = u0.g.g("grpc-message", false, dVar);
    }

    private f1(b bVar) {
        this(bVar, null, null);
    }

    private f1(b bVar, String str, Throwable th) {
        this.f776a = (b) q0.l.o(bVar, "code");
        this.f777b = str;
        this.f778c = th;
    }

    private static List<f1> f() {
        TreeMap treeMap = new TreeMap();
        for (b bVar : b.values()) {
            f1 f1Var = (f1) treeMap.put(Integer.valueOf(bVar.h()), new f1(bVar));
            if (f1Var != null) {
                throw new IllegalStateException("Code value duplication between " + f1Var.m().name() + " & " + bVar.name());
            }
        }
        return Collections.unmodifiableList(new ArrayList(treeMap.values()));
    }

    static String g(f1 f1Var) {
        if (f1Var.f777b == null) {
            return f1Var.f776a.toString();
        }
        return f1Var.f776a + ": " + f1Var.f777b;
    }

    public static f1 h(int r32) {
        if (r32 >= 0) {
            List<f1> list = f755e;
            if (r32 <= list.size()) {
                return list.get(r32);
            }
        }
        return f758h.q("Unknown code " + r32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static f1 i(byte[] bArr) {
        return (bArr.length == 1 && bArr[0] == 48) ? f756f : j(bArr);
    }

    private static f1 j(byte[] bArr) {
        int r32;
        int length = bArr.length;
        char c5 = 1;
        if (length != 1) {
            r32 = (length == 2 && bArr[0] >= 48 && bArr[0] <= 57) ? 0 + ((bArr[0] - 48) * 10) : 0;
            return f758h.q("Unknown code " + new String(bArr, q0.b.f7136a));
        }
        c5 = 0;
        if (bArr[c5] >= 48 && bArr[c5] <= 57) {
            int r33 = r32 + (bArr[c5] - 48);
            List<f1> list = f755e;
            if (r33 < list.size()) {
                return list.get(r33);
            }
        }
        return f758h.q("Unknown code " + new String(bArr, q0.b.f7136a));
    }

    public static f1 k(Throwable th) {
        for (Throwable th2 = (Throwable) q0.l.o(th, "t"); th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof g1) {
                return ((g1) th2).a();
            }
            if (th2 instanceof h1) {
                return ((h1) th2).a();
            }
        }
        return f758h.p(th);
    }

    public g1 c() {
        return new g1(this);
    }

    public h1 d() {
        return new h1(this);
    }

    public f1 e(String str) {
        if (str == null) {
            return this;
        }
        if (this.f777b == null) {
            return new f1(this.f776a, str, this.f778c);
        }
        return new f1(this.f776a, this.f777b + "\n" + str, this.f778c);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public Throwable l() {
        return this.f778c;
    }

    public b m() {
        return this.f776a;
    }

    public String n() {
        return this.f777b;
    }

    public boolean o() {
        return b.OK == this.f776a;
    }

    public f1 p(Throwable th) {
        return q0.i.a(this.f778c, th) ? this : new f1(this.f776a, this.f777b, th);
    }

    public f1 q(String str) {
        return q0.i.a(this.f777b, str) ? this : new f1(this.f776a, str, this.f778c);
    }

    public String toString() {
        h.b d5 = q0.h.c(this).d("code", this.f776a.name()).d("description", this.f777b);
        Throwable th = this.f778c;
        Object obj = th;
        if (th != null) {
            obj = q0.q.e(th);
        }
        return d5.d("cause", obj).toString();
    }
}
