package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import k3.m;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final int f6425a = d(Throwable.class, -1);

    /* renamed from: b, reason: collision with root package name */
    private static final ReentrantReadWriteLock f6426b = new ReentrantReadWriteLock();

    /* renamed from: c, reason: collision with root package name */
    private static final WeakHashMap<Class<? extends Throwable>, u3.l<Throwable, Throwable>> f6427c = new WeakHashMap<>();

    public static final class a extends kotlin.jvm.internal.j implements u3.l<Throwable, Throwable> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Constructor f6428e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Constructor constructor) {
            super(1);
            this.f6428e = constructor;
        }

        @Override // u3.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable th) {
            Object a5;
            Object newInstance;
            try {
                m.a aVar = k3.m.f6368e;
                newInstance = this.f6428e.newInstance(th.getMessage(), th);
            } catch (Throwable th2) {
                m.a aVar2 = k3.m.f6368e;
                a5 = k3.m.a(k3.n.a(th2));
            }
            if (newInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            }
            a5 = k3.m.a((Throwable) newInstance);
            if (k3.m.c(a5)) {
                a5 = null;
            }
            return (Throwable) a5;
        }
    }

    public static final class b extends kotlin.jvm.internal.j implements u3.l<Throwable, Throwable> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Constructor f6429e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Constructor constructor) {
            super(1);
            this.f6429e = constructor;
        }

        @Override // u3.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable th) {
            Object a5;
            Object newInstance;
            try {
                m.a aVar = k3.m.f6368e;
                newInstance = this.f6429e.newInstance(th);
            } catch (Throwable th2) {
                m.a aVar2 = k3.m.f6368e;
                a5 = k3.m.a(k3.n.a(th2));
            }
            if (newInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            }
            a5 = k3.m.a((Throwable) newInstance);
            if (k3.m.c(a5)) {
                a5 = null;
            }
            return (Throwable) a5;
        }
    }

    public static final class c extends kotlin.jvm.internal.j implements u3.l<Throwable, Throwable> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Constructor f6430e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Constructor constructor) {
            super(1);
            this.f6430e = constructor;
        }

        @Override // u3.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable th) {
            Object a5;
            Object newInstance;
            try {
                m.a aVar = k3.m.f6368e;
                newInstance = this.f6430e.newInstance(th.getMessage());
            } catch (Throwable th2) {
                m.a aVar2 = k3.m.f6368e;
                a5 = k3.m.a(k3.n.a(th2));
            }
            if (newInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            }
            Throwable th3 = (Throwable) newInstance;
            th3.initCause(th);
            a5 = k3.m.a(th3);
            if (k3.m.c(a5)) {
                a5 = null;
            }
            return (Throwable) a5;
        }
    }

    public static final class d extends kotlin.jvm.internal.j implements u3.l<Throwable, Throwable> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Constructor f6431e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Constructor constructor) {
            super(1);
            this.f6431e = constructor;
        }

        @Override // u3.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable th) {
            Object a5;
            Object newInstance;
            try {
                m.a aVar = k3.m.f6368e;
                newInstance = this.f6431e.newInstance(new Object[0]);
            } catch (Throwable th2) {
                m.a aVar2 = k3.m.f6368e;
                a5 = k3.m.a(k3.n.a(th2));
            }
            if (newInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            }
            Throwable th3 = (Throwable) newInstance;
            th3.initCause(th);
            a5 = k3.m.a(th3);
            if (k3.m.c(a5)) {
                a5 = null;
            }
            return (Throwable) a5;
        }
    }

    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t4, T t5) {
            int a5;
            a5 = m3.b.a(Integer.valueOf(((Constructor) t5).getParameterTypes().length), Integer.valueOf(((Constructor) t4).getParameterTypes().length));
            return a5;
        }
    }

    static final class f extends kotlin.jvm.internal.j implements u3.l {

        /* renamed from: e, reason: collision with root package name */
        public static final f f6432e = new f();

        f() {
            super(1);
        }

        @Override // u3.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Throwable th) {
            return null;
        }
    }

    static final class g extends kotlin.jvm.internal.j implements u3.l {

        /* renamed from: e, reason: collision with root package name */
        public static final g f6433e = new g();

        g() {
            super(1);
        }

        @Override // u3.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Throwable th) {
            return null;
        }
    }

    private static final u3.l<Throwable, Throwable> a(Constructor<?> constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length == 0) {
            return new d(constructor);
        }
        if (length != 1) {
            if (length == 2 && kotlin.jvm.internal.i.a(parameterTypes[0], String.class) && kotlin.jvm.internal.i.a(parameterTypes[1], Throwable.class)) {
                return new a(constructor);
            }
            return null;
        }
        Class<?> cls = parameterTypes[0];
        if (kotlin.jvm.internal.i.a(cls, Throwable.class)) {
            return new b(constructor);
        }
        if (kotlin.jvm.internal.i.a(cls, String.class)) {
            return new c(constructor);
        }
        return null;
    }

    private static final int b(Class<?> cls, int r6) {
        do {
            int length = cls.getDeclaredFields().length;
            int r32 = 0;
            for (int r22 = 0; r22 < length; r22++) {
                if (!Modifier.isStatic(r0[r22].getModifiers())) {
                    r32++;
                }
            }
            r6 += r32;
            cls = cls.getSuperclass();
        } while (cls != null);
        return r6;
    }

    static /* synthetic */ int c(Class cls, int r12, int r22, Object obj) {
        if ((r22 & 1) != 0) {
            r12 = 0;
        }
        return b(cls, r12);
    }

    private static final int d(Class<?> cls, int r4) {
        Object a5;
        t3.a.b(cls);
        try {
            m.a aVar = k3.m.f6368e;
            a5 = k3.m.a(Integer.valueOf(c(cls, 0, 1, null)));
        } catch (Throwable th) {
            m.a aVar2 = k3.m.f6368e;
            a5 = k3.m.a(k3.n.a(th));
        }
        Integer valueOf = Integer.valueOf(r4);
        if (k3.m.c(a5)) {
            a5 = valueOf;
        }
        return ((Number) a5).intValue();
    }

    public static final <E extends Throwable> E e(E e5) {
        Object a5;
        List j4;
        ReentrantReadWriteLock.ReadLock readLock;
        int readHoldCount;
        ReentrantReadWriteLock.WriteLock writeLock;
        if (e5 instanceof b4.e0) {
            try {
                m.a aVar = k3.m.f6368e;
                a5 = k3.m.a(((b4.e0) e5).a());
            } catch (Throwable th) {
                m.a aVar2 = k3.m.f6368e;
                a5 = k3.m.a(k3.n.a(th));
            }
            return (E) (k3.m.c(a5) ? null : a5);
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f6426b;
        ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
        readLock2.lock();
        try {
            u3.l<Throwable, Throwable> lVar = f6427c.get(e5.getClass());
            if (lVar != null) {
                return (E) lVar.invoke(e5);
            }
            int r4 = 0;
            if (f6425a != d(e5.getClass(), 0)) {
                readLock = reentrantReadWriteLock.readLock();
                readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int r5 = 0; r5 < readHoldCount; r5++) {
                    readLock.unlock();
                }
                writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    f6427c.put(e5.getClass(), f.f6432e);
                    k3.s sVar = k3.s.f6374a;
                    return null;
                } finally {
                    while (r4 < readHoldCount) {
                        readLock.lock();
                        r4++;
                    }
                    writeLock.unlock();
                }
            }
            j4 = l3.e.j(e5.getClass().getConstructors(), new e());
            Iterator it = j4.iterator();
            u3.l<Throwable, Throwable> lVar2 = null;
            while (it.hasNext() && (lVar2 = a((Constructor) it.next())) == null) {
            }
            ReentrantReadWriteLock reentrantReadWriteLock2 = f6426b;
            readLock = reentrantReadWriteLock2.readLock();
            readHoldCount = reentrantReadWriteLock2.getWriteHoldCount() == 0 ? reentrantReadWriteLock2.getReadHoldCount() : 0;
            for (int r6 = 0; r6 < readHoldCount; r6++) {
                readLock.unlock();
            }
            writeLock = reentrantReadWriteLock2.writeLock();
            writeLock.lock();
            try {
                f6427c.put(e5.getClass(), lVar2 == null ? g.f6433e : lVar2);
                k3.s sVar2 = k3.s.f6374a;
                while (r4 < readHoldCount) {
                    readLock.lock();
                    r4++;
                }
                writeLock.unlock();
                if (lVar2 == null) {
                    return null;
                }
                return (E) lVar2.invoke(e5);
            } finally {
                while (r4 < readHoldCount) {
                    readLock.lock();
                    r4++;
                }
                writeLock.unlock();
            }
        } finally {
            readLock2.unlock();
        }
    }
}
