package w;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private static final o0 f8047a = new l0();

    public interface a<R extends t.k, T> {
        T a(R r4);
    }

    public static <R extends t.k, T extends t.j<R>> o0.h<T> a(t.g<R> gVar, T t4) {
        return b(gVar, new n0(t4));
    }

    public static <R extends t.k, T> o0.h<T> b(t.g<R> gVar, a<R, T> aVar) {
        o0 o0Var = f8047a;
        o0.i iVar = new o0.i();
        gVar.a(new m0(gVar, iVar, aVar, o0Var));
        return iVar.a();
    }
}
