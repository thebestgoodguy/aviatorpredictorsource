package kotlin.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l3.y;
import l3.z;
import u3.o;
import u3.p;
import u3.q;
import u3.r;
import u3.s;
import u3.t;
import u3.u;
import u3.v;
import u3.w;

/* loaded from: classes.dex */
public final class c implements y3.c<Object>, b {

    /* renamed from: f, reason: collision with root package name */
    public static final a f6383f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Map<Class<? extends k3.c<?>>, Integer> f6384g;

    /* renamed from: h, reason: collision with root package name */
    private static final HashMap<String, String> f6385h;

    /* renamed from: i, reason: collision with root package name */
    private static final HashMap<String, String> f6386i;

    /* renamed from: j, reason: collision with root package name */
    private static final HashMap<String, String> f6387j;

    /* renamed from: k, reason: collision with root package name */
    private static final Map<String, String> f6388k;

    /* renamed from: e, reason: collision with root package name */
    private final Class<?> f6389e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(e eVar) {
            this();
        }

        public final String a(Class<?> cls) {
            String str;
            String name;
            String T;
            String S;
            i.d(cls, "jClass");
            String str2 = null;
            if (!cls.isAnonymousClass()) {
                if (cls.isLocalClass()) {
                    String simpleName = cls.getSimpleName();
                    Method enclosingMethod = cls.getEnclosingMethod();
                    if (enclosingMethod == null) {
                        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                        i.c(simpleName, "name");
                        if (enclosingConstructor == null) {
                            S = a4.n.S(simpleName, '$', null, 2, null);
                            return S;
                        }
                        name = enclosingConstructor.getName();
                    } else {
                        i.c(simpleName, "name");
                        name = enclosingMethod.getName();
                    }
                    T = a4.n.T(simpleName, i.i(name, "$"), null, 2, null);
                    return T;
                }
                if (!cls.isArray()) {
                    String str3 = (String) c.f6388k.get(cls.getName());
                    return str3 == null ? cls.getSimpleName() : str3;
                }
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) c.f6388k.get(componentType.getName())) != null) {
                    str2 = i.i(str, "Array");
                }
                if (str2 == null) {
                    return "Array";
                }
            }
            return str2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        List d5;
        int g5;
        Map<Class<? extends k3.c<?>>, Integer> g6;
        int a5;
        String V;
        String V2;
        int r32 = 0;
        d5 = l3.i.d(u3.a.class, u3.l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, u3.b.class, u3.c.class, u3.d.class, u3.e.class, u3.f.class, u3.g.class, u3.h.class, u3.i.class, u3.j.class, u3.k.class, u3.m.class, u3.n.class, o.class);
        g5 = l3.j.g(d5, 10);
        ArrayList arrayList = new ArrayList(g5);
        for (Object obj : d5) {
            int r6 = r32 + 1;
            if (r32 < 0) {
                l3.i.f();
            }
            arrayList.add(k3.p.a((Class) obj, Integer.valueOf(r32)));
            r32 = r6;
        }
        g6 = z.g(arrayList);
        f6384g = g6;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f6385h = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f6386i = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        i.c(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            i.c(str, "kotlinName");
            V2 = a4.n.V(str, '.', null, 2, null);
            sb.append(V2);
            sb.append("CompanionObject");
            k3.l a6 = k3.p.a(sb.toString(), i.i(str, ".Companion"));
            hashMap3.put(a6.c(), a6.d());
        }
        for (Map.Entry<Class<? extends k3.c<?>>, Integer> entry : f6384g.entrySet()) {
            hashMap3.put(entry.getKey().getName(), i.i("kotlin.Function", Integer.valueOf(entry.getValue().intValue())));
        }
        f6387j = hashMap3;
        a5 = y.a(hashMap3.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(a5);
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            V = a4.n.V((String) entry2.getValue(), '.', null, 2, null);
            linkedHashMap.put(key, V);
        }
        f6388k = linkedHashMap;
    }

    public c(Class<?> cls) {
        i.d(cls, "jClass");
        this.f6389e = cls;
    }

    @Override // y3.c
    public String a() {
        return f6383f.a(b());
    }

    @Override // kotlin.jvm.internal.b
    public Class<?> b() {
        return this.f6389e;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && i.a(t3.a.a(this), t3.a.a((y3.c) obj));
    }

    public int hashCode() {
        return t3.a.a(this).hashCode();
    }

    public String toString() {
        return i.i(b().toString(), " (Kotlin reflection is not available)");
    }
}
