package e3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class e<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<?> f3566a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3567b;

    /* renamed from: c, reason: collision with root package name */
    private final Class[] f3568c;

    public e(Class<?> cls, String str, Class... clsArr) {
        this.f3566a = cls;
        this.f3567b = str;
        this.f3568c = clsArr;
    }

    private Method a(Class<?> cls) {
        Class<?> cls2;
        String str = this.f3567b;
        if (str == null) {
            return null;
        }
        Method b5 = b(cls, str, this.f3568c);
        if (b5 == null || (cls2 = this.f3566a) == null || cls2.isAssignableFrom(b5.getReturnType())) {
            return b5;
        }
        return null;
    }

    private static Method b(Class<?> cls, String str, Class[] clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            if ((cls.getModifiers() & 1) == 0) {
                return b(cls.getSuperclass(), str, clsArr);
            }
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    public Object c(T t4, Object... objArr) {
        Method a5 = a(t4.getClass());
        if (a5 == null) {
            throw new AssertionError("Method " + this.f3567b + " not supported for object " + t4);
        }
        try {
            return a5.invoke(t4, objArr);
        } catch (IllegalAccessException e5) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + a5);
            assertionError.initCause(e5);
            throw assertionError;
        }
    }

    public Object d(T t4, Object... objArr) {
        Method a5 = a(t4.getClass());
        if (a5 == null) {
            return null;
        }
        try {
            return a5.invoke(t4, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    public Object e(T t4, Object... objArr) {
        try {
            return d(t4, objArr);
        } catch (InvocationTargetException e5) {
            Throwable targetException = e5.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public Object f(T t4, Object... objArr) {
        try {
            return c(t4, objArr);
        } catch (InvocationTargetException e5) {
            Throwable targetException = e5.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public boolean g(T t4) {
        return a(t4.getClass()) != null;
    }
}
