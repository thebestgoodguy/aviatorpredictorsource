package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static Map<Class<?>, Integer> f533a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static Map<Class<?>, List<Constructor<? extends c>>> f534b = new HashMap();

    private static c a(Constructor<? extends c> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException(e5);
        } catch (InstantiationException e6) {
            throw new RuntimeException(e6);
        } catch (InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    private static Constructor<? extends c> b(Class<?> cls) {
        try {
            Package r02 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r02 != null ? r02.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String c5 = c(canonicalName);
            if (!name.isEmpty()) {
                c5 = name + "." + c5;
            }
            Constructor declaredConstructor = Class.forName(c5).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e5) {
            throw new RuntimeException(e5);
        }
    }

    public static String c(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    private static int d(Class<?> cls) {
        Integer num = f533a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g5 = g(cls);
        f533a.put(cls, Integer.valueOf(g5));
        return g5;
    }

    private static boolean e(Class<?> cls) {
        return cls != null && f.class.isAssignableFrom(cls);
    }

    static e f(Object obj) {
        boolean z4 = obj instanceof e;
        boolean z5 = obj instanceof b;
        if (z4 && z5) {
            return new FullLifecycleObserverAdapter((b) obj, (e) obj);
        }
        if (z5) {
            return new FullLifecycleObserverAdapter((b) obj, null);
        }
        if (z4) {
            return (e) obj;
        }
        Class<?> cls = obj.getClass();
        if (d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List<Constructor<? extends c>> list = f534b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(a(list.get(0), obj));
        }
        c[] cVarArr = new c[list.size()];
        for (int r22 = 0; r22 < list.size(); r22++) {
            cVarArr[r22] = a(list.get(r22), obj);
        }
        return new CompositeGeneratedAdaptersObserver(cVarArr);
    }

    private static int g(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends c> b5 = b(cls);
        if (b5 != null) {
            f534b.put(cls, Collections.singletonList(b5));
            return 2;
        }
        if (a.f508c.d(cls)) {
            return 1;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        ArrayList arrayList = null;
        if (e(superclass)) {
            if (d(superclass) == 1) {
                return 1;
            }
            arrayList = new ArrayList(f534b.get(superclass));
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (e(cls2)) {
                if (d(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.addAll(f534b.get(cls2));
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f534b.put(cls, arrayList);
        return 2;
    }
}
