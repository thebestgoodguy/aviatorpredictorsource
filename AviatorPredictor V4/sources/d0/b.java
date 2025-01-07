package d0;

import android.os.IBinder;
import d0.a;
import java.lang.reflect.Field;
import w.r;

/* loaded from: classes.dex */
public final class b<T> extends a.AbstractBinderC0027a {

    /* renamed from: a, reason: collision with root package name */
    private final T f3213a;

    private b(T t4) {
        this.f3213a = t4;
    }

    public static <T> T h(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f3213a;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int r4 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                r4++;
                field = field2;
            }
        }
        if (r4 != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        r.i(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(asBinder);
        } catch (IllegalAccessException e5) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e5);
        } catch (NullPointerException e6) {
            throw new IllegalArgumentException("Binder object is null.", e6);
        }
    }

    public static <T> a w(T t4) {
        return new b(t4);
    }
}
