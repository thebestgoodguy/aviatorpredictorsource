package kotlin.jvm.internal;

/* loaded from: classes.dex */
public class m {
    public y3.e a(g gVar) {
        return gVar;
    }

    public y3.c b(Class cls) {
        return new c(cls);
    }

    public y3.d c(Class cls, String str) {
        return new k(cls, str);
    }

    public String d(f fVar) {
        String obj = fVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String e(j jVar) {
        return d(jVar);
    }
}
