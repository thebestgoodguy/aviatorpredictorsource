package e3;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f3607a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f3608b = new String[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f3609c = StandardCharsets.UTF_8;

    public static <T> List<T> a(T[] tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    private static <T> List<T> b(T[] tArr, T[] tArr2) {
        ArrayList arrayList = new ArrayList();
        for (T t4 : tArr) {
            int length = tArr2.length;
            int r6 = 0;
            while (true) {
                if (r6 < length) {
                    T t5 = tArr2[r6];
                    if (t4.equals(t5)) {
                        arrayList.add(t5);
                        break;
                    }
                    r6++;
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T[] c(Class<T> cls, T[] tArr, T[] tArr2) {
        List b5 = b(tArr, tArr2);
        return (T[]) b5.toArray((Object[]) Array.newInstance((Class<?>) cls, b5.size()));
    }
}
