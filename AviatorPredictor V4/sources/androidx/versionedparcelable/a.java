package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    protected final e.a<String, Method> f561a;

    /* renamed from: b, reason: collision with root package name */
    protected final e.a<String, Method> f562b;

    /* renamed from: c, reason: collision with root package name */
    protected final e.a<String, Class> f563c;

    public a(e.a<String, Method> aVar, e.a<String, Method> aVar2, e.a<String, Class> aVar3) {
        this.f561a = aVar;
        this.f562b = aVar2;
        this.f563c = aVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void N(o.a aVar) {
        try {
            I(c(aVar.getClass()).getName());
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(aVar.getClass().getSimpleName() + " does not have a Parcelizer", e5);
        }
    }

    private Class c(Class<? extends o.a> cls) {
        Class cls2 = this.f563c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f563c.put(cls.getName(), cls3);
        return cls3;
    }

    private Method d(String str) {
        Method method = this.f561a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
        this.f561a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Method e(Class cls) {
        Method method = this.f562b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class c5 = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c5.getDeclaredMethod("write", cls, a.class);
        this.f562b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    protected abstract void A(byte[] bArr);

    public void B(byte[] bArr, int r22) {
        w(r22);
        A(bArr);
    }

    protected abstract void C(CharSequence charSequence);

    public void D(CharSequence charSequence, int r22) {
        w(r22);
        C(charSequence);
    }

    protected abstract void E(int r12);

    public void F(int r12, int r22) {
        w(r22);
        E(r12);
    }

    protected abstract void G(Parcelable parcelable);

    public void H(Parcelable parcelable, int r22) {
        w(r22);
        G(parcelable);
    }

    protected abstract void I(String str);

    public void J(String str, int r22) {
        w(r22);
        I(str);
    }

    protected <T extends o.a> void K(T t4, a aVar) {
        try {
            e(t4.getClass()).invoke(null, t4, aVar);
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e5);
        } catch (IllegalAccessException e6) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e6);
        } catch (NoSuchMethodException e7) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e7);
        } catch (InvocationTargetException e8) {
            if (!(e8.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e8);
            }
            throw ((RuntimeException) e8.getCause());
        }
    }

    protected void L(o.a aVar) {
        if (aVar == null) {
            I(null);
            return;
        }
        N(aVar);
        a b5 = b();
        K(aVar, b5);
        b5.a();
    }

    public void M(o.a aVar, int r22) {
        w(r22);
        L(aVar);
    }

    protected abstract void a();

    protected abstract a b();

    public boolean f() {
        return false;
    }

    protected abstract boolean g();

    public boolean h(boolean z4, int r22) {
        return !m(r22) ? z4 : g();
    }

    protected abstract byte[] i();

    public byte[] j(byte[] bArr, int r22) {
        return !m(r22) ? bArr : i();
    }

    protected abstract CharSequence k();

    public CharSequence l(CharSequence charSequence, int r22) {
        return !m(r22) ? charSequence : k();
    }

    protected abstract boolean m(int r12);

    protected <T extends o.a> T n(String str, a aVar) {
        try {
            return (T) d(str).invoke(null, aVar);
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e5);
        } catch (IllegalAccessException e6) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e6);
        } catch (NoSuchMethodException e7) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e7);
        } catch (InvocationTargetException e8) {
            if (e8.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e8.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e8);
        }
    }

    protected abstract int o();

    public int p(int r12, int r22) {
        return !m(r22) ? r12 : o();
    }

    protected abstract <T extends Parcelable> T q();

    public <T extends Parcelable> T r(T t4, int r22) {
        return !m(r22) ? t4 : (T) q();
    }

    protected abstract String s();

    public String t(String str, int r22) {
        return !m(r22) ? str : s();
    }

    protected <T extends o.a> T u() {
        String s4 = s();
        if (s4 == null) {
            return null;
        }
        return (T) n(s4, b());
    }

    public <T extends o.a> T v(T t4, int r22) {
        return !m(r22) ? t4 : (T) u();
    }

    protected abstract void w(int r12);

    public void x(boolean z4, boolean z5) {
    }

    protected abstract void y(boolean z4);

    public void z(boolean z4, int r22) {
        w(r22);
        y(z4);
    }
}
