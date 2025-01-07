package w;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f8073a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f8074b;

    /* renamed from: c, reason: collision with root package name */
    private static String f8075c;

    /* renamed from: d, reason: collision with root package name */
    private static int f8076d;

    public static int a(Context context) {
        b(context);
        return f8076d;
    }

    private static void b(Context context) {
        Bundle bundle;
        synchronized (f8073a) {
            if (f8074b) {
                return;
            }
            f8074b = true;
            try {
                bundle = c0.c.a(context).a(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e5) {
                Log.wtf("MetadataValueReader", "This should never happen.", e5);
            }
            if (bundle == null) {
                return;
            }
            f8075c = bundle.getString("com.google.app.id");
            f8076d = bundle.getInt("com.google.android.gms.version");
        }
    }
}
