package androidx.lifecycle;

import androidx.lifecycle.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class a {

    /* renamed from: c, reason: collision with root package name */
    static a f508c = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, C0005a> f509a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, Boolean> f510b = new HashMap();

    /* renamed from: androidx.lifecycle.a$a, reason: collision with other inner class name */
    static class C0005a {

        /* renamed from: a, reason: collision with root package name */
        final Map<d.a, List<b>> f511a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        final Map<b, d.a> f512b;

        C0005a(Map<b, d.a> map) {
            this.f512b = map;
            for (Map.Entry<b, d.a> entry : map.entrySet()) {
                d.a value = entry.getValue();
                List<b> list = this.f511a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f511a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        private static void b(List<b> list, g gVar, d.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(gVar, aVar, obj);
                }
            }
        }

        void a(g gVar, d.a aVar, Object obj) {
            b(this.f511a.get(aVar), gVar, aVar, obj);
            b(this.f511a.get(d.a.ON_ANY), gVar, aVar, obj);
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        final int f513a;

        /* renamed from: b, reason: collision with root package name */
        final Method f514b;

        b(int r12, Method method) {
            this.f513a = r12;
            this.f514b = method;
            method.setAccessible(true);
        }

        void a(g gVar, d.a aVar, Object obj) {
            try {
                int r02 = this.f513a;
                if (r02 == 0) {
                    this.f514b.invoke(obj, new Object[0]);
                } else if (r02 == 1) {
                    this.f514b.invoke(obj, gVar);
                } else {
                    if (r02 != 2) {
                        return;
                    }
                    this.f514b.invoke(obj, gVar, aVar);
                }
            } catch (IllegalAccessException e5) {
                throw new RuntimeException(e5);
            } catch (InvocationTargetException e6) {
                throw new RuntimeException("Failed to call observer method", e6.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f513a == bVar.f513a && this.f514b.getName().equals(bVar.f514b.getName());
        }

        public int hashCode() {
            return (this.f513a * 31) + this.f514b.getName().hashCode();
        }
    }

    a() {
    }

    private C0005a a(Class<?> cls, Method[] methodArr) {
        int r8;
        C0005a c5;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (c5 = c(superclass)) != null) {
            hashMap.putAll(c5.f512b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, d.a> entry : c(cls2).f512b.entrySet()) {
                e(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z4 = false;
        for (Method method : methodArr) {
            n nVar = (n) method.getAnnotation(n.class);
            if (nVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    r8 = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(g.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    r8 = 1;
                }
                d.a value = nVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(d.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != d.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    r8 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(hashMap, new b(r8, method), value, cls);
                z4 = true;
            }
        }
        C0005a c0005a = new C0005a(hashMap);
        this.f509a.put(cls, c0005a);
        this.f510b.put(cls, Boolean.valueOf(z4));
        return c0005a;
    }

    private Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e5) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e5);
        }
    }

    private void e(Map<b, d.a> map, b bVar, d.a aVar, Class<?> cls) {
        d.a aVar2 = map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f514b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    C0005a c(Class<?> cls) {
        C0005a c0005a = this.f509a.get(cls);
        return c0005a != null ? c0005a : a(cls, null);
    }

    boolean d(Class<?> cls) {
        Boolean bool = this.f510b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b5 = b(cls);
        for (Method method : b5) {
            if (((n) method.getAnnotation(n.class)) != null) {
                a(cls, b5);
                return true;
            }
        }
        this.f510b.put(cls, Boolean.FALSE);
        return false;
    }
}
