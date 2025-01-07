package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
final class ImmLeaksCleaner implements e {

    /* renamed from: b, reason: collision with root package name */
    private static int f183b;

    /* renamed from: c, reason: collision with root package name */
    private static Field f184c;

    /* renamed from: d, reason: collision with root package name */
    private static Field f185d;

    /* renamed from: e, reason: collision with root package name */
    private static Field f186e;

    /* renamed from: a, reason: collision with root package name */
    private Activity f187a;

    ImmLeaksCleaner(Activity activity) {
        this.f187a = activity;
    }

    private static void h() {
        try {
            f183b = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f185d = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f186e = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f184c = declaredField3;
            declaredField3.setAccessible(true);
            f183b = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.e
    public void d(g gVar, d.a aVar) {
        if (aVar != d.a.ON_DESTROY) {
            return;
        }
        if (f183b == 0) {
            h();
        }
        if (f183b == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f187a.getSystemService("input_method");
            try {
                Object obj = f184c.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f185d.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f186e.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (ClassCastException unused2) {
                    } catch (IllegalAccessException unused3) {
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
