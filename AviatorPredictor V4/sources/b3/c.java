package b3;

import b3.k;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import q0.h;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: k, reason: collision with root package name */
    public static final c f699k = new c();

    /* renamed from: a, reason: collision with root package name */
    private t f700a;

    /* renamed from: b, reason: collision with root package name */
    private Executor f701b;

    /* renamed from: c, reason: collision with root package name */
    private String f702c;

    /* renamed from: d, reason: collision with root package name */
    private b f703d;

    /* renamed from: e, reason: collision with root package name */
    private String f704e;

    /* renamed from: f, reason: collision with root package name */
    private Object[][] f705f;

    /* renamed from: g, reason: collision with root package name */
    private List<k.a> f706g;

    /* renamed from: h, reason: collision with root package name */
    private Boolean f707h;

    /* renamed from: i, reason: collision with root package name */
    private Integer f708i;

    /* renamed from: j, reason: collision with root package name */
    private Integer f709j;

    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final String f710a;

        /* renamed from: b, reason: collision with root package name */
        private final T f711b;

        private a(String str, T t4) {
            this.f710a = str;
            this.f711b = t4;
        }

        public static <T> a<T> b(String str) {
            q0.l.o(str, "debugString");
            return new a<>(str, null);
        }

        public String toString() {
            return this.f710a;
        }
    }

    private c() {
        this.f706g = Collections.emptyList();
        this.f705f = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
    }

    private c(c cVar) {
        this.f706g = Collections.emptyList();
        this.f700a = cVar.f700a;
        this.f702c = cVar.f702c;
        this.f703d = cVar.f703d;
        this.f701b = cVar.f701b;
        this.f704e = cVar.f704e;
        this.f705f = cVar.f705f;
        this.f707h = cVar.f707h;
        this.f708i = cVar.f708i;
        this.f709j = cVar.f709j;
        this.f706g = cVar.f706g;
    }

    public String a() {
        return this.f702c;
    }

    public String b() {
        return this.f704e;
    }

    public b c() {
        return this.f703d;
    }

    public t d() {
        return this.f700a;
    }

    public Executor e() {
        return this.f701b;
    }

    public Integer f() {
        return this.f708i;
    }

    public Integer g() {
        return this.f709j;
    }

    public <T> T h(a<T> aVar) {
        q0.l.o(aVar, "key");
        int r12 = 0;
        while (true) {
            Object[][] objArr = this.f705f;
            if (r12 >= objArr.length) {
                return (T) ((a) aVar).f711b;
            }
            if (aVar.equals(objArr[r12][0])) {
                return (T) this.f705f[r12][1];
            }
            r12++;
        }
    }

    public List<k.a> i() {
        return this.f706g;
    }

    public boolean j() {
        return Boolean.TRUE.equals(this.f707h);
    }

    public c k(b bVar) {
        c cVar = new c(this);
        cVar.f703d = bVar;
        return cVar;
    }

    public c l(t tVar) {
        c cVar = new c(this);
        cVar.f700a = tVar;
        return cVar;
    }

    public c m(Executor executor) {
        c cVar = new c(this);
        cVar.f701b = executor;
        return cVar;
    }

    public c n(int r32) {
        q0.l.h(r32 >= 0, "invalid maxsize %s", r32);
        c cVar = new c(this);
        cVar.f708i = Integer.valueOf(r32);
        return cVar;
    }

    public c o(int r32) {
        q0.l.h(r32 >= 0, "invalid maxsize %s", r32);
        c cVar = new c(this);
        cVar.f709j = Integer.valueOf(r32);
        return cVar;
    }

    public <T> c p(a<T> aVar, T t4) {
        q0.l.o(aVar, "key");
        q0.l.o(t4, "value");
        c cVar = new c(this);
        int r22 = 0;
        while (true) {
            Object[][] objArr = this.f705f;
            if (r22 >= objArr.length) {
                r22 = -1;
                break;
            }
            if (aVar.equals(objArr[r22][0])) {
                break;
            }
            r22++;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, this.f705f.length + (r22 == -1 ? 1 : 0), 2);
        cVar.f705f = objArr2;
        Object[][] objArr3 = this.f705f;
        System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
        if (r22 == -1) {
            cVar.f705f[this.f705f.length] = new Object[]{aVar, t4};
        } else {
            cVar.f705f[r22] = new Object[]{aVar, t4};
        }
        return cVar;
    }

    public c q(k.a aVar) {
        c cVar = new c(this);
        ArrayList arrayList = new ArrayList(this.f706g.size() + 1);
        arrayList.addAll(this.f706g);
        arrayList.add(aVar);
        cVar.f706g = Collections.unmodifiableList(arrayList);
        return cVar;
    }

    public c r() {
        c cVar = new c(this);
        cVar.f707h = Boolean.TRUE;
        return cVar;
    }

    public c s() {
        c cVar = new c(this);
        cVar.f707h = Boolean.FALSE;
        return cVar;
    }

    public String toString() {
        h.b d5 = q0.h.c(this).d("deadline", this.f700a).d("authority", this.f702c).d("callCredentials", this.f703d);
        Executor executor = this.f701b;
        return d5.d("executor", executor != null ? executor.getClass() : null).d("compressorName", this.f704e).d("customOptions", Arrays.deepToString(this.f705f)).e("waitForReady", j()).d("maxInboundMessageSize", this.f708i).d("maxOutboundMessageSize", this.f709j).d("streamTracerFactories", this.f706g).toString();
    }
}
