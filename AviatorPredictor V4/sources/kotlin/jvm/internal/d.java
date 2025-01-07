package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final Object[] f6390a = new Object[0];

    public static final Object[] a(Collection<?> collection) {
        i.d(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int r12 = 0;
                while (true) {
                    int r22 = r12 + 1;
                    objArr[r12] = it.next();
                    if (r22 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int r13 = ((r22 * 3) + 1) >>> 1;
                        if (r13 <= r22) {
                            if (r22 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                            r13 = 2147483645;
                        }
                        objArr = Arrays.copyOf(objArr, r13);
                        i.c(objArr, "copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr, r22);
                        i.c(copyOf, "copyOf(result, size)");
                        return copyOf;
                    }
                    r12 = r22;
                }
            }
        }
        return f6390a;
    }

    public static final Object[] b(Collection<?> collection, Object[] objArr) {
        Object[] objArr2;
        i.d(collection, "collection");
        Objects.requireNonNull(objArr);
        int size = collection.size();
        int r22 = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArr2 = objArr;
        } else {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            Objects.requireNonNull(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = (Object[]) newInstance;
        }
        while (true) {
            int r32 = r22 + 1;
            objArr2[r22] = it.next();
            if (r32 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int r23 = ((r32 * 3) + 1) >>> 1;
                if (r23 <= r32) {
                    if (r32 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                    r23 = 2147483645;
                }
                objArr2 = Arrays.copyOf(objArr2, r23);
                i.c(objArr2, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[r32] = null;
                    return objArr;
                }
                Object[] copyOf = Arrays.copyOf(objArr2, r32);
                i.c(copyOf, "copyOf(result, size)");
                return copyOf;
            }
            r22 = r32;
        }
    }
}
