package b1;

/* loaded from: classes.dex */
public class w<T> implements r1.b<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f675c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile Object f676a = f675c;

    /* renamed from: b, reason: collision with root package name */
    private volatile r1.b<T> f677b;

    public w(r1.b<T> bVar) {
        this.f677b = bVar;
    }

    @Override // r1.b
    public T get() {
        T t4 = (T) this.f676a;
        Object obj = f675c;
        if (t4 == obj) {
            synchronized (this) {
                t4 = (T) this.f676a;
                if (t4 == obj) {
                    t4 = this.f677b.get();
                    this.f676a = t4;
                    this.f677b = null;
                }
            }
        }
        return t4;
    }
}
