package h;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f3892a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    private static final WeakHashMap<Object, SparseArray<Object>> f3893b = new WeakHashMap<>(0);

    /* renamed from: c, reason: collision with root package name */
    private static final Object f3894c = new Object();

    public static Drawable a(Resources resources, int r32, Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 21 ? resources.getDrawable(r32, theme) : resources.getDrawable(r32);
    }
}
