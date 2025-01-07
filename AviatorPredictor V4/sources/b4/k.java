package b4;

/* loaded from: classes.dex */
public interface k<T> extends n3.d<T> {

    public static final class a {
        public static /* synthetic */ Object a(k kVar, Object obj, Object obj2, int r32, Object obj3) {
            if (obj3 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
            }
            if ((r32 & 2) != 0) {
                obj2 = null;
            }
            return kVar.b(obj, obj2);
        }
    }

    Object b(T t4, Object obj);

    void f(u3.l<? super Throwable, k3.s> lVar);

    Object j(Throwable th);

    void m(Object obj);

    Object o(T t4, Object obj, u3.l<? super Throwable, k3.s> lVar);

    void p(T t4, u3.l<? super Throwable, k3.s> lVar);
}
