package kotlinx.coroutines.internal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f6434a = new i();

    private i() {
    }

    private final <S> S a(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    private final <S> List<S> b(Class<S> cls, ClassLoader classLoader) {
        List<S> q4;
        try {
            return d(cls, classLoader);
        } catch (Throwable unused) {
            q4 = l3.q.q(ServiceLoader.load(cls, classLoader));
            return q4;
        }
    }

    private final List<String> e(URL url) {
        boolean o4;
        BufferedReader bufferedReader;
        String T;
        String Y;
        String T2;
        String url2 = url.toString();
        o4 = a4.m.o(url2, "jar", false, 2, null);
        if (!o4) {
            bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            try {
                List<String> f5 = f6434a.f(bufferedReader);
                s3.a.a(bufferedReader, null);
                return f5;
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        }
        T = a4.n.T(url2, "jar:file:", null, 2, null);
        Y = a4.n.Y(T, '!', null, 2, null);
        T2 = a4.n.T(url2, "!/", null, 2, null);
        JarFile jarFile = new JarFile(Y, false);
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(T2)), "UTF-8"));
            try {
                List<String> f6 = f6434a.f(bufferedReader);
                s3.a.a(bufferedReader, null);
                jarFile.close();
                return f6;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    jarFile.close();
                    throw th3;
                } catch (Throwable th4) {
                    k3.b.a(th2, th4);
                    throw th2;
                }
            }
        }
    }

    private final List<String> f(BufferedReader bufferedReader) {
        List<String> q4;
        String Z;
        CharSequence a02;
        boolean z4;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                q4 = l3.q.q(linkedHashSet);
                return q4;
            }
            Z = a4.n.Z(readLine, "#", null, 2, null);
            Objects.requireNonNull(Z, "null cannot be cast to non-null type kotlin.CharSequence");
            a02 = a4.n.a0(Z);
            String obj = a02.toString();
            int r32 = 0;
            while (true) {
                if (r32 >= obj.length()) {
                    z4 = true;
                    break;
                }
                char charAt = obj.charAt(r32);
                if (!(charAt == '.' || Character.isJavaIdentifierPart(charAt))) {
                    z4 = false;
                    break;
                }
                r32++;
            }
            if (!z4) {
                throw new IllegalArgumentException(kotlin.jvm.internal.i.i("Illegal service provider class name: ", obj).toString());
            }
            if (obj.length() > 0) {
                linkedHashSet.add(obj);
            }
        }
    }

    public final List<MainDispatcherFactory> c() {
        MainDispatcherFactory mainDispatcherFactory;
        if (!j.a()) {
            return b(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            MainDispatcherFactory mainDispatcherFactory2 = null;
            try {
                mainDispatcherFactory = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                mainDispatcherFactory = null;
            }
            if (mainDispatcherFactory != null) {
                arrayList.add(mainDispatcherFactory);
            }
            try {
                mainDispatcherFactory2 = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (mainDispatcherFactory2 == null) {
                return arrayList;
            }
            arrayList.add(mainDispatcherFactory2);
            return arrayList;
        } catch (Throwable unused3) {
            return b(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
    }

    public final <S> List<S> d(Class<S> cls, ClassLoader classLoader) {
        Set t4;
        int g5;
        ArrayList list = Collections.list(classLoader.getResources(kotlin.jvm.internal.i.i("META-INF/services/", cls.getName())));
        kotlin.jvm.internal.i.c(list, "java.util.Collections.list(this)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l3.n.h(arrayList, f6434a.e((URL) it.next()));
        }
        t4 = l3.q.t(arrayList);
        if (!(!t4.isEmpty())) {
            throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
        }
        g5 = l3.j.g(t4, 10);
        ArrayList arrayList2 = new ArrayList(g5);
        Iterator it2 = t4.iterator();
        while (it2.hasNext()) {
            arrayList2.add(f6434a.a((String) it2.next(), classLoader, cls));
        }
        return arrayList2;
    }
}
