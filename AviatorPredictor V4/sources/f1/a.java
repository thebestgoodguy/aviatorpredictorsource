package f1;

import b1.d0;

/* loaded from: classes.dex */
public class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<T> f3650a;

    /* renamed from: b, reason: collision with root package name */
    private final T f3651b;

    public a(Class<T> cls, T t4) {
        this.f3650a = (Class) d0.b(cls);
        this.f3651b = (T) d0.b(t4);
    }

    public Class<T> a() {
        return this.f3650a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f3650a, this.f3651b);
    }
}
