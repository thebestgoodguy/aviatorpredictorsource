package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f6376a = new i();

    /* renamed from: b, reason: collision with root package name */
    private static final a f6377b = new a(null, null, null);

    /* renamed from: c, reason: collision with root package name */
    private static a f6378c;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Method f6379a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f6380b;

        /* renamed from: c, reason: collision with root package name */
        public final Method f6381c;

        public a(Method method, Method method2, Method method3) {
            this.f6379a = method;
            this.f6380b = method2;
            this.f6381c = method3;
        }
    }

    private i() {
    }

    private final a a(kotlin.coroutines.jvm.internal.a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f6378c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f6377b;
            f6378c = aVar3;
            return aVar3;
        }
    }

    public final String b(kotlin.coroutines.jvm.internal.a aVar) {
        kotlin.jvm.internal.i.d(aVar, "continuation");
        a aVar2 = f6378c;
        if (aVar2 == null) {
            aVar2 = a(aVar);
        }
        if (aVar2 == f6377b) {
            return null;
        }
        Method method = aVar2.f6379a;
        Object invoke = method == null ? null : method.invoke(aVar.getClass(), new Object[0]);
        if (invoke == null) {
            return null;
        }
        Method method2 = aVar2.f6380b;
        Object invoke2 = method2 == null ? null : method2.invoke(invoke, new Object[0]);
        if (invoke2 == null) {
            return null;
        }
        Method method3 = aVar2.f6381c;
        Object invoke3 = method3 == null ? null : method3.invoke(invoke2, new Object[0]);
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}
