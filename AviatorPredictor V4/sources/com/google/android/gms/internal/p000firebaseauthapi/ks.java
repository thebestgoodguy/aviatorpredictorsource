package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.hs;
import com.google.android.gms.internal.p000firebaseauthapi.ks;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class ks<MessageType extends ks<MessageType, BuilderType>, BuilderType extends hs<MessageType, BuilderType>> extends rq<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    protected j1 zzc = j1.c();
    protected int zzd = -1;

    static Object e(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e5);
        } catch (InvocationTargetException e6) {
            Throwable cause = e6.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static Object f(e0 e0Var, String str, Object[] objArr) {
        return new o0(e0Var, str, objArr);
    }

    protected static void n(Class cls, ks ksVar) {
        zzb.put(cls, ksVar);
    }

    private static ks p(ks ksVar) {
        if (ksVar == null || ksVar.o()) {
            return ksVar;
        }
        h a5 = new h1(ksVar).a();
        a5.h(ksVar);
        throw a5;
    }

    private static ks q(ks ksVar, byte[] bArr, int r8, int r9, yr yrVar) {
        ks ksVar2 = (ks) ksVar.r(4, null, null);
        try {
            q0 b5 = m0.a().b(ksVar2.getClass());
            b5.g(ksVar2, bArr, 0, r9, new uq(yrVar));
            b5.b(ksVar2);
            if (ksVar2.zza == 0) {
                return ksVar2;
            }
            throw new RuntimeException();
        } catch (h e5) {
            e5.h(ksVar2);
            throw e5;
        } catch (h1 e6) {
            h a5 = e6.a();
            a5.h(ksVar2);
            throw a5;
        } catch (IOException e7) {
            if (e7.getCause() instanceof h) {
                throw ((h) e7.getCause());
            }
            h hVar = new h(e7);
            hVar.h(ksVar2);
            throw hVar;
        } catch (IndexOutOfBoundsException unused) {
            h i4 = h.i();
            i4.h(ksVar2);
            throw i4;
        }
    }

    static ks u(Class cls) {
        Map map = zzb;
        ks ksVar = (ks) map.get(cls);
        if (ksVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                ksVar = (ks) map.get(cls);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException("Class initialization cannot fail.", e5);
            }
        }
        if (ksVar == null) {
            ksVar = (ks) ((ks) s1.j(cls)).r(6, null, null);
            if (ksVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, ksVar);
        }
        return ksVar;
    }

    protected static ks v(ks ksVar, hr hrVar, yr yrVar) {
        lr u4 = hrVar.u();
        ks ksVar2 = (ks) ksVar.r(4, null, null);
        try {
            q0 b5 = m0.a().b(ksVar2.getClass());
            b5.j(ksVar2, mr.U(u4), yrVar);
            b5.b(ksVar2);
            try {
                u4.g(0);
                p(ksVar2);
                return ksVar2;
            } catch (h e5) {
                e5.h(ksVar2);
                throw e5;
            }
        } catch (h e6) {
            e6.h(ksVar2);
            throw e6;
        } catch (h1 e7) {
            h a5 = e7.a();
            a5.h(ksVar2);
            throw a5;
        } catch (IOException e8) {
            if (e8.getCause() instanceof h) {
                throw ((h) e8.getCause());
            }
            h hVar = new h(e8);
            hVar.h(ksVar2);
            throw hVar;
        } catch (RuntimeException e9) {
            if (e9.getCause() instanceof h) {
                throw ((h) e9.getCause());
            }
            throw e9;
        }
    }

    protected static ks w(ks ksVar, byte[] bArr, yr yrVar) {
        ks q4 = q(ksVar, bArr, 0, bArr.length, yrVar);
        p(q4);
        return q4;
    }

    protected static e x() {
        return n0.p();
    }

    protected static e y(e eVar) {
        int size = eVar.size();
        return eVar.e(size == 0 ? 10 : size + size);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.f0
    public final /* synthetic */ e0 a() {
        return (ks) r(6, null, null);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.rq
    final int b() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.rq
    final void c(int r12) {
        this.zzd = r12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return m0.a().b(getClass()).h(this, (ks) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.e0
    public final void h(tr trVar) {
        m0.a().b(getClass()).c(this, ur.l(trVar));
    }

    public final int hashCode() {
        int r02 = this.zza;
        if (r02 != 0) {
            return r02;
        }
        int a5 = m0.a().b(getClass()).a(this);
        this.zza = a5;
        return a5;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.e0
    public final /* synthetic */ d0 j() {
        hs hsVar = (hs) r(5, null, null);
        hsVar.e(this);
        return hsVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.e0
    public final int k() {
        int r02 = this.zzd;
        if (r02 != -1) {
            return r02;
        }
        int e5 = m0.a().b(getClass()).e(this);
        this.zzd = e5;
        return e5;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.e0
    public final /* synthetic */ d0 l() {
        return (hs) r(5, null, null);
    }

    public final boolean o() {
        byte byteValue = ((Byte) r(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean i4 = m0.a().b(getClass()).i(this);
        r(2, true != i4 ? null : this, null);
        return i4;
    }

    protected abstract Object r(int r12, Object obj, Object obj2);

    protected final hs s() {
        return (hs) r(5, null, null);
    }

    public final hs t() {
        hs hsVar = (hs) r(5, null, null);
        hsVar.e(this);
        return hsVar;
    }

    public final String toString() {
        return g0.a(this, super.toString());
    }
}
