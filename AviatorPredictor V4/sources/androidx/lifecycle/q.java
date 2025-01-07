package androidx.lifecycle;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private final a f539a;

    /* renamed from: b, reason: collision with root package name */
    private final r f540b;

    public interface a {
        <T extends p> T a(Class<T> cls);
    }

    static abstract class b implements a {
        b() {
        }

        @Override // androidx.lifecycle.q.a
        public <T extends p> T a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        public abstract <T extends p> T b(String str, Class<T> cls);
    }

    public q(r rVar, a aVar) {
        this.f539a = aVar;
        this.f540b = rVar;
    }

    public <T extends p> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
    }

    public <T extends p> T b(String str, Class<T> cls) {
        T t4 = (T) this.f540b.b(str);
        if (cls.isInstance(t4)) {
            return t4;
        }
        a aVar = this.f539a;
        T t5 = aVar instanceof b ? (T) ((b) aVar).b(str, cls) : (T) aVar.a(cls);
        this.f540b.c(str, t5);
        return t5;
    }
}
