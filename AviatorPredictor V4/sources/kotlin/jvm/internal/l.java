package kotlin.jvm.internal;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private static final m f6393a;

    /* renamed from: b, reason: collision with root package name */
    private static final y3.c[] f6394b;

    static {
        m mVar = null;
        try {
            mVar = (m) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (mVar == null) {
            mVar = new m();
        }
        f6393a = mVar;
        f6394b = new y3.c[0];
    }

    public static y3.e a(g gVar) {
        return f6393a.a(gVar);
    }

    public static y3.c b(Class cls) {
        return f6393a.b(cls);
    }

    public static y3.d c(Class cls) {
        return f6393a.c(cls, "");
    }

    public static String d(f fVar) {
        return f6393a.d(fVar);
    }

    public static String e(j jVar) {
        return f6393a.e(jVar);
    }
}
