package com.google.android.gms.internal.p000firebaseauthapi;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
abstract class r1 {

    /* renamed from: a, reason: collision with root package name */
    final Unsafe f2080a;

    r1(Unsafe unsafe) {
        this.f2080a = unsafe;
    }

    public abstract double a(Object obj, long j4);

    public abstract float b(Object obj, long j4);

    public abstract void c(Object obj, long j4, boolean z4);

    public abstract void d(Object obj, long j4, byte b5);

    public abstract void e(Object obj, long j4, double d5);

    public abstract void f(Object obj, long j4, float f5);

    public abstract boolean g(Object obj, long j4);

    public final int h(Class cls) {
        return this.f2080a.arrayBaseOffset(cls);
    }

    public final int i(Class cls) {
        return this.f2080a.arrayIndexScale(cls);
    }

    public final int j(Object obj, long j4) {
        return this.f2080a.getInt(obj, j4);
    }

    public final long k(Object obj, long j4) {
        return this.f2080a.getLong(obj, j4);
    }

    public final long l(Field field) {
        return this.f2080a.objectFieldOffset(field);
    }

    public final Object m(Object obj, long j4) {
        return this.f2080a.getObject(obj, j4);
    }

    public final void n(Object obj, long j4, int r5) {
        this.f2080a.putInt(obj, j4, r5);
    }

    public final void o(Object obj, long j4, long j5) {
        this.f2080a.putLong(obj, j4, j5);
    }

    public final void p(Object obj, long j4, Object obj2) {
        this.f2080a.putObject(obj, j4, obj2);
    }
}
