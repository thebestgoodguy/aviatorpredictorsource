package b3;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f683b = new a(Collections.emptyMap());

    /* renamed from: a, reason: collision with root package name */
    private final Map<c<?>, Object> f684a;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private a f685a;

        /* renamed from: b, reason: collision with root package name */
        private Map<c<?>, Object> f686b;

        private b(a aVar) {
            this.f685a = aVar;
        }

        private Map<c<?>, Object> b(int r22) {
            if (this.f686b == null) {
                this.f686b = new IdentityHashMap(r22);
            }
            return this.f686b;
        }

        public a a() {
            if (this.f686b != null) {
                for (Map.Entry entry : this.f685a.f684a.entrySet()) {
                    if (!this.f686b.containsKey(entry.getKey())) {
                        this.f686b.put((c) entry.getKey(), entry.getValue());
                    }
                }
                this.f685a = new a(this.f686b);
                this.f686b = null;
            }
            return this.f685a;
        }

        public <T> b c(c<T> cVar) {
            if (this.f685a.f684a.containsKey(cVar)) {
                IdentityHashMap identityHashMap = new IdentityHashMap(this.f685a.f684a);
                identityHashMap.remove(cVar);
                this.f685a = new a(identityHashMap);
            }
            Map<c<?>, Object> map = this.f686b;
            if (map != null) {
                map.remove(cVar);
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <T> b d(c<T> cVar, T t4) {
            b(1).put(cVar, t4);
            return this;
        }
    }

    public static final class c<T> {

        /* renamed from: a, reason: collision with root package name */
        private final String f687a;

        private c(String str) {
            this.f687a = str;
        }

        public static <T> c<T> a(String str) {
            return new c<>(str);
        }

        public String toString() {
            return this.f687a;
        }
    }

    private a(Map<c<?>, Object> map) {
        this.f684a = map;
    }

    public static b c() {
        return new b();
    }

    public <T> T b(c<T> cVar) {
        return (T) this.f684a.get(cVar);
    }

    public b d() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f684a.size() != aVar.f684a.size()) {
            return false;
        }
        for (Map.Entry<c<?>, Object> entry : this.f684a.entrySet()) {
            if (!aVar.f684a.containsKey(entry.getKey()) || !q0.i.a(entry.getValue(), aVar.f684a.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int r22 = 0;
        for (Map.Entry<c<?>, Object> entry : this.f684a.entrySet()) {
            r22 += q0.i.b(entry.getKey(), entry.getValue());
        }
        return r22;
    }

    public String toString() {
        return this.f684a.toString();
    }
}
