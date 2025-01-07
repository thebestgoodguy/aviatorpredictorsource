package io.grpc.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class w1 implements d1 {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f5702b = Logger.getLogger(w1.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final Constructor<?> f5703c;

    /* renamed from: d, reason: collision with root package name */
    private static final Method f5704d;

    /* renamed from: e, reason: collision with root package name */
    private static final Method f5705e;

    /* renamed from: f, reason: collision with root package name */
    private static final RuntimeException f5706f;

    /* renamed from: g, reason: collision with root package name */
    private static final Object[] f5707g;

    /* renamed from: a, reason: collision with root package name */
    private final Object f5708a;

    static {
        Method method;
        Method method2;
        Constructor<?> constructor;
        RuntimeException runtimeException = null;
        try {
            Class<?> cls = Class.forName("java.util.concurrent.atomic.LongAdder");
            method = cls.getMethod("add", Long.TYPE);
            try {
                method2 = cls.getMethod("sum", new Class[0]);
                try {
                    Constructor<?>[] constructors = cls.getConstructors();
                    int length = constructors.length;
                    int r7 = 0;
                    while (true) {
                        if (r7 >= length) {
                            constructor = null;
                            break;
                        }
                        constructor = constructors[r7];
                        if (constructor.getParameterTypes().length == 0) {
                            break;
                        } else {
                            r7++;
                        }
                    }
                    th = null;
                } catch (Throwable th) {
                    th = th;
                    f5702b.log(Level.FINE, "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
                    constructor = null;
                    if (th == null) {
                    }
                    f5703c = null;
                    f5704d = null;
                    f5705e = null;
                    runtimeException = new RuntimeException(th);
                    f5706f = runtimeException;
                    f5707g = new Object[]{1L};
                }
            } catch (Throwable th2) {
                th = th2;
                method2 = null;
            }
        } catch (Throwable th3) {
            th = th3;
            method = null;
            method2 = null;
        }
        if (th == null || constructor == null) {
            f5703c = null;
            f5704d = null;
            f5705e = null;
            runtimeException = new RuntimeException(th);
        } else {
            f5703c = constructor;
            f5704d = method;
            f5705e = method2;
        }
        f5706f = runtimeException;
        f5707g = new Object[]{1L};
    }

    w1() {
        RuntimeException runtimeException = f5706f;
        if (runtimeException != null) {
            throw runtimeException;
        }
        try {
            this.f5708a = f5703c.newInstance(new Object[0]);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException(e5);
        } catch (InstantiationException e6) {
            throw new RuntimeException(e6);
        } catch (InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    static boolean b() {
        return f5706f == null;
    }

    @Override // io.grpc.internal.d1
    public void a(long j4) {
        try {
            f5704d.invoke(this.f5708a, j4 == 1 ? f5707g : new Object[]{Long.valueOf(j4)});
        } catch (IllegalAccessException e5) {
            throw new RuntimeException(e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }
}
