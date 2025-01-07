package c2;

import c2.b;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final c f1156a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1157b;

    /* renamed from: c, reason: collision with root package name */
    private final c2.b f1158c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f1159d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private c f1160a;

        /* renamed from: b, reason: collision with root package name */
        private String f1161b = "GET";

        /* renamed from: c, reason: collision with root package name */
        private b.C0017b f1162c = new b.C0017b();

        /* renamed from: d, reason: collision with root package name */
        private f f1163d;

        /* renamed from: e, reason: collision with root package name */
        private Object f1164e;

        public e f() {
            if (this.f1160a != null) {
                return new e(this);
            }
            throw new IllegalStateException("url == null");
        }

        public b g(String str, String str2) {
            this.f1162c.f(str, str2);
            return this;
        }

        public b h(c cVar) {
            if (cVar == null) {
                throw new IllegalArgumentException("url == null");
            }
            this.f1160a = cVar;
            return this;
        }
    }

    private e(b bVar) {
        this.f1156a = bVar.f1160a;
        this.f1157b = bVar.f1161b;
        this.f1158c = bVar.f1162c.c();
        f unused = bVar.f1163d;
        this.f1159d = bVar.f1164e != null ? bVar.f1164e : this;
    }

    public c2.b a() {
        return this.f1158c;
    }

    public c b() {
        return this.f1156a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.f1157b);
        sb.append(", url=");
        sb.append(this.f1156a);
        sb.append(", tag=");
        Object obj = this.f1159d;
        if (obj == this) {
            obj = null;
        }
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }
}
