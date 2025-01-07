package b0;

import android.content.Context;
import android.util.Log;
import w.r;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f599a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    public static boolean a(Context context, Throwable th) {
        try {
            r.i(context);
            r.i(th);
            return false;
        } catch (Exception e5) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e5);
            return false;
        }
    }
}
