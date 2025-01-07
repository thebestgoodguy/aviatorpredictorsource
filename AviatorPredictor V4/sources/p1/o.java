package p1;

import android.net.Uri;
import com.google.firebase.firestore.n0;
import com.google.firebase.firestore.r0;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private static final ConcurrentMap<Class<?>, a<?>> f7035a = new ConcurrentHashMap();

    private static class a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<T> f7036a;

        /* renamed from: b, reason: collision with root package name */
        private final Constructor<T> f7037b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f7038c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f7039d;

        /* renamed from: e, reason: collision with root package name */
        private final Map<String, String> f7040e = new HashMap();

        /* renamed from: g, reason: collision with root package name */
        private final Map<String, Method> f7042g = new HashMap();

        /* renamed from: f, reason: collision with root package name */
        private final Map<String, Method> f7041f = new HashMap();

        /* renamed from: h, reason: collision with root package name */
        private final Map<String, Field> f7043h = new HashMap();

        /* renamed from: i, reason: collision with root package name */
        private final HashSet<String> f7044i = new HashSet<>();

        /* renamed from: j, reason: collision with root package name */
        private final HashSet<String> f7045j = new HashSet<>();

        a(Class<T> cls) {
            Constructor<T> constructor;
            this.f7036a = cls;
            this.f7038c = cls.isAnnotationPresent(r0.class);
            this.f7039d = !cls.isAnnotationPresent(com.google.firebase.firestore.z.class);
            try {
                constructor = cls.getDeclaredConstructor(new Class[0]);
                constructor.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                constructor = null;
            }
            this.f7037b = constructor;
            for (Method method : cls.getMethods()) {
                if (n(method)) {
                    String j4 = j(method);
                    b(j4);
                    method.setAccessible(true);
                    if (this.f7041f.containsKey(j4)) {
                        throw new RuntimeException("Found conflicting getters for name " + method.getName() + " on class " + cls.getName());
                    }
                    this.f7041f.put(j4, method);
                    e(method);
                }
            }
            for (Field field : cls.getFields()) {
                if (m(field)) {
                    b(i(field));
                    d(field);
                }
            }
            Class<T> cls2 = cls;
            do {
                for (Method method2 : cls2.getDeclaredMethods()) {
                    if (o(method2)) {
                        String j5 = j(method2);
                        String str = this.f7040e.get(j5.toLowerCase(Locale.US));
                        if (str == null) {
                            continue;
                        } else {
                            if (!str.equals(j5)) {
                                throw new RuntimeException("Found setter on " + cls2.getName() + " with invalid case-sensitive name: " + method2.getName());
                            }
                            Method method3 = this.f7042g.get(j5);
                            if (method3 == null) {
                                method2.setAccessible(true);
                                this.f7042g.put(j5, method2);
                                f(method2);
                            } else if (!h(method2, method3)) {
                                if (cls2 == cls) {
                                    throw new RuntimeException("Class " + cls.getName() + " has multiple setter overloads with name " + method2.getName());
                                }
                                throw new RuntimeException("Found conflicting setters with name: " + method2.getName() + " (conflicts with " + method3.getName() + " defined on " + method3.getDeclaringClass().getName() + ")");
                            }
                        }
                    }
                }
                for (Field field2 : cls2.getDeclaredFields()) {
                    String i4 = i(field2);
                    if (this.f7040e.containsKey(i4.toLowerCase(Locale.US)) && !this.f7043h.containsKey(i4)) {
                        field2.setAccessible(true);
                        this.f7043h.put(i4, field2);
                        d(field2);
                    }
                }
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    break;
                }
            } while (!cls2.equals(Object.class));
            if (this.f7040e.isEmpty()) {
                throw new RuntimeException("No properties to serialize found on class " + cls.getName());
            }
            Iterator<String> it = this.f7045j.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (!this.f7042g.containsKey(next) && !this.f7043h.containsKey(next)) {
                    throw new RuntimeException("@DocumentId is annotated on property " + next + " of class " + cls.getName() + " but no field or public setter was found");
                }
            }
        }

        private void b(String str) {
            Map<String, String> map = this.f7040e;
            Locale locale = Locale.US;
            String put = map.put(str.toLowerCase(locale), str);
            if (put == null || str.equals(put)) {
                return;
            }
            throw new RuntimeException("Found two getters or fields with conflicting case sensitivity for property: " + str.toLowerCase(locale));
        }

        private static String c(AccessibleObject accessibleObject) {
            if (accessibleObject.isAnnotationPresent(com.google.firebase.firestore.g0.class)) {
                return ((com.google.firebase.firestore.g0) accessibleObject.getAnnotation(com.google.firebase.firestore.g0.class)).value();
            }
            return null;
        }

        private void d(Field field) {
            if (field.isAnnotationPresent(n0.class)) {
                Class<?> type = field.getType();
                if (type != Date.class && type != x0.o.class) {
                    throw new IllegalArgumentException("Field " + field.getName() + " is annotated with @ServerTimestamp but is " + type + " instead of Date or Timestamp.");
                }
                this.f7044i.add(i(field));
            }
            if (field.isAnnotationPresent(com.google.firebase.firestore.d.class)) {
                g("Field", "is", field.getType());
                this.f7045j.add(i(field));
            }
        }

        private void e(Method method) {
            if (method.isAnnotationPresent(n0.class)) {
                Class<?> returnType = method.getReturnType();
                if (returnType != Date.class && returnType != x0.o.class) {
                    throw new IllegalArgumentException("Method " + method.getName() + " is annotated with @ServerTimestamp but returns " + returnType + " instead of Date or Timestamp.");
                }
                this.f7044i.add(j(method));
            }
            if (method.isAnnotationPresent(com.google.firebase.firestore.d.class)) {
                g("Method", "returns", method.getReturnType());
                this.f7045j.add(j(method));
            }
        }

        private void f(Method method) {
            if (method.isAnnotationPresent(n0.class)) {
                throw new IllegalArgumentException("Method " + method.getName() + " is annotated with @ServerTimestamp but should not be. @ServerTimestamp can only be applied to fields and getters, not setters.");
            }
            if (method.isAnnotationPresent(com.google.firebase.firestore.d.class)) {
                g("Method", "accepts", method.getParameterTypes()[0]);
                this.f7045j.add(j(method));
            }
        }

        private void g(String str, String str2, Type type) {
            if (type == String.class || type == com.google.firebase.firestore.h.class) {
                return;
            }
            throw new IllegalArgumentException(str + " is annotated with @DocumentId but " + str2 + " " + type + " instead of String or DocumentReference.");
        }

        private static boolean h(Method method, Method method2) {
            o.d(method.getDeclaringClass().isAssignableFrom(method2.getDeclaringClass()), "Expected override from a base class");
            o.d(method.getReturnType().equals(Void.TYPE), "Expected void return type");
            o.d(method2.getReturnType().equals(Void.TYPE), "Expected void return type");
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?>[] parameterTypes2 = method2.getParameterTypes();
            o.d(parameterTypes.length == 1, "Expected exactly one parameter");
            o.d(parameterTypes2.length == 1, "Expected exactly one parameter");
            return method.getName().equals(method2.getName()) && parameterTypes[0].equals(parameterTypes2[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String i(Field field) {
            String c5 = c(field);
            return c5 != null ? c5 : field.getName();
        }

        private static String j(Method method) {
            String c5 = c(method);
            return c5 != null ? c5 : l(method.getName());
        }

        private static String l(String str) {
            String[] strArr = {"get", "set", "is"};
            String str2 = null;
            for (int r32 = 0; r32 < 3; r32++) {
                String str3 = strArr[r32];
                if (str.startsWith(str3)) {
                    str2 = str3;
                }
            }
            if (str2 == null) {
                throw new IllegalArgumentException("Unknown Bean prefix for method: " + str);
            }
            char[] charArray = str.substring(str2.length()).toCharArray();
            for (int r12 = 0; r12 < charArray.length && Character.isUpperCase(charArray[r12]); r12++) {
                charArray[r12] = Character.toLowerCase(charArray[r12]);
            }
            return new String(charArray);
        }

        private static boolean m(Field field) {
            return (field.getDeclaringClass().equals(Object.class) || !Modifier.isPublic(field.getModifiers()) || Modifier.isStatic(field.getModifiers()) || Modifier.isTransient(field.getModifiers()) || field.isAnnotationPresent(com.google.firebase.firestore.k.class)) ? false : true;
        }

        private static boolean n(Method method) {
            return ((!method.getName().startsWith("get") && !method.getName().startsWith("is")) || method.getDeclaringClass().equals(Object.class) || !Modifier.isPublic(method.getModifiers()) || Modifier.isStatic(method.getModifiers()) || method.getReturnType().equals(Void.TYPE) || method.getParameterTypes().length != 0 || method.isAnnotationPresent(com.google.firebase.firestore.k.class)) ? false : true;
        }

        private static boolean o(Method method) {
            return method.getName().startsWith("set") && !method.getDeclaringClass().equals(Object.class) && !Modifier.isStatic(method.getModifiers()) && method.getReturnType().equals(Void.TYPE) && method.getParameterTypes().length == 1 && !method.isAnnotationPresent(com.google.firebase.firestore.k.class);
        }

        Map<String, Object> k(T t4, b bVar) {
            Object obj;
            if (!this.f7036a.isAssignableFrom(t4.getClass())) {
                throw new IllegalArgumentException("Can't serialize object of class " + t4.getClass() + " with BeanMapper for class " + this.f7036a);
            }
            HashMap hashMap = new HashMap();
            for (String str : this.f7040e.values()) {
                if (!this.f7045j.contains(str)) {
                    if (this.f7041f.containsKey(str)) {
                        obj = p1.a.a(this.f7041f.get(str), t4, new Object[0]);
                    } else {
                        Field field = this.f7043h.get(str);
                        if (field == null) {
                            throw new IllegalStateException("Bean property without field or getter: " + str);
                        }
                        try {
                            obj = field.get(t4);
                        } catch (IllegalAccessException e5) {
                            throw new RuntimeException(e5);
                        }
                    }
                    hashMap.put(str, (this.f7044i.contains(str) && obj == null) ? com.google.firebase.firestore.m.g() : o.g(obj, bVar.a(str)));
                }
            }
            return hashMap;
        }
    }

    static class b {

        /* renamed from: d, reason: collision with root package name */
        static final b f7046d = new b(null, null, 0);

        /* renamed from: a, reason: collision with root package name */
        private final int f7047a;

        /* renamed from: b, reason: collision with root package name */
        private final b f7048b;

        /* renamed from: c, reason: collision with root package name */
        private final String f7049c;

        b(b bVar, String str, int r32) {
            this.f7048b = bVar;
            this.f7049c = str;
            this.f7047a = r32;
        }

        b a(String str) {
            return new b(this, str, this.f7047a + 1);
        }

        int b() {
            return this.f7047a;
        }

        public String toString() {
            int r02 = this.f7047a;
            if (r02 == 0) {
                return "";
            }
            if (r02 == 1) {
                return this.f7049c;
            }
            return this.f7048b.toString() + "." + this.f7049c;
        }
    }

    public static Object c(Object obj) {
        return f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(boolean z4, String str) {
        if (z4) {
            return;
        }
        throw new RuntimeException("Hard assert failed: " + str);
    }

    private static <T> a<T> e(Class<T> cls) {
        ConcurrentMap<Class<?>, a<?>> concurrentMap = f7035a;
        a<T> aVar = (a) concurrentMap.get(cls);
        if (aVar != null) {
            return aVar;
        }
        a<T> aVar2 = new a<>(cls);
        concurrentMap.put(cls, aVar2);
        return aVar2;
    }

    private static <T> Object f(T t4) {
        return g(t4, b.f7046d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Object g(T t4, b bVar) {
        if (bVar.b() > 500) {
            throw h(bVar, "Exceeded maximum depth of 500, which likely indicates there's an object cycle");
        }
        if (t4 == 0) {
            return null;
        }
        if (t4 instanceof Number) {
            if ((t4 instanceof Long) || (t4 instanceof Integer) || (t4 instanceof Double) || (t4 instanceof Float)) {
                return t4;
            }
            throw h(bVar, String.format("Numbers of type %s are not supported, please use an int, long, float or double", t4.getClass().getSimpleName()));
        }
        if ((t4 instanceof String) || (t4 instanceof Boolean)) {
            return t4;
        }
        if (t4 instanceof Character) {
            throw h(bVar, "Characters are not supported, please use Strings");
        }
        if (t4 instanceof Map) {
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : ((Map) t4).entrySet()) {
                Object key = entry.getKey();
                if (!(key instanceof String)) {
                    throw h(bVar, "Maps with non-string keys are not supported");
                }
                String str = (String) key;
                hashMap.put(str, g(entry.getValue(), bVar.a(str)));
            }
            return hashMap;
        }
        if (!(t4 instanceof Collection)) {
            if (t4.getClass().isArray()) {
                throw h(bVar, "Serializing Arrays is not supported, please use Lists instead");
            }
            if (!(t4 instanceof Enum)) {
                return ((t4 instanceof Date) || (t4 instanceof x0.o) || (t4 instanceof com.google.firebase.firestore.y) || (t4 instanceof com.google.firebase.firestore.a) || (t4 instanceof com.google.firebase.firestore.h) || (t4 instanceof com.google.firebase.firestore.m)) ? t4 : ((t4 instanceof Uri) || (t4 instanceof URI) || (t4 instanceof URL)) ? t4.toString() : e(t4.getClass()).k(t4, bVar);
            }
            String name = ((Enum) t4).name();
            try {
                return a.i(t4.getClass().getField(name));
            } catch (NoSuchFieldException unused) {
                return name;
            }
        }
        if (!(t4 instanceof List)) {
            throw h(bVar, "Serializing Collections is not supported, please use Lists instead");
        }
        List list = (List) t4;
        ArrayList arrayList = new ArrayList(list.size());
        for (int r12 = 0; r12 < list.size(); r12++) {
            arrayList.add(g(list.get(r12), bVar.a("[" + r12 + "]")));
        }
        return arrayList;
    }

    private static IllegalArgumentException h(b bVar, String str) {
        String str2 = "Could not serialize object. " + str;
        if (bVar.b() > 0) {
            str2 = str2 + " (found in field '" + bVar.toString() + "')";
        }
        return new IllegalArgumentException(str2);
    }
}
