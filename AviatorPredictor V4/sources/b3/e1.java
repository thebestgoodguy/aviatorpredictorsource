package b3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* loaded from: classes.dex */
final class e1 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> implements Comparator<T> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ b f748e;

        a(b bVar) {
            this.f748e = bVar;
        }

        @Override // java.util.Comparator
        public int compare(T t4, T t5) {
            int a5 = this.f748e.a(t4) - this.f748e.a(t5);
            return a5 != 0 ? a5 : t4.getClass().getName().compareTo(t5.getClass().getName());
        }
    }

    public interface b<T> {
        int a(T t4);

        boolean b(T t4);
    }

    static <T> T a(Class<T> cls, Class<?> cls2) {
        try {
            return (T) cls2.asSubclass(cls).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
        }
    }

    static <T> Iterable<T> b(Class<T> cls, Iterable<Class<?>> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<Class<?>> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(a(cls, it.next()));
        }
        return arrayList;
    }

    public static <T> Iterable<T> c(Class<T> cls, ClassLoader classLoader) {
        ServiceLoader load = ServiceLoader.load(cls, classLoader);
        return !load.iterator().hasNext() ? ServiceLoader.load(cls) : load;
    }

    static boolean d(ClassLoader classLoader) {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static <T> List<T> e(Class<T> cls, Iterable<Class<?>> iterable, ClassLoader classLoader, b<T> bVar) {
        Iterable b5 = d(classLoader) ? b(cls, iterable) : c(cls, classLoader);
        ArrayList arrayList = new ArrayList();
        for (T t4 : b5) {
            if (bVar.b(t4)) {
                arrayList.add(t4);
            }
        }
        Collections.sort(arrayList, Collections.reverseOrder(new a(bVar)));
        return Collections.unmodifiableList(arrayList);
    }
}
